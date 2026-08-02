package V7;

import Ej.b;
import T7.C4036s;
import U7.h;
import i8.k;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes9.dex */
public final class a implements S7.a {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f28395a = new C0578a();

    /* renamed from: V7.a$a, reason: collision with other inner class name */
    final class C0578a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        protected final Cipher initialValue() {
            try {
                Cipher a11 = k.f66115b.a("AES/GCM-SIV/NoPadding");
                if (h.d(a11)) {
                    return a11;
                }
                return null;
            } catch (GeneralSecurityException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    public static Cipher c() {
        try {
            Cipher cipher = f28395a.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e11) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e11);
        }
    }

    public static h d(C4036s c4036s) throws GeneralSecurityException {
        return h.c(c4036s, new b());
    }
}
