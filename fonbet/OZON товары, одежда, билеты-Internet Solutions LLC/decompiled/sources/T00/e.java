package T00;

import C.o0;
import Fm.C3051a;
import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f26447a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f26448b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f26449c;

    /* renamed from: d, reason: collision with root package name */
    private final String f26450d;

    /* renamed from: e, reason: collision with root package name */
    private final String f26451e;

    /* renamed from: f, reason: collision with root package name */
    private final String f26452f;

    /* renamed from: g, reason: collision with root package name */
    private final a f26453g;

    /* renamed from: h, reason: collision with root package name */
    private final transient boolean f26454h;

    /* renamed from: i, reason: collision with root package name */
    private final transient String f26455i;

    /* renamed from: j, reason: collision with root package name */
    private final transient String f26456j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Long f26457a;

        /* renamed from: b, reason: collision with root package name */
        private final Long f26458b;

        /* renamed from: c, reason: collision with root package name */
        private final Long f26459c;

        /* renamed from: d, reason: collision with root package name */
        private final Long f26460d;

        /* renamed from: e, reason: collision with root package name */
        private final Long f26461e;

        /* renamed from: f, reason: collision with root package name */
        private final Long f26462f;

        public a() {
            this(null, null, null, null, null, null);
        }

        public final Long a() {
            return this.f26457a;
        }

        public final Long b() {
            return this.f26458b;
        }

        public final Long c() {
            return this.f26459c;
        }

        public final Long d() {
            return this.f26460d;
        }

        public final Long e() {
            return this.f26461e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f26457a, aVar.f26457a) && Intrinsics.d(this.f26458b, aVar.f26458b) && Intrinsics.d(this.f26459c, aVar.f26459c) && Intrinsics.d(this.f26460d, aVar.f26460d) && Intrinsics.d(this.f26461e, aVar.f26461e) && Intrinsics.d(this.f26462f, aVar.f26462f);
        }

        public final Long f() {
            return this.f26462f;
        }

        public final int hashCode() {
            Long l11 = this.f26457a;
            int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
            Long l12 = this.f26458b;
            int hashCode2 = (hashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.f26459c;
            int hashCode3 = (hashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
            Long l14 = this.f26460d;
            int hashCode4 = (hashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Long l15 = this.f26461e;
            int hashCode5 = (hashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
            Long l16 = this.f26462f;
            return hashCode5 + (l16 != null ? l16.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AnalyticsInfo(brandId=");
            sb2.append(this.f26457a);
            sb2.append(", categoryId=");
            sb2.append(this.f26458b);
            sb2.append(", highlightId=");
            sb2.append(this.f26459c);
            sb2.append(", sellerId=");
            sb2.append(this.f26460d);
            sb2.append(", sku=");
            sb2.append(this.f26461e);
            sb2.append(", tagId=");
            return C3051a.d(sb2, this.f26462f, ")");
        }

        public a(Long l11, Long l12, Long l13, Long l14, Long l15, Long l16) {
            this.f26457a = l11;
            this.f26458b = l12;
            this.f26459c = l13;
            this.f26460d = l14;
            this.f26461e = l15;
            this.f26462f = l16;
        }
    }

    public e() {
        this((Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (a) null, (String) null, (String) null, 1023);
    }

    public static e a(e eVar, boolean z11, String str, String str2) {
        return new e(eVar.f26447a, eVar.f26448b, eVar.f26449c, eVar.f26450d, eVar.f26451e, eVar.f26452f, eVar.f26453g, z11, str, str2);
    }

    public final a b() {
        return this.f26453g;
    }

    public final Integer c() {
        return this.f26448b;
    }

    public final Integer d() {
        return this.f26449c;
    }

    public final String e() {
        return this.f26451e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.network.decode.model.PageInfo");
        e eVar = (e) obj;
        return Intrinsics.d(this.f26447a, eVar.f26447a) && Intrinsics.d(this.f26448b, eVar.f26448b) && Intrinsics.d(this.f26449c, eVar.f26449c) && Intrinsics.d(this.f26450d, eVar.f26450d) && Intrinsics.d(this.f26451e, eVar.f26451e) && Intrinsics.d(this.f26452f, eVar.f26452f) && this.f26454h == eVar.f26454h && Intrinsics.d(this.f26455i, eVar.f26455i);
    }

    public final String f() {
        return this.f26452f;
    }

    public final String g() {
        return this.f26456j;
    }

    public final String h() {
        return this.f26455i;
    }

    public final int hashCode() {
        Integer num = this.f26447a;
        int intValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.f26448b;
        int intValue2 = (intValue + (num2 != null ? num2.intValue() : 0)) * 31;
        Integer num3 = this.f26449c;
        int intValue3 = (intValue2 + (num3 != null ? num3.intValue() : 0)) * 31;
        String str = this.f26450d;
        int hashCode = (intValue3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26451e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26452f;
        int a11 = C3532b.a((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f26454h);
        String str4 = this.f26455i;
        return a11 + (str4 != null ? str4.hashCode() : 0);
    }

    public final Integer i() {
        return this.f26447a;
    }

    public final String j() {
        return this.f26450d;
    }

    public final boolean k() {
        return this.f26454h;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PageInfo(ruleId=");
        sb2.append(this.f26447a);
        sb2.append(", layoutId=");
        sb2.append(this.f26448b);
        sb2.append(", layoutVersion=");
        sb2.append(this.f26449c);
        sb2.append(", url=");
        sb2.append(this.f26450d);
        sb2.append(", pageType=");
        sb2.append(this.f26451e);
        sb2.append(", pageTypeTracking=");
        sb2.append(this.f26452f);
        sb2.append(", analyticsInfo=");
        sb2.append(this.f26453g);
        sb2.append(", isCachedResponse=");
        sb2.append(this.f26454h);
        sb2.append(", requestUrl=");
        sb2.append(this.f26455i);
        sb2.append(", pageViewId=");
        return o0.c(sb2, this.f26456j, ")");
    }

    public e(Integer num, Integer num2, Integer num3, String str, String str2, String str3, a aVar, boolean z11, String str4, String str5) {
        this.f26447a = num;
        this.f26448b = num2;
        this.f26449c = num3;
        this.f26450d = str;
        this.f26451e = str2;
        this.f26452f = str3;
        this.f26453g = aVar;
        this.f26454h = z11;
        this.f26455i = str4;
        this.f26456j = str5;
    }

    public /* synthetic */ e(Integer num, Integer num2, Integer num3, String str, String str2, String str3, a aVar, String str4, String str5, int i11) {
        this((i11 & 1) != 0 ? -1 : num, (i11 & 2) != 0 ? -1 : num2, (i11 & 4) != 0 ? -1 : num3, (i11 & 8) != 0 ? "" : str, (i11 & 16) != 0 ? "" : str2, (i11 & 32) != 0 ? "" : str3, (i11 & 64) != 0 ? null : aVar, false, (i11 & 256) != 0 ? "" : str4, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str5);
    }
}
