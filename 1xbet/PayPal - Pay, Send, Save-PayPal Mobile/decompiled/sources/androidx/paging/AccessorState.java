package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R&\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0019\u001a\u00020\u001b8\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c"}, d2 = {"Landroidx/paging/AccessorState;", "", "Key", "Value", "<init>", "()V", "Landroidx/paging/LoadStates;", "Camera2StreamConfigurationMap", "()Landroidx/paging/LoadStates;", "Landroidx/paging/LoadType;", "p0", "Landroidx/paging/LoadState;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/paging/LoadType;)Landroidx/paging/LoadState;", "Lkotlin/Pair;", "Landroidx/paging/PagingState;", "getHighSpeedVideoSizes", "()Lkotlin/Pair;", "", "Landroidx/paging/AccessorState$BlockState;", "[Landroidx/paging/AccessorState$BlockState;", "Landroidx/paging/LoadState$Error;", "[Landroidx/paging/LoadState$Error;", "Lkotlin/collections/ArrayDeque;", "Landroidx/paging/AccessorState$PendingRequest;", "getHighSpeedVideoFpsRanges", "Lkotlin/collections/ArrayDeque;", "", "Z", "PendingRequest", "BlockState"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AccessorState<Key, Value> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final kotlin.collections.ArrayDeque<androidx.paging.AccessorState.PendingRequest<Key, Value>> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final androidx.paging.LoadState.Error[] getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final androidx.paging.AccessorState.BlockState[] getHighSpeedVideoFpsRangesFor;

    public AccessorState() {
        int length = androidx.paging.LoadType.values().length;
        androidx.paging.AccessorState.BlockState[] blockStateArr = new androidx.paging.AccessorState.BlockState[length];
        for (int i = 0; i < length; i++) {
            blockStateArr[i] = androidx.paging.AccessorState.BlockState.UNBLOCKED;
        }
        this.getHighSpeedVideoFpsRangesFor = blockStateArr;
        int length2 = androidx.paging.LoadType.values().length;
        androidx.paging.LoadState.Error[] errorArr = new androidx.paging.LoadState.Error[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            errorArr[i2] = null;
        }
        this.getHighSpeedVideoSizes = errorArr;
        this.Camera2StreamConfigurationMap = new kotlin.collections.ArrayDeque<>();
    }

    public final androidx.paging.LoadStates Camera2StreamConfigurationMap() {
        return new androidx.paging.LoadStates(getHighSpeedVideoFpsRangesFor(androidx.paging.LoadType.REFRESH), getHighSpeedVideoFpsRangesFor(androidx.paging.LoadType.PREPEND), getHighSpeedVideoFpsRangesFor(androidx.paging.LoadType.APPEND));
    }

    private final androidx.paging.LoadState getHighSpeedVideoFpsRangesFor(androidx.paging.LoadType p0) {
        androidx.paging.LoadState.NotLoading complete$paging_common;
        androidx.paging.AccessorState.BlockState blockState = this.getHighSpeedVideoFpsRangesFor[p0.ordinal()];
        kotlin.collections.ArrayDeque<androidx.paging.AccessorState.PendingRequest<Key, Value>> arrayDeque = this.Camera2StreamConfigurationMap;
        if (!(arrayDeque instanceof java.util.Collection) || !arrayDeque.isEmpty()) {
            java.util.Iterator<androidx.paging.AccessorState.PendingRequest<Key, Value>> it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().getLoadType() == p0) {
                    if (blockState != androidx.paging.AccessorState.BlockState.REQUIRES_REFRESH) {
                        return androidx.paging.LoadState.Loading.INSTANCE;
                    }
                }
            }
        }
        androidx.paging.LoadState.Error error = this.getHighSpeedVideoSizes[p0.ordinal()];
        if (error != null) {
            return error;
        }
        int i = androidx.paging.AccessorState.WhenMappings.$EnumSwitchMapping$1[blockState.ordinal()];
        if (i == 1) {
            if (androidx.paging.AccessorState.WhenMappings.$EnumSwitchMapping$0[p0.ordinal()] == 1) {
                complete$paging_common = androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common();
            } else {
                complete$paging_common = androidx.paging.LoadState.NotLoading.INSTANCE.getComplete$paging_common();
            }
            return complete$paging_common;
        }
        if (i == 2) {
            return androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common();
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common();
    }

    public final kotlin.Pair<androidx.paging.LoadType, androidx.paging.PagingState<Key, Value>> getHighSpeedVideoSizes() {
        androidx.paging.AccessorState.PendingRequest<Key, Value> pendingRequest;
        java.util.Iterator<androidx.paging.AccessorState.PendingRequest<Key, Value>> it = this.Camera2StreamConfigurationMap.iterator();
        while (true) {
            if (!it.hasNext()) {
                pendingRequest = null;
                break;
            }
            pendingRequest = it.next();
            androidx.paging.AccessorState.PendingRequest<Key, Value> pendingRequest2 = pendingRequest;
            if (pendingRequest2.getLoadType() != androidx.paging.LoadType.REFRESH && this.getHighSpeedVideoFpsRangesFor[pendingRequest2.getLoadType().ordinal()] == androidx.paging.AccessorState.BlockState.UNBLOCKED) {
                break;
            }
        }
        androidx.paging.AccessorState.PendingRequest<Key, Value> pendingRequest3 = pendingRequest;
        if (pendingRequest3 != null) {
            return kotlin.TuplesKt.to(pendingRequest3.getLoadType(), pendingRequest3.getPagingState());
        }
        return null;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/paging/AccessorState$PendingRequest;", "", "Key", "Value", "Landroidx/paging/LoadType;", "loadType", "Landroidx/paging/PagingState;", "pagingState", "<init>", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;)V", "Landroidx/paging/LoadType;", "getLoadType", "()Landroidx/paging/LoadType;", "Landroidx/paging/PagingState;", "getPagingState", "()Landroidx/paging/PagingState;", "setPagingState", "(Landroidx/paging/PagingState;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PendingRequest<Key, Value> {
        private final androidx.paging.LoadType loadType;
        private androidx.paging.PagingState<Key, Value> pagingState;

        public PendingRequest(androidx.paging.LoadType loadType, androidx.paging.PagingState<Key, Value> pagingState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingState, "");
            this.loadType = loadType;
            this.pagingState = pagingState;
        }

        public final androidx.paging.LoadType getLoadType() {
            return this.loadType;
        }

        public final androidx.paging.PagingState<Key, Value> getPagingState() {
            return this.pagingState;
        }

        public final void setPagingState(androidx.paging.PagingState<Key, Value> pagingState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingState, "");
            this.pagingState = pagingState;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/paging/AccessorState$BlockState;", "", "<init>", "(Ljava/lang/String;I)V", "UNBLOCKED", "COMPLETED", "REQUIRES_REFRESH"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BlockState {
        public static final androidx.paging.AccessorState.BlockState COMPLETED;
        public static final androidx.paging.AccessorState.BlockState REQUIRES_REFRESH;
        public static final androidx.paging.AccessorState.BlockState UNBLOCKED;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ androidx.paging.AccessorState.BlockState[] getHighSpeedVideoSizes;

        private BlockState(java.lang.String str, int i) {
        }

        static {
            androidx.paging.AccessorState.BlockState blockState = new androidx.paging.AccessorState.BlockState("UNBLOCKED", 0);
            UNBLOCKED = blockState;
            androidx.paging.AccessorState.BlockState blockState2 = new androidx.paging.AccessorState.BlockState("COMPLETED", 1);
            COMPLETED = blockState2;
            androidx.paging.AccessorState.BlockState blockState3 = new androidx.paging.AccessorState.BlockState("REQUIRES_REFRESH", 2);
            REQUIRES_REFRESH = blockState3;
            androidx.paging.AccessorState.BlockState[] blockStateArr = {blockState, blockState2, blockState3};
            getHighSpeedVideoSizes = blockStateArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(blockStateArr);
        }

        public static androidx.paging.AccessorState.BlockState[] values() {
            return (androidx.paging.AccessorState.BlockState[]) getHighSpeedVideoSizes.clone();
        }

        public static androidx.paging.AccessorState.BlockState valueOf(java.lang.String str) {
            return (androidx.paging.AccessorState.BlockState) java.lang.Enum.valueOf(androidx.paging.AccessorState.BlockState.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.paging.AccessorState.BlockState> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }

    public static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor(androidx.paging.LoadType loadType, androidx.paging.AccessorState.PendingRequest pendingRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingRequest, "");
        return pendingRequest.getLoadType() == loadType;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[androidx.paging.LoadType.values().length];
            try {
                iArr[androidx.paging.LoadType.REFRESH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[androidx.paging.AccessorState.BlockState.values().length];
            try {
                iArr2[androidx.paging.AccessorState.BlockState.COMPLETED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr2[androidx.paging.AccessorState.BlockState.REQUIRES_REFRESH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[androidx.paging.AccessorState.BlockState.UNBLOCKED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
