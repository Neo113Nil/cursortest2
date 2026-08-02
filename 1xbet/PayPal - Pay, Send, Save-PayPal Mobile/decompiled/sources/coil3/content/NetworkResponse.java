package coil3.content;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJM\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcoil3/network/NetworkResponse;", "", "", "code", "", "requestMillis", "responseMillis", "Lcoil3/network/NetworkHeaders;", "headers", "Lcoil3/network/NetworkResponseBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "delegate", "<init>", "(IJJLcoil3/network/NetworkHeaders;Lcoil3/network/NetworkResponseBody;Ljava/lang/Object;)V", "copy", "(IJJLcoil3/network/NetworkHeaders;Lcoil3/network/NetworkResponseBody;Ljava/lang/Object;)Lcoil3/network/NetworkResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getCode", "J", "getRequestMillis", "()J", "getResponseMillis", "Lcoil3/network/NetworkHeaders;", "getHeaders", "()Lcoil3/network/NetworkHeaders;", "Lcoil3/network/NetworkResponseBody;", "getBody", "()Lcoil3/network/NetworkResponseBody;", "Ljava/lang/Object;", "getDelegate", "()Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkResponse {
    private final coil3.content.NetworkResponseBody body;
    private final int code;
    private final java.lang.Object delegate;
    private final coil3.content.NetworkHeaders headers;
    private final long requestMillis;
    private final long responseMillis;

    public NetworkResponse(int i, long j, long j2, coil3.content.NetworkHeaders networkHeaders, coil3.content.NetworkResponseBody networkResponseBody, java.lang.Object obj) {
        this.code = i;
        this.requestMillis = j;
        this.responseMillis = j2;
        this.headers = networkHeaders;
        this.body = networkResponseBody;
        this.delegate = obj;
    }

    public final int getCode() {
        return this.code;
    }

    public final long getRequestMillis() {
        return this.requestMillis;
    }

    public final long getResponseMillis() {
        return this.responseMillis;
    }

    public /* synthetic */ NetworkResponse(int i, long j, long j2, coil3.content.NetworkHeaders networkHeaders, coil3.content.NetworkResponseBody networkResponseBody, java.lang.Object obj, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 200 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) == 0 ? j2 : 0L, (i2 & 8) != 0 ? coil3.content.NetworkHeaders.EMPTY : networkHeaders, (i2 & 16) != 0 ? null : networkResponseBody, (i2 & 32) == 0 ? obj : null);
    }

    public final coil3.content.NetworkHeaders getHeaders() {
        return this.headers;
    }

    public final coil3.content.NetworkResponseBody getBody() {
        return this.body;
    }

    public final java.lang.Object getDelegate() {
        return this.delegate;
    }

    public final coil3.content.NetworkResponse copy(int code, long requestMillis, long responseMillis, coil3.content.NetworkHeaders headers, coil3.content.NetworkResponseBody body, java.lang.Object delegate) {
        return new coil3.content.NetworkResponse(code, requestMillis, responseMillis, headers, body, delegate);
    }

    public final java.lang.String toString() {
        int i = this.code;
        long j = this.requestMillis;
        long j2 = this.responseMillis;
        coil3.content.NetworkHeaders networkHeaders = this.headers;
        coil3.content.NetworkResponseBody networkResponseBody = this.body;
        java.lang.Object obj = this.delegate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkResponse(code=");
        sb.append(i);
        sb.append(", requestMillis=");
        sb.append(j);
        sb.append(", responseMillis=");
        sb.append(j2);
        sb.append(", headers=");
        sb.append(networkHeaders);
        sb.append(", body=");
        sb.append(networkResponseBody);
        sb.append(", delegate=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int i = this.code;
        int hashCode = java.lang.Long.hashCode(this.requestMillis);
        int hashCode2 = java.lang.Long.hashCode(this.responseMillis);
        int hashCode3 = this.headers.hashCode();
        coil3.content.NetworkResponseBody networkResponseBody = this.body;
        int hashCode4 = networkResponseBody == null ? 0 : networkResponseBody.hashCode();
        java.lang.Object obj = this.delegate;
        return (((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof coil3.content.NetworkResponse)) {
            return false;
        }
        coil3.content.NetworkResponse networkResponse = (coil3.content.NetworkResponse) other;
        return this.code == networkResponse.code && this.requestMillis == networkResponse.requestMillis && this.responseMillis == networkResponse.responseMillis && kotlin.jvm.internal.Intrinsics.areEqual(this.headers, networkResponse.headers) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, networkResponse.body) && kotlin.jvm.internal.Intrinsics.areEqual(this.delegate, networkResponse.delegate);
    }

    public NetworkResponse() {
        this(0, 0L, 0L, null, null, null, 63, null);
    }
}
