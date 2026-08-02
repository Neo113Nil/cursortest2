package A80;

import K00.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f549a;

    /* renamed from: b, reason: collision with root package name */
    private final String f550b;

    /* renamed from: c, reason: collision with root package name */
    private final String f551c;

    /* renamed from: d, reason: collision with root package name */
    private final String f552d;

    /* renamed from: e, reason: collision with root package name */
    private final int f553e;

    public a(String str, String str2, String str3, String str4, int i11) {
        this.f549a = str;
        this.f550b = str2;
        this.f551c = str3;
        this.f552d = str4;
        this.f553e = i11;
    }

    public static a a(a aVar, String str, String str2, String str3) {
        return new a(str, str2, str3, aVar.f552d, aVar.f553e);
    }

    public final String b() {
        return this.f551c;
    }

    public final String c() {
        return this.f550b;
    }

    public final String d() {
        return this.f552d;
    }

    public final int e() {
        return this.f553e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f549a, aVar.f549a) && Intrinsics.d(this.f550b, aVar.f550b) && Intrinsics.d(this.f551c, aVar.f551c) && Intrinsics.d(this.f552d, aVar.f552d) && this.f553e == aVar.f553e;
    }

    public final String f() {
        return this.f549a;
    }

    public final int hashCode() {
        String str = this.f549a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f550b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f551c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f552d;
        return Integer.hashCode(this.f553e) + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FintechWebViewConfig(url=");
        sb2.append(this.f549a);
        sb2.append(", assetsLoadOnCreate=");
        sb2.append(this.f550b);
        sb2.append(", appConfigId=");
        sb2.append(this.f551c);
        sb2.append(", tabId=");
        sb2.append(this.f552d);
        sb2.append(", tabIndex=");
        return b.e(this.f553e, ")", sb2);
    }
}
