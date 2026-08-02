package app.cash.sqldelight;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J0\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\u0006\u0010\b\u001a\u00020\u00072\u001d\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\b\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0015\u001a\u00020\u00072\u001d\u0010\u0017\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\b\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0014"}, d2 = {"Lapp/cash/sqldelight/TransacterImpl;", "Lapp/cash/sqldelight/BaseTransacterImpl;", "Lapp/cash/sqldelight/Transacter;", "Lapp/cash/sqldelight/db/SqlDriver;", "driver", "<init>", "(Lapp/cash/sqldelight/db/SqlDriver;)V", "", "noEnclosing", "Lkotlin/Function1;", "Lapp/cash/sqldelight/TransactionWithoutReturn;", "", "Lkotlin/ExtensionFunctionType;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "transaction", "(ZLkotlin/jvm/functions/Function1;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lapp/cash/sqldelight/TransactionWithReturn;", "bodyWithReturn", "transactionWithResult", "(ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "p0", "Lapp/cash/sqldelight/TransactionWrapper;", "p1", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class TransacterImpl extends app.cash.sqldelight.BaseTransacterImpl implements app.cash.sqldelight.Transacter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransacterImpl(app.cash.sqldelight.db.SqlDriver sqlDriver) {
        super(sqlDriver);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlDriver, "");
    }

    @Override // app.cash.sqldelight.Transacter
    public void transaction(boolean noEnclosing, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.TransactionWithoutReturn, kotlin.Unit> body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
        getHighSpeedVideoFpsRangesFor(noEnclosing, body);
    }

    @Override // app.cash.sqldelight.Transacter
    public <R> R transactionWithResult(boolean noEnclosing, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.TransactionWithReturn<R>, ? extends R> bodyWithReturn) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyWithReturn, "");
        return (R) getHighSpeedVideoFpsRangesFor(noEnclosing, bodyWithReturn);
    }

    private final <R> R getHighSpeedVideoFpsRangesFor(boolean p0, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.TransactionWrapper<R>, ? extends R> p1) {
        R r;
        app.cash.sqldelight.Transacter.Transaction value = getDriver().newTransaction().getValue();
        app.cash.sqldelight.Transacter.Transaction enclosingTransaction$runtime = value.enclosingTransaction$runtime();
        if (enclosingTransaction$runtime != null && p0) {
            throw new java.lang.IllegalStateException("Already in a transaction".toString());
        }
        java.lang.Throwable th = null;
        try {
            value.setTransacter$runtime(this);
            r = p1.invoke(new app.cash.sqldelight.TransactionWrapper(value));
            try {
                value.setSuccessful$runtime(true);
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Throwable th3) {
            r = null;
            th = th3;
        }
        value.endTransaction$runtime();
        return (R) postTransactionCleanup(value, enclosingTransaction$runtime, th, r);
    }
}
