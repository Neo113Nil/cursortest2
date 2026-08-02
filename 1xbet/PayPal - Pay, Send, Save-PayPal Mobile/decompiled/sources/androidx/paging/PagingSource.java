package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002&'B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\u000bJ*\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH¦@¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010%\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b$\u0010 "}, d2 = {"Landroidx/paging/PagingSource;", "", "Key", "Value", "<init>", "()V", "", "invalidate", "Lkotlin/Function0;", "onInvalidatedCallback", "registerInvalidatedCallback", "(Lkotlin/jvm/functions/Function0;)V", "unregisterInvalidatedCallback", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Object;", "Landroidx/paging/InvalidateCallbackTracker;", "Camera2StreamConfigurationMap", "Landroidx/paging/InvalidateCallbackTracker;", "getHighResolutionOutputSizeshNQ4ISI", "", "getInvalidateCallbackCount$paging_common", "()I", "invalidateCallbackCount", "", "getJumpingSupported", "()Z", "jumpingSupported", "getKeyReuseSupported", "keyReuseSupported", "getInvalid", "invalid", "LoadParams", "LoadResult"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PagingSource<Key, Value> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.paging.InvalidateCallbackTracker<kotlin.jvm.functions.Function0<kotlin.Unit>> getHighResolutionOutputSizeshNQ4ISI = new androidx.paging.InvalidateCallbackTracker<>(new kotlin.jvm.functions.Function1() { // from class: androidx.paging.PagingSource$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.paging.PagingSource.m9264$r8$lambda$QH_Ke7KrVegUlXGwDwt5dbWi6Q((kotlin.jvm.functions.Function0) obj);
        }
    }, null, 2, 0 == true ? 1 : 0);

    public boolean getJumpingSupported() {
        return false;
    }

    public boolean getKeyReuseSupported() {
        return false;
    }

    public abstract Key getRefreshKey(androidx.paging.PagingState<Key, Value> state);

    public abstract java.lang.Object load(androidx.paging.PagingSource.LoadParams<Key> loadParams, kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<Key, Value>> continuation);

    public final int getInvalidateCallbackCount$paging_common() {
        return this.getHighResolutionOutputSizeshNQ4ISI.callbackCount$paging_common();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u0014*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\u0015\u0016\u0017\u0014B\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00018\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0003\u0018\u0019\u001a"}, d2 = {"Landroidx/paging/PagingSource$LoadParams;", "", "Key", "", "p0", "", "p1", "<init>", "(IZ)V", "loadSize", com.visa.cbp.getEncExpo.warmup, "getLoadSize", "()I", "placeholdersEnabled", "Z", "getPlaceholdersEnabled", "()Z", "getKey", "()Ljava/lang/Object;", "key", "Companion", com.google.common.net.HttpHeaders.REFRESH, "Append", "Prepend", "Landroidx/paging/PagingSource$LoadParams$Append;", "Landroidx/paging/PagingSource$LoadParams$Prepend;", "Landroidx/paging/PagingSource$LoadParams$Refresh;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class LoadParams<Key> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.paging.PagingSource.LoadParams.Companion INSTANCE = new androidx.paging.PagingSource.LoadParams.Companion(null);
        private final int loadSize;
        private final boolean placeholdersEnabled;

        public abstract Key getKey();

        private LoadParams(int i, boolean z) {
            this.loadSize = i;
            this.placeholdersEnabled = z;
        }

        public final int getLoadSize() {
            return this.loadSize;
        }

        public final boolean getPlaceholdersEnabled() {
            return this.placeholdersEnabled;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B!\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00018\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/paging/PagingSource$LoadParams$Refresh;", "", "Key", "Landroidx/paging/PagingSource$LoadParams;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Refresh<Key> extends androidx.paging.PagingSource.LoadParams<Key> {
            private final Key key;

            public Refresh(Key key, int i, boolean z) {
                super(i, z, null);
                this.key = key;
            }

            @Override // androidx.paging.PagingSource.LoadParams
            public final Key getKey() {
                return this.key;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00028\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/paging/PagingSource$LoadParams$Append;", "", "Key", "Landroidx/paging/PagingSource$LoadParams;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final class Append<Key> extends androidx.paging.PagingSource.LoadParams<Key> {
            private final Key key;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Append(Key key, int i, boolean z) {
                super(i, z, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
                this.key = key;
            }

            @Override // androidx.paging.PagingSource.LoadParams
            public final Key getKey() {
                return this.key;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00028\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/paging/PagingSource$LoadParams$Prepend;", "", "Key", "Landroidx/paging/PagingSource$LoadParams;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final class Prepend<Key> extends androidx.paging.PagingSource.LoadParams<Key> {
            private final Key key;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Prepend(Key key, int i, boolean z) {
                super(i, z, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
                this.key = key;
            }

            @Override // androidx.paging.PagingSource.LoadParams
            public final Key getKey() {
                return this.key;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00030\f\"\b\b\u0003\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00018\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/paging/PagingSource$LoadParams$Companion;", "", "<init>", "()V", "Key", "Landroidx/paging/LoadType;", "loadType", "key", "", "loadSize", "", "placeholdersEnabled", "Landroidx/paging/PagingSource$LoadParams;", "create", "(Landroidx/paging/LoadType;Ljava/lang/Object;IZ)Landroidx/paging/PagingSource$LoadParams;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            private Companion() {
            }

            public final <Key> androidx.paging.PagingSource.LoadParams<Key> create(androidx.paging.LoadType loadType, Key key, int loadSize, boolean placeholdersEnabled) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
                int i = androidx.paging.PagingSource.LoadParams.Companion.WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
                if (i == 1) {
                    return new androidx.paging.PagingSource.LoadParams.Refresh(key, loadSize, placeholdersEnabled);
                }
                if (i == 2) {
                    if (key != null) {
                        return new androidx.paging.PagingSource.LoadParams.Prepend(key, loadSize, placeholdersEnabled);
                    }
                    throw new java.lang.IllegalArgumentException("key cannot be null for prepend".toString());
                }
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (key != null) {
                    return new androidx.paging.PagingSource.LoadParams.Append(key, loadSize, placeholdersEnabled);
                }
                throw new java.lang.IllegalArgumentException("key cannot be null for append".toString());
            }

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[androidx.paging.LoadType.values().length];
                    try {
                        iArr[androidx.paging.LoadType.REFRESH.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[androidx.paging.LoadType.PREPEND.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[androidx.paging.LoadType.APPEND.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ LoadParams(int i, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b"}, d2 = {"Landroidx/paging/PagingSource$LoadResult;", "", "Key", "Value", "<init>", "()V", "Error", "Invalid", "Page", "Landroidx/paging/PagingSource$LoadResult$Error;", "Landroidx/paging/PagingSource$LoadResult$Invalid;", "Landroidx/paging/PagingSource$LoadResult$Page;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class LoadResult<Key, Value> {
        private LoadResult() {
        }

        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\r"}, d2 = {"Landroidx/paging/PagingSource$LoadResult$Error;", "", "Key", "Value", "Landroidx/paging/PagingSource$LoadResult;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Landroidx/paging/PagingSource$LoadResult$Error;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error<Key, Value> extends androidx.paging.PagingSource.LoadResult<Key, Value> {
            private final java.lang.Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(java.lang.Throwable th) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                this.throwable = th;
            }

            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadResult.Error(\n                    |   throwable: ");
                sb.append(this.throwable);
                sb.append("\n                    |) ");
                return kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null);
            }

            public final int hashCode() {
                return this.throwable.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof androidx.paging.PagingSource.LoadResult.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, ((androidx.paging.PagingSource.LoadResult.Error) other).throwable);
            }

            public final androidx.paging.PagingSource.LoadResult.Error<Key, Value> copy(java.lang.Throwable throwable) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
                return new androidx.paging.PagingSource.LoadResult.Error<>(throwable);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            public static /* synthetic */ androidx.paging.PagingSource.LoadResult.Error copy$default(androidx.paging.PagingSource.LoadResult.Error error, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = error.throwable;
                }
                return error.copy(th);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/paging/PagingSource$LoadResult$Invalid;", "", "Key", "Value", "Landroidx/paging/PagingSource$LoadResult;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Invalid<Key, Value> extends androidx.paging.PagingSource.LoadResult<Key, Value> {
            public Invalid() {
                super(null);
            }

            public final java.lang.String toString() {
                return "LoadResult.Invalid";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 -*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00042\b\u0012\u0004\u0012\u00028\u00050\u0005:\u0001-B=\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00050\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eB+\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00050\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0004¢\u0006\u0004\b\r\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00050\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00050\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00018\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00018\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJX\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00050\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00050\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00018\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00018\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b)\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u001cR\u001a\u0010\f\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b,\u0010\u001c"}, d2 = {"Landroidx/paging/PagingSource$LoadResult$Page;", "", "Key", "Value", "Landroidx/paging/PagingSource$LoadResult;", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "prevKey", "nextKey", "", "itemsBefore", "itemsAfter", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "", "iterator", "()Ljava/util/Iterator;", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Object;", "component3", "component4", "()I", "component5", "copy", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)Landroidx/paging/PagingSource$LoadResult$Page;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Ljava/util/List;", "getData", "Ljava/lang/Object;", "getPrevKey", "getNextKey", com.visa.cbp.getEncExpo.warmup, "getItemsBefore", "getItemsAfter", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final /* data */ class Page<Key, Value> extends androidx.paging.PagingSource.LoadResult<Key, Value> implements java.lang.Iterable<Value>, kotlin.jvm.internal.markers.KMappedMarker {
            public static final int COUNT_UNDEFINED = Integer.MIN_VALUE;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final androidx.paging.PagingSource.LoadResult.Page.Companion INSTANCE = new androidx.paging.PagingSource.LoadResult.Page.Companion(null);
            private static final androidx.paging.PagingSource.LoadResult.Page EMPTY = new androidx.paging.PagingSource.LoadResult.Page(kotlin.collections.CollectionsKt.emptyList(), null, null, 0, 0);
            private final java.util.List<Value> data;
            private final int itemsAfter;
            private final int itemsBefore;
            private final Key nextKey;
            private final Key prevKey;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Page(java.util.List<? extends Value> list, Key key, Key key2, int i, int i2) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.data = list;
                this.prevKey = key;
                this.nextKey = key2;
                this.itemsBefore = i;
                this.itemsAfter = i2;
                if (i != Integer.MIN_VALUE && i < 0) {
                    throw new java.lang.IllegalArgumentException("itemsBefore cannot be negative".toString());
                }
                if (i2 != Integer.MIN_VALUE && i2 < 0) {
                    throw new java.lang.IllegalArgumentException("itemsAfter cannot be negative".toString());
                }
            }

            public /* synthetic */ Page(java.util.List list, java.lang.Object obj, java.lang.Object obj2, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(list, obj, obj2, (i3 & 8) != 0 ? Integer.MIN_VALUE : i, (i3 & 16) != 0 ? Integer.MIN_VALUE : i2);
            }

            public final java.util.List<Value> getData() {
                return this.data;
            }

            public final Key getPrevKey() {
                return this.prevKey;
            }

            public final Key getNextKey() {
                return this.nextKey;
            }

            public final int getItemsBefore() {
                return this.itemsBefore;
            }

            public final int getItemsAfter() {
                return this.itemsAfter;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Page(java.util.List<? extends Value> list, Key key, Key key2) {
                this(list, key, key2, Integer.MIN_VALUE, Integer.MIN_VALUE);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            }

            @Override // java.lang.Iterable
            public final java.util.Iterator<Value> iterator() {
                return this.data.listIterator();
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadResult.Page(\n                    |   data size: ");
                sb.append(this.data.size());
                sb.append("\n                    |   first Item: ");
                sb.append(kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.data));
                sb.append("\n                    |   last Item: ");
                sb.append(kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this.data));
                sb.append("\n                    |   nextKey: ");
                sb.append(this.nextKey);
                sb.append("\n                    |   prevKey: ");
                sb.append(this.prevKey);
                sb.append("\n                    |   itemsBefore: ");
                sb.append(this.itemsBefore);
                sb.append("\n                    |   itemsAfter: ");
                sb.append(this.itemsAfter);
                sb.append("\n                    |) ");
                return kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null);
            }

            @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0006\"\b\b\u0006\u0010\u0004*\u00020\u0001\"\b\b\u0007\u0010\u0005*\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u00068\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\b"}, d2 = {"Landroidx/paging/PagingSource$LoadResult$Page$Companion;", "", "<init>", "()V", "Key", "Value", "Landroidx/paging/PagingSource$LoadResult$Page;", "empty$paging_common", "()Landroidx/paging/PagingSource$LoadResult$Page;", "", "COUNT_UNDEFINED", com.visa.cbp.getEncExpo.warmup, "", "EMPTY", "Landroidx/paging/PagingSource$LoadResult$Page;", "getEMPTY$paging_common", "getEMPTY$paging_common$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes7.dex */
            public static final class Companion {
                public static /* synthetic */ void getEMPTY$paging_common$annotations() {
                }

                private Companion() {
                }

                public final androidx.paging.PagingSource.LoadResult.Page getEMPTY$paging_common() {
                    return androidx.paging.PagingSource.LoadResult.Page.EMPTY;
                }

                public final <Key, Value> androidx.paging.PagingSource.LoadResult.Page<Key, Value> empty$paging_common() {
                    androidx.paging.PagingSource.LoadResult.Page<Key, Value> eMPTY$paging_common = getEMPTY$paging_common();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(eMPTY$paging_common, "");
                    return eMPTY$paging_common;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final int hashCode() {
                int hashCode = this.data.hashCode();
                Key key = this.prevKey;
                int hashCode2 = key == null ? 0 : key.hashCode();
                Key key2 = this.nextKey;
                return (((((((hashCode * 31) + hashCode2) * 31) + (key2 != null ? key2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.itemsBefore)) * 31) + java.lang.Integer.hashCode(this.itemsAfter);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof androidx.paging.PagingSource.LoadResult.Page)) {
                    return false;
                }
                androidx.paging.PagingSource.LoadResult.Page page = (androidx.paging.PagingSource.LoadResult.Page) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.data, page.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.prevKey, page.prevKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.nextKey, page.nextKey) && this.itemsBefore == page.itemsBefore && this.itemsAfter == page.itemsAfter;
            }

            public final androidx.paging.PagingSource.LoadResult.Page<Key, Value> copy(java.util.List<? extends Value> data, Key prevKey, Key nextKey, int itemsBefore, int itemsAfter) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                return new androidx.paging.PagingSource.LoadResult.Page<>(data, prevKey, nextKey, itemsBefore, itemsAfter);
            }

            /* renamed from: component5, reason: from getter */
            public final int getItemsAfter() {
                return this.itemsAfter;
            }

            /* renamed from: component4, reason: from getter */
            public final int getItemsBefore() {
                return this.itemsBefore;
            }

            public final Key component3() {
                return this.nextKey;
            }

            public final Key component2() {
                return this.prevKey;
            }

            public final java.util.List<Value> component1() {
                return this.data;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ androidx.paging.PagingSource.LoadResult.Page copy$default(androidx.paging.PagingSource.LoadResult.Page page, java.util.List list, java.lang.Object obj, java.lang.Object obj2, int i, int i2, int i3, java.lang.Object obj3) {
                if ((i3 & 1) != 0) {
                    list = page.data;
                }
                Key key = obj;
                if ((i3 & 2) != 0) {
                    key = page.prevKey;
                }
                Key key2 = key;
                Key key3 = obj2;
                if ((i3 & 4) != 0) {
                    key3 = page.nextKey;
                }
                Key key4 = key3;
                if ((i3 & 8) != 0) {
                    i = page.itemsBefore;
                }
                int i4 = i;
                if ((i3 & 16) != 0) {
                    i2 = page.itemsAfter;
                }
                return page.copy(list, key2, key4, i4, i2);
            }
        }

        public /* synthetic */ LoadResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean getInvalid() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getInvalid();
    }

    public final void invalidate() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.invalidate$paging_common()) {
            androidx.paging.PagingLogger pagingLogger = androidx.paging.PagingLogger.INSTANCE;
            if (pagingLogger.isLoggable(3)) {
                pagingLogger.log(3, "Invalidated PagingSource ".concat(java.lang.String.valueOf(this)), null);
            }
        }
    }

    public final void registerInvalidatedCallback(kotlin.jvm.functions.Function0<kotlin.Unit> onInvalidatedCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onInvalidatedCallback, "");
        this.getHighResolutionOutputSizeshNQ4ISI.registerInvalidatedCallback$paging_common(onInvalidatedCallback);
    }

    public final void unregisterInvalidatedCallback(kotlin.jvm.functions.Function0<kotlin.Unit> onInvalidatedCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onInvalidatedCallback, "");
        this.getHighResolutionOutputSizeshNQ4ISI.unregisterInvalidatedCallback$paging_common(onInvalidatedCallback);
    }

    /* renamed from: $r8$lambda$QH_Ke7-KrVegUlXGwDwt5dbWi6Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9264$r8$lambda$QH_Ke7KrVegUlXGwDwt5dbWi6Q(kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
