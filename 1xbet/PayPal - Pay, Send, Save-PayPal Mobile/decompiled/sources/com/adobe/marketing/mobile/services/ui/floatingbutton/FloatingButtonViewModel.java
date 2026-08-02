package com.adobe.marketing.mobile.services.ui.floatingbutton;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00178\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR%\u0010\u001c\u001a\u00020\u000b8\u0001@\u0001X\u0081\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R%\u0010\"\u001a\u00020\u000b8\u0001@\u0001X\u0081\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonViewModel;", "", "Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonSettings;", "settings", "<init>", "(Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonSettings;)V", "Landroid/graphics/Bitmap;", "graphic", "", "onGraphicUpdate$core_phoneRelease", "(Landroid/graphics/Bitmap;)V", "Landroidx/compose/ui/geometry/Offset;", "offset", "", "orientation", "onPositionUpdate-3MmeM6k$core_phoneRelease", "(JI)V", "onPositionUpdate", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/ImageBitmap;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/State;", "currentGraphic", "Landroidx/compose/runtime/State;", "getCurrentGraphic$core_phoneRelease", "()Landroidx/compose/runtime/State;", "landscapeOffSet", "J", "getLandscapeOffSet-F1C5BW0$core_phoneRelease", "()J", "setLandscapeOffSet-k-4lQ0M$core_phoneRelease", "(J)V", "portraitOffSet", "getPortraitOffSet-F1C5BW0$core_phoneRelease", "setPortraitOffSet-k-4lQ0M$core_phoneRelease", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class FloatingButtonViewModel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.ImageBitmap> getHighSpeedVideoSizes;
    private final androidx.compose.runtime.State<androidx.compose.ui.graphics.ImageBitmap> currentGraphic;
    private long landscapeOffSet;
    private long portraitOffSet;

    public FloatingButtonViewModel(com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonSettings floatingButtonSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(floatingButtonSettings, "");
        androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.ImageBitmap> mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(floatingButtonSettings.getInitialGraphic()), null, 2, null);
        this.getHighSpeedVideoSizes = mutableStateOf$default;
        this.currentGraphic = mutableStateOf$default;
        this.landscapeOffSet = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        this.portraitOffSet = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
    }

    public final androidx.compose.runtime.State<androidx.compose.ui.graphics.ImageBitmap> getCurrentGraphic$core_phoneRelease() {
        return this.currentGraphic;
    }

    /* renamed from: getLandscapeOffSet-F1C5BW0$core_phoneRelease, reason: not valid java name and from getter */
    public final long getLandscapeOffSet() {
        return this.landscapeOffSet;
    }

    /* renamed from: setLandscapeOffSet-k-4lQ0M$core_phoneRelease, reason: not valid java name */
    public final void m9883setLandscapeOffSetk4lQ0M$core_phoneRelease(long j) {
        this.landscapeOffSet = j;
    }

    /* renamed from: getPortraitOffSet-F1C5BW0$core_phoneRelease, reason: not valid java name and from getter */
    public final long getPortraitOffSet() {
        return this.portraitOffSet;
    }

    /* renamed from: setPortraitOffSet-k-4lQ0M$core_phoneRelease, reason: not valid java name */
    public final void m9884setPortraitOffSetk4lQ0M$core_phoneRelease(long j) {
        this.portraitOffSet = j;
    }

    public final void onGraphicUpdate$core_phoneRelease(android.graphics.Bitmap graphic) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphic, "");
        this.getHighSpeedVideoSizes.setValue(androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(graphic));
    }

    /* renamed from: onPositionUpdate-3MmeM6k$core_phoneRelease, reason: not valid java name */
    public final void m9882onPositionUpdate3MmeM6k$core_phoneRelease(long offset, int orientation) {
        if (androidx.compose.ui.geometry.Offset.m5752getXimpl(offset) < 0.0f || androidx.compose.ui.geometry.Offset.m5753getYimpl(offset) < 0.0f) {
            return;
        }
        if (orientation == 2) {
            this.landscapeOffSet = offset;
        } else {
            this.portraitOffSet = offset;
        }
    }
}
