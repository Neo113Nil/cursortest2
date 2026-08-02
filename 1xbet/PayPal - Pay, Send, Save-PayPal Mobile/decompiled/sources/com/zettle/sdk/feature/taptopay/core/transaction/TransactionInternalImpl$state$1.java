package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* synthetic */ class TransactionInternalImpl$state$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State state, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State state2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state2, "");
        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.access$onMutate((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl) this.receiver, state, state2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State state, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State state2) {
        getHighSpeedVideoFpsRanges(state, state2);
        return kotlin.Unit.INSTANCE;
    }

    TransactionInternalImpl$state$1(java.lang.Object obj) {
        super(2, obj, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.class, "onMutate", "onMutate(Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;)V", 0);
    }
}
