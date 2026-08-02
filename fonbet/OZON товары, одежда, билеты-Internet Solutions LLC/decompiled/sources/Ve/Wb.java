package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Wb {

    /* renamed from: a, reason: collision with root package name */
    public final String f30256a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30257b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30258c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30259d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30260e;

    /* renamed from: f, reason: collision with root package name */
    public final String f30261f;

    public Wb(String str, String str2, String str3, String str4, String str5, String str6, int i11) {
        str2 = (i11 & 2) != 0 ? null : str2;
        str3 = (i11 & 4) != 0 ? null : str3;
        str4 = (i11 & 8) != 0 ? null : str4;
        str6 = (i11 & 32) != 0 ? null : str6;
        this.f30256a = str;
        this.f30257b = str2;
        this.f30258c = str3;
        this.f30259d = str4;
        this.f30260e = str5;
        this.f30261f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wb)) {
            return false;
        }
        Wb wb2 = (Wb) obj;
        return Intrinsics.d(this.f30256a, wb2.f30256a) && Intrinsics.d(this.f30257b, wb2.f30257b) && Intrinsics.d(this.f30258c, wb2.f30258c) && Intrinsics.d(this.f30259d, wb2.f30259d) && Intrinsics.d(this.f30260e, wb2.f30260e) && Intrinsics.d(this.f30261f, wb2.f30261f);
    }

    public final int hashCode() {
        int hashCode = this.f30256a.hashCode() * 31;
        String str = this.f30257b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f30258c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30259d;
        int a11 = G.g.a((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f30260e);
        String str4 = this.f30261f;
        return (a11 + (str4 != null ? str4.hashCode() : 0)) * 961;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenData(header=");
        sb2.append(this.f30256a);
        sb2.append(", text=");
        sb2.append(this.f30257b);
        sb2.append(", declineText=");
        sb2.append(this.f30258c);
        sb2.append(", buttonConfirm=");
        sb2.append(this.f30259d);
        sb2.append(", buttonDecline=");
        sb2.append(this.f30260e);
        sb2.append(", buttonInform=");
        return C.o0.c(sb2, this.f30261f, ", cybercabinetUrlAndroid=null, cybercabinetUrlIOS=null)");
    }
}
