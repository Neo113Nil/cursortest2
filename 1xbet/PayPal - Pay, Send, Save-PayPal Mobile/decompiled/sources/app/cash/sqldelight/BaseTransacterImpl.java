package app.cash.sqldelight;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00062\u001e\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\r0\fH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lapp/cash/sqldelight/BaseTransacterImpl;", "", "Lapp/cash/sqldelight/db/SqlDriver;", "driver", "<init>", "(Lapp/cash/sqldelight/db/SqlDriver;)V", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "", "createArguments", "(I)Ljava/lang/String;", "identifier", "Lkotlin/Function1;", "", "tableProvider", "notifyQueries", "(ILkotlin/jvm/functions/Function1;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lapp/cash/sqldelight/Transacter$Transaction;", "transaction", "enclosing", "", "thrownException", "returnValue", "postTransactionCleanup", "(Lapp/cash/sqldelight/Transacter$Transaction;Lapp/cash/sqldelight/Transacter$Transaction;Ljava/lang/Throwable;Ljava/lang/Object;)Ljava/lang/Object;", "Lapp/cash/sqldelight/db/SqlDriver;", "getDriver", "()Lapp/cash/sqldelight/db/SqlDriver;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BaseTransacterImpl {
    private final app.cash.sqldelight.db.SqlDriver driver;

    public BaseTransacterImpl(app.cash.sqldelight.db.SqlDriver sqlDriver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlDriver, "");
        this.driver = sqlDriver;
    }

    public final app.cash.sqldelight.db.SqlDriver getDriver() {
        return this.driver;
    }

    protected final <R> R postTransactionCleanup(app.cash.sqldelight.Transacter.Transaction transaction, app.cash.sqldelight.Transacter.Transaction enclosing, java.lang.Throwable thrownException, R returnValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        boolean z = false;
        if (enclosing == null) {
            if (transaction.getSuccessful() && transaction.getChildrenSuccessful()) {
                if (!transaction.getPendingTables$runtime().isEmpty()) {
                    app.cash.sqldelight.db.SqlDriver sqlDriver = this.driver;
                    java.lang.String[] strArr = (java.lang.String[]) transaction.getPendingTables$runtime().toArray(new java.lang.String[0]);
                    sqlDriver.notifyListeners((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
                }
                transaction.getPendingTables$runtime().clear();
                transaction.getRegisteredQueries$runtime().clear();
                java.util.Iterator<T> it = transaction.getPostCommitHooks$runtime().iterator();
                while (it.hasNext()) {
                    ((kotlin.jvm.functions.Function0) it.next()).invoke();
                }
                transaction.getPostCommitHooks$runtime().clear();
            } else {
                try {
                    java.util.Iterator<T> it2 = transaction.getPostRollbackHooks$runtime().iterator();
                    while (it2.hasNext()) {
                        ((kotlin.jvm.functions.Function0) it2.next()).invoke();
                    }
                    transaction.getPostRollbackHooks$runtime().clear();
                } catch (java.lang.Throwable th) {
                    if (thrownException != null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception while rolling back from an exception.\nOriginal exception: ");
                        sb.append(thrownException);
                        sb.append("\nwith cause ");
                        sb.append(thrownException.getCause());
                        sb.append("\n\nRollback exception: ");
                        sb.append(th);
                        throw new java.lang.Throwable(sb.toString(), th);
                    }
                    throw th;
                }
            }
        } else {
            if (transaction.getSuccessful() && transaction.getChildrenSuccessful()) {
                z = true;
            }
            enclosing.setChildrenSuccessful$runtime(z);
            enclosing.getPostCommitHooks$runtime().addAll(transaction.getPostCommitHooks$runtime());
            enclosing.getPostRollbackHooks$runtime().addAll(transaction.getPostRollbackHooks$runtime());
            enclosing.getRegisteredQueries$runtime().addAll(transaction.getRegisteredQueries$runtime());
            enclosing.getPendingTables$runtime().addAll(transaction.getPendingTables$runtime());
        }
        if (enclosing == null && (thrownException instanceof app.cash.sqldelight.RollbackException)) {
            return (R) ((app.cash.sqldelight.RollbackException) thrownException).getHighSpeedVideoSizes;
        }
        if (thrownException == null) {
            return returnValue;
        }
        throw thrownException;
    }

    protected final void notifyQueries(int identifier, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.Unit> tableProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableProvider, "");
        final app.cash.sqldelight.Transacter.Transaction currentTransaction = this.driver.currentTransaction();
        if (currentTransaction != null) {
            if (currentTransaction.getRegisteredQueries$runtime().add(java.lang.Integer.valueOf(identifier))) {
                tableProvider.invoke(new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: app.cash.sqldelight.BaseTransacterImpl$notifyQueries$1
                    public final void Camera2StreamConfigurationMap(java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        app.cash.sqldelight.Transacter.Transaction.this.getPendingTables$runtime().add(str);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
                        Camera2StreamConfigurationMap(str);
                        return kotlin.Unit.INSTANCE;
                    }

                    {
                        super(1);
                    }
                });
            }
        } else {
            final java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            tableProvider.invoke(new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: app.cash.sqldelight.BaseTransacterImpl$notifyQueries$2
                public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                    linkedHashSet.add(str);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
                    getHighResolutionOutputSizeshNQ4ISI(str);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            app.cash.sqldelight.db.SqlDriver sqlDriver = this.driver;
            java.lang.String[] strArr = (java.lang.String[]) linkedHashSet.toArray(new java.lang.String[0]);
            sqlDriver.notifyListeners((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        }
    }

    public final java.lang.String createArguments(int count) {
        if (count == 0) {
            return "()";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(count + 2);
        sb.append("(?");
        for (int i = 0; i < count - 1; i++) {
            sb.append(",?");
        }
        sb.append(')');
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
