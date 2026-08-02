package T00;

import C.o0;
import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final long f26490a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f26491b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f26492c;

    /* renamed from: d, reason: collision with root package name */
    private final String f26493d;

    /* renamed from: e, reason: collision with root package name */
    private final String f26494e;

    /* renamed from: f, reason: collision with root package name */
    private final String f26495f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f26496g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f26497h;

    /* renamed from: i, reason: collision with root package name */
    private final String f26498i;

    /* renamed from: j, reason: collision with root package name */
    private transient boolean f26499j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final String f26500k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final String f26501l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final String f26502m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final String f26503n;

    public m(long j11, @NotNull String vertical, @NotNull String component, String str, String str2, String str3, boolean z11, boolean z12, String str4) {
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        Intrinsics.checkNotNullParameter(component, "component");
        this.f26490a = j11;
        this.f26491b = vertical;
        this.f26492c = component;
        this.f26493d = str;
        this.f26494e = str2;
        this.f26495f = str3;
        this.f26496g = z11;
        this.f26497h = z12;
        this.f26498i = str4;
        this.f26500k = G.g.c(vertical, ".", component);
        this.f26501l = vertical + "." + component + "." + j11;
        this.f26502m = V.e.b(new Object[]{vertical, component, str}, 3, "%s/%s/%s", "format(...)");
        this.f26503n = V.e.b(new Object[]{vertical, component}, 2, "%s.%s", "format(...)");
    }

    public final String a() {
        return this.f26495f;
    }

    @NotNull
    public final String b() {
        return this.f26492c;
    }

    public final String c() {
        return this.f26493d;
    }

    @NotNull
    public final String d() {
        return this.f26502m;
    }

    @NotNull
    public final String e() {
        return this.f26503n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.network.decode.model.WidgetLayout");
        m mVar = (m) obj;
        return this.f26490a == mVar.f26490a && Intrinsics.d(this.f26491b, mVar.f26491b) && Intrinsics.d(this.f26492c, mVar.f26492c) && Intrinsics.d(this.f26493d, mVar.f26493d) && Intrinsics.d(this.f26494e, mVar.f26494e) && Intrinsics.d(this.f26495f, mVar.f26495f) && this.f26496g == mVar.f26496g && this.f26497h == mVar.f26497h && this.f26499j == mVar.f26499j && Intrinsics.d(this.f26498i, mVar.f26498i);
    }

    public final long f() {
        return this.f26490a;
    }

    @NotNull
    public final String g() {
        return this.f26491b;
    }

    @NotNull
    public final String h() {
        return this.f26500k;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f26490a) * 31;
        String str = this.f26491b;
        int a11 = G.g.a(G.g.a(G.g.a(hashCode, 31, str), 31, str), 31, this.f26492c);
        String str2 = this.f26493d;
        int hashCode2 = (a11 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26494e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f26495f;
        int a12 = C3532b.a(C3532b.a(C3532b.a((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f26496g), 31, this.f26497h), 31, this.f26499j);
        String str5 = this.f26498i;
        return a12 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public final String i() {
        return this.f26501l;
    }

    public final String j() {
        return this.f26494e;
    }

    public final String k() {
        return this.f26498i;
    }

    public final boolean l() {
        return this.f26499j;
    }

    public final boolean m() {
        return this.f26496g;
    }

    public final boolean n() {
        return this.f26497h;
    }

    @NotNull
    public final m o() {
        String vertical = this.f26491b;
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        String component = this.f26492c;
        Intrinsics.checkNotNullParameter(component, "component");
        m mVar = new m(this.f26490a, vertical, component, this.f26493d, this.f26494e, this.f26495f, this.f26496g, this.f26497h, this.f26498i);
        mVar.f26499j = true;
        return mVar;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WidgetLayout(version=");
        sb2.append(this.f26490a);
        sb2.append(", vertical=");
        sb2.append(this.f26491b);
        sb2.append(", component=");
        sb2.append(this.f26492c);
        sb2.append(", stateId=");
        sb2.append(this.f26493d);
        sb2.append(", widgetToken=");
        sb2.append(this.f26494e);
        sb2.append(", asyncData=");
        sb2.append(this.f26495f);
        sb2.append(", isTrackView=");
        sb2.append(this.f26496g);
        sb2.append(", isTrackingOn=");
        sb2.append(this.f26497h);
        sb2.append(", widgetViewCellToken=");
        return o0.c(sb2, this.f26498i, ")");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(long j11, @NotNull String vertical, @NotNull String component, String str) {
        this(j11, vertical, component, str, null, null, false, false, null);
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        Intrinsics.checkNotNullParameter(component, "component");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(long j11, @NotNull String vertical, @NotNull String component, String str, int i11) {
        this(j11, vertical, component, str, null, null, false, false, null);
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        Intrinsics.checkNotNullParameter(component, "component");
        this.f26499j = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(@NotNull String vertical, @NotNull String component, String str, String str2) {
        this(1L, vertical, component, str, str2, null, true, true, null);
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        Intrinsics.checkNotNullParameter(component, "component");
    }
}
