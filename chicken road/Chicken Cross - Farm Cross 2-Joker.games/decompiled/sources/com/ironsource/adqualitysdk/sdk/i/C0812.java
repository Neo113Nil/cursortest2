package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓗ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0812 extends AbstractC0395 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final AbstractC0395 f2361;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final AbstractC0411 f2362;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0411 f2363;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0411 f2364;

    public C0812(AbstractC0411 abstractC0411, AbstractC0411 abstractC04112, AbstractC0411 abstractC04113, AbstractC0395 abstractC0395) {
        this.f2364 = abstractC0411;
        this.f2363 = abstractC04112;
        this.f2362 = abstractC04113;
        this.f2361 = abstractC0395;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0812.class != obj.getClass()) {
            return false;
        }
        C0812 c0812 = (C0812) obj;
        AbstractC0411 abstractC0411 = this.f2364;
        if (abstractC0411 == null ? c0812.f2364 != null : !abstractC0411.equals(c0812.f2364)) {
            return false;
        }
        AbstractC0411 abstractC04112 = this.f2363;
        if (abstractC04112 == null ? c0812.f2363 != null : !abstractC04112.equals(c0812.f2363)) {
            return false;
        }
        AbstractC0411 abstractC04113 = this.f2362;
        if (abstractC04113 == null ? c0812.f2362 != null : !abstractC04113.equals(c0812.f2362)) {
            return false;
        }
        AbstractC0395 abstractC0395 = this.f2361;
        AbstractC0395 abstractC03952 = c0812.f2361;
        return abstractC0395 != null ? abstractC0395.equals(abstractC03952) : abstractC03952 == null;
    }

    public final int hashCode() {
        AbstractC0411 abstractC0411 = this.f2364;
        int hashCode = (abstractC0411 != null ? abstractC0411.hashCode() : 0) * 31;
        AbstractC0411 abstractC04112 = this.f2363;
        int hashCode2 = (hashCode + (abstractC04112 != null ? abstractC04112.hashCode() : 0)) * 31;
        AbstractC0411 abstractC04113 = this.f2362;
        int hashCode3 = (hashCode2 + (abstractC04113 != null ? abstractC04113.hashCode() : 0)) * 31;
        AbstractC0395 abstractC0395 = this.f2361;
        return hashCode3 + (abstractC0395 != null ? abstractC0395.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("b0Lq9N8=\n", "CS2Y1Pcrh5g=\n"));
        AbstractC0411 abstractC0411 = this.f2364;
        if (abstractC0411 != null) {
            sb.append(abstractC0411);
        }
        sb.append(StringFog.decrypt("t2Y=\n", "jEZflsUEQeY=\n"));
        sb.append(this.f2363);
        sb.append(StringFog.decrypt("upY=\n", "gbapufIzjX0=\n"));
        AbstractC0411 abstractC04112 = this.f2362;
        if (abstractC04112 != null) {
            sb.append(abstractC04112);
        }
        sb.append(StringFog.decrypt("/zg=\n", "1hiKkIeO8sk=\n"));
        sb.append(this.f2361);
        return sb.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0395
    /* renamed from: ﾒ */
    public final C1192 mo5331(C1074 c1074, C1226 c1226) {
        AbstractC0411 abstractC0411 = this.f2364;
        if (abstractC0411 != null) {
            abstractC0411.m5426(c1074, c1226);
        }
        while (this.f2363.m5426(c1074, c1226).m5918()) {
            C1192 m5395 = this.f2361.m5395(c1074, c1226);
            if (m5395.f3384) {
                break;
            }
            if (m5395.f3385) {
                return m5395;
            }
            AbstractC0411 abstractC04112 = this.f2362;
            if (abstractC04112 != null) {
                abstractC04112.m5426(c1074, c1226);
            }
        }
        return new C1192(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0395
    /* renamed from: ﾒ */
    public final int mo5330() {
        return this.f2361.mo5330();
    }
}
