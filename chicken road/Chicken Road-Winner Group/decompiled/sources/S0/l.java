package S0;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public final class l implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f1341b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1342c;

    public /* synthetic */ l(Intent intent, Object obj, int i3) {
        this.f1340a = i3;
        this.f1341b = intent;
        this.f1342c = obj;
    }

    public final void a() {
        switch (this.f1340a) {
            case 0:
                Intent intent = this.f1341b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f1342c).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f1341b;
                if (intent2 != null) {
                    ((R0.x) this.f1342c).startActivityForResult(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
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
