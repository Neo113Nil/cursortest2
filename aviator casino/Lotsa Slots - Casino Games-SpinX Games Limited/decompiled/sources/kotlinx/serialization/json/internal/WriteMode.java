package kotlinx.serialization.json.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WriteMode.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\f\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lkotlinx/serialization/json/internal/WriteMode;", "", "begin", "", "end", "<init>", "(Ljava/lang/String;ICC)V", "OBJ", "LIST", "MAP", "POLY_OBJ", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WriteMode {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlinx.serialization.json.internal.WriteMode[] $VALUES;
    public final char begin;
    public final char end;
    public static final kotlinx.serialization.json.internal.WriteMode OBJ = new kotlinx.serialization.json.internal.WriteMode("OBJ", 0, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
    public static final kotlinx.serialization.json.internal.WriteMode LIST = new kotlinx.serialization.json.internal.WriteMode("LIST", 1, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
    public static final kotlinx.serialization.json.internal.WriteMode MAP = new kotlinx.serialization.json.internal.WriteMode("MAP", 2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
    public static final kotlinx.serialization.json.internal.WriteMode POLY_OBJ = new kotlinx.serialization.json.internal.WriteMode("POLY_OBJ", 3, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);

    private static final /* synthetic */ kotlinx.serialization.json.internal.WriteMode[] $values() {
        return new kotlinx.serialization.json.internal.WriteMode[]{OBJ, LIST, MAP, POLY_OBJ};
    }

    public static kotlin.enums.EnumEntries<kotlinx.serialization.json.internal.WriteMode> getEntries() {
        return $ENTRIES;
    }

    private WriteMode(java.lang.String str, int i, char c, char c2) {
        this.begin = c;
        this.end = c2;
    }

    static {
        kotlinx.serialization.json.internal.WriteMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static kotlinx.serialization.json.internal.WriteMode valueOf(java.lang.String str) {
        return (kotlinx.serialization.json.internal.WriteMode) java.lang.Enum.valueOf(kotlinx.serialization.json.internal.WriteMode.class, str);
    }

    public static kotlinx.serialization.json.internal.WriteMode[] values() {
        return (kotlinx.serialization.json.internal.WriteMode[]) $VALUES.clone();
    }
}
