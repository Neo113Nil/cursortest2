package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement;

/* loaded from: classes14.dex */
public final class StatementDetailsResponseMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsResponseMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsMapper> getHighResolutionOutputSizeshNQ4ISI;

    private StatementDetailsResponseMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsMapper> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsResponseMapper get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsResponseMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsMapper> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsResponseMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsResponseMapper newInstance(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsMapper statementDetailsMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsResponseMapper(statementDetailsMapper);
    }
}
