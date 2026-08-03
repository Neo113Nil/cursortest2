package coil.request;

/* compiled from: ImageResult.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010JP\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rJ\u0013\u0010\u001d\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001b¨\u0006\""}, d2 = {"Lcoil/request/SuccessResult;", "Lcoil/request/ImageResult;", "drawable", "Landroid/graphics/drawable/Drawable;", "request", "Lcoil/request/ImageRequest;", "dataSource", "Lcoil/decode/DataSource;", "memoryCacheKey", "Lcoil/memory/MemoryCache$Key;", "diskCacheKey", "", "isSampled", "", "isPlaceholderCached", "<init>", "(Landroid/graphics/drawable/Drawable;Lcoil/request/ImageRequest;Lcoil/decode/DataSource;Lcoil/memory/MemoryCache$Key;Ljava/lang/String;ZZ)V", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "getRequest", "()Lcoil/request/ImageRequest;", "getDataSource", "()Lcoil/decode/DataSource;", "getMemoryCacheKey", "()Lcoil/memory/MemoryCache$Key;", "getDiskCacheKey", "()Ljava/lang/String;", "()Z", "copy", "equals", "other", "", "hashCode", "", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SuccessResult extends coil.request.ImageResult {
    private final coil.decode.DataSource dataSource;
    private final java.lang.String diskCacheKey;
    private final android.graphics.drawable.Drawable drawable;
    private final boolean isPlaceholderCached;
    private final boolean isSampled;
    private final coil.memory.MemoryCache.Key memoryCacheKey;
    private final coil.request.ImageRequest request;

    public /* synthetic */ SuccessResult(android.graphics.drawable.Drawable drawable, coil.request.ImageRequest imageRequest, coil.decode.DataSource dataSource, coil.memory.MemoryCache.Key key, java.lang.String str, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, imageRequest, dataSource, (i & 8) != 0 ? null : key, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
    }

    @Override // coil.request.ImageResult
    public android.graphics.drawable.Drawable getDrawable() {
        return this.drawable;
    }

    @Override // coil.request.ImageResult
    public coil.request.ImageRequest getRequest() {
        return this.request;
    }

    public final coil.decode.DataSource getDataSource() {
        return this.dataSource;
    }

    public final coil.memory.MemoryCache.Key getMemoryCacheKey() {
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

    public SuccessResult(android.graphics.drawable.Drawable drawable, coil.request.ImageRequest imageRequest, coil.decode.DataSource dataSource, coil.memory.MemoryCache.Key key, java.lang.String str, boolean z, boolean z2) {
        super(null);
        this.drawable = drawable;
        this.request = imageRequest;
        this.dataSource = dataSource;
        this.memoryCacheKey = key;
        this.diskCacheKey = str;
        this.isSampled = z;
        this.isPlaceholderCached = z2;
    }

    public static /* synthetic */ coil.request.SuccessResult copy$default(coil.request.SuccessResult successResult, android.graphics.drawable.Drawable drawable, coil.request.ImageRequest imageRequest, coil.decode.DataSource dataSource, coil.memory.MemoryCache.Key key, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            drawable = successResult.getDrawable();
        }
        if ((i & 2) != 0) {
            imageRequest = successResult.getRequest();
        }
        coil.request.ImageRequest imageRequest2 = imageRequest;
        if ((i & 4) != 0) {
            dataSource = successResult.dataSource;
        }
        coil.decode.DataSource dataSource2 = dataSource;
        if ((i & 8) != 0) {
            key = successResult.memoryCacheKey;
        }
        coil.memory.MemoryCache.Key key2 = key;
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
        return successResult.copy(drawable, imageRequest2, dataSource2, key2, str2, z3, z2);
    }

    public final coil.request.SuccessResult copy(android.graphics.drawable.Drawable drawable, coil.request.ImageRequest request, coil.decode.DataSource dataSource, coil.memory.MemoryCache.Key memoryCacheKey, java.lang.String diskCacheKey, boolean isSampled, boolean isPlaceholderCached) {
        return new coil.request.SuccessResult(drawable, request, dataSource, memoryCacheKey, diskCacheKey, isSampled, isPlaceholderCached);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof coil.request.SuccessResult) {
            coil.request.SuccessResult successResult = (coil.request.SuccessResult) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(getDrawable(), successResult.getDrawable()) && kotlin.jvm.internal.Intrinsics.areEqual(getRequest(), successResult.getRequest()) && this.dataSource == successResult.dataSource && kotlin.jvm.internal.Intrinsics.areEqual(this.memoryCacheKey, successResult.memoryCacheKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.diskCacheKey, successResult.diskCacheKey) && this.isSampled == successResult.isSampled && this.isPlaceholderCached == successResult.isPlaceholderCached) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((getDrawable().hashCode() * 31) + getRequest().hashCode()) * 31) + this.dataSource.hashCode()) * 31;
        coil.memory.MemoryCache.Key key = this.memoryCacheKey;
        int hashCode2 = (hashCode + (key != null ? key.hashCode() : 0)) * 31;
        java.lang.String str = this.diskCacheKey;
        return ((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.isSampled)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.isPlaceholderCached);
    }
}
