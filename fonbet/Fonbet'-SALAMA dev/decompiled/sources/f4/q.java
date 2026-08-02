package f4;

import android.net.Uri;
import android.util.Log;
import b4.C0782b;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.internal.RecaptchaActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12960a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Uri f12961b;

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f12960a) {
            case 0:
                C1084A c1084a = GenericIdpActivity.f11899c;
                Uri.Builder buildUpon = this.f12961b.buildUpon();
                if (task.isSuccessful()) {
                    C0782b c0782b = (C0782b) task.getResult();
                    Y3.j jVar = c0782b.f10130b;
                    if (jVar != null) {
                        Log.w("GenericIdpActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(jVar)));
                    }
                    buildUpon.fragment("fac=" + c0782b.f10129a);
                } else {
                    w1.L.n("Unexpected error getting App Check token: ", task.getException().getMessage(), "GenericIdpActivity");
                }
                return buildUpon.build();
            default:
                C1084A c1084a2 = RecaptchaActivity.f11902c;
                Uri.Builder buildUpon2 = this.f12961b.buildUpon();
                if (task.isSuccessful()) {
                    C0782b c0782b2 = (C0782b) task.getResult();
                    Y3.j jVar2 = c0782b2.f10130b;
                    if (jVar2 != null) {
                        Log.w("RecaptchaActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(jVar2)));
                    }
                    buildUpon2.fragment("fac=" + c0782b2.f10129a);
                } else {
                    w1.L.n("Unexpected error getting App Check token: ", task.getException().getMessage(), "RecaptchaActivity");
                }
                return buildUpon2.build();
        }
    }
}
