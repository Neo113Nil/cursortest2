package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends i {
    public final String a;
    public final Integer b;
    public final h c;
    public final long d;
    public final long e;
    public final Map<String, String> f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public static final class a extends i.a {
        public String a;
        public Integer b;
        public h c;
        public Long d;
        public Long e;
        public HashMap f;
        public Integer g;
        public String h;
        public byte[] i;
        public byte[] j;

        public final b b() {
            String str = this.a == null ? " transportName" : "";
            if (this.c == null) {
                str = str.concat(" encodedPayload");
            }
            if (this.d == null) {
                str = androidx.compose.runtime.changelist.d.b(str, " eventMillis");
            }
            if (this.e == null) {
                str = androidx.compose.runtime.changelist.d.b(str, " uptimeMillis");
            }
            if (this.f == null) {
                str = androidx.compose.runtime.changelist.d.b(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new b(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f, this.g, this.h, this.i, this.j);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public b() {
        throw null;
    }

    public b(String str, Integer num, h hVar, long j, long j2, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = hVar;
        this.d = j;
        this.e = j2;
        this.f = hashMap;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    @Override // com.google.android.datatransport.runtime.i
    public final Map<String, String> b() {
        return this.f;
    }

    @Override // com.google.android.datatransport.runtime.i
    @Nullable
    public final Integer c() {
        return this.b;
    }

    @Override // com.google.android.datatransport.runtime.i
    public final h d() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.i
    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.a.equals(iVar.k())) {
            return false;
        }
        Integer num = this.b;
        if (num == null) {
            if (iVar.c() != null) {
                return false;
            }
        } else if (!num.equals(iVar.c())) {
            return false;
        }
        if (!this.c.equals(iVar.d()) || this.d != iVar.e() || this.e != iVar.l() || !this.f.equals(iVar.b())) {
            return false;
        }
        Integer num2 = this.g;
        if (num2 == null) {
            if (iVar.i() != null) {
                return false;
            }
        } else if (!num2.equals(iVar.i())) {
            return false;
        }
        String str = this.h;
        if (str == null) {
            if (iVar.j() != null) {
                return false;
            }
        } else if (!str.equals(iVar.j())) {
            return false;
        }
        boolean z = iVar instanceof b;
        if (Arrays.equals(this.i, z ? ((b) iVar).i : iVar.f())) {
            return Arrays.equals(this.j, z ? ((b) iVar).j : iVar.g());
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.i
    @Nullable
    public final byte[] f() {
        return this.i;
    }

    @Override // com.google.android.datatransport.runtime.i
    @Nullable
    public final byte[] g() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int hashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        return ((((hashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    @Override // com.google.android.datatransport.runtime.i
    @Nullable
    public final Integer i() {
        return this.g;
    }

    @Override // com.google.android.datatransport.runtime.i
    @Nullable
    public final String j() {
        return this.h;
    }

    @Override // com.google.android.datatransport.runtime.i
    public final String k() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.i
    public final long l() {
        return this.e;
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
