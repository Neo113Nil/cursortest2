package o1;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import n1.Y;

/* loaded from: classes.dex */
public final class n implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f11574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11575c;

    public /* synthetic */ n(Intent intent, Object obj, int i2) {
        this.f11573a = i2;
        this.f11574b = intent;
        this.f11575c = obj;
    }

    public final void a() {
        switch (this.f11573a) {
            case 0:
                Intent intent = this.f11574b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f11575c).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f11574b;
                if (intent2 != null) {
                    ((Y) this.f11575c).startActivityForResult(intent2, 2);
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
            } catch (ActivityNotFoundException e3) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e3);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
