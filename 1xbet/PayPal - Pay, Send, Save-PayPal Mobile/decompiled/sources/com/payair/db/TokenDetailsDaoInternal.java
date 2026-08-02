package com.payair.db;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0012\"\u00020\bH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/payair/db/TokenDetailsDaoInternal;", "Lcom/payair/db/token/TokenDetailsDao;", "Landroid/content/Context;", "context", "dao", "<init>", "(Landroid/content/Context;Lcom/payair/db/token/TokenDetailsDao;)V", "", "Lcom/payair/db/token/TokenDetailsEntry;", "getAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "observeAll", "()Lkotlinx/coroutines/flow/Flow;", "", "networkTokenReference", "getByNetworkTokenReference", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tokenDetailsEntry", "", "insert", "([Lcom/payair/db/token/TokenDetailsEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Lcom/payair/db/token/TokenDetailsEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "()V", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TokenDetailsDaoInternal implements com.payair.db.token.TokenDetailsDao {
    public static final java.lang.String ASSETS_DIR_NAME = "assets-csdk";
    public static final java.lang.String ASSET_FILE_NAME_EXTENSION = "txt";
    public static final java.lang.String ASSET_FILE_NAME_PREFIX = "asset";

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4349a;
    public final com.payair.db.token.TokenDetailsDao b;

    public TokenDetailsDaoInternal(android.content.Context context, com.payair.db.token.TokenDetailsDao tokenDetailsDao) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenDetailsDao, "");
        this.f4349a = context;
        this.b = tokenDetailsDao;
    }

    public static java.lang.String a(com.payair.db.token.TokenDetailsEntry tokenDetailsEntry) {
        java.lang.String networkTokenReference = tokenDetailsEntry.getNetworkTokenReference();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("asset-");
        sb.append(networkTokenReference);
        sb.append(".txt");
        return sb.toString();
    }

    public static com.payair.db.token.TokenDetailsEntry b(com.payair.db.token.TokenDetailsEntry tokenDetailsEntry) {
        com.payair.model.Asset asset;
        com.payair.model.Asset asset2;
        if (tokenDetailsEntry == null || (asset2 = tokenDetailsEntry.getAsset()) == null) {
            asset = null;
        } else {
            java.lang.String assetPath = tokenDetailsEntry.getAssetPath();
            kotlin.jvm.internal.Intrinsics.checkNotNull(assetPath);
            java.io.File file = new java.io.File(assetPath);
            if (!file.exists()) {
                return null;
            }
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                com.payair.model.Asset copy$default = com.payair.model.Asset.copy$default(asset2, null, new java.lang.String(kotlin.io.ByteStreamsKt.readBytes(fileInputStream), kotlin.text.Charsets.UTF_8), null, null, 13, null);
                kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
                asset = copy$default;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    kotlin.io.CloseableKt.closeFinally(fileInputStream, th);
                    throw th2;
                }
            }
        }
        if (tokenDetailsEntry != null) {
            return com.payair.db.token.TokenDetailsEntry.copy$default(tokenDetailsEntry, null, null, null, null, null, asset, null, 95, null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.payair.db.token.TokenDetailsDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object delete(com.payair.db.token.TokenDetailsEntry tokenDetailsEntry, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.payair.csdk.s2 s2Var;
        int i;
        java.io.File file;
        if (continuation instanceof com.payair.csdk.s2) {
            s2Var = (com.payair.csdk.s2) continuation;
            int i2 = s2Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s2Var.d = i2 - 2147483648;
                java.lang.Object obj = s2Var.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = s2Var.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String assetPath = tokenDetailsEntry.getAssetPath();
                    java.io.File file2 = assetPath != null ? new java.io.File(assetPath) : null;
                    com.payair.db.token.TokenDetailsDao tokenDetailsDao = this.b;
                    s2Var.f4312a = file2;
                    s2Var.d = 1;
                    if (tokenDetailsDao.delete(tokenDetailsEntry, s2Var) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    file = file2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    file = s2Var.f4312a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (file != null) {
                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(file.delete());
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        s2Var = new com.payair.csdk.s2(this, continuation);
        java.lang.Object obj2 = s2Var.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = s2Var.d;
        if (i != 0) {
        }
        if (file != null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.payair.db.token.TokenDetailsDao
    public final void deleteAll() {
        java.io.File file = new java.io.File(this.f4349a.getFilesDir(), ASSETS_DIR_NAME);
        this.b.deleteAll();
        if (file.exists()) {
            kotlin.io.FilesKt.deleteRecursively(file);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.payair.db.token.TokenDetailsDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAll(kotlin.coroutines.Continuation<? super java.util.List<com.payair.db.token.TokenDetailsEntry>> continuation) {
        com.payair.csdk.u2 u2Var;
        int i;
        java.util.Iterator it;
        if (continuation instanceof com.payair.csdk.u2) {
            u2Var = (com.payair.csdk.u2) continuation;
            int i2 = u2Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u2Var.d = i2 - 2147483648;
                java.lang.Object obj = u2Var.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = u2Var.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.db.token.TokenDetailsDao tokenDetailsDao = this.b;
                    u2Var.f4322a = this;
                    u2Var.d = 1;
                    obj = tokenDetailsDao.getAll(u2Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.payair.db.TokenDetailsDaoInternal tokenDetailsDaoInternal = u2Var.f4322a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    com.payair.db.token.TokenDetailsEntry b = b((com.payair.db.token.TokenDetailsEntry) it.next());
                    if (b != null) {
                        arrayList.add(b);
                    }
                }
                return arrayList;
            }
        }
        u2Var = new com.payair.csdk.u2(this, continuation);
        java.lang.Object obj2 = u2Var.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = u2Var.d;
        if (i != 0) {
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        it = ((java.util.List) obj2).iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.payair.db.token.TokenDetailsDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getByNetworkTokenReference(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.db.token.TokenDetailsEntry> continuation) {
        com.payair.csdk.v2 v2Var;
        int i;
        if (continuation instanceof com.payair.csdk.v2) {
            v2Var = (com.payair.csdk.v2) continuation;
            int i2 = v2Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v2Var.d = i2 - 2147483648;
                java.lang.Object obj = v2Var.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = v2Var.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.db.token.TokenDetailsDao tokenDetailsDao = this.b;
                    v2Var.f4326a = this;
                    v2Var.d = 1;
                    obj = tokenDetailsDao.getByNetworkTokenReference(str, v2Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.payair.db.TokenDetailsDaoInternal tokenDetailsDaoInternal = v2Var.f4326a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return b((com.payair.db.token.TokenDetailsEntry) obj);
            }
        }
        v2Var = new com.payair.csdk.v2(this, continuation);
        java.lang.Object obj2 = v2Var.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = v2Var.d;
        if (i != 0) {
        }
        return b((com.payair.db.token.TokenDetailsEntry) obj2);
    }

    @Override // com.payair.db.token.TokenDetailsDao
    public final java.lang.Object insert(com.payair.db.token.TokenDetailsEntry[] tokenDetailsEntryArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.payair.db.token.TokenDetailsEntry tokenDetailsEntry;
        java.io.File file = new java.io.File(this.f4349a.getFilesDir(), ASSETS_DIR_NAME);
        if (!file.exists()) {
            file.mkdirs();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(tokenDetailsEntryArr.length);
        for (com.payair.db.token.TokenDetailsEntry tokenDetailsEntry2 : tokenDetailsEntryArr) {
            com.payair.model.Asset asset = tokenDetailsEntry2.getAsset();
            if (asset != null) {
                java.io.File file2 = new java.io.File(file, a(tokenDetailsEntry2));
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                try {
                    byte[] bytes = asset.getRawData().getBytes(kotlin.text.Charsets.UTF_8);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
                    fileOutputStream.write(bytes);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                    tokenDetailsEntry = com.payair.db.token.TokenDetailsEntry.copy$default(tokenDetailsEntry2, null, null, null, null, null, com.payair.model.Asset.copy$default(asset, null, "", null, null, 13, null), file2.getPath(), 31, null);
                    if (tokenDetailsEntry != null) {
                        arrayList.add(tokenDetailsEntry);
                    }
                } finally {
                }
            }
            tokenDetailsEntry = tokenDetailsEntry2;
            arrayList.add(tokenDetailsEntry);
        }
        com.payair.db.token.TokenDetailsDao tokenDetailsDao = this.b;
        com.payair.db.token.TokenDetailsEntry[] tokenDetailsEntryArr2 = (com.payair.db.token.TokenDetailsEntry[]) arrayList.toArray(new com.payair.db.token.TokenDetailsEntry[0]);
        java.lang.Object insert = tokenDetailsDao.insert((com.payair.db.token.TokenDetailsEntry[]) java.util.Arrays.copyOf(tokenDetailsEntryArr2, tokenDetailsEntryArr2.length), continuation);
        return insert == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? insert : kotlin.Unit.INSTANCE;
    }

    @Override // com.payair.db.token.TokenDetailsDao
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.payair.db.token.TokenDetailsEntry>> observeAll() {
        final kotlinx.coroutines.flow.Flow<java.util.List<com.payair.db.token.TokenDetailsEntry>> observeAll = this.b.observeAll();
        return new kotlinx.coroutines.flow.Flow<java.util.List<? extends com.payair.db.token.TokenDetailsEntry>>() { // from class: com.payair.db.TokenDetailsDaoInternal$observeAll$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.payair.db.token.TokenDetailsEntry>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.payair.db.TokenDetailsDaoInternal$observeAll$$inlined$map$1.AnonymousClass2(flowCollector, this), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.payair.db.TokenDetailsDaoInternal$observeAll$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f4351a;
                public final /* synthetic */ com.payair.db.TokenDetailsDaoInternal b;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.payair.db.TokenDetailsDaoInternal$observeAll$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    com.payair.db.token.TokenDetailsEntry b;
                    if (continuation instanceof com.payair.db.TokenDetailsDaoInternal$observeAll$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.payair.db.TokenDetailsDaoInternal$observeAll$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        int i2 = anonymousClass1.b;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i2 - 2147483648;
                            java.lang.Object obj2 = anonymousClass1.f4352a;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.b;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.f4351a;
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                for (com.payair.db.token.TokenDetailsEntry tokenDetailsEntry : (java.util.List) obj) {
                                    com.payair.db.TokenDetailsDaoInternal tokenDetailsDaoInternal = this.b;
                                    b = com.payair.db.TokenDetailsDaoInternal.b(tokenDetailsEntry);
                                    if (b != null) {
                                        arrayList.add(b);
                                    }
                                }
                                anonymousClass1.b = 1;
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
                    anonymousClass1 = new com.payair.db.TokenDetailsDaoInternal$observeAll$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.f4352a;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.b;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.payair.db.TokenDetailsDaoInternal$observeAll$$inlined$map$1$2", f = "Database.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.payair.db.TokenDetailsDaoInternal$observeAll$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ java.lang.Object f4352a;
                    public int b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.f4352a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return com.payair.db.TokenDetailsDaoInternal$observeAll$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.payair.db.TokenDetailsDaoInternal tokenDetailsDaoInternal) {
                    this.f4351a = flowCollector;
                    this.b = tokenDetailsDaoInternal;
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.payair.db.token.TokenDetailsDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object delete(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.payair.csdk.t2 t2Var;
        java.lang.Object coroutine_suspended;
        int i;
        com.payair.db.TokenDetailsDaoInternal tokenDetailsDaoInternal;
        com.payair.db.token.TokenDetailsDao tokenDetailsDao;
        java.io.File file;
        java.lang.String assetPath;
        if (continuation instanceof com.payair.csdk.t2) {
            t2Var = (com.payair.csdk.t2) continuation;
            int i2 = t2Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t2Var.e = i2 - 2147483648;
                java.lang.Object obj = t2Var.c;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = t2Var.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.db.token.TokenDetailsDao tokenDetailsDao2 = this.b;
                    t2Var.f4317a = this;
                    t2Var.b = str;
                    t2Var.e = 1;
                    obj = tokenDetailsDao2.getByNetworkTokenReference(str, t2Var);
                    if (obj != coroutine_suspended) {
                        tokenDetailsDaoInternal = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    file = (java.io.File) t2Var.f4317a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (file != null) {
                        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(file.delete());
                    }
                    return kotlin.Unit.INSTANCE;
                }
                str = t2Var.b;
                tokenDetailsDaoInternal = (com.payair.db.TokenDetailsDaoInternal) t2Var.f4317a;
                kotlin.ResultKt.throwOnFailure(obj);
                com.payair.db.token.TokenDetailsEntry tokenDetailsEntry = (com.payair.db.token.TokenDetailsEntry) obj;
                java.io.File file2 = (tokenDetailsEntry != null || (assetPath = tokenDetailsEntry.getAssetPath()) == null) ? null : new java.io.File(assetPath);
                tokenDetailsDao = tokenDetailsDaoInternal.b;
                t2Var.f4317a = file2;
                t2Var.b = null;
                t2Var.e = 2;
                if (tokenDetailsDao.delete(str, t2Var) != coroutine_suspended) {
                    file = file2;
                    if (file != null) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        t2Var = new com.payair.csdk.t2(this, continuation);
        java.lang.Object obj2 = t2Var.c;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = t2Var.e;
        if (i != 0) {
        }
        com.payair.db.token.TokenDetailsEntry tokenDetailsEntry2 = (com.payair.db.token.TokenDetailsEntry) obj2;
        if (tokenDetailsEntry2 != null) {
        }
        tokenDetailsDao = tokenDetailsDaoInternal.b;
        t2Var.f4317a = file2;
        t2Var.b = null;
        t2Var.e = 2;
        if (tokenDetailsDao.delete(str, t2Var) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
