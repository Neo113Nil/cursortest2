package com.paypal.oslo.feature.settings.domain.repository;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0007H&¢\u0006\u0004\b\u0019\u0010\u000bJ\u0017\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0007H&¢\u0006\u0004\b\u001a\u0010\u000bJ\u0017\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0007H&¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0007H&¢\u0006\u0004\b\u001c\u0010\u000bJ\u0017\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0007H&¢\u0006\u0004\b\u001d\u0010\u000bJ\u0017\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0007H&¢\u0006\u0004\b\u001e\u0010\u000bJ\u0017\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0007H&¢\u0006\u0004\b\u001f\u0010\u000bJ\u0012\u0010!\u001a\u0004\u0018\u00010 H¦@¢\u0006\u0004\b!\u0010\u0006J\u001b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 0\bH&¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 0\bH&¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010 H¦@¢\u0006\u0004\b%\u0010\u0006J\u0010\u0010&\u001a\u00020 H¦@¢\u0006\u0004\b&\u0010\u0006J\u0010\u0010'\u001a\u00020 H¦@¢\u0006\u0004\b'\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/repository/ISettingsRepository;", "", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsResult;", "getSettingsResult", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/settings/domain/model/AccountSettingsData;", "getAccountSettingsFromUserState", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/settings/domain/model/DataAndPrivacySettingsData;", "getDataAndPrivacySettings", "()Lcom/paypal/oslo/feature/settings/domain/model/DataAndPrivacySettingsData;", "Lcom/paypal/oslo/feature/settings/domain/model/HelpAndSupportSettingsData;", "getHelpAndSupportSettings", "()Lcom/paypal/oslo/feature/settings/domain/model/HelpAndSupportSettingsData;", "Lcom/paypal/oslo/feature/settings/domain/model/NotificationPreferencesSettingsData;", "getNotificationPreferencesSettings", "()Lcom/paypal/oslo/feature/settings/domain/model/NotificationPreferencesSettingsData;", "Lcom/paypal/oslo/feature/settings/domain/model/PaymentPreferencesSettingsData;", "getPaymentPreferencesSettingsData", "()Lcom/paypal/oslo/feature/settings/domain/model/PaymentPreferencesSettingsData;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;", "getIsAutoReloadEnabledBadge", "getIsSmartRouteEnabledBadge", "getAutoSaveStatusBadge", "getCreditCardStatusBadge", "getCashBackCardStatusBadge", "getAccountVisibilityStatusFlow", "getPasskeyStatusFlow", "", "isPayPalBalanceEnabled", "isBiometricEnabled", "()Larrow/core/Either;", "isLLSEnabled", "getAccountDiscoverabilityStatus", "isPrimaryUser", "hasPasskeys"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ISettingsRepository {
    java.lang.Object getAccountDiscoverabilityStatus(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.AccountSettingsData>> getAccountSettingsFromUserState();

    kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> getAccountVisibilityStatusFlow();

    kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> getAutoSaveStatusBadge();

    kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> getCashBackCardStatusBadge();

    kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> getCreditCardStatusBadge();

    com.paypal.oslo.feature.settings.domain.model.DataAndPrivacySettingsData getDataAndPrivacySettings();

    com.paypal.oslo.feature.settings.domain.model.HelpAndSupportSettingsData getHelpAndSupportSettings();

    kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> getIsAutoReloadEnabledBadge();

    kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> getIsSmartRouteEnabledBadge();

    com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData getNotificationPreferencesSettings();

    kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> getPasskeyStatusFlow();

    com.paypal.oslo.feature.settings.domain.model.PaymentPreferencesSettingsData getPaymentPreferencesSettingsData();

    java.lang.Object getSettingsResult(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsResult>> continuation);

    java.lang.Object hasPasskeys(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    arrow.core.Either<com.paypal.oslo.feature.settings.domain.error.SettingsError, java.lang.Boolean> isBiometricEnabled();

    arrow.core.Either<com.paypal.oslo.feature.settings.domain.error.SettingsError, java.lang.Boolean> isLLSEnabled();

    java.lang.Object isPayPalBalanceEnabled(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object isPrimaryUser(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
}
