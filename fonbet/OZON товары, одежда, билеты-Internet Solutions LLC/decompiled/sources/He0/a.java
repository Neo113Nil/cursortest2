package He0;

import G.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.model.Components;
import we0.m;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f10899a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f10900b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f10901c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f10902d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Components f10903e;

    /* renamed from: f, reason: collision with root package name */
    private final String f10904f;

    /* renamed from: g, reason: collision with root package name */
    private final m f10905g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f10906h;

    public a(@NotNull String title, @NotNull String fullAddress, @NotNull String displayFullAddress, @NotNull String postalCode, @NotNull Components components, String str, m mVar, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fullAddress, "fullAddress");
        Intrinsics.checkNotNullParameter(displayFullAddress, "displayFullAddress");
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        Intrinsics.checkNotNullParameter(components, "components");
        this.f10899a = title;
        this.f10900b = fullAddress;
        this.f10901c = displayFullAddress;
        this.f10902d = postalCode;
        this.f10903e = components;
        this.f10904f = str;
        this.f10905g = mVar;
        this.f10906h = z11;
    }

    public final String a() {
        return this.f10904f;
    }

    public final m b() {
        return this.f10905g;
    }

    @NotNull
    public final CharSequence c() {
        return this.f10901c;
    }

    @NotNull
    public final CharSequence d() {
        return this.f10900b;
    }

    @NotNull
    public final CharSequence e() {
        return this.f10899a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f10899a, aVar.f10899a) && Intrinsics.d(this.f10900b, aVar.f10900b) && Intrinsics.d(this.f10901c, aVar.f10901c) && Intrinsics.d(this.f10902d, aVar.f10902d) && Intrinsics.d(this.f10903e, aVar.f10903e) && Intrinsics.d(this.f10904f, aVar.f10904f) && this.f10905g.equals(aVar.f10905g) && this.f10906h == aVar.f10906h;
    }

    public final boolean f() {
        return this.f10906h;
    }

    public final int hashCode() {
        int hashCode = (this.f10903e.hashCode() + g.a((this.f10901c.hashCode() + ((this.f10900b.hashCode() + (this.f10899a.hashCode() * 961)) * 31)) * 31, 31, this.f10902d)) * 31;
        String str = this.f10904f;
        return Boolean.hashCode(this.f10906h) + ((this.f10905g.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressSuggestion(title=");
        sb2.append((Object) this.f10899a);
        sb2.append(", subtitle=null, fullAddress=");
        sb2.append((Object) this.f10900b);
        sb2.append(", displayFullAddress=");
        sb2.append((Object) this.f10901c);
        sb2.append(", postalCode=");
        sb2.append(this.f10902d);
        sb2.append(", components=");
        sb2.append(this.f10903e);
        sb2.append(", contextLocationUid=");
        sb2.append(this.f10904f);
        sb2.append(", coords=");
        sb2.append(this.f10905g);
        sb2.append(", trustCoord=");
        return Pk0.a.a(")", sb2, this.f10906h);
    }
}
