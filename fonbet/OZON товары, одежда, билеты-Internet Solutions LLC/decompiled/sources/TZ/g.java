package TZ;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f26965a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26966b;

    /* renamed from: c, reason: collision with root package name */
    private final String f26967c;

    /* renamed from: d, reason: collision with root package name */
    private final String f26968d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f26969e;

    /* renamed from: f, reason: collision with root package name */
    private final String f26970f;

    /* renamed from: g, reason: collision with root package name */
    private final String f26971g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f26972h;

    public g() {
        this(127, null, null, null, null, null, null);
    }

    @NotNull
    public final String a() {
        return this.f26972h;
    }

    public final String b() {
        return this.f26965a;
    }

    public final String c() {
        return this.f26967c;
    }

    public final Integer d() {
        return this.f26969e;
    }

    public final String e() {
        return this.f26970f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f26965a, gVar.f26965a) && Intrinsics.d(this.f26966b, gVar.f26966b) && Intrinsics.d(this.f26967c, gVar.f26967c) && Intrinsics.d(this.f26968d, gVar.f26968d) && Intrinsics.d(this.f26969e, gVar.f26969e) && Intrinsics.d(this.f26970f, gVar.f26970f) && Intrinsics.d(this.f26971g, gVar.f26971g);
    }

    public final String f() {
        return this.f26971g;
    }

    public final String g() {
        return this.f26968d;
    }

    public final String h() {
        return this.f26966b;
    }

    public final int hashCode() {
        String str = this.f26965a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26966b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26967c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26968d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f26969e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f26970f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f26971g;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ErrorEventParams(id=");
        sb2.append(this.f26965a);
        sb2.append(", url=");
        sb2.append(this.f26966b);
        sb2.append(", name=");
        sb2.append(this.f26967c);
        sb2.append(", type=");
        sb2.append(this.f26968d);
        sb2.append(", number=");
        sb2.append(this.f26969e);
        sb2.append(", status=");
        sb2.append(this.f26970f);
        sb2.append(", title=");
        return o0.c(sb2, this.f26971g, ")");
    }

    public g(int i11, Integer num, String str, String str2, String str3, String str4, String str5) {
        str = (i11 & 1) != 0 ? null : str;
        str2 = (i11 & 2) != 0 ? null : str2;
        str3 = (i11 & 4) != 0 ? null : str3;
        String str6 = (i11 & 8) != 0 ? null : "error";
        num = (i11 & 16) != 0 ? null : num;
        str4 = (i11 & 32) != 0 ? null : str4;
        str5 = (i11 & 64) != 0 ? null : str5;
        this.f26965a = str;
        this.f26966b = str2;
        this.f26967c = str3;
        this.f26968d = str6;
        this.f26969e = num;
        this.f26970f = str4;
        this.f26971g = str5;
        this.f26972h = TokenizedTrackingInfo.ACTION_ERROR_VIEW;
    }
}
