package com.paypal.oslo.core.network.graphql.error;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor", f = "ApolloQueryExecutor.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {58}, m = "execute", n = {androidx.core.app.NotificationCompat.CATEGORY_CALL, "raise$iv$iv$iv", "$this$execute_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-ApolloQueryExecutor$execute$2", "$i$f$catch", "$i$a$-catch-ApolloQueryExecutor$execute$2$1"}, nl = {59}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5"}, v = 2)
/* loaded from: classes4.dex */
final class ApolloQueryExecutor$execute$1<T extends com.apollographql.apollo.api.Operation.Data> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizes;
    int getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDurationlomOqCM.execute(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApolloQueryExecutor$execute$1(com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor apolloQueryExecutor, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor$execute$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = apolloQueryExecutor;
    }
}
