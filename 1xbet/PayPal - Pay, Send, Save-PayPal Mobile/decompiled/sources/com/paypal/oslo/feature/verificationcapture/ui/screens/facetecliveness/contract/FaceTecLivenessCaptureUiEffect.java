package com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "StartFaceTecSession", "NavigateToLivenessReview", "NavigateBackWithSuccess", "NavigateBackWithCancelled", "NavigateBackWithTimeout", "NavigateBackWithError", "ShowError", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$NavigateBackWithCancelled;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$NavigateBackWithError;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$NavigateBackWithSuccess;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$NavigateBackWithTimeout;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$NavigateToLivenessReview;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$ShowError;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$StartFaceTecSession;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class FaceTecLivenessCaptureUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private FaceTecLivenessCaptureUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$StartFaceTecSession;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StartFaceTecSession extends com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.StartFaceTecSession INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.StartFaceTecSession();

        public final int hashCode() {
            return -1840774879;
        }

        private StartFaceTecSession() {
            super("FaceTecLivenessCaptureUiEffect.StartFaceTecSession", null);
        }

        public final java.lang.String toString() {
            return "StartFaceTecSession";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.StartFaceTecSession)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$NavigateToLivenessReview;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect;", "", "sessionId", "faceScanData", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$NavigateToLivenessReview;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSessionId", "getFaceScanData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToLivenessReview extends com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect {
        public static final int $stable = 0;
        private final java.lang.String faceScanData;
        private final java.lang.String sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToLivenessReview(java.lang.String str, java.lang.String str2) {
            super("FaceTecLivenessCaptureUiEffect.NavigateToLivenessReview", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.sessionId = str;
            this.faceScanData = str2;
        }

        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        public final java.lang.String getFaceScanData() {
            return this.faceScanData;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.sessionId;
            java.lang.String str2 = this.faceScanData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToLivenessReview(sessionId=");
            sb.append(str);
            sb.append(", faceScanData=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.sessionId.hashCode() * 31) + this.faceScanData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateToLivenessReview)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateToLivenessReview navigateToLivenessReview = (com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateToLivenessReview) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, navigateToLivenessReview.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.faceScanData, navigateToLivenessReview.faceScanData);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateToLivenessReview copy(java.lang.String sessionId, java.lang.String faceScanData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faceScanData, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateToLivenessReview(sessionId, faceScanData);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFaceScanData() {
            return this.faceScanData;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateToLivenessReview copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateToLivenessReview navigateToLivenessReview, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToLivenessReview.sessionId;
            }
            if ((i & 2) != 0) {
                str2 = navigateToLivenessReview.faceScanData;
            }
            return navigateToLivenessReview.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$NavigateBackWithSuccess;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect;", "", "sessionId", "faceScanData", "", "auditTrailImages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$NavigateBackWithSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSessionId", "getFaceScanData", "Ljava/util/List;", "getAuditTrailImages"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithSuccess extends com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> auditTrailImages;
        private final java.lang.String faceScanData;
        private final java.lang.String sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateBackWithSuccess(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list) {
            super("FaceTecLivenessCaptureUiEffect.NavigateBackWithSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.sessionId = str;
            this.faceScanData = str2;
            this.auditTrailImages = list;
        }

        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        public final java.lang.String getFaceScanData() {
            return this.faceScanData;
        }

        public /* synthetic */ NavigateBackWithSuccess(java.lang.String str, java.lang.String str2, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<java.lang.String> getAuditTrailImages() {
            return this.auditTrailImages;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.sessionId;
            java.lang.String str2 = this.faceScanData;
            java.util.List<java.lang.String> list = this.auditTrailImages;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBackWithSuccess(sessionId=");
            sb.append(str);
            sb.append(", faceScanData=");
            sb.append(str2);
            sb.append(", auditTrailImages=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.sessionId.hashCode() * 31) + this.faceScanData.hashCode()) * 31) + this.auditTrailImages.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithSuccess navigateBackWithSuccess = (com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, navigateBackWithSuccess.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.faceScanData, navigateBackWithSuccess.faceScanData) && kotlin.jvm.internal.Intrinsics.areEqual(this.auditTrailImages, navigateBackWithSuccess.auditTrailImages);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithSuccess copy(java.lang.String sessionId, java.lang.String faceScanData, java.util.List<java.lang.String> auditTrailImages) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faceScanData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auditTrailImages, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithSuccess(sessionId, faceScanData, auditTrailImages);
        }

        public final java.util.List<java.lang.String> component3() {
            return this.auditTrailImages;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFaceScanData() {
            return this.faceScanData;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithSuccess copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithSuccess navigateBackWithSuccess, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateBackWithSuccess.sessionId;
            }
            if ((i & 2) != 0) {
                str2 = navigateBackWithSuccess.faceScanData;
            }
            if ((i & 4) != 0) {
                list = navigateBackWithSuccess.auditTrailImages;
            }
            return navigateBackWithSuccess.copy(str, str2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$NavigateBackWithCancelled;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithCancelled extends com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithCancelled INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithCancelled();

        public final int hashCode() {
            return -758860463;
        }

        private NavigateBackWithCancelled() {
            super("FaceTecLivenessCaptureUiEffect.NavigateBackWithCancelled", null);
        }

        public final java.lang.String toString() {
            return "NavigateBackWithCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithCancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$NavigateBackWithTimeout;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect;", "", "durationMs", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$NavigateBackWithTimeout;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getDurationMs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithTimeout extends com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect {
        public static final int $stable = 0;
        private final long durationMs;

        public NavigateBackWithTimeout(long j) {
            super("FaceTecLivenessCaptureUiEffect.NavigateBackWithTimeout", null);
            this.durationMs = j;
        }

        public /* synthetic */ NavigateBackWithTimeout(long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j);
        }

        public final long getDurationMs() {
            return this.durationMs;
        }

        public final java.lang.String toString() {
            long j = this.durationMs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBackWithTimeout(durationMs=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.durationMs);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithTimeout) && this.durationMs == ((com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithTimeout) other).durationMs;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithTimeout copy(long durationMs) {
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithTimeout(durationMs);
        }

        /* renamed from: component1, reason: from getter */
        public final long getDurationMs() {
            return this.durationMs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithTimeout copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithTimeout navigateBackWithTimeout, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = navigateBackWithTimeout.durationMs;
            }
            return navigateBackWithTimeout.copy(j);
        }

        public NavigateBackWithTimeout() {
            this(0L, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$NavigateBackWithError;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect;", "", "errorCode", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$NavigateBackWithError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithError extends com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect {
        public static final int $stable = 0;
        private final java.lang.String errorCode;
        private final java.lang.String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateBackWithError(java.lang.String str, java.lang.String str2) {
            super("FaceTecLivenessCaptureUiEffect.NavigateBackWithError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.errorCode = str;
            this.errorMessage = str2;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            java.lang.String str2 = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBackWithError(errorCode=");
            sb.append(str);
            sb.append(", errorMessage=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorCode.hashCode() * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithError)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithError navigateBackWithError = (com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, navigateBackWithError.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, navigateBackWithError.errorMessage);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithError copy(java.lang.String errorCode, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithError(errorCode, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithError copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithError navigateBackWithError, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateBackWithError.errorCode;
            }
            if ((i & 2) != 0) {
                str2 = navigateBackWithError.errorMessage;
            }
            return navigateBackWithError.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$ShowError;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect$ShowError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowError extends com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowError(java.lang.String str) {
            super("FaceTecLivenessCaptureUiEffect.ShowError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowError(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.ShowError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.ShowError) other).message);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.ShowError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.ShowError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.ShowError copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.ShowError showError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showError.message;
            }
            return showError.copy(str);
        }
    }

    public /* synthetic */ FaceTecLivenessCaptureUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
