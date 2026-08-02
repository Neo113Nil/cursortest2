package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/paging/PlaceholderPaddedDiffResult;", "", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "diff", "", "hasOverlap", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$DiffResult;Z)V", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "getDiff", "()Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "Z", "getHasOverlap", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlaceholderPaddedDiffResult {
    private final androidx.recyclerview.widget.DiffUtil.DiffResult diff;
    private final boolean hasOverlap;

    public PlaceholderPaddedDiffResult(androidx.recyclerview.widget.DiffUtil.DiffResult diffResult, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diffResult, "");
        this.diff = diffResult;
        this.hasOverlap = z;
    }

    public final androidx.recyclerview.widget.DiffUtil.DiffResult getDiff() {
        return this.diff;
    }

    public final boolean getHasOverlap() {
        return this.hasOverlap;
    }
}
