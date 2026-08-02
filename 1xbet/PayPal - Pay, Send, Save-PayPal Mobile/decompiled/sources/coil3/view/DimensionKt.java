package coil3.view;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\"\u0010\b\u001a\u00020\u0000*\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006H\u0086\b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "px", "Lcoil3/size/Dimension$Pixels;", "Dimension", "(I)I", "Lcoil3/size/Dimension;", "Lkotlin/Function0;", "block", "pxOrElse", "(Lcoil3/size/Dimension;Lkotlin/jvm/functions/Function0;)I"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DimensionKt {
    public static final int Dimension(int i) {
        return coil3.size.Dimension.Pixels.m9802constructorimpl(i);
    }

    public static final int pxOrElse(coil3.view.Dimension dimension, kotlin.jvm.functions.Function0<java.lang.Integer> function0) {
        return dimension instanceof coil3.size.Dimension.Pixels ? ((coil3.size.Dimension.Pixels) dimension).m9807unboximpl() : function0.invoke().intValue();
    }
}
