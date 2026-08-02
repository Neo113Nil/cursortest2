package coil3.view;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010\u001bR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b\r\u0010+R\u001a\u0010\u000e\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b\u000e\u0010+"}, d2 = {"Lcoil3/request/SuccessResult;", "Lcoil3/request/ImageResult;", "Lcoil3/Image;", "image", "Lcoil3/request/ImageRequest;", "request", "Lcoil3/decode/DataSource;", "dataSource", "Lcoil3/memory/MemoryCache$Key;", "memoryCacheKey", "", "diskCacheKey", "", "isSampled", "isPlaceholderCached", "<init>", "(Lcoil3/Image;Lcoil3/request/ImageRequest;Lcoil3/decode/DataSource;Lcoil3/memory/MemoryCache$Key;Ljava/lang/String;ZZ)V", "copy", "(Lcoil3/Image;Lcoil3/request/ImageRequest;Lcoil3/decode/DataSource;Lcoil3/memory/MemoryCache$Key;Ljava/lang/String;ZZ)Lcoil3/request/SuccessResult;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcoil3/Image;", "getImage", "()Lcoil3/Image;", "Lcoil3/request/ImageRequest;", "getRequest", "()Lcoil3/request/ImageRequest;", "Lcoil3/decode/DataSource;", "getDataSource", "()Lcoil3/decode/DataSource;", "Lcoil3/memory/MemoryCache$Key;", "getMemoryCacheKey", "()Lcoil3/memory/MemoryCache$Key;", "Ljava/lang/String;", "getDiskCacheKey", "Z", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SuccessResult implements coil3.view.ImageResult {
    private final coil3.graphics.DataSource dataSource;
    private final java.lang.String diskCacheKey;
    private final coil3.Image image;
    private final boolean isPlaceholderCached;
    private final boolean isSampled;
    private final coil3.memory.MemoryCache.Key memoryCacheKey;
    private final coil3.view.ImageRequest request;

    public SuccessResult(coil3.Image image, coil3.view.ImageRequest imageRequest, coil3.graphics.DataSource dataSource, coil3.memory.MemoryCache.Key key, java.lang.String str, boolean z, boolean z2) {
        this.image = image;
        this.request = imageRequest;
        this.dataSource = dataSource;
        this.memoryCacheKey = key;
        this.diskCacheKey = str;
        this.isSampled = z;
        this.isPlaceholderCached = z2;
    }

    @Override // coil3.view.ImageResult
    public final coil3.Image getImage() {
        return this.image;
    }

    @Override // coil3.view.ImageResult
    public final coil3.view.ImageRequest getRequest() {
        return this.request;
    }

    public /* synthetic */ SuccessResult(coil3.Image image, coil3.view.ImageRequest imageRequest, coil3.graphics.DataSource dataSource, coil3.memory.MemoryCache.Key key, java.lang.String str, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(image, imageRequest, (i & 4) != 0 ? coil3.graphics.DataSource.MEMORY : dataSource, (i & 8) != 0 ? null : key, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
    }

    public final coil3.graphics.DataSource getDataSource() {
        return this.dataSource;
    }

    public final coil3.memory.MemoryCache.Key getMemoryCacheKey() {
        return this.memoryCacheKey;
    }

    public final java.lang.String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    /* renamed from: isSampled, reason: from getter */
    public final boolean getIsSampled() {
        return this.isSampled;
    }

    /* renamed from: isPlaceholderCached, reason: from getter */
    public final boolean getIsPlaceholderCached() {
        return this.isPlaceholderCached;
    }

    public static /* synthetic */ coil3.view.SuccessResult copy$default(coil3.view.SuccessResult successResult, coil3.Image image, coil3.view.ImageRequest imageRequest, coil3.graphics.DataSource dataSource, coil3.memory.MemoryCache.Key key, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            image = successResult.getImage();
        }
        if ((i & 2) != 0) {
            imageRequest = successResult.getRequest();
        }
        coil3.view.ImageRequest imageRequest2 = imageRequest;
        if ((i & 4) != 0) {
            dataSource = successResult.dataSource;
        }
        coil3.graphics.DataSource dataSource2 = dataSource;
        if ((i & 8) != 0) {
            key = successResult.memoryCacheKey;
        }
        coil3.memory.MemoryCache.Key key2 = key;
        if ((i & 16) != 0) {
            str = successResult.diskCacheKey;
        }
        java.lang.String str2 = str;
        if ((i & 32) != 0) {
            z = successResult.isSampled;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            z2 = successResult.isPlaceholderCached;
        }
        return successResult.copy(image, imageRequest2, dataSource2, key2, str2, z3, z2);
    }

    public final coil3.view.SuccessResult copy(coil3.Image image, coil3.view.ImageRequest request, coil3.graphics.DataSource dataSource, coil3.memory.MemoryCache.Key memoryCacheKey, java.lang.String diskCacheKey, boolean isSampled, boolean isPlaceholderCached) {
        return new coil3.view.SuccessResult(image, request, dataSource, memoryCacheKey, diskCacheKey, isSampled, isPlaceholderCached);
    }

    public final java.lang.String toString() {
        coil3.Image image = this.image;
        coil3.view.ImageRequest imageRequest = this.request;
        coil3.graphics.DataSource dataSource = this.dataSource;
        coil3.memory.MemoryCache.Key key = this.memoryCacheKey;
        java.lang.String str = this.diskCacheKey;
        boolean z = this.isSampled;
        boolean z2 = this.isPlaceholderCached;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SuccessResult(image=");
        sb.append(image);
        sb.append(", request=");
        sb.append(imageRequest);
        sb.append(", dataSource=");
        sb.append(dataSource);
        sb.append(", memoryCacheKey=");
        sb.append(key);
        sb.append(", diskCacheKey=");
        sb.append(str);
        sb.append(", isSampled=");
        sb.append(z);
        sb.append(", isPlaceholderCached=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.image.hashCode();
        int hashCode2 = this.request.hashCode();
        int hashCode3 = this.dataSource.hashCode();
        coil3.memory.MemoryCache.Key key = this.memoryCacheKey;
        int hashCode4 = key == null ? 0 : key.hashCode();
        java.lang.String str = this.diskCacheKey;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isSampled)) * 31) + java.lang.Boolean.hashCode(this.isPlaceholderCached);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof coil3.view.SuccessResult)) {
            return false;
        }
        coil3.view.SuccessResult successResult = (coil3.view.SuccessResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.image, successResult.image) && kotlin.jvm.internal.Intrinsics.areEqual(this.request, successResult.request) && this.dataSource == successResult.dataSource && kotlin.jvm.internal.Intrinsics.areEqual(this.memoryCacheKey, successResult.memoryCacheKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.diskCacheKey, successResult.diskCacheKey) && this.isSampled == successResult.isSampled && this.isPlaceholderCached == successResult.isPlaceholderCached;
    }
}
