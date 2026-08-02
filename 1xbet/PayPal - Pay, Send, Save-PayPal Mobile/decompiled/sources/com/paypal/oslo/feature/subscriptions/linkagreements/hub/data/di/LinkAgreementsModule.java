package com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.di;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/data/di/LinkAgreementsModule;", "", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/data/repository/LinkAgreementsRepositoryImpl;", "linkAgreementsRepositoryImpl", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/repository/LinkAgreementsRepository;", "bindLinkAgreementsRepository", "(Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/data/repository/LinkAgreementsRepositoryImpl;)Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/repository/LinkAgreementsRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public interface LinkAgreementsModule {
    @dagger.Binds
    com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.repository.LinkAgreementsRepository bindLinkAgreementsRepository(com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl linkAgreementsRepositoryImpl);
}
