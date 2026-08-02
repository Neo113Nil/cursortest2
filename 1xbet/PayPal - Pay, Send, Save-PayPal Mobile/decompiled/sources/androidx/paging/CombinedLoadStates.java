package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0019\u001a\u00020\u00172\u001e\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b#\u0010\"R\u001a\u0010$\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001a\u0010'\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b'\u0010&"}, d2 = {"Landroidx/paging/CombinedLoadStates;", "", "Landroidx/paging/LoadState;", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "prepend", "append", "Landroidx/paging/LoadStates;", "source", "mediator", "<init>", "(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function3;", "Landroidx/paging/LoadType;", "", "op", "forEach$paging_common", "(Lkotlin/jvm/functions/Function3;)V", "Landroidx/paging/LoadState;", "getRefresh", "()Landroidx/paging/LoadState;", "getPrepend", "getAppend", "Landroidx/paging/LoadStates;", "getSource", "()Landroidx/paging/LoadStates;", "getMediator", "isIdle", "Z", "()Z", "hasError"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CombinedLoadStates {
    private final androidx.paging.LoadState append;
    private final boolean hasError;
    private final boolean isIdle;
    private final androidx.paging.LoadStates mediator;
    private final androidx.paging.LoadState prepend;
    private final androidx.paging.LoadState refresh;
    private final androidx.paging.LoadStates source;

    public CombinedLoadStates(androidx.paging.LoadState loadState, androidx.paging.LoadState loadState2, androidx.paging.LoadState loadState3, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadStates, "");
        this.refresh = loadState;
        this.prepend = loadState2;
        this.append = loadState3;
        this.source = loadStates;
        this.mediator = loadStates2;
        boolean z = false;
        this.isIdle = loadStates.getIsIdle() && (loadStates2 == null || loadStates2.getIsIdle());
        if (loadStates.getHasError() || (loadStates2 != null && loadStates2.getHasError())) {
            z = true;
        }
        this.hasError = z;
    }

    public /* synthetic */ CombinedLoadStates(androidx.paging.LoadState loadState, androidx.paging.LoadState loadState2, androidx.paging.LoadState loadState3, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(loadState, loadState2, loadState3, loadStates, (i & 16) != 0 ? null : loadStates2);
    }

    public final androidx.paging.LoadState getRefresh() {
        return this.refresh;
    }

    public final androidx.paging.LoadState getPrepend() {
        return this.prepend;
    }

    public final androidx.paging.LoadState getAppend() {
        return this.append;
    }

    public final androidx.paging.LoadStates getSource() {
        return this.source;
    }

    public final androidx.paging.LoadStates getMediator() {
        return this.mediator;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        androidx.paging.CombinedLoadStates combinedLoadStates = (androidx.paging.CombinedLoadStates) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.refresh, combinedLoadStates.refresh) && kotlin.jvm.internal.Intrinsics.areEqual(this.prepend, combinedLoadStates.prepend) && kotlin.jvm.internal.Intrinsics.areEqual(this.append, combinedLoadStates.append) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, combinedLoadStates.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.mediator, combinedLoadStates.mediator);
    }

    public final int hashCode() {
        int hashCode = this.refresh.hashCode();
        int hashCode2 = this.prepend.hashCode();
        int hashCode3 = this.append.hashCode();
        int hashCode4 = this.source.hashCode();
        androidx.paging.LoadStates loadStates = this.mediator;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (loadStates != null ? loadStates.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CombinedLoadStates(refresh=");
        sb.append(this.refresh);
        sb.append(", prepend=");
        sb.append(this.prepend);
        sb.append(", append=");
        sb.append(this.append);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", mediator=");
        sb.append(this.mediator);
        sb.append(')');
        return sb.toString();
    }

    public final void forEach$paging_common(kotlin.jvm.functions.Function3<? super androidx.paging.LoadType, ? super java.lang.Boolean, ? super androidx.paging.LoadState, kotlin.Unit> op) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(op, "");
        androidx.paging.LoadStates loadStates = this.source;
        androidx.paging.LoadType loadType = androidx.paging.LoadType.REFRESH;
        androidx.paging.LoadState refresh = loadStates.getRefresh();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        op.invoke(loadType, bool, refresh);
        op.invoke(androidx.paging.LoadType.PREPEND, bool, loadStates.getPrepend());
        op.invoke(androidx.paging.LoadType.APPEND, bool, loadStates.getAppend());
        androidx.paging.LoadStates loadStates2 = this.mediator;
        if (loadStates2 != null) {
            op.invoke(androidx.paging.LoadType.REFRESH, java.lang.Boolean.TRUE, loadStates2.getRefresh());
            op.invoke(androidx.paging.LoadType.PREPEND, java.lang.Boolean.TRUE, loadStates2.getPrepend());
            op.invoke(androidx.paging.LoadType.APPEND, java.lang.Boolean.TRUE, loadStates2.getAppend());
        }
    }

    /* renamed from: isIdle, reason: from getter */
    public final boolean getIsIdle() {
        return this.isIdle;
    }

    /* renamed from: hasError, reason: from getter */
    public final boolean getHasError() {
        return this.hasError;
    }
}
