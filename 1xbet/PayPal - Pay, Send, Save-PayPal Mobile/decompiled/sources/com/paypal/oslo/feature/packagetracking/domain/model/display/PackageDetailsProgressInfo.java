package com.paypal.oslo.feature.packagetracking.domain.model.display;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDetailsProgressInfo;", "", "", "progress", "Lcom/paypal/pds/components/ProgressBarStyle;", "progressBarStyle", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "statusLabel", "<init>", "(FLcom/paypal/pds/components/ProgressBarStyle;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)V", "component1", "()F", "component2", "()Lcom/paypal/pds/components/ProgressBarStyle;", "component3", "()Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "copy", "(FLcom/paypal/pds/components/ProgressBarStyle;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDetailsProgressInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getProgress", "Lcom/paypal/pds/components/ProgressBarStyle;", "getProgressBarStyle", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "getStatusLabel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PackageDetailsProgressInfo {
    public static final int $stable = 0;
    private final float progress;
    private final com.paypal.pds.components.ProgressBarStyle progressBarStyle;
    private final com.paypal.oslo.feature.packagetracking.domain.UiString statusLabel;

    public PackageDetailsProgressInfo(float f, com.paypal.pds.components.ProgressBarStyle progressBarStyle, com.paypal.oslo.feature.packagetracking.domain.UiString uiString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressBarStyle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
        this.progress = f;
        this.progressBarStyle = progressBarStyle;
        this.statusLabel = uiString;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final com.paypal.pds.components.ProgressBarStyle getProgressBarStyle() {
        return this.progressBarStyle;
    }

    public final com.paypal.oslo.feature.packagetracking.domain.UiString getStatusLabel() {
        return this.statusLabel;
    }

    public final java.lang.String toString() {
        float f = this.progress;
        com.paypal.pds.components.ProgressBarStyle progressBarStyle = this.progressBarStyle;
        com.paypal.oslo.feature.packagetracking.domain.UiString uiString = this.statusLabel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PackageDetailsProgressInfo(progress=");
        sb.append(f);
        sb.append(", progressBarStyle=");
        sb.append(progressBarStyle);
        sb.append(", statusLabel=");
        sb.append(uiString);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Float.hashCode(this.progress) * 31) + this.progressBarStyle.hashCode()) * 31) + this.statusLabel.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo)) {
            return false;
        }
        com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo packageDetailsProgressInfo = (com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo) other;
        return java.lang.Float.compare(this.progress, packageDetailsProgressInfo.progress) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.progressBarStyle, packageDetailsProgressInfo.progressBarStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.statusLabel, packageDetailsProgressInfo.statusLabel);
    }

    public final com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo copy(float progress, com.paypal.pds.components.ProgressBarStyle progressBarStyle, com.paypal.oslo.feature.packagetracking.domain.UiString statusLabel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressBarStyle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusLabel, "");
        return new com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo(progress, progressBarStyle, statusLabel);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.packagetracking.domain.UiString getStatusLabel() {
        return this.statusLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.pds.components.ProgressBarStyle getProgressBarStyle() {
        return this.progressBarStyle;
    }

    /* renamed from: component1, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo copy$default(com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo packageDetailsProgressInfo, float f, com.paypal.pds.components.ProgressBarStyle progressBarStyle, com.paypal.oslo.feature.packagetracking.domain.UiString uiString, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = packageDetailsProgressInfo.progress;
        }
        if ((i & 2) != 0) {
            progressBarStyle = packageDetailsProgressInfo.progressBarStyle;
        }
        if ((i & 4) != 0) {
            uiString = packageDetailsProgressInfo.statusLabel;
        }
        return packageDetailsProgressInfo.copy(f, progressBarStyle, uiString);
    }
}
