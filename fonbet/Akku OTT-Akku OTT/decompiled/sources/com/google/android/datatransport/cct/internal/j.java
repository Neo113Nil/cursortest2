package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.t;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j extends t {
    public final long a;
    public final Integer b;
    public final p c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final w h;
    public final q i;

    public static final class a extends t.a {
        public Long a;
        public Integer b;
        public f c;
        public Long d;
        public byte[] e;
        public String f;
        public Long g;
        public m h;
        public g i;
    }

    public j(long j, Integer num, p pVar, long j2, byte[] bArr, String str, long j3, w wVar, q qVar) {
        this.a = j;
        this.b = num;
        this.c = pVar;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = wVar;
        this.i = qVar;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    @Nullable
    public final p a() {
        return this.c;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    @Nullable
    public final Integer b() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    public final long c() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    public final long d() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    @Nullable
    public final q e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.a != tVar.c()) {
            return false;
        }
        Integer num = this.b;
        if (num == null) {
            if (tVar.b() != null) {
                return false;
            }
        } else if (!num.equals(tVar.b())) {
            return false;
        }
        p pVar = this.c;
        if (pVar == null) {
            if (tVar.a() != null) {
                return false;
            }
        } else if (!pVar.equals(tVar.a())) {
            return false;
        }
        if (this.d != tVar.d()) {
            return false;
        }
        if (!Arrays.equals(this.e, tVar instanceof j ? ((j) tVar).e : tVar.g())) {
            return false;
        }
        String str = this.f;
        if (str == null) {
            if (tVar.h() != null) {
                return false;
            }
        } else if (!str.equals(tVar.h())) {
            return false;
        }
        if (this.g != tVar.i()) {
            return false;
        }
        w wVar = this.h;
        if (wVar == null) {
            if (tVar.f() != null) {
                return false;
            }
        } else if (!wVar.equals(tVar.f())) {
            return false;
        }
        q qVar = this.i;
        return qVar == null ? tVar.e() == null : qVar.equals(tVar.e());
    }

    @Override // com.google.android.datatransport.cct.internal.t
    @Nullable
    public final w f() {
        return this.h;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    @Nullable
    public final byte[] g() {
        return this.e;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    @Nullable
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.c;
        int hashCode2 = (hashCode ^ (pVar == null ? 0 : pVar.hashCode())) * 1000003;
        long j2 = this.d;
        int hashCode3 = (((hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (hashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        w wVar = this.h;
        int hashCode5 = (i2 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.i;
        return hashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // com.google.android.datatransport.cct.internal.t
    public final long i() {
        return this.g;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
