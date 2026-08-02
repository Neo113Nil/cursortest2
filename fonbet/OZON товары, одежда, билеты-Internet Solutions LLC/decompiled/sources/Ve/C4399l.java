package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4399l implements Zi {

    /* renamed from: a, reason: collision with root package name */
    public final String f31478a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31479b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31480c;

    /* renamed from: d, reason: collision with root package name */
    public final String f31481d;

    /* renamed from: e, reason: collision with root package name */
    public final String f31482e;

    public C4399l(String header, String text, String deeplink, String iconUrl, String type) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f31478a = header;
        this.f31479b = text;
        this.f31480c = deeplink;
        this.f31481d = iconUrl;
        this.f31482e = type;
    }

    @Override // Ve.Zi
    public final String a() {
        return this.f31480c;
    }

    @Override // Ve.Zi
    public final String b() {
        return this.f31482e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4399l)) {
            return false;
        }
        C4399l c4399l = (C4399l) obj;
        return Intrinsics.d(this.f31478a, c4399l.f31478a) && Intrinsics.d(this.f31479b, c4399l.f31479b) && Intrinsics.d(this.f31480c, c4399l.f31480c) && Intrinsics.d(this.f31481d, c4399l.f31481d) && Intrinsics.d(this.f31482e, c4399l.f31482e);
    }

    public final int hashCode() {
        return this.f31482e.hashCode() + G.g.a(G.g.a(G.g.a(this.f31478a.hashCode() * 31, 31, this.f31479b), 31, this.f31480c), 31, this.f31481d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HelperBannerItem(header=");
        sb2.append(this.f31478a);
        sb2.append(", text=");
        sb2.append(this.f31479b);
        sb2.append(", deeplink=");
        sb2.append(this.f31480c);
        sb2.append(", iconUrl=");
        sb2.append(this.f31481d);
        sb2.append(", type=");
        return C.o0.c(sb2, this.f31482e, ")");
    }
}
