package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ۥ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0644 extends AbstractC0395 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C1055 f1781;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1105 f1782;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1105 f1783;

    public C0644(C1105 c1105, C1105 c11052, C1055 c1055) {
        this.f1783 = c1105;
        this.f1782 = c11052;
        this.f1781 = c1055;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0644.class != obj.getClass()) {
            return false;
        }
        C0644 c0644 = (C0644) obj;
        C1105 c1105 = this.f1783;
        if (c1105 == null ? c0644.f1783 != null : !c1105.equals(c0644.f1783)) {
            return false;
        }
        C1105 c11052 = this.f1782;
        if (c11052 == null ? c0644.f1782 != null : !c11052.equals(c0644.f1782)) {
            return false;
        }
        C1055 c1055 = this.f1781;
        C1055 c10552 = c0644.f1781;
        return c1055 != null ? c1055.equals(c10552) : c10552 == null;
    }

    public final int hashCode() {
        C1105 c1105 = this.f1783;
        int hashCode = (c1105 != null ? c1105.hashCode() : 0) * 31;
        C1105 c11052 = this.f1782;
        int hashCode2 = (hashCode + (c11052 != null ? c11052.hashCode() : 0)) * 31;
        C1055 c1055 = this.f1781;
        return hashCode2 + (c1055 != null ? c1055.hashCode() : 0);
    }

    public final String toString() {
        return StringFog.decrypt("4/WzpQ==\n", "l4fKhevLqCg=\n") + this.f1783 + StringFog.decrypt("axiXqUbS2dA=\n", "S3v23SW6+fg=\n") + this.f1781 + StringFog.decrypt("x5o=\n", "7rp1jRfMMvQ=\n") + this.f1782;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0395
    /* renamed from: ﾒ */
    public final C1192 mo5331(C1074 c1074, C1226 c1226) {
        try {
            C1105 c1105 = this.f1783;
            if (c1105 != null) {
                return c1105.m5395(new C1074(new HashMap(), c1074, false), c1226);
            }
        } catch (Throwable th) {
            C1105 c11052 = this.f1783;
            c1074.f3179.remove(c11052);
            int lastIndexOf = c1074.f3180.lastIndexOf(c11052);
            if (lastIndexOf >= 0) {
                c1074.f3180 = new ArrayList(c1074.f3180.subList(0, lastIndexOf));
            }
            if (this.f1782 != null) {
                c1074.f3179.add(this);
                HashMap hashMap = new HashMap();
                C1055 c1055 = this.f1781;
                if (c1055 != null) {
                    hashMap.put(AbstractC1212.m5923(c1055.f3138), th);
                }
                return this.f1782.m5395(new C1074(hashMap, c1074, false), c1226);
            }
        }
        return new C1192(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0395
    /* renamed from: ﾒ */
    public final int mo5330() {
        return (this.f1782.mo5330() + this.f1783.mo5330()) - 1;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0395
    /* renamed from: ﾒ */
    public final int mo5396(C1074 c1074) {
        if (c1074.f3179.contains(this)) {
            return this.f1783.mo5330();
        }
        return 1;
    }
}
