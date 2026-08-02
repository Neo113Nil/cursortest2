package g2;

import A1.X;
import E3.AbstractC0167z;
import android.net.Uri;
import f2.InterfaceC1075g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: f, reason: collision with root package name */
    public final j f13156f;

    /* renamed from: x, reason: collision with root package name */
    public final R4.c f13157x;

    public l(long j, X x4, AbstractC0167z abstractC0167z, r rVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(x4, abstractC0167z, rVar, arrayList, arrayList2, arrayList3);
        Uri.parse(((b) abstractC0167z.get(0)).f13105a);
        long j3 = rVar.f13174e;
        j jVar = j3 <= 0 ? null : new j(null, rVar.f13173d, j3);
        this.f13156f = jVar;
        this.f13157x = jVar == null ? new R4.c(new j(null, 0L, -1L), 16) : null;
    }

    @Override // g2.m
    public final String a() {
        return null;
    }

    @Override // g2.m
    public final InterfaceC1075g c() {
        return this.f13157x;
    }

    @Override // g2.m
    public final j d() {
        return this.f13156f;
    }
}
