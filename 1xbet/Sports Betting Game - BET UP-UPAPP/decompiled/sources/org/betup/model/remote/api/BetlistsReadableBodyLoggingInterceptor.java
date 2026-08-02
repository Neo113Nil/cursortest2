package org.betup.model.remote.api;

import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetlistsReadableBodyLoggingInterceptor.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lorg/betup/model/remote/api/BetlistsReadableBodyLoggingInterceptor;", "Lokhttp3/Interceptor;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "compactGson", "Lcom/google/gson/Gson;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "logResponseBody", "", "response", "logBetlistsResponse", "root", "Lcom/google/gson/JsonObject;", BetlistsReadableBodyLoggingInterceptor.BETLISTS_KEY, "Lcom/google/gson/JsonArray;", "logLongText", "message", "", "logLine", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BetlistsReadableBodyLoggingInterceptor implements Interceptor {
    private static final String BETLISTS_KEY = "betlists";
    private static final int MAX_LOG_LINE_CHARS = 3500;
    private static final long MAX_PEEK_BYTES = 524288;
    private static final String TAG = "OkHttp";
    private final Gson compactGson = new Gson();
    public static final int $stable = 8;

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Response proceed = chain.proceed(chain.request());
        logResponseBody(proceed);
        return proceed;
    }

    private final void logResponseBody(Response response) {
        JsonObject asJsonObject;
        JsonElement jsonElement;
        ResponseBody body = response.body();
        if (body == null) {
            return;
        }
        MediaType mediaType = body.get$contentType();
        String mediaType2 = mediaType != null ? mediaType.getMediaType() : null;
        if (mediaType2 == null) {
            mediaType2 = "";
        }
        if (StringsKt.contains((CharSequence) mediaType2, (CharSequence) "json", true)) {
            try {
                String string = response.peekBody(524288L).string();
                if (StringsKt.isBlank(string)) {
                    return;
                }
                Request request = response.request();
                logLine("<-- " + response.code() + " " + response.message() + " " + request.url() + " (" + body.getContentLength() + "-byte body)");
                JsonElement parseString = JsonParser.parseString(string);
                if (!parseString.isJsonObject() || (jsonElement = (asJsonObject = parseString.getAsJsonObject()).get(BETLISTS_KEY)) == null || !jsonElement.isJsonArray()) {
                    logLongText("body: " + string);
                    return;
                }
                Intrinsics.checkNotNull(asJsonObject);
                JsonArray asJsonArray = jsonElement.getAsJsonArray();
                Intrinsics.checkNotNullExpressionValue(asJsonArray, "getAsJsonArray(...)");
                logBetlistsResponse(asJsonObject, asJsonArray);
            } catch (Exception e) {
                logLine("<-- body log failed: " + e.getMessage());
            }
        }
    }

    private final void logBetlistsResponse(JsonObject root, JsonArray betlists) {
        JsonObject asJsonObject = JsonParser.parseString(this.compactGson.toJson((JsonElement) root)).getAsJsonObject();
        asJsonObject.add(BETLISTS_KEY, new JsonPrimitive("<" + betlists.size() + " items — see betlist[k] below>"));
        logLongText("body: " + this.compactGson.toJson((JsonElement) asJsonObject));
        int i = 0;
        for (JsonElement jsonElement : betlists) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            logLongText("betlist[" + i + "]: " + this.compactGson.toJson(jsonElement));
            i = i2;
        }
    }

    private final void logLongText(String message) {
        if (message.length() <= 3500) {
            logLine(message);
            return;
        }
        int i = 0;
        int i2 = 0;
        while (i < message.length()) {
            int coerceAtMost = RangesKt.coerceAtMost(i + 3500, message.length());
            String str = i2 == 0 ? "" : "... ";
            String substring = message.substring(i, coerceAtMost);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            logLine(str + substring);
            i2++;
            i = coerceAtMost;
        }
    }

    private final void logLine(String message) {
        Log.d(TAG, message);
    }
}
