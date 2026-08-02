package A0;

import android.os.Looper;
import android.view.Choreographer;
import com.google.android.gms.internal.ads.AbstractC1668us;
import com.google.android.gms.internal.ads.Ay;
import com.google.android.gms.internal.ads.C1194kB;
import com.google.android.gms.internal.ads.C1495qy;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.crypto.Cipher;

/* renamed from: A0.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052p0 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f548a;

    public /* synthetic */ C0052p0(int i) {
        this.f548a = i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:6|(2:7|(2:9|(1:12)(1:11))(2:32|33))|13|(4:28|29|20|21)|15|16|17|(4:22|23|20|21)|19|20|21) */
    @Override // java.lang.ThreadLocal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initialValue() {
        Provider provider;
        SecureRandom secureRandom;
        int i = 0;
        Provider provider2 = null;
        switch (this.f548a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                C0055r0 c0055r0 = new C0055r0(choreographer, G4.d.l(myLooper));
                return G4.l.H(c0055r0, c0055r0.f565v);
            case 1:
                return new R0();
            case 2:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(z4.b.f21983e);
                return simpleDateFormat;
            case 3:
                return ByteBuffer.allocate(32);
            case 4:
                try {
                    return (Cipher) C1194kB.f14226b.f14228a.d("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e3) {
                    throw new IllegalStateException(e3);
                }
            case 5:
                try {
                    Cipher cipher = (Cipher) C1194kB.f14226b.f14228a.d("ChaCha20-Poly1305");
                    if (C1495qy.b(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException unused) {
                    return null;
                }
            case 6:
                try {
                    Cipher cipher2 = (Cipher) C1194kB.f14226b.f14228a.d("AES/GCM-SIV/NoPadding");
                    if (Ay.b(cipher2)) {
                        return cipher2;
                    }
                    return null;
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
            case 7:
                String[] strArr = AbstractC1668us.f;
                while (true) {
                    if (i < 3) {
                        provider = Security.getProvider(strArr[i]);
                        if (provider == null) {
                            i++;
                        }
                    } else {
                        provider = null;
                    }
                }
                if (provider != null) {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                    } catch (GeneralSecurityException unused2) {
                    }
                    secureRandom.nextLong();
                    return secureRandom;
                }
                provider2 = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                if (provider2 != null) {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", provider2);
                    } catch (GeneralSecurityException unused3) {
                    }
                    secureRandom.nextLong();
                    return secureRandom;
                }
                secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 8:
                try {
                    return (Cipher) C1194kB.f14226b.f14228a.d("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e6) {
                    throw new IllegalStateException(e6);
                }
            case 9:
                try {
                    return (Cipher) C1194kB.f14226b.f14228a.d("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e7) {
                    throw new IllegalStateException(e7);
                }
            case 10:
                try {
                    return (Cipher) C1194kB.f14226b.f14228a.d("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e8) {
                    throw new IllegalStateException(e8);
                }
            case 11:
                try {
                    return (Cipher) C1194kB.f14226b.f14228a.d("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e9) {
                    throw new IllegalStateException(e9);
                }
            default:
                return 0L;
        }
    }
}
