package com.google.android.gms.common.api;

import W5.AbstractC0486a1;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C0831h;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.base.zau;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11073b = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f11074a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f11074a = 0;
            setResult(i8, intent);
            if (booleanExtra) {
                C0831h g3 = C0831h.g(this);
                if (i8 == -1) {
                    zau zauVar = g3.f11181E;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                } else if (i8 == 0) {
                    g3.h(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i7 == 2) {
            this.f11074a = 0;
            setResult(i8, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f11074a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f11074a = bundle.getInt("resolution");
        }
        if (this.f11074a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent == null) {
                D.i(num);
                AlertDialog e7 = com.google.android.gms.common.c.f11215d.e(num.intValue(), this, 2, this);
                if (e7 != null) {
                    com.google.android.gms.common.c.h(this, e7, GooglePlayServicesUtil.GMS_ERROR_DIALOG, this);
                }
                this.f11074a = 1;
                return;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f11074a = 1;
            } catch (ActivityNotFoundException e8) {
                if (extras.getBoolean("notify_manager", true)) {
                    C0831h.g(this).h(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String h6 = AbstractC0486a1.h("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        h6 = h6.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", h6, e8);
                }
                this.f11074a = 1;
                finish();
            } catch (IntentSender.SendIntentException e9) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e9);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f11074a);
        super.onSaveInstanceState(bundle);
    }
}
