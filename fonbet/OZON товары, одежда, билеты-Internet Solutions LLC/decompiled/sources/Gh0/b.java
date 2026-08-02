package Gh0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f10258a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f10259b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f10260c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f10261d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f10262e;

    /* renamed from: f, reason: collision with root package name */
    private final Long f10263f;

    /* renamed from: g, reason: collision with root package name */
    private final String f10264g;

    /* renamed from: h, reason: collision with root package name */
    private final Boolean f10265h;

    /* renamed from: i, reason: collision with root package name */
    private final String f10266i;

    /* renamed from: j, reason: collision with root package name */
    private final String f10267j;

    /* renamed from: k, reason: collision with root package name */
    private final String f10268k;

    public b(@NotNull String id2, @NotNull d status, Long l11, Integer num, Long l12, Long l13, String str, Boolean bool, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f10258a = id2;
        this.f10259b = status;
        this.f10260c = l11;
        this.f10261d = num;
        this.f10262e = l12;
        this.f10263f = l13;
        this.f10264g = str;
        this.f10265h = bool;
        this.f10266i = str2;
        this.f10267j = str3;
        this.f10268k = str4;
    }

    public final Long a() {
        return this.f10260c;
    }

    public final String b() {
        return this.f10264g;
    }

    public final Long c() {
        return this.f10262e;
    }

    public final String d() {
        return this.f10268k;
    }

    @NotNull
    public final String e() {
        return this.f10258a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f10258a, bVar.f10258a) && this.f10259b == bVar.f10259b && Intrinsics.d(this.f10260c, bVar.f10260c) && Intrinsics.d(this.f10261d, bVar.f10261d) && Intrinsics.d(this.f10262e, bVar.f10262e) && Intrinsics.d(this.f10263f, bVar.f10263f) && Intrinsics.d(this.f10264g, bVar.f10264g) && Intrinsics.d(this.f10265h, bVar.f10265h) && Intrinsics.d(this.f10266i, bVar.f10266i) && Intrinsics.d(this.f10267j, bVar.f10267j) && Intrinsics.d(this.f10268k, bVar.f10268k);
    }

    public final String f() {
        return this.f10267j;
    }

    public final String g() {
        return this.f10266i;
    }

    public final Long h() {
        return this.f10263f;
    }

    public final int hashCode() {
        int hashCode = (this.f10259b.hashCode() + (this.f10258a.hashCode() * 31)) * 31;
        Long l11 = this.f10260c;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num = this.f10261d;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l12 = this.f10262e;
        int hashCode4 = (hashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f10263f;
        int hashCode5 = (hashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str = this.f10264g;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f10265h;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f10266i;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10267j;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10268k;
        return hashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public final Integer i() {
        return this.f10261d;
    }

    @NotNull
    public final d j() {
        return this.f10259b;
    }

    public final Boolean k() {
        return this.f10265h;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PushEntity(id=");
        sb2.append(this.f10258a);
        sb2.append(", status=");
        sb2.append(this.f10259b);
        sb2.append(", createTimestamp=");
        sb2.append(this.f10260c);
        sb2.append(", sendingAttemptNumber=");
        sb2.append(this.f10261d);
        sb2.append(", deviceStatsId=");
        sb2.append(this.f10262e);
        sb2.append(", pushServiceStartupTime=");
        sb2.append(this.f10263f);
        sb2.append(", deliveryStatus=");
        sb2.append(this.f10264g);
        sb2.append(", isTeensMode=");
        sb2.append(this.f10265h);
        sb2.append(", priority=");
        sb2.append(this.f10266i);
        sb2.append(", originalPriority=");
        sb2.append(this.f10267j);
        sb2.append(", firstMessageId=");
        return o0.c(sb2, this.f10268k, ")");
    }
}
