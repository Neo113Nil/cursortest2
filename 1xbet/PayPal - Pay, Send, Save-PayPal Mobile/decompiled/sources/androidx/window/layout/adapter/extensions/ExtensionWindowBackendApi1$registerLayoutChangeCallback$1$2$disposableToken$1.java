package androidx.window.layout.adapter.extensions;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<androidx.window.extensions.layout.WindowLayoutInfo, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowLayoutInfo, "");
        ((androidx.window.layout.adapter.extensions.MulticastConsumer) this.receiver).accept(windowLayoutInfo);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
        getHighSpeedVideoSizes(windowLayoutInfo);
        return kotlin.Unit.INSTANCE;
    }

    ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1(java.lang.Object obj) {
        super(1, obj, androidx.window.layout.adapter.extensions.MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }
}
