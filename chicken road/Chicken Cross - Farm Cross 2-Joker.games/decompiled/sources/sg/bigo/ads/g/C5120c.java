package sg.bigo.ads.g;

import java.util.HashSet;
import java.util.Set;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.NativeAd;

/* renamed from: sg.bigo.ads.g.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5120c implements sg.bigo.ads.Q.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f12794a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ sg.bigo.ads.Q.c c;
    public final /* synthetic */ C5122e d;

    public C5120c(C5122e c5122e, HashSet hashSet, HashSet hashSet2, C5119b c5119b) {
        this.d = c5122e;
        this.f12794a = hashSet;
        this.b = hashSet2;
        this.c = c5119b;
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad, int i, int i2, String str) {
        this.f12794a.remove((NativeAd) ad);
        this.c.a(this.d, i, i2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sg.bigo.ads.Q.c
    public final void a(sg.bigo.ads.Q.b bVar, boolean z) {
        NativeAd nativeAd = (NativeAd) bVar;
        this.f12794a.remove(nativeAd);
        this.b.add(nativeAd);
        this.c.a(this.d, z);
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad) {
        NativeAd nativeAd = (NativeAd) ad;
        this.f12794a.remove(nativeAd);
        this.b.add(nativeAd);
        this.c.a(this.d);
    }
}
