package com.paypal.oslo.core.persistence.appstorage;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AppStorage$getValueFlow$$inlined$map$1<T> implements kotlinx.coroutines.flow.Flow<T> {
    final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.flow.Flow getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorageKey getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.core.persistence.appstorage.AppStorage$getValueFlow$$inlined$map$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorageKey getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

        /* JADX WARN: Multi-variable type inference failed */
        public final java.lang.Object emit$$forInline(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            java.lang.Object obj2;
            java.lang.String str;
            java.lang.String concat;
            java.lang.Object m23436constructorimpl;
            com.paypal.oslo.core.persistence.encryption.EncryptionManager encryptionManager;
            new com.paypal.oslo.core.persistence.appstorage.AppStorage$getValueFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
            kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
            androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) obj;
            if (com.paypal.oslo.core.persistence.appstorage.AppStorage.access$isEncrypted(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor)) {
                com.paypal.oslo.core.persistence.appstorage.KeyMapper keyMapper = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE;
                str = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                concat = com.paypal.oslo.core.persistence.appstorage.AppStorage.ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(this.getHighSpeedVideoFpsRangesFor.getName()));
                java.lang.String str2 = (java.lang.String) preferences.get(keyMapper.stringKey(str, concat));
                obj2 = null;
                if (str2 != null) {
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.Camera2StreamConfigurationMap;
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage3 = appStorage2;
                        encryptionManager = appStorage2.getHighSpeedVideoFpsRangesFor;
                        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(encryptionManager.decryptValue(str2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class)));
                    } catch (java.lang.Throwable th) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    }
                    java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                    if (m23439exceptionOrNullimpl != null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "Failed to decrypt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", this.getHighResolutionOutputSizeshNQ4ISI.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl)), null, 4, null);
                    }
                    if (!kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                        obj2 = m23436constructorimpl;
                    }
                }
            } else {
                obj2 = preferences.get(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            flowCollector.emit(obj2, continuation);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.core.persistence.appstorage.AppStorage$getValueFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
            int i;
            java.lang.Object obj2;
            java.lang.String str;
            java.lang.String concat;
            java.lang.Object m23436constructorimpl;
            com.paypal.oslo.core.persistence.encryption.EncryptionManager encryptionManager;
            if (continuation instanceof com.paypal.oslo.core.persistence.appstorage.AppStorage$getValueFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                anonymousClass1 = (com.paypal.oslo.core.persistence.appstorage.AppStorage$getValueFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                if ((anonymousClass1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.getHighSpeedVideoSizesFor -= 2147483648;
                    java.lang.Object obj3 = anonymousClass1.getInputFormats;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoSizesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj3);
                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                        androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) obj;
                        if (com.paypal.oslo.core.persistence.appstorage.AppStorage.access$isEncrypted(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor)) {
                            com.paypal.oslo.core.persistence.appstorage.KeyMapper keyMapper = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE;
                            str = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                            com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                            concat = com.paypal.oslo.core.persistence.appstorage.AppStorage.ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(this.getHighSpeedVideoFpsRangesFor.getName()));
                            java.lang.String str2 = (java.lang.String) preferences.get(keyMapper.stringKey(str, concat));
                            obj2 = null;
                            if (str2 != null) {
                                com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.Camera2StreamConfigurationMap;
                                try {
                                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage3 = appStorage2;
                                    encryptionManager = appStorage2.getHighSpeedVideoFpsRangesFor;
                                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
                                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(encryptionManager.decryptValue(str2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class)));
                                } catch (java.lang.Throwable th) {
                                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                                }
                                java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                                if (m23439exceptionOrNullimpl != null) {
                                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "Failed to decrypt", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", this.getHighResolutionOutputSizeshNQ4ISI.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl)), null, 4, null);
                                }
                                if (!kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                                    obj2 = m23436constructorimpl;
                                }
                            }
                        } else {
                            obj2 = preferences.get(this.getHighResolutionOutputSizeshNQ4ISI);
                        }
                        anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        anonymousClass1.getHighSpeedVideoSizesFor = 1;
                        if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                        java.lang.Object obj5 = anonymousClass1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj3);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            anonymousClass1 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$getValueFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
            java.lang.Object obj32 = anonymousClass1.getInputFormats;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = anonymousClass1.getHighSpeedVideoSizesFor;
            if (i != 0) {
            }
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage$getValueFlow$$inlined$map$1$2", f = "AppStorage.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
        /* renamed from: com.paypal.oslo.core.persistence.appstorage.AppStorage$getValueFlow$$inlined$map$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            java.lang.Object Camera2StreamConfigurationMap;
            int getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object getHighSpeedVideoFpsRanges;
            java.lang.Object getHighSpeedVideoFpsRangesFor;
            java.lang.Object getHighSpeedVideoSizes;
            int getHighSpeedVideoSizesFor;
            /* synthetic */ java.lang.Object getInputFormats;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.getInputFormats = obj;
                this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
                return com.paypal.oslo.core.persistence.appstorage.AppStorage$getValueFlow$$inlined$map$1.AnonymousClass2.this.emit(null, this);
            }

            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                super(continuation);
            }
        }

        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, androidx.datastore.preferences.core.Preferences.Key key) {
            this.getHighSpeedVideoSizes = flowCollector;
            this.Camera2StreamConfigurationMap = appStorage;
            this.getHighSpeedVideoFpsRangesFor = appStorageKey;
            this.getHighResolutionOutputSizeshNQ4ISI = key;
        }
    }

    public AppStorage$getValueFlow$$inlined$map$1(kotlinx.coroutines.flow.Flow flow, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, androidx.datastore.preferences.core.Preferences.Key key) {
        this.getHighSpeedVideoFpsRanges = flow;
        this.Camera2StreamConfigurationMap = appStorage;
        this.getHighSpeedVideoFpsRangesFor = appStorageKey;
        this.getHighResolutionOutputSizeshNQ4ISI = key;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.flow.Flow flow = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.needClassReification();
        java.lang.Object collect = flow.collect(new com.paypal.oslo.core.persistence.appstorage.AppStorage$getValueFlow$$inlined$map$1.AnonymousClass2(flowCollector, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object collect$$forInline(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        new kotlin.coroutines.jvm.internal.ContinuationImpl(continuation) { // from class: com.paypal.oslo.core.persistence.appstorage.AppStorage$getValueFlow$$inlined$map$1.1
            /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
            int getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.Camera2StreamConfigurationMap = obj;
                this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
                return com.paypal.oslo.core.persistence.appstorage.AppStorage$getValueFlow$$inlined$map$1.this.collect(null, this);
            }
        };
        kotlinx.coroutines.flow.Flow flow = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.needClassReification();
        flow.collect(new com.paypal.oslo.core.persistence.appstorage.AppStorage$getValueFlow$$inlined$map$1.AnonymousClass2(flowCollector, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI), continuation);
        return kotlin.Unit.INSTANCE;
    }
}
