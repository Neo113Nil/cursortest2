package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends u {
    public final long a;
    public final long b;
    public final e c;
    public final Integer d;
    public final String e;
    public final ArrayList f;
    public final x g;

    public k() {
        throw null;
    }

    public k(long j, long j2, e eVar, Integer num, String str, ArrayList arrayList) {
        x xVar = x.a;
        this.a = j;
        this.b = j2;
        this.c = eVar;
        this.d = num;
        this.e = str;
        this.f = arrayList;
        this.g = xVar;
    }

    @Override // com.google.android.datatransport.cct.internal.u
    @Nullable
    public final o a() {
        return this.c;
    }

    @Override // com.google.android.datatransport.cct.internal.u
    @Nullable
    @Encodable.Field(name = "logEvent")
    public final List<t> b() {
        return this.f;
    }

    @Override // com.google.android.datatransport.cct.internal.u
    @Nullable
    public final Integer c() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.internal.u
    @Nullable
    public final String d() {
        return this.e;
    }

    @Override // com.google.android.datatransport.cct.internal.u
    @Nullable
    public final x e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.a != uVar.f() || this.b != uVar.g()) {
            return false;
        }
        e eVar = this.c;
        if (eVar == null) {
            if (uVar.a() != null) {
                return false;
            }
        } else if (!eVar.equals(uVar.a())) {
            return false;
        }
        Integer num = this.d;
        if (num == null) {
            if (uVar.c() != null) {
                return false;
            }
        } else if (!num.equals(uVar.c())) {
            return false;
        }
        String str = this.e;
        if (str == null) {
            if (uVar.d() != null) {
                return false;
            }
        } else if (!str.equals(uVar.d())) {
            return false;
        }
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            if (uVar.b() != null) {
                return false;
            }
        } else if (!arrayList.equals(uVar.b())) {
            return false;
        }
        x xVar = this.g;
        return xVar == null ? uVar.e() == null : xVar.equals(uVar.e());
    }

    @Override // com.google.android.datatransport.cct.internal.u
    public final long f() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.internal.u
    public final long g() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        e eVar = this.c;
        int hashCode = (i ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ArrayList arrayList = this.f;
        int hashCode4 = (hashCode3 ^ (arrayList == null ? 0 : arrayList.hashCode())) * 1000003;
        x xVar = this.g;
        return hashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
