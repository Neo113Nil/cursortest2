package E5;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;

/* JADX INFO: renamed from: E5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0190h implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2373a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f2374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f2375c;

    public /* synthetic */ C0190h(r rVar, FirebaseUser firebaseUser) {
        this.f2374b = rVar;
        this.f2375c = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f2373a) {
            case 0:
                boolean zIsSuccessful = task.isSuccessful();
                r rVar = this.f2374b;
                if (!zIsSuccessful) {
                    rVar.a(Y4.D.L(task.getException()));
                } else {
                    FirebaseUser firebaseUser = this.f2375c;
                    firebaseUser.m().addOnCompleteListener(new C0190h(rVar, firebaseUser));
                }
                break;
            default:
                boolean zIsSuccessful2 = task.isSuccessful();
                r rVar2 = this.f2374b;
                if (!zIsSuccessful2) {
                    rVar2.a(Y4.D.L(task.getException()));
                } else {
                    rVar2.success(p097n3.a.L(this.f2375c));
                }
                break;
        }
    }

    public /* synthetic */ C0190h(FirebaseUser firebaseUser, r rVar) {
        this.f2375c = firebaseUser;
        this.f2374b = rVar;
    }
}
