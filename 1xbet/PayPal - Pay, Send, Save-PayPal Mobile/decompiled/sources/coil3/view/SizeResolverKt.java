package coil3.view;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcoil3/size/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Lcoil3/size/SizeResolver;", "SizeResolver", "(Lcoil3/size/Size;)Lcoil3/size/SizeResolver;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SizeResolverKt {
    public static final coil3.view.SizeResolver SizeResolver(coil3.view.Size size) {
        return new coil3.view.RealSizeResolver(size);
    }
}
