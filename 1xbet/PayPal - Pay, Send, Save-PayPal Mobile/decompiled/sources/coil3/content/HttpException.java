package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcoil3/network/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/getHighSpeedVideoFpsRangesFor;", "Lcoil3/network/NetworkResponse;", "response", "<init>", "(Lcoil3/network/NetworkResponse;)V", "Lcoil3/network/NetworkResponse;", "getResponse", "()Lcoil3/network/NetworkResponse;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpException extends java.lang.RuntimeException {
    private final coil3.content.NetworkResponse response;

    public HttpException(coil3.content.NetworkResponse networkResponse) {
        super("HTTP ".concat(java.lang.String.valueOf(networkResponse.getCode())));
        this.response = networkResponse;
    }

    public final coil3.content.NetworkResponse getResponse() {
        return this.response;
    }
}
