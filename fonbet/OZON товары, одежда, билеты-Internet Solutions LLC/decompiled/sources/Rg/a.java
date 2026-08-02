package Rg;

import G.g;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f25066a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25067b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25068c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25069d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25070e;

    /* renamed from: f, reason: collision with root package name */
    private final Long f25071f;

    /* renamed from: g, reason: collision with root package name */
    private final String f25072g;

    /* renamed from: h, reason: collision with root package name */
    private final String f25073h;

    /* renamed from: i, reason: collision with root package name */
    private final transient a f25074i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final transient String f25075j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f25076k;

    public a() {
        this(null, null, null, null, null, null, null, null, null, null, null, 4095);
    }

    public static a a(a aVar, a aVar2, String str, int i11) {
        String str2 = aVar.f25066a;
        String str3 = aVar.f25067b;
        String str4 = aVar.f25068c;
        String str5 = aVar.f25069d;
        String str6 = aVar.f25070e;
        Long l11 = aVar.f25071f;
        String str7 = aVar.f25072g;
        String str8 = aVar.f25073h;
        aVar.getClass();
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            aVar2 = aVar.f25074i;
        }
        a aVar3 = aVar2;
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            str = aVar.f25075j;
        }
        String pageViewId = str;
        Map<String, Object> customParams = aVar.f25076k;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pageViewId, "pageViewId");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        return new a(str2, str3, str4, str5, str6, l11, str7, str8, aVar3, pageViewId, customParams);
    }

    @NotNull
    public final Map<String, Object> b() {
        return this.f25076k;
    }

    public final String c() {
        return this.f25067b;
    }

    public final String d() {
        return this.f25068c;
    }

    public final String e() {
        return this.f25069d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f25066a, aVar.f25066a) && Intrinsics.d(this.f25067b, aVar.f25067b) && Intrinsics.d(this.f25068c, aVar.f25068c) && Intrinsics.d(this.f25069d, aVar.f25069d) && Intrinsics.d(this.f25070e, aVar.f25070e) && Intrinsics.d(this.f25071f, aVar.f25071f) && Intrinsics.d(this.f25072g, aVar.f25072g) && Intrinsics.d(this.f25073h, aVar.f25073h) && Intrinsics.d(this.f25074i, aVar.f25074i) && Intrinsics.d(this.f25075j, aVar.f25075j) && Intrinsics.d(this.f25076k, aVar.f25076k);
    }

    public final String f() {
        return this.f25066a;
    }

    @NotNull
    public final String g() {
        return this.f25075j;
    }

    public final a h() {
        return this.f25074i;
    }

    public final int hashCode() {
        String str = this.f25066a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25067b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25068c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25069d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f25070e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l11 = this.f25071f;
        int hashCode6 = (hashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str6 = this.f25072g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f25073h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 961;
        a aVar = this.f25074i;
        return this.f25076k.hashCode() + g.a((hashCode8 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.f25075j);
    }

    public final String i() {
        return this.f25072g;
    }

    public final String j() {
        return this.f25070e;
    }

    public final Long k() {
        return this.f25071f;
    }

    public final String l() {
        return this.f25073h;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnalyticsScreen(name=");
        sb2.append(this.f25066a);
        sb2.append(", deeplink=");
        sb2.append(this.f25067b);
        sb2.append(", layoutId=");
        sb2.append(this.f25068c);
        sb2.append(", layoutVersion=");
        sb2.append(this.f25069d);
        sb2.append(", ruleId=");
        sb2.append(this.f25070e);
        sb2.append(", tagId=");
        sb2.append(this.f25071f);
        sb2.append(", requestId=");
        sb2.append(this.f25072g);
        sb2.append(", userToken=");
        sb2.append(this.f25073h);
        sb2.append(", nextUrl=null, previousPage=");
        sb2.append(this.f25074i);
        sb2.append(", pageViewId=");
        sb2.append(this.f25075j);
        sb2.append(", customParams=");
        return P.f(sb2, this.f25076k, ")");
    }

    public a(String str, String str2, String str3, String str4, String str5, Long l11, String str6, String str7, a aVar, @NotNull String pageViewId, @NotNull Map customParams) {
        Intrinsics.checkNotNullParameter(pageViewId, "pageViewId");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        this.f25066a = str;
        this.f25067b = str2;
        this.f25068c = str3;
        this.f25069d = str4;
        this.f25070e = str5;
        this.f25071f = l11;
        this.f25072g = str6;
        this.f25073h = str7;
        this.f25074i = aVar;
        this.f25075j = pageViewId;
        this.f25076k = customParams;
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, Long l11, String str6, String str7, a aVar, String str8, Map map, int i11) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : l11, (i11 & 64) != 0 ? null : str6, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str7, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : aVar, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? UUID.randomUUID().toString() : str8, (i11 & 2048) != 0 ? new LinkedHashMap() : map);
    }
}
