package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.wb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4728wb implements Zi {

    /* renamed from: a, reason: collision with root package name */
    public final String f32355a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32356b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32357c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32358d;

    /* renamed from: e, reason: collision with root package name */
    public final String f32359e;

    public C4728wb(String header, String text, String deeplink, String iconUrl, String type) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f32355a = header;
        this.f32356b = text;
        this.f32357c = deeplink;
        this.f32358d = iconUrl;
        this.f32359e = type;
    }

    @Override // Ve.Zi
    public final String a() {
        return this.f32357c;
    }

    @Override // Ve.Zi
    public final String b() {
        return this.f32359e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4728wb)) {
            return false;
        }
        C4728wb c4728wb = (C4728wb) obj;
        return Intrinsics.d(this.f32355a, c4728wb.f32355a) && Intrinsics.d(this.f32356b, c4728wb.f32356b) && Intrinsics.d(this.f32357c, c4728wb.f32357c) && Intrinsics.d(this.f32358d, c4728wb.f32358d) && Intrinsics.d(this.f32359e, c4728wb.f32359e);
    }

    public final int hashCode() {
        return this.f32359e.hashCode() + G.g.a(G.g.a(G.g.a(this.f32355a.hashCode() * 31, 31, this.f32356b), 31, this.f32357c), 31, this.f32358d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MajorHelperBannerItem(header=");
        sb2.append(this.f32355a);
        sb2.append(", text=");
        sb2.append(this.f32356b);
        sb2.append(", deeplink=");
        sb2.append(this.f32357c);
        sb2.append(", iconUrl=");
        sb2.append(this.f32358d);
        sb2.append(", type=");
        return C.o0.c(sb2, this.f32359e, ")");
    }
}
