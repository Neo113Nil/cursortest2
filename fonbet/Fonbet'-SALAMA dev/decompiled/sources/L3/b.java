package L3;

import W3.i;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public final class b extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4329a;

    public /* synthetic */ b(int i7) {
        this.f4329a = i7;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f4329a) {
            case 0:
                try {
                    return (Cipher) i.f6718b.f6720a.R("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e7) {
                    throw new IllegalStateException(e7);
                }
            case 1:
                try {
                    return (Cipher) i.f6718b.f6720a.R("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e8) {
                    throw new IllegalStateException(e8);
                }
            case 2:
                try {
                    return (Cipher) i.f6718b.f6720a.R("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e9) {
                    throw new IllegalStateException(e9);
                }
            case 3:
                try {
                    return (Cipher) i.f6718b.f6720a.R("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            case 4:
                try {
                    return (Cipher) i.f6718b.f6720a.R("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
            case 5:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 6:
                return Boolean.FALSE;
            case 7:
                return 0L;
            case 8:
                CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                newDecoder.onMalformedInput(codingErrorAction);
                newDecoder.onUnmappableCharacter(codingErrorAction);
                return newDecoder;
            case 9:
                CharsetEncoder newEncoder = Charset.forName("UTF8").newEncoder();
                CodingErrorAction codingErrorAction2 = CodingErrorAction.REPORT;
                newEncoder.onMalformedInput(codingErrorAction2);
                newEncoder.onUnmappableCharacter(codingErrorAction2);
                return newEncoder;
            default:
                return new Random();
        }
    }
}
