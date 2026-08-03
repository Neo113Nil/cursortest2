package io.appmetrica.analytics.coreapi.internal.data;

/* loaded from: classes.dex */
public interface JsonParser<T> extends io.appmetrica.analytics.coreapi.internal.data.Parser<org.json.JSONObject, T> {

    public static final class DefaultImpls {
        public static <T> T parseOrNull(io.appmetrica.analytics.coreapi.internal.data.JsonParser<? extends T> jsonParser, org.json.JSONObject jSONObject) {
            return (T) io.appmetrica.analytics.coreapi.internal.data.Parser.DefaultImpls.parseOrNull(jsonParser, jSONObject);
        }
    }
}
