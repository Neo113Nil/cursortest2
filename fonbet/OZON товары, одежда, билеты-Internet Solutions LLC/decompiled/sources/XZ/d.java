package XZ;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f34218a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f34219b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34220c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34221d;

    /* renamed from: e, reason: collision with root package name */
    private final String f34222e;

    /* renamed from: f, reason: collision with root package name */
    private final String f34223f;

    /* renamed from: g, reason: collision with root package name */
    private final String f34224g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f34225h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f34226i;

    public d() {
        this(null, null, null, null, null, 511);
    }

    public static d a(d dVar, Map map) {
        return new d(dVar.f34218a, map, dVar.f34220c, dVar.f34221d, dVar.f34222e, dVar.f34223f, dVar.f34224g, dVar.f34225h, dVar.f34226i);
    }

    public final String b() {
        return this.f34218a;
    }

    public final String c() {
        return this.f34221d;
    }

    public final Map<String, Object> d() {
        return this.f34219b;
    }

    public final Long e() {
        return this.f34225h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f34218a, dVar.f34218a) && Intrinsics.d(this.f34219b, dVar.f34219b) && Intrinsics.d(this.f34220c, dVar.f34220c) && Intrinsics.d(this.f34221d, dVar.f34221d) && Intrinsics.d(this.f34222e, dVar.f34222e) && Intrinsics.d(this.f34223f, dVar.f34223f) && Intrinsics.d(this.f34224g, dVar.f34224g) && Intrinsics.d(this.f34225h, dVar.f34225h) && this.f34226i == dVar.f34226i;
    }

    public final String f() {
        return this.f34224g;
    }

    public final String g() {
        return this.f34222e;
    }

    public final String h() {
        return this.f34223f;
    }

    public final int hashCode() {
        String str = this.f34218a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, Object> map = this.f34219b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.f34220c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f34221d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f34222e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f34223f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f34224g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l11 = this.f34225h;
        return Boolean.hashCode(this.f34226i) + ((hashCode7 + (l11 != null ? l11.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.f34220c;
    }

    public final boolean j() {
        return this.f34226i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenizedParams(actionType=");
        sb2.append(this.f34218a);
        sb2.append(", custom=");
        sb2.append(this.f34219b);
        sb2.append(", widgetToken=");
        sb2.append(this.f34220c);
        sb2.append(", cellToken=");
        sb2.append(this.f34221d);
        sb2.append(", sliceToken=");
        sb2.append(this.f34222e);
        sb2.append(", userToken=");
        sb2.append(this.f34223f);
        sb2.append(", pageToken=");
        sb2.append(this.f34224g);
        sb2.append(", pageTimestamp=");
        sb2.append(this.f34225h);
        sb2.append(", isFastEvent=");
        return Pk0.a.a(")", sb2, this.f34226i);
    }

    public d(String str, Map<String, ? extends Object> map, String str2, String str3, String str4, String str5, String str6, Long l11, boolean z11) {
        this.f34218a = str;
        this.f34219b = map;
        this.f34220c = str2;
        this.f34221d = str3;
        this.f34222e = str4;
        this.f34223f = str5;
        this.f34224g = str6;
        this.f34225h = l11;
        this.f34226i = z11;
    }

    public /* synthetic */ d(Map map, String str, String str2, String str3, Long l11, int i11) {
        this((i11 & 1) != 0 ? null : "error_widget", (i11 & 2) != 0 ? null : map, (i11 & 4) != 0 ? null : str, null, null, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : l11, false);
    }
}
