package com.izettle.android.serialization;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/izettle/android/serialization/JsonParser;", "", "<init>", "()V", "", "json", "Lcom/izettle/android/serialization/JsonParser$Callbacks;", "callbacks", "", "parse", "(Ljava/lang/String;Lcom/izettle/android/serialization/JsonParser$Callbacks;)V", "Companion", "Callbacks"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonParser {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.serialization.JsonParser.Companion INSTANCE = new com.izettle.android.serialization.JsonParser.Companion(null);
    private static final kotlin.text.Regex VALUE_REGEX = new kotlin.text.Regex("-?([0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?)|null|true|false");

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/izettle/android/serialization/JsonParser$Callbacks;", "", "", "beginArray", "()V", "beginObject", "endArray", "endObject", "", "key", "keyParsed", "(Ljava/lang/String;)V", "Lcom/izettle/android/serialization/JsonElement;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "valueParsed", "(Lcom/izettle/android/serialization/JsonElement;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Callbacks {
        void beginArray();

        void beginObject();

        void endArray();

        void endObject();

        void keyParsed(java.lang.String key);

        void valueParsed(com.izettle.android.serialization.JsonElement value);
    }

    public final void parse(java.lang.String json, com.izettle.android.serialization.JsonParser.Callbacks callbacks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbacks, "");
        com.izettle.android.serialization.JsonParserContext jsonParserContext = new com.izettle.android.serialization.JsonParserContext(callbacks, json);
        int i = 0;
        while (i < jsonParserContext.getHighSpeedVideoFpsRanges.length()) {
            com.izettle.android.serialization.JsonParserContext.State peek = jsonParserContext.getHighSpeedVideoSizes.peek();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(peek, "");
            i += peek.parseChars(jsonParserContext, jsonParserContext.getHighSpeedVideoFpsRanges, i);
        }
        com.izettle.android.serialization.JsonParserContext.State peek2 = jsonParserContext.getHighSpeedVideoSizes.peek();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(peek2, "");
        peek2.endOfInputReached();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/izettle/android/serialization/JsonParser$Companion;", "", "<init>", "()V", "Lkotlin/text/Regex;", "VALUE_REGEX", "Lkotlin/text/Regex;", "getVALUE_REGEX", "()Lkotlin/text/Regex;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.text.Regex getVALUE_REGEX() {
            return com.izettle.android.serialization.JsonParser.VALUE_REGEX;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
