package com.paypal.oslo.core.i18n.domain.strategy;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/strategy/RelativeTimeFormattingStrategy;", "", "Lcom/paypal/oslo/core/i18n/domain/model/DurationUnit;", "unit", "", "canHandle", "(Lcom/paypal/oslo/core/i18n/domain/model/DurationUnit;)Z", "Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeFormattingRequest;", "request", "", "format", "(Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeFormattingRequest;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface RelativeTimeFormattingStrategy {
    boolean canHandle(com.paypal.oslo.core.i18n.domain.model.DurationUnit unit);

    java.lang.String format(com.paypal.oslo.core.i18n.domain.model.RelativeTimeFormattingRequest request);
}
