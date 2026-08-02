package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;", "", "", "width", "height", "Lkotlin/Function0;", "Landroidx/compose/ui/unit/IntOffset;", "place", "<init>", "(IILkotlin/jvm/functions/Function0;)V", com.visa.cbp.getEncExpo.warmup, "getWidth", "()I", "getHeight", "Lkotlin/jvm/functions/Function0;", "getPlace", "()Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextRangeLayoutMeasureResult {
    public static final int $stable = 0;
    private final int height;
    private final kotlin.jvm.functions.Function0<androidx.compose.ui.unit.IntOffset> place;
    private final int width;

    public TextRangeLayoutMeasureResult(int i, int i2, kotlin.jvm.functions.Function0<androidx.compose.ui.unit.IntOffset> function0) {
        this.width = i;
        this.height = i2;
        this.place = function0;
    }

    public final int getHeight() {
        return this.height;
    }

    public final kotlin.jvm.functions.Function0<androidx.compose.ui.unit.IntOffset> getPlace() {
        return this.place;
    }

    public final int getWidth() {
        return this.width;
    }
}
