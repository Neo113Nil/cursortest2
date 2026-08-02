package N4;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

@Deprecated
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f18678a;

    @Deprecated
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final String f18679a;

        /* renamed from: b, reason: collision with root package name */
        KeyGenParameterSpec f18680b;

        /* renamed from: c, reason: collision with root package name */
        EnumC0359b f18681c;

        public a(Context context) {
            context.getApplicationContext();
            this.f18679a = "_androidx_security_master_key_";
        }

        public final b a() throws GeneralSecurityException, IOException {
            EnumC0359b enumC0359b = this.f18681c;
            if (enumC0359b == null && this.f18680b == null) {
                throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
            }
            if (enumC0359b == EnumC0359b.AES256_GCM) {
                this.f18680b = new KeyGenParameterSpec.Builder(this.f18679a, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();
            }
            KeyGenParameterSpec keyGenParameterSpec = this.f18680b;
            if (keyGenParameterSpec != null) {
                return new b(c.a(keyGenParameterSpec), this.f18680b);
            }
            throw new NullPointerException("KeyGenParameterSpec was null after build() check");
        }

        public final void b(EnumC0359b enumC0359b) {
            if (enumC0359b.ordinal() != 0) {
                throw new IllegalArgumentException("Unsupported scheme: " + enumC0359b);
            }
            if (this.f18680b != null) {
                throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
            }
            this.f18681c = enumC0359b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Deprecated
    /* renamed from: N4.b$b, reason: collision with other inner class name */
    public static final class EnumC0359b {
        private static final /* synthetic */ EnumC0359b[] $VALUES;
        public static final EnumC0359b AES256_GCM;

        static {
            EnumC0359b enumC0359b = new EnumC0359b("AES256_GCM", 0);
            AES256_GCM = enumC0359b;
            $VALUES = new EnumC0359b[]{enumC0359b};
        }

        private EnumC0359b() {
            throw null;
        }

        public static EnumC0359b valueOf(String str) {
            return (EnumC0359b) Enum.valueOf(EnumC0359b.class, str);
        }

        public static EnumC0359b[] values() {
            return (EnumC0359b[]) $VALUES.clone();
        }
    }

    b(String str, Object obj) {
        this.f18678a = str;
    }

    final String a() {
        return this.f18678a;
    }

    public final String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("MasterKey{keyAlias=");
        String str = this.f18678a;
        sb2.append(str);
        sb2.append(", isKeyStoreBacked=");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            z11 = keyStore.containsAlias(str);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            z11 = false;
        }
        return Pk0.a.a("}", sb2, z11);
    }
}
