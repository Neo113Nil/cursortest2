package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.util;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005*\f\b\u0002\u0010\u0007\"\u00020\u00062\u00020\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;", "Lcom/paypal/pds/core/Icon;", "fallbackIcon", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/image/CreditAvatarUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;Lcom/paypal/pds/core/Icon;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/image/CreditAvatarUiModel;", "", "PDSIconImageId"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CreditImageToCreditAvatarUiModelMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel toUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage, com.paypal.pds.core.Icon icon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditImage, "");
        if (creditImage.getAssetName() != null && (!kotlin.text.StringsKt.isBlank(r0))) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.util.CreditImageToCreditAvatarUiModelMapper creditImageToCreditAvatarUiModelMapper = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.util.CreditImageToCreditAvatarUiModelMapper.INSTANCE;
            com.paypal.pds.core.Icon icon2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.util.CreditImageToCreditAvatarUiModelMapper.getHighResolutionOutputSizeshNQ4ISI().get(creditImage.getAssetName());
            if (icon2 != null) {
                icon = icon2;
            }
            r1 = icon != null ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.FromIcon(icon) : null;
        } else {
            if (creditImage.getUrl() != null && (!kotlin.text.StringsKt.isBlank(r0))) {
                r1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.FromUrl(creditImage.getUrl(), null, icon, null, 10, null);
            } else if (icon != null) {
                r1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.FromIcon(icon);
            }
        }
        return r1 == null ? com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.Undefined.INSTANCE : r1;
    }
}
