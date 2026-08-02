package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/CreditApplicationDocument;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsSheetUiModel;", "toDocumentsSheetUiModel", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsSheetUiModel;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DocumentsUiModelKt {
    public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel toDocumentsSheetUiModel(java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument> list) {
        java.lang.String joinToString$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument creditApplicationDocument : list) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink downloadLink = creditApplicationDocument.getDownloadLink();
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentItemUiModel documentItemUiModel = null;
            if (downloadLink != null) {
                java.lang.String obj = kotlin.text.StringsKt.trim(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.substringBeforeLast$default(downloadLink.getFileName(), ".", (java.lang.String) null, 2, (java.lang.Object) null), "-", " ", false, 4, (java.lang.Object) null), "_", " ", false, 4, (java.lang.Object) null)).toString();
                if (obj.length() == 0) {
                    joinToString$default = "";
                } else {
                    java.util.List<java.lang.String> split = new kotlin.text.Regex("\\s+").split(obj, 0);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : split) {
                        if (((java.lang.String) obj2).length() > 0) {
                            arrayList2.add(obj2);
                        }
                    }
                    joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(arrayList2, " ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsUiModelKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsUiModelKt.$r8$lambda$M0iezQj_yv4L98Agg9arFvvzn_4((java.lang.String) obj3);
                        }
                    }, 30, null);
                }
                if (joinToString$default.length() != 0) {
                    documentItemUiModel = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentItemUiModel(joinToString$default, creditApplicationDocument.getType(), downloadLink);
                }
            }
            if (documentItemUiModel != null) {
                arrayList.add(documentItemUiModel);
            }
        }
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel(arrayList);
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$M0iezQj_yv4L98Agg9arFvvzn_4(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            char upperCase = java.lang.Character.toUpperCase(str.charAt(0));
            java.lang.String substring = str.substring(1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(upperCase);
            sb.append(substring);
            str = sb.toString();
        }
        return str;
    }
}
