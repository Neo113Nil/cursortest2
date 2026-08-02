package U7;

import android.os.Build;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.crypto.tink.internal.M;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f27381a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f27382b = 0;

    final class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        protected final Cipher initialValue() {
            try {
                return i8.k.f66115b.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    public static AlgorithmParameterSpec a(int i11, int i12, byte[] bArr) {
        int i13 = M.f59252a;
        Integer valueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
        return (valueOf == null || valueOf.intValue() > 19) ? new GCMParameterSpec(UserVerificationMethods.USER_VERIFY_PATTERN, bArr, i11, i12) : new IvParameterSpec(bArr, i11, i12);
    }

    public static Cipher b() {
        return f27381a.get();
    }
}
