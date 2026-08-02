package com.paypal.oslo.feature.oneonboarding.api.domain;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;", "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/NavDecor;", "startNavAction", "endNavAction", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Progress;", "progressBarConfig", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/NavDecor;Lcom/paypal/oslo/feature/oneonboarding/api/domain/NavDecor;Lcom/paypal/oslo/feature/oneonboarding/api/domain/Progress;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/NavDecor;", "component2", "component3", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/Progress;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/NavDecor;Lcom/paypal/oslo/feature/oneonboarding/api/domain/NavDecor;Lcom/paypal/oslo/feature/oneonboarding/api/domain/Progress;)Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/NavDecor;", "getStartNavAction", "getEndNavAction", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Progress;", "getProgressBarConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TopBarConfig {
    private final com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor endNavAction;
    private final com.paypal.oslo.feature.oneonboarding.api.domain.Progress progressBarConfig;
    private final com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor startNavAction;

    public TopBarConfig(com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor navDecor, com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor navDecor2, com.paypal.oslo.feature.oneonboarding.api.domain.Progress progress) {
        this.startNavAction = navDecor;
        this.endNavAction = navDecor2;
        this.progressBarConfig = progress;
    }

    public /* synthetic */ TopBarConfig(com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor navDecor, com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor navDecor2, com.paypal.oslo.feature.oneonboarding.api.domain.Progress progress, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : navDecor, (i & 2) != 0 ? null : navDecor2, (i & 4) != 0 ? null : progress);
    }

    public final com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor getStartNavAction() {
        return this.startNavAction;
    }

    public final com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor getEndNavAction() {
        return this.endNavAction;
    }

    public final com.paypal.oslo.feature.oneonboarding.api.domain.Progress getProgressBarConfig() {
        return this.progressBarConfig;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor navDecor = this.startNavAction;
        com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor navDecor2 = this.endNavAction;
        com.paypal.oslo.feature.oneonboarding.api.domain.Progress progress = this.progressBarConfig;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TopBarConfig(startNavAction=");
        sb.append(navDecor);
        sb.append(", endNavAction=");
        sb.append(navDecor2);
        sb.append(", progressBarConfig=");
        sb.append(progress);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor navDecor = this.startNavAction;
        int hashCode = navDecor == null ? 0 : navDecor.hashCode();
        com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor navDecor2 = this.endNavAction;
        int hashCode2 = navDecor2 == null ? 0 : navDecor2.hashCode();
        com.paypal.oslo.feature.oneonboarding.api.domain.Progress progress = this.progressBarConfig;
        return (((hashCode * 31) + hashCode2) * 31) + (progress != null ? progress.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig = (com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig) other;
        return this.startNavAction == topBarConfig.startNavAction && this.endNavAction == topBarConfig.endNavAction && kotlin.jvm.internal.Intrinsics.areEqual(this.progressBarConfig, topBarConfig.progressBarConfig);
    }

    public final com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig copy(com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor startNavAction, com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor endNavAction, com.paypal.oslo.feature.oneonboarding.api.domain.Progress progressBarConfig) {
        return new com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig(startNavAction, endNavAction, progressBarConfig);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.api.domain.Progress getProgressBarConfig() {
        return this.progressBarConfig;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor getEndNavAction() {
        return this.endNavAction;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor getStartNavAction() {
        return this.startNavAction;
    }

    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig copy$default(com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor navDecor, com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor navDecor2, com.paypal.oslo.feature.oneonboarding.api.domain.Progress progress, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            navDecor = topBarConfig.startNavAction;
        }
        if ((i & 2) != 0) {
            navDecor2 = topBarConfig.endNavAction;
        }
        if ((i & 4) != 0) {
            progress = topBarConfig.progressBarConfig;
        }
        return topBarConfig.copy(navDecor, navDecor2, progress);
    }

    public TopBarConfig() {
        this(null, null, null, 7, null);
    }
}
