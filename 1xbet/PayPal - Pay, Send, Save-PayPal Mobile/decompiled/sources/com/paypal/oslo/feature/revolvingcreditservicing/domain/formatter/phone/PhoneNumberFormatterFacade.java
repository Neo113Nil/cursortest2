package com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/phone/PhoneNumberFormatterFacade;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;", "phone", "", "shouldObscure", "Lcom/paypal/oslo/core/i18n/domain/model/Style;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "", "format", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;ZLcom/paypal/oslo/core/i18n/domain/model/Style;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface PhoneNumberFormatterFacade {
    java.lang.String format(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phone, boolean shouldObscure, com.paypal.oslo.core.i18n.domain.model.Style style);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.String format$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade phoneNumberFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber, boolean z, com.paypal.oslo.core.i18n.domain.model.Style style, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: format");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            style = com.paypal.oslo.core.i18n.domain.model.Style.NATIONAL;
        }
        return phoneNumberFormatterFacade.format(phoneNumber, z, style);
    }
}
