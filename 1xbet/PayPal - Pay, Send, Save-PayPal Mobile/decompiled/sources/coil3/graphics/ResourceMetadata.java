package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e"}, d2 = {"Lcoil3/decode/ResourceMetadata;", "Lcoil3/decode/ImageSource$Metadata;", "", com.visa.cbp.ConsumerInfo.setSignature, "", "resId", "density", "<init>", "(Ljava/lang/String;II)V", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getResId", "()I", "getDensity"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ResourceMetadata extends coil3.decode.ImageSource.Metadata {
    private final int density;
    private final java.lang.String packageName;
    private final int resId;

    public ResourceMetadata(java.lang.String str, int i, int i2) {
        this.packageName = str;
        this.resId = i;
        this.density = i2;
    }

    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    public final int getResId() {
        return this.resId;
    }

    public final int getDensity() {
        return this.density;
    }
}
