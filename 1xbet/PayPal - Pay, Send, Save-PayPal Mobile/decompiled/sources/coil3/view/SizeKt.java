package coil3.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0007\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\b\"\u0015\u0010\n\u001a\u00020\t*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"", "width", "Lcoil3/size/Dimension;", "height", "Lcoil3/size/Size;", "Size", "(ILcoil3/size/Dimension;)Lcoil3/size/Size;", "(Lcoil3/size/Dimension;I)Lcoil3/size/Size;", "(II)Lcoil3/size/Size;", "", "isOriginal", "(Lcoil3/size/Size;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SizeKt {
    public static final coil3.view.Size Size(int i, coil3.view.Dimension dimension) {
        return new coil3.view.Size(coil3.size.Dimension.Pixels.m9801boximpl(coil3.view.DimensionKt.Dimension(i)), dimension);
    }

    public static final coil3.view.Size Size(coil3.view.Dimension dimension, int i) {
        return new coil3.view.Size(dimension, coil3.size.Dimension.Pixels.m9801boximpl(coil3.view.DimensionKt.Dimension(i)));
    }

    public static final coil3.view.Size Size(int i, int i2) {
        return new coil3.view.Size(coil3.size.Dimension.Pixels.m9801boximpl(coil3.view.DimensionKt.Dimension(i)), coil3.size.Dimension.Pixels.m9801boximpl(coil3.view.DimensionKt.Dimension(i2)));
    }

    public static final boolean isOriginal(coil3.view.Size size) {
        return kotlin.jvm.internal.Intrinsics.areEqual(size, coil3.view.Size.ORIGINAL);
    }
}
