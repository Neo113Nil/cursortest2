package androidx.compose.ui.text.style;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\"\u0016\u0010\u0010\u001a\u00020\r*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/text/style/BaselineShift;", "Lkotlin/Function0;", "block", "takeOrElse-JpAxnlU", "(FLkotlin/jvm/functions/Function0;)F", "takeOrElse", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "", "fraction", "lerp-jWV1Mfo", "(FFF)F", "lerp", "", "isSpecified-4Dl_Bck", "(F)Z", "isSpecified"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BaselineShiftKt {
    /* renamed from: isSpecified-4Dl_Bck, reason: not valid java name */
    public static final boolean m8324isSpecified4Dl_Bck(float f) {
        return !java.lang.Float.isNaN(f);
    }

    /* renamed from: takeOrElse-JpAxnlU, reason: not valid java name */
    public static final float m8326takeOrElseJpAxnlU(float f, kotlin.jvm.functions.Function0<androidx.compose.ui.text.style.BaselineShift> function0) {
        return java.lang.Float.isNaN(f) ? function0.invoke().m8315unboximpl() : f;
    }

    /* renamed from: lerp-jWV1Mfo, reason: not valid java name */
    public static final float m8325lerpjWV1Mfo(float f, float f2, float f3) {
        return androidx.compose.ui.text.style.BaselineShift.m8310constructorimpl(androidx.compose.ui.util.MathHelpersKt.lerp(f, f2, f3));
    }
}
