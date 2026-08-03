package com.google.android.gms.common.api;

@com.google.android.gms.common.annotation.KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends android.app.Activity implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2590b = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f2591a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, android.content.Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f2591a = 0;
            setResult(i3, intent);
            if (booleanExtra) {
                o0.c e2 = o0.c.e(this);
                if (i3 == -1) {
                    A0.a aVar = e2.f8145m;
                    aVar.sendMessage(aVar.obtainMessage(3));
                } else if (i3 == 0) {
                    e2.f(new m0.b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i2 == 2) {
            this.f2591a = 0;
            setResult(i3, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f2591a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2591a = bundle.getInt("resolution");
        }
        if (this.f2591a != 1) {
            android.os.Bundle extras = getIntent().getExtras();
            if (extras == null) {
                android.util.Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) extras.get("pending_intent");
            java.lang.Integer num = (java.lang.Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                android.util.Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent == null) {
                p0.AbstractC0966r.c(num);
                m0.f.f8053d.c(this, num.intValue(), this);
                this.f2591a = 1;
                return;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f2591a = 1;
            } catch (android.content.ActivityNotFoundException e2) {
                if (extras.getBoolean("notify_manager", true)) {
                    o0.c.e(this).f(new m0.b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    java.lang.String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                    if (android.os.Build.FINGERPRINT.contains("generic")) {
                        str = str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    android.util.Log.e("GoogleApiActivity", str, e2);
                }
                this.f2591a = 1;
                finish();
            } catch (android.content.IntentSender.SendIntentException e3) {
                android.util.Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e3);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putInt("resolution", this.f2591a);
        super.onSaveInstanceState(bundle);
    }
}
