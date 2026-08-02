package l4;

import w4.C1777c;

/* loaded from: classes2.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f15013b;

    public /* synthetic */ v(y yVar, int i7) {
        this.f15012a = i7;
        this.f15013b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15012a) {
            case 0:
                y yVar = this.f15013b;
                if (!yVar.f15021b && !yVar.f15022c) {
                    android.support.v4.media.session.t tVar = yVar.j;
                    if (tVar.r0()) {
                        tVar.W(null, "timed out on connect", new Object[0]);
                    }
                    ((C1777c) yVar.f15020a.f11335b).a();
                    break;
                }
                break;
            default:
                y yVar2 = this.f15013b;
                com.google.android.gms.common.internal.w wVar = yVar2.f15020a;
                if (wVar != null) {
                    wVar.K("0");
                    yVar2.e();
                    break;
                }
                break;
        }
    }
}
