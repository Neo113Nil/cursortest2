package I5;

import A5.h;
import A5.i;
import Y4.D;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f3700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f3701c;

    public /* synthetic */ b(i iVar, h hVar, int i7) {
        this.f3699a = i7;
        this.f3701c = iVar;
        this.f3700b = hVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.f3699a) {
            case 0:
                c cVar = (c) this.f3701c;
                cVar.getClass();
                HashMap m7 = D.m(exc);
                this.f3700b.b("firebase_firestore", exc.getMessage(), m7);
                cVar.b();
                break;
            default:
                G5.b bVar = (G5.b) this.f3701c;
                K5.c cVar2 = (K5.c) bVar.f3047b;
                if (!cVar2.f4101k.booleanValue()) {
                    HashMap a2 = bVar.a(null, exc);
                    a2.put("taskState", 4);
                    this.f3700b.c(a2);
                    cVar2.b();
                    break;
                }
                break;
        }
    }
}
