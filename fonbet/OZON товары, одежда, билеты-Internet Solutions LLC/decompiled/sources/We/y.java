package We;

import Sc.InterfaceC4008j;
import We.P;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f33814e = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f33815a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final P f33816b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4869k f33817c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<Certificate> f33818d;

    public static final class a {

        /* renamed from: We.y$a$a, reason: collision with other inner class name */
        static final class C0599a extends AbstractC7737t implements Function0<List<? extends Certificate>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List f33819b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0599a(List list) {
                super(0);
                this.f33819b = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Certificate> invoke() {
                return this.f33819b;
            }
        }

        @NotNull
        public static y a(@NotNull SSLSession handshake) throws IOException {
            List list;
            Intrinsics.checkNotNullParameter(handshake, "$this$handshake");
            String cipherSuite = handshake.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            int hashCode = cipherSuite.hashCode();
            if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == ".concat(cipherSuite));
            }
            C4869k b11 = C4869k.f33769t.b(cipherSuite);
            String protocol = handshake.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if ("NONE".equals(protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            P.Companion.getClass();
            P a11 = P.a.a(protocol);
            try {
                Certificate[] peerCertificates = handshake.getPeerCertificates();
                list = peerCertificates != null ? Ye.b.n((Certificate[]) Arrays.copyOf(peerCertificates, peerCertificates.length)) : kotlin.collections.K.f71697a;
            } catch (SSLPeerUnverifiedException unused) {
                list = kotlin.collections.K.f71697a;
            }
            Certificate[] localCertificates = handshake.getLocalCertificates();
            return new y(a11, b11, localCertificates != null ? Ye.b.n((Certificate[]) Arrays.copyOf(localCertificates, localCertificates.length)) : kotlin.collections.K.f71697a, new C0599a(list));
        }
    }

    static final class b extends AbstractC7737t implements Function0<List<? extends Certificate>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f33820b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function0 function0) {
            super(0);
            this.f33820b = (AbstractC7737t) function0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Certificate> invoke() {
            try {
                return (List) this.f33820b.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return kotlin.collections.K.f71697a;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(@NotNull P tlsVersion, @NotNull C4869k cipherSuite, @NotNull List<? extends Certificate> localCertificates, @NotNull Function0<? extends List<? extends Certificate>> peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f33816b = tlsVersion;
        this.f33817c = cipherSuite;
        this.f33818d = localCertificates;
        this.f33815a = Sc.k.b(new b(peerCertificatesFn));
    }

    @NotNull
    public final C4869k a() {
        return this.f33817c;
    }

    @NotNull
    public final List<Certificate> b() {
        return this.f33818d;
    }

    @NotNull
    public final List<Certificate> c() {
        return (List) this.f33815a.getValue();
    }

    @NotNull
    public final P d() {
        return this.f33816b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return yVar.f33816b == this.f33816b && Intrinsics.d(yVar.f33817c, this.f33817c) && Intrinsics.d(yVar.c(), c()) && Intrinsics.d(yVar.f33818d, this.f33818d);
    }

    public final int hashCode() {
        return this.f33818d.hashCode() + ((c().hashCode() + ((this.f33817c.hashCode() + ((this.f33816b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String type;
        String type2;
        List<Certificate> c11 = c();
        ArrayList arrayList = new ArrayList(C7714v.z(c11, 10));
        for (Certificate certificate : c11) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f33816b);
        sb2.append(" cipherSuite=");
        sb2.append(this.f33817c);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f33818d;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Intrinsics.checkNotNullExpressionValue(type, "type");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
