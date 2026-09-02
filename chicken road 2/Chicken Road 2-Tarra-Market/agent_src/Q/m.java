package Q;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public final class m implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f452c;

    public /* synthetic */ m(Intent intent, Object obj, int i2) {
        this.f450a = i2;
        this.f451b = intent;
        this.f452c = obj;
    }

    public final void a() {
        switch (this.f450a) {
            case 0:
                Intent intent = this.f451b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f452c).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f451b;
                if (intent2 != null) {
                    ((P.C) this.f452c).startActivityForResult(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e2) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e2);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
