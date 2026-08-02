package L3;

import Q3.t;
import W3.o;
import android.os.Build;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import v0.AbstractC1663a;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final b f4330c = new b(0);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f4331a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4332b;

    public c(byte[] bArr) {
        if (!AbstractC1663a.b(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        o.a(bArr.length);
        this.f4331a = new SecretKeySpec(bArr, "AES");
        this.f4332b = true;
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        int length = bArr.length;
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            int i7 = t.f5837a;
            Integer valueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
            if ((valueOf != null ? valueOf.intValue() : -1) <= 19) {
                return new IvParameterSpec(bArr, 0, length);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, length);
    }
}
