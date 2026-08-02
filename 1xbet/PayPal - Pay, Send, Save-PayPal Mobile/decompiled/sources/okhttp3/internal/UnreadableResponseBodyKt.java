package okhttp3.internal;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lokhttp3/Response;", "stripBody", "(Lokhttp3/Response;)Lokhttp3/Response;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UnreadableResponseBodyKt {
    public static final okhttp3.Response stripBody(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return response.newBuilder().body(new okhttp3.internal.UnreadableResponseBody(response.body().getGetHighSpeedVideoFpsRangesFor(), response.body().getGetHighResolutionOutputSizeshNQ4ISI())).build();
    }
}
