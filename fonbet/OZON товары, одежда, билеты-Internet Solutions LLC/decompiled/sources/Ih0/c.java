package Ih0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f12517a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f12518b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f12519c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f12520d;

    /* renamed from: e, reason: collision with root package name */
    private final Kh0.a f12521e;

    /* renamed from: f, reason: collision with root package name */
    private final Long f12522f;

    /* renamed from: g, reason: collision with root package name */
    private final String f12523g;

    /* renamed from: h, reason: collision with root package name */
    private final Boolean f12524h;

    /* renamed from: i, reason: collision with root package name */
    private final String f12525i;

    /* renamed from: j, reason: collision with root package name */
    private final String f12526j;

    /* renamed from: k, reason: collision with root package name */
    private final String f12527k;

    public c(@NotNull String id2, @NotNull a status, Long l11, Integer num, Kh0.a aVar, Long l12, String str, Boolean bool, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f12517a = id2;
        this.f12518b = status;
        this.f12519c = l11;
        this.f12520d = num;
        this.f12521e = aVar;
        this.f12522f = l12;
        this.f12523g = str;
        this.f12524h = bool;
        this.f12525i = str2;
        this.f12526j = str3;
        this.f12527k = str4;
    }

    public static c a(c cVar, Integer num) {
        String id2 = cVar.f12517a;
        Intrinsics.checkNotNullParameter(id2, "id");
        a status = cVar.f12518b;
        Intrinsics.checkNotNullParameter(status, "status");
        return new c(id2, status, cVar.f12519c, num, cVar.f12521e, cVar.f12522f, cVar.f12523g, cVar.f12524h, cVar.f12525i, cVar.f12526j, cVar.f12527k);
    }

    public final Long b() {
        return this.f12519c;
    }

    public final String c() {
        return this.f12523g;
    }

    public final Kh0.a d() {
        return this.f12521e;
    }

    public final String e() {
        return this.f12527k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f12517a, cVar.f12517a) && this.f12518b == cVar.f12518b && Intrinsics.d(this.f12519c, cVar.f12519c) && Intrinsics.d(this.f12520d, cVar.f12520d) && Intrinsics.d(this.f12521e, cVar.f12521e) && Intrinsics.d(this.f12522f, cVar.f12522f) && Intrinsics.d(this.f12523g, cVar.f12523g) && Intrinsics.d(this.f12524h, cVar.f12524h) && Intrinsics.d(this.f12525i, cVar.f12525i) && Intrinsics.d(this.f12526j, cVar.f12526j) && Intrinsics.d(this.f12527k, cVar.f12527k);
    }

    @NotNull
    public final String f() {
        return this.f12517a;
    }

    public final String g() {
        return this.f12526j;
    }

    public final String h() {
        return this.f12525i;
    }

    public final int hashCode() {
        int hashCode = (this.f12518b.hashCode() + (this.f12517a.hashCode() * 31)) * 31;
        Long l11 = this.f12519c;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num = this.f12520d;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Kh0.a aVar = this.f12521e;
        int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Long l12 = this.f12522f;
        int hashCode5 = (hashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.f12523g;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f12524h;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f12525i;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f12526j;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f12527k;
        return hashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public final Long i() {
        return this.f12522f;
    }

    public final Integer j() {
        return this.f12520d;
    }

    @NotNull
    public final a k() {
        return this.f12518b;
    }

    public final Boolean l() {
        return this.f12524h;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PushStatusEvent(id=");
        sb2.append(this.f12517a);
        sb2.append(", status=");
        sb2.append(this.f12518b);
        sb2.append(", createTimestamp=");
        sb2.append(this.f12519c);
        sb2.append(", sendingAttemptNumber=");
        sb2.append(this.f12520d);
        sb2.append(", deviceStatsAtReceive=");
        sb2.append(this.f12521e);
        sb2.append(", pushServiceStartupTime=");
        sb2.append(this.f12522f);
        sb2.append(", deliveryStatus=");
        sb2.append(this.f12523g);
        sb2.append(", isTeensMode=");
        sb2.append(this.f12524h);
        sb2.append(", priority=");
        sb2.append(this.f12525i);
        sb2.append(", originalPriority=");
        sb2.append(this.f12526j);
        sb2.append(", firstMessageId=");
        return o0.c(sb2, this.f12527k, ")");
    }
}
