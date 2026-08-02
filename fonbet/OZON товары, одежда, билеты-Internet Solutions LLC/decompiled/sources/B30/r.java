package B30;

import B0.A0;
import B30.a;
import B30.f;
import E0.C2942q;
import H30.C3133b;
import Sc.C4001c;
import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.security.keystore.UserNotAuthenticatedException;
import android.util.Base64;
import androidx.fragment.app.ComponentCallbacksC5392m;
import g30.InterfaceC6618a;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyStore;
import java.security.UnrecoverableKeyException;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import kd.C7665d;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.settings.models.FeatureValue;

@SuppressLint({"NewApi"})
/* loaded from: classes3.dex */
public final class r implements f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f2437a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f2438b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final B30.a f2439c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C30.a f2440d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Q90.c f2441e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final A30.b f2442f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f2443g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f2444h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f2445i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f2446j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f2447k;

    private interface a {

        /* renamed from: B30.r$a$a, reason: collision with other inner class name */
        public static final class C0061a implements a {

            /* renamed from: a, reason: collision with root package name */
            private final int f2448a;

            /* renamed from: b, reason: collision with root package name */
            private final int f2449b;

            public C0061a(int i11, int i12) {
                this.f2448a = i11;
                this.f2449b = i12;
            }

            public final int a() {
                return this.f2449b;
            }

            public final int b() {
                return this.f2448a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0061a)) {
                    return false;
                }
                C0061a c0061a = (C0061a) obj;
                return this.f2448a == c0061a.f2448a && this.f2449b == c0061a.f2449b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f2449b) + (Integer.hashCode(this.f2448a) * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Decryption(encrypted=");
                sb2.append(this.f2448a);
                sb2.append(", decrypted=");
                return K00.b.e(this.f2449b, ")", sb2);
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            private final int f2450a;

            /* renamed from: b, reason: collision with root package name */
            private final int f2451b;

            public b(int i11, int i12) {
                this.f2450a = i11;
                this.f2451b = i12;
            }

            public final int a() {
                return this.f2451b;
            }

            public final int b() {
                return this.f2450a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f2450a == bVar.f2450a && this.f2451b == bVar.f2451b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f2451b) + (Integer.hashCode(this.f2450a) * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Encryption(original=");
                sb2.append(this.f2450a);
                sb2.append(", encrypted=");
                return K00.b.e(this.f2451b, ")", sb2);
            }
        }
    }

    private static final class b extends Exception {
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f2452a;

        /* renamed from: b, reason: collision with root package name */
        private final Exception f2453b;

        public c(String str, Exception exc) {
            this.f2452a = str;
            this.f2453b = exc;
        }

        public final String a() {
            return this.f2452a;
        }

        public final Exception b() {
            return this.f2453b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.d(this.f2452a, cVar.f2452a) && Intrinsics.d(this.f2453b, cVar.f2453b);
        }

        public final int hashCode() {
            String str = this.f2452a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Exception exc = this.f2453b;
            return hashCode + (exc != null ? exc.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "ResultData(data=" + this.f2452a + ", exception=" + this.f2453b + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class d {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d DEFAULT;
        public static final d FAST;

        static {
            d dVar = new d("FAST", 0);
            FAST = dVar;
            d dVar2 = new d("DEFAULT", 1);
            DEFAULT = dVar2;
            d[] dVarArr = {dVar, dVar2};
            $VALUES = dVarArr;
            $ENTRIES = Xc.b.a(dVarArr);
        }

        private d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2454a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f2455b;

        static {
            int[] iArr = new int[a.EnumC0054a.values().length];
            try {
                iArr[a.EnumC0054a.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0054a.CANCELED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC0054a.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2454a = iArr;
            int[] iArr2 = new int[d.values().length];
            try {
                iArr2[d.FAST.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[d.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f2455b = iArr2;
        }
    }

    public r(@NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull SharedPreferences sharedPreferences, @NotNull B30.a biometricAuthManager, @NotNull C30.a executorsProvider, @NotNull Q90.c featureToggles, @NotNull A30.b fastEntryManager, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        Intrinsics.checkNotNullParameter(executorsProvider, "executorsProvider");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fastEntryManager, "fastEntryManager");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f2437a = fintechSettings;
        this.f2438b = sharedPreferences;
        this.f2439c = biometricAuthManager;
        this.f2440d = executorsProvider;
        this.f2441e = featureToggles;
        this.f2442f = fastEntryManager;
        this.f2443g = fintechAnalyticInteractor;
        this.f2444h = Sc.k.b(new n(0));
        this.f2445i = Sc.k.b(new o(this, 0));
        this.f2446j = Sc.k.b(new p());
        this.f2447k = Sc.k.b(new q());
    }

    private final void A(a.EnumC0054a enumC0054a, String str, String str2, Function1 function1) {
        String lowerCase;
        int[] iArr = e.f2454a;
        if (iArr[enumC0054a.ordinal()] == 1) {
            lowerCase = "ok";
        } else {
            lowerCase = enumC0054a.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        this.f2443g.l0(lowerCase);
        int i11 = iArr[enumC0054a.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                function1.invoke(f.d.C0058d.f2405a);
                return;
            } else {
                if (i11 != 3) {
                    throw new Sc.o();
                }
                return;
            }
        }
        try {
            E();
            c u11 = u(x(str2, 2, d.DEFAULT, null), str);
            String a11 = u11.a();
            D30.d q11 = q(new a.C0061a(str.hashCode(), a11 != null ? a11.hashCode() : 0), str2);
            String a12 = u11.a();
            if (a12 != null && a12.length() > 0) {
                function1.invoke(new f.d.c.a(u11.a(), q11.toString()));
                return;
            }
            String str3 = "Ошибка шифрования или сохранения шифрованного токена " + q11;
            Exception b11 = u11.b();
            String localizedMessage = b11 != null ? b11.getLocalizedMessage() : null;
            Exception b12 = u11.b();
            function1.invoke(new f.d.a(str3, localizedMessage, b12 != null ? C4001c.b(b12) : null));
        } catch (Exception e11) {
            L80.a.c("BiometricSecurityStorageImpl", null, e11);
            e11.printStackTrace();
            if (!(e11 instanceof KeyPermanentlyInvalidatedException) && !(e11 instanceof UserNotAuthenticatedException) && !(e11 instanceof UnrecoverableKeyException) && !(e11 instanceof b)) {
                function1.invoke(new f.d.a("Ошибка при подготовке объектов к шифрованию", e11.getLocalizedMessage(), C4001c.b(e11)));
                return;
            }
            r(d.DEFAULT);
            t(str2);
            s(str2);
            function1.invoke(new f.d.b(e11.getLocalizedMessage(), C4001c.b(e11)));
        }
    }

    private final void B(a.EnumC0054a enumC0054a, String str, String str2, Function1 function1) {
        String lowerCase;
        int[] iArr = e.f2454a;
        if (iArr[enumC0054a.ordinal()] == 1) {
            lowerCase = "ok";
        } else {
            lowerCase = enumC0054a.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        this.f2443g.l0(lowerCase);
        int i11 = iArr[enumC0054a.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                function1.invoke(f.AbstractC0060f.d.f2414a);
                return;
            } else {
                if (i11 != 3) {
                    throw new Sc.o();
                }
                return;
            }
        }
        try {
            E();
            c v11 = v(y(str2, d.DEFAULT), str);
            int hashCode = str.hashCode();
            String a11 = v11.a();
            D30.d q11 = q(new a.b(hashCode, a11 != null ? a11.hashCode() : 0), str2);
            if (v11.a() != null) {
                String a12 = v11.a();
                SharedPreferences.Editor edit = this.f2438b.edit();
                edit.putString(str2, a12);
                if (edit.commit()) {
                    function1.invoke(new f.AbstractC0060f.c.a(q11.toString()));
                    return;
                }
            }
            String str3 = "Ошибка шифрования или сохранения шифрованного токена " + q11;
            Exception b11 = v11.b();
            String localizedMessage = b11 != null ? b11.getLocalizedMessage() : null;
            Exception b12 = v11.b();
            function1.invoke(new f.AbstractC0060f.a(str3, localizedMessage, b12 != null ? C4001c.b(b12) : null));
        } catch (Exception e11) {
            L80.a.c("BiometricSecurityStorageImpl", null, e11);
            if (!(e11 instanceof KeyPermanentlyInvalidatedException) && !(e11 instanceof UserNotAuthenticatedException) && !(e11 instanceof UnrecoverableKeyException)) {
                function1.invoke(new f.AbstractC0060f.a("Ошибка при подготовке объектов к шифрованию", e11.getLocalizedMessage(), C4001c.b(e11)));
                return;
            }
            r(d.DEFAULT);
            t(str2);
            s(str2);
            function1.invoke(new f.AbstractC0060f.b(((GeneralSecurityException) e11).getLocalizedMessage(), C4001c.b(e11)));
        }
    }

    private final String C(String str) {
        return str.length() == 0 ? Nk.a.b("Вход в ", this.f2437a.getAppName()) : str;
    }

    private static String D(String str) {
        return Nk.a.b("f", str);
    }

    private final void E() {
        String stringData;
        FeatureValue b11 = ((S90.a) this.f2445i.getValue()).b();
        Long l11 = null;
        if (!b11.isEnabled() || b11.getStringData() == null) {
            b11 = null;
        }
        if (b11 == null || (stringData = b11.getStringData()) == null) {
            return;
        }
        if (stringData.length() > 0) {
            try {
                l11 = Long.valueOf(Long.parseLong(stringData));
            } catch (Exception unused) {
            }
        }
        if (l11 != null) {
            Thread.sleep(l11.longValue());
        }
    }

    public static Unit k(r rVar, String str, String str2, P70.i iVar, a.EnumC0054a authPrompt) {
        Intrinsics.checkNotNullParameter(authPrompt, "authPrompt");
        rVar.B(authPrompt, str, str2, iVar);
        return Unit.f71690a;
    }

    public static Unit l(r rVar, String str, String str2, P70.c cVar, a.EnumC0054a authPromptResult) {
        Intrinsics.checkNotNullParameter(authPromptResult, "authPromptResult");
        rVar.A(authPromptResult, str, str2, cVar);
        return Unit.f71690a;
    }

    public static Unit m(r rVar, String str, String str2, Function1 function1, a.EnumC0054a authPromptResult) {
        Intrinsics.checkNotNullParameter(authPromptResult, "authPromptResult");
        rVar.A(authPromptResult, str, str2, function1);
        return Unit.f71690a;
    }

    public static Unit n(r rVar, String str, String str2, B60.l lVar, a.EnumC0054a authPrompt) {
        Intrinsics.checkNotNullParameter(authPrompt, "authPrompt");
        rVar.B(authPrompt, str, str2, lVar);
        return Unit.f71690a;
    }

    public static S90.a o(r rVar) {
        return rVar.f2441e.q(S90.c.MOB_BIO_SEC_DELAY);
    }

    public static Unit p(r rVar, String str, A30.d dVar, f.d readTokenResult) {
        Intrinsics.checkNotNullParameter(readTokenResult, "readTokenResult");
        if (readTokenResult instanceof f.d.c.a) {
            try {
                c v11 = v(rVar.y(str, d.FAST), ((f.d.c.a) readTokenResult).b());
                if (v11.a() != null) {
                    String a11 = v11.a();
                    SharedPreferences.Editor edit = rVar.f2438b.edit();
                    edit.putString(str, a11);
                    edit.commit();
                    dVar.invoke(f.c.b.f2397a);
                    Unit unit = Unit.f71690a;
                } else {
                    String valueOf = String.valueOf(v11.b());
                    Exception b11 = v11.b();
                    dVar.invoke(new f.c.a.C0057a(valueOf, b11 != null ? C4001c.b(b11) : null));
                    Unit unit2 = Unit.f71690a;
                }
            } catch (Exception e11) {
                L80.a.c("BiometricSecurityStorageImpl", "enabledFastEntry encryptData Exception", e11);
                dVar.invoke(new f.c.a.C0057a(e11.getLocalizedMessage(), C4001c.b(e11)));
                Unit unit3 = Unit.f71690a;
            }
        } else {
            L80.a.b("BiometricSecurityStorageImpl", "enabledFastEntry error " + readTokenResult);
            dVar.invoke(new f.c.a.b("BiometricSecurityStorage.ReadTokenResult is " + readTokenResult));
        }
        return Unit.f71690a;
    }

    private final D30.d q(a aVar, String str) {
        String a11;
        String str2;
        int w11 = w(1, str);
        boolean z11 = aVar instanceof a.C0061a;
        if (z11) {
            a11 = A0.a(w11, w(2, str), "encryptedIV -> ", ", decryptedIV -> ");
        } else {
            if (!(aVar instanceof a.b)) {
                throw new Sc.o();
            }
            a11 = Ej.b.a(w11, "encryptedIV -> ");
        }
        boolean z12 = aVar instanceof a.b;
        SharedPreferences sharedPreferences = this.f2438b;
        if (z12) {
            a.b bVar = (a.b) aVar;
            str2 = Cm.e.c("(Encrypt  start) originalData -> ", bVar.b(), ", encryptedData -> ", " ", bVar.a());
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("ld" + str, str2);
            edit.apply();
        } else {
            if (!z11) {
                throw new Sc.o();
            }
            String string = sharedPreferences.getString("ld" + str, "");
            String str3 = string != null ? string : "";
            a.C0061a c0061a = (a.C0061a) aVar;
            str2 = str3 + "(Decrypt start) encryptedData -> " + c0061a.b() + ", decryptedData -> " + c0061a.a();
        }
        return new D30.d(a11, str2);
    }

    private final void r(d dVar) {
        try {
            int i11 = e.f2455b[dVar.ordinal()];
            if (i11 == 1) {
                z().deleteEntry("fintech_fast_entry_token_id_key_alias");
            } else {
                if (i11 != 2) {
                    throw new Sc.o();
                }
                z().deleteEntry("fintech_token_id_key_alias");
            }
        } catch (Exception e11) {
            L80.a.c("BiometricSecurityStorageImpl", "clearExistingSecretKey", e11);
            this.f2443g.e0(Nk.a.b("error clearExistingSecretKey with type ", dVar.name()));
        }
    }

    private final void s(String str) {
        SharedPreferences.Editor edit = this.f2438b.edit();
        edit.remove("ld" + str);
        edit.remove("eiv" + str);
        edit.remove("div" + str);
        edit.apply();
    }

    private final boolean t(String str) {
        SharedPreferences.Editor edit = this.f2438b.edit();
        edit.remove(str);
        return edit.commit();
    }

    private static c u(Cipher cipher, String str) {
        try {
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] decode = Base64.decode(str, 2);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            byte[] doFinal = cipher.doFinal(decode);
            if (doFinal == null) {
                doFinal = "".getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(doFinal, "getBytes(...)");
            }
            return new c(new String(doFinal, Charsets.UTF_8), null);
        } catch (Exception e11) {
            L80.a.c("BiometricSecurityStorageImpl", null, e11);
            return new c(null, e11);
        }
    }

    private static c v(Cipher cipher, String str) {
        try {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] doFinal = cipher.doFinal(bytes);
            return new c(doFinal != null ? C3133b.a(doFinal) : null, null);
        } catch (Exception e11) {
            L80.a.c("BiometricSecurityStorageImpl", null, e11);
            return new c(null, e11);
        }
    }

    private final int w(int i11, String str) {
        SharedPreferences sharedPreferences = this.f2438b;
        if (i11 == 1) {
            return sharedPreferences.getInt("eiv" + str, 0);
        }
        if (i11 != 2) {
            return 0;
        }
        return sharedPreferences.getInt("div" + str, 0);
    }

    private final Cipher x(String str, int i11, d dVar, SecretKey secretKey) {
        SecretKey secretKey2;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] encode = Base64.encode(bytes, 2);
        byte[] bArr = new byte[16];
        C7705l.s(encode.length > 16 ? encode.length - 16 : 0, 0, 10, encode, bArr);
        int hashCode = C7705l.O(bArr, null, null, 63).hashCode();
        SharedPreferences sharedPreferences = this.f2438b;
        if (i11 == 1) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("eiv".concat(str), hashCode);
            edit.apply();
        } else if (i11 == 2) {
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putInt("div".concat(str), hashCode);
            edit2.apply();
        }
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(...)");
        if (secretKey == null) {
            int i12 = e.f2455b[dVar.ordinal()];
            if (i12 == 1) {
                Key key = z().getKey("fintech_fast_entry_token_id_key_alias", null);
                if (key instanceof SecretKey) {
                    secretKey2 = (SecretKey) key;
                    secretKey = secretKey2;
                }
                secretKey = null;
            } else {
                if (i12 != 2) {
                    throw new Sc.o();
                }
                Key key2 = z().getKey("fintech_token_id_key_alias", null);
                if (key2 instanceof SecretKey) {
                    secretKey2 = (SecretKey) key2;
                    secretKey = secretKey2;
                }
                secretKey = null;
            }
        }
        if (secretKey == null) {
            throw new b();
        }
        cipher.init(i11, secretKey, ivParameterSpec);
        return cipher;
    }

    private final Cipher y(String str, d dVar) {
        boolean z11;
        SecretKey secretKey;
        try {
            int i11 = e.f2455b[dVar.ordinal()];
            if (i11 == 1) {
                z11 = z().containsAlias("fintech_fast_entry_token_id_key_alias");
            } else {
                if (i11 != 2) {
                    throw new Sc.o();
                }
                z11 = z().containsAlias("fintech_token_id_key_alias");
            }
        } catch (Exception e11) {
            L80.a.c("BiometricSecurityStorageImpl", "isSecretKeyExists", e11);
            this.f2443g.e0(Nk.a.b("error isSecretKeyExists with type ", dVar.name()));
            z11 = false;
        }
        if (z11) {
            secretKey = null;
        } else {
            int i12 = e.f2455b[dVar.ordinal()];
            if (i12 == 1) {
                KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) this.f2447k.getValue();
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(keyGenParameterSpec);
                secretKey = keyGenerator.generateKey();
                Intrinsics.checkNotNullExpressionValue(secretKey, "generateKey(...)");
            } else {
                if (i12 != 2) {
                    throw new Sc.o();
                }
                KeyGenParameterSpec keyGenParameterSpec2 = (KeyGenParameterSpec) this.f2446j.getValue();
                KeyGenerator keyGenerator2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator2.init(keyGenParameterSpec2);
                secretKey = keyGenerator2.generateKey();
                Intrinsics.checkNotNullExpressionValue(secretKey, "generateKey(...)");
            }
        }
        return x(str, 1, dVar, secretKey);
    }

    private final KeyStore z() {
        return (KeyStore) this.f2444h.getValue();
    }

    @Override // B30.f
    @NotNull
    public final f.b a(@NotNull String tokenId) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        String string = this.f2438b.getString(D(tokenId), null);
        if (string == null) {
            return new f.b(null, new IllegalStateException("Токен не сохранен в sharedPreferences"));
        }
        String D11 = D(tokenId);
        try {
            c u11 = u(x(D11, 2, d.FAST, null), string);
            return new f.b(u11.a(), u11.b());
        } catch (Exception e11) {
            if ((e11 instanceof KeyPermanentlyInvalidatedException) || (e11 instanceof UnrecoverableKeyException) || (e11 instanceof b)) {
                this.f2442f.c(false);
                t(D11);
                r(d.FAST);
            }
            L80.a.c("BiometricSecurityStorageImpl", "decryptWithoutBiometricPromt", e11);
            return new f.b(null, e11);
        }
    }

    @Override // B30.f
    public final void b(@NotNull ComponentCallbacksC5392m fragment, @NotNull final String tokenId, @NotNull final P70.c callback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter("", "reasonTitle");
        final String string = this.f2438b.getString(tokenId, "");
        if (string == null || string.length() <= 0) {
            callback.invoke(new f.d.a());
        } else {
            this.f2439c.d(fragment, C(""), this.f2440d.a(), new Function1() { // from class: B30.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = string;
                    String str2 = tokenId;
                    return r.l(r.this, str, str2, callback, (a.EnumC0054a) obj);
                }
            });
            Unit unit = Unit.f71690a;
        }
    }

    @Override // B30.f
    public final void c(@NotNull androidx.fragment.app.r activity, @NotNull final String tokenId, @NotNull final Function1<? super f.d, Unit> callback, @NotNull String reasonTitle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(reasonTitle, "reasonTitle");
        final String string = this.f2438b.getString(tokenId, "");
        if (string == null || string.length() <= 0) {
            callback.invoke(new f.d.a());
        } else {
            this.f2439c.c(activity, C(reasonTitle), this.f2440d.a(), new Function1() { // from class: B30.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = string;
                    String str2 = tokenId;
                    return r.m(r.this, str, str2, callback, (a.EnumC0054a) obj);
                }
            });
            Unit unit = Unit.f71690a;
        }
    }

    @Override // B30.f
    public final void d(@NotNull androidx.fragment.app.r activity, @NotNull final String tokenId, @NotNull final String token, @NotNull final B60.l callback, @NotNull String reasonTitle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(reasonTitle, "reasonTitle");
        this.f2439c.c(activity, C(reasonTitle), this.f2440d.a(), new Function1() { // from class: B30.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str = token;
                String str2 = tokenId;
                return r.n(r.this, str, str2, callback, (a.EnumC0054a) obj);
            }
        });
    }

    @Override // B30.f
    public final void e(@NotNull ComponentCallbacksC5392m fragment, @NotNull final String tokenId, @NotNull final String token, @NotNull final P70.i callback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter("", "reasonTitle");
        this.f2439c.d(fragment, C(""), this.f2440d.a(), new Function1() { // from class: B30.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str = token;
                String str2 = tokenId;
                return r.k(r.this, str, str2, callback, (a.EnumC0054a) obj);
            }
        });
    }

    @Override // B30.f
    public final void f(@NotNull androidx.fragment.app.r activity, String str, boolean z11, final A30.d dVar) {
        String D11;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!z11) {
            if (str != null && (D11 = D(str)) != null) {
                t(D11);
                r(d.FAST);
            }
            dVar.invoke(f.c.b.f2397a);
            return;
        }
        A30.b bVar = this.f2442f;
        if (bVar.b() && str != null) {
            final String D12 = D(str);
            c(activity, str, new Function1() { // from class: B30.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return r.p(r.this, D12, dVar, (f.d) obj);
                }
            }, "");
            return;
        }
        String str2 = "enabledFastEntry can't be enabled canEnabled " + bVar.b() + " tokenId != null " + (str != null);
        L80.a.b("BiometricSecurityStorageImpl", str2);
        dVar.invoke(new f.c.a.b(str2));
    }

    @Override // B30.f
    public final void g(@NotNull String tokenId, @NotNull Function1<? super f.a, Unit> callback) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (t(tokenId)) {
            callback.invoke(f.a.b.C0056a.f2391a);
        } else {
            callback.invoke(new f.a.C0055a());
        }
    }

    @Override // B30.f
    @NotNull
    public final f.c h(@NotNull String tokenId, @NotNull String token, boolean z11) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(token, "token");
        f.c.b bVar = f.c.b.f2397a;
        String D11 = D(tokenId);
        if (!z11) {
            t(D11);
            r(d.FAST);
            return bVar;
        }
        try {
            c v11 = v(y(D11, d.FAST), token);
            if (v11.a() != null) {
                String a11 = v11.a();
                SharedPreferences.Editor edit = this.f2438b.edit();
                edit.putString(D11, a11);
                edit.commit();
                return bVar;
            }
            String valueOf = String.valueOf(v11.b());
            Exception b11 = v11.b();
            f.c.a.C0057a c0057a = new f.c.a.C0057a(valueOf, b11 != null ? C4001c.b(b11) : null);
            Unit unit = Unit.f71690a;
            return c0057a;
        } catch (Exception e11) {
            L80.a.c("BiometricSecurityStorageImpl", "enabledFastEntry encryptData Exception", e11);
            f.c.a.C0057a c0057a2 = new f.c.a.C0057a(e11.getLocalizedMessage(), C4001c.b(e11));
            Unit unit2 = Unit.f71690a;
            return c0057a2;
        }
    }

    @Override // B30.f
    @NotNull
    public final String i(@NotNull String ozonId) {
        Intrinsics.checkNotNullParameter(ozonId, "ozonId");
        StringBuilder sb2 = new StringBuilder("");
        int length = 10 - ozonId.length();
        if (length > 0) {
            C7665d it = kotlin.ranges.h.o(0, length).iterator();
            while (it.hasNext()) {
                it.b();
                sb2.insert(0, "0");
            }
        }
        return C2942q.c(sb2, ozonId, "toString(...)");
    }

    @Override // B30.f
    public final void j(@NotNull String tokenId, @NotNull Function1<? super f.e, Unit> callback) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(!Intrinsics.d(this.f2438b.getString(tokenId, ""), "") ? f.e.b.a.f2406a : f.e.b.C0059b.f2407a);
    }
}
