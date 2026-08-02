package U5;

import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public abstract class Y {

    /* renamed from: d, reason: collision with root package name */
    public static final BitSet f6448d;

    /* renamed from: a, reason: collision with root package name */
    public final String f6449a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6450b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6451c;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c3 = '0'; c3 <= '9'; c3 = (char) (c3 + 1)) {
            bitSet.set(c3);
        }
        for (char c4 = 'a'; c4 <= 'z'; c4 = (char) (c4 + 1)) {
            bitSet.set(c4);
        }
        f6448d = bitSet;
    }

    public Y(boolean z4, String str, Object obj) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        p3.f.k(lowerCase, "name");
        p3.f.d("token must have at least 1 tchar", !lowerCase.isEmpty());
        if (lowerCase.equals("connection")) {
            b0.f6456c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i7 = 0; i7 < lowerCase.length(); i7++) {
            char charAt = lowerCase.charAt(i7);
            if ((!z4 || charAt != ':' || i7 != 0) && !f6448d.get(charAt)) {
                throw new IllegalArgumentException(P6.b.z("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
            }
        }
        this.f6449a = lowerCase;
        this.f6450b = lowerCase.getBytes(D3.f.f1717a);
        this.f6451c = obj;
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] b(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f6449a.equals(((Y) obj).f6449a);
    }

    public final int hashCode() {
        return this.f6449a.hashCode();
    }

    public final String toString() {
        return e1.k.i(new StringBuilder("Key{name='"), this.f6449a, "'}");
    }
}
