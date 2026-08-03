package androidx.compose.ui.platform;

/* compiled from: WindowRecomposer.android.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0001J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0001J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0005J*\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0003\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0014H\u0086\b¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerPolicy;", "", "()V", "factory", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "compareAndSetFactory", "", "expected", "createAndInstallWindowRecomposer", "Landroidx/compose/runtime/Recomposer;", "rootView", "Landroid/view/View;", "createAndInstallWindowRecomposer$ui_release", "getAndSetFactory", "setFactory", "", "withFactory", "R", "block", "Lkotlin/Function0;", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowRecomposerPolicy {
    public static final androidx.compose.ui.platform.WindowRecomposerPolicy INSTANCE = new androidx.compose.ui.platform.WindowRecomposerPolicy();
    private static final java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.platform.WindowRecomposerFactory> factory = new java.util.concurrent.atomic.AtomicReference<>(androidx.compose.ui.platform.WindowRecomposerFactory.INSTANCE.getLifecycleAware());
    public static final int $stable = 8;

    private WindowRecomposerPolicy() {
    }

    public final androidx.compose.ui.platform.WindowRecomposerFactory getAndSetFactory(androidx.compose.ui.platform.WindowRecomposerFactory factory2) {
        return factory.getAndSet(factory2);
    }

    public final boolean compareAndSetFactory(androidx.compose.ui.platform.WindowRecomposerFactory expected, androidx.compose.ui.platform.WindowRecomposerFactory factory2) {
        return androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(factory, expected, factory2);
    }

    public final void setFactory(androidx.compose.ui.platform.WindowRecomposerFactory factory2) {
        factory.set(factory2);
    }

    public final <R> R withFactory(androidx.compose.ui.platform.WindowRecomposerFactory factory2, kotlin.jvm.functions.Function0<? extends R> block) {
        androidx.compose.ui.platform.WindowRecomposerFactory andSetFactory = getAndSetFactory(factory2);
        try {
            R invoke = block.invoke();
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (compareAndSetFactory(factory2, andSetFactory)) {
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                return invoke;
            }
            throw new java.lang.IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                if (compareAndSetFactory(factory2, andSetFactory)) {
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    throw th2;
                }
                kotlin.ExceptionsKt.addSuppressed(th, new java.lang.IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                throw th;
            }
        }
    }

    public final androidx.compose.runtime.Recomposer createAndInstallWindowRecomposer$ui_release(android.view.View rootView) {
        final kotlinx.coroutines.Job launch$default;
        androidx.compose.runtime.Recomposer createRecomposer = factory.get().createRecomposer(rootView);
        androidx.compose.ui.platform.WindowRecomposer_androidKt.setCompositionContext(rootView, createRecomposer);
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, kotlinx.coroutines.android.HandlerDispatcherKt.from(rootView.getHandler(), "windowRecomposer cleanup").getImmediate(), null, new androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(createRecomposer, rootView, null), 2, null);
        rootView.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(android.view.View v) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(android.view.View v) {
                v.removeOnAttachStateChangeListener(this);
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(kotlinx.coroutines.Job.this, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
        });
        return createRecomposer;
    }
}
