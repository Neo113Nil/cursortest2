package com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b%\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b&\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/screen/ProcessingStateData;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "documentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "documentSide", "", "showFlash", "showSuccessFrame", "showCheckmark", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;ZZZ)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "component2", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "component3", "()Z", "component4", "component5", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;ZZZ)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/screen/ProcessingStateData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "getDocumentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "getDocumentSide", "Z", "getShowFlash", "getShowSuccessFrame", "getShowCheckmark"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ProcessingStateData {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide;
    private final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType;
    private final boolean showCheckmark;
    private final boolean showFlash;
    private final boolean showSuccessFrame;

    public ProcessingStateData(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
        this.documentType = documentType;
        this.documentSide = documentSide;
        this.showFlash = z;
        this.showSuccessFrame = z2;
        this.showCheckmark = z3;
    }

    public /* synthetic */ ProcessingStateData(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(documentType, documentSide, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType getDocumentType() {
        return this.documentType;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide getDocumentSide() {
        return this.documentSide;
    }

    public final boolean getShowFlash() {
        return this.showFlash;
    }

    public final boolean getShowSuccessFrame() {
        return this.showSuccessFrame;
    }

    public final boolean getShowCheckmark() {
        return this.showCheckmark;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType = this.documentType;
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide = this.documentSide;
        boolean z = this.showFlash;
        boolean z2 = this.showSuccessFrame;
        boolean z3 = this.showCheckmark;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProcessingStateData(documentType=");
        sb.append(documentType);
        sb.append(", documentSide=");
        sb.append(documentSide);
        sb.append(", showFlash=");
        sb.append(z);
        sb.append(", showSuccessFrame=");
        sb.append(z2);
        sb.append(", showCheckmark=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.documentType.hashCode() * 31) + this.documentSide.hashCode()) * 31) + java.lang.Boolean.hashCode(this.showFlash)) * 31) + java.lang.Boolean.hashCode(this.showSuccessFrame)) * 31) + java.lang.Boolean.hashCode(this.showCheckmark);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.ProcessingStateData)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.ProcessingStateData processingStateData = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.ProcessingStateData) other;
        return this.documentType == processingStateData.documentType && this.documentSide == processingStateData.documentSide && this.showFlash == processingStateData.showFlash && this.showSuccessFrame == processingStateData.showSuccessFrame && this.showCheckmark == processingStateData.showCheckmark;
    }

    public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.ProcessingStateData copy(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, boolean showFlash, boolean showSuccessFrame, boolean showCheckmark) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.ProcessingStateData(documentType, documentSide, showFlash, showSuccessFrame, showCheckmark);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowCheckmark() {
        return this.showCheckmark;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowSuccessFrame() {
        return this.showSuccessFrame;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowFlash() {
        return this.showFlash;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide getDocumentSide() {
        return this.documentSide;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType getDocumentType() {
        return this.documentType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.ProcessingStateData copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.ProcessingStateData processingStateData, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            documentType = processingStateData.documentType;
        }
        if ((i & 2) != 0) {
            documentSide = processingStateData.documentSide;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide2 = documentSide;
        if ((i & 4) != 0) {
            z = processingStateData.showFlash;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = processingStateData.showSuccessFrame;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = processingStateData.showCheckmark;
        }
        return processingStateData.copy(documentType, documentSide2, z4, z5, z3);
    }
}
