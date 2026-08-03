package coil.size;

/* compiled from: Size.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0018\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0003\"\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b\"\u001a\u0010\t\u001a\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Size", "Lcoil/size/Size;", "width", "", "height", "Lcoil/size/Dimension;", "isOriginal", "", "(Lcoil/size/Size;)Z", "OriginalSize", "getOriginalSize$annotations", "()V", "getOriginalSize", "()Lcoil/size/Size;", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: coil.size.-Sizes, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Sizes {
    @kotlin.Deprecated(message = "Migrate to 'coil.size.Size.ORIGINAL'.", replaceWith = @kotlin.ReplaceWith(expression = "Size.ORIGINAL", imports = {"coil.size.Size"}))
    public static /* synthetic */ void getOriginalSize$annotations() {
    }

    public static final coil.size.Size Size(int i, coil.size.Dimension dimension) {
        return new coil.size.Size(coil.size.Dimensions.Dimension(i), dimension);
    }

    public static final coil.size.Size Size(coil.size.Dimension dimension, int i) {
        return new coil.size.Size(dimension, coil.size.Dimensions.Dimension(i));
    }

    public static final coil.size.Size Size(int i, int i2) {
        return new coil.size.Size(coil.size.Dimensions.Dimension(i), coil.size.Dimensions.Dimension(i2));
    }

    public static final boolean isOriginal(coil.size.Size size) {
        return kotlin.jvm.internal.Intrinsics.areEqual(size, coil.size.Size.ORIGINAL);
    }

    public static final coil.size.Size getOriginalSize() {
        return coil.size.Size.ORIGINAL;
    }
}
