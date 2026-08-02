package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Rc implements Zi {

    /* renamed from: a, reason: collision with root package name */
    public final String f29843a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29844b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29845c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29846d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29847e;

    public Rc(String header, String text, String deeplink, String iconUrl, String type) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f29843a = header;
        this.f29844b = text;
        this.f29845c = deeplink;
        this.f29846d = iconUrl;
        this.f29847e = type;
    }

    @Override // Ve.Zi
    public final String a() {
        return this.f29845c;
    }

    @Override // Ve.Zi
    public final String b() {
        return this.f29847e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rc)) {
            return false;
        }
        Rc rc2 = (Rc) obj;
        return Intrinsics.d(this.f29843a, rc2.f29843a) && Intrinsics.d(this.f29844b, rc2.f29844b) && Intrinsics.d(this.f29845c, rc2.f29845c) && Intrinsics.d(this.f29846d, rc2.f29846d) && Intrinsics.d(this.f29847e, rc2.f29847e);
    }

    public final int hashCode() {
        return this.f29847e.hashCode() + G.g.a(G.g.a(G.g.a(this.f29843a.hashCode() * 31, 31, this.f29844b), 31, this.f29845c), 31, this.f29846d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SingleHelperBannerItem(header=");
        sb2.append(this.f29843a);
        sb2.append(", text=");
        sb2.append(this.f29844b);
        sb2.append(", deeplink=");
        sb2.append(this.f29845c);
        sb2.append(", iconUrl=");
        sb2.append(this.f29846d);
        sb2.append(", type=");
        return C.o0.c(sb2, this.f29847e, ")");
    }
}
