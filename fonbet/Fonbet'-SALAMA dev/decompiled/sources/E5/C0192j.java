package E5;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import n3.AbstractC1464a;

/* renamed from: E5.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0192j implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2379a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f2380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f2381c;

    public /* synthetic */ C0192j(r rVar, FirebaseUser firebaseUser) {
        this.f2381c = rVar;
        this.f2380b = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f2379a) {
            case 0:
                boolean isSuccessful = task.isSuccessful();
                r rVar = this.f2381c;
                if (!isSuccessful) {
                    rVar.a(Y4.D.L(task.getException()));
                    break;
                } else {
                    rVar.success(AbstractC1464a.L(this.f2380b));
                    break;
                }
            default:
                boolean isSuccessful2 = task.isSuccessful();
                r rVar2 = this.f2381c;
                if (!isSuccessful2) {
                    rVar2.a(Y4.D.L(task.getException()));
                    break;
                } else {
                    FirebaseUser firebaseUser = this.f2380b;
                    firebaseUser.m().addOnCompleteListener(new C0192j(rVar2, firebaseUser));
                    break;
                }
        }
    }

    public /* synthetic */ C0192j(FirebaseUser firebaseUser, r rVar) {
        this.f2380b = firebaseUser;
        this.f2381c = rVar;
    }
}
