package androidx.room.support;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J!\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001d8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/room/support/QueryInterceptorProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "<init>", "()V", "", "index", "", "bindNull", "(I)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "bindLong", "(IJ)V", "", "bindDouble", "(ID)V", "", "bindString", "(ILjava/lang/String;)V", "", "bindBlob", "(I[B)V", "clearBindings", "close", "p0", "", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(ILjava/lang/Object;)V", "", "bindArgsCache", "Ljava/util/List;", "getBindArgsCache$room_runtime", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QueryInterceptorProgram implements androidx.database.db.SupportSQLiteProgram {
    private final java.util.List<java.lang.Object> bindArgsCache = new java.util.ArrayList();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final java.util.List<java.lang.Object> getBindArgsCache$room_runtime() {
        return this.bindArgsCache;
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public final void bindNull(int index) {
        getHighResolutionOutputSizeshNQ4ISI(index, null);
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public final void bindLong(int index, long value) {
        getHighResolutionOutputSizeshNQ4ISI(index, java.lang.Long.valueOf(value));
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public final void bindDouble(int index, double value) {
        getHighResolutionOutputSizeshNQ4ISI(index, java.lang.Double.valueOf(value));
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public final void bindString(int index, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        getHighResolutionOutputSizeshNQ4ISI(index, value);
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public final void bindBlob(int index, byte[] value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        getHighResolutionOutputSizeshNQ4ISI(index, value);
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public final void clearBindings() {
        this.bindArgsCache.clear();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(int p0, java.lang.Object p1) {
        int size;
        int i = p0 - 1;
        if (i >= this.bindArgsCache.size() && (size = this.bindArgsCache.size()) <= i) {
            while (true) {
                this.bindArgsCache.add(null);
                if (size == i) {
                    break;
                } else {
                    size++;
                }
            }
        }
        this.bindArgsCache.set(i, p1);
    }
}
