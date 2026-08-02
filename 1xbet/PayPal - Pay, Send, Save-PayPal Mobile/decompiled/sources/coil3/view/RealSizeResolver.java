package coil3.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcoil3/size/RealSizeResolver;", "Lcoil3/size/SizeResolver;", "Lcoil3/size/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(Lcoil3/size/Size;)V", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcoil3/size/Size;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealSizeResolver implements coil3.view.SizeResolver {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final coil3.view.Size getHighSpeedVideoFpsRanges;

    public RealSizeResolver(coil3.view.Size size) {
        this.getHighSpeedVideoFpsRanges = size;
    }

    @Override // coil3.view.SizeResolver
    public final java.lang.Object size(kotlin.coroutines.Continuation<? super coil3.view.Size> continuation) {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        coil3.view.Size size = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RealSizeResolver(size=");
        sb.append(size);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof coil3.view.RealSizeResolver) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, ((coil3.view.RealSizeResolver) other).getHighSpeedVideoFpsRanges);
    }
}
