package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/ClipboardPasteState;", "", "Landroidx/compose/ui/platform/Clipboard;", "clipboard", "<init>", "(Landroidx/compose/ui/platform/Clipboard;)V", "", "update", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/platform/Clipboard;", "getHighSpeedVideoFpsRanges", "", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "getHasText", "()Z", "hasText", "getHasClip", "hasClip"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClipboardPasteState {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.platform.Clipboard getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    public ClipboardPasteState(androidx.compose.ui.platform.Clipboard clipboard) {
        this.getHighSpeedVideoFpsRanges = clipboard;
    }

    /* renamed from: getHasText, reason: from getter */
    public final boolean getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: getHasClip, reason: from getter */
    public final boolean getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r2.hasMimeType("text/*") != true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object update(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        boolean hasPrimaryClip = this.getHighSpeedVideoFpsRanges.getNativeClipboard().hasPrimaryClip();
        this.getHighSpeedVideoFpsRangesFor = hasPrimaryClip;
        boolean z = hasPrimaryClip && (r2 = this.getHighSpeedVideoFpsRanges.getNativeClipboard().getPrimaryClipDescription()) != null;
        this.Camera2StreamConfigurationMap = z;
        return kotlin.Unit.INSTANCE;
    }
}
