package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/activity/EdgeToEdgeApi30;", "Landroidx/activity/EdgeToEdgeApi29;", "<init>", "()V", "Landroid/view/Window;", "p0", "", "getHighSpeedVideoFpsRanges", "(Landroid/view/Window;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
class EdgeToEdgeApi30 extends androidx.view.EdgeToEdgeApi29 {
    @Override // androidx.view.EdgeToEdgeApi28, androidx.view.EdgeToEdgeBase, androidx.view.EdgeToEdgeImpl
    public void getHighSpeedVideoFpsRanges(android.view.Window p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        p0.getAttributes().layoutInDisplayCutoutMode = 3;
    }
}
