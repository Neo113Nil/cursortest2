package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u00060\u0002j\u0002`\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/pds/components/NoOpClipboardManager;", "Landroidx/compose/ui/platform/Clipboard;", "Landroid/content/ClipboardManager;", "p0", "<init>", "(Landroid/content/ClipboardManager;)V", "Landroidx/compose/ui/platform/ClipEntry;", "getClipEntry", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "setClipEntry", "(Landroidx/compose/ui/platform/ClipEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Landroid/content/ClipboardManager;", "Landroidx/compose/ui/platform/getHighSpeedVideoFpsRanges;", "getNativeClipboard", "()Landroid/content/ClipboardManager;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final class NoOpClipboardManager implements androidx.compose.ui.platform.Clipboard {
    private final android.content.ClipboardManager Camera2StreamConfigurationMap;

    @Override // androidx.compose.ui.platform.Clipboard
    public final java.lang.Object getClipEntry(kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.ClipEntry> continuation) {
        return null;
    }

    public NoOpClipboardManager(android.content.ClipboardManager clipboardManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clipboardManager, "");
        this.Camera2StreamConfigurationMap = clipboardManager;
    }

    @Override // androidx.compose.ui.platform.Clipboard
    public final java.lang.Object setClipEntry(androidx.compose.ui.platform.ClipEntry clipEntry, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.platform.Clipboard
    /* renamed from: getNativeClipboard, reason: from getter */
    public final android.content.ClipboardManager getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }
}
