package p000;

import java.net.SocketAddress;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ue0 {

    /* JADX INFO: renamed from: a */
    public List f7802a;

    /* JADX INFO: renamed from: b */
    public int f7803b;

    /* JADX INFO: renamed from: c */
    public int f7804c;

    /* JADX INFO: renamed from: a */
    public SocketAddress m4909a() {
        if (m4911c()) {
            return (SocketAddress) ((C0190ex) this.f7802a.get(this.f7803b)).f2195a.get(this.f7804c);
        }
        C0270h1.m2191g("Index is past the end of the address group list");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m4910b() {
        if (m4911c()) {
            C0190ex c0190ex = (C0190ex) this.f7802a.get(this.f7803b);
            int i = this.f7804c + 1;
            this.f7804c = i;
            if (i >= c0190ex.f2195a.size()) {
                int i2 = this.f7803b + 1;
                this.f7803b = i2;
                this.f7804c = 0;
                if (i2 < this.f7802a.size()) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m4911c() {
        return this.f7803b < this.f7802a.size();
    }

    /* JADX INFO: renamed from: d */
    public void m4912d() {
        this.f7803b = 0;
        this.f7804c = 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean m4913e(SocketAddress socketAddress) {
        for (int i = 0; i < this.f7802a.size(); i++) {
            int iIndexOf = ((C0190ex) this.f7802a.get(i)).f2195a.indexOf(socketAddress);
            if (iIndexOf != -1) {
                this.f7803b = i;
                this.f7804c = iIndexOf;
                return true;
            }
        }
        return false;
    }
}
