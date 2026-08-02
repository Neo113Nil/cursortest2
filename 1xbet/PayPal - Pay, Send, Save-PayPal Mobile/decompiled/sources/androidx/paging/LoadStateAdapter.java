package androidx.paging;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\n\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\n\u0010\u0017J\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u000f\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR*\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\""}, d2 = {"Landroidx/paging/LoadStateAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "Landroidx/paging/LoadState;", "loadState", "(Landroid/view/ViewGroup;Landroidx/paging/LoadState;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/paging/LoadState;)V", "getStateViewType", "(Landroidx/paging/LoadState;)I", "", "displayLoadStateAsItem", "(Landroidx/paging/LoadState;)Z", "Landroidx/paging/LoadState;", "getLoadState", "()Landroidx/paging/LoadState;", "setLoadState", "(Landroidx/paging/LoadState;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class LoadStateAdapter<VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> {
    private androidx.paging.LoadState loadState = new androidx.paging.LoadState.NotLoading(false);

    public abstract void onBindViewHolder(VH holder, androidx.paging.LoadState loadState);

    public abstract VH onCreateViewHolder(android.view.ViewGroup parent, androidx.paging.LoadState loadState);

    public final androidx.paging.LoadState getLoadState() {
        return this.loadState;
    }

    public final void setLoadState(androidx.paging.LoadState loadState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.loadState, loadState)) {
            return;
        }
        boolean displayLoadStateAsItem = displayLoadStateAsItem(this.loadState);
        boolean displayLoadStateAsItem2 = displayLoadStateAsItem(loadState);
        if (displayLoadStateAsItem && !displayLoadStateAsItem2) {
            notifyItemRemoved(0);
        } else if (displayLoadStateAsItem2 && !displayLoadStateAsItem) {
            notifyItemInserted(0);
        } else if (displayLoadStateAsItem && displayLoadStateAsItem2) {
            notifyItemChanged(0);
        }
        this.loadState = loadState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final VH onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "");
        return onCreateViewHolder(parent, this.loadState);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(VH holder, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "");
        onBindViewHolder((androidx.paging.LoadStateAdapter<VH>) holder, this.loadState);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int position) {
        return getStateViewType(this.loadState);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return displayLoadStateAsItem(this.loadState) ? 1 : 0;
    }

    public boolean displayLoadStateAsItem(androidx.paging.LoadState loadState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
        return (loadState instanceof androidx.paging.LoadState.Loading) || (loadState instanceof androidx.paging.LoadState.Error);
    }

    public int getStateViewType(androidx.paging.LoadState loadState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
        return 0;
    }
}
