package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerPolicy;", "", "<init>", "()V", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "factory", "getAndSetFactory", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;)Landroidx/compose/ui/platform/WindowRecomposerFactory;", "expected", "", "compareAndSetFactory", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;Landroidx/compose/ui/platform/WindowRecomposerFactory;)Z", "", "setFactory", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function0;", "block", "withFactory", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroid/view/View;", "rootView", "Landroidx/compose/runtime/Recomposer;", "createAndInstallWindowRecomposer$ui", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/atomic/AtomicReference;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WindowRecomposerPolicy {
    public static final androidx.compose.ui.platform.WindowRecomposerPolicy INSTANCE = new androidx.compose.ui.platform.WindowRecomposerPolicy();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.platform.WindowRecomposerFactory> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>(androidx.compose.ui.platform.WindowRecomposerFactory.INSTANCE.getLifecycleAware());
    public static final int $stable = 8;

    private WindowRecomposerPolicy() {
    }

    public final androidx.compose.ui.platform.WindowRecomposerFactory getAndSetFactory(androidx.compose.ui.platform.WindowRecomposerFactory factory) {
        return Camera2StreamConfigurationMap.getAndSet(factory);
    }

    public final boolean compareAndSetFactory(androidx.compose.ui.platform.WindowRecomposerFactory expected, androidx.compose.ui.platform.WindowRecomposerFactory factory) {
        return androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(Camera2StreamConfigurationMap, expected, factory);
    }

    public final void setFactory(androidx.compose.ui.platform.WindowRecomposerFactory factory) {
        Camera2StreamConfigurationMap.set(factory);
    }

    public final <R> R withFactory(androidx.compose.ui.platform.WindowRecomposerFactory factory, kotlin.jvm.functions.Function0<? extends R> block) {
        androidx.compose.ui.platform.WindowRecomposerFactory andSetFactory = getAndSetFactory(factory);
        try {
            R invoke = block.invoke();
            if (compareAndSetFactory(factory, andSetFactory)) {
                return invoke;
            }
            throw new java.lang.IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                if (compareAndSetFactory(factory, andSetFactory)) {
                    throw th2;
                }
                kotlin.ExceptionsKt.addSuppressed(th, new java.lang.IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                throw th;
            }
        }
    }

    public final androidx.compose.runtime.Recomposer createAndInstallWindowRecomposer$ui(android.view.View rootView) {
        final kotlinx.coroutines.Job launch$default;
        androidx.compose.runtime.Recomposer createRecomposer = Camera2StreamConfigurationMap.get().createRecomposer(rootView);
        androidx.compose.ui.platform.WindowRecomposer_androidKt.setCompositionContext(rootView, createRecomposer);
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, kotlinx.coroutines.android.HandlerDispatcherKt.from(rootView.getHandler(), "windowRecomposer cleanup").getImmediate(), null, new androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(createRecomposer, rootView, null), 2, null);
        rootView.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(android.view.View v) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(android.view.View v) {
                v.removeOnAttachStateChangeListener(this);
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(kotlinx.coroutines.Job.this, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
        });
        return createRecomposer;
    }
}
