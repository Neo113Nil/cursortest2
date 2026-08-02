package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00162\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00162\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/payair/logic/managers/TransactionHistoryManagerSuspendImpl;", "", "Lcom/payair/logic/remote/repositories/TransactionHistoryRepository;", "transactionHistoryRepository", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSDK", "Lcom/payair/db/Database;", "database", "<init>", "(Lcom/payair/logic/remote/repositories/TransactionHistoryRepository;Lcom/payair/logic/implementation/HceSDKInterface;Lcom/payair/db/Database;)V", "", "networkTokenReference", "Lcom/payair/model/Response;", "updateTransactionHistory", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/Date;", "dateFrom", "dateTo", "", "Lcom/payair/db/transactionhistory/TransactionHistoryEntry;", "getTransactionHistory", "(Ljava/util/Date;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "observeTransactionHistory", "(Ljava/util/Date;Ljava/util/Date;)Lkotlinx/coroutines/flow/Flow;", "getTransactionHistoryForToken", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeTransactionHistoryForToken", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransactionHistoryManagerSuspendImpl {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.remote.repositories.TransactionHistoryRepository f4459a;
    public final com.payair.logic.implementation.HceSDKInterface b;
    public final com.payair.db.transactionhistory.TransactionHistoryEntryDao c;

    public TransactionHistoryManagerSuspendImpl(com.payair.logic.remote.repositories.TransactionHistoryRepository transactionHistoryRepository, com.payair.logic.implementation.HceSDKInterface hceSDKInterface, com.payair.db.Database database) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionHistoryRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "");
        this.f4459a = transactionHistoryRepository;
        this.b = hceSDKInterface;
        this.c = database.getTransactionHistoryDao();
    }

    public static /* synthetic */ java.lang.Object getTransactionHistory$default(com.payair.logic.managers.TransactionHistoryManagerSuspendImpl transactionHistoryManagerSuspendImpl, java.util.Date date, java.util.Date date2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            date = null;
        }
        if ((i & 2) != 0) {
            date2 = null;
        }
        return transactionHistoryManagerSuspendImpl.getTransactionHistory(date, date2, continuation);
    }

    public static /* synthetic */ java.lang.Object getTransactionHistoryForToken$default(com.payair.logic.managers.TransactionHistoryManagerSuspendImpl transactionHistoryManagerSuspendImpl, java.lang.String str, java.util.Date date, java.util.Date date2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            date = null;
        }
        if ((i & 4) != 0) {
            date2 = null;
        }
        return transactionHistoryManagerSuspendImpl.getTransactionHistoryForToken(str, date, date2, continuation);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow observeTransactionHistory$default(com.payair.logic.managers.TransactionHistoryManagerSuspendImpl transactionHistoryManagerSuspendImpl, java.util.Date date, java.util.Date date2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            date = null;
        }
        if ((i & 2) != 0) {
            date2 = null;
        }
        return transactionHistoryManagerSuspendImpl.observeTransactionHistory(date, date2);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow observeTransactionHistoryForToken$default(com.payair.logic.managers.TransactionHistoryManagerSuspendImpl transactionHistoryManagerSuspendImpl, java.lang.String str, java.util.Date date, java.util.Date date2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            date = null;
        }
        if ((i & 4) != 0) {
            date2 = null;
        }
        return transactionHistoryManagerSuspendImpl.observeTransactionHistoryForToken(str, date, date2);
    }

    public final java.lang.Object getTransactionHistory(java.util.Date date, java.util.Date date2, kotlin.coroutines.Continuation<? super java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> continuation) {
        return this.c.getAll(date, date2, continuation);
    }

    public final java.lang.Object getTransactionHistoryForToken(java.lang.String str, java.util.Date date, java.util.Date date2, kotlin.coroutines.Continuation<? super java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> continuation) {
        return this.c.getEntriesForToken(str, date, date2, continuation);
    }

    public final kotlinx.coroutines.flow.Flow<java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> observeTransactionHistory(java.util.Date dateFrom, java.util.Date dateTo) {
        return this.c.observeAll(dateFrom, dateTo);
    }

    public final kotlinx.coroutines.flow.Flow<java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> observeTransactionHistoryForToken(java.lang.String networkTokenReference, java.util.Date dateFrom, java.util.Date dateTo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        return this.c.observeEntriesForToken(networkTokenReference, dateFrom, dateTo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x014a, code lost:
    
        if (r1.insert(r2, r3) == r4) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateTransactionHistory(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.x3 x3Var;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        com.payair.logic.remote.repositories.TransactionHistoryRepository transactionHistoryRepository;
        java.lang.String paymentAppInstanceId;
        com.payair.logic.managers.TransactionHistoryManagerSuspendImpl transactionHistoryManagerSuspendImpl;
        java.lang.String str2;
        java.lang.String str3;
        com.payair.model.Response response;
        com.payair.db.transactionhistory.TransactionHistoryEntryDao transactionHistoryEntryDao;
        com.payair.logic.managers.TransactionHistoryManagerSuspendImpl transactionHistoryManagerSuspendImpl2;
        com.payair.db.transactionhistory.TransactionHistoryEntry[] transactionHistoryEntryArr;
        java.lang.String str4 = str;
        if (continuation instanceof com.payair.csdk.x3) {
            x3Var = (com.payair.csdk.x3) continuation;
            int i2 = x3Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x3Var.h = i2 - 2147483648;
                obj = x3Var.f;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = x3Var.h;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.i$default(com.payair.logging.LoggerKt.getLog(), "Updating transaction history", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, str4)), null, 4, null);
                    transactionHistoryRepository = this.f4459a;
                    paymentAppInstanceId = this.b.getPaymentAppInstanceId();
                    com.payair.db.transactionhistory.TransactionHistoryEntryDao transactionHistoryEntryDao2 = this.c;
                    x3Var.f4335a = this;
                    x3Var.b = str4;
                    x3Var.c = transactionHistoryRepository;
                    x3Var.d = paymentAppInstanceId;
                    x3Var.e = str4;
                    x3Var.h = 1;
                    obj = transactionHistoryEntryDao2.latestUpdate(x3Var);
                    if (obj != coroutine_suspended) {
                        transactionHistoryManagerSuspendImpl = this;
                        str2 = str4;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2) {
                        java.lang.String str5 = x3Var.b;
                        com.payair.logic.managers.TransactionHistoryManagerSuspendImpl transactionHistoryManagerSuspendImpl3 = x3Var.f4335a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        transactionHistoryManagerSuspendImpl = transactionHistoryManagerSuspendImpl3;
                        str3 = str5;
                        response = (com.payair.model.Response) obj;
                        transactionHistoryEntryDao = transactionHistoryManagerSuspendImpl.c;
                        x3Var.f4335a = transactionHistoryManagerSuspendImpl;
                        x3Var.b = str3;
                        x3Var.c = response;
                        x3Var.h = 3;
                        if (transactionHistoryEntryDao.deleteExpired(x3Var) != coroutine_suspended) {
                            transactionHistoryManagerSuspendImpl2 = transactionHistoryManagerSuspendImpl;
                            if (response instanceof com.payair.model.Response.Success) {
                            }
                            com.paypal.android.logger.Logger.w$default(com.payair.logging.LoggerKt.getLog(), "Failed to retrieve transaction history", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, str3)), null, 4, null);
                            return response;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return new com.payair.model.Response.Success(kotlin.Unit.INSTANCE);
                    }
                    response = (com.payair.model.Response) x3Var.c;
                    str3 = x3Var.b;
                    transactionHistoryManagerSuspendImpl2 = x3Var.f4335a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (response instanceof com.payair.model.Response.Success) {
                        com.payair.model.Response.Success success = (com.payair.model.Response.Success) response;
                        if (success.getData() instanceof java.util.List) {
                            com.paypal.android.logger.Logger.i$default(com.payair.logging.LoggerKt.getLog(), "Transaction history retrieved", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, kotlin.coroutines.jvm.internal.Boxing.boxInt(((java.util.List) success.getData()).size())), kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, str3)), null, 4, null);
                            java.lang.Object data = success.getData();
                            if (!(data instanceof java.util.List)) {
                                data = null;
                            }
                            java.util.List list = (java.util.List) data;
                            if (list == null || (transactionHistoryEntryArr = (com.payair.db.transactionhistory.TransactionHistoryEntry[]) list.toArray(new com.payair.db.transactionhistory.TransactionHistoryEntry[0])) == null) {
                                return response;
                            }
                            com.payair.db.transactionhistory.TransactionHistoryEntryDao transactionHistoryEntryDao3 = transactionHistoryManagerSuspendImpl2.c;
                            com.payair.db.transactionhistory.TransactionHistoryEntry[] transactionHistoryEntryArr2 = (com.payair.db.transactionhistory.TransactionHistoryEntry[]) java.util.Arrays.copyOf(transactionHistoryEntryArr, transactionHistoryEntryArr.length);
                            x3Var.f4335a = null;
                            x3Var.b = null;
                            x3Var.c = null;
                            x3Var.h = 4;
                        }
                    }
                    com.paypal.android.logger.Logger.w$default(com.payair.logging.LoggerKt.getLog(), "Failed to retrieve transaction history", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, str3)), null, 4, null);
                    return response;
                }
                str4 = x3Var.e;
                paymentAppInstanceId = x3Var.d;
                transactionHistoryRepository = (com.payair.logic.remote.repositories.TransactionHistoryRepository) x3Var.c;
                str2 = x3Var.b;
                transactionHistoryManagerSuspendImpl = x3Var.f4335a;
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.Date date = (java.util.Date) obj;
                java.lang.Long boxLong = date == null ? kotlin.coroutines.jvm.internal.Boxing.boxLong(date.getTime() / 1000) : null;
                x3Var.f4335a = transactionHistoryManagerSuspendImpl;
                x3Var.b = str2;
                x3Var.c = null;
                x3Var.d = null;
                x3Var.e = null;
                x3Var.h = 2;
                obj = transactionHistoryRepository.getTransactionHistory(paymentAppInstanceId, str4, boxLong, x3Var);
                if (obj != coroutine_suspended) {
                    str3 = str2;
                    response = (com.payair.model.Response) obj;
                    transactionHistoryEntryDao = transactionHistoryManagerSuspendImpl.c;
                    x3Var.f4335a = transactionHistoryManagerSuspendImpl;
                    x3Var.b = str3;
                    x3Var.c = response;
                    x3Var.h = 3;
                    if (transactionHistoryEntryDao.deleteExpired(x3Var) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        x3Var = new com.payair.csdk.x3(this, continuation);
        obj = x3Var.f;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = x3Var.h;
        if (i != 0) {
        }
        java.util.Date date2 = (java.util.Date) obj;
        if (date2 == null) {
        }
        x3Var.f4335a = transactionHistoryManagerSuspendImpl;
        x3Var.b = str2;
        x3Var.c = null;
        x3Var.d = null;
        x3Var.e = null;
        x3Var.h = 2;
        obj = transactionHistoryRepository.getTransactionHistory(paymentAppInstanceId, str4, boxLong, x3Var);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
