package com.zettle.sdk.extensions;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/Flow;", "Lcom/zettle/sdk/headless/readers/PairedReaders;", "", "Lcom/zettle/sdk/headless/readers/PairedReader;", "filterByLowBattery", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SDKApiExtKt {
    public static final kotlinx.coroutines.flow.Flow<java.util.List<com.zettle.sdk.headless.readers.PairedReader>> filterByLowBattery(final kotlinx.coroutines.flow.Flow<com.zettle.sdk.headless.readers.PairedReaders> flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        final int i = 30;
        return (kotlinx.coroutines.flow.Flow) new kotlinx.coroutines.flow.Flow<java.util.List<? extends com.zettle.sdk.headless.readers.PairedReader>>() { // from class: com.zettle.sdk.extensions.SDKApiExtKt$filterByLowBattery$$inlined$map$1

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.zettle.sdk.extensions.SDKApiExtKt$filterByLowBattery$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ int $getHighSpeedVideoFpsRanges;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $getHighSpeedVideoSizes;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.zettle.sdk.extensions.SDKApiExtKt$filterByLowBattery$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.zettle.sdk.extensions.SDKApiExtKt$filterByLowBattery$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.zettle.sdk.extensions.SDKApiExtKt$filterByLowBattery$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizes;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$getHighSpeedVideoSizes;
                                java.util.Set<com.zettle.sdk.headless.readers.PairedReader> readers = ((com.zettle.sdk.headless.readers.PairedReaders) obj).getReaders();
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                for (T t : readers) {
                                    com.zettle.sdk.headless.readers.PairedReader pairedReader = (com.zettle.sdk.headless.readers.PairedReader) t;
                                    if (pairedReader.getBattery() != null && pairedReader.getBattery().getLevel() <= this.$getHighSpeedVideoFpsRanges) {
                                        arrayList.add(t);
                                    }
                                }
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.zettle.sdk.extensions.SDKApiExtKt$filterByLowBattery$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.extensions.SDKApiExtKt$filterByLowBattery$$inlined$map$1$2", f = "SDKApiExt.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.zettle.sdk.extensions.SDKApiExtKt$filterByLowBattery$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int getHighResolutionOutputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoSizes = obj;
                        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.zettle.sdk.extensions.SDKApiExtKt$filterByLowBattery$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, int i) {
                    this.$getHighSpeedVideoSizes = flowCollector;
                    this.$getHighSpeedVideoFpsRanges = i;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.zettle.sdk.headless.readers.PairedReader>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.zettle.sdk.extensions.SDKApiExtKt$filterByLowBattery$$inlined$map$1.AnonymousClass2(flowCollector, i), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }
}
