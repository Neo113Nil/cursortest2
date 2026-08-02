package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/ReaderSettingsImpl;", "Lcom/zettle/sdk/ReaderSettings;", "Lcom/zettle/sdk/headless/HeadlessActionRegistry;", "registry", "<init>", "(Lcom/zettle/sdk/headless/HeadlessActionRegistry;)V", "", "Lcom/zettle/sdk/headless/readers/ConnectionType;", "connectionTypes", "Lcom/zettle/sdk/headless/readers/DiscoverySession;", "discoverReaders", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zettle/sdk/headless/readers/PairedReader;", "reader", "", "forget", "(Lcom/zettle/sdk/headless/readers/PairedReader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zettle/sdk/headless/readers/DiscoveredReader;", "Lcom/zettle/sdk/headless/readers/PairingSession;", "pair", "(Lcom/zettle/sdk/headless/readers/DiscoveredReader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zettle/sdk/headless/readers/PairedReaders;", "pairedReaders", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/headless/HeadlessActionRegistry;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ReaderSettingsImpl implements com.zettle.sdk.ReaderSettings {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.headless.HeadlessActionRegistry getHighResolutionOutputSizeshNQ4ISI;

    public ReaderSettingsImpl(com.zettle.sdk.headless.HeadlessActionRegistry headlessActionRegistry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headlessActionRegistry, "");
        this.getHighResolutionOutputSizeshNQ4ISI = headlessActionRegistry;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.zettle.sdk.ReaderSettings
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object discoverReaders(java.util.Set<? extends com.zettle.sdk.headless.readers.ConnectionType> set, kotlin.coroutines.Continuation<? super com.zettle.sdk.headless.readers.DiscoverySession> continuation) {
        com.zettle.sdk.ReaderSettingsImpl$discoverReaders$1 readerSettingsImpl$discoverReaders$1;
        int i;
        if (continuation instanceof com.zettle.sdk.ReaderSettingsImpl$discoverReaders$1) {
            readerSettingsImpl$discoverReaders$1 = (com.zettle.sdk.ReaderSettingsImpl$discoverReaders$1) continuation;
            if ((readerSettingsImpl$discoverReaders$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                readerSettingsImpl$discoverReaders$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = readerSettingsImpl$discoverReaders$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = readerSettingsImpl$discoverReaders$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.headless.HeadlessActionRegistry headlessActionRegistry = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.zettle.sdk.headless.HeadlessAction.Readers.Discover discover = new com.zettle.sdk.headless.HeadlessAction.Readers.Discover(set);
                    readerSettingsImpl$discoverReaders$1.getHighSpeedVideoFpsRanges = 1;
                    obj = headlessActionRegistry.execute(discover, readerSettingsImpl$discoverReaders$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((com.zettle.sdk.headless.HeadlessResult) obj).handleErrors$core_publicRelease();
            }
        }
        readerSettingsImpl$discoverReaders$1 = new com.zettle.sdk.ReaderSettingsImpl$discoverReaders$1(this, continuation);
        java.lang.Object obj2 = readerSettingsImpl$discoverReaders$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = readerSettingsImpl$discoverReaders$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return ((com.zettle.sdk.headless.HeadlessResult) obj2).handleErrors$core_publicRelease();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.zettle.sdk.ReaderSettings
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object pair(com.zettle.sdk.headless.readers.DiscoveredReader discoveredReader, kotlin.coroutines.Continuation<? super com.zettle.sdk.headless.readers.PairingSession> continuation) {
        com.zettle.sdk.ReaderSettingsImpl$pair$1 readerSettingsImpl$pair$1;
        int i;
        if (continuation instanceof com.zettle.sdk.ReaderSettingsImpl$pair$1) {
            readerSettingsImpl$pair$1 = (com.zettle.sdk.ReaderSettingsImpl$pair$1) continuation;
            if ((readerSettingsImpl$pair$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                readerSettingsImpl$pair$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = readerSettingsImpl$pair$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = readerSettingsImpl$pair$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.headless.HeadlessActionRegistry headlessActionRegistry = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.zettle.sdk.headless.HeadlessAction.Readers.Pair pair = new com.zettle.sdk.headless.HeadlessAction.Readers.Pair(discoveredReader);
                    readerSettingsImpl$pair$1.getHighSpeedVideoSizes = 1;
                    obj = headlessActionRegistry.execute(pair, readerSettingsImpl$pair$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((com.zettle.sdk.headless.HeadlessResult) obj).handleErrors$core_publicRelease();
            }
        }
        readerSettingsImpl$pair$1 = new com.zettle.sdk.ReaderSettingsImpl$pair$1(this, continuation);
        java.lang.Object obj2 = readerSettingsImpl$pair$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = readerSettingsImpl$pair$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return ((com.zettle.sdk.headless.HeadlessResult) obj2).handleErrors$core_publicRelease();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.zettle.sdk.ReaderSettings
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object forget(com.zettle.sdk.headless.readers.PairedReader pairedReader, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.zettle.sdk.ReaderSettingsImpl$forget$1 readerSettingsImpl$forget$1;
        int i;
        if (continuation instanceof com.zettle.sdk.ReaderSettingsImpl$forget$1) {
            readerSettingsImpl$forget$1 = (com.zettle.sdk.ReaderSettingsImpl$forget$1) continuation;
            if ((readerSettingsImpl$forget$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                readerSettingsImpl$forget$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = readerSettingsImpl$forget$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = readerSettingsImpl$forget$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.headless.HeadlessActionRegistry headlessActionRegistry = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.zettle.sdk.headless.HeadlessAction.Readers.Forget forget = new com.zettle.sdk.headless.HeadlessAction.Readers.Forget(pairedReader);
                    readerSettingsImpl$forget$1.getHighSpeedVideoFpsRanges = 1;
                    obj = headlessActionRegistry.execute(forget, readerSettingsImpl$forget$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ((com.zettle.sdk.headless.HeadlessResult) obj).handleErrors$core_publicRelease();
                return kotlin.Unit.INSTANCE;
            }
        }
        readerSettingsImpl$forget$1 = new com.zettle.sdk.ReaderSettingsImpl$forget$1(this, continuation);
        java.lang.Object obj2 = readerSettingsImpl$forget$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = readerSettingsImpl$forget$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ((com.zettle.sdk.headless.HeadlessResult) obj2).handleErrors$core_publicRelease();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.zettle.sdk.ReaderSettings
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object pairedReaders(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.zettle.sdk.headless.readers.PairedReaders>> continuation) {
        com.zettle.sdk.ReaderSettingsImpl$pairedReaders$1 readerSettingsImpl$pairedReaders$1;
        int i;
        if (continuation instanceof com.zettle.sdk.ReaderSettingsImpl$pairedReaders$1) {
            readerSettingsImpl$pairedReaders$1 = (com.zettle.sdk.ReaderSettingsImpl$pairedReaders$1) continuation;
            if ((readerSettingsImpl$pairedReaders$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                readerSettingsImpl$pairedReaders$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = readerSettingsImpl$pairedReaders$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = readerSettingsImpl$pairedReaders$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.headless.HeadlessActionRegistry headlessActionRegistry = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.zettle.sdk.headless.HeadlessAction.Readers.PairedReaders pairedReaders = com.zettle.sdk.headless.HeadlessAction.Readers.PairedReaders.INSTANCE;
                    readerSettingsImpl$pairedReaders$1.Camera2StreamConfigurationMap = 1;
                    obj = headlessActionRegistry.execute(pairedReaders, readerSettingsImpl$pairedReaders$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((com.zettle.sdk.headless.HeadlessResult) obj).handleErrors$core_publicRelease();
            }
        }
        readerSettingsImpl$pairedReaders$1 = new com.zettle.sdk.ReaderSettingsImpl$pairedReaders$1(this, continuation);
        java.lang.Object obj2 = readerSettingsImpl$pairedReaders$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = readerSettingsImpl$pairedReaders$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return ((com.zettle.sdk.headless.HeadlessResult) obj2).handleErrors$core_publicRelease();
    }
}
