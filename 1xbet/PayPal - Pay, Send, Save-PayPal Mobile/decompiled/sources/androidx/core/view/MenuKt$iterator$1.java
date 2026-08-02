package androidx.core.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/core/view/MenuKt$iterator$1;", "", "Landroid/view/MenuItem;", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Landroid/view/MenuItem;", "", "remove", "()V", "", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MenuKt$iterator$1 implements java.util.Iterator<android.view.MenuItem>, kotlin.jvm.internal.markers.KMutableIterator {
    final /* synthetic */ android.view.Menu Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    MenuKt$iterator$1(android.view.Menu menu) {
        this.Camera2StreamConfigurationMap = menu;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighSpeedVideoFpsRangesFor < this.Camera2StreamConfigurationMap.size();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final android.view.MenuItem next() {
        android.view.Menu menu = this.Camera2StreamConfigurationMap;
        int i = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = i + 1;
        android.view.MenuItem item = menu.getItem(i);
        if (item != null) {
            return item;
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        android.view.Menu menu = this.Camera2StreamConfigurationMap;
        int i = this.getHighSpeedVideoFpsRangesFor - 1;
        this.getHighSpeedVideoFpsRangesFor = i;
        android.view.MenuItem item = menu.getItem(i);
        if (item == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        menu.removeItem(item.getItemId());
    }
}
