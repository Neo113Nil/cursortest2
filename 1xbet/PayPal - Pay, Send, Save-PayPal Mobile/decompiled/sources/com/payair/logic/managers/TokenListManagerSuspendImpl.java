package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001d\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0080@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001d\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012H\u0080@¢\u0006\u0004\b\u001d\u0010\u001f"}, d2 = {"Lcom/payair/logic/managers/TokenListManagerSuspendImpl;", "", "Lcom/payair/logic/remote/repositories/TokenRemoteRepository;", "tokenRemoteRepository", "Lcom/payair/logic/remote/repositories/UserRemoteRepository;", "userRemoteRepository", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSDK", "Lcom/payair/logic/managers/CoroutineDispatcherProvider;", "dispatcherProvider", "Lcom/payair/logic/storage/StorageService;", "storageService", "Lcom/payair/db/Database;", "database", "<init>", "(Lcom/payair/logic/remote/repositories/TokenRemoteRepository;Lcom/payair/logic/remote/repositories/UserRemoteRepository;Lcom/payair/logic/implementation/HceSDKInterface;Lcom/payair/logic/managers/CoroutineDispatcherProvider;Lcom/payair/logic/storage/StorageService;Lcom/payair/db/Database;)V", "", "forceRefresh", "", "Lcom/payair/model/TokenDetailsWithAsset;", "getAllTokensWithDetails", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "networkTokenReference", "getLocalTokenDetails", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/payair/model/NetworkTokenReference;", "networkTokenReferences", "refreshTokens$core_release", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TokenListManagerSuspendImpl {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.remote.repositories.TokenRemoteRepository f4457a;
    public final com.payair.logic.remote.repositories.UserRemoteRepository b;
    public final com.payair.logic.implementation.HceSDKInterface c;
    public final com.payair.logic.managers.CoroutineDispatcherProvider d;
    public final com.payair.logic.storage.StorageService e;
    public final com.payair.db.token.TokenDetailsDao f;

    public TokenListManagerSuspendImpl(com.payair.logic.remote.repositories.TokenRemoteRepository tokenRemoteRepository, com.payair.logic.remote.repositories.UserRemoteRepository userRemoteRepository, com.payair.logic.implementation.HceSDKInterface hceSDKInterface, com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider, com.payair.logic.storage.StorageService storageService, com.payair.db.Database database) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenRemoteRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userRemoteRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "");
        this.f4457a = tokenRemoteRepository;
        this.b = userRemoteRepository;
        this.c = hceSDKInterface;
        this.d = coroutineDispatcherProvider;
        this.e = storageService;
        this.f = database.getTokenDetailsDao();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (r2.a((java.util.List) r12, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.i3 i3Var;
        int i;
        com.payair.logic.managers.TokenListManagerSuspendImpl tokenListManagerSuspendImpl;
        if (continuation instanceof com.payair.csdk.i3) {
            i3Var = (com.payair.csdk.i3) continuation;
            int i2 = i3Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i3Var.d = i2 - 2147483648;
                java.lang.Object obj = i3Var.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = i3Var.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "Refreshing all tokens", null, null, 6, null);
                    com.payair.db.token.TokenDetailsDao tokenDetailsDao = this.f;
                    i3Var.f4265a = this;
                    i3Var.d = 1;
                    obj = tokenDetailsDao.getAll(i3Var);
                    if (obj != coroutine_suspended) {
                        tokenListManagerSuspendImpl = this;
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
                tokenListManagerSuspendImpl = i3Var.f4265a;
                kotlin.ResultKt.throwOnFailure(obj);
                i3Var.f4265a = null;
                i3Var.d = 2;
            }
        }
        i3Var = new com.payair.csdk.i3(this, continuation);
        java.lang.Object obj2 = i3Var.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = i3Var.d;
        if (i != 0) {
        }
        i3Var.f4265a = null;
        i3Var.d = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r7 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        if (a(r0) != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAllTokensWithDetails(boolean z, kotlin.coroutines.Continuation<? super java.util.List<com.payair.model.TokenDetailsWithAsset>> continuation) {
        com.payair.csdk.f3 f3Var;
        int i;
        com.payair.logic.managers.TokenListManagerSuspendImpl tokenListManagerSuspendImpl;
        if (continuation instanceof com.payair.csdk.f3) {
            f3Var = (com.payair.csdk.f3) continuation;
            int i2 = f3Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f3Var.d = i2 - 2147483648;
                java.lang.Object obj = f3Var.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = f3Var.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (z) {
                        f3Var.f4250a = this;
                        f3Var.d = 1;
                    }
                    tokenListManagerSuspendImpl = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        tokenListManagerSuspendImpl = f3Var.f4250a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.Iterable<com.payair.db.token.TokenDetailsEntry> iterable = (java.lang.Iterable) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                        for (com.payair.db.token.TokenDetailsEntry tokenDetailsEntry : iterable) {
                            arrayList.add(com.payair.db.token.TokenDetailsEntryKt.toTokenDetails(tokenDetailsEntry, tokenListManagerSuspendImpl.e.getTokenAlias(tokenDetailsEntry.getNetworkTokenReference())));
                        }
                        return arrayList;
                    }
                    tokenListManagerSuspendImpl = f3Var.f4250a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.payair.db.token.TokenDetailsDao tokenDetailsDao = tokenListManagerSuspendImpl.f;
                f3Var.f4250a = tokenListManagerSuspendImpl;
                f3Var.d = 2;
                obj = tokenDetailsDao.getAll(f3Var);
            }
        }
        f3Var = new com.payair.csdk.f3(this, continuation);
        java.lang.Object obj2 = f3Var.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = f3Var.d;
        if (i != 0) {
        }
        com.payair.db.token.TokenDetailsDao tokenDetailsDao2 = tokenListManagerSuspendImpl.f;
        f3Var.f4250a = tokenListManagerSuspendImpl;
        f3Var.d = 2;
        obj2 = tokenDetailsDao2.getAll(f3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r8 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (refreshTokens$core_release(r7, r0) != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getLocalTokenDetails(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super com.payair.model.TokenDetailsWithAsset> continuation) {
        com.payair.csdk.g3 g3Var;
        int i;
        com.payair.logic.managers.TokenListManagerSuspendImpl tokenListManagerSuspendImpl;
        if (continuation instanceof com.payair.csdk.g3) {
            g3Var = (com.payair.csdk.g3) continuation;
            int i2 = g3Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g3Var.e = i2 - 2147483648;
                java.lang.Object obj = g3Var.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = g3Var.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (z) {
                        java.util.List<java.lang.String> listOf = kotlin.collections.CollectionsKt.listOf(str);
                        g3Var.f4255a = this;
                        g3Var.b = str;
                        g3Var.e = 1;
                    }
                    tokenListManagerSuspendImpl = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = g3Var.b;
                        tokenListManagerSuspendImpl = g3Var.f4255a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.payair.db.token.TokenDetailsEntry tokenDetailsEntry = (com.payair.db.token.TokenDetailsEntry) obj;
                        if (tokenDetailsEntry != null) {
                            return com.payair.db.token.TokenDetailsEntryKt.toTokenDetails(tokenDetailsEntry, tokenListManagerSuspendImpl.e.getTokenAlias(str));
                        }
                        return null;
                    }
                    str = g3Var.b;
                    tokenListManagerSuspendImpl = g3Var.f4255a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.payair.db.token.TokenDetailsDao tokenDetailsDao = tokenListManagerSuspendImpl.f;
                g3Var.f4255a = tokenListManagerSuspendImpl;
                g3Var.b = str;
                g3Var.e = 2;
                obj = tokenDetailsDao.getByNetworkTokenReference(str, g3Var);
            }
        }
        g3Var = new com.payair.csdk.g3(this, continuation);
        java.lang.Object obj2 = g3Var.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = g3Var.e;
        if (i != 0) {
        }
        com.payair.db.token.TokenDetailsDao tokenDetailsDao2 = tokenListManagerSuspendImpl.f;
        g3Var.f4255a = tokenListManagerSuspendImpl;
        g3Var.b = str;
        g3Var.e = 2;
        obj2 = tokenDetailsDao2.getByNetworkTokenReference(str, g3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0066 -> B:16:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object refreshTokens$core_release(java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.payair.csdk.j3 j3Var;
        int i;
        java.util.Iterator it;
        com.payair.logic.managers.TokenListManagerSuspendImpl tokenListManagerSuspendImpl;
        java.util.List list2;
        if (continuation instanceof com.payair.csdk.j3) {
            j3Var = (com.payair.csdk.j3) continuation;
            int i2 = j3Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j3Var.f = i2 - 2147483648;
                java.lang.Object obj = j3Var.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = j3Var.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    it = list.iterator();
                    tokenListManagerSuspendImpl = this;
                    list2 = arrayList;
                    if (it.hasNext()) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                it = j3Var.c;
                list2 = j3Var.b;
                tokenListManagerSuspendImpl = j3Var.f4270a;
                kotlin.ResultKt.throwOnFailure(obj);
                com.payair.db.token.TokenDetailsEntry tokenDetailsEntry = (com.payair.db.token.TokenDetailsEntry) obj;
                if (tokenDetailsEntry != null) {
                    list2.add(tokenDetailsEntry);
                }
                if (it.hasNext()) {
                    j3Var.f4270a = null;
                    j3Var.b = null;
                    j3Var.c = null;
                    j3Var.f = 2;
                    java.lang.Object a2 = tokenListManagerSuspendImpl.a(list2, j3Var);
                    if (a2 != coroutine_suspended) {
                        return a2;
                    }
                } else {
                    java.lang.String str = (java.lang.String) it.next();
                    com.payair.db.token.TokenDetailsDao tokenDetailsDao = tokenListManagerSuspendImpl.f;
                    j3Var.f4270a = tokenListManagerSuspendImpl;
                    j3Var.b = list2;
                    j3Var.c = it;
                    j3Var.f = 1;
                    obj = tokenDetailsDao.getByNetworkTokenReference(str, j3Var);
                }
                return coroutine_suspended;
            }
        }
        j3Var = new com.payair.csdk.j3(this, continuation);
        java.lang.Object obj2 = j3Var.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = j3Var.f;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x005c, code lost:
    
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object access$updateToken(com.payair.logic.managers.TokenListManagerSuspendImpl tokenListManagerSuspendImpl, com.payair.db.token.TokenDetailsEntry tokenDetailsEntry, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.n3 n3Var;
        int i;
        com.payair.model.TokenDetails tokenDetails;
        com.payair.model.TokenDetails tokenDetails2;
        com.payair.model.Response response;
        java.util.List<com.payair.model.Asset> assets;
        if (continuation instanceof com.payair.csdk.n3) {
            n3Var = (com.payair.csdk.n3) continuation;
            int i2 = n3Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n3Var.e = i2 - 2147483648;
                java.lang.Object obj = n3Var.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = n3Var.e;
                com.payair.model.Asset asset = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String networkTokenReference = tokenDetailsEntry.getNetworkTokenReference();
                    n3Var.f4290a = tokenListManagerSuspendImpl;
                    n3Var.b = tokenDetailsEntry;
                    n3Var.e = 1;
                    obj = tokenListManagerSuspendImpl.a(networkTokenReference, n3Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        tokenDetails2 = (com.payair.model.TokenDetails) n3Var.b;
                        tokenDetailsEntry = (com.payair.db.token.TokenDetailsEntry) n3Var.f4290a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        response = (com.payair.model.Response) obj;
                        if (response != null) {
                            com.payair.model.Response.Success success = response instanceof com.payair.model.Response.Success ? (com.payair.model.Response.Success) response : null;
                            java.lang.Object data = success != null ? success.getData() : null;
                            if (!(data instanceof com.payair.model.MediaContents)) {
                                data = null;
                            }
                            com.payair.model.MediaContents mediaContents = (com.payair.model.MediaContents) data;
                            if (mediaContents != null && (assets = mediaContents.getAssets()) != null) {
                                asset = (com.payair.model.Asset) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) assets);
                                if (asset == null) {
                                    asset = tokenDetailsEntry.getAsset();
                                }
                                return com.payair.db.token.TokenDetailsEntryKt.toTokenDetailsEntry(tokenDetails2, asset);
                            }
                        }
                        tokenDetails = tokenDetails2;
                        tokenDetails2 = tokenDetails;
                        if (asset == null) {
                        }
                        return com.payair.db.token.TokenDetailsEntryKt.toTokenDetailsEntry(tokenDetails2, asset);
                    }
                    tokenDetailsEntry = (com.payair.db.token.TokenDetailsEntry) n3Var.b;
                    tokenListManagerSuspendImpl = (com.payair.logic.managers.TokenListManagerSuspendImpl) n3Var.f4290a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                tokenDetails = (com.payair.model.TokenDetails) obj;
                if (tokenDetails != null) {
                    return tokenDetailsEntry;
                }
                if (tokenDetails.getTokenStatus() == com.payair.model.TokenStatus.DEACTIVATED) {
                    return com.payair.db.token.TokenDetailsEntryKt.toTokenDetailsEntry(tokenDetails, tokenDetailsEntry.getAsset());
                }
                com.payair.model.ProductConfig productConfig = tokenDetailsEntry.getProductConfig();
                java.lang.String cardBackgroundCombinedAssetId = productConfig.getCardBackgroundCombinedAssetId();
                if (cardBackgroundCombinedAssetId == null) {
                    cardBackgroundCombinedAssetId = productConfig.getCardBackgroundAssetId();
                }
                com.payair.model.ProductConfig productConfig2 = tokenDetails.getProductConfig();
                java.lang.String cardBackgroundCombinedAssetId2 = productConfig2.getCardBackgroundCombinedAssetId();
                if (cardBackgroundCombinedAssetId2 == null) {
                    cardBackgroundCombinedAssetId2 = productConfig2.getCardBackgroundAssetId();
                }
                if (cardBackgroundCombinedAssetId2 != null) {
                    if (tokenDetailsEntry.getAssetPath() != null && kotlin.jvm.internal.Intrinsics.areEqual(cardBackgroundCombinedAssetId2, cardBackgroundCombinedAssetId)) {
                        cardBackgroundCombinedAssetId2 = null;
                    }
                    if (cardBackgroundCombinedAssetId2 != null) {
                        com.payair.logic.remote.repositories.UserRemoteRepository userRemoteRepository = tokenListManagerSuspendImpl.b;
                        java.lang.String value = tokenDetailsEntry.getScheme().getValue();
                        n3Var.f4290a = tokenDetailsEntry;
                        n3Var.b = tokenDetails;
                        n3Var.e = 2;
                        java.lang.Object assetAsync = userRemoteRepository.getAssetAsync(cardBackgroundCombinedAssetId2, value, n3Var);
                        if (assetAsync != coroutine_suspended) {
                            obj = assetAsync;
                            tokenDetails2 = tokenDetails;
                            response = (com.payair.model.Response) obj;
                            if (response != null) {
                            }
                            tokenDetails = tokenDetails2;
                        }
                        return coroutine_suspended;
                    }
                }
                tokenDetails2 = tokenDetails;
                if (asset == null) {
                }
                return com.payair.db.token.TokenDetailsEntryKt.toTokenDetailsEntry(tokenDetails2, asset);
            }
        }
        n3Var = new com.payair.csdk.n3(tokenListManagerSuspendImpl, continuation);
        java.lang.Object obj2 = n3Var.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = n3Var.e;
        com.payair.model.Asset asset2 = null;
        if (i != 0) {
        }
        tokenDetails = (com.payair.model.TokenDetails) obj2;
        if (tokenDetails != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r8.insert(r9, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.util.List list, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.k3 k3Var;
        int i;
        com.payair.logic.managers.TokenListManagerSuspendImpl tokenListManagerSuspendImpl;
        java.util.List list2;
        if (continuation instanceof com.payair.csdk.k3) {
            k3Var = (com.payair.csdk.k3) continuation;
            int i2 = k3Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k3Var.e = i2 - 2147483648;
                java.lang.Object obj = k3Var.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = k3Var.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineDispatcher iODispatcher = this.d.getIODispatcher();
                    com.payair.csdk.m3 m3Var = new com.payair.csdk.m3(list, this, null);
                    k3Var.f4275a = this;
                    k3Var.b = list;
                    k3Var.e = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(iODispatcher, m3Var, k3Var);
                    if (obj != coroutine_suspended) {
                        tokenListManagerSuspendImpl = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                }
                list = k3Var.b;
                tokenListManagerSuspendImpl = k3Var.f4275a;
                kotlin.ResultKt.throwOnFailure(obj);
                list2 = (java.util.List) obj;
                if (kotlin.jvm.internal.Intrinsics.areEqual(list2, list)) {
                    com.payair.db.token.TokenDetailsDao tokenDetailsDao = tokenListManagerSuspendImpl.f;
                    com.payair.db.token.TokenDetailsEntry[] tokenDetailsEntryArr = (com.payair.db.token.TokenDetailsEntry[]) list2.toArray(new com.payair.db.token.TokenDetailsEntry[0]);
                    com.payair.db.token.TokenDetailsEntry[] tokenDetailsEntryArr2 = (com.payair.db.token.TokenDetailsEntry[]) java.util.Arrays.copyOf(tokenDetailsEntryArr, tokenDetailsEntryArr.length);
                    k3Var.f4275a = null;
                    k3Var.b = null;
                    k3Var.e = 2;
                } else {
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                }
            }
        }
        k3Var = new com.payair.csdk.k3(this, continuation);
        java.lang.Object obj2 = k3Var.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = k3Var.e;
        if (i != 0) {
        }
        list2 = (java.util.List) obj2;
        if (kotlin.jvm.internal.Intrinsics.areEqual(list2, list)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.h3 h3Var;
        int i;
        if (continuation instanceof com.payair.csdk.h3) {
            h3Var = (com.payair.csdk.h3) continuation;
            int i2 = h3Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h3Var.c = i2 - 2147483648;
                java.lang.Object obj = h3Var.f4260a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = h3Var.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.logic.remote.repositories.TokenRemoteRepository tokenRemoteRepository = this.f4457a;
                    java.lang.String paymentAppInstanceId = this.c.getPaymentAppInstanceId();
                    h3Var.c = 1;
                    obj = tokenRemoteRepository.getTokenDetailsAsync(paymentAppInstanceId, str, h3Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.payair.model.Response response = (com.payair.model.Response) obj;
                com.payair.model.Response.Success success = !(response instanceof com.payair.model.Response.Success) ? (com.payair.model.Response.Success) response : null;
                java.lang.Object data = success == null ? success.getData() : null;
                return (com.payair.model.TokenDetails) (data instanceof com.payair.model.TokenDetails ? data : null);
            }
        }
        h3Var = new com.payair.csdk.h3(this, continuation);
        java.lang.Object obj2 = h3Var.f4260a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = h3Var.c;
        if (i != 0) {
        }
        com.payair.model.Response response2 = (com.payair.model.Response) obj2;
        if (!(response2 instanceof com.payair.model.Response.Success)) {
        }
        if (success == null) {
        }
        return (com.payair.model.TokenDetails) (data instanceof com.payair.model.TokenDetails ? data : null);
    }

    public final java.lang.Object refreshTokens$core_release(java.util.Set<com.payair.model.NetworkTokenReference> set, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10));
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.payair.model.NetworkTokenReference) it.next()).getNetworkTokenReference());
        }
        return refreshTokens$core_release(arrayList, continuation);
    }
}
