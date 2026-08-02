package W5;

import U5.C0453u;
import java.net.SocketAddress;
import java.util.List;

/* renamed from: W5.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0530p0 {

    /* renamed from: a, reason: collision with root package name */
    public List f7306a;

    /* renamed from: b, reason: collision with root package name */
    public int f7307b;

    /* renamed from: c, reason: collision with root package name */
    public int f7308c;

    public SocketAddress a() {
        if (c()) {
            return (SocketAddress) ((C0453u) this.f7306a.get(this.f7307b)).f6592a.get(this.f7308c);
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public boolean b() {
        if (!c()) {
            return false;
        }
        C0453u c0453u = (C0453u) this.f7306a.get(this.f7307b);
        int i7 = this.f7308c + 1;
        this.f7308c = i7;
        if (i7 < c0453u.f6592a.size()) {
            return true;
        }
        int i8 = this.f7307b + 1;
        this.f7307b = i8;
        this.f7308c = 0;
        return i8 < this.f7306a.size();
    }

    public boolean c() {
        return this.f7307b < this.f7306a.size();
    }

    public void d() {
        this.f7307b = 0;
        this.f7308c = 0;
    }

    public boolean e(SocketAddress socketAddress) {
        for (int i7 = 0; i7 < this.f7306a.size(); i7++) {
            int indexOf = ((C0453u) this.f7306a.get(i7)).f6592a.indexOf(socketAddress);
            if (indexOf != -1) {
                this.f7307b = i7;
                this.f7308c = indexOf;
                return true;
            }
        }
        return false;
    }
}
