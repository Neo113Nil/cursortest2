package Z5;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public final class h implements T5.f {

    /* renamed from: b, reason: collision with root package name */
    private final k f35521b;

    /* renamed from: c, reason: collision with root package name */
    private final URL f35522c;

    /* renamed from: d, reason: collision with root package name */
    private final String f35523d;

    /* renamed from: e, reason: collision with root package name */
    private String f35524e;

    /* renamed from: f, reason: collision with root package name */
    private URL f35525f;

    /* renamed from: g, reason: collision with root package name */
    private volatile byte[] f35526g;

    /* renamed from: h, reason: collision with root package name */
    private int f35527h;

    public h(URL url) {
        k kVar = i.f35528a;
        p6.k.c(url, "Argument must not be null");
        this.f35522c = url;
        this.f35523d = null;
        p6.k.c(kVar, "Argument must not be null");
        this.f35521b = kVar;
    }

    private String c() {
        if (TextUtils.isEmpty(this.f35524e)) {
            String str = this.f35523d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.f35522c;
                p6.k.c(url, "Argument must not be null");
                str = url.toString();
            }
            this.f35524e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f35524e;
    }

    public final String a() {
        String str = this.f35523d;
        if (str != null) {
            return str;
        }
        URL url = this.f35522c;
        p6.k.c(url, "Argument must not be null");
        return url.toString();
    }

    public final Map<String, String> b() {
        return this.f35521b.b();
    }

    public final String d() {
        return c();
    }

    public final URL e() throws MalformedURLException {
        if (this.f35525f == null) {
            this.f35525f = new URL(c());
        }
        return this.f35525f;
    }

    @Override // T5.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return a().equals(hVar.a()) && this.f35521b.equals(hVar.f35521b);
    }

    @Override // T5.f
    public final int hashCode() {
        if (this.f35527h == 0) {
            int hashCode = a().hashCode();
            this.f35527h = hashCode;
            this.f35527h = this.f35521b.hashCode() + (hashCode * 31);
        }
        return this.f35527h;
    }

    public final String toString() {
        return a();
    }

    @Override // T5.f
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        if (this.f35526g == null) {
            this.f35526g = a().getBytes(T5.f.f26662a);
        }
        messageDigest.update(this.f35526g);
    }

    public h(String str) {
        k kVar = i.f35528a;
        this.f35522c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f35523d = str;
            p6.k.c(kVar, "Argument must not be null");
            this.f35521b = kVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
