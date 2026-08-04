package W3;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L3.b f6724a = new L3.b(5);

    public static byte[] a(int i7) {
        byte[] bArr = new byte[i7];
        ((SecureRandom) f6724a.get()).nextBytes(bArr);
        return bArr;
    }
}
