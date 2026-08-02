package coil3.fetch;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcoil3/fetch/SourceFetchResult;", "Lcoil3/fetch/FetchResult;", "Lcoil3/decode/ImageSource;", "source", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "Lcoil3/decode/DataSource;", "dataSource", "<init>", "(Lcoil3/decode/ImageSource;Ljava/lang/String;Lcoil3/decode/DataSource;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcoil3/decode/ImageSource;", "getSource", "()Lcoil3/decode/ImageSource;", "Ljava/lang/String;", "getMimeType", "Lcoil3/decode/DataSource;", "getDataSource", "()Lcoil3/decode/DataSource;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SourceFetchResult implements coil3.fetch.FetchResult {
    private final coil3.graphics.DataSource dataSource;
    private final java.lang.String mimeType;
    private final coil3.graphics.ImageSource source;

    public SourceFetchResult(coil3.graphics.ImageSource imageSource, java.lang.String str, coil3.graphics.DataSource dataSource) {
        this.source = imageSource;
        this.mimeType = str;
        this.dataSource = dataSource;
    }

    public final coil3.graphics.ImageSource getSource() {
        return this.source;
    }

    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    public final coil3.graphics.DataSource getDataSource() {
        return this.dataSource;
    }

    public final java.lang.String toString() {
        coil3.graphics.ImageSource imageSource = this.source;
        java.lang.String str = this.mimeType;
        coil3.graphics.DataSource dataSource = this.dataSource;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SourceFetchResult(source=");
        sb.append(imageSource);
        sb.append(", mimeType=");
        sb.append(str);
        sb.append(", dataSource=");
        sb.append(dataSource);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.source.hashCode();
        java.lang.String str = this.mimeType;
        return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.dataSource.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof coil3.fetch.SourceFetchResult)) {
            return false;
        }
        coil3.fetch.SourceFetchResult sourceFetchResult = (coil3.fetch.SourceFetchResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.source, sourceFetchResult.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, sourceFetchResult.mimeType) && this.dataSource == sourceFetchResult.dataSource;
    }
}
