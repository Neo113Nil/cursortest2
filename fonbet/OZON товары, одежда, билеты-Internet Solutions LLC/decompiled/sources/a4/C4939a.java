package a4;

import j3.t;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4939a extends W3.b {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f36251c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f36252a = StandardCharsets.UTF_8.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f36253b = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // W3.b
    protected final t b(W3.a aVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f36253b;
        CharsetDecoder charsetDecoder2 = this.f36252a;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new t(new C4941c(bArr, null, null));
        }
        Matcher matcher = f36251c.matcher(str);
        String str3 = null;
        for (int i11 = 0; matcher.find(i11); i11 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String b11 = O7.b.b(group);
                b11.getClass();
                if (b11.equals("streamurl")) {
                    str3 = group2;
                } else if (b11.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new t(new C4941c(bArr, str2, str3));
    }
}
