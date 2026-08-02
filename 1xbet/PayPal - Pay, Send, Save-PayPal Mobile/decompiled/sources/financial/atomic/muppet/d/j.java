package financial.atomic.muppet.d;

/* loaded from: classes17.dex */
public abstract class j {
    private static final java.util.Set<java.lang.Character> getHighSpeedVideoFpsRangesFor = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{';', java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA), '\"'});

    public static final /* synthetic */ boolean a(char c) {
        return kotlin.text.CharsKt.isWhitespace(c) || kotlin.jvm.internal.Intrinsics.compare((int) c, 32) < 0 || getHighSpeedVideoFpsRangesFor.contains(java.lang.Character.valueOf(c));
    }
}
