package i1;

import a.AbstractC0009a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f1307c = new d(new LinkedHashSet(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1308a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0009a f1309b;

    public d(LinkedHashSet linkedHashSet, AbstractC0009a abstractC0009a) {
        this.f1308a = linkedHashSet;
        this.f1309b = abstractC0009a;
    }

    public static String b(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        StringBuilder sb = new StringBuilder("sha256/");
        s1.h f2 = s1.h.f(x509Certificate.getPublicKey().getEncoded());
        f2.getClass();
        try {
            s1.h f3 = s1.h.f(MessageDigest.getInstance("SHA-256").digest(f2.f6621a));
            byte[] bArr = s1.p.f6650c;
            byte[] bArr2 = f3.f6621a;
            byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
            int length = bArr2.length - (bArr2.length % 3);
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3 += 3) {
                bArr3[i2] = bArr[(bArr2[i3] & 255) >> 2];
                int i4 = i3 + 1;
                bArr3[i2 + 1] = bArr[((bArr2[i3] & 3) << 4) | ((bArr2[i4] & 255) >> 4)];
                int i5 = i2 + 3;
                int i6 = (bArr2[i4] & 15) << 2;
                int i7 = i3 + 2;
                bArr3[i2 + 2] = bArr[i6 | ((bArr2[i7] & 255) >> 6)];
                i2 += 4;
                bArr3[i5] = bArr[bArr2[i7] & 63];
            }
            int length2 = bArr2.length % 3;
            if (length2 == 1) {
                bArr3[i2] = bArr[(bArr2[length] & 255) >> 2];
                bArr3[i2 + 1] = bArr[(bArr2[length] & 3) << 4];
                bArr3[i2 + 2] = 61;
                bArr3[i2 + 3] = 61;
            } else if (length2 == 2) {
                bArr3[i2] = bArr[(bArr2[length] & 255) >> 2];
                int i8 = (bArr2[length] & 3) << 4;
                int i9 = length + 1;
                bArr3[i2 + 1] = bArr[((bArr2[i9] & 255) >> 4) | i8];
                bArr3[i2 + 2] = bArr[(bArr2[i9] & 15) << 2];
                bArr3[i2 + 3] = 61;
            }
            try {
                sb.append(new String(bArr3, "US-ASCII"));
                return sb.toString();
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new AssertionError(e3);
        }
    }

    public final void a(String str, List list) {
        List emptyList = Collections.emptyList();
        Iterator it = this.f1308a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        if (emptyList.isEmpty()) {
            return;
        }
        AbstractC0009a abstractC0009a = this.f1309b;
        if (abstractC0009a != null) {
            list = abstractC0009a.d(str, list);
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (emptyList.size() > 0) {
                emptyList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i3);
            sb.append("\n    ");
            sb.append(b(x509Certificate));
            sb.append(": ");
            sb.append(x509Certificate.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        int size3 = emptyList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            if (emptyList.get(i4) != null) {
                throw new ClassCastException();
            }
            sb.append("\n    null");
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (j1.d.i(this.f1309b, dVar.f1309b) && this.f1308a.equals(dVar.f1308a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        AbstractC0009a abstractC0009a = this.f1309b;
        return this.f1308a.hashCode() + ((abstractC0009a != null ? abstractC0009a.hashCode() : 0) * 31);
    }
}
