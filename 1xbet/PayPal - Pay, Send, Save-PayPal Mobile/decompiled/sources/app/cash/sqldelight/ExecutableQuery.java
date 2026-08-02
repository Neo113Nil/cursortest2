package app.cash.sqldelight;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b&\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0001\u0010\b2\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u0003H&¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0011\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lapp/cash/sqldelight/ExecutableQuery;", "", "RowType", "Lkotlin/Function1;", "Lapp/cash/sqldelight/db/SqlCursor;", "mapper", "<init>", "(Lkotlin/jvm/functions/Function1;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lapp/cash/sqldelight/db/QueryResult;", "execute", "(Lkotlin/jvm/functions/Function1;)Lapp/cash/sqldelight/db/QueryResult;", "", "executeAsList", "()Ljava/util/List;", "executeAsOne", "()Ljava/lang/Object;", "executeAsOneOrNull", "Lkotlin/jvm/functions/Function1;", "getMapper", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ExecutableQuery<RowType> {
    private final kotlin.jvm.functions.Function1<app.cash.sqldelight.db.SqlCursor, RowType> mapper;

    public abstract <R> app.cash.sqldelight.db.QueryResult<R> execute(kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlCursor, ? extends app.cash.sqldelight.db.QueryResult<R>> mapper);

    /* JADX WARN: Multi-variable type inference failed */
    public ExecutableQuery(kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlCursor, ? extends RowType> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.mapper = function1;
    }

    public final kotlin.jvm.functions.Function1<app.cash.sqldelight.db.SqlCursor, RowType> getMapper() {
        return this.mapper;
    }

    public final java.util.List<RowType> executeAsList() {
        return (java.util.List) execute(new kotlin.jvm.functions.Function1<app.cash.sqldelight.db.SqlCursor, app.cash.sqldelight.db.QueryResult<java.util.List<RowType>>>(this) { // from class: app.cash.sqldelight.ExecutableQuery$executeAsList$1
            final /* synthetic */ app.cash.sqldelight.ExecutableQuery<RowType> getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final app.cash.sqldelight.db.QueryResult<java.util.List<RowType>> invoke(app.cash.sqldelight.db.SqlCursor sqlCursor) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlCursor, "");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (sqlCursor.next().getValue().booleanValue()) {
                    arrayList.add(this.getHighSpeedVideoFpsRanges.getMapper().invoke(sqlCursor));
                }
                return app.cash.sqldelight.db.QueryResult.Value.m9520boximpl(app.cash.sqldelight.db.QueryResult.Value.m9521constructorimpl(arrayList));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.getHighSpeedVideoFpsRanges = this;
            }
        }).getValue();
    }

    public final RowType executeAsOne() {
        RowType executeAsOneOrNull = executeAsOneOrNull();
        if (executeAsOneOrNull != null) {
            return executeAsOneOrNull;
        }
        throw new java.lang.NullPointerException("ResultSet returned null for ".concat(java.lang.String.valueOf(this)));
    }

    public final RowType executeAsOneOrNull() {
        return (RowType) execute(new kotlin.jvm.functions.Function1<app.cash.sqldelight.db.SqlCursor, app.cash.sqldelight.db.QueryResult<RowType>>(this) { // from class: app.cash.sqldelight.ExecutableQuery$executeAsOneOrNull$1
            final /* synthetic */ app.cash.sqldelight.ExecutableQuery<RowType> getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final app.cash.sqldelight.db.QueryResult<RowType> invoke(app.cash.sqldelight.db.SqlCursor sqlCursor) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlCursor, "");
                if (!sqlCursor.next().getValue().booleanValue()) {
                    return app.cash.sqldelight.db.QueryResult.Value.m9520boximpl(app.cash.sqldelight.db.QueryResult.Value.m9521constructorimpl(null));
                }
                RowType invoke = this.getHighSpeedVideoFpsRanges.getMapper().invoke(sqlCursor);
                boolean booleanValue = sqlCursor.next().getValue().booleanValue();
                app.cash.sqldelight.ExecutableQuery<RowType> executableQuery = this.getHighSpeedVideoFpsRanges;
                if (booleanValue) {
                    throw new java.lang.IllegalStateException("ResultSet returned more than 1 row for ".concat(java.lang.String.valueOf(executableQuery)).toString());
                }
                return app.cash.sqldelight.db.QueryResult.Value.m9520boximpl(app.cash.sqldelight.db.QueryResult.Value.m9521constructorimpl(invoke));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.getHighSpeedVideoFpsRanges = this;
            }
        }).getValue();
    }
}
