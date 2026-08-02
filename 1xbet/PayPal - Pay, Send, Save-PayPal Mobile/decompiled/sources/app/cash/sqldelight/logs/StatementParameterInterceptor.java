package app.cash.sqldelight.logs;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lapp/cash/sqldelight/logs/StatementParameterInterceptor;", "Lapp/cash/sqldelight/db/SqlPreparedStatement;", "<init>", "()V", "", "index", "", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN, "", "bindBoolean", "(ILjava/lang/Boolean;)V", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "bindBytes", "(I[B)V", "", com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_DOUBLE, "bindDouble", "(ILjava/lang/Double;)V", "", com.adjust.sdk.Constants.LONG, "bindLong", "(ILjava/lang/Long;)V", "", "string", "bindString", "(ILjava/lang/String;)V", "", "", "getAndClearParameters", "()Ljava/util/List;", "", "getHighSpeedVideoFpsRanges", "Ljava/util/List;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StatementParameterInterceptor implements app.cash.sqldelight.db.SqlPreparedStatement {
    private final java.util.List<java.lang.Object> getHighSpeedVideoFpsRanges = new java.util.ArrayList();

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public final void bindBytes(int index, byte[] bytes) {
        this.getHighSpeedVideoFpsRanges.add(bytes);
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public final void bindDouble(int index, java.lang.Double r2) {
        this.getHighSpeedVideoFpsRanges.add(r2);
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public final void bindLong(int index, java.lang.Long r2) {
        this.getHighSpeedVideoFpsRanges.add(r2);
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public final void bindString(int index, java.lang.String string) {
        this.getHighSpeedVideoFpsRanges.add(string);
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public final void bindBoolean(int index, java.lang.Boolean r2) {
        this.getHighSpeedVideoFpsRanges.add(r2);
    }

    public final java.util.List<java.lang.Object> getAndClearParameters() {
        java.util.List<java.lang.Object> list = kotlin.collections.CollectionsKt.toList(this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRanges.clear();
        return list;
    }
}
