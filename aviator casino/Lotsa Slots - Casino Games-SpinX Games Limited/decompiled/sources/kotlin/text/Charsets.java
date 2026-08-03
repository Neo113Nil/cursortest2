package kotlin.text;

/* compiled from: Charsets.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/text/Charsets;", "", "<init>", "()V", "UTF_8", "Ljava/nio/charset/Charset;", "UTF_16", "UTF_16BE", "UTF_16LE", "US_ASCII", "ISO_8859_1", "UTF_32", "UTF32", "()Ljava/nio/charset/Charset;", "utf_32", "UTF_32LE", "UTF32_LE", "utf_32le", "UTF_32BE", "UTF32_BE", "utf_32be", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Charsets {
    public static final kotlin.text.Charsets INSTANCE = new kotlin.text.Charsets();
    public static final java.nio.charset.Charset ISO_8859_1;
    public static final java.nio.charset.Charset US_ASCII;
    public static final java.nio.charset.Charset UTF_16;
    public static final java.nio.charset.Charset UTF_16BE;
    public static final java.nio.charset.Charset UTF_16LE;
    public static final java.nio.charset.Charset UTF_8;
    private static volatile java.nio.charset.Charset utf_32;
    private static volatile java.nio.charset.Charset utf_32be;
    private static volatile java.nio.charset.Charset utf_32le;

    private Charsets() {
    }

    static {
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName("UTF-8");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        UTF_8 = forName;
        java.nio.charset.Charset forName2 = java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.UTF16_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName2, "forName(...)");
        UTF_16 = forName2;
        java.nio.charset.Charset forName3 = java.nio.charset.Charset.forName("UTF-16BE");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName3, "forName(...)");
        UTF_16BE = forName3;
        java.nio.charset.Charset forName4 = java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.UTF16LE_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName4, "forName(...)");
        UTF_16LE = forName4;
        java.nio.charset.Charset forName5 = java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.ASCII_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName5, "forName(...)");
        US_ASCII = forName5;
        java.nio.charset.Charset forName6 = java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.ISO88591_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName6, "forName(...)");
        ISO_8859_1 = forName6;
    }

    public final java.nio.charset.Charset UTF32() {
        java.nio.charset.Charset charset = utf_32;
        if (charset != null) {
            return charset;
        }
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName("UTF-32");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        utf_32 = forName;
        return forName;
    }

    public final java.nio.charset.Charset UTF32_LE() {
        java.nio.charset.Charset charset = utf_32le;
        if (charset != null) {
            return charset;
        }
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName("UTF-32LE");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        utf_32le = forName;
        return forName;
    }

    public final java.nio.charset.Charset UTF32_BE() {
        java.nio.charset.Charset charset = utf_32be;
        if (charset != null) {
            return charset;
        }
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName("UTF-32BE");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        utf_32be = forName;
        return forName;
    }
}
