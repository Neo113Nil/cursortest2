package E5;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import n3.AbstractC1464a;

/* renamed from: E5.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0190h implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2373a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f2374b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f2375c;

    public /* synthetic */ C0190h(r rVar, FirebaseUser firebaseUser) {
        this.f2374b = rVar;
        this.f2375c = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f2373a) {
            case 0:
                boolean isSuccessful = task.isSuccessful();
                r rVar = this.f2374b;
                if (!isSuccessful) {
                    rVar.a(Y4.D.L(task.getException()));
                    break;
                } else {
                    FirebaseUser firebaseUser = this.f2375c;
                    firebaseUser.m().addOnCompleteListener(new C0190h(rVar, firebaseUser));
                    break;
                }
            default:
                boolean isSuccessful2 = task.isSuccessful();
                r rVar2 = this.f2374b;
                if (!isSuccessful2) {
                    rVar2.a(Y4.D.L(task.getException()));
                    break;
                } else {
                    rVar2.success(AbstractC1464a.L(this.f2375c));
                    break;
                }
        }
    }

    public /* synthetic */ C0190h(FirebaseUser firebaseUser, r rVar) {
        this.f2375c = firebaseUser;
        this.f2374b = rVar;
    }
}
