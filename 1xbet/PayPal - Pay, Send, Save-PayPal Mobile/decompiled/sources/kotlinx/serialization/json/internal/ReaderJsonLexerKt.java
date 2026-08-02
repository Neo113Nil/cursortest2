package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "reader", "", "buffer", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "ReaderJsonLexer", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/InternalJsonReader;[C)Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "", "BATCH_SIZE", com.visa.cbp.getEncExpo.warmup}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ReaderJsonLexerKt {
    public static final int BATCH_SIZE = 16384;

    public static /* synthetic */ kotlinx.serialization.json.internal.ReaderJsonLexer ReaderJsonLexer$default(kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.InternalJsonReader internalJsonReader, char[] cArr, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            cArr = kotlinx.serialization.json.internal.CharArrayPoolBatchSize.INSTANCE.take();
        }
        return ReaderJsonLexer(json, internalJsonReader, cArr);
    }

    public static final kotlinx.serialization.json.internal.ReaderJsonLexer ReaderJsonLexer(kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.InternalJsonReader internalJsonReader, char[] cArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalJsonReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
        return !json.getConfiguration().getAllowComments() ? new kotlinx.serialization.json.internal.ReaderJsonLexer(internalJsonReader, cArr) : new kotlinx.serialization.json.internal.ReaderJsonLexerWithComments(internalJsonReader, cArr);
    }
}
