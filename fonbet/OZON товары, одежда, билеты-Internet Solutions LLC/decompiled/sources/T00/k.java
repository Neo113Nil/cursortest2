package T00;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final String f26478a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26479b;

    /* renamed from: c, reason: collision with root package name */
    private final String f26480c;

    /* renamed from: d, reason: collision with root package name */
    private final String f26481d;

    /* renamed from: e, reason: collision with root package name */
    private final String f26482e;

    /* renamed from: f, reason: collision with root package name */
    private final String f26483f;

    /* renamed from: g, reason: collision with root package name */
    private final a f26484g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f26485a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26486b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26487c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26488d;

        public a(String str, String str2, String str3, String str4) {
            this.f26485a = str;
            this.f26486b = str2;
            this.f26487c = str3;
            this.f26488d = str4;
        }

        public final String a() {
            return this.f26485a;
        }

        public final String b() {
            return this.f26487c;
        }

        public final String c() {
            return this.f26486b;
        }

        public final String d() {
            return this.f26488d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f26485a, aVar.f26485a) && Intrinsics.d(this.f26486b, aVar.f26486b) && Intrinsics.d(this.f26487c, aVar.f26487c) && Intrinsics.d(this.f26488d, aVar.f26488d);
        }

        public final int hashCode() {
            String str = this.f26485a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f26486b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f26487c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f26488d;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ExpandedStateDTO(navBarTintColor=");
            sb2.append(this.f26485a);
            sb2.append(", navStatusBarStyle=");
            sb2.append(this.f26486b);
            sb2.append(", navSearchBarTintColor=");
            sb2.append(this.f26487c);
            sb2.append(", navTintColor=");
            return o0.c(sb2, this.f26488d, ")");
        }
    }

    public k(String str, String str2, String str3, String str4, String str5, String str6, a aVar) {
        this.f26478a = str;
        this.f26479b = str2;
        this.f26480c = str3;
        this.f26481d = str4;
        this.f26482e = str5;
        this.f26483f = str6;
        this.f26484g = aVar;
    }

    public final a a() {
        return this.f26484g;
    }

    public final String b() {
        return this.f26480c;
    }

    public final String c() {
        return this.f26483f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f26478a, kVar.f26478a) && Intrinsics.d(this.f26479b, kVar.f26479b) && Intrinsics.d(this.f26480c, kVar.f26480c) && Intrinsics.d(this.f26481d, kVar.f26481d) && Intrinsics.d(this.f26482e, kVar.f26482e) && Intrinsics.d(this.f26483f, kVar.f26483f) && Intrinsics.d(this.f26484g, kVar.f26484g);
    }

    public final int hashCode() {
        String str = this.f26478a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26479b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26480c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26481d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f26482e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f26483f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        a aVar = this.f26484g;
        return hashCode6 + (aVar != null ? aVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SharedDTO(context=" + this.f26478a + ", pageType=" + this.f26479b + ", navBarTintColor=" + this.f26480c + ", navSearchBarTintColor=" + this.f26481d + ", navStatusBarStyle=" + this.f26482e + ", navTintColor=" + this.f26483f + ", expandedNavBar=" + this.f26484g + ")";
    }
}
