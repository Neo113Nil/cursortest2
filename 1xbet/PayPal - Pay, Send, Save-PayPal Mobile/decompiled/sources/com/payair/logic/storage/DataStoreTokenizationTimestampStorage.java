package com.payair.logic.storage;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000fJ\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00102\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R.\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/payair/logic/storage/DataStoreTokenizationTimestampStorage;", "Lcom/payair/logic/storage/TokenizationTimestampStorage;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "", "timestampMap", "", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "ntu", "timestamp", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", util.h.xy.cb.b.f1091, "Lkotlinx/coroutines/flow/Flow;", "getTimestampMap", "()Lkotlinx/coroutines/flow/Flow;", "Companion", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataStoreTokenizationTimestampStorage implements com.payair.logic.storage.TokenizationTimestampStorage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.logic.storage.DataStoreTokenizationTimestampStorage.Companion INSTANCE = new com.payair.logic.storage.DataStoreTokenizationTimestampStorage.Companion(null);
    public static final kotlin.properties.ReadOnlyProperty c = androidx.content.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore$default("timestamp_storage", null, null, null, 14, null);
    public static final androidx.datastore.preferences.core.Preferences.Key d = androidx.content.preferences.core.PreferencesKeys.stringKey("tokenization_timestamp_map");

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4502a;
    public final com.payair.logic.storage.DataStoreTokenizationTimestampStorage$special$$inlined$map$1 b;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/payair/logic/storage/DataStoreTokenizationTimestampStorage$Companion;", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "TOKENIZATION_TIMESTAMP_MAP_KEY", "Landroidx/datastore/preferences/core/Preferences$Key;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.KProperty[] f4509a = {kotlin.jvm.internal.Reflection.property2(new kotlin.jvm.internal.PropertyReference2Impl(com.payair.logic.storage.DataStoreTokenizationTimestampStorage.Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final androidx.content.core.DataStore access$getDataStore(com.payair.logic.storage.DataStoreTokenizationTimestampStorage.Companion companion, android.content.Context context) {
            return (androidx.content.core.DataStore) com.payair.logic.storage.DataStoreTokenizationTimestampStorage.c.getValue(context, f4509a[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.payair.logic.storage.DataStoreTokenizationTimestampStorage$special$$inlined$map$1] */
    public DataStoreTokenizationTimestampStorage(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.f4502a = context;
        final kotlinx.coroutines.flow.Flow data = com.payair.logic.storage.DataStoreTokenizationTimestampStorage.Companion.access$getDataStore(INSTANCE, context).getData();
        this.b = new kotlinx.coroutines.flow.Flow<java.util.Map<java.lang.Long, ? extends java.lang.Long>>() { // from class: com.payair.logic.storage.DataStoreTokenizationTimestampStorage$special$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.util.Map<java.lang.Long, ? extends java.lang.Long>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.payair.logic.storage.DataStoreTokenizationTimestampStorage$special$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.payair.logic.storage.DataStoreTokenizationTimestampStorage$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f4504a;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.payair.logic.storage.DataStoreTokenizationTimestampStorage$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    androidx.datastore.preferences.core.Preferences.Key<T> key;
                    java.util.Map map;
                    if (continuation instanceof com.payair.logic.storage.DataStoreTokenizationTimestampStorage$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.payair.logic.storage.DataStoreTokenizationTimestampStorage$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        int i2 = anonymousClass1.b;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i2 - 2147483648;
                            java.lang.Object obj2 = anonymousClass1.f4505a;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.b;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.f4504a;
                                key = com.payair.logic.storage.DataStoreTokenizationTimestampStorage.d;
                                java.lang.String str = (java.lang.String) ((androidx.content.preferences.core.Preferences) obj).get(key);
                                if (str != null) {
                                    kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                                    companion.getSerializersModule();
                                    com.payair.csdk.r2 r2Var = (com.payair.csdk.r2) companion.decodeFromString(com.payair.csdk.r2.Companion.serializer(), str);
                                    if (r2Var != null) {
                                        map = r2Var.f4307a;
                                        anonymousClass1.b = 1;
                                        if (flowCollector.emit(map, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                }
                                map = null;
                                anonymousClass1.b = 1;
                                if (flowCollector.emit(map, anonymousClass1) == coroutine_suspended) {
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
                    anonymousClass1 = new com.payair.logic.storage.DataStoreTokenizationTimestampStorage$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.f4505a;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.b;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.payair.logic.storage.DataStoreTokenizationTimestampStorage$special$$inlined$map$1$2", f = "DataStoreTokenizationTimestampStorage.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.payair.logic.storage.DataStoreTokenizationTimestampStorage$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ java.lang.Object f4505a;
                    public int b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.f4505a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return com.payair.logic.storage.DataStoreTokenizationTimestampStorage$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.f4504a = flowCollector;
                }
            }
        };
    }

    @Override // com.payair.logic.storage.TokenizationTimestampStorage
    public final java.lang.Object clearAll(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(com.payair.logic.storage.DataStoreTokenizationTimestampStorage.Companion.access$getDataStore(INSTANCE, this.f4502a), new com.payair.csdk.e0(null), continuation);
        return edit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : kotlin.Unit.INSTANCE;
    }

    @Override // com.payair.logic.storage.TokenizationTimestampStorage
    public final java.lang.Object delete(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(com.payair.logic.storage.DataStoreTokenizationTimestampStorage.Companion.access$getDataStore(INSTANCE, this.f4502a), new com.payair.csdk.f0(androidx.content.preferences.core.PreferencesKeys.longKey(str), null), continuation);
        return edit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : kotlin.Unit.INSTANCE;
    }

    @Override // com.payair.logic.storage.TokenizationTimestampStorage
    public final kotlinx.coroutines.flow.Flow<java.util.Map<java.lang.Long, java.lang.Long>> getTimestampMap() {
        return this.b;
    }

    @Override // com.payair.logic.storage.TokenizationTimestampStorage
    public final java.lang.Object store(java.util.Map<java.lang.Long, java.lang.Long> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(com.payair.logic.storage.DataStoreTokenizationTimestampStorage.Companion.access$getDataStore(INSTANCE, this.f4502a), new com.payair.csdk.g0(map, null), continuation);
        return edit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : kotlin.Unit.INSTANCE;
    }

    @Override // com.payair.logic.storage.TokenizationTimestampStorage
    public final kotlinx.coroutines.flow.Flow<java.lang.Long> timestamp(final java.lang.String ntu) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ntu, "");
        final kotlinx.coroutines.flow.Flow data = com.payair.logic.storage.DataStoreTokenizationTimestampStorage.Companion.access$getDataStore(INSTANCE, this.f4502a).getData();
        return new kotlinx.coroutines.flow.Flow<java.lang.Long>() { // from class: com.payair.logic.storage.DataStoreTokenizationTimestampStorage$timestamp$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Long> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.payair.logic.storage.DataStoreTokenizationTimestampStorage$timestamp$$inlined$map$1.AnonymousClass2(flowCollector, ntu), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.payair.logic.storage.DataStoreTokenizationTimestampStorage$timestamp$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f4507a;
                public final /* synthetic */ java.lang.String b;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.payair.logic.storage.DataStoreTokenizationTimestampStorage$timestamp$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.payair.logic.storage.DataStoreTokenizationTimestampStorage$timestamp$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.payair.logic.storage.DataStoreTokenizationTimestampStorage$timestamp$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        int i2 = anonymousClass1.b;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i2 - 2147483648;
                            java.lang.Object obj2 = anonymousClass1.f4508a;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.b;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.f4507a;
                                java.lang.Object obj3 = ((androidx.content.preferences.core.Preferences) obj).get(androidx.content.preferences.core.PreferencesKeys.longKey(this.b));
                                anonymousClass1.b = 1;
                                if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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
                    anonymousClass1 = new com.payair.logic.storage.DataStoreTokenizationTimestampStorage$timestamp$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.f4508a;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.b;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.payair.logic.storage.DataStoreTokenizationTimestampStorage$timestamp$$inlined$map$1$2", f = "DataStoreTokenizationTimestampStorage.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.payair.logic.storage.DataStoreTokenizationTimestampStorage$timestamp$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ java.lang.Object f4508a;
                    public int b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.f4508a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return com.payair.logic.storage.DataStoreTokenizationTimestampStorage$timestamp$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, java.lang.String str) {
                    this.f4507a = flowCollector;
                    this.b = str;
                }
            }
        };
    }

    @Override // com.payair.logic.storage.TokenizationTimestampStorage
    public final java.lang.Object store(java.lang.String str, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(com.payair.logic.storage.DataStoreTokenizationTimestampStorage.Companion.access$getDataStore(INSTANCE, this.f4502a), new com.payair.csdk.h0(androidx.content.preferences.core.PreferencesKeys.longKey(str), j, null), continuation);
        return edit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : kotlin.Unit.INSTANCE;
    }
}
