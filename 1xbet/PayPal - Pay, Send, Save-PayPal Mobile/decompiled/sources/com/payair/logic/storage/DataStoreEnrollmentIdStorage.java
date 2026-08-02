package com.payair.logic.storage;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e0\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0015\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0017\u0010\u0016J \u0010\u001a\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\u001c\u0010\u001bJ \u0010\u001e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b \u0010\n"}, d2 = {"Lcom/payair/logic/storage/DataStoreEnrollmentIdStorage;", "Lcom/payair/logic/storage/EnrollmentIdStorage;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "panEnrollmentId", "", "storeCurrent", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "currentPanEnrollmentId", "()Lkotlinx/coroutines/flow/Flow;", "", "enrollmentIds", "storeEnrollmentIds", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "panEnrollmentIds", "", "isUnfinishedTokenizationRepeated", "deleteCurrent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEnrollmentIds", "enrollmentId", "networkTokenReference", "assignNtrToEnrollmentId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertNtrEnrollmentEntry$core_release", "handleTemporaryNtr", "markEnrollmentDone", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEnrollmentId", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataStoreEnrollmentIdStorage implements com.payair.logic.storage.EnrollmentIdStorage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion INSTANCE = new com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion(null);
    public static final kotlin.properties.ReadOnlyProperty b = androidx.content.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore$default("enrollment_id_storage", null, null, null, 14, null);
    public static final androidx.datastore.preferences.core.Preferences.Key c = androidx.content.preferences.core.PreferencesKeys.stringKey("enrollId");
    public static final androidx.datastore.preferences.core.Preferences.Key d = androidx.content.preferences.core.PreferencesKeys.stringKey("tempNtr");
    public static final androidx.datastore.preferences.core.Preferences.Key e = androidx.content.preferences.core.PreferencesKeys.stringKey("enrollmentIdMap");
    public static final androidx.datastore.preferences.core.Preferences.Key f = androidx.content.preferences.core.PreferencesKeys.stringSetKey("panEnrollmentIds");

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4474a;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/payair/logic/storage/DataStoreEnrollmentIdStorage$Companion;", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "ENROLLMENT_ID_KEY", "Landroidx/datastore/preferences/core/Preferences$Key;", "ENROLLMENT_ID_MAP_KEY", "", "PAN_ENROLLMENT_IDS_KEY", "TEMPORARY_ACTIVE_NTR_KEY", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.KProperty[] f4490a = {kotlin.jvm.internal.Reflection.property2(new kotlin.jvm.internal.PropertyReference2Impl(com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final androidx.content.core.DataStore access$getDataStore(com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion companion, android.content.Context context) {
            return (androidx.content.core.DataStore) com.payair.logic.storage.DataStoreEnrollmentIdStorage.b.getValue(context, f4490a[0]);
        }
    }

    public DataStoreEnrollmentIdStorage(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.f4474a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.n nVar;
        int i;
        java.lang.String str;
        if (continuation instanceof com.payair.csdk.n) {
            nVar = (com.payair.csdk.n) continuation;
            int i2 = nVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.c = i2 - 2147483648;
                java.lang.Object obj = nVar.f4286a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nVar.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlinx.coroutines.flow.Flow data = com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion.access$getDataStore(INSTANCE, this.f4474a).getData();
                    kotlinx.coroutines.flow.Flow<java.lang.String> flow = new kotlinx.coroutines.flow.Flow<java.lang.String>() { // from class: com.payair.logic.storage.DataStoreEnrollmentIdStorage$enrollmentNtrMap$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.String> flowCollector, kotlin.coroutines.Continuation continuation2) {
                            java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.payair.logic.storage.DataStoreEnrollmentIdStorage$enrollmentNtrMap$$inlined$map$1.AnonymousClass2(flowCollector), continuation2);
                            return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                        }

                        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.payair.logic.storage.DataStoreEnrollmentIdStorage$enrollmentNtrMap$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {

                            /* renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f4482a;

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                                com.payair.logic.storage.DataStoreEnrollmentIdStorage$enrollmentNtrMap$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                                int i;
                                androidx.datastore.preferences.core.Preferences.Key<T> key;
                                if (continuation instanceof com.payair.logic.storage.DataStoreEnrollmentIdStorage$enrollmentNtrMap$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                                    anonymousClass1 = (com.payair.logic.storage.DataStoreEnrollmentIdStorage$enrollmentNtrMap$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                                    int i2 = anonymousClass1.b;
                                    if ((i2 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.b = i2 - 2147483648;
                                        java.lang.Object obj2 = anonymousClass1.f4483a;
                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.b;
                                        if (i != 0) {
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                            kotlinx.coroutines.flow.FlowCollector flowCollector = this.f4482a;
                                            key = com.payair.logic.storage.DataStoreEnrollmentIdStorage.e;
                                            java.lang.Object obj3 = ((androidx.content.preferences.core.Preferences) obj).get(key);
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
                                anonymousClass1 = new com.payair.logic.storage.DataStoreEnrollmentIdStorage$enrollmentNtrMap$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                                java.lang.Object obj22 = anonymousClass1.f4483a;
                                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.b;
                                if (i != 0) {
                                }
                                return kotlin.Unit.INSTANCE;
                            }

                            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.payair.logic.storage.DataStoreEnrollmentIdStorage$enrollmentNtrMap$$inlined$map$1$2", f = "EnrollmentIdStorage.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "emit", n = {}, s = {})
                            /* renamed from: com.payair.logic.storage.DataStoreEnrollmentIdStorage$enrollmentNtrMap$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                                /* renamed from: a, reason: collision with root package name */
                                public /* synthetic */ java.lang.Object f4483a;
                                public int b;

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                    this.f4483a = obj;
                                    this.b |= Integer.MIN_VALUE;
                                    return com.payair.logic.storage.DataStoreEnrollmentIdStorage$enrollmentNtrMap$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                                }

                                public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                    super(continuation);
                                }
                            }

                            public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                                this.f4482a = flowCollector;
                            }
                        }
                    };
                    nVar.c = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(flow, nVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str != null) {
                    kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                    companion.getSerializersModule();
                    com.payair.csdk.n0 n0Var = (com.payair.csdk.n0) companion.decodeFromString(com.payair.csdk.n0.Companion.serializer(), str);
                    if (n0Var != null) {
                        return n0Var;
                    }
                }
                return new com.payair.csdk.n0(kotlin.collections.MapsKt.emptyMap());
            }
        }
        nVar = new com.payair.csdk.n(this, continuation);
        java.lang.Object obj2 = nVar.f4286a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nVar.c;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str != null) {
        }
        return new com.payair.csdk.n0(kotlin.collections.MapsKt.emptyMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (com.payair.logic.storage.EnrollmentIdStorage.DefaultImpls.markEnrollmentDone$default(r1, r8, false, r4, 2, null) != r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.payair.logic.storage.EnrollmentIdStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object assignNtrToEnrollmentId(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.payair.csdk.i iVar;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        com.payair.logic.storage.DataStoreEnrollmentIdStorage dataStoreEnrollmentIdStorage;
        com.payair.logic.storage.DataStoreEnrollmentIdStorage dataStoreEnrollmentIdStorage2;
        java.lang.String str3;
        java.lang.String str4;
        if (continuation instanceof com.payair.csdk.i) {
            iVar = (com.payair.csdk.i) continuation;
            int i2 = iVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.e = i2 - 2147483648;
                com.payair.csdk.i iVar2 = iVar;
                obj = iVar2.c;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = iVar2.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    iVar2.f4261a = this;
                    iVar2.b = str2;
                    iVar2.e = 1;
                    if (insertNtrEnrollmentEntry$core_release(str2, str, iVar2) != coroutine_suspended) {
                        dataStoreEnrollmentIdStorage = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    str3 = iVar2.b;
                    com.payair.logic.storage.DataStoreEnrollmentIdStorage dataStoreEnrollmentIdStorage3 = iVar2.f4261a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    dataStoreEnrollmentIdStorage2 = dataStoreEnrollmentIdStorage3;
                    str4 = (java.lang.String) obj;
                    if (str4 != null && kotlin.jvm.internal.Intrinsics.areEqual(str4, str3)) {
                        iVar2.f4261a = null;
                        iVar2.b = null;
                        iVar2.e = 3;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                str2 = iVar2.b;
                dataStoreEnrollmentIdStorage = iVar2.f4261a;
                kotlin.ResultKt.throwOnFailure(obj);
                final kotlinx.coroutines.flow.Flow data = com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion.access$getDataStore(INSTANCE, dataStoreEnrollmentIdStorage.f4474a).getData();
                kotlinx.coroutines.flow.Flow<java.lang.String> flow = new kotlinx.coroutines.flow.Flow<java.lang.String>() { // from class: com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.String> flowCollector, kotlin.coroutines.Continuation continuation2) {
                        java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1.AnonymousClass2(flowCollector), continuation2);
                        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f4476a;

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                            com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                            int i;
                            androidx.datastore.preferences.core.Preferences.Key<T> key;
                            if (continuation instanceof com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                                anonymousClass1 = (com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                                int i2 = anonymousClass1.b;
                                if ((i2 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.b = i2 - 2147483648;
                                    java.lang.Object obj2 = anonymousClass1.f4477a;
                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.b;
                                    if (i != 0) {
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.f4476a;
                                        key = com.payair.logic.storage.DataStoreEnrollmentIdStorage.d;
                                        java.lang.Object obj3 = ((androidx.content.preferences.core.Preferences) obj).get(key);
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
                            anonymousClass1 = new com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                            java.lang.Object obj22 = anonymousClass1.f4477a;
                            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.b;
                            if (i != 0) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1$2", f = "EnrollmentIdStorage.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "emit", n = {}, s = {})
                        /* renamed from: com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                            /* renamed from: a, reason: collision with root package name */
                            public /* synthetic */ java.lang.Object f4477a;
                            public int b;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                this.f4477a = obj;
                                this.b |= Integer.MIN_VALUE;
                                return com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                            }

                            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                            this.f4476a = flowCollector;
                        }
                    }
                };
                iVar2.f4261a = dataStoreEnrollmentIdStorage;
                iVar2.b = str2;
                iVar2.e = 2;
                obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(flow, iVar2);
                if (obj != coroutine_suspended) {
                    dataStoreEnrollmentIdStorage2 = dataStoreEnrollmentIdStorage;
                    str3 = str2;
                    str4 = (java.lang.String) obj;
                    if (str4 != null) {
                        iVar2.f4261a = null;
                        iVar2.b = null;
                        iVar2.e = 3;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        iVar = new com.payair.csdk.i(this, continuation);
        com.payair.csdk.i iVar22 = iVar;
        obj = iVar22.c;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = iVar22.e;
        if (i != 0) {
        }
        final kotlinx.coroutines.flow.Flow data2 = com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion.access$getDataStore(INSTANCE, dataStoreEnrollmentIdStorage.f4474a).getData();
        kotlinx.coroutines.flow.Flow<java.lang.String> flow2 = new kotlinx.coroutines.flow.Flow<java.lang.String>() { // from class: com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.String> flowCollector, kotlin.coroutines.Continuation continuation2) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1.AnonymousClass2(flowCollector), continuation2);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f4476a;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    androidx.datastore.preferences.core.Preferences.Key<T> key;
                    if (continuation instanceof com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        int i2 = anonymousClass1.b;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i2 - 2147483648;
                            java.lang.Object obj22 = anonymousClass1.f4477a;
                            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.b;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj22);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.f4476a;
                                key = com.payair.logic.storage.DataStoreEnrollmentIdStorage.d;
                                java.lang.Object obj3 = ((androidx.content.preferences.core.Preferences) obj).get(key);
                                anonymousClass1.b = 1;
                                if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended2) {
                                    return coroutine_suspended2;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj22);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj222 = anonymousClass1.f4477a;
                    java.lang.Object coroutine_suspended22 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.b;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1$2", f = "EnrollmentIdStorage.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ java.lang.Object f4477a;
                    public int b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.f4477a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return com.payair.logic.storage.DataStoreEnrollmentIdStorage$assignNtrToEnrollmentId$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.f4476a = flowCollector;
                }
            }
        };
        iVar22.f4261a = dataStoreEnrollmentIdStorage;
        iVar22.b = str2;
        iVar22.e = 2;
        obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(flow2, iVar22);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    @Override // com.payair.logic.storage.EnrollmentIdStorage
    public final kotlinx.coroutines.flow.Flow<java.lang.String> currentPanEnrollmentId() {
        final kotlinx.coroutines.flow.Flow data = com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion.access$getDataStore(INSTANCE, this.f4474a).getData();
        return new kotlinx.coroutines.flow.Flow<java.lang.String>() { // from class: com.payair.logic.storage.DataStoreEnrollmentIdStorage$currentPanEnrollmentId$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.String> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.payair.logic.storage.DataStoreEnrollmentIdStorage$currentPanEnrollmentId$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.payair.logic.storage.DataStoreEnrollmentIdStorage$currentPanEnrollmentId$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f4479a;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.payair.logic.storage.DataStoreEnrollmentIdStorage$currentPanEnrollmentId$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    androidx.datastore.preferences.core.Preferences.Key<T> key;
                    if (continuation instanceof com.payair.logic.storage.DataStoreEnrollmentIdStorage$currentPanEnrollmentId$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.payair.logic.storage.DataStoreEnrollmentIdStorage$currentPanEnrollmentId$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        int i2 = anonymousClass1.b;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i2 - 2147483648;
                            java.lang.Object obj2 = anonymousClass1.f4480a;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.b;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.f4479a;
                                key = com.payair.logic.storage.DataStoreEnrollmentIdStorage.c;
                                java.lang.Object obj3 = ((androidx.content.preferences.core.Preferences) obj).get(key);
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
                    anonymousClass1 = new com.payair.logic.storage.DataStoreEnrollmentIdStorage$currentPanEnrollmentId$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.f4480a;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.b;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.payair.logic.storage.DataStoreEnrollmentIdStorage$currentPanEnrollmentId$$inlined$map$1$2", f = "EnrollmentIdStorage.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.payair.logic.storage.DataStoreEnrollmentIdStorage$currentPanEnrollmentId$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ java.lang.Object f4480a;
                    public int b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.f4480a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return com.payair.logic.storage.DataStoreEnrollmentIdStorage$currentPanEnrollmentId$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.f4479a = flowCollector;
                }
            }
        };
    }

    @Override // com.payair.logic.storage.EnrollmentIdStorage
    public final java.lang.Object deleteCurrent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion.access$getDataStore(INSTANCE, this.f4474a), new com.payair.csdk.j(null), continuation);
        return edit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d4, code lost:
    
        if (androidx.content.preferences.core.PreferencesKt.edit(r11, r2, r0) != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
    
        if (r2.storeEnrollmentIds(r11, r0) != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.payair.logic.storage.EnrollmentIdStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteEnrollmentId(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.payair.csdk.k kVar;
        int i;
        com.payair.logic.storage.DataStoreEnrollmentIdStorage dataStoreEnrollmentIdStorage;
        java.lang.String str2;
        java.util.Map map;
        java.lang.Object firstOrNull;
        java.lang.String str3;
        java.util.Set set;
        if (continuation instanceof com.payair.csdk.k) {
            kVar = (com.payair.csdk.k) continuation;
            int i2 = kVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.f = i2 - 2147483648;
                java.lang.Object obj = kVar.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = kVar.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kVar.f4271a = this;
                    kVar.b = str;
                    kVar.f = 1;
                    obj = a(kVar);
                    if (obj != coroutine_suspended) {
                        dataStoreEnrollmentIdStorage = this;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    str = (java.lang.String) kVar.b;
                    dataStoreEnrollmentIdStorage = kVar.f4271a;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    java.lang.String str4 = kVar.c;
                    java.util.Map map2 = (java.util.Map) kVar.b;
                    com.payair.logic.storage.DataStoreEnrollmentIdStorage dataStoreEnrollmentIdStorage2 = kVar.f4271a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str3 = str4;
                    map = map2;
                    dataStoreEnrollmentIdStorage = dataStoreEnrollmentIdStorage2;
                    firstOrNull = obj;
                    set = (java.util.Set) firstOrNull;
                    if (set != null || (r5 = kotlin.collections.CollectionsKt.toMutableSet(set)) == null) {
                        java.util.Set linkedHashSet = new java.util.LinkedHashSet();
                    }
                    linkedHashSet.remove(str3);
                    java.util.Set<java.lang.String> set2 = kotlin.collections.CollectionsKt.toSet(linkedHashSet);
                    kVar.f4271a = dataStoreEnrollmentIdStorage;
                    kVar.b = map;
                    kVar.c = null;
                    kVar.f = 3;
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    map = (java.util.Map) kVar.b;
                    dataStoreEnrollmentIdStorage = kVar.f4271a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.content.core.DataStore access$getDataStore = com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion.access$getDataStore(INSTANCE, dataStoreEnrollmentIdStorage.f4474a);
                    com.payair.csdk.l lVar = new com.payair.csdk.l(map, null);
                    kVar.f4271a = null;
                    kVar.b = null;
                    kVar.f = 4;
                }
                java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(((com.payair.csdk.n0) obj).f4287a);
                str2 = (java.lang.String) mutableMap.remove(str);
                if (str2 == null) {
                    kotlinx.coroutines.flow.Flow<java.util.Set<java.lang.String>> panEnrollmentIds = dataStoreEnrollmentIdStorage.panEnrollmentIds();
                    kVar.f4271a = dataStoreEnrollmentIdStorage;
                    kVar.b = mutableMap;
                    kVar.c = str2;
                    kVar.f = 2;
                    firstOrNull = kotlinx.coroutines.flow.FlowKt.firstOrNull(panEnrollmentIds, kVar);
                    if (firstOrNull != coroutine_suspended) {
                        str3 = str2;
                        map = mutableMap;
                        set = (java.util.Set) firstOrNull;
                        if (set != null) {
                        }
                        java.util.Set linkedHashSet2 = new java.util.LinkedHashSet();
                        linkedHashSet2.remove(str3);
                        java.util.Set<java.lang.String> set22 = kotlin.collections.CollectionsKt.toSet(linkedHashSet2);
                        kVar.f4271a = dataStoreEnrollmentIdStorage;
                        kVar.b = map;
                        kVar.c = null;
                        kVar.f = 3;
                    }
                    return coroutine_suspended;
                }
                map = mutableMap;
                androidx.content.core.DataStore access$getDataStore2 = com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion.access$getDataStore(INSTANCE, dataStoreEnrollmentIdStorage.f4474a);
                com.payair.csdk.l lVar2 = new com.payair.csdk.l(map, null);
                kVar.f4271a = null;
                kVar.b = null;
                kVar.f = 4;
            }
        }
        kVar = new com.payair.csdk.k(this, continuation);
        java.lang.Object obj2 = kVar.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kVar.f;
        if (i != 0) {
        }
        java.util.Map mutableMap2 = kotlin.collections.MapsKt.toMutableMap(((com.payair.csdk.n0) obj2).f4287a);
        str2 = (java.lang.String) mutableMap2.remove(str);
        if (str2 == null) {
        }
    }

    @Override // com.payair.logic.storage.EnrollmentIdStorage
    public final java.lang.Object deleteEnrollmentIds(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion.access$getDataStore(INSTANCE, this.f4474a), new com.payair.csdk.m(null), continuation);
        return edit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if (androidx.content.preferences.core.PreferencesKt.edit(r6, r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object insertNtrEnrollmentEntry$core_release(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.payair.csdk.o oVar;
        int i;
        com.payair.logic.storage.DataStoreEnrollmentIdStorage dataStoreEnrollmentIdStorage;
        if (continuation instanceof com.payair.csdk.o) {
            oVar = (com.payair.csdk.o) continuation;
            int i2 = oVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.f = i2 - 2147483648;
                java.lang.Object obj = oVar.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = oVar.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    oVar.f4291a = this;
                    oVar.b = str;
                    oVar.c = str2;
                    oVar.f = 1;
                    obj = a(oVar);
                    if (obj != coroutine_suspended) {
                        dataStoreEnrollmentIdStorage = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                str2 = oVar.c;
                str = oVar.b;
                dataStoreEnrollmentIdStorage = oVar.f4291a;
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(((com.payair.csdk.n0) obj).f4287a);
                mutableMap.put(str, str2);
                androidx.content.core.DataStore access$getDataStore = com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion.access$getDataStore(INSTANCE, dataStoreEnrollmentIdStorage.f4474a);
                com.payair.csdk.p pVar = new com.payair.csdk.p(mutableMap, null);
                oVar.f4291a = null;
                oVar.b = null;
                oVar.c = null;
                oVar.f = 2;
            }
        }
        oVar = new com.payair.csdk.o(this, continuation);
        java.lang.Object obj2 = oVar.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = oVar.f;
        if (i != 0) {
        }
        java.util.Map mutableMap2 = kotlin.collections.MapsKt.toMutableMap(((com.payair.csdk.n0) obj2).f4287a);
        mutableMap2.put(str, str2);
        androidx.content.core.DataStore access$getDataStore2 = com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion.access$getDataStore(INSTANCE, dataStoreEnrollmentIdStorage.f4474a);
        com.payair.csdk.p pVar2 = new com.payair.csdk.p(mutableMap2, null);
        oVar.f4291a = null;
        oVar.b = null;
        oVar.c = null;
        oVar.f = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
    
        if (com.payair.logic.storage.EnrollmentIdStorage.DefaultImpls.markEnrollmentDone$default(r3, r12, false, r4, 2, null) == r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.payair.logic.storage.EnrollmentIdStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isUnfinishedTokenizationRepeated(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.payair.csdk.q qVar;
        java.lang.Object coroutine_suspended;
        int i;
        com.payair.logic.storage.DataStoreEnrollmentIdStorage dataStoreEnrollmentIdStorage;
        java.lang.Object firstOrNull;
        java.lang.String str2;
        com.payair.csdk.n0 n0Var;
        com.payair.logic.storage.DataStoreEnrollmentIdStorage dataStoreEnrollmentIdStorage2;
        java.lang.String str3;
        java.util.LinkedHashMap linkedHashMap;
        if (continuation instanceof com.payair.csdk.q) {
            qVar = (com.payair.csdk.q) continuation;
            int i2 = qVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.f = i2 - 2147483648;
                com.payair.csdk.q qVar2 = qVar;
                java.lang.Object obj = qVar2.d;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = qVar2.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    qVar2.f4301a = this;
                    qVar2.b = str;
                    qVar2.f = 1;
                    obj = a(qVar2);
                    if (obj != coroutine_suspended) {
                        dataStoreEnrollmentIdStorage = this;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    str = qVar2.b;
                    dataStoreEnrollmentIdStorage = qVar2.f4301a;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                    }
                    n0Var = qVar2.c;
                    str2 = qVar2.b;
                    dataStoreEnrollmentIdStorage2 = qVar2.f4301a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str3 = (java.lang.String) obj;
                    if (str3 == null) {
                        str3 = "";
                    }
                    java.util.Map map = n0Var.f4287a;
                    linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(entry.getValue(), str2)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (!linkedHashMap.isEmpty() || !kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.first(linkedHashMap.keySet()), str3)) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                    }
                    qVar2.f4301a = null;
                    qVar2.b = null;
                    qVar2.c = null;
                    qVar2.f = 3;
                }
                com.payair.csdk.n0 n0Var2 = (com.payair.csdk.n0) obj;
                final kotlinx.coroutines.flow.Flow data = com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion.access$getDataStore(INSTANCE, dataStoreEnrollmentIdStorage.f4474a).getData();
                kotlinx.coroutines.flow.Flow<java.lang.String> flow = new kotlinx.coroutines.flow.Flow<java.lang.String>() { // from class: com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.String> flowCollector, kotlin.coroutines.Continuation continuation2) {
                        java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1.AnonymousClass2(flowCollector), continuation2);
                        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f4485a;

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                            com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                            int i;
                            androidx.datastore.preferences.core.Preferences.Key<T> key;
                            if (continuation instanceof com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                                anonymousClass1 = (com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                                int i2 = anonymousClass1.b;
                                if ((i2 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.b = i2 - 2147483648;
                                    java.lang.Object obj2 = anonymousClass1.f4486a;
                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.b;
                                    if (i != 0) {
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.f4485a;
                                        key = com.payair.logic.storage.DataStoreEnrollmentIdStorage.d;
                                        java.lang.Object obj3 = ((androidx.content.preferences.core.Preferences) obj).get(key);
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
                            anonymousClass1 = new com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                            java.lang.Object obj22 = anonymousClass1.f4486a;
                            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.b;
                            if (i != 0) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1$2", f = "EnrollmentIdStorage.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "emit", n = {}, s = {})
                        /* renamed from: com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                            /* renamed from: a, reason: collision with root package name */
                            public /* synthetic */ java.lang.Object f4486a;
                            public int b;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                this.f4486a = obj;
                                this.b |= Integer.MIN_VALUE;
                                return com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                            }

                            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                            this.f4485a = flowCollector;
                        }
                    }
                };
                qVar2.f4301a = dataStoreEnrollmentIdStorage;
                qVar2.b = str;
                qVar2.c = n0Var2;
                qVar2.f = 2;
                firstOrNull = kotlinx.coroutines.flow.FlowKt.firstOrNull(flow, qVar2);
                if (firstOrNull != coroutine_suspended) {
                    com.payair.logic.storage.DataStoreEnrollmentIdStorage dataStoreEnrollmentIdStorage3 = dataStoreEnrollmentIdStorage;
                    str2 = str;
                    n0Var = n0Var2;
                    obj = firstOrNull;
                    dataStoreEnrollmentIdStorage2 = dataStoreEnrollmentIdStorage3;
                    str3 = (java.lang.String) obj;
                    if (str3 == null) {
                    }
                    java.util.Map map2 = n0Var.f4287a;
                    linkedHashMap = new java.util.LinkedHashMap();
                    while (r11.hasNext()) {
                    }
                    if (!linkedHashMap.isEmpty()) {
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                }
                return coroutine_suspended;
            }
        }
        qVar = new com.payair.csdk.q(this, continuation);
        com.payair.csdk.q qVar22 = qVar;
        java.lang.Object obj2 = qVar22.d;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = qVar22.f;
        if (i != 0) {
        }
        com.payair.csdk.n0 n0Var22 = (com.payair.csdk.n0) obj2;
        final kotlinx.coroutines.flow.Flow data2 = com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion.access$getDataStore(INSTANCE, dataStoreEnrollmentIdStorage.f4474a).getData();
        kotlinx.coroutines.flow.Flow<java.lang.String> flow2 = new kotlinx.coroutines.flow.Flow<java.lang.String>() { // from class: com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.String> flowCollector, kotlin.coroutines.Continuation continuation2) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1.AnonymousClass2(flowCollector), continuation2);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f4485a;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    androidx.datastore.preferences.core.Preferences.Key<T> key;
                    if (continuation instanceof com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        int i2 = anonymousClass1.b;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i2 - 2147483648;
                            java.lang.Object obj22 = anonymousClass1.f4486a;
                            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.b;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj22);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.f4485a;
                                key = com.payair.logic.storage.DataStoreEnrollmentIdStorage.d;
                                java.lang.Object obj3 = ((androidx.content.preferences.core.Preferences) obj).get(key);
                                anonymousClass1.b = 1;
                                if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended2) {
                                    return coroutine_suspended2;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj22);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj222 = anonymousClass1.f4486a;
                    java.lang.Object coroutine_suspended22 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.b;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1$2", f = "EnrollmentIdStorage.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ java.lang.Object f4486a;
                    public int b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.f4486a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return com.payair.logic.storage.DataStoreEnrollmentIdStorage$isUnfinishedTokenizationRepeated$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.f4485a = flowCollector;
                }
            }
        };
        qVar22.f4301a = dataStoreEnrollmentIdStorage;
        qVar22.b = str;
        qVar22.c = n0Var22;
        qVar22.f = 2;
        firstOrNull = kotlinx.coroutines.flow.FlowKt.firstOrNull(flow2, qVar22);
        if (firstOrNull != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e5, code lost:
    
        if (r3.storeEnrollmentIds(r12, r0) != r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0103, code lost:
    
        if (androidx.content.preferences.core.PreferencesKt.edit(r11, r12, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
    
        if (androidx.content.preferences.core.PreferencesKt.edit(r7, r9, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.payair.logic.storage.EnrollmentIdStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object markEnrollmentDone(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.payair.csdk.s sVar;
        int i;
        com.payair.logic.storage.DataStoreEnrollmentIdStorage dataStoreEnrollmentIdStorage;
        com.payair.logic.storage.DataStoreEnrollmentIdStorage dataStoreEnrollmentIdStorage2;
        java.lang.String str2;
        boolean z2;
        com.payair.csdk.n0 n0Var;
        java.lang.String str3;
        com.payair.logic.storage.DataStoreEnrollmentIdStorage dataStoreEnrollmentIdStorage3;
        java.util.Set set;
        if (continuation instanceof com.payair.csdk.s) {
            sVar = (com.payair.csdk.s) continuation;
            int i2 = sVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.g = i2 - 2147483648;
                java.lang.Object obj = sVar.e;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sVar.g;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    sVar.f4309a = this;
                    sVar.b = str;
                    sVar.d = z;
                    sVar.g = 1;
                    obj = a(sVar);
                    if (obj != coroutine_suspended) {
                        dataStoreEnrollmentIdStorage = this;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    z = sVar.d;
                    str = sVar.b;
                    dataStoreEnrollmentIdStorage = sVar.f4309a;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        z2 = sVar.d;
                        n0Var = (com.payair.csdk.n0) sVar.c;
                        str2 = sVar.b;
                        dataStoreEnrollmentIdStorage2 = sVar.f4309a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str3 = (java.lang.String) n0Var.f4287a.get(str2);
                        if (str3 == null) {
                            if (z2) {
                                androidx.content.core.DataStore access$getDataStore = com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion.access$getDataStore(INSTANCE, dataStoreEnrollmentIdStorage2.f4474a);
                                com.payair.csdk.u uVar = new com.payair.csdk.u(str2, null);
                                sVar.f4309a = null;
                                sVar.b = null;
                                sVar.c = null;
                                sVar.g = 5;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        kotlinx.coroutines.flow.Flow<java.util.Set<java.lang.String>> panEnrollmentIds = dataStoreEnrollmentIdStorage2.panEnrollmentIds();
                        sVar.f4309a = dataStoreEnrollmentIdStorage2;
                        sVar.b = str2;
                        sVar.c = str3;
                        sVar.d = z2;
                        sVar.g = 3;
                        obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(panEnrollmentIds, sVar);
                        if (obj != coroutine_suspended) {
                            dataStoreEnrollmentIdStorage3 = dataStoreEnrollmentIdStorage2;
                            set = (java.util.Set) obj;
                            if (set != null) {
                            }
                            java.util.Set linkedHashSet = new java.util.LinkedHashSet();
                            linkedHashSet.add(str3);
                            java.util.Set<java.lang.String> set2 = kotlin.collections.CollectionsKt.toSet(linkedHashSet);
                            sVar.f4309a = dataStoreEnrollmentIdStorage3;
                            sVar.b = str2;
                            sVar.c = null;
                            sVar.d = z2;
                            sVar.g = 4;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 3) {
                        if (i == 4) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    z2 = sVar.d;
                    str3 = (java.lang.String) sVar.c;
                    str2 = sVar.b;
                    dataStoreEnrollmentIdStorage3 = sVar.f4309a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    set = (java.util.Set) obj;
                    if (set != null || (linkedHashSet = kotlin.collections.CollectionsKt.toMutableSet(set)) == null) {
                        java.util.Set linkedHashSet2 = new java.util.LinkedHashSet();
                    }
                    linkedHashSet2.add(str3);
                    java.util.Set<java.lang.String> set22 = kotlin.collections.CollectionsKt.toSet(linkedHashSet2);
                    sVar.f4309a = dataStoreEnrollmentIdStorage3;
                    sVar.b = str2;
                    sVar.c = null;
                    sVar.d = z2;
                    sVar.g = 4;
                }
                com.payair.csdk.n0 n0Var2 = (com.payair.csdk.n0) obj;
                if (z) {
                    androidx.content.core.DataStore access$getDataStore2 = com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion.access$getDataStore(INSTANCE, dataStoreEnrollmentIdStorage.f4474a);
                    com.payair.csdk.t tVar = new com.payair.csdk.t(null);
                    sVar.f4309a = dataStoreEnrollmentIdStorage;
                    sVar.b = str;
                    sVar.c = n0Var2;
                    sVar.d = z;
                    sVar.g = 2;
                }
                dataStoreEnrollmentIdStorage2 = dataStoreEnrollmentIdStorage;
                str2 = str;
                z2 = z;
                n0Var = n0Var2;
                str3 = (java.lang.String) n0Var.f4287a.get(str2);
                if (str3 == null) {
                }
                return coroutine_suspended;
            }
        }
        sVar = new com.payair.csdk.s(this, continuation);
        java.lang.Object obj2 = sVar.e;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sVar.g;
        if (i != 0) {
        }
        com.payair.csdk.n0 n0Var22 = (com.payair.csdk.n0) obj2;
        if (z) {
        }
        dataStoreEnrollmentIdStorage2 = dataStoreEnrollmentIdStorage;
        str2 = str;
        z2 = z;
        n0Var = n0Var22;
        str3 = (java.lang.String) n0Var.f4287a.get(str2);
        if (str3 == null) {
        }
        return coroutine_suspended2;
    }

    @Override // com.payair.logic.storage.EnrollmentIdStorage
    public final kotlinx.coroutines.flow.Flow<java.util.Set<java.lang.String>> panEnrollmentIds() {
        final kotlinx.coroutines.flow.Flow data = com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion.access$getDataStore(INSTANCE, this.f4474a).getData();
        return new kotlinx.coroutines.flow.Flow<java.util.Set<? extends java.lang.String>>() { // from class: com.payair.logic.storage.DataStoreEnrollmentIdStorage$panEnrollmentIds$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.util.Set<? extends java.lang.String>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.payair.logic.storage.DataStoreEnrollmentIdStorage$panEnrollmentIds$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.payair.logic.storage.DataStoreEnrollmentIdStorage$panEnrollmentIds$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f4488a;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.payair.logic.storage.DataStoreEnrollmentIdStorage$panEnrollmentIds$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    androidx.datastore.preferences.core.Preferences.Key<T> key;
                    if (continuation instanceof com.payair.logic.storage.DataStoreEnrollmentIdStorage$panEnrollmentIds$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.payair.logic.storage.DataStoreEnrollmentIdStorage$panEnrollmentIds$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        int i2 = anonymousClass1.b;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i2 - 2147483648;
                            java.lang.Object obj2 = anonymousClass1.f4489a;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.b;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.f4488a;
                                key = com.payair.logic.storage.DataStoreEnrollmentIdStorage.f;
                                java.lang.Object obj3 = ((androidx.content.preferences.core.Preferences) obj).get(key);
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
                    anonymousClass1 = new com.payair.logic.storage.DataStoreEnrollmentIdStorage$panEnrollmentIds$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.f4489a;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.b;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.payair.logic.storage.DataStoreEnrollmentIdStorage$panEnrollmentIds$$inlined$map$1$2", f = "EnrollmentIdStorage.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.payair.logic.storage.DataStoreEnrollmentIdStorage$panEnrollmentIds$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ java.lang.Object f4489a;
                    public int b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.f4489a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return com.payair.logic.storage.DataStoreEnrollmentIdStorage$panEnrollmentIds$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.f4488a = flowCollector;
                }
            }
        };
    }

    @Override // com.payair.logic.storage.EnrollmentIdStorage
    public final java.lang.Object storeCurrent(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion.access$getDataStore(INSTANCE, this.f4474a), new com.payair.csdk.v(str, null), continuation);
        return edit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : kotlin.Unit.INSTANCE;
    }

    @Override // com.payair.logic.storage.EnrollmentIdStorage
    public final java.lang.Object storeEnrollmentIds(java.util.Set<java.lang.String> set, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(com.payair.logic.storage.DataStoreEnrollmentIdStorage.Companion.access$getDataStore(INSTANCE, this.f4474a), new com.payair.csdk.w(set, null), continuation);
        return edit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : kotlin.Unit.INSTANCE;
    }
}
