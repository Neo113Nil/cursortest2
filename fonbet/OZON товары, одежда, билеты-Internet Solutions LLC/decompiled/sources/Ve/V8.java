package Ve;

import I0.C3173b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class V8 {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f30183a;

    /* renamed from: b, reason: collision with root package name */
    public String f30184b;

    /* renamed from: c, reason: collision with root package name */
    public String f30185c;

    /* renamed from: d, reason: collision with root package name */
    public String f30186d;

    /* renamed from: e, reason: collision with root package name */
    public String f30187e;

    /* renamed from: f, reason: collision with root package name */
    public String f30188f;

    public V8(Boolean bool, String str, String str2, String str3, int i11) {
        bool = (i11 & 1) != 0 ? null : bool;
        str = (i11 & 2) != 0 ? null : str;
        str2 = (i11 & 4) != 0 ? null : str2;
        str3 = (i11 & 8) != 0 ? null : str3;
        this.f30183a = bool;
        this.f30184b = str;
        this.f30185c = str2;
        this.f30186d = str3;
        this.f30187e = null;
        this.f30188f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V8)) {
            return false;
        }
        V8 v82 = (V8) obj;
        return Intrinsics.d(this.f30183a, v82.f30183a) && Intrinsics.d(this.f30184b, v82.f30184b) && Intrinsics.d(this.f30185c, v82.f30185c) && Intrinsics.d(this.f30186d, v82.f30186d) && Intrinsics.d(this.f30187e, v82.f30187e) && Intrinsics.d(this.f30188f, v82.f30188f);
    }

    public final int hashCode() {
        Boolean bool = this.f30183a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f30184b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f30185c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30186d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f30187e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f30188f;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.f30183a;
        String str = this.f30184b;
        String str2 = this.f30185c;
        String str3 = this.f30186d;
        String str4 = this.f30187e;
        String str5 = this.f30188f;
        StringBuilder e11 = D3.g.e("SidAuthResultModel(isSuccess=", bool, ", state=", str, ", nonce=");
        Nh.a.h(e11, str2, ", authCode=", str3, ", errorDescription=");
        return C3173b.c(e11, str4, ", errorCode=", str5, ")");
    }
}
