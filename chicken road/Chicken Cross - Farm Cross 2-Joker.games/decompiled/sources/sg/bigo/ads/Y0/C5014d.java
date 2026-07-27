package sg.bigo.ads.Y0;

import java.util.HashMap;

/* renamed from: sg.bigo.ads.Y0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5014d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f12631a;

    public C5014d(g gVar) {
        this.f12631a = gVar;
    }

    @Override // sg.bigo.ads.Y0.f
    public final void a(String str, long j, boolean z, int i) {
        sg.bigo.ads.E1.k kVar;
        this.f12631a.d = z;
        HashMap hashMap = new HashMap();
        hashMap.put("land_way", String.valueOf(i));
        sg.bigo.ads.s1.b.a(this.f12631a.f12633a, "preload_cost", j, z ? 1 : 0, hashMap);
        g gVar = this.f12631a;
        int i2 = gVar.c;
        if (z || (kVar = gVar.e) == null) {
            return;
        }
        kVar.destroy();
        gVar.e = null;
    }

    @Override // sg.bigo.ads.Y0.f
    public final void a(String str) {
        int i = this.f12631a.c;
    }
}
