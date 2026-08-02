package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\\\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b)\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b*\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/SensorData;", "", "", "motionIsChanged", "accIsChanged", "gyrIsChanged", "", "collectionCount", "", "motionEvent", "accEvent", "gyrEvent", "<init>", "(ZZZI[F[F[F)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()Z", "component2", "component3", "component4", "component5", "()[F", "component6", "component7", "copy", "(ZZZI[F[F[F)Lcom/paypal/oslo/feature/verificationcapture/domain/model/SensorData;", "", "toString", "()Ljava/lang/String;", "Z", "getMotionIsChanged", "getAccIsChanged", "getGyrIsChanged", com.visa.cbp.getEncExpo.warmup, "getCollectionCount", "[F", "getMotionEvent", "getAccEvent", "getGyrEvent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SensorData {
    public static final int $stable = 8;
    private final float[] accEvent;
    private final boolean accIsChanged;
    private final int collectionCount;
    private final float[] gyrEvent;
    private final boolean gyrIsChanged;
    private final float[] motionEvent;
    private final boolean motionIsChanged;

    public SensorData(boolean z, boolean z2, boolean z3, int i, float[] fArr, float[] fArr2, float[] fArr3) {
        this.motionIsChanged = z;
        this.accIsChanged = z2;
        this.gyrIsChanged = z3;
        this.collectionCount = i;
        this.motionEvent = fArr;
        this.accEvent = fArr2;
        this.gyrEvent = fArr3;
    }

    public /* synthetic */ SensorData(boolean z, boolean z2, boolean z3, int i, float[] fArr, float[] fArr2, float[] fArr3, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, i, (i2 & 16) != 0 ? null : fArr, (i2 & 32) != 0 ? null : fArr2, (i2 & 64) != 0 ? null : fArr3);
    }

    public final boolean getMotionIsChanged() {
        return this.motionIsChanged;
    }

    public final boolean getAccIsChanged() {
        return this.accIsChanged;
    }

    public final boolean getGyrIsChanged() {
        return this.gyrIsChanged;
    }

    public final int getCollectionCount() {
        return this.collectionCount;
    }

    public final float[] getMotionEvent() {
        return this.motionEvent;
    }

    public final float[] getAccEvent() {
        return this.accEvent;
    }

    public final float[] getGyrEvent() {
        return this.gyrEvent;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        com.paypal.oslo.feature.verificationcapture.domain.model.SensorData sensorData = (com.paypal.oslo.feature.verificationcapture.domain.model.SensorData) other;
        if (this.motionIsChanged != sensorData.motionIsChanged || this.accIsChanged != sensorData.accIsChanged || this.gyrIsChanged != sensorData.gyrIsChanged || this.collectionCount != sensorData.collectionCount) {
            return false;
        }
        float[] fArr = this.motionEvent;
        float[] fArr2 = sensorData.motionEvent;
        if ((fArr == null && fArr2 == null) || (fArr != null && fArr2 != null && java.util.Arrays.equals(fArr, fArr2))) {
            float[] fArr3 = this.accEvent;
            float[] fArr4 = sensorData.accEvent;
            if ((fArr3 == null && fArr4 == null) || (fArr3 != null && fArr4 != null && java.util.Arrays.equals(fArr3, fArr4))) {
                float[] fArr5 = this.gyrEvent;
                float[] fArr6 = sensorData.gyrEvent;
                if ((fArr5 == null && fArr6 == null) || (fArr5 != null && fArr6 != null && java.util.Arrays.equals(fArr5, fArr6))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.motionIsChanged);
        int hashCode2 = java.lang.Boolean.hashCode(this.accIsChanged);
        int hashCode3 = java.lang.Boolean.hashCode(this.gyrIsChanged);
        int i = this.collectionCount;
        float[] fArr = this.motionEvent;
        int hashCode4 = fArr != null ? java.util.Arrays.hashCode(fArr) : 0;
        float[] fArr2 = this.accEvent;
        int hashCode5 = fArr2 != null ? java.util.Arrays.hashCode(fArr2) : 0;
        float[] fArr3 = this.gyrEvent;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i) * 31) + hashCode4) * 31) + hashCode5) * 31) + (fArr3 != null ? java.util.Arrays.hashCode(fArr3) : 0);
    }

    public final java.lang.String toString() {
        boolean z = this.motionIsChanged;
        boolean z2 = this.accIsChanged;
        boolean z3 = this.gyrIsChanged;
        int i = this.collectionCount;
        java.lang.String arrays = java.util.Arrays.toString(this.motionEvent);
        java.lang.String arrays2 = java.util.Arrays.toString(this.accEvent);
        java.lang.String arrays3 = java.util.Arrays.toString(this.gyrEvent);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SensorData(motionIsChanged=");
        sb.append(z);
        sb.append(", accIsChanged=");
        sb.append(z2);
        sb.append(", gyrIsChanged=");
        sb.append(z3);
        sb.append(", collectionCount=");
        sb.append(i);
        sb.append(", motionEvent=");
        sb.append(arrays);
        sb.append(", accEvent=");
        sb.append(arrays2);
        sb.append(", gyrEvent=");
        sb.append(arrays3);
        sb.append(")");
        return sb.toString();
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.SensorData copy(boolean motionIsChanged, boolean accIsChanged, boolean gyrIsChanged, int collectionCount, float[] motionEvent, float[] accEvent, float[] gyrEvent) {
        return new com.paypal.oslo.feature.verificationcapture.domain.model.SensorData(motionIsChanged, accIsChanged, gyrIsChanged, collectionCount, motionEvent, accEvent, gyrEvent);
    }

    /* renamed from: component7, reason: from getter */
    public final float[] getGyrEvent() {
        return this.gyrEvent;
    }

    /* renamed from: component6, reason: from getter */
    public final float[] getAccEvent() {
        return this.accEvent;
    }

    /* renamed from: component5, reason: from getter */
    public final float[] getMotionEvent() {
        return this.motionEvent;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCollectionCount() {
        return this.collectionCount;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getGyrIsChanged() {
        return this.gyrIsChanged;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAccIsChanged() {
        return this.accIsChanged;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getMotionIsChanged() {
        return this.motionIsChanged;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.SensorData copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.SensorData sensorData, boolean z, boolean z2, boolean z3, int i, float[] fArr, float[] fArr2, float[] fArr3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = sensorData.motionIsChanged;
        }
        if ((i2 & 2) != 0) {
            z2 = sensorData.accIsChanged;
        }
        boolean z4 = z2;
        if ((i2 & 4) != 0) {
            z3 = sensorData.gyrIsChanged;
        }
        boolean z5 = z3;
        if ((i2 & 8) != 0) {
            i = sensorData.collectionCount;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            fArr = sensorData.motionEvent;
        }
        float[] fArr4 = fArr;
        if ((i2 & 32) != 0) {
            fArr2 = sensorData.accEvent;
        }
        float[] fArr5 = fArr2;
        if ((i2 & 64) != 0) {
            fArr3 = sensorData.gyrEvent;
        }
        return sensorData.copy(z, z4, z5, i3, fArr4, fArr5, fArr3);
    }
}
