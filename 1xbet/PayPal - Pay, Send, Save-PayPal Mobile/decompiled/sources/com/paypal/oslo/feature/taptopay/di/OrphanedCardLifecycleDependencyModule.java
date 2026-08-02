package com.paypal.oslo.feature.taptopay.di;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/di/OrphanedCardLifecycleDependencyModule;", "", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OrphanedCardLifecycleDependency;", "bindOrphanedCardLifecycleDependencies", "()Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public interface OrphanedCardLifecycleDependencyModule {
    @dagger.multibindings.Multibinds
    java.util.Set<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OrphanedCardLifecycleDependency> bindOrphanedCardLifecycleDependencies();
}
