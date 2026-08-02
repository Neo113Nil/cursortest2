package androidx.view.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/navigation/internal/NavGraphImpl$iterator$1;", "", "Landroidx/navigation/NavDestination;", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Landroidx/navigation/NavDestination;", "", "remove", "()V", "", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavGraphImpl$iterator$1 implements java.util.Iterator<androidx.view.NavDestination>, kotlin.jvm.internal.markers.KMutableIterator {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor = -1;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;
    final /* synthetic */ androidx.view.internal.NavGraphImpl getHighSpeedVideoSizes;

    NavGraphImpl$iterator$1(androidx.view.internal.NavGraphImpl navGraphImpl) {
        this.getHighSpeedVideoSizes = navGraphImpl;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighSpeedVideoFpsRangesFor + 1 < this.getHighSpeedVideoSizes.getNodes$navigation_common_release().size();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final androidx.view.NavDestination next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.getHighSpeedVideoSizes = true;
        androidx.collection.SparseArrayCompat<androidx.view.NavDestination> nodes$navigation_common_release = this.getHighSpeedVideoSizes.getNodes$navigation_common_release();
        int i = this.getHighSpeedVideoFpsRangesFor + 1;
        this.getHighSpeedVideoFpsRangesFor = i;
        return nodes$navigation_common_release.valueAt(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalStateException("You must call next() before you can remove an element".toString());
        }
        androidx.collection.SparseArrayCompat<androidx.view.NavDestination> nodes$navigation_common_release = this.getHighSpeedVideoSizes.getNodes$navigation_common_release();
        nodes$navigation_common_release.valueAt(this.getHighSpeedVideoFpsRangesFor).setParent(null);
        nodes$navigation_common_release.removeAt(this.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoFpsRangesFor--;
        this.getHighSpeedVideoSizes = false;
    }
}
