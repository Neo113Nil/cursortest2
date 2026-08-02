package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0012R\"\u0010\u0013\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\u001c\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018"}, d2 = {"Landroidx/paging/MutableLoadStateCollection;", "", "<init>", "()V", "Landroidx/paging/LoadStates;", "snapshot", "()Landroidx/paging/LoadStates;", "Landroidx/paging/LoadType;", "loadType", "Landroidx/paging/LoadState;", "get", "(Landroidx/paging/LoadType;)Landroidx/paging/LoadState;", "type", "state", "", "set", "(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", "states", "(Landroidx/paging/LoadStates;)V", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "Landroidx/paging/LoadState;", "getRefresh", "()Landroidx/paging/LoadState;", "setRefresh", "(Landroidx/paging/LoadState;)V", "prepend", "getPrepend", "setPrepend", "append", "getAppend", "setAppend"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MutableLoadStateCollection {
    private androidx.paging.LoadState refresh = androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common();
    private androidx.paging.LoadState prepend = androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common();
    private androidx.paging.LoadState append = androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common();

    public final androidx.paging.LoadState getRefresh() {
        return this.refresh;
    }

    public final void setRefresh(androidx.paging.LoadState loadState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
        this.refresh = loadState;
    }

    public final androidx.paging.LoadState getPrepend() {
        return this.prepend;
    }

    public final void setPrepend(androidx.paging.LoadState loadState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
        this.prepend = loadState;
    }

    public final androidx.paging.LoadState getAppend() {
        return this.append;
    }

    public final void setAppend(androidx.paging.LoadState loadState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
        this.append = loadState;
    }

    public final androidx.paging.LoadStates snapshot() {
        return new androidx.paging.LoadStates(this.refresh, this.prepend, this.append);
    }

    public final androidx.paging.LoadState get(androidx.paging.LoadType loadType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
        int i = androidx.paging.MutableLoadStateCollection.WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            return this.refresh;
        }
        if (i == 2) {
            return this.append;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return this.prepend;
    }

    public final void set(androidx.paging.LoadType type, androidx.paging.LoadState state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        int i = androidx.paging.MutableLoadStateCollection.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            this.refresh = state;
        } else if (i == 2) {
            this.append = state;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.prepend = state;
        }
    }

    public final void set(androidx.paging.LoadStates states) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(states, "");
        this.refresh = states.getRefresh();
        this.append = states.getAppend();
        this.prepend = states.getPrepend();
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
                iArr[androidx.paging.LoadType.APPEND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.paging.LoadType.PREPEND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
