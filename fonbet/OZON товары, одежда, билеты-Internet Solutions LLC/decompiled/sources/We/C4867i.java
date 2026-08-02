package We;

import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import lf.AbstractC7947c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import sf.C9684j;

/* renamed from: We.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4867i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<c> f33740a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7947c f33741b;

    /* renamed from: d, reason: collision with root package name */
    public static final b f33739d = new b();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C4867i f33738c = new a().b();

    /* renamed from: We.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f33742a = new ArrayList();

        @NotNull
        public final void a(@NotNull String... pins) {
            Intrinsics.checkNotNullParameter("*.vk.ru", "pattern");
            Intrinsics.checkNotNullParameter(pins, "pins");
            for (String str : pins) {
                this.f33742a.add(new c(str));
            }
        }

        @NotNull
        public final C4867i b() {
            return new C4867i(C7714v.Y0(this.f33742a), null);
        }
    }

    /* renamed from: We.i$b */
    public static final class b {
        @NotNull
        public static String a(@NotNull X509Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (certificate == null) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + b(certificate).a();
        }

        @NotNull
        public static C9684j b(@NotNull X509Certificate sha256Hash) {
            Intrinsics.checkNotNullParameter(sha256Hash, "$this$sha256Hash");
            C9684j c9684j = C9684j.f98719d;
            PublicKey publicKey = sha256Hash.getPublicKey();
            Intrinsics.checkNotNullExpressionValue(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return C9684j.a.d(encoded).d("SHA-256");
        }
    }

    /* renamed from: We.i$c */
    /* loaded from: classes10.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f33743a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f33744b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final C9684j f33745c;

        public c(@NotNull String pin) {
            Intrinsics.checkNotNullParameter("*.vk.ru", "pattern");
            Intrinsics.checkNotNullParameter(pin, "pin");
            if ((!kotlin.text.h.e0("*.vk.ru", "*.", false) || kotlin.text.h.J("*.vk.ru", "*", 1, false, 4) != -1) && ((!kotlin.text.h.e0("*.vk.ru", "**.", false) || kotlin.text.h.J("*.vk.ru", "*", 2, false, 4) != -1) && kotlin.text.h.J("*.vk.ru", "*", 0, false, 6) != -1)) {
                throw new IllegalArgumentException("Unexpected pattern: ".concat("*.vk.ru").toString());
            }
            String b11 = Ye.a.b("*.vk.ru");
            if (b11 == null) {
                throw new IllegalArgumentException("Invalid pattern: ".concat("*.vk.ru"));
            }
            this.f33743a = b11;
            if (kotlin.text.h.e0(pin, "sha1/", false)) {
                this.f33744b = "sha1";
                C9684j c9684j = C9684j.f98719d;
                String substring = pin.substring(5);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                C9684j a11 = C9684j.a.a(substring);
                if (a11 == null) {
                    throw new IllegalArgumentException("Invalid pin hash: ".concat(pin));
                }
                this.f33745c = a11;
                return;
            }
            if (!kotlin.text.h.e0(pin, "sha256/", false)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(pin));
            }
            this.f33744b = "sha256";
            C9684j c9684j2 = C9684j.f98719d;
            String substring2 = pin.substring(7);
            Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
            C9684j a12 = C9684j.a.a(substring2);
            if (a12 == null) {
                throw new IllegalArgumentException("Invalid pin hash: ".concat(pin));
            }
            this.f33745c = a12;
        }

        @NotNull
        public final C9684j a() {
            return this.f33745c;
        }

        @NotNull
        public final String b() {
            return this.f33744b;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x005a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0059 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean c(@NotNull String hostname) {
            boolean a11;
            boolean a12;
            Intrinsics.checkNotNullParameter(hostname, "hostname");
            String str = this.f33743a;
            if (kotlin.text.h.e0(str, "**.", false)) {
                int length = str.length() - 3;
                int length2 = hostname.length() - length;
                a12 = kotlin.text.r.a(hostname.length() - length, 3, length, hostname, str, false);
                return a12 && (length2 == 0 || hostname.charAt(length2 - 1) == '.');
            }
            if (!kotlin.text.h.e0(str, "*.", false)) {
                return Intrinsics.d(hostname, str);
            }
            int length3 = str.length() - 1;
            int length4 = hostname.length() - length3;
            a11 = kotlin.text.r.a(hostname.length() - length3, 1, length3, hostname, str, false);
            if (!a11 || kotlin.text.h.N('.', length4 - 1, 4, hostname) != -1) {
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.d(this.f33743a, cVar.f33743a) && Intrinsics.d(this.f33744b, cVar.f33744b) && Intrinsics.d(this.f33745c, cVar.f33745c);
        }

        public final int hashCode() {
            return this.f33745c.hashCode() + G.g.a(this.f33743a.hashCode() * 31, 31, this.f33744b);
        }

        @NotNull
        public final String toString() {
            return this.f33744b + '/' + this.f33745c.a();
        }
    }

    /* renamed from: We.i$d */
    static final class d extends AbstractC7737t implements Function0<List<? extends X509Certificate>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f33747c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f33748d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, String str) {
            super(0);
            this.f33747c = list;
            this.f33748d = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends X509Certificate> invoke() {
            List a11;
            AbstractC7947c c11 = C4867i.this.c();
            List list = this.f33747c;
            if (c11 != null && (a11 = c11.a(this.f33748d, list)) != null) {
                list = a11;
            }
            List<Certificate> list2 = list;
            ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
            for (Certificate certificate : list2) {
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C4867i(@NotNull Set<c> pins, AbstractC7947c abstractC7947c) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f33740a = pins;
        this.f33741b = abstractC7947c;
    }

    public final void a(@NotNull String hostname, @NotNull List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        b(hostname, new d(peerCertificates, hostname));
    }

    public final void b(@NotNull String hostname, @NotNull Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set<c> set = this.f33740a;
        List<c> list = kotlin.collections.K.f71697a;
        for (Object obj : set) {
            if (((c) obj).c(hostname)) {
                if (list.isEmpty()) {
                    list = new ArrayList();
                }
                U.c(list).add(obj);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = cleanedPeerCertificatesFn.invoke();
        Iterator<? extends X509Certificate> it = invoke.iterator();
        loop1: while (true) {
            boolean hasNext = it.hasNext();
            b bVar = f33739d;
            if (!hasNext) {
                StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
                for (X509Certificate x509Certificate : invoke) {
                    sb2.append("\n    ");
                    bVar.getClass();
                    sb2.append(b.a(x509Certificate));
                    sb2.append(": ");
                    Principal subjectDN = x509Certificate.getSubjectDN();
                    Intrinsics.checkNotNullExpressionValue(subjectDN, "element.subjectDN");
                    sb2.append(subjectDN.getName());
                }
                sb2.append("\n  Pinned certificates for ");
                sb2.append(hostname);
                sb2.append(ProductContainerDTO.RATIO_DELIMITER);
                for (c cVar : list) {
                    sb2.append("\n    ");
                    sb2.append(cVar);
                }
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                throw new SSLPeerUnverifiedException(sb3);
            }
            X509Certificate sha1Hash = it.next();
            C9684j c9684j = null;
            C9684j c9684j2 = null;
            for (c cVar2 : list) {
                String b11 = cVar2.b();
                int hashCode = b11.hashCode();
                if (hashCode == -903629273) {
                    if (!b11.equals("sha256")) {
                        break loop1;
                    }
                    if (c9684j == null) {
                        bVar.getClass();
                        c9684j = b.b(sha1Hash);
                    }
                    if (Intrinsics.d(cVar2.a(), c9684j)) {
                        return;
                    }
                } else {
                    if (hashCode != 3528965 || !b11.equals("sha1")) {
                        break loop1;
                    }
                    if (c9684j2 == null) {
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(sha1Hash, "$this$sha1Hash");
                        C9684j c9684j3 = C9684j.f98719d;
                        PublicKey publicKey = sha1Hash.getPublicKey();
                        Intrinsics.checkNotNullExpressionValue(publicKey, "publicKey");
                        byte[] encoded = publicKey.getEncoded();
                        Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
                        c9684j2 = C9684j.a.d(encoded).d("SHA-1");
                    }
                    if (Intrinsics.d(cVar2.a(), c9684j2)) {
                        return;
                    }
                }
            }
        }
        throw new AssertionError("unsupported hashAlgorithm: " + cVar2.b());
    }

    public final AbstractC7947c c() {
        return this.f33741b;
    }

    @NotNull
    public final C4867i d(@NotNull AbstractC7947c certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.d(this.f33741b, certificateChainCleaner) ? this : new C4867i(this.f33740a, certificateChainCleaner);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4867i)) {
            return false;
        }
        C4867i c4867i = (C4867i) obj;
        return Intrinsics.d(c4867i.f33740a, this.f33740a) && Intrinsics.d(c4867i.f33741b, this.f33741b);
    }

    public final int hashCode() {
        int hashCode = (this.f33740a.hashCode() + 1517) * 41;
        AbstractC7947c abstractC7947c = this.f33741b;
        return hashCode + (abstractC7947c != null ? abstractC7947c.hashCode() : 0);
    }
}
