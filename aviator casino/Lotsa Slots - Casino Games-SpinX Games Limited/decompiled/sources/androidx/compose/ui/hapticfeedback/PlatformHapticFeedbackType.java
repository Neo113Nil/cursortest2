package androidx.compose.ui.hapticfeedback;

/* compiled from: PlatformHapticFeedback.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedbackType;", "", "()V", "LongPress", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "getLongPress-5zf0vsI", "()I", "I", "TextHandleMove", "getTextHandleMove-5zf0vsI", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformHapticFeedbackType {
    public static final int $stable = 0;
    public static final androidx.compose.ui.hapticfeedback.PlatformHapticFeedbackType INSTANCE = new androidx.compose.ui.hapticfeedback.PlatformHapticFeedbackType();
    private static final int LongPress = androidx.compose.ui.hapticfeedback.HapticFeedbackType.m2799constructorimpl(0);
    private static final int TextHandleMove = androidx.compose.ui.hapticfeedback.HapticFeedbackType.m2799constructorimpl(9);

    private PlatformHapticFeedbackType() {
    }

    /* renamed from: getLongPress-5zf0vsI, reason: not valid java name */
    public final int m2807getLongPress5zf0vsI() {
        return LongPress;
    }

    /* renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
    public final int m2808getTextHandleMove5zf0vsI() {
        return TextHandleMove;
    }
}
