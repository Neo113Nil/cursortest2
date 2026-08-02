package androidx.core.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/core/view/ViewGroupKt$iterator$1;", "", "Landroid/view/View;", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Landroid/view/View;", "", "remove", "()V", "", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewGroupKt$iterator$1 implements java.util.Iterator<android.view.View>, kotlin.jvm.internal.markers.KMutableIterator {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;
    final /* synthetic */ android.view.ViewGroup getHighSpeedVideoSizes;

    ViewGroupKt$iterator$1(android.view.ViewGroup viewGroup) {
        this.getHighSpeedVideoSizes = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighSpeedVideoSizes < this.getHighSpeedVideoSizes.getChildCount();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final android.view.View next() {
        android.view.ViewGroup viewGroup = this.getHighSpeedVideoSizes;
        int i = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = i + 1;
        android.view.View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        android.view.ViewGroup viewGroup = this.getHighSpeedVideoSizes;
        int i = this.getHighSpeedVideoSizes - 1;
        this.getHighSpeedVideoSizes = i;
        viewGroup.removeViewAt(i);
    }
}
