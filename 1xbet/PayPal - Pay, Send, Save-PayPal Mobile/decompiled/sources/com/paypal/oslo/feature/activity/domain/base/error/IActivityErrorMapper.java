package com.paypal.oslo.feature.activity.domain.base.error;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;", "mapToDomainError", "(Ljava/lang/Exception;)Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface IActivityErrorMapper {
    com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError mapToDomainError(java.lang.Exception exception);
}
