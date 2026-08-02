package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/pds/components/ArcAngles;", "", "", "startAngle", "sweepAngle", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Lcom/paypal/pds/components/ArcAngles;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getStartAngle", "getSweepAngle"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ArcAngles {
    public static final int $stable = 0;
    private final float startAngle;
    private final float sweepAngle;

    public ArcAngles(float f, float f2) {
        this.startAngle = f;
        this.sweepAngle = f2;
    }

    public final float getStartAngle() {
        return this.startAngle;
    }

    public final float getSweepAngle() {
        return this.sweepAngle;
    }

    public final java.lang.String toString() {
        float f = this.startAngle;
        float f2 = this.sweepAngle;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ArcAngles(startAngle=");
        sb.append(f);
        sb.append(", sweepAngle=");
        sb.append(f2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Float.hashCode(this.startAngle) * 31) + java.lang.Float.hashCode(this.sweepAngle);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.components.ArcAngles)) {
            return false;
        }
        com.paypal.pds.components.ArcAngles arcAngles = (com.paypal.pds.components.ArcAngles) other;
        return java.lang.Float.compare(this.startAngle, arcAngles.startAngle) == 0 && java.lang.Float.compare(this.sweepAngle, arcAngles.sweepAngle) == 0;
    }

    public final com.paypal.pds.components.ArcAngles copy(float startAngle, float sweepAngle) {
        return new com.paypal.pds.components.ArcAngles(startAngle, sweepAngle);
    }

    /* renamed from: component2, reason: from getter */
    public final float getSweepAngle() {
        return this.sweepAngle;
    }

    /* renamed from: component1, reason: from getter */
    public final float getStartAngle() {
        return this.startAngle;
    }

    public static /* synthetic */ com.paypal.pds.components.ArcAngles copy$default(com.paypal.pds.components.ArcAngles arcAngles, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = arcAngles.startAngle;
        }
        if ((i & 2) != 0) {
            f2 = arcAngles.sweepAngle;
        }
        return arcAngles.copy(f, f2);
    }
}
