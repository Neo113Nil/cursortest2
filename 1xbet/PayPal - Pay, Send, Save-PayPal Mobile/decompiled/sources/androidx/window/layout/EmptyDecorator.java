package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/window/layout/EmptyDecorator;", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "<init>", "()V", "Landroidx/window/layout/WindowInfoTracker;", "p0", "decorate", "(Landroidx/window/layout/WindowInfoTracker;)Landroidx/window/layout/WindowInfoTracker;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class EmptyDecorator implements androidx.window.layout.WindowInfoTrackerDecorator {
    public static final androidx.window.layout.EmptyDecorator INSTANCE = new androidx.window.layout.EmptyDecorator();

    private EmptyDecorator() {
    }

    @Override // androidx.window.layout.WindowInfoTrackerDecorator
    public final androidx.window.layout.WindowInfoTracker decorate(androidx.window.layout.WindowInfoTracker p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return p0;
    }
}
