package org.apache.commons.codec;

/* loaded from: classes17.dex */
public class Charsets {

    @java.lang.Deprecated
    public static final java.nio.charset.Charset ISO_8859_1 = java.nio.charset.StandardCharsets.ISO_8859_1;

    @java.lang.Deprecated
    public static final java.nio.charset.Charset US_ASCII = java.nio.charset.StandardCharsets.US_ASCII;

    @java.lang.Deprecated
    public static final java.nio.charset.Charset UTF_16 = java.nio.charset.StandardCharsets.UTF_16;

    @java.lang.Deprecated
    public static final java.nio.charset.Charset UTF_16BE = java.nio.charset.StandardCharsets.UTF_16BE;

    @java.lang.Deprecated
    public static final java.nio.charset.Charset UTF_16LE = java.nio.charset.StandardCharsets.UTF_16LE;

    @java.lang.Deprecated
    public static final java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;

    public static java.nio.charset.Charset toCharset(java.nio.charset.Charset charset) {
        return charset == null ? java.nio.charset.Charset.defaultCharset() : charset;
    }

    public static java.nio.charset.Charset toCharset(java.lang.String str) {
        return str == null ? java.nio.charset.Charset.defaultCharset() : java.nio.charset.Charset.forName(str);
    }

    @java.lang.Deprecated
    public Charsets() {
    }
}
