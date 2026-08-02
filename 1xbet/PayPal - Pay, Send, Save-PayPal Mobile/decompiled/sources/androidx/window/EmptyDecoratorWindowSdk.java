package androidx.window;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/window/EmptyDecoratorWindowSdk;", "Landroidx/window/WindowSdkExtensionsDecorator;", "<init>", "()V", "Landroidx/window/WindowSdkExtensions;", "p0", "decorate", "(Landroidx/window/WindowSdkExtensions;)Landroidx/window/WindowSdkExtensions;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class EmptyDecoratorWindowSdk implements androidx.window.WindowSdkExtensionsDecorator {
    public static final androidx.window.EmptyDecoratorWindowSdk INSTANCE = new androidx.window.EmptyDecoratorWindowSdk();

    private EmptyDecoratorWindowSdk() {
    }

    @Override // androidx.window.WindowSdkExtensionsDecorator
    public final androidx.window.WindowSdkExtensions decorate(androidx.window.WindowSdkExtensions p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return p0;
    }
}
