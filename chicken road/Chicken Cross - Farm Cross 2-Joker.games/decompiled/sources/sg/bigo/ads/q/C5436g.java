package sg.bigo.ads.q;

import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.K0.E;
import sg.bigo.ads.api.NativeAd;

/* renamed from: sg.bigo.ads.q.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5436g extends E {
    public final /* synthetic */ List i;
    public final /* synthetic */ sg.bigo.ads.r.c j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5436g(long j, ArrayList arrayList, sg.bigo.ads.r.c cVar) {
        super(j, 1000L);
        this.i = arrayList;
        this.j = cVar;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        NativeAd nativeAd = (NativeAd) this.i.get(0);
        if (nativeAd instanceof sg.bigo.ads.C.l) {
            sg.bigo.ads.D.h hVar = (sg.bigo.ads.D.h) nativeAd;
            if (hVar.r) {
                return;
            }
            hVar.a((sg.bigo.ads.U.j) null, this.j.c(), 22);
        }
    }
}
