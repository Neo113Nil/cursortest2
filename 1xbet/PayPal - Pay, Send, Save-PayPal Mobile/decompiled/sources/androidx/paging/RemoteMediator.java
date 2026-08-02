package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/paging/RemoteMediator;", "", "Key", "Value", "<init>", "()V", "Landroidx/paging/LoadType;", "loadType", "Landroidx/paging/PagingState;", "state", "Landroidx/paging/RemoteMediator$MediatorResult;", "load", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/RemoteMediator$InitializeAction;", "initialize", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "MediatorResult", "InitializeAction"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class RemoteMediator<Key, Value> {
    public abstract java.lang.Object load(androidx.paging.LoadType loadType, androidx.paging.PagingState<Key, Value> pagingState, kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.MediatorResult> continuation);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Landroidx/paging/RemoteMediator$MediatorResult;", "", "<init>", "()V", "Error", "Success", "Landroidx/paging/RemoteMediator$MediatorResult$Error;", "Landroidx/paging/RemoteMediator$MediatorResult$Success;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class MediatorResult {
        private MediatorResult() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/paging/RemoteMediator$MediatorResult$Error;", "Landroidx/paging/RemoteMediator$MediatorResult;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Error extends androidx.paging.RemoteMediator.MediatorResult {
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
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Landroidx/paging/RemoteMediator$MediatorResult$Success;", "Landroidx/paging/RemoteMediator$MediatorResult;", "", "endOfPaginationReached", "<init>", "(Z)V", "Z", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Success extends androidx.paging.RemoteMediator.MediatorResult {
            private final boolean endOfPaginationReached;

            public Success(boolean z) {
                super(null);
                this.endOfPaginationReached = z;
            }

            /* renamed from: endOfPaginationReached, reason: from getter */
            public final boolean getEndOfPaginationReached() {
                return this.endOfPaginationReached;
            }
        }

        public /* synthetic */ MediatorResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/paging/RemoteMediator$InitializeAction;", "", "<init>", "(Ljava/lang/String;I)V", "LAUNCH_INITIAL_REFRESH", "SKIP_INITIAL_REFRESH"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InitializeAction {
        public static final androidx.paging.RemoteMediator.InitializeAction LAUNCH_INITIAL_REFRESH;
        public static final androidx.paging.RemoteMediator.InitializeAction SKIP_INITIAL_REFRESH;
        private static final /* synthetic */ androidx.paging.RemoteMediator.InitializeAction[] getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

        private InitializeAction(java.lang.String str, int i) {
        }

        static {
            androidx.paging.RemoteMediator.InitializeAction initializeAction = new androidx.paging.RemoteMediator.InitializeAction("LAUNCH_INITIAL_REFRESH", 0);
            LAUNCH_INITIAL_REFRESH = initializeAction;
            androidx.paging.RemoteMediator.InitializeAction initializeAction2 = new androidx.paging.RemoteMediator.InitializeAction("SKIP_INITIAL_REFRESH", 1);
            SKIP_INITIAL_REFRESH = initializeAction2;
            androidx.paging.RemoteMediator.InitializeAction[] initializeActionArr = {initializeAction, initializeAction2};
            getHighResolutionOutputSizeshNQ4ISI = initializeActionArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(initializeActionArr);
        }

        public static androidx.paging.RemoteMediator.InitializeAction[] values() {
            return (androidx.paging.RemoteMediator.InitializeAction[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static androidx.paging.RemoteMediator.InitializeAction valueOf(java.lang.String str) {
            return (androidx.paging.RemoteMediator.InitializeAction) java.lang.Enum.valueOf(androidx.paging.RemoteMediator.InitializeAction.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.paging.RemoteMediator.InitializeAction> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }

    public java.lang.Object initialize(kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.InitializeAction> continuation) {
        return androidx.paging.RemoteMediator.InitializeAction.LAUNCH_INITIAL_REFRESH;
    }
}
