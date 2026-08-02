package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H¦@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/ReaderSettings;", "", "", "Lcom/zettle/sdk/headless/readers/ConnectionType;", "connectionTypes", "Lcom/zettle/sdk/headless/readers/DiscoverySession;", "discoverReaders", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zettle/sdk/headless/readers/PairedReader;", "reader", "", "forget", "(Lcom/zettle/sdk/headless/readers/PairedReader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zettle/sdk/headless/readers/DiscoveredReader;", "Lcom/zettle/sdk/headless/readers/PairingSession;", "pair", "(Lcom/zettle/sdk/headless/readers/DiscoveredReader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zettle/sdk/headless/readers/PairedReaders;", "pairedReaders", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ReaderSettings {
    java.lang.Object discoverReaders(java.util.Set<? extends com.zettle.sdk.headless.readers.ConnectionType> set, kotlin.coroutines.Continuation<? super com.zettle.sdk.headless.readers.DiscoverySession> continuation);

    java.lang.Object forget(com.zettle.sdk.headless.readers.PairedReader pairedReader, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object pair(com.zettle.sdk.headless.readers.DiscoveredReader discoveredReader, kotlin.coroutines.Continuation<? super com.zettle.sdk.headless.readers.PairingSession> continuation);

    java.lang.Object pairedReaders(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.zettle.sdk.headless.readers.PairedReaders>> continuation);
}
