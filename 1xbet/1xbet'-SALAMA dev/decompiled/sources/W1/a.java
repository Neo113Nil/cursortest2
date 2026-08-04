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

/* JADX INFO: loaded from: classes.dex */
public final class a extends p097n3.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f6689i = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharsetDecoder f6690g = f.f1719c.newDecoder();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharsetDecoder f6691h = f.f1718b.newDecoder();

    @Override // p097n3.a
    public final Metadata o(c cVar, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f6691h;
        CharsetDecoder charsetDecoder2 = this.f6690g;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f6689i.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strA0 = D.a0(strGroup);
                strA0.getClass();
                if (strA0.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strA0.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }
}
