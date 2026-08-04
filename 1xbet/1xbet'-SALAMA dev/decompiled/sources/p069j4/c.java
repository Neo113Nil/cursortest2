package p069j4;

import L4.b;
import com.google.android.gms.tasks.OnFailureListener;
import p028d6.k;
import p083l4.a;
import p098n4.RunnableC0931d;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f14633b;

    public /* synthetic */ c(k kVar, int i7) {
        this.f14632a = i7;
        this.f14633b = kVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.f14632a) {
            case 0:
                String message = exc.getMessage();
                k kVar = this.f14633b;
                ((b) kVar.f12447b).execute(new RunnableC0931d((a) kVar.f12448c, message, 1));
                break;
            default:
                boolean z4 = exc instanceof Y3.c;
                k kVar2 = this.f14633b;
                if (z4 || (exc instanceof P4.a)) {
                    kVar2.q(null);
                } else {
                    ((b) kVar2.f12447b).execute(new RunnableC0931d((a) kVar2.f12448c, exc.getMessage(), 1));
                }
                break;
        }
    }
}
