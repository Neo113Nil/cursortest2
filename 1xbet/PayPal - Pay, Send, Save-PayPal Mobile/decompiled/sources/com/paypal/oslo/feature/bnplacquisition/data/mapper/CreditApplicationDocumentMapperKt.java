package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/CreditApplicationDocument;", "toDocument", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/CreditApplicationDocument;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CreditApplicationDocumentMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument toDocument(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment bnplAcquisitionDocumentFragment) {
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionDocumentFragment, "");
        com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType from = com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.INSTANCE.from(bnplAcquisitionDocumentFragment.getType().name());
        java.lang.Object html = bnplAcquisitionDocumentFragment.getHtml();
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink2 = null;
        java.lang.String str = html instanceof java.lang.String ? (java.lang.String) html : null;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment.DownloadLink downloadLink = bnplAcquisitionDocumentFragment.getDownloadLink();
        if (downloadLink != null) {
            java.lang.String fileName = downloadLink.getFileName();
            java.lang.String relativePath = downloadLink.getRelativePath();
            java.lang.Object staticUrl = downloadLink.getStaticUrl();
            documentLink = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink(fileName, relativePath, staticUrl instanceof java.lang.String ? (java.lang.String) staticUrl : null, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.INSTANCE.from(downloadLink.getType().name()));
        } else {
            documentLink = null;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment.ViewLink viewLink = bnplAcquisitionDocumentFragment.getViewLink();
        if (viewLink != null) {
            java.lang.String fileName2 = viewLink.getFileName();
            java.lang.String relativePath2 = viewLink.getRelativePath();
            java.lang.Object staticUrl2 = viewLink.getStaticUrl();
            documentLink2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink(fileName2, relativePath2, staticUrl2 instanceof java.lang.String ? (java.lang.String) staticUrl2 : null, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.INSTANCE.from(viewLink.getType().name()));
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument(from, str, documentLink, documentLink2);
    }
}
