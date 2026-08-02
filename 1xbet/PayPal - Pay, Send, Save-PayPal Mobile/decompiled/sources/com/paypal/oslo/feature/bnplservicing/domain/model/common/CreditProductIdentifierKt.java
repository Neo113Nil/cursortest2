package com.paypal.oslo.feature.bnplservicing.domain.model.common;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a%\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0001\"\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "", "isAvailableFor", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;[Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CreditProductIdentifierKt {
    public static final boolean isAvailableFor(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier... creditProductIdentifierArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifierArr, "");
        return kotlin.collections.ArraysKt.contains(creditProductIdentifierArr, creditProductIdentifier);
    }
}
