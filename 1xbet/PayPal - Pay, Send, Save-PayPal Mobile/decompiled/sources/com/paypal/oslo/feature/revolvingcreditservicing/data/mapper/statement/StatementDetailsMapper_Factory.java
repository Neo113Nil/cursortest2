package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement;

/* loaded from: classes14.dex */
public final class StatementDetailsMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.SpecialFinancingMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailSummaryMapper> getHighSpeedVideoFpsRanges;

    private StatementDetailsMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailSummaryMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.SpecialFinancingMapper> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailSummaryMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.SpecialFinancingMapper> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsMapper newInstance(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailSummaryMapper statementDetailSummaryMapper, com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.SpecialFinancingMapper specialFinancingMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsMapper(statementDetailSummaryMapper, specialFinancingMapper);
    }
}
