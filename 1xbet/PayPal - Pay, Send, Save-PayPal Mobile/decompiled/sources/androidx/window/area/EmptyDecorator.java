package androidx.window.area;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/window/area/EmptyDecorator;", "Landroidx/window/area/WindowAreaControllerDecorator;", "<init>", "()V", "Landroidx/window/area/WindowAreaController;", "p0", "decorate", "(Landroidx/window/area/WindowAreaController;)Landroidx/window/area/WindowAreaController;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class EmptyDecorator implements androidx.window.area.WindowAreaControllerDecorator {
    public static final androidx.window.area.EmptyDecorator INSTANCE = new androidx.window.area.EmptyDecorator();

    private EmptyDecorator() {
    }

    @Override // androidx.window.area.WindowAreaControllerDecorator
    public final androidx.window.area.WindowAreaController decorate(androidx.window.area.WindowAreaController p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return p0;
    }
}
