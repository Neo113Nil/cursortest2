package com.paypal.oslo.core.network.graphql;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider$deferredPassphrase$1", f = "ApolloDbPassphraseProvider.kt", i = {}, l = {44, 44}, m = "invokeSuspend", n = {}, nl = {44, -1}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class ApolloDbPassphraseProvider$deferredPassphrase$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super byte[]>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r5 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r5 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider apolloDbPassphraseProvider = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = 1;
            obj = apolloDbPassphraseProvider.getHighSpeedVideoFpsRanges.getByteArray(com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider.PASSPHRASE_KEY, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return (byte[]) obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            return bArr;
        }
        this.getHighSpeedVideoSizes = 2;
        obj = com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider.access$generateAndStorePassphrase(this.getHighSpeedVideoFpsRangesFor, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        return ((com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider$deferredPassphrase$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider$deferredPassphrase$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApolloDbPassphraseProvider$deferredPassphrase$1(com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider apolloDbPassphraseProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider$deferredPassphrase$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = apolloDbPassphraseProvider;
    }
}
