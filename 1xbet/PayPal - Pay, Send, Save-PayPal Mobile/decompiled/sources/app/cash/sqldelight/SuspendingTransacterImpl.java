package app.cash.sqldelight;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JA\u0010\u0010\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\u0002\b\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\b\u001a\u00020\u00072-\u0010\u0014\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\u0002\b\u000eH\u0096@¢\u0006\u0004\b\u0015\u0010\u0011JM\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0016\u001a\u00020\u00072-\u0010\u0018\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\u0002\b\u000eH\u0082@¢\u0006\u0004\b\u0019\u0010\u0011"}, d2 = {"Lapp/cash/sqldelight/SuspendingTransacterImpl;", "Lapp/cash/sqldelight/BaseTransacterImpl;", "Lapp/cash/sqldelight/SuspendingTransacter;", "Lapp/cash/sqldelight/db/SqlDriver;", "driver", "<init>", "(Lapp/cash/sqldelight/db/SqlDriver;)V", "", "noEnclosing", "Lkotlin/Function2;", "Lapp/cash/sqldelight/SuspendingTransactionWithoutReturn;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "transaction", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lapp/cash/sqldelight/SuspendingTransactionWithReturn;", "bodyWithReturn", "transactionWithResult", "p0", "Lapp/cash/sqldelight/SuspendingTransactionWrapper;", "p1", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class SuspendingTransacterImpl extends app.cash.sqldelight.BaseTransacterImpl implements app.cash.sqldelight.SuspendingTransacter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingTransacterImpl(app.cash.sqldelight.db.SqlDriver sqlDriver) {
        super(sqlDriver);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlDriver, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(5:5|6|(1:(1:(1:(1:(2:12|(2:14|15)(2:17|18))(3:19|20|21))(3:22|23|24))(10:25|26|27|28|29|30|31|32|(3:34|23|24)|35))(1:45))(3:58|(1:60)|35)|46|(4:51|52|(6:54|29|30|31|32|(0))|35)(2:49|50)))|61|6|(0)(0)|46|(0)|51|52|(0)|35|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012f, code lost:
    
        r1 = r11;
        r0 = r2;
        r11 = r7;
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0115, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0116, code lost:
    
        r12 = r11;
        r11 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> java.lang.Object Camera2StreamConfigurationMap(boolean z, kotlin.jvm.functions.Function2<? super app.cash.sqldelight.SuspendingTransactionWrapper<R>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        app.cash.sqldelight.SuspendingTransacterImpl$transactionWithWrapper$1 suspendingTransacterImpl$transactionWithWrapper$1;
        java.lang.Object coroutine_suspended;
        int i;
        app.cash.sqldelight.SuspendingTransacterImpl suspendingTransacterImpl;
        app.cash.sqldelight.Transacter.Transaction transaction;
        app.cash.sqldelight.Transacter.Transaction enclosingTransaction$runtime;
        java.lang.Throwable th;
        java.lang.Object invoke;
        app.cash.sqldelight.Transacter.Transaction transaction2;
        app.cash.sqldelight.Transacter.Transaction transaction3;
        app.cash.sqldelight.db.QueryResult<kotlin.Unit> endTransaction$runtime;
        app.cash.sqldelight.Transacter.Transaction transaction4;
        app.cash.sqldelight.db.QueryResult<kotlin.Unit> endTransaction$runtime2;
        app.cash.sqldelight.Transacter.Transaction transaction5;
        java.lang.Object obj;
        app.cash.sqldelight.SuspendingTransacterImpl suspendingTransacterImpl2;
        if (continuation instanceof app.cash.sqldelight.SuspendingTransacterImpl$transactionWithWrapper$1) {
            suspendingTransacterImpl$transactionWithWrapper$1 = (app.cash.sqldelight.SuspendingTransacterImpl$transactionWithWrapper$1) continuation;
            if ((suspendingTransacterImpl$transactionWithWrapper$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                suspendingTransacterImpl$transactionWithWrapper$1.getOutputFormats -= 2147483648;
                java.lang.Object obj2 = suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoSizesFor;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = suspendingTransacterImpl$transactionWithWrapper$1.getOutputFormats;
                java.lang.Object obj3 = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    app.cash.sqldelight.db.QueryResult<app.cash.sqldelight.Transacter.Transaction> newTransaction = getDriver().newTransaction();
                    suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRanges = this;
                    suspendingTransacterImpl$transactionWithWrapper$1.Camera2StreamConfigurationMap = function2;
                    suspendingTransacterImpl$transactionWithWrapper$1.getOutputMinFrameDuration = z;
                    suspendingTransacterImpl$transactionWithWrapper$1.getOutputFormats = 1;
                    obj2 = newTransaction.await(suspendingTransacterImpl$transactionWithWrapper$1);
                    if (obj2 != coroutine_suspended) {
                        suspendingTransacterImpl = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            obj = suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoSizes;
                            transaction2 = (app.cash.sqldelight.Transacter.Transaction) suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRangesFor;
                            transaction5 = (app.cash.sqldelight.Transacter.Transaction) suspendingTransacterImpl$transactionWithWrapper$1.Camera2StreamConfigurationMap;
                            app.cash.sqldelight.SuspendingTransacterImpl suspendingTransacterImpl3 = (app.cash.sqldelight.SuspendingTransacterImpl) suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            suspendingTransacterImpl2 = suspendingTransacterImpl3;
                            return suspendingTransacterImpl2.postTransactionCleanup(transaction5, transaction2, null, obj);
                        }
                        if (i != 4) {
                            if (i != 5) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            java.lang.Object obj4 = suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoSizes;
                            app.cash.sqldelight.Transacter.Transaction transaction6 = (app.cash.sqldelight.Transacter.Transaction) suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRangesFor;
                            app.cash.sqldelight.Transacter.Transaction transaction7 = (app.cash.sqldelight.Transacter.Transaction) suspendingTransacterImpl$transactionWithWrapper$1.Camera2StreamConfigurationMap;
                            app.cash.sqldelight.SuspendingTransacterImpl suspendingTransacterImpl4 = (app.cash.sqldelight.SuspendingTransacterImpl) suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            return suspendingTransacterImpl4.postTransactionCleanup(transaction7, transaction6, null, obj4);
                        }
                        java.lang.Object obj5 = suspendingTransacterImpl$transactionWithWrapper$1.getHighResolutionOutputSizeshNQ4ISI;
                        th = (java.lang.Throwable) suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoSizes;
                        app.cash.sqldelight.Transacter.Transaction transaction8 = (app.cash.sqldelight.Transacter.Transaction) suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRangesFor;
                        app.cash.sqldelight.Transacter.Transaction transaction9 = (app.cash.sqldelight.Transacter.Transaction) suspendingTransacterImpl$transactionWithWrapper$1.Camera2StreamConfigurationMap;
                        app.cash.sqldelight.SuspendingTransacterImpl suspendingTransacterImpl5 = (app.cash.sqldelight.SuspendingTransacterImpl) suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        app.cash.sqldelight.SuspendingTransacterImpl suspendingTransacterImpl6 = suspendingTransacterImpl5;
                        return suspendingTransacterImpl6.postTransactionCleanup(transaction9, transaction8, th, obj5);
                    }
                    app.cash.sqldelight.Transacter.Transaction transaction10 = (app.cash.sqldelight.Transacter.Transaction) suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRangesFor;
                    app.cash.sqldelight.Transacter.Transaction transaction11 = (app.cash.sqldelight.Transacter.Transaction) suspendingTransacterImpl$transactionWithWrapper$1.Camera2StreamConfigurationMap;
                    suspendingTransacterImpl = (app.cash.sqldelight.SuspendingTransacterImpl) suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRanges;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        transaction3 = transaction11;
                        transaction2 = transaction10;
                        transaction4 = transaction3;
                    } catch (java.lang.Throwable th2) {
                        transaction = transaction11;
                        th = th2;
                        endTransaction$runtime = transaction.endTransaction$runtime();
                        suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRanges = suspendingTransacterImpl;
                        suspendingTransacterImpl$transactionWithWrapper$1.Camera2StreamConfigurationMap = transaction;
                        suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRangesFor = transaction10;
                        suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoSizes = th;
                        suspendingTransacterImpl$transactionWithWrapper$1.getHighResolutionOutputSizeshNQ4ISI = obj3;
                        suspendingTransacterImpl$transactionWithWrapper$1.getOutputFormats = 4;
                        if (endTransaction$runtime.await(suspendingTransacterImpl$transactionWithWrapper$1) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    try {
                        transaction4.setSuccessful$runtime(true);
                        endTransaction$runtime2 = transaction4.endTransaction$runtime();
                        suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRanges = suspendingTransacterImpl;
                        suspendingTransacterImpl$transactionWithWrapper$1.Camera2StreamConfigurationMap = transaction4;
                        suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRangesFor = transaction2;
                        suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoSizes = obj2;
                        suspendingTransacterImpl$transactionWithWrapper$1.getOutputFormats = 3;
                        if (endTransaction$runtime2.await(suspendingTransacterImpl$transactionWithWrapper$1) != coroutine_suspended) {
                            transaction5 = transaction4;
                            obj = obj2;
                            suspendingTransacterImpl2 = suspendingTransacterImpl;
                            return suspendingTransacterImpl2.postTransactionCleanup(transaction5, transaction2, null, obj);
                        }
                    } catch (java.lang.Throwable th3) {
                        obj3 = obj2;
                        transaction = transaction4;
                        transaction10 = transaction2;
                        th = th3;
                        endTransaction$runtime = transaction.endTransaction$runtime();
                        suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRanges = suspendingTransacterImpl;
                        suspendingTransacterImpl$transactionWithWrapper$1.Camera2StreamConfigurationMap = transaction;
                        suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRangesFor = transaction10;
                        suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoSizes = th;
                        suspendingTransacterImpl$transactionWithWrapper$1.getHighResolutionOutputSizeshNQ4ISI = obj3;
                        suspendingTransacterImpl$transactionWithWrapper$1.getOutputFormats = 4;
                        if (endTransaction$runtime.await(suspendingTransacterImpl$transactionWithWrapper$1) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    return coroutine_suspended;
                }
                z = suspendingTransacterImpl$transactionWithWrapper$1.getOutputMinFrameDuration;
                function2 = (kotlin.jvm.functions.Function2) suspendingTransacterImpl$transactionWithWrapper$1.Camera2StreamConfigurationMap;
                suspendingTransacterImpl = (app.cash.sqldelight.SuspendingTransacterImpl) suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj2);
                transaction = (app.cash.sqldelight.Transacter.Transaction) obj2;
                enclosingTransaction$runtime = transaction.enclosingTransaction$runtime();
                if (enclosingTransaction$runtime == null && z) {
                    throw new java.lang.IllegalStateException("Already in a transaction".toString());
                }
                transaction.setTransacter$runtime(suspendingTransacterImpl);
                app.cash.sqldelight.SuspendingTransactionWrapper suspendingTransactionWrapper = new app.cash.sqldelight.SuspendingTransactionWrapper(transaction);
                suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRanges = suspendingTransacterImpl;
                suspendingTransacterImpl$transactionWithWrapper$1.Camera2StreamConfigurationMap = transaction;
                suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRangesFor = enclosingTransaction$runtime;
                suspendingTransacterImpl$transactionWithWrapper$1.getOutputFormats = 2;
                invoke = function2.invoke(suspendingTransactionWrapper, suspendingTransacterImpl$transactionWithWrapper$1);
                if (invoke != coroutine_suspended) {
                    transaction2 = enclosingTransaction$runtime;
                    transaction3 = transaction;
                    obj2 = invoke;
                    transaction4 = transaction3;
                    transaction4.setSuccessful$runtime(true);
                    endTransaction$runtime2 = transaction4.endTransaction$runtime();
                    suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRanges = suspendingTransacterImpl;
                    suspendingTransacterImpl$transactionWithWrapper$1.Camera2StreamConfigurationMap = transaction4;
                    suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRangesFor = transaction2;
                    suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoSizes = obj2;
                    suspendingTransacterImpl$transactionWithWrapper$1.getOutputFormats = 3;
                    if (endTransaction$runtime2.await(suspendingTransacterImpl$transactionWithWrapper$1) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        suspendingTransacterImpl$transactionWithWrapper$1 = new app.cash.sqldelight.SuspendingTransacterImpl$transactionWithWrapper$1(this, continuation);
        java.lang.Object obj22 = suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoSizesFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = suspendingTransacterImpl$transactionWithWrapper$1.getOutputFormats;
        java.lang.Object obj32 = null;
        if (i != 0) {
        }
        transaction = (app.cash.sqldelight.Transacter.Transaction) obj22;
        enclosingTransaction$runtime = transaction.enclosingTransaction$runtime();
        if (enclosingTransaction$runtime == null) {
        }
        transaction.setTransacter$runtime(suspendingTransacterImpl);
        app.cash.sqldelight.SuspendingTransactionWrapper suspendingTransactionWrapper2 = new app.cash.sqldelight.SuspendingTransactionWrapper(transaction);
        suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRanges = suspendingTransacterImpl;
        suspendingTransacterImpl$transactionWithWrapper$1.Camera2StreamConfigurationMap = transaction;
        suspendingTransacterImpl$transactionWithWrapper$1.getHighSpeedVideoFpsRangesFor = enclosingTransaction$runtime;
        suspendingTransacterImpl$transactionWithWrapper$1.getOutputFormats = 2;
        invoke = function2.invoke(suspendingTransactionWrapper2, suspendingTransacterImpl$transactionWithWrapper$1);
        if (invoke != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    @Override // app.cash.sqldelight.SuspendingTransacter
    public java.lang.Object transaction(boolean z, kotlin.jvm.functions.Function2<? super app.cash.sqldelight.SuspendingTransactionWithoutReturn, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(z, function2, continuation);
        return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
    }

    @Override // app.cash.sqldelight.SuspendingTransacter
    public <R> java.lang.Object transactionWithResult(boolean z, kotlin.jvm.functions.Function2<? super app.cash.sqldelight.SuspendingTransactionWithReturn<R>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        return Camera2StreamConfigurationMap(z, function2, continuation);
    }
}
