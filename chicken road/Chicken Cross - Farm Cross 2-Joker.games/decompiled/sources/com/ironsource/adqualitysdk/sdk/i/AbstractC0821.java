package com.ironsource.adqualitysdk.sdk.i;

import io.ktor.sse.ServerSentEventKt;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓯ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0821 extends AbstractC0411 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0411 f2378;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0411 f2379;

    public AbstractC0821(AbstractC0411 abstractC0411, AbstractC0411 abstractC04112) {
        this.f2379 = abstractC0411;
        this.f2378 = abstractC04112;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0821 abstractC0821 = (AbstractC0821) obj;
        AbstractC0411 abstractC0411 = this.f2379;
        if (abstractC0411 == null ? abstractC0821.f2379 != null : !abstractC0411.equals(abstractC0821.f2379)) {
            return false;
        }
        AbstractC0411 abstractC04112 = this.f2378;
        AbstractC0411 abstractC04113 = abstractC0821.f2378;
        return abstractC04112 != null ? abstractC04112.equals(abstractC04113) : abstractC04113 == null;
    }

    public final int hashCode() {
        AbstractC0411 abstractC0411 = this.f2379;
        int hashCode = (abstractC0411 != null ? abstractC0411.hashCode() : 0) * 31;
        AbstractC0411 abstractC04112 = this.f2378;
        return hashCode + (abstractC04112 != null ? abstractC04112.hashCode() : 0);
    }

    public final String toString() {
        return this.f2379 + ServerSentEventKt.SPACE + mo5427() + ServerSentEventKt.SPACE + this.f2378;
    }

    /* renamed from: ﾒ */
    public abstract String mo5427();
}
