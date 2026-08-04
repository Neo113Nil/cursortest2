package E5;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;

/* JADX INFO: renamed from: E5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0189g implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2370a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0199q f2371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f2372c;

    public /* synthetic */ C0189g(C0199q c0199q, FirebaseUser firebaseUser) {
        this.f2371b = c0199q;
        this.f2372c = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f2370a) {
            case 0:
                boolean zIsSuccessful = task.isSuccessful();
                C0199q c0199q = this.f2371b;
                if (!zIsSuccessful) {
                    c0199q.a(Y4.D.L(task.getException()));
                } else {
                    FirebaseUser firebaseUser = this.f2372c;
                    firebaseUser.m().addOnCompleteListener(new C0189g(c0199q, firebaseUser));
                }
                break;
            default:
                boolean zIsSuccessful2 = task.isSuccessful();
                C0199q c0199q2 = this.f2371b;
                if (!zIsSuccessful2) {
                    c0199q2.a(Y4.D.L(task.getException()));
                } else {
                    c0199q2.success(p097n3.a.L(this.f2372c));
                }
                break;
        }
    }

    public /* synthetic */ C0189g(FirebaseUser firebaseUser, C0199q c0199q) {
        this.f2372c = firebaseUser;
        this.f2371b = c0199q;
    }
}
