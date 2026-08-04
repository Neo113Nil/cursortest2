package I5;

import A5.h;
import A5.i;
import Y4.D;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f3700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
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
                HashMap mapM = D.m(exc);
                this.f3700b.b("firebase_firestore", exc.getMessage(), mapM);
                cVar.b();
                break;
            default:
                G5.b bVar = (G5.b) this.f3701c;
                K5.c cVar2 = (K5.c) bVar.f3047b;
                if (!cVar2.f4101k.booleanValue()) {
                    HashMap mapA = bVar.a(null, exc);
                    mapA.put("taskState", 4);
                    this.f3700b.c(mapA);
                    cVar2.b();
                    break;
                }
                break;
        }
    }
}
