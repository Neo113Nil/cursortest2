package com.paypal.oslo.feature.balance.domain.model.autoreload;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;", "Lcom/paypal/oslo/feature/balance/domain/model/AutoReloadInfo;", "toAutoReloadInfo", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;)Lcom/paypal/oslo/feature/balance/domain/model/AutoReloadInfo;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoReloadConfigMapperKt {
    public static final com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo toAutoReloadInfo(com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig) {
        java.time.ZonedDateTime parse;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadConfig, "");
        boolean z = autoReloadConfig.getLowBalance().isEnabled() || autoReloadConfig.getScheduled().isEnabled();
        com.paypal.oslo.feature.balance.domain.model.Money reloadAmount = autoReloadConfig.getScheduled().getReloadAmount();
        com.paypal.oslo.feature.balance.domain.model.Money reloadThreshold = autoReloadConfig.getLowBalance().getReloadThreshold();
        java.lang.String startDate = autoReloadConfig.getScheduled().getStartDate();
        if (startDate != null) {
            try {
                parse = java.time.ZonedDateTime.parse(startDate, java.time.format.DateTimeFormatter.ISO_DATE_TIME);
            } catch (java.time.format.DateTimeParseException unused) {
            }
            return new com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo(z, true, parse, reloadAmount, reloadThreshold);
        }
        parse = null;
        return new com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo(z, true, parse, reloadAmount, reloadThreshold);
    }
}
