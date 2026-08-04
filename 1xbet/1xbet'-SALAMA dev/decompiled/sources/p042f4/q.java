package p042f4;

import Y3.j;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.internal.RecaptchaActivity;
import p014b4.b;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Uri f12967b;

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f12966a) {
            case 0:
                A a2 = GenericIdpActivity.f11899c;
                Uri.Builder builderBuildUpon = this.f12967b.buildUpon();
                if (task.isSuccessful()) {
                    b bVar = (b) task.getResult();
                    j jVar = bVar.f10130b;
                    if (jVar != null) {
                        Log.w("GenericIdpActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(jVar)));
                    }
                    builderBuildUpon.fragment("fac=" + bVar.f10129a);
                } else {
                    L.n("Unexpected error getting App Check token: ", task.getException().getMessage(), "GenericIdpActivity");
                }
                return builderBuildUpon.build();
            default:
                A a4 = RecaptchaActivity.f11902c;
                Uri.Builder builderBuildUpon2 = this.f12967b.buildUpon();
                if (task.isSuccessful()) {
                    b bVar2 = (b) task.getResult();
                    j jVar2 = bVar2.f10130b;
                    if (jVar2 != null) {
                        Log.w("RecaptchaActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(jVar2)));
                    }
                    builderBuildUpon2.fragment("fac=" + bVar2.f10129a);
                } else {
                    L.n("Unexpected error getting App Check token: ", task.getException().getMessage(), "RecaptchaActivity");
                }
                return builderBuildUpon2.build();
        }
    }
}
