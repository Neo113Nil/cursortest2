package com.paypal.oslo.feature.bnplservicing.ui.document;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;", "", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/DocumentsUiModel;", "document", "", "planId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/DocumentsUiModel;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/DocumentsUiModel;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/DocumentsUiModel;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;)Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/DocumentsUiModel;", "getDocument", "Ljava/lang/String;", "getPlanId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "getCpi", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DocumentsHalfSheetModel {
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier cpi;
    private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentsUiModel document;
    private final java.lang.String planId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel.Companion INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel.Companion(null);
    public static final int $stable = 8;

    public DocumentsHalfSheetModel(com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentsUiModel documentsUiModel, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentsUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        this.document = documentsUiModel;
        this.planId = str;
        this.cpi = creditProductIdentifier;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentsUiModel getDocument() {
        return this.document;
    }

    public final java.lang.String getPlanId() {
        return this.planId;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCpi() {
        return this.cpi;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel$Companion;", "", "<init>", "()V", "", "url", "creditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;", "buildPaymentAuthorizationDocument", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;)Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel buildPaymentAuthorizationDocument(java.lang.String url, java.lang.String creditAccountId, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentsUiModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentData("Payment Authorization", "Payment Authorization", new com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel(null, url, com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type.STATIC_PDF, 1, null), com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type.CONTRACT)), null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), 4, null), creditAccountId, creditProductIdentifier);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentsUiModel documentsUiModel = this.document;
        java.lang.String str = this.planId;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = this.cpi;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DocumentsHalfSheetModel(document=");
        sb.append(documentsUiModel);
        sb.append(", planId=");
        sb.append(str);
        sb.append(", cpi=");
        sb.append(creditProductIdentifier);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.document.hashCode() * 31) + this.planId.hashCode()) * 31) + this.cpi.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel = (com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.document, documentsHalfSheetModel.document) && kotlin.jvm.internal.Intrinsics.areEqual(this.planId, documentsHalfSheetModel.planId) && this.cpi == documentsHalfSheetModel.cpi;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel copy(com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentsUiModel document, java.lang.String planId, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier cpi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(document, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel(document, planId, cpi);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCpi() {
        return this.cpi;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPlanId() {
        return this.planId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentsUiModel getDocument() {
        return this.document;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel, com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentsUiModel documentsUiModel, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            documentsUiModel = documentsHalfSheetModel.document;
        }
        if ((i & 2) != 0) {
            str = documentsHalfSheetModel.planId;
        }
        if ((i & 4) != 0) {
            creditProductIdentifier = documentsHalfSheetModel.cpi;
        }
        return documentsHalfSheetModel.copy(documentsUiModel, str, creditProductIdentifier);
    }
}
