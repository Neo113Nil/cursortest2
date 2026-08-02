package coil3.content;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\rJA\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Lcoil3/network/NetworkRequest;", "", "", "url", "method", "Lcoil3/network/NetworkHeaders;", "headers", "Lcoil3/network/NetworkRequestBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "Lcoil3/Extras;", "extras", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcoil3/network/NetworkHeaders;Lcoil3/network/NetworkRequestBody;Lcoil3/Extras;)V", "(Ljava/lang/String;Ljava/lang/String;Lcoil3/network/NetworkHeaders;Lcoil3/network/NetworkRequestBody;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcoil3/network/NetworkHeaders;Lcoil3/network/NetworkRequestBody;Lcoil3/Extras;)Lcoil3/network/NetworkRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcoil3/network/NetworkHeaders;Lcoil3/network/NetworkRequestBody;)Lcoil3/network/NetworkRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getUrl", "getMethod", "Lcoil3/network/NetworkHeaders;", "getHeaders", "()Lcoil3/network/NetworkHeaders;", "Lcoil3/network/NetworkRequestBody;", "getBody", "()Lcoil3/network/NetworkRequestBody;", "Lcoil3/Extras;", "getExtras", "()Lcoil3/Extras;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkRequest {
    private final coil3.content.NetworkRequestBody body;
    private final coil3.Extras extras;
    private final coil3.content.NetworkHeaders headers;
    private final java.lang.String method;
    private final java.lang.String url;

    public NetworkRequest(java.lang.String str, java.lang.String str2, coil3.content.NetworkHeaders networkHeaders, coil3.content.NetworkRequestBody networkRequestBody, coil3.Extras extras) {
        this.url = str;
        this.method = str2;
        this.headers = networkHeaders;
        this.body = networkRequestBody;
        this.extras = extras;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public /* synthetic */ NetworkRequest(java.lang.String str, java.lang.String str2, coil3.content.NetworkHeaders networkHeaders, coil3.content.NetworkRequestBody networkRequestBody, coil3.Extras extras, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "GET" : str2, (i & 4) != 0 ? coil3.content.NetworkHeaders.EMPTY : networkHeaders, (i & 8) != 0 ? null : networkRequestBody, (i & 16) != 0 ? coil3.Extras.EMPTY : extras);
    }

    public final java.lang.String getMethod() {
        return this.method;
    }

    public final coil3.content.NetworkHeaders getHeaders() {
        return this.headers;
    }

    public final coil3.content.NetworkRequestBody getBody() {
        return this.body;
    }

    public final coil3.Extras getExtras() {
        return this.extras;
    }

    public static /* synthetic */ coil3.content.NetworkRequest copy$default(coil3.content.NetworkRequest networkRequest, java.lang.String str, java.lang.String str2, coil3.content.NetworkHeaders networkHeaders, coil3.content.NetworkRequestBody networkRequestBody, coil3.Extras extras, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = networkRequest.url;
        }
        if ((i & 2) != 0) {
            str2 = networkRequest.method;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            networkHeaders = networkRequest.headers;
        }
        coil3.content.NetworkHeaders networkHeaders2 = networkHeaders;
        if ((i & 8) != 0) {
            networkRequestBody = networkRequest.body;
        }
        coil3.content.NetworkRequestBody networkRequestBody2 = networkRequestBody;
        if ((i & 16) != 0) {
            extras = networkRequest.extras;
        }
        return networkRequest.copy(str, str3, networkHeaders2, networkRequestBody2, extras);
    }

    public final coil3.content.NetworkRequest copy(java.lang.String url, java.lang.String method, coil3.content.NetworkHeaders headers, coil3.content.NetworkRequestBody body, coil3.Extras extras) {
        return new coil3.content.NetworkRequest(url, method, headers, body, extras);
    }

    public /* synthetic */ NetworkRequest(java.lang.String str, java.lang.String str2, coil3.content.NetworkHeaders networkHeaders, coil3.content.NetworkRequestBody networkRequestBody, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "GET" : str2, (i & 4) != 0 ? coil3.content.NetworkHeaders.EMPTY : networkHeaders, (i & 8) != 0 ? null : networkRequestBody);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public /* synthetic */ NetworkRequest(java.lang.String str, java.lang.String str2, coil3.content.NetworkHeaders networkHeaders, coil3.content.NetworkRequestBody networkRequestBody) {
        this(str, str2, networkHeaders, networkRequestBody, null, 16, null);
    }

    public static /* synthetic */ coil3.content.NetworkRequest copy$default(coil3.content.NetworkRequest networkRequest, java.lang.String str, java.lang.String str2, coil3.content.NetworkHeaders networkHeaders, coil3.content.NetworkRequestBody networkRequestBody, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = networkRequest.url;
        }
        if ((i & 2) != 0) {
            str2 = networkRequest.method;
        }
        if ((i & 4) != 0) {
            networkHeaders = networkRequest.headers;
        }
        if ((i & 8) != 0) {
            networkRequestBody = networkRequest.body;
        }
        return networkRequest.copy(str, str2, networkHeaders, networkRequestBody);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public final /* synthetic */ coil3.content.NetworkRequest copy(java.lang.String url, java.lang.String method, coil3.content.NetworkHeaders headers, coil3.content.NetworkRequestBody body) {
        return new coil3.content.NetworkRequest(url, method, headers, body, this.extras);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.url;
        java.lang.String str2 = this.method;
        coil3.content.NetworkHeaders networkHeaders = this.headers;
        coil3.content.NetworkRequestBody networkRequestBody = this.body;
        coil3.Extras extras = this.extras;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkRequest(url=");
        sb.append(str);
        sb.append(", method=");
        sb.append(str2);
        sb.append(", headers=");
        sb.append(networkHeaders);
        sb.append(", body=");
        sb.append(networkRequestBody);
        sb.append(", extras=");
        sb.append(extras);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode();
        int hashCode2 = this.method.hashCode();
        int hashCode3 = this.headers.hashCode();
        coil3.content.NetworkRequestBody networkRequestBody = this.body;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (networkRequestBody == null ? 0 : networkRequestBody.hashCode())) * 31) + this.extras.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof coil3.content.NetworkRequest)) {
            return false;
        }
        coil3.content.NetworkRequest networkRequest = (coil3.content.NetworkRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, networkRequest.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.method, networkRequest.method) && kotlin.jvm.internal.Intrinsics.areEqual(this.headers, networkRequest.headers) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, networkRequest.body) && kotlin.jvm.internal.Intrinsics.areEqual(this.extras, networkRequest.extras);
    }
}
