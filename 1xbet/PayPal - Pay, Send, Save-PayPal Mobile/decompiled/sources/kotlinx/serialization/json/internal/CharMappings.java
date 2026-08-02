package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\b\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lkotlinx/serialization/json/internal/CharMappings;", "", "<init>", "()V", "", "ESCAPE_2_CHAR", "[C", "", "CHAR_TO_TOKEN", "[B"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CharMappings {
    public static final char[] ESCAPE_2_CHAR;
    public static final kotlinx.serialization.json.internal.CharMappings INSTANCE = new kotlinx.serialization.json.internal.CharMappings();
    public static final byte[] CHAR_TO_TOKEN = new byte[126];

    private CharMappings() {
    }

    static {
        char[] cArr = new char[117];
        ESCAPE_2_CHAR = cArr;
        cArr[98] = '\b';
        cArr[116] = '\t';
        cArr[110] = '\n';
        cArr[102] = '\f';
        cArr[114] = '\r';
        cArr[47] = kotlinx.io.files.FileSystemKt.UnixPathSeparator;
        cArr[34] = '\"';
        cArr[92] = '\\';
        for (int i = 0; i < 33; i++) {
            CHAR_TO_TOKEN[i] = Byte.MAX_VALUE;
        }
        byte[] bArr = CHAR_TO_TOKEN;
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }
}
