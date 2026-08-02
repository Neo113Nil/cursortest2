package p000;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ex */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0190ex {

    /* JADX INFO: renamed from: d */
    public static final C0794v8 f2194d = new C0794v8("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* JADX INFO: renamed from: a */
    public final List f2195a;

    /* JADX INFO: renamed from: b */
    public final C0831w8 f2196b;

    /* JADX INFO: renamed from: c */
    public final int f2197c;

    public C0190ex(SocketAddress socketAddress) {
        C0831w8 c0831w8 = C0831w8.f8454b;
        List listSingletonList = Collections.singletonList(socketAddress);
        a90.m122f("addrs is empty", !listSingletonList.isEmpty());
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(listSingletonList));
        this.f2195a = listUnmodifiableList;
        a90.m127k(c0831w8, "attrs");
        this.f2196b = c0831w8;
        this.f2197c = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0190ex)) {
            return false;
        }
        C0190ex c0190ex = (C0190ex) obj;
        List list = c0190ex.f2195a;
        List list2 = this.f2195a;
        if (list2.size() != list.size()) {
            return false;
        }
        for (int i = 0; i < list2.size(); i++) {
            if (!((SocketAddress) list2.get(i)).equals(list.get(i))) {
                return false;
            }
        }
        return this.f2196b.equals(c0190ex.f2196b);
    }

    public final int hashCode() {
        return this.f2197c;
    }

    public final String toString() {
        return "[" + this.f2195a + "/" + this.f2196b + "]";
    }
}
