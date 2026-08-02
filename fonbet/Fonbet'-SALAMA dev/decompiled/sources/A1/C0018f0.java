package A1;

import android.net.Uri;
import w1.P2;

/* renamed from: A1.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0018f0 implements InterfaceC0027k {

    /* renamed from: c, reason: collision with root package name */
    public static final C0018f0 f352c = new C0018f0(new P2(1, (char) 0));

    /* renamed from: d, reason: collision with root package name */
    public static final C0046u f353d = new C0046u(10);

    /* renamed from: a, reason: collision with root package name */
    public final Uri f354a;

    /* renamed from: b, reason: collision with root package name */
    public final String f355b;

    public C0018f0(P2 p22) {
        this.f354a = (Uri) p22.f17508b;
        this.f355b = (String) p22.f17509c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0018f0)) {
            return false;
        }
        C0018f0 c0018f0 = (C0018f0) obj;
        return v2.t.a(this.f354a, c0018f0.f354a) && v2.t.a(this.f355b, c0018f0.f355b);
    }

    public final int hashCode() {
        Uri uri = this.f354a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f355b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
