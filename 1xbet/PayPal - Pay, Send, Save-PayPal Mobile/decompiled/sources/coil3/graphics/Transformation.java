package coil3.graphics;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014"}, d2 = {"Lcoil3/transform/Transformation;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "Lcoil3/getHighResolutionOutputSizeshNQ4ISI;", "input", "Lcoil3/size/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "transform", "(Landroid/graphics/Bitmap;Lcoil3/size/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getCacheKey", "cacheKey"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Transformation {
    public abstract java.lang.String getCacheKey();

    public abstract java.lang.Object transform(android.graphics.Bitmap bitmap, coil3.view.Size size, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation);

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof coil3.graphics.Transformation) && kotlin.jvm.internal.Intrinsics.areEqual(getCacheKey(), ((coil3.graphics.Transformation) other).getCacheKey());
    }

    public int hashCode() {
        return getCacheKey().hashCode();
    }

    public java.lang.String toString() {
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        java.lang.String cacheKey = getCacheKey();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(simpleName);
        sb.append("(cacheKey=");
        sb.append(cacheKey);
        sb.append(")");
        return sb.toString();
    }
}
