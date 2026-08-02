package Ih0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f12508a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f12509b;

    /* renamed from: c, reason: collision with root package name */
    private final long f12510c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f12511d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12512e;

    /* renamed from: f, reason: collision with root package name */
    private final Boolean f12513f;

    /* renamed from: g, reason: collision with root package name */
    private final String f12514g;

    /* renamed from: h, reason: collision with root package name */
    private final String f12515h;

    /* renamed from: i, reason: collision with root package name */
    private final String f12516i;

    public b(@NotNull String id2, @NotNull a status, long j11, Long l11, String str, Boolean bool, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f12508a = id2;
        this.f12509b = status;
        this.f12510c = j11;
        this.f12511d = l11;
        this.f12512e = str;
        this.f12513f = bool;
        this.f12514g = str2;
        this.f12515h = str3;
        this.f12516i = str4;
    }

    public final long a() {
        return this.f12510c;
    }

    public final String b() {
        return this.f12512e;
    }

    public final String c() {
        return this.f12516i;
    }

    @NotNull
    public final String d() {
        return this.f12508a;
    }

    public final String e() {
        return this.f12515h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f12508a, bVar.f12508a) && this.f12509b == bVar.f12509b && this.f12510c == bVar.f12510c && Intrinsics.d(this.f12511d, bVar.f12511d) && Intrinsics.d(this.f12512e, bVar.f12512e) && Intrinsics.d(this.f12513f, bVar.f12513f) && Intrinsics.d(this.f12514g, bVar.f12514g) && Intrinsics.d(this.f12515h, bVar.f12515h) && Intrinsics.d(this.f12516i, bVar.f12516i);
    }

    public final String f() {
        return this.f12514g;
    }

    public final Long g() {
        return this.f12511d;
    }

    @NotNull
    public final a h() {
        return this.f12509b;
    }

    public final int hashCode() {
        int a11 = Pk0.c.a((this.f12509b.hashCode() + (this.f12508a.hashCode() * 31)) * 31, 961, this.f12510c);
        Long l11 = this.f12511d;
        int hashCode = (a11 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.f12512e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f12513f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f12514g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f12515h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f12516i;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final Boolean i() {
        return this.f12513f;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PushStatusData(id=");
        sb2.append(this.f12508a);
        sb2.append(", status=");
        sb2.append(this.f12509b);
        sb2.append(", createTimestamp=");
        sb2.append(this.f12510c);
        sb2.append(", metadata=null, pushServiceStartupTime=");
        sb2.append(this.f12511d);
        sb2.append(", deliveryStatus=");
        sb2.append(this.f12512e);
        sb2.append(", isTeensMode=");
        sb2.append(this.f12513f);
        sb2.append(", priority=");
        sb2.append(this.f12514g);
        sb2.append(", originalPriority=");
        sb2.append(this.f12515h);
        sb2.append(", firstMessageId=");
        return o0.c(sb2, this.f12516i, ")");
    }
}
