package com.paypal.oslo.feature.bnplacquisition.domain.model.common;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DocumentLink;", "", "getLinkString", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DocumentLink;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DocumentLinkKt {
    public static final java.lang.String getLinkString(com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentLink, "");
        int i = com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLinkKt.WhenMappings.$EnumSwitchMapping$0[documentLink.getType().ordinal()];
        if (i == 1) {
            return documentLink.getRelativePath();
        }
        if (i != 2) {
            return i != 3 ? "" : documentLink.getFileName();
        }
        return documentLink.getStaticUrl();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.RELATIVE_PATH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.STATIC_HTML.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.STATIC_PDF.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
