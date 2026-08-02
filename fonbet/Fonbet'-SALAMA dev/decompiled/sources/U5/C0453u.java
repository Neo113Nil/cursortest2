package U5;

import io.sentry.Session;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: U5.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0453u {

    /* renamed from: d, reason: collision with root package name */
    public static final C0434a f6591d = new C0434a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: a, reason: collision with root package name */
    public final List f6592a;

    /* renamed from: b, reason: collision with root package name */
    public final C0435b f6593b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6594c;

    public C0453u(SocketAddress socketAddress) {
        C0435b c0435b = C0435b.f6454b;
        List singletonList = Collections.singletonList(socketAddress);
        p3.f.d("addrs is empty", !singletonList.isEmpty());
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(singletonList));
        this.f6592a = unmodifiableList;
        p3.f.k(c0435b, Session.JsonKeys.ATTRS);
        this.f6593b = c0435b;
        this.f6594c = unmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0453u)) {
            return false;
        }
        C0453u c0453u = (C0453u) obj;
        List list = this.f6592a;
        if (list.size() != c0453u.f6592a.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!((SocketAddress) list.get(i7)).equals(c0453u.f6592a.get(i7))) {
                return false;
            }
        }
        return this.f6593b.equals(c0453u.f6593b);
    }

    public final int hashCode() {
        return this.f6594c;
    }

    public final String toString() {
        return "[" + this.f6592a + "/" + this.f6593b + "]";
    }
}
