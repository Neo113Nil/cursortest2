package W1;

import D3.f;
import S1.c;
import Y4.D;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public final class a extends AbstractC1464a {

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f6689i = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: g, reason: collision with root package name */
    public final CharsetDecoder f6690g = f.f1719c.newDecoder();

    /* renamed from: h, reason: collision with root package name */
    public final CharsetDecoder f6691h = f.f1718b.newDecoder();

    @Override // n3.AbstractC1464a
    public final Metadata o(c cVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f6691h;
        CharsetDecoder charsetDecoder2 = this.f6690g;
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
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f6689i.matcher(str);
        String str3 = null;
        for (int i7 = 0; matcher.find(i7); i7 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String a02 = D.a0(group);
                a02.getClass();
                if (a02.equals("streamurl")) {
                    str3 = group2;
                } else if (a02.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str2, str3));
    }
}
