package com.payair.logic.storage;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0011\u0010\fR\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/payair/logic/storage/DataStoreSchemeStorage;", "Lcom/payair/logic/storage/SchemeStorage;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/payair/model/CardScheme;", "scheme", "", "storeScheme", "(Lcom/payair/model/CardScheme;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "visaEnrolled", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mastercardEnrolled", "deleteCurrentScheme", "deleteEnrolledSchemes", "deleteEnrolledMastercard", "deleteEnrolledVisa", "Lkotlinx/coroutines/flow/Flow;", util.h.xy.cb.b.f1091, "Lkotlinx/coroutines/flow/Flow;", "getCurrentScheme", "()Lkotlinx/coroutines/flow/Flow;", "currentScheme", "", "c", "isVisaEnrolled", "d", "isMastercardEnrolled", "Companion", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataStoreSchemeStorage implements com.payair.logic.storage.SchemeStorage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.logic.storage.DataStoreSchemeStorage.Companion INSTANCE = new com.payair.logic.storage.DataStoreSchemeStorage.Companion(null);
    public static final kotlin.properties.ReadOnlyProperty e = androidx.content.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore$default("scheme_storage", null, null, null, 14, null);
    public static final androidx.datastore.preferences.core.Preferences.Key f = androidx.content.preferences.core.PreferencesKeys.stringKey("current_scheme");
    public static final androidx.datastore.preferences.core.Preferences.Key g = androidx.content.preferences.core.PreferencesKeys.booleanKey("visa_enrolled");
    public static final androidx.datastore.preferences.core.Preferences.Key h = androidx.content.preferences.core.PreferencesKeys.booleanKey("mastercard_enrolled");

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4491a;
    public final com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$1 b;
    public final com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$2 c;
    public final com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$3 d;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/payair/logic/storage/DataStoreSchemeStorage$Companion;", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "CURRENT_SCHEME_KEY", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "MASTERCARD_ENROLLED_KEY", "VISA_ENROLLED_KEY", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.KProperty[] f4501a = {kotlin.jvm.internal.Reflection.property2(new kotlin.jvm.internal.PropertyReference2Impl(com.payair.logic.storage.DataStoreSchemeStorage.Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final androidx.content.core.DataStore access$getDataStore(com.payair.logic.storage.DataStoreSchemeStorage.Companion companion, android.content.Context context) {
            return (androidx.content.core.DataStore) com.payair.logic.storage.DataStoreSchemeStorage.e.getValue(context, f4501a[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$3] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$2] */
    public DataStoreSchemeStorage(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.f4491a = context;
        com.payair.logic.storage.DataStoreSchemeStorage.Companion companion = INSTANCE;
        final kotlinx.coroutines.flow.Flow data = com.payair.logic.storage.DataStoreSchemeStorage.Companion.access$getDataStore(companion, context).getData();
        this.b = new kotlinx.coroutines.flow.Flow<com.payair.model.CardScheme>() { // from class: com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.payair.model.CardScheme> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f4493a;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    androidx.datastore.preferences.core.Preferences.Key<T> key;
                    com.payair.model.CardScheme cardScheme;
                    if (continuation instanceof com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        int i2 = anonymousClass1.b;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i2 - 2147483648;
                            java.lang.Object obj2 = anonymousClass1.f4494a;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.b;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.f4493a;
                                key = com.payair.logic.storage.DataStoreSchemeStorage.f;
                                java.lang.String str = (java.lang.String) ((androidx.content.preferences.core.Preferences) obj).get(key);
                                if (str != null) {
                                    kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                                    companion.getSerializersModule();
                                    cardScheme = (com.payair.model.CardScheme) companion.decodeFromString(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.payair.model.CardScheme", com.payair.model.CardScheme.values()), str);
                                } else {
                                    cardScheme = null;
                                }
                                anonymousClass1.b = 1;
                                if (flowCollector.emit(cardScheme, anonymousClass1) == coroutine_suspended) {
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
                    anonymousClass1 = new com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.f4494a;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.b;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$1$2", f = "SchemeStorage.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ java.lang.Object f4494a;
                    public int b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.f4494a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.f4493a = flowCollector;
                }
            }
        };
        final kotlinx.coroutines.flow.Flow data2 = com.payair.logic.storage.DataStoreSchemeStorage.Companion.access$getDataStore(companion, context).getData();
        this.c = new kotlinx.coroutines.flow.Flow<java.lang.Boolean>() { // from class: com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$2
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$2.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f4496a;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$2.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    androidx.datastore.preferences.core.Preferences.Key<T> key;
                    if (continuation instanceof com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) continuation;
                        int i2 = anonymousClass1.b;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i2 - 2147483648;
                            java.lang.Object obj2 = anonymousClass1.f4497a;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.b;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.f4496a;
                                key = com.payair.logic.storage.DataStoreSchemeStorage.g;
                                java.lang.Boolean bool = (java.lang.Boolean) ((androidx.content.preferences.core.Preferences) obj).get(key);
                                java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
                                anonymousClass1.b = 1;
                                if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
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
                    anonymousClass1 = new com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$2.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.f4497a;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.b;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$2$2", f = "SchemeStorage.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ java.lang.Object f4497a;
                    public int b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.f4497a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$2.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.f4496a = flowCollector;
                }
            }
        };
        final kotlinx.coroutines.flow.Flow data3 = com.payair.logic.storage.DataStoreSchemeStorage.Companion.access$getDataStore(companion, context).getData();
        this.d = new kotlinx.coroutines.flow.Flow<java.lang.Boolean>() { // from class: com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$3
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$3.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f4499a;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$3.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    androidx.datastore.preferences.core.Preferences.Key<T> key;
                    if (continuation instanceof com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) continuation;
                        int i2 = anonymousClass1.b;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i2 - 2147483648;
                            java.lang.Object obj2 = anonymousClass1.f4500a;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.b;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.f4499a;
                                key = com.payair.logic.storage.DataStoreSchemeStorage.h;
                                java.lang.Boolean bool = (java.lang.Boolean) ((androidx.content.preferences.core.Preferences) obj).get(key);
                                java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
                                anonymousClass1.b = 1;
                                if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
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
                    anonymousClass1 = new com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$3.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.f4500a;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.b;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$3$2", f = "SchemeStorage.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ java.lang.Object f4500a;
                    public int b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.f4500a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return com.payair.logic.storage.DataStoreSchemeStorage$special$$inlined$map$3.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.f4499a = flowCollector;
                }
            }
        };
    }

    @Override // com.payair.logic.storage.SchemeStorage
    public final java.lang.Object deleteCurrentScheme(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(com.payair.logic.storage.DataStoreSchemeStorage.Companion.access$getDataStore(INSTANCE, this.f4491a), new com.payair.csdk.x(null), continuation);
        return edit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : kotlin.Unit.INSTANCE;
    }

    @Override // com.payair.logic.storage.SchemeStorage
    public final java.lang.Object deleteEnrolledMastercard(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(com.payair.logic.storage.DataStoreSchemeStorage.Companion.access$getDataStore(INSTANCE, this.f4491a), new com.payair.csdk.y(null), continuation);
        return edit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : kotlin.Unit.INSTANCE;
    }

    @Override // com.payair.logic.storage.SchemeStorage
    public final java.lang.Object deleteEnrolledSchemes(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(com.payair.logic.storage.DataStoreSchemeStorage.Companion.access$getDataStore(INSTANCE, this.f4491a), new com.payair.csdk.z(null), continuation);
        return edit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : kotlin.Unit.INSTANCE;
    }

    @Override // com.payair.logic.storage.SchemeStorage
    public final java.lang.Object deleteEnrolledVisa(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(com.payair.logic.storage.DataStoreSchemeStorage.Companion.access$getDataStore(INSTANCE, this.f4491a), new com.payair.csdk.a0(null), continuation);
        return edit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : kotlin.Unit.INSTANCE;
    }

    @Override // com.payair.logic.storage.SchemeStorage
    public final kotlinx.coroutines.flow.Flow<com.payair.model.CardScheme> getCurrentScheme() {
        return this.b;
    }

    @Override // com.payair.logic.storage.SchemeStorage
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isMastercardEnrolled() {
        return this.d;
    }

    @Override // com.payair.logic.storage.SchemeStorage
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isVisaEnrolled() {
        return this.c;
    }

    @Override // com.payair.logic.storage.SchemeStorage
    public final java.lang.Object mastercardEnrolled(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(com.payair.logic.storage.DataStoreSchemeStorage.Companion.access$getDataStore(INSTANCE, this.f4491a), new com.payair.csdk.b0(null), continuation);
        return edit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : kotlin.Unit.INSTANCE;
    }

    @Override // com.payair.logic.storage.SchemeStorage
    public final java.lang.Object storeScheme(com.payair.model.CardScheme cardScheme, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(com.payair.logic.storage.DataStoreSchemeStorage.Companion.access$getDataStore(INSTANCE, this.f4491a), new com.payair.csdk.c0(cardScheme, null), continuation);
        return edit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : kotlin.Unit.INSTANCE;
    }

    @Override // com.payair.logic.storage.SchemeStorage
    public final java.lang.Object visaEnrolled(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(com.payair.logic.storage.DataStoreSchemeStorage.Companion.access$getDataStore(INSTANCE, this.f4491a), new com.payair.csdk.d0(null), continuation);
        return edit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : kotlin.Unit.INSTANCE;
    }
}
