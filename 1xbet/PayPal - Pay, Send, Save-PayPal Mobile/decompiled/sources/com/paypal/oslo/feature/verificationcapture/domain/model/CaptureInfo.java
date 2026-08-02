package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016Jh\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010\u0013J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b'\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b*\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b+\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b,\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureInfo;", "", "", "collectionMode", "captureMode", "", "retryNumber", "effort", "", "activeLivenessScore", "activeLivenessType", "docDetectScore", "lightingScore", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "()Ljava/lang/Float;", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCollectionMode", "getCaptureMode", com.visa.cbp.getEncExpo.warmup, "getRetryNumber", "getEffort", "Ljava/lang/Float;", "getActiveLivenessScore", "getActiveLivenessType", "getDocDetectScore", "getLightingScore"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CaptureInfo {
    public static final int $stable = 0;
    private final java.lang.Float activeLivenessScore;
    private final java.lang.String activeLivenessType;
    private final java.lang.String captureMode;
    private final java.lang.String collectionMode;
    private final java.lang.Float docDetectScore;
    private final int effort;
    private final java.lang.Float lightingScore;
    private final int retryNumber;

    public CaptureInfo(java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Float f, java.lang.String str3, java.lang.Float f2, java.lang.Float f3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.collectionMode = str;
        this.captureMode = str2;
        this.retryNumber = i;
        this.effort = i2;
        this.activeLivenessScore = f;
        this.activeLivenessType = str3;
        this.docDetectScore = f2;
        this.lightingScore = f3;
    }

    public /* synthetic */ CaptureInfo(java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Float f, java.lang.String str3, java.lang.Float f2, java.lang.Float f3, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, i2, (i3 & 16) != 0 ? null : f, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : f2, (i3 & 128) != 0 ? null : f3);
    }

    public final java.lang.String getCollectionMode() {
        return this.collectionMode;
    }

    public final java.lang.String getCaptureMode() {
        return this.captureMode;
    }

    public final int getRetryNumber() {
        return this.retryNumber;
    }

    public final int getEffort() {
        return this.effort;
    }

    public final java.lang.Float getActiveLivenessScore() {
        return this.activeLivenessScore;
    }

    public final java.lang.String getActiveLivenessType() {
        return this.activeLivenessType;
    }

    public final java.lang.Float getDocDetectScore() {
        return this.docDetectScore;
    }

    public final java.lang.Float getLightingScore() {
        return this.lightingScore;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.collectionMode;
        java.lang.String str2 = this.captureMode;
        int i = this.retryNumber;
        int i2 = this.effort;
        java.lang.Float f = this.activeLivenessScore;
        java.lang.String str3 = this.activeLivenessType;
        java.lang.Float f2 = this.docDetectScore;
        java.lang.Float f3 = this.lightingScore;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CaptureInfo(collectionMode=");
        sb.append(str);
        sb.append(", captureMode=");
        sb.append(str2);
        sb.append(", retryNumber=");
        sb.append(i);
        sb.append(", effort=");
        sb.append(i2);
        sb.append(", activeLivenessScore=");
        sb.append(f);
        sb.append(", activeLivenessType=");
        sb.append(str3);
        sb.append(", docDetectScore=");
        sb.append(f2);
        sb.append(", lightingScore=");
        sb.append(f3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.collectionMode.hashCode();
        int hashCode2 = this.captureMode.hashCode();
        int hashCode3 = java.lang.Integer.hashCode(this.retryNumber);
        int hashCode4 = java.lang.Integer.hashCode(this.effort);
        java.lang.Float f = this.activeLivenessScore;
        int hashCode5 = f == null ? 0 : f.hashCode();
        java.lang.String str = this.activeLivenessType;
        int hashCode6 = str == null ? 0 : str.hashCode();
        java.lang.Float f2 = this.docDetectScore;
        int hashCode7 = f2 == null ? 0 : f2.hashCode();
        java.lang.Float f3 = this.lightingScore;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (f3 != null ? f3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureInfo)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureInfo captureInfo = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.collectionMode, captureInfo.collectionMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.captureMode, captureInfo.captureMode) && this.retryNumber == captureInfo.retryNumber && this.effort == captureInfo.effort && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.activeLivenessScore, (java.lang.Object) captureInfo.activeLivenessScore) && kotlin.jvm.internal.Intrinsics.areEqual(this.activeLivenessType, captureInfo.activeLivenessType) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.docDetectScore, (java.lang.Object) captureInfo.docDetectScore) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.lightingScore, (java.lang.Object) captureInfo.lightingScore);
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureInfo copy(java.lang.String collectionMode, java.lang.String captureMode, int retryNumber, int effort, java.lang.Float activeLivenessScore, java.lang.String activeLivenessType, java.lang.Float docDetectScore, java.lang.Float lightingScore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectionMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureMode, "");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureInfo(collectionMode, captureMode, retryNumber, effort, activeLivenessScore, activeLivenessType, docDetectScore, lightingScore);
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.Float getLightingScore() {
        return this.lightingScore;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.Float getDocDetectScore() {
        return this.docDetectScore;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getActiveLivenessType() {
        return this.activeLivenessType;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.Float getActiveLivenessScore() {
        return this.activeLivenessScore;
    }

    /* renamed from: component4, reason: from getter */
    public final int getEffort() {
        return this.effort;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRetryNumber() {
        return this.retryNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCaptureMode() {
        return this.captureMode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCollectionMode() {
        return this.collectionMode;
    }
}
