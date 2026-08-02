package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class LegacyPagingSource$2$1 implements androidx.paging.DataSource.InvalidatedCallback, kotlin.jvm.internal.FunctionAdapter {
    final /* synthetic */ androidx.paging.LegacyPagingSource<Key, Value> Camera2StreamConfigurationMap;

    @Override // androidx.paging.DataSource.InvalidatedCallback
    public final void onInvalidated() {
        this.Camera2StreamConfigurationMap.invalidate();
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return new kotlin.jvm.internal.FunctionReferenceImpl(0, this.Camera2StreamConfigurationMap, androidx.paging.LegacyPagingSource.class, "invalidate", "invalidate()V", 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.paging.DataSource.InvalidatedCallback) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    LegacyPagingSource$2$1(androidx.paging.LegacyPagingSource<Key, Value> legacyPagingSource) {
        this.Camera2StreamConfigurationMap = legacyPagingSource;
    }
}
