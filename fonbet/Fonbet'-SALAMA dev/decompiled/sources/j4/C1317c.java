package j4;

import com.google.android.gms.tasks.OnFailureListener;
import d6.C0977k;
import l4.InterfaceC1390a;
import n4.RunnableC1470d;

/* renamed from: j4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1317c implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0977k f14627b;

    public /* synthetic */ C1317c(C0977k c0977k, int i7) {
        this.f14626a = i7;
        this.f14627b = c0977k;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.f14626a) {
            case 0:
                String message = exc.getMessage();
                C0977k c0977k = this.f14627b;
                ((L4.b) c0977k.f12441b).execute(new RunnableC1470d((InterfaceC1390a) c0977k.f12442c, message, 1));
                break;
            default:
                boolean z4 = exc instanceof Y3.c;
                C0977k c0977k2 = this.f14627b;
                if (!z4 && !(exc instanceof P4.a)) {
                    ((L4.b) c0977k2.f12441b).execute(new RunnableC1470d((InterfaceC1390a) c0977k2.f12442c, exc.getMessage(), 1));
                    break;
                } else {
                    c0977k2.q(null);
                    break;
                }
        }
    }
}
