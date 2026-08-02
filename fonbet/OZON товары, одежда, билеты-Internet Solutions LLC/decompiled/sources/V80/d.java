package V80;

import B0.C2454a;
import G.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f28437a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f28438b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28439c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28440d;

    /* renamed from: e, reason: collision with root package name */
    private final int f28441e;

    /* renamed from: f, reason: collision with root package name */
    private final int f28442f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f28443g;

    public /* synthetic */ d() {
        this("qr_nspk", "/links/mob/nspkcamera", R.string.fintech_nav_qr_scanner_short_label, R.string.fintech_nav_qr_scanner_long_label, R.string.fintech_nav_qr_scanner_disabled_message, R.drawable.ic_m_qrcode, true);
    }

    public final int a() {
        return this.f28441e;
    }

    public final int b() {
        return this.f28442f;
    }

    @NotNull
    public final String c() {
        return this.f28437a;
    }

    public final int d() {
        return this.f28440d;
    }

    public final int e() {
        return this.f28439c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f28437a, dVar.f28437a) && Intrinsics.d(this.f28438b, dVar.f28438b) && this.f28439c == dVar.f28439c && this.f28440d == dVar.f28440d && this.f28441e == dVar.f28441e && this.f28442f == dVar.f28442f && this.f28443g == dVar.f28443g;
    }

    public final boolean f() {
        return this.f28443g;
    }

    @NotNull
    public final String g() {
        return this.f28438b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28443g) + C2454a.a(this.f28442f, C2454a.a(this.f28441e, C2454a.a(this.f28440d, C2454a.a(this.f28439c, g.a(this.f28437a.hashCode() * 31, 31, this.f28438b), 31), 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShortcutData(id=");
        sb2.append(this.f28437a);
        sb2.append(", url=");
        sb2.append(this.f28438b);
        sb2.append(", shortLabel=");
        sb2.append(this.f28439c);
        sb2.append(", longLabel=");
        sb2.append(this.f28440d);
        sb2.append(", disabledMessage=");
        sb2.append(this.f28441e);
        sb2.append(", iconId=");
        sb2.append(this.f28442f);
        sb2.append(", shouldBeCreated=");
        return Pk0.a.a(")", sb2, this.f28443g);
    }

    public d(@NotNull String id2, @NotNull String url, int i11, int i12, int i13, int i14, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f28437a = id2;
        this.f28438b = url;
        this.f28439c = i11;
        this.f28440d = i12;
        this.f28441e = i13;
        this.f28442f = i14;
        this.f28443g = z11;
    }
}
