package app.cash.sqldelight;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0001\u0010\u00112\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00120\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001b"}, d2 = {"Lapp/cash/sqldelight/SimpleExecutableQuery;", "", "RowType", "Lapp/cash/sqldelight/ExecutableQuery;", "", "p0", "Lapp/cash/sqldelight/db/SqlDriver;", "p1", "", "p2", "p3", "p4", "Lkotlin/Function1;", "Lapp/cash/sqldelight/db/SqlCursor;", "p5", "<init>", "(ILapp/cash/sqldelight/db/SqlDriver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lapp/cash/sqldelight/db/QueryResult;", "execute", "(Lkotlin/jvm/functions/Function1;)Lapp/cash/sqldelight/db/QueryResult;", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lapp/cash/sqldelight/db/SqlDriver;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SimpleExecutableQuery<RowType> extends app.cash.sqldelight.ExecutableQuery<RowType> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final app.cash.sqldelight.db.SqlDriver getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleExecutableQuery(int i, app.cash.sqldelight.db.SqlDriver sqlDriver, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlCursor, ? extends RowType> function1) {
        super(function1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlDriver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges = sqlDriver;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getHighSpeedVideoSizes = str3;
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final <R> app.cash.sqldelight.db.QueryResult<R> execute(kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlCursor, ? extends app.cash.sqldelight.db.QueryResult<R>> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return this.getHighSpeedVideoFpsRanges.executeQuery(java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap), this.getHighSpeedVideoSizes, p0, 0, null);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        return sb.toString();
    }
}
