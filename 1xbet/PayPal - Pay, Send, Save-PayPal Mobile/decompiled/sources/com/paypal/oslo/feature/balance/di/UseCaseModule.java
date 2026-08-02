package com.paypal.oslo.feature.balance.di;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u001eH\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u001aH\u0007¢\u0006\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/balance/di/UseCaseModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;", "repository", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadInitialConfigUseCase;", "provideGetAutoReloadInitialConfigUseCase", "(Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;)Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadInitialConfigUseCase;", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/TurnOffLowBalanceAutoReloadUseCase;", "provideTurnOffLowBalanceAutoReloadUseCase", "(Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;)Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/TurnOffLowBalanceAutoReloadUseCase;", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "formatCurrencyUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadFundingInstrumentUseCase;", "provideGetAutoReloadFundingInstrumentOptionsUseCase", "(Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;)Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadFundingInstrumentUseCase;", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/CreateAutoReloadUseCase;", "provideCreateAutoReloadUseCase", "(Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;)Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/CreateAutoReloadUseCase;", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/UpdateAutoReloadUseCase;", "provideUpdateAutoReloadUseCase", "(Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;)Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/UpdateAutoReloadUseCase;", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/TurnOffScheduledAutoReloadUseCase;", "provideTurnOffScheduledAutoReloadUseCase", "(Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;)Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/TurnOffScheduledAutoReloadUseCase;", "Lcom/paypal/oslo/feature/balance/domain/repository/balance/BalanceRepository;", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetBalanceIdUseCase;", "provideGetBalanceIdUseCase", "(Lcom/paypal/oslo/feature/balance/domain/repository/balance/BalanceRepository;)Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetBalanceIdUseCase;", "Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoTransferRepository;", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/CheckAutoTransferEnabledUseCase;", "provideCheckAutoTransferEnabledUseCase", "(Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoTransferRepository;)Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/CheckAutoTransferEnabledUseCase;", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/TurnOffAutoTransferUseCase;", "provideTurnOffAutoTransferUseCase", "(Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoTransferRepository;)Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/TurnOffAutoTransferUseCase;", "Lcom/paypal/oslo/feature/balance/domain/usecase/onholddetails/GetTaxHoldPolicyUseCase;", "provideGetTaxHoldPolicyUseCase", "(Lcom/paypal/oslo/feature/balance/domain/repository/balance/BalanceRepository;)Lcom/paypal/oslo/feature/balance/domain/usecase/onholddetails/GetTaxHoldPolicyUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public final class UseCaseModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.balance.di.UseCaseModule INSTANCE = new com.paypal.oslo.feature.balance.di.UseCaseModule();

    private UseCaseModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase provideGetAutoReloadInitialConfigUseCase(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository repository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repository, "");
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadInitialConfigUseCaseImpl(repository);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffLowBalanceAutoReloadUseCase provideTurnOffLowBalanceAutoReloadUseCase(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository repository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repository, "");
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffLowBalanceAutoReloadUseCaseImpl(repository);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadFundingInstrumentUseCase provideGetAutoReloadFundingInstrumentOptionsUseCase(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository repository, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatCurrencyUseCase, "");
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl(repository, formatCurrencyUseCase);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.balance.domain.usecase.autoreload.CreateAutoReloadUseCase provideCreateAutoReloadUseCase(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository repository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repository, "");
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.CreateAutoReloadUseCaseImpl(repository);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.balance.domain.usecase.autoreload.UpdateAutoReloadUseCase provideUpdateAutoReloadUseCase(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository repository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repository, "");
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.UpdateAutoReloadUseCaseImpl(repository);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffScheduledAutoReloadUseCase provideTurnOffScheduledAutoReloadUseCase(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository repository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repository, "");
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffScheduledAutoReloadUseCaseImpl(repository);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetBalanceIdUseCase provideGetBalanceIdUseCase(com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository repository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repository, "");
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.GetBalanceIdUseCaseImpl(repository);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.balance.domain.usecase.autoreload.CheckAutoTransferEnabledUseCase provideCheckAutoTransferEnabledUseCase(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository repository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repository, "");
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.CheckAutoTransferEnabledUseCaseImpl(repository);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffAutoTransferUseCase provideTurnOffAutoTransferUseCase(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository repository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repository, "");
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffAutoTransferUseCaseImpl(repository);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase provideGetTaxHoldPolicyUseCase(com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository repository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repository, "");
        return new com.paypal.oslo.feature.balance.data.usecase.onholddetails.GetTaxHoldPolicyUseCaseImpl(repository);
    }
}
