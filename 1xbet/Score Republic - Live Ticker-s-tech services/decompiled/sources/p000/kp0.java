package p000;

import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kp0 {

    /* JADX INFO: renamed from: d */
    public static final BitSet f4493d;

    /* JADX INFO: renamed from: a */
    public final String f4494a;

    /* JADX INFO: renamed from: b */
    public final byte[] f4495b;

    /* JADX INFO: renamed from: c */
    public final Object f4496c;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        f4493d = bitSet;
    }

    public kp0(Object obj, String str, boolean z) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        a90.m127k(lowerCase, "name");
        a90.m122f("token must have at least 1 tchar", !lowerCase.isEmpty());
        if (lowerCase.equals("connection")) {
            np0.f5484c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i = 0; i < lowerCase.length(); i++) {
            char cCharAt = lowerCase.charAt(i);
            if ((!z || cCharAt != ':' || i != 0) && !f4493d.get(cCharAt)) {
                C0270h1.m2190f(o80.m3651s("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
                throw null;
            }
        }
        this.f4494a = lowerCase;
        this.f4495b = lowerCase.getBytes(AbstractC0358jg.f3919a);
        this.f4496c = obj;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo2949a(byte[] bArr);

    /* JADX INFO: renamed from: b */
    public abstract byte[] mo2950b(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f4494a.equals(((kp0) obj).f4494a);
    }

    public final int hashCode() {
        return this.f4494a.hashCode();
    }

    public final String toString() {
        return AbstractC0024an.m285h(new StringBuilder("Key{name='"), this.f4494a, "'}");
    }
}
