package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import io.ktor.sse.ServerSentEventKt;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓶ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0828 extends AbstractC0537 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final AbstractC0395 f2406;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final AbstractC0395 f2407;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0411 f2408;

    public C0828(AbstractC0411 abstractC0411, AbstractC0395 abstractC0395, AbstractC0395 abstractC03952, byte b) {
        super(b);
        this.f2408 = abstractC0411;
        this.f2407 = abstractC0395;
        this.f2406 = abstractC03952;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0828.class != obj.getClass()) {
            return false;
        }
        C0828 c0828 = (C0828) obj;
        AbstractC0411 abstractC0411 = this.f2408;
        if (abstractC0411 == null ? c0828.f2408 != null : !abstractC0411.equals(c0828.f2408)) {
            return false;
        }
        AbstractC0395 abstractC0395 = this.f2407;
        if (abstractC0395 == null ? c0828.f2407 != null : !abstractC0395.equals(c0828.f2407)) {
            return false;
        }
        AbstractC0395 abstractC03952 = this.f2406;
        AbstractC0395 abstractC03953 = c0828.f2406;
        return abstractC03952 != null ? abstractC03952.equals(abstractC03953) : abstractC03953 == null;
    }

    public final int hashCode() {
        AbstractC0411 abstractC0411 = this.f2408;
        int hashCode = (abstractC0411 != null ? abstractC0411.hashCode() : 0) * 31;
        AbstractC0395 abstractC0395 = this.f2407;
        int hashCode2 = (hashCode + (abstractC0395 != null ? abstractC0395.hashCode() : 0)) * 31;
        AbstractC0395 abstractC03952 = this.f2406;
        return hashCode2 + (abstractC03952 != null ? abstractC03952.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("oh3e7A==\n", "y3v+xAMI3lg=\n"));
        sb.append(this.f2408);
        sb.append(StringFog.decrypt("UKE=\n", "eYH6YYR5z1U=\n"));
        sb.append(this.f2407);
        if (this.f2406 != null) {
            if (this.f2407 instanceof C1105) {
                sb.append(ServerSentEventKt.SPACE);
            } else {
                sb.append("\n");
                byte b = this.f1207;
                for (int i = 0; i < b; i++) {
                    sb.append("  ");
                }
            }
            sb.append(StringFog.decrypt("BIxCLas=\n", "YeAxSIvi5x0=\n"));
            sb.append(this.f2406);
        }
        return sb.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0395
    /* renamed from: ﾒ */
    public final C1192 mo5331(C1074 c1074, C1226 c1226) {
        if (this.f2408.m5426(c1074, c1226).m5918()) {
            return this.f2407.m5395(c1074, c1226);
        }
        if (this.f2406 == null) {
            return new C1192(Boolean.FALSE);
        }
        c1074.f3179.add(this);
        return this.f2406.m5395(c1074, c1226);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0395
    /* renamed from: ﾒ */
    public final int mo5330() {
        int mo5330 = this.f2407.mo5330();
        AbstractC0395 abstractC0395 = this.f2406;
        if (abstractC0395 == null) {
            return mo5330;
        }
        int mo53302 = mo5330 + abstractC0395.mo5330();
        return this.f2407 instanceof C1105 ? mo53302 - 1 : mo53302;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0395
    /* renamed from: ﾒ */
    public final int mo5396(C1074 c1074) {
        if (!c1074.f3179.contains(this)) {
            return this.f2407 instanceof C1105 ? 1 : 0;
        }
        int mo5330 = this.f2407.mo5330();
        return this.f2406 instanceof C1105 ? mo5330 : mo5330 - 1;
    }
}
