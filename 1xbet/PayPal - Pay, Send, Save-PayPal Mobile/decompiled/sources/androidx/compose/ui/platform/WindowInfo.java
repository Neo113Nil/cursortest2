package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/WindowInfo;", "", "", "isWindowFocused", "()Z", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "getKeyboardModifiers-k7X9c1A", "()I", "keyboardModifiers", "Landroidx/compose/ui/unit/IntSize;", "getContainerSize-YbymL2g", "()J", "containerSize", "Landroidx/compose/ui/unit/DpSize;", "getContainerDpSize-MYxV2XQ", "containerDpSize"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface WindowInfo {
    boolean isWindowFocused();

    /* renamed from: getKeyboardModifiers-k7X9c1A */
    default int mo7768getKeyboardModifiersk7X9c1A() {
        return androidx.compose.ui.platform.WindowInfoImpl.INSTANCE.getGlobalKeyboardModifiers$ui().getValue().getGetHighSpeedVideoFpsRanges();
    }

    /* renamed from: getContainerDpSize-MYxV2XQ */
    default long mo7766getContainerDpSizeMYxV2XQ() {
        return androidx.compose.ui.unit.DpSize.INSTANCE.m8708getUnspecifiedMYxV2XQ();
    }

    /* renamed from: getContainerSize-YbymL2g */
    default long mo7767getContainerSizeYbymL2g() {
        return androidx.compose.ui.unit.IntSize.m8767constructorimpl(-9223372034707292160L);
    }
}
