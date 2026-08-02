package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/serialization/json/Json;", "json", "", "source", "Lkotlinx/serialization/json/internal/StringJsonLexer;", "StringJsonLexer", "(Lkotlinx/serialization/json/Json;Ljava/lang/String;)Lkotlinx/serialization/json/internal/StringJsonLexer;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StringJsonLexerKt {
    public static final kotlinx.serialization.json.internal.StringJsonLexer StringJsonLexer(kotlinx.serialization.json.Json json, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return !json.getConfiguration().getAllowComments() ? new kotlinx.serialization.json.internal.StringJsonLexer(str) : new kotlinx.serialization.json.internal.StringJsonLexerWithComments(str);
    }
}
