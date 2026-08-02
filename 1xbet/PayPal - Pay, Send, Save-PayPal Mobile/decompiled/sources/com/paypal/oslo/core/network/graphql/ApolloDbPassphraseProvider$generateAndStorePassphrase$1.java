package com.paypal.oslo.core.network.graphql;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider", f = "ApolloDbPassphraseProvider.kt", i = {0, 0}, l = {59}, m = "generateAndStorePassphrase", n = {"it", "$i$a$-also-ApolloDbPassphraseProvider$generateAndStorePassphrase$2"}, nl = {60}, s = {"L$1", "I$0"}, v = 2)
/* loaded from: classes4.dex */
final class ApolloDbPassphraseProvider$generateAndStorePassphrase$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider.access$generateAndStorePassphrase(this.getOutputFormats, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApolloDbPassphraseProvider$generateAndStorePassphrase$1(com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider apolloDbPassphraseProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider$generateAndStorePassphrase$1> continuation) {
        super(continuation);
        this.getOutputFormats = apolloDbPassphraseProvider;
    }
}
