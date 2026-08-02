package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@¢\u0006\u0004\b\u0006\u0010\bJ\u0010\u0010\u0004\u001a\u00020\tH¦@¢\u0006\u0004\b\u0004\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/ReadStore;", "T", "", "", "clear", "", "read", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ""}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ReadStore<T> {
    java.lang.Object clear(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object read(kotlin.coroutines.Continuation<? super java.util.Set<? extends T>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <T> java.lang.Object read(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore<T> readStore, boolean z, kotlin.coroutines.Continuation<? super java.util.Set<? extends T>> continuation) {
            return com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore.super.read(z, continuation);
        }
    }

    static /* synthetic */ java.lang.Object read$default(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore readStore, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: read");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return readStore.read(z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r7 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <T> java.lang.Object read$suspendImpl(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore<T> readStore, boolean z, kotlin.coroutines.Continuation<? super java.util.Set<? extends T>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore$read$1 readStore$read$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore$read$1) {
            readStore$read$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore$read$1) continuation;
            if ((readStore$read$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                readStore$read$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = readStore$read$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = readStore$read$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    readStore$read$1.getHighResolutionOutputSizeshNQ4ISI = readStore;
                    readStore$read$1.getHighSpeedVideoFpsRangesFor = z;
                    readStore$read$1.getInputSizeshNQ4ISI = 1;
                    obj = readStore.read(readStore$read$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = readStore$read$1.getHighSpeedVideoSizes;
                        boolean z2 = readStore$read$1.getHighSpeedVideoFpsRangesFor;
                        java.lang.Object obj2 = readStore$read$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj2;
                    }
                    z = readStore$read$1.getHighSpeedVideoFpsRangesFor;
                    readStore = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore) readStore$read$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.Set set = (java.util.Set) obj;
                if (z) {
                    readStore$read$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(readStore);
                    readStore$read$1.Camera2StreamConfigurationMap = obj;
                    readStore$read$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(set);
                    readStore$read$1.getHighSpeedVideoFpsRangesFor = z;
                    readStore$read$1.getHighSpeedVideoSizes = 0;
                    readStore$read$1.getInputSizeshNQ4ISI = 2;
                    if (readStore.clear(readStore$read$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return obj;
            }
        }
        readStore$read$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore$read$1(readStore, continuation);
        java.lang.Object obj3 = readStore$read$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = readStore$read$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        java.util.Set set2 = (java.util.Set) obj3;
        if (z) {
        }
        return obj3;
    }

    default java.lang.Object read(boolean z, kotlin.coroutines.Continuation<? super java.util.Set<? extends T>> continuation) {
        return read$suspendImpl(this, z, continuation);
    }
}
