package kotlinx.serialization.json.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\f\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lkotlinx/serialization/json/internal/WriteMode;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;ICC)V", "begin", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "end", "OBJ", "LIST", "MAP", "POLY_OBJ"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WriteMode {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final kotlinx.serialization.json.internal.WriteMode LIST;
    public static final kotlinx.serialization.json.internal.WriteMode MAP;
    public static final kotlinx.serialization.json.internal.WriteMode OBJ;
    public static final kotlinx.serialization.json.internal.WriteMode POLY_OBJ;
    private static final /* synthetic */ kotlinx.serialization.json.internal.WriteMode[] getHighResolutionOutputSizeshNQ4ISI;
    public final char begin;
    public final char end;

    private WriteMode(java.lang.String str, int i, char c, char c2) {
        this.begin = c;
        this.end = c2;
    }

    static {
        kotlinx.serialization.json.internal.WriteMode writeMode = new kotlinx.serialization.json.internal.WriteMode("OBJ", 0, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        OBJ = writeMode;
        kotlinx.serialization.json.internal.WriteMode writeMode2 = new kotlinx.serialization.json.internal.WriteMode("LIST", 1, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        LIST = writeMode2;
        kotlinx.serialization.json.internal.WriteMode writeMode3 = new kotlinx.serialization.json.internal.WriteMode("MAP", 2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        MAP = writeMode3;
        kotlinx.serialization.json.internal.WriteMode writeMode4 = new kotlinx.serialization.json.internal.WriteMode("POLY_OBJ", 3, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        POLY_OBJ = writeMode4;
        kotlinx.serialization.json.internal.WriteMode[] writeModeArr = {writeMode, writeMode2, writeMode3, writeMode4};
        getHighResolutionOutputSizeshNQ4ISI = writeModeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(writeModeArr);
    }

    public static kotlinx.serialization.json.internal.WriteMode[] values() {
        return (kotlinx.serialization.json.internal.WriteMode[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlinx.serialization.json.internal.WriteMode valueOf(java.lang.String str) {
        return (kotlinx.serialization.json.internal.WriteMode) java.lang.Enum.valueOf(kotlinx.serialization.json.internal.WriteMode.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlinx.serialization.json.internal.WriteMode> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
