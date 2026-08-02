package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\fJ'\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/google/maps/android/compose/ComposeUiViewRenderer;", "", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", "onAddedToWindow", "renderViewOnce", "(Landroidx/compose/ui/platform/AbstractComposeView;Lkotlin/jvm/functions/Function0;)V", "Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "startRenderingView", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "RenderHandle"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ComposeUiViewRenderer {
    void renderViewOnce(androidx.compose.ui.platform.AbstractComposeView view, kotlin.jvm.functions.Function0<kotlin.Unit> onAddedToWindow);

    com.google.maps.android.compose.ComposeUiViewRenderer.RenderHandle startRenderingView(androidx.compose.ui.platform.AbstractComposeView view);

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "Ljava/io/Closeable;", "", "dispose", "()V", "close"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface RenderHandle extends java.io.Closeable {
        void dispose();

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class DefaultImpls {
            @java.lang.Deprecated
            public static void close(com.google.maps.android.compose.ComposeUiViewRenderer.RenderHandle renderHandle) {
                com.google.maps.android.compose.ComposeUiViewRenderer.RenderHandle.super.close();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        default void close() {
            dispose();
        }
    }
}
