package E5;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import n3.AbstractC1464a;

/* renamed from: E5.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0191i implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2376a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0199q f2377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f2378c;

    public /* synthetic */ C0191i(C0199q c0199q, FirebaseUser firebaseUser) {
        this.f2377b = c0199q;
        this.f2378c = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f2376a) {
            case 0:
                boolean isSuccessful = task.isSuccessful();
                C0199q c0199q = this.f2377b;
                if (!isSuccessful) {
                    c0199q.a(Y4.D.L(task.getException()));
                    break;
                } else {
                    FirebaseUser firebaseUser = this.f2378c;
                    firebaseUser.m().addOnCompleteListener(new C0191i(c0199q, firebaseUser));
                    break;
                }
            default:
                boolean isSuccessful2 = task.isSuccessful();
                C0199q c0199q2 = this.f2377b;
                if (!isSuccessful2) {
                    c0199q2.a(Y4.D.L(task.getException()));
                    break;
                } else {
                    c0199q2.success(AbstractC1464a.L(this.f2378c));
                    break;
                }
        }
    }

    public /* synthetic */ C0191i(FirebaseUser firebaseUser, C0199q c0199q) {
        this.f2378c = firebaseUser;
        this.f2377b = c0199q;
    }
}
