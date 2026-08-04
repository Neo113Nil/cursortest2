package E5;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;

/* JADX INFO: renamed from: E5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0192j implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2379a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f2380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f2381c;

    public /* synthetic */ C0192j(r rVar, FirebaseUser firebaseUser) {
        this.f2381c = rVar;
        this.f2380b = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f2379a) {
            case 0:
                boolean zIsSuccessful = task.isSuccessful();
                r rVar = this.f2381c;
                if (!zIsSuccessful) {
                    rVar.a(Y4.D.L(task.getException()));
                } else {
                    rVar.success(p097n3.a.L(this.f2380b));
                }
                break;
            default:
                boolean zIsSuccessful2 = task.isSuccessful();
                r rVar2 = this.f2381c;
                if (!zIsSuccessful2) {
                    rVar2.a(Y4.D.L(task.getException()));
                } else {
                    FirebaseUser firebaseUser = this.f2380b;
                    firebaseUser.m().addOnCompleteListener(new C0192j(rVar2, firebaseUser));
                }
                break;
        }
    }

    public /* synthetic */ C0192j(FirebaseUser firebaseUser, r rVar) {
        this.f2380b = firebaseUser;
        this.f2381c = rVar;
    }
}
