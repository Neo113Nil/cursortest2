package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class z80 implements xg0 {

    /* JADX INFO: renamed from: b */
    public final sa0 f9675b;

    /* JADX INFO: renamed from: c */
    public final URL f9676c;

    /* JADX INFO: renamed from: d */
    public final String f9677d;

    /* JADX INFO: renamed from: e */
    public String f9678e;

    /* JADX INFO: renamed from: f */
    public URL f9679f;

    /* JADX INFO: renamed from: g */
    public volatile byte[] f9680g;

    /* JADX INFO: renamed from: h */
    public int f9681h;

    public z80(String str, sa0 sa0Var) {
        this.f9676c = null;
        if (TextUtils.isEmpty(str)) {
            C0270h1.m2190f("Must not be null or empty");
            throw null;
        }
        this.f9677d = str;
        o80.m3647h(sa0Var, "Argument must not be null");
        this.f9675b = sa0Var;
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: b */
    public final void mo1038b(MessageDigest messageDigest) {
        if (this.f9680g == null) {
            this.f9680g = m5866c().getBytes(xg0.f8961a);
        }
        messageDigest.update(this.f9680g);
    }

    /* JADX INFO: renamed from: c */
    public final String m5866c() {
        String str = this.f9677d;
        if (str != null) {
            return str;
        }
        URL url = this.f9676c;
        o80.m3647h(url, "Argument must not be null");
        return url.toString();
    }

    /* JADX INFO: renamed from: d */
    public final URL m5867d() {
        if (this.f9679f == null) {
            if (TextUtils.isEmpty(this.f9678e)) {
                String string = this.f9677d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f9676c;
                    o80.m3647h(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f9678e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            this.f9679f = new URL(this.f9678e);
        }
        return this.f9679f;
    }

    @Override // p000.xg0
    public final boolean equals(Object obj) {
        if (obj instanceof z80) {
            z80 z80Var = (z80) obj;
            if (m5866c().equals(z80Var.m5866c()) && this.f9675b.equals(z80Var.f9675b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.xg0
    public final int hashCode() {
        if (this.f9681h == 0) {
            int iHashCode = m5866c().hashCode();
            this.f9681h = iHashCode;
            this.f9681h = this.f9675b.hashCode() + (iHashCode * 31);
        }
        return this.f9681h;
    }

    public final String toString() {
        return m5866c();
    }

    public z80(URL url) {
        gh0 gh0Var = sa0.f7084a;
        o80.m3647h(url, "Argument must not be null");
        this.f9676c = url;
        this.f9677d = null;
        o80.m3647h(gh0Var, "Argument must not be null");
        this.f9675b = gh0Var;
    }
}
