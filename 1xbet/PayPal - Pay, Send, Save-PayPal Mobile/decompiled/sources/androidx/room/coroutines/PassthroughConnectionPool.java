package androidx.room.coroutines;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001#B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012D\b\u0002\u0010\u000b\u001a>\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006j\n\b\u0001\u0012\u0002\b\u0003\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJB\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cRP\u0010\u001f\u001a>\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006j\n\b\u0001\u0012\u0002\b\u0003\u0018\u0001`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\""}, d2 = {"Landroidx/room/coroutines/PassthroughConnectionPool;", "Landroidx/room/coroutines/ConnectionPool;", "Landroidx/sqlite/SQLiteDriver;", "driver", "", "fileName", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "Landroidx/room/coroutines/TransactionWrapper;", "transactionWrapper", "<init>", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "isReadOnly", "Landroidx/room/Transactor;", "block", "useConnection", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "close", "()V", "getHighSpeedVideoFpsRangesFor", "Landroidx/sqlite/SQLiteDriver;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "Landroidx/sqlite/SQLiteConnection;", "Lkotlin/Lazy;", "ConnectionElement"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassthroughConnectionPool implements androidx.room.coroutines.ConnectionPool {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy<androidx.database.SQLiteConnection> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.database.SQLiteDriver Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object>, kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public PassthroughConnectionPool(androidx.database.SQLiteDriver sQLiteDriver, java.lang.String str, kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object>, ? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteDriver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = sQLiteDriver;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.room.coroutines.PassthroughConnectionPool$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.database.SQLiteConnection open;
                open = r0.Camera2StreamConfigurationMap.open(androidx.room.coroutines.PassthroughConnectionPool.this.getHighSpeedVideoFpsRangesFor);
                return open;
            }
        });
    }

    public /* synthetic */ PassthroughConnectionPool(androidx.database.SQLiteDriver sQLiteDriver, java.lang.String str, kotlin.jvm.functions.Function2 function2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(sQLiteDriver, str, (i & 4) != 0 ? null : function2);
    }

    @Override // androidx.room.coroutines.ConnectionPool
    public final <R> java.lang.Object useConnection(boolean z, kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.room.coroutines.PassthroughConnectionPool.ConnectionElement connectionElement = (androidx.room.coroutines.PassthroughConnectionPool.ConnectionElement) continuation.getGetInputFormats().get(androidx.room.coroutines.PassthroughConnectionPool.ConnectionElement.INSTANCE);
        androidx.room.coroutines.PassthroughConnection getHighSpeedVideoFpsRangesFor = connectionElement != null ? connectionElement.getGetHighSpeedVideoFpsRangesFor() : null;
        if (getHighSpeedVideoFpsRangesFor != null) {
            return function2.invoke(getHighSpeedVideoFpsRangesFor, continuation);
        }
        androidx.room.coroutines.PassthroughConnection passthroughConnection = new androidx.room.coroutines.PassthroughConnection(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes.getValue());
        return kotlinx.coroutines.BuildersKt.withContext(new androidx.room.coroutines.PassthroughConnectionPool.ConnectionElement(passthroughConnection), new androidx.room.coroutines.PassthroughConnectionPool$useConnection$2(function2, passthroughConnection, null), continuation);
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public final void close() {
        if (this.getHighSpeedVideoSizes.isInitialized()) {
            this.getHighSpeedVideoSizes.getValue().close();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/room/coroutines/PassthroughConnectionPool$ConnectionElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "Landroidx/room/coroutines/PassthroughConnection;", "p0", "<init>", "(Landroidx/room/coroutines/PassthroughConnection;)V", "Camera2StreamConfigurationMap", "Landroidx/room/coroutines/PassthroughConnection;", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/room/coroutines/PassthroughConnection;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "Key"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class ConnectionElement implements kotlin.coroutines.CoroutineContext.Element {

        /* renamed from: Key, reason: from kotlin metadata */
        public static final androidx.room.coroutines.PassthroughConnectionPool.ConnectionElement.Companion INSTANCE = new androidx.room.coroutines.PassthroughConnectionPool.ConnectionElement.Companion(null);

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final androidx.room.coroutines.PassthroughConnection getHighSpeedVideoFpsRangesFor;

        public ConnectionElement(androidx.room.coroutines.PassthroughConnection passthroughConnection) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passthroughConnection, "");
            this.getHighSpeedVideoFpsRangesFor = passthroughConnection;
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public final <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
            return (R) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(this, r, function2);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public final <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
            return (E) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(this, key);
        }

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
        public final androidx.room.coroutines.PassthroughConnection getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public final kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(this, key);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public final kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/room/coroutines/PassthroughConnectionPool$ConnectionElement$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/room/coroutines/PassthroughConnectionPool$ConnectionElement;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: androidx.room.coroutines.PassthroughConnectionPool$ConnectionElement$Key, reason: from kotlin metadata */
        public static final class Companion implements kotlin.coroutines.CoroutineContext.Key<androidx.room.coroutines.PassthroughConnectionPool.ConnectionElement> {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // kotlin.coroutines.CoroutineContext.Element
        public final kotlin.coroutines.CoroutineContext.Key<androidx.room.coroutines.PassthroughConnectionPool.ConnectionElement> getKey() {
            return INSTANCE;
        }
    }
}
