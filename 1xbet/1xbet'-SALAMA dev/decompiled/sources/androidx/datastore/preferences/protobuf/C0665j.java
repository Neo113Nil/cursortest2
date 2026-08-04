package androidx.datastore.preferences.protobuf;

import android.media.VolumeProvider;
import android.os.Build;
import com.google.crypto.tink.shaded.protobuf.AbstractC0825e;
import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0833m;
import com.google.crypto.tink.shaded.protobuf.AbstractC0838s;
import com.google.crypto.tink.shaded.protobuf.AbstractC0843x;
import com.google.crypto.tink.shaded.protobuf.C0835o;
import com.google.protobuf.AbstractC0855e;
import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.AbstractC0890y;
import com.google.protobuf.C0872m0;
import com.google.protobuf.C0884t;
import com.google.protobuf.InterfaceC0881r0;
import com.google.protobuf.S0;
import com.ryanheise.audioservice.AudioService;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0665j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9213e;

    public C0665j(H6.b bVar) {
        this.f9209a = 2;
        this.f9212d = 0;
        com.google.protobuf.K.a(bVar, "input");
        this.f9213e = bVar;
        bVar.f3426c = this;
    }

    public static void Y(int i7) throws com.google.crypto.tink.shaded.protobuf.C {
        if ((i7 & 3) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.f();
        }
    }

    public static void Z(int i7) throws com.google.protobuf.M {
        if ((i7 & 3) != 0) {
            throw com.google.protobuf.M.g();
        }
    }

    public static void a0(int i7) throws com.google.crypto.tink.shaded.protobuf.C {
        if ((i7 & 7) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.f();
        }
    }

    public static void b0(int i7) throws com.google.protobuf.M {
        if ((i7 & 7) != 0) {
            throw com.google.protobuf.M.g();
        }
    }

    public static void i(int i7) {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("androidAdjustRemoteVolume", p049g5.l.k("direction", Integer.valueOf(i7)), null);
    }

    public static void j(int i7) {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("androidSetRemoteVolume", p049g5.l.k("volumeIndex", Integer.valueOf(i7)), null);
    }

    public void A(List list) throws com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        int iA;
        int iA2;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof com.google.crypto.tink.shaded.protobuf.J;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 1) {
                        do {
                            list.add(Long.valueOf(eVar.s()));
                            if (eVar.g()) {
                                return;
                            } else {
                                iC = eVar.C();
                            }
                        } while (iC == this.f9210b);
                        this.f9212d = iC;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int iD = eVar.D();
                    a0(iD);
                    int iF = eVar.f() + iD;
                    do {
                        list.add(Long.valueOf(eVar.s()));
                    } while (eVar.f() < iF);
                    return;
                }
                com.google.crypto.tink.shaded.protobuf.J j = (com.google.crypto.tink.shaded.protobuf.J) list;
                int i8 = this.f9210b & 7;
                if (i8 == 1) {
                    do {
                        j.t(eVar.s());
                        if (eVar.g()) {
                            return;
                        } else {
                            iC2 = eVar.C();
                        }
                    } while (iC2 == this.f9210b);
                    this.f9212d = iC2;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int iD2 = eVar.D();
                a0(iD2);
                int iF2 = eVar.f() + iD2;
                do {
                    j.t(eVar.s());
                } while (eVar.f() < iF2);
                return;
            default:
                boolean z7 = list instanceof com.google.protobuf.V;
                H6.b bVar = (H6.b) this.f9213e;
                if (!z7) {
                    int i9 = this.f9210b & 7;
                    if (i9 == 1) {
                        do {
                            list.add(Long.valueOf(bVar.o()));
                            if (bVar.f()) {
                                return;
                            } else {
                                iA = bVar.A();
                            }
                        } while (iA == this.f9210b);
                        this.f9212d = iA;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int iB = bVar.B();
                    b0(iB);
                    int iE = bVar.e() + iB;
                    do {
                        list.add(Long.valueOf(bVar.o()));
                    } while (bVar.e() < iE);
                    return;
                }
                com.google.protobuf.V v6 = (com.google.protobuf.V) list;
                int i10 = this.f9210b & 7;
                if (i10 == 1) {
                    do {
                        v6.t(bVar.o());
                        if (bVar.f()) {
                            return;
                        } else {
                            iA2 = bVar.A();
                        }
                    } while (iA2 == this.f9210b);
                    this.f9212d = iA2;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int iB2 = bVar.B();
                b0(iB2);
                int iE2 = bVar.e() + iB2;
                do {
                    v6.t(bVar.o());
                } while (bVar.e() < iE2);
                return;
        }
    }

    public void B(InterfaceC0676v interfaceC0676v) throws C0679y {
        int iC;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 2) {
            int iD = eVar.D();
            if ((iD & 3) != 0) {
                throw new C0679y("Failed to parse the message.");
            }
            int iF = eVar.f() + iD;
            do {
                ((S) interfaceC0676v).add(Float.valueOf(eVar.t()));
            } while (eVar.f() < iF);
            return;
        }
        if (i7 != 5) {
            throw C0679y.b();
        }
        do {
            ((S) interfaceC0676v).add(Float.valueOf(eVar.t()));
            if (eVar.g()) {
                return;
            } else {
                iC = eVar.C();
            }
        } while (iC == this.f9210b);
        this.f9212d = iC;
    }

    public void C(List list) throws com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        int iA;
        int iA2;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof AbstractC0838s;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 2) {
                        int iD = eVar.D();
                        Y(iD);
                        int iF = eVar.f() + iD;
                        do {
                            list.add(Float.valueOf(eVar.t()));
                        } while (eVar.f() < iF);
                        return;
                    }
                    if (i7 != 5) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    do {
                        list.add(Float.valueOf(eVar.t()));
                        if (eVar.g()) {
                            return;
                        } else {
                            iC = eVar.C();
                        }
                    } while (iC == this.f9210b);
                    this.f9212d = iC;
                    return;
                }
                AbstractC0838s abstractC0838s = (AbstractC0838s) list;
                int i8 = this.f9210b & 7;
                if (i8 == 2) {
                    int iD2 = eVar.D();
                    Y(iD2);
                    int iF2 = eVar.f() + iD2;
                    do {
                        abstractC0838s.t(eVar.t());
                    } while (eVar.f() < iF2);
                    return;
                }
                if (i8 != 5) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                do {
                    abstractC0838s.t(eVar.t());
                    if (eVar.g()) {
                        return;
                    } else {
                        iC2 = eVar.C();
                    }
                } while (iC2 == this.f9210b);
                this.f9212d = iC2;
                return;
            default:
                boolean z7 = list instanceof AbstractC0890y;
                H6.b bVar = (H6.b) this.f9213e;
                if (!z7) {
                    int i9 = this.f9210b & 7;
                    if (i9 == 2) {
                        int iB = bVar.B();
                        Z(iB);
                        int iE = bVar.e() + iB;
                        do {
                            list.add(Float.valueOf(bVar.p()));
                        } while (bVar.e() < iE);
                        return;
                    }
                    if (i9 != 5) {
                        throw com.google.protobuf.M.d();
                    }
                    do {
                        list.add(Float.valueOf(bVar.p()));
                        if (bVar.f()) {
                            return;
                        } else {
                            iA = bVar.A();
                        }
                    } while (iA == this.f9210b);
                    this.f9212d = iA;
                    return;
                }
                AbstractC0890y abstractC0890y = (AbstractC0890y) list;
                int i10 = this.f9210b & 7;
                if (i10 == 2) {
                    int iB2 = bVar.B();
                    Z(iB2);
                    int iE2 = bVar.e() + iB2;
                    do {
                        abstractC0890y.t(bVar.p());
                    } while (bVar.e() < iE2);
                    return;
                }
                if (i10 != 5) {
                    throw com.google.protobuf.M.d();
                }
                do {
                    abstractC0890y.t(bVar.p());
                    if (bVar.f()) {
                        return;
                    } else {
                        iA2 = bVar.A();
                    }
                } while (iA2 == this.f9210b);
                this.f9212d = iA2;
                return;
        }
    }

    public void D(InterfaceC0676v interfaceC0676v) throws C0679y, com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 0) {
            do {
                ((S) interfaceC0676v).add(Integer.valueOf(eVar.u()));
                if (eVar.g()) {
                    return;
                } else {
                    iC = eVar.C();
                }
            } while (iC == this.f9210b);
            this.f9212d = iC;
            return;
        }
        if (i7 != 2) {
            throw C0679y.b();
        }
        int iF = eVar.f() + eVar.D();
        do {
            ((S) interfaceC0676v).add(Integer.valueOf(eVar.u()));
        } while (eVar.f() < iF);
        V(iF);
    }

    public void E(List list) throws C0679y, com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        int iA;
        int iA2;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof AbstractC0843x;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 0) {
                        do {
                            list.add(Integer.valueOf(eVar.u()));
                            if (eVar.g()) {
                                return;
                            } else {
                                iC = eVar.C();
                            }
                        } while (iC == this.f9210b);
                        this.f9212d = iC;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int iF = eVar.f() + eVar.D();
                    do {
                        list.add(Integer.valueOf(eVar.u()));
                    } while (eVar.f() < iF);
                    V(iF);
                    return;
                }
                AbstractC0843x abstractC0843x = (AbstractC0843x) list;
                int i8 = this.f9210b & 7;
                if (i8 == 0) {
                    do {
                        abstractC0843x.t(eVar.u());
                        if (eVar.g()) {
                            return;
                        } else {
                            iC2 = eVar.C();
                        }
                    } while (iC2 == this.f9210b);
                    this.f9212d = iC2;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int iF2 = eVar.f() + eVar.D();
                do {
                    abstractC0843x.t(eVar.u());
                } while (eVar.f() < iF2);
                V(iF2);
                return;
            default:
                boolean z7 = list instanceof com.google.protobuf.G;
                H6.b bVar = (H6.b) this.f9213e;
                if (!z7) {
                    int i9 = this.f9210b & 7;
                    if (i9 == 0) {
                        do {
                            list.add(Integer.valueOf(bVar.q()));
                            if (bVar.f()) {
                                return;
                            } else {
                                iA = bVar.A();
                            }
                        } while (iA == this.f9210b);
                        this.f9212d = iA;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int iE = bVar.e() + bVar.B();
                    do {
                        list.add(Integer.valueOf(bVar.q()));
                    } while (bVar.e() < iE);
                    V(iE);
                    return;
                }
                com.google.protobuf.G g3 = (com.google.protobuf.G) list;
                int i10 = this.f9210b & 7;
                if (i10 == 0) {
                    do {
                        g3.t(bVar.q());
                        if (bVar.f()) {
                            return;
                        } else {
                            iA2 = bVar.A();
                        }
                    } while (iA2 == this.f9210b);
                    this.f9212d = iA2;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int iE2 = bVar.e() + bVar.B();
                do {
                    g3.t(bVar.q());
                } while (bVar.e() < iE2);
                V(iE2);
                return;
        }
    }

    public void F(InterfaceC0676v interfaceC0676v) throws C0679y, com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 0) {
            do {
                ((S) interfaceC0676v).add(Long.valueOf(eVar.v()));
                if (eVar.g()) {
                    return;
                } else {
                    iC = eVar.C();
                }
            } while (iC == this.f9210b);
            this.f9212d = iC;
            return;
        }
        if (i7 != 2) {
            throw C0679y.b();
        }
        int iF = eVar.f() + eVar.D();
        do {
            ((S) interfaceC0676v).add(Long.valueOf(eVar.v()));
        } while (eVar.f() < iF);
        V(iF);
    }

    public void G(List list) throws C0679y, com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        int iA;
        int iA2;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof com.google.crypto.tink.shaded.protobuf.J;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 0) {
                        do {
                            list.add(Long.valueOf(eVar.v()));
                            if (eVar.g()) {
                                return;
                            } else {
                                iC = eVar.C();
                            }
                        } while (iC == this.f9210b);
                        this.f9212d = iC;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int iF = eVar.f() + eVar.D();
                    do {
                        list.add(Long.valueOf(eVar.v()));
                    } while (eVar.f() < iF);
                    V(iF);
                    return;
                }
                com.google.crypto.tink.shaded.protobuf.J j = (com.google.crypto.tink.shaded.protobuf.J) list;
                int i8 = this.f9210b & 7;
                if (i8 == 0) {
                    do {
                        j.t(eVar.v());
                        if (eVar.g()) {
                            return;
                        } else {
                            iC2 = eVar.C();
                        }
                    } while (iC2 == this.f9210b);
                    this.f9212d = iC2;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int iF2 = eVar.f() + eVar.D();
                do {
                    j.t(eVar.v());
                } while (eVar.f() < iF2);
                V(iF2);
                return;
            default:
                boolean z7 = list instanceof com.google.protobuf.V;
                H6.b bVar = (H6.b) this.f9213e;
                if (!z7) {
                    int i9 = this.f9210b & 7;
                    if (i9 == 0) {
                        do {
                            list.add(Long.valueOf(bVar.s()));
                            if (bVar.f()) {
                                return;
                            } else {
                                iA = bVar.A();
                            }
                        } while (iA == this.f9210b);
                        this.f9212d = iA;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int iE = bVar.e() + bVar.B();
                    do {
                        list.add(Long.valueOf(bVar.s()));
                    } while (bVar.e() < iE);
                    V(iE);
                    return;
                }
                com.google.protobuf.V v6 = (com.google.protobuf.V) list;
                int i10 = this.f9210b & 7;
                if (i10 == 0) {
                    do {
                        v6.t(bVar.s());
                        if (bVar.f()) {
                            return;
                        } else {
                            iA2 = bVar.A();
                        }
                    } while (iA2 == this.f9210b);
                    this.f9212d = iA2;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int iE2 = bVar.e() + bVar.B();
                do {
                    v6.t(bVar.s());
                } while (bVar.e() < iE2);
                V(iE2);
                return;
        }
    }

    public void H(InterfaceC0676v interfaceC0676v) throws C0679y {
        int iC;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 2) {
            int iD = eVar.D();
            if ((iD & 3) != 0) {
                throw new C0679y("Failed to parse the message.");
            }
            int iF = eVar.f() + iD;
            do {
                ((S) interfaceC0676v).add(Integer.valueOf(eVar.w()));
            } while (eVar.f() < iF);
            return;
        }
        if (i7 != 5) {
            throw C0679y.b();
        }
        do {
            ((S) interfaceC0676v).add(Integer.valueOf(eVar.w()));
            if (eVar.g()) {
                return;
            } else {
                iC = eVar.C();
            }
        } while (iC == this.f9210b);
        this.f9212d = iC;
    }

    public void I(List list) throws com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        int iA;
        int iA2;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof AbstractC0843x;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 2) {
                        int iD = eVar.D();
                        Y(iD);
                        int iF = eVar.f() + iD;
                        do {
                            list.add(Integer.valueOf(eVar.w()));
                        } while (eVar.f() < iF);
                        return;
                    }
                    if (i7 != 5) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    do {
                        list.add(Integer.valueOf(eVar.w()));
                        if (eVar.g()) {
                            return;
                        } else {
                            iC = eVar.C();
                        }
                    } while (iC == this.f9210b);
                    this.f9212d = iC;
                    return;
                }
                AbstractC0843x abstractC0843x = (AbstractC0843x) list;
                int i8 = this.f9210b & 7;
                if (i8 == 2) {
                    int iD2 = eVar.D();
                    Y(iD2);
                    int iF2 = eVar.f() + iD2;
                    do {
                        abstractC0843x.t(eVar.w());
                    } while (eVar.f() < iF2);
                    return;
                }
                if (i8 != 5) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                do {
                    abstractC0843x.t(eVar.w());
                    if (eVar.g()) {
                        return;
                    } else {
                        iC2 = eVar.C();
                    }
                } while (iC2 == this.f9210b);
                this.f9212d = iC2;
                return;
            default:
                boolean z7 = list instanceof com.google.protobuf.G;
                H6.b bVar = (H6.b) this.f9213e;
                if (!z7) {
                    int i9 = this.f9210b & 7;
                    if (i9 == 2) {
                        int iB = bVar.B();
                        Z(iB);
                        int iE = bVar.e() + iB;
                        do {
                            list.add(Integer.valueOf(bVar.u()));
                        } while (bVar.e() < iE);
                        return;
                    }
                    if (i9 != 5) {
                        throw com.google.protobuf.M.d();
                    }
                    do {
                        list.add(Integer.valueOf(bVar.u()));
                        if (bVar.f()) {
                            return;
                        } else {
                            iA = bVar.A();
                        }
                    } while (iA == this.f9210b);
                    this.f9212d = iA;
                    return;
                }
                com.google.protobuf.G g3 = (com.google.protobuf.G) list;
                int i10 = this.f9210b & 7;
                if (i10 == 2) {
                    int iB2 = bVar.B();
                    Z(iB2);
                    int iE2 = bVar.e() + iB2;
                    do {
                        g3.t(bVar.u());
                    } while (bVar.e() < iE2);
                    return;
                }
                if (i10 != 5) {
                    throw com.google.protobuf.M.d();
                }
                do {
                    g3.t(bVar.u());
                    if (bVar.f()) {
                        return;
                    } else {
                        iA2 = bVar.A();
                    }
                } while (iA2 == this.f9210b);
                this.f9212d = iA2;
                return;
        }
    }

    public void J(InterfaceC0676v interfaceC0676v) throws C0679y {
        int iC;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 1) {
            do {
                ((S) interfaceC0676v).add(Long.valueOf(eVar.x()));
                if (eVar.g()) {
                    return;
                } else {
                    iC = eVar.C();
                }
            } while (iC == this.f9210b);
            this.f9212d = iC;
            return;
        }
        if (i7 != 2) {
            throw C0679y.b();
        }
        int iD = eVar.D();
        if ((iD & 7) != 0) {
            throw new C0679y("Failed to parse the message.");
        }
        int iF = eVar.f() + iD;
        do {
            ((S) interfaceC0676v).add(Long.valueOf(eVar.x()));
        } while (eVar.f() < iF);
    }

    public void K(List list) throws com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        int iA;
        int iA2;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof com.google.crypto.tink.shaded.protobuf.J;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 1) {
                        do {
                            list.add(Long.valueOf(eVar.x()));
                            if (eVar.g()) {
                                return;
                            } else {
                                iC = eVar.C();
                            }
                        } while (iC == this.f9210b);
                        this.f9212d = iC;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int iD = eVar.D();
                    a0(iD);
                    int iF = eVar.f() + iD;
                    do {
                        list.add(Long.valueOf(eVar.x()));
                    } while (eVar.f() < iF);
                    return;
                }
                com.google.crypto.tink.shaded.protobuf.J j = (com.google.crypto.tink.shaded.protobuf.J) list;
                int i8 = this.f9210b & 7;
                if (i8 == 1) {
                    do {
                        j.t(eVar.x());
                        if (eVar.g()) {
                            return;
                        } else {
                            iC2 = eVar.C();
                        }
                    } while (iC2 == this.f9210b);
                    this.f9212d = iC2;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int iD2 = eVar.D();
                a0(iD2);
                int iF2 = eVar.f() + iD2;
                do {
                    j.t(eVar.x());
                } while (eVar.f() < iF2);
                return;
            default:
                boolean z7 = list instanceof com.google.protobuf.V;
                H6.b bVar = (H6.b) this.f9213e;
                if (!z7) {
                    int i9 = this.f9210b & 7;
                    if (i9 == 1) {
                        do {
                            list.add(Long.valueOf(bVar.v()));
                            if (bVar.f()) {
                                return;
                            } else {
                                iA = bVar.A();
                            }
                        } while (iA == this.f9210b);
                        this.f9212d = iA;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int iB = bVar.B();
                    b0(iB);
                    int iE = bVar.e() + iB;
                    do {
                        list.add(Long.valueOf(bVar.v()));
                    } while (bVar.e() < iE);
                    return;
                }
                com.google.protobuf.V v6 = (com.google.protobuf.V) list;
                int i10 = this.f9210b & 7;
                if (i10 == 1) {
                    do {
                        v6.t(bVar.v());
                        if (bVar.f()) {
                            return;
                        } else {
                            iA2 = bVar.A();
                        }
                    } while (iA2 == this.f9210b);
                    this.f9212d = iA2;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int iB2 = bVar.B();
                b0(iB2);
                int iE2 = bVar.e() + iB2;
                do {
                    v6.t(bVar.v());
                } while (bVar.e() < iE2);
                return;
        }
    }

    public void L(InterfaceC0676v interfaceC0676v) throws C0679y, com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 0) {
            do {
                ((S) interfaceC0676v).add(Integer.valueOf(eVar.y()));
                if (eVar.g()) {
                    return;
                } else {
                    iC = eVar.C();
                }
            } while (iC == this.f9210b);
            this.f9212d = iC;
            return;
        }
        if (i7 != 2) {
            throw C0679y.b();
        }
        int iF = eVar.f() + eVar.D();
        do {
            ((S) interfaceC0676v).add(Integer.valueOf(eVar.y()));
        } while (eVar.f() < iF);
        V(iF);
    }

    public void M(List list) throws C0679y, com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        int iA;
        int iA2;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof AbstractC0843x;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 0) {
                        do {
                            list.add(Integer.valueOf(eVar.y()));
                            if (eVar.g()) {
                                return;
                            } else {
                                iC = eVar.C();
                            }
                        } while (iC == this.f9210b);
                        this.f9212d = iC;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int iF = eVar.f() + eVar.D();
                    do {
                        list.add(Integer.valueOf(eVar.y()));
                    } while (eVar.f() < iF);
                    V(iF);
                    return;
                }
                AbstractC0843x abstractC0843x = (AbstractC0843x) list;
                int i8 = this.f9210b & 7;
                if (i8 == 0) {
                    do {
                        abstractC0843x.t(eVar.y());
                        if (eVar.g()) {
                            return;
                        } else {
                            iC2 = eVar.C();
                        }
                    } while (iC2 == this.f9210b);
                    this.f9212d = iC2;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int iF2 = eVar.f() + eVar.D();
                do {
                    abstractC0843x.t(eVar.y());
                } while (eVar.f() < iF2);
                V(iF2);
                return;
            default:
                boolean z7 = list instanceof com.google.protobuf.G;
                H6.b bVar = (H6.b) this.f9213e;
                if (!z7) {
                    int i9 = this.f9210b & 7;
                    if (i9 == 0) {
                        do {
                            list.add(Integer.valueOf(bVar.w()));
                            if (bVar.f()) {
                                return;
                            } else {
                                iA = bVar.A();
                            }
                        } while (iA == this.f9210b);
                        this.f9212d = iA;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int iE = bVar.e() + bVar.B();
                    do {
                        list.add(Integer.valueOf(bVar.w()));
                    } while (bVar.e() < iE);
                    V(iE);
                    return;
                }
                com.google.protobuf.G g3 = (com.google.protobuf.G) list;
                int i10 = this.f9210b & 7;
                if (i10 == 0) {
                    do {
                        g3.t(bVar.w());
                        if (bVar.f()) {
                            return;
                        } else {
                            iA2 = bVar.A();
                        }
                    } while (iA2 == this.f9210b);
                    this.f9212d = iA2;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int iE2 = bVar.e() + bVar.B();
                do {
                    g3.t(bVar.w());
                } while (bVar.e() < iE2);
                V(iE2);
                return;
        }
    }

    public void N(InterfaceC0676v interfaceC0676v) throws C0679y, com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 0) {
            do {
                ((S) interfaceC0676v).add(Long.valueOf(eVar.z()));
                if (eVar.g()) {
                    return;
                } else {
                    iC = eVar.C();
                }
            } while (iC == this.f9210b);
            this.f9212d = iC;
            return;
        }
        if (i7 != 2) {
            throw C0679y.b();
        }
        int iF = eVar.f() + eVar.D();
        do {
            ((S) interfaceC0676v).add(Long.valueOf(eVar.z()));
        } while (eVar.f() < iF);
        V(iF);
    }

    public void O(List list) throws C0679y, com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        int iA;
        int iA2;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof com.google.crypto.tink.shaded.protobuf.J;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 0) {
                        do {
                            list.add(Long.valueOf(eVar.z()));
                            if (eVar.g()) {
                                return;
                            } else {
                                iC = eVar.C();
                            }
                        } while (iC == this.f9210b);
                        this.f9212d = iC;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int iF = eVar.f() + eVar.D();
                    do {
                        list.add(Long.valueOf(eVar.z()));
                    } while (eVar.f() < iF);
                    V(iF);
                    return;
                }
                com.google.crypto.tink.shaded.protobuf.J j = (com.google.crypto.tink.shaded.protobuf.J) list;
                int i8 = this.f9210b & 7;
                if (i8 == 0) {
                    do {
                        j.t(eVar.z());
                        if (eVar.g()) {
                            return;
                        } else {
                            iC2 = eVar.C();
                        }
                    } while (iC2 == this.f9210b);
                    this.f9212d = iC2;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int iF2 = eVar.f() + eVar.D();
                do {
                    j.t(eVar.z());
                } while (eVar.f() < iF2);
                V(iF2);
                return;
            default:
                boolean z7 = list instanceof com.google.protobuf.V;
                H6.b bVar = (H6.b) this.f9213e;
                if (!z7) {
                    int i9 = this.f9210b & 7;
                    if (i9 == 0) {
                        do {
                            list.add(Long.valueOf(bVar.x()));
                            if (bVar.f()) {
                                return;
                            } else {
                                iA = bVar.A();
                            }
                        } while (iA == this.f9210b);
                        this.f9212d = iA;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int iE = bVar.e() + bVar.B();
                    do {
                        list.add(Long.valueOf(bVar.x()));
                    } while (bVar.e() < iE);
                    V(iE);
                    return;
                }
                com.google.protobuf.V v6 = (com.google.protobuf.V) list;
                int i10 = this.f9210b & 7;
                if (i10 == 0) {
                    do {
                        v6.t(bVar.x());
                        if (bVar.f()) {
                            return;
                        } else {
                            iA2 = bVar.A();
                        }
                    } while (iA2 == this.f9210b);
                    this.f9212d = iA2;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int iE2 = bVar.e() + bVar.B();
                do {
                    v6.t(bVar.x());
                } while (bVar.e() < iE2);
                V(iE2);
                return;
        }
    }

    public void P(InterfaceC0676v interfaceC0676v, boolean z4) throws com.google.crypto.tink.shaded.protobuf.B, com.google.protobuf.L, C0678x {
        String strA;
        int iC;
        if ((this.f9210b & 7) != 2) {
            throw C0679y.b();
        }
        do {
            L3.e eVar = (L3.e) this.f9213e;
            if (z4) {
                W(2);
                strA = eVar.B();
            } else {
                W(2);
                strA = eVar.A();
            }
            ((S) interfaceC0676v).add(strA);
            if (eVar.g()) {
                return;
            } else {
                iC = eVar.C();
            }
        } while (iC == this.f9210b);
        this.f9212d = iC;
    }

    public void Q(List list, boolean z4) throws com.google.crypto.tink.shaded.protobuf.B, com.google.protobuf.L, C0678x {
        String strA;
        int iC;
        int iC2;
        String strY;
        int iA;
        int iA2;
        switch (this.f9209a) {
            case 1:
                if ((this.f9210b & 7) != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                boolean z7 = list instanceof com.google.crypto.tink.shaded.protobuf.F;
                L3.e eVar = (L3.e) this.f9213e;
                if (z7 && !z4) {
                    com.google.crypto.tink.shaded.protobuf.F f7 = (com.google.crypto.tink.shaded.protobuf.F) list;
                    do {
                        f7.p(n());
                        if (eVar.g()) {
                            return;
                        } else {
                            iC2 = eVar.C();
                        }
                    } while (iC2 == this.f9210b);
                    this.f9212d = iC2;
                    return;
                }
                do {
                    if (z4) {
                        W(2);
                        strA = eVar.B();
                    } else {
                        W(2);
                        strA = eVar.A();
                    }
                    list.add(strA);
                    if (eVar.g()) {
                        return;
                    } else {
                        iC = eVar.C();
                    }
                } while (iC == this.f9210b);
                this.f9212d = iC;
                return;
            default:
                if ((this.f9210b & 7) != 2) {
                    throw com.google.protobuf.M.d();
                }
                boolean z8 = list instanceof com.google.protobuf.Q;
                H6.b bVar = (H6.b) this.f9213e;
                if (z8 && !z4) {
                    com.google.protobuf.Q q7 = (com.google.protobuf.Q) list;
                    do {
                        q7.h(o());
                        if (bVar.f()) {
                            return;
                        } else {
                            iA2 = bVar.A();
                        }
                    } while (iA2 == this.f9210b);
                    this.f9212d = iA2;
                    return;
                }
                do {
                    if (z4) {
                        W(2);
                        strY = bVar.z();
                    } else {
                        W(2);
                        strY = bVar.y();
                    }
                    list.add(strY);
                    if (bVar.f()) {
                        return;
                    } else {
                        iA = bVar.A();
                    }
                } while (iA == this.f9210b);
                this.f9212d = iA;
                return;
        }
    }

    public void R(InterfaceC0676v interfaceC0676v) throws C0679y, com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 0) {
            do {
                ((S) interfaceC0676v).add(Integer.valueOf(eVar.D()));
                if (eVar.g()) {
                    return;
                } else {
                    iC = eVar.C();
                }
            } while (iC == this.f9210b);
            this.f9212d = iC;
            return;
        }
        if (i7 != 2) {
            throw C0679y.b();
        }
        int iF = eVar.f() + eVar.D();
        do {
            ((S) interfaceC0676v).add(Integer.valueOf(eVar.D()));
        } while (eVar.f() < iF);
        V(iF);
    }

    public void S(List list) throws C0679y, com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        int iA;
        int iA2;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof AbstractC0843x;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 0) {
                        do {
                            list.add(Integer.valueOf(eVar.D()));
                            if (eVar.g()) {
                                return;
                            } else {
                                iC = eVar.C();
                            }
                        } while (iC == this.f9210b);
                        this.f9212d = iC;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int iF = eVar.f() + eVar.D();
                    do {
                        list.add(Integer.valueOf(eVar.D()));
                    } while (eVar.f() < iF);
                    V(iF);
                    return;
                }
                AbstractC0843x abstractC0843x = (AbstractC0843x) list;
                int i8 = this.f9210b & 7;
                if (i8 == 0) {
                    do {
                        abstractC0843x.t(eVar.D());
                        if (eVar.g()) {
                            return;
                        } else {
                            iC2 = eVar.C();
                        }
                    } while (iC2 == this.f9210b);
                    this.f9212d = iC2;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int iF2 = eVar.f() + eVar.D();
                do {
                    abstractC0843x.t(eVar.D());
                } while (eVar.f() < iF2);
                V(iF2);
                return;
            default:
                boolean z7 = list instanceof com.google.protobuf.G;
                H6.b bVar = (H6.b) this.f9213e;
                if (!z7) {
                    int i9 = this.f9210b & 7;
                    if (i9 == 0) {
                        do {
                            list.add(Integer.valueOf(bVar.B()));
                            if (bVar.f()) {
                                return;
                            } else {
                                iA = bVar.A();
                            }
                        } while (iA == this.f9210b);
                        this.f9212d = iA;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int iE = bVar.e() + bVar.B();
                    do {
                        list.add(Integer.valueOf(bVar.B()));
                    } while (bVar.e() < iE);
                    V(iE);
                    return;
                }
                com.google.protobuf.G g3 = (com.google.protobuf.G) list;
                int i10 = this.f9210b & 7;
                if (i10 == 0) {
                    do {
                        g3.t(bVar.B());
                        if (bVar.f()) {
                            return;
                        } else {
                            iA2 = bVar.A();
                        }
                    } while (iA2 == this.f9210b);
                    this.f9212d = iA2;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int iE2 = bVar.e() + bVar.B();
                do {
                    g3.t(bVar.B());
                } while (bVar.e() < iE2);
                V(iE2);
                return;
        }
    }

    public void T(InterfaceC0676v interfaceC0676v) throws C0679y, com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 0) {
            do {
                ((S) interfaceC0676v).add(Long.valueOf(eVar.E()));
                if (eVar.g()) {
                    return;
                } else {
                    iC = eVar.C();
                }
            } while (iC == this.f9210b);
            this.f9212d = iC;
            return;
        }
        if (i7 != 2) {
            throw C0679y.b();
        }
        int iF = eVar.f() + eVar.D();
        do {
            ((S) interfaceC0676v).add(Long.valueOf(eVar.E()));
        } while (eVar.f() < iF);
        V(iF);
    }

    public void U(List list) throws C0679y, com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        int iA;
        int iA2;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof com.google.crypto.tink.shaded.protobuf.J;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 0) {
                        do {
                            list.add(Long.valueOf(eVar.E()));
                            if (eVar.g()) {
                                return;
                            } else {
                                iC = eVar.C();
                            }
                        } while (iC == this.f9210b);
                        this.f9212d = iC;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int iF = eVar.f() + eVar.D();
                    do {
                        list.add(Long.valueOf(eVar.E()));
                    } while (eVar.f() < iF);
                    V(iF);
                    return;
                }
                com.google.crypto.tink.shaded.protobuf.J j = (com.google.crypto.tink.shaded.protobuf.J) list;
                int i8 = this.f9210b & 7;
                if (i8 == 0) {
                    do {
                        j.t(eVar.E());
                        if (eVar.g()) {
                            return;
                        } else {
                            iC2 = eVar.C();
                        }
                    } while (iC2 == this.f9210b);
                    this.f9212d = iC2;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int iF2 = eVar.f() + eVar.D();
                do {
                    j.t(eVar.E());
                } while (eVar.f() < iF2);
                V(iF2);
                return;
            default:
                boolean z7 = list instanceof com.google.protobuf.V;
                H6.b bVar = (H6.b) this.f9213e;
                if (!z7) {
                    int i9 = this.f9210b & 7;
                    if (i9 == 0) {
                        do {
                            list.add(Long.valueOf(bVar.C()));
                            if (bVar.f()) {
                                return;
                            } else {
                                iA = bVar.A();
                            }
                        } while (iA == this.f9210b);
                        this.f9212d = iA;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int iE = bVar.e() + bVar.B();
                    do {
                        list.add(Long.valueOf(bVar.C()));
                    } while (bVar.e() < iE);
                    V(iE);
                    return;
                }
                com.google.protobuf.V v6 = (com.google.protobuf.V) list;
                int i10 = this.f9210b & 7;
                if (i10 == 0) {
                    do {
                        v6.t(bVar.C());
                        if (bVar.f()) {
                            return;
                        } else {
                            iA2 = bVar.A();
                        }
                    } while (iA2 == this.f9210b);
                    this.f9212d = iA2;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int iE2 = bVar.e() + bVar.B();
                do {
                    v6.t(bVar.C());
                } while (bVar.e() < iE2);
                V(iE2);
                return;
        }
    }

    public void V(int i7) throws C0679y, com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        switch (this.f9209a) {
            case 0:
                if (((L3.e) this.f9213e).f() != i7) {
                    throw C0679y.e();
                }
                return;
            case 1:
                if (((L3.e) this.f9213e).f() != i7) {
                    throw com.google.crypto.tink.shaded.protobuf.C.g();
                }
                return;
            default:
                if (((H6.b) this.f9213e).e() != i7) {
                    throw com.google.protobuf.M.h();
                }
                return;
        }
    }

    public void W(int i7) throws com.google.crypto.tink.shaded.protobuf.B, com.google.protobuf.L, C0678x {
        switch (this.f9209a) {
            case 0:
                if ((this.f9210b & 7) != i7) {
                    throw C0679y.b();
                }
                return;
            case 1:
                if ((this.f9210b & 7) != i7) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                return;
            default:
                if ((this.f9210b & 7) != i7) {
                    throw com.google.protobuf.M.d();
                }
                return;
        }
    }

    public boolean X() {
        int i7;
        int i8;
        switch (this.f9209a) {
            case 0:
                L3.e eVar = (L3.e) this.f9213e;
                if (eVar.g() || (i7 = this.f9210b) == this.f9211c) {
                    return false;
                }
                return eVar.F(i7);
            default:
                H6.b bVar = (H6.b) this.f9213e;
                if (bVar.f() || (i8 = this.f9210b) == this.f9211c) {
                    return false;
                }
                return bVar.D(i8);
        }
    }

    public int a() {
        switch (this.f9209a) {
            case 0:
                int i7 = this.f9212d;
                if (i7 != 0) {
                    this.f9210b = i7;
                    this.f9212d = 0;
                } else {
                    this.f9210b = ((L3.e) this.f9213e).C();
                }
                int i8 = this.f9210b;
                return (i8 == 0 || i8 == this.f9211c) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i8 >>> 3;
            case 1:
                int i9 = this.f9212d;
                if (i9 != 0) {
                    this.f9210b = i9;
                    this.f9212d = 0;
                } else {
                    this.f9210b = ((L3.e) this.f9213e).C();
                }
                int i10 = this.f9210b;
                return (i10 == 0 || i10 == this.f9211c) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i10 >>> 3;
            default:
                int i11 = this.f9212d;
                if (i11 != 0) {
                    this.f9210b = i11;
                    this.f9212d = 0;
                } else {
                    this.f9210b = ((H6.b) this.f9213e).A();
                }
                int i12 = this.f9210b;
                return (i12 == 0 || i12 == this.f9211c) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i12 >>> 3;
        }
    }

    public VolumeProvider b() {
        if (((VolumeProvider) this.f9213e) == null) {
            int i7 = Build.VERSION.SDK_INT;
            int i8 = this.f9211c;
            int i9 = this.f9210b;
            if (i7 >= 30) {
                this.f9213e = new p117q0.w(this, i9, i8, this.f9212d);
            } else {
                this.f9213e = new p117q0.x(this, i9, i8, this.f9212d);
            }
        }
        return (VolumeProvider) this.f9213e;
    }

    public void c(Object obj, U u4, C0668m c0668m) {
        int i7 = this.f9211c;
        this.f9211c = ((this.f9210b >>> 3) << 3) | 4;
        try {
            u4.i(obj, this, c0668m);
            if (this.f9210b != this.f9211c) {
                throw new C0679y("Failed to parse the message.");
            }
            this.f9211c = i7;
        } catch (Throwable th) {
            this.f9211c = i7;
            throw th;
        }
    }

    public void d(Object obj, com.google.crypto.tink.shaded.protobuf.c0 c0Var, C0835o c0835o) {
        int i7 = this.f9211c;
        this.f9211c = ((this.f9210b >>> 3) << 3) | 4;
        try {
            c0Var.j(obj, this, c0835o);
            if (this.f9210b != this.f9211c) {
                throw com.google.crypto.tink.shaded.protobuf.C.f();
            }
            this.f9211c = i7;
        } catch (Throwable th) {
            this.f9211c = i7;
            throw th;
        }
    }

    public void e(Object obj, InterfaceC0881r0 interfaceC0881r0, C0884t c0884t) {
        int i7 = this.f9211c;
        this.f9211c = ((this.f9210b >>> 3) << 3) | 4;
        try {
            interfaceC0881r0.g(obj, this, c0884t);
            if (this.f9210b != this.f9211c) {
                throw com.google.protobuf.M.g();
            }
            this.f9211c = i7;
        } catch (Throwable th) {
            this.f9211c = i7;
            throw th;
        }
    }

    public void f(Object obj, U u4, C0668m c0668m) throws C0679y {
        L3.e eVar = (L3.e) this.f9213e;
        int iD = eVar.D();
        if (eVar.f4334a >= 100) {
            throw new C0679y("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iL = eVar.l(iD);
        eVar.f4334a++;
        u4.i(obj, this, c0668m);
        eVar.b(0);
        eVar.f4334a--;
        eVar.j(iL);
    }

    public void g(Object obj, com.google.crypto.tink.shaded.protobuf.c0 c0Var, C0835o c0835o) throws com.google.crypto.tink.shaded.protobuf.C {
        L3.e eVar = (L3.e) this.f9213e;
        int iD = eVar.D();
        if (eVar.f4334a >= 100) {
            throw new com.google.crypto.tink.shaded.protobuf.C("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iL = eVar.l(iD);
        eVar.f4334a++;
        c0Var.j(obj, this, c0835o);
        eVar.b(0);
        eVar.f4334a--;
        eVar.j(iL);
    }

    public void h(Object obj, InterfaceC0881r0 interfaceC0881r0, C0884t c0884t) throws com.google.protobuf.M {
        H6.b bVar = (H6.b) this.f9213e;
        int iB = bVar.B();
        if (bVar.f3424a >= bVar.f3425b) {
            throw new com.google.protobuf.M("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int i7 = bVar.i(iB);
        bVar.f3424a++;
        interfaceC0881r0.g(obj, this, c0884t);
        bVar.a(0);
        bVar.f3424a--;
        bVar.h(i7);
    }

    public void k(InterfaceC0676v interfaceC0676v) throws C0679y, com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 0) {
            do {
                ((S) interfaceC0676v).add(Boolean.valueOf(eVar.m()));
                if (eVar.g()) {
                    return;
                } else {
                    iC = eVar.C();
                }
            } while (iC == this.f9210b);
            this.f9212d = iC;
            return;
        }
        if (i7 != 2) {
            throw C0679y.b();
        }
        int iF = eVar.f() + eVar.D();
        do {
            ((S) interfaceC0676v).add(Boolean.valueOf(eVar.m()));
        } while (eVar.f() < iF);
        V(iF);
    }

    public void l(List list) throws C0679y, com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        int iA;
        int iA2;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof AbstractC0825e;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 0) {
                        do {
                            list.add(Boolean.valueOf(eVar.m()));
                            if (eVar.g()) {
                                return;
                            } else {
                                iC = eVar.C();
                            }
                        } while (iC == this.f9210b);
                        this.f9212d = iC;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int iF = eVar.f() + eVar.D();
                    do {
                        list.add(Boolean.valueOf(eVar.m()));
                    } while (eVar.f() < iF);
                    V(iF);
                    return;
                }
                AbstractC0825e abstractC0825e = (AbstractC0825e) list;
                int i8 = this.f9210b & 7;
                if (i8 == 0) {
                    do {
                        abstractC0825e.t(eVar.m());
                        if (eVar.g()) {
                            return;
                        } else {
                            iC2 = eVar.C();
                        }
                    } while (iC2 == this.f9210b);
                    this.f9212d = iC2;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int iF2 = eVar.f() + eVar.D();
                do {
                    abstractC0825e.t(eVar.m());
                } while (eVar.f() < iF2);
                V(iF2);
                return;
            default:
                boolean z7 = list instanceof AbstractC0855e;
                H6.b bVar = (H6.b) this.f9213e;
                if (!z7) {
                    int i9 = this.f9210b & 7;
                    if (i9 == 0) {
                        do {
                            list.add(Boolean.valueOf(bVar.j()));
                            if (bVar.f()) {
                                return;
                            } else {
                                iA = bVar.A();
                            }
                        } while (iA == this.f9210b);
                        this.f9212d = iA;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int iE = bVar.e() + bVar.B();
                    do {
                        list.add(Boolean.valueOf(bVar.j()));
                    } while (bVar.e() < iE);
                    V(iE);
                    return;
                }
                AbstractC0855e abstractC0855e = (AbstractC0855e) list;
                int i10 = this.f9210b & 7;
                if (i10 == 0) {
                    do {
                        abstractC0855e.t(bVar.j());
                        if (bVar.f()) {
                            return;
                        } else {
                            iA2 = bVar.A();
                        }
                    } while (iA2 == this.f9210b);
                    this.f9212d = iA2;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int iE2 = bVar.e() + bVar.B();
                do {
                    abstractC0855e.t(bVar.j());
                } while (bVar.e() < iE2);
                V(iE2);
                return;
        }
    }

    public C0662g m() throws com.google.crypto.tink.shaded.protobuf.B, com.google.protobuf.L, C0678x {
        W(2);
        return ((L3.e) this.f9213e).n();
    }

    public AbstractC0829i n() throws com.google.crypto.tink.shaded.protobuf.B, com.google.protobuf.L, C0678x {
        W(2);
        return ((L3.e) this.f9213e).o();
    }

    public AbstractC0867k o() throws com.google.crypto.tink.shaded.protobuf.B, com.google.protobuf.L, C0678x {
        W(2);
        return ((H6.b) this.f9213e).k();
    }

    public void p(InterfaceC0676v interfaceC0676v) throws C0678x {
        int iC;
        if ((this.f9210b & 7) != 2) {
            throw C0679y.b();
        }
        do {
            ((S) interfaceC0676v).add(m());
            L3.e eVar = (L3.e) this.f9213e;
            if (eVar.g()) {
                return;
            } else {
                iC = eVar.C();
            }
        } while (iC == this.f9210b);
        this.f9212d = iC;
    }

    public void q(List list) throws com.google.crypto.tink.shaded.protobuf.B, com.google.protobuf.L {
        int iC;
        int iA;
        switch (this.f9209a) {
            case 1:
                if ((this.f9210b & 7) != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                do {
                    list.add(n());
                    L3.e eVar = (L3.e) this.f9213e;
                    if (eVar.g()) {
                        return;
                    } else {
                        iC = eVar.C();
                    }
                } while (iC == this.f9210b);
                this.f9212d = iC;
                return;
            default:
                if ((this.f9210b & 7) != 2) {
                    throw com.google.protobuf.M.d();
                }
                do {
                    list.add(o());
                    H6.b bVar = (H6.b) this.f9213e;
                    if (bVar.f()) {
                        return;
                    } else {
                        iA = bVar.A();
                    }
                } while (iA == this.f9210b);
                this.f9212d = iA;
                return;
        }
    }

    public void r(InterfaceC0676v interfaceC0676v) throws C0679y {
        int iC;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 1) {
            do {
                ((S) interfaceC0676v).add(Double.valueOf(eVar.p()));
                if (eVar.g()) {
                    return;
                } else {
                    iC = eVar.C();
                }
            } while (iC == this.f9210b);
            this.f9212d = iC;
            return;
        }
        if (i7 != 2) {
            throw C0679y.b();
        }
        int iD = eVar.D();
        if ((iD & 7) != 0) {
            throw new C0679y("Failed to parse the message.");
        }
        int iF = eVar.f() + iD;
        do {
            ((S) interfaceC0676v).add(Double.valueOf(eVar.p()));
        } while (eVar.f() < iF);
    }

    public void s(List list) throws com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        int iA;
        int iA2;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof AbstractC0833m;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 1) {
                        do {
                            list.add(Double.valueOf(eVar.p()));
                            if (eVar.g()) {
                                return;
                            } else {
                                iC = eVar.C();
                            }
                        } while (iC == this.f9210b);
                        this.f9212d = iC;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int iD = eVar.D();
                    a0(iD);
                    int iF = eVar.f() + iD;
                    do {
                        list.add(Double.valueOf(eVar.p()));
                    } while (eVar.f() < iF);
                    return;
                }
                AbstractC0833m abstractC0833m = (AbstractC0833m) list;
                int i8 = this.f9210b & 7;
                if (i8 == 1) {
                    do {
                        abstractC0833m.t(eVar.p());
                        if (eVar.g()) {
                            return;
                        } else {
                            iC2 = eVar.C();
                        }
                    } while (iC2 == this.f9210b);
                    this.f9212d = iC2;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int iD2 = eVar.D();
                a0(iD2);
                int iF2 = eVar.f() + iD2;
                do {
                    abstractC0833m.t(eVar.p());
                } while (eVar.f() < iF2);
                return;
            default:
                boolean z7 = list instanceof com.google.protobuf.r;
                H6.b bVar = (H6.b) this.f9213e;
                if (!z7) {
                    int i9 = this.f9210b & 7;
                    if (i9 == 1) {
                        do {
                            list.add(Double.valueOf(bVar.l()));
                            if (bVar.f()) {
                                return;
                            } else {
                                iA = bVar.A();
                            }
                        } while (iA == this.f9210b);
                        this.f9212d = iA;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int iB = bVar.B();
                    b0(iB);
                    int iE = bVar.e() + iB;
                    do {
                        list.add(Double.valueOf(bVar.l()));
                    } while (bVar.e() < iE);
                    return;
                }
                com.google.protobuf.r rVar = (com.google.protobuf.r) list;
                int i10 = this.f9210b & 7;
                if (i10 == 1) {
                    do {
                        rVar.t(bVar.l());
                        if (bVar.f()) {
                            return;
                        } else {
                            iA2 = bVar.A();
                        }
                    } while (iA2 == this.f9210b);
                    this.f9212d = iA2;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int iB2 = bVar.B();
                b0(iB2);
                int iE2 = bVar.e() + iB2;
                do {
                    rVar.t(bVar.l());
                } while (bVar.e() < iE2);
                return;
        }
    }

    public void t(InterfaceC0676v interfaceC0676v) throws C0679y, com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 0) {
            do {
                ((S) interfaceC0676v).add(Integer.valueOf(eVar.q()));
                if (eVar.g()) {
                    return;
                } else {
                    iC = eVar.C();
                }
            } while (iC == this.f9210b);
            this.f9212d = iC;
            return;
        }
        if (i7 != 2) {
            throw C0679y.b();
        }
        int iF = eVar.f() + eVar.D();
        do {
            ((S) interfaceC0676v).add(Integer.valueOf(eVar.q()));
        } while (eVar.f() < iF);
        V(iF);
    }

    public void u(List list) throws C0679y, com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        int iA;
        int iA2;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof AbstractC0843x;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 0) {
                        do {
                            list.add(Integer.valueOf(eVar.q()));
                            if (eVar.g()) {
                                return;
                            } else {
                                iC = eVar.C();
                            }
                        } while (iC == this.f9210b);
                        this.f9212d = iC;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int iF = eVar.f() + eVar.D();
                    do {
                        list.add(Integer.valueOf(eVar.q()));
                    } while (eVar.f() < iF);
                    V(iF);
                    return;
                }
                AbstractC0843x abstractC0843x = (AbstractC0843x) list;
                int i8 = this.f9210b & 7;
                if (i8 == 0) {
                    do {
                        abstractC0843x.t(eVar.q());
                        if (eVar.g()) {
                            return;
                        } else {
                            iC2 = eVar.C();
                        }
                    } while (iC2 == this.f9210b);
                    this.f9212d = iC2;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int iF2 = eVar.f() + eVar.D();
                do {
                    abstractC0843x.t(eVar.q());
                } while (eVar.f() < iF2);
                V(iF2);
                return;
            default:
                boolean z7 = list instanceof com.google.protobuf.G;
                H6.b bVar = (H6.b) this.f9213e;
                if (!z7) {
                    int i9 = this.f9210b & 7;
                    if (i9 == 0) {
                        do {
                            list.add(Integer.valueOf(bVar.m()));
                            if (bVar.f()) {
                                return;
                            } else {
                                iA = bVar.A();
                            }
                        } while (iA == this.f9210b);
                        this.f9212d = iA;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int iE = bVar.e() + bVar.B();
                    do {
                        list.add(Integer.valueOf(bVar.m()));
                    } while (bVar.e() < iE);
                    V(iE);
                    return;
                }
                com.google.protobuf.G g3 = (com.google.protobuf.G) list;
                int i10 = this.f9210b & 7;
                if (i10 == 0) {
                    do {
                        g3.t(bVar.m());
                        if (bVar.f()) {
                            return;
                        } else {
                            iA2 = bVar.A();
                        }
                    } while (iA2 == this.f9210b);
                    this.f9212d = iA2;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int iE2 = bVar.e() + bVar.B();
                do {
                    g3.t(bVar.m());
                } while (bVar.e() < iE2);
                V(iE2);
                return;
        }
    }

    public Object v(p0 p0Var, Class cls, C0668m c0668m) throws C0679y, com.google.crypto.tink.shaded.protobuf.B, com.google.protobuf.L {
        int iOrdinal = p0Var.ordinal();
        L3.e eVar = (L3.e) this.f9213e;
        switch (iOrdinal) {
            case 0:
                W(1);
                return Double.valueOf(eVar.p());
            case 1:
                W(5);
                return Float.valueOf(eVar.t());
            case 2:
                W(0);
                return Long.valueOf(eVar.v());
            case 3:
                W(0);
                return Long.valueOf(eVar.E());
            case 4:
                W(0);
                return Integer.valueOf(eVar.u());
            case 5:
                W(1);
                return Long.valueOf(eVar.s());
            case 6:
                W(5);
                return Integer.valueOf(eVar.r());
            case 7:
                W(0);
                return Boolean.valueOf(eVar.m());
            case 8:
                W(2);
                return eVar.B();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                W(2);
                U uA = Q.f9136c.a(cls);
                AbstractC0675u abstractC0675uD = uA.d();
                f(abstractC0675uD, uA, c0668m);
                uA.b(abstractC0675uD);
                return abstractC0675uD;
            case 11:
                return m();
            case 12:
                W(0);
                return Integer.valueOf(eVar.D());
            case 13:
                W(0);
                return Integer.valueOf(eVar.q());
            case 14:
                W(5);
                return Integer.valueOf(eVar.w());
            case 15:
                W(1);
                return Long.valueOf(eVar.x());
            case 16:
                W(0);
                return Integer.valueOf(eVar.y());
            case 17:
                W(0);
                return Long.valueOf(eVar.z());
        }
    }

    public Object w(S0 s7, Class cls, C0884t c0884t) throws com.google.crypto.tink.shaded.protobuf.B, com.google.protobuf.M, C0678x {
        int iOrdinal = s7.ordinal();
        H6.b bVar = (H6.b) this.f9213e;
        switch (iOrdinal) {
            case 0:
                W(1);
                return Double.valueOf(bVar.l());
            case 1:
                W(5);
                return Float.valueOf(bVar.p());
            case 2:
                W(0);
                return Long.valueOf(bVar.s());
            case 3:
                W(0);
                return Long.valueOf(bVar.C());
            case 4:
                W(0);
                return Integer.valueOf(bVar.q());
            case 5:
                W(1);
                return Long.valueOf(bVar.o());
            case 6:
                W(5);
                return Integer.valueOf(bVar.n());
            case 7:
                W(0);
                return Boolean.valueOf(bVar.j());
            case 8:
                W(2);
                return bVar.z();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                W(2);
                InterfaceC0881r0 interfaceC0881r0A = C0872m0.f12232c.a(cls);
                com.google.protobuf.C cD = interfaceC0881r0A.d();
                h(cD, interfaceC0881r0A, c0884t);
                interfaceC0881r0A.b(cD);
                return cD;
            case 11:
                return o();
            case 12:
                W(0);
                return Integer.valueOf(bVar.B());
            case 13:
                W(0);
                return Integer.valueOf(bVar.m());
            case 14:
                W(5);
                return Integer.valueOf(bVar.u());
            case 15:
                W(1);
                return Long.valueOf(bVar.v());
            case 16:
                W(0);
                return Integer.valueOf(bVar.w());
            case 17:
                W(0);
                return Long.valueOf(bVar.x());
        }
    }

    public void x(InterfaceC0676v interfaceC0676v) throws C0679y {
        int iC;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 2) {
            int iD = eVar.D();
            if ((iD & 3) != 0) {
                throw new C0679y("Failed to parse the message.");
            }
            int iF = eVar.f() + iD;
            do {
                ((S) interfaceC0676v).add(Integer.valueOf(eVar.r()));
            } while (eVar.f() < iF);
            return;
        }
        if (i7 != 5) {
            throw C0679y.b();
        }
        do {
            ((S) interfaceC0676v).add(Integer.valueOf(eVar.r()));
            if (eVar.g()) {
                return;
            } else {
                iC = eVar.C();
            }
        } while (iC == this.f9210b);
        this.f9212d = iC;
    }

    public void y(List list) throws com.google.protobuf.M, com.google.crypto.tink.shaded.protobuf.C {
        int iC;
        int iC2;
        int iA;
        int iA2;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof AbstractC0843x;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 2) {
                        int iD = eVar.D();
                        Y(iD);
                        int iF = eVar.f() + iD;
                        do {
                            list.add(Integer.valueOf(eVar.r()));
                        } while (eVar.f() < iF);
                        return;
                    }
                    if (i7 != 5) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    do {
                        list.add(Integer.valueOf(eVar.r()));
                        if (eVar.g()) {
                            return;
                        } else {
                            iC = eVar.C();
                        }
                    } while (iC == this.f9210b);
                    this.f9212d = iC;
                    return;
                }
                AbstractC0843x abstractC0843x = (AbstractC0843x) list;
                int i8 = this.f9210b & 7;
                if (i8 == 2) {
                    int iD2 = eVar.D();
                    Y(iD2);
                    int iF2 = eVar.f() + iD2;
                    do {
                        abstractC0843x.t(eVar.r());
                    } while (eVar.f() < iF2);
                    return;
                }
                if (i8 != 5) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                do {
                    abstractC0843x.t(eVar.r());
                    if (eVar.g()) {
                        return;
                    } else {
                        iC2 = eVar.C();
                    }
                } while (iC2 == this.f9210b);
                this.f9212d = iC2;
                return;
            default:
                boolean z7 = list instanceof com.google.protobuf.G;
                H6.b bVar = (H6.b) this.f9213e;
                if (!z7) {
                    int i9 = this.f9210b & 7;
                    if (i9 == 2) {
                        int iB = bVar.B();
                        Z(iB);
                        int iE = bVar.e() + iB;
                        do {
                            list.add(Integer.valueOf(bVar.n()));
                        } while (bVar.e() < iE);
                        return;
                    }
                    if (i9 != 5) {
                        throw com.google.protobuf.M.d();
                    }
                    do {
                        list.add(Integer.valueOf(bVar.n()));
                        if (bVar.f()) {
                            return;
                        } else {
                            iA = bVar.A();
                        }
                    } while (iA == this.f9210b);
                    this.f9212d = iA;
                    return;
                }
                com.google.protobuf.G g3 = (com.google.protobuf.G) list;
                int i10 = this.f9210b & 7;
                if (i10 == 2) {
                    int iB2 = bVar.B();
                    Z(iB2);
                    int iE2 = bVar.e() + iB2;
                    do {
                        g3.t(bVar.n());
                    } while (bVar.e() < iE2);
                    return;
                }
                if (i10 != 5) {
                    throw com.google.protobuf.M.d();
                }
                do {
                    g3.t(bVar.n());
                    if (bVar.f()) {
                        return;
                    } else {
                        iA2 = bVar.A();
                    }
                } while (iA2 == this.f9210b);
                this.f9212d = iA2;
                return;
        }
    }

    public void z(InterfaceC0676v interfaceC0676v) throws C0679y {
        int iC;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 1) {
            do {
                ((S) interfaceC0676v).add(Long.valueOf(eVar.s()));
                if (eVar.g()) {
                    return;
                } else {
                    iC = eVar.C();
                }
            } while (iC == this.f9210b);
            this.f9212d = iC;
            return;
        }
        if (i7 != 2) {
            throw C0679y.b();
        }
        int iD = eVar.D();
        if ((iD & 7) != 0) {
            throw new C0679y("Failed to parse the message.");
        }
        int iF = eVar.f() + iD;
        do {
            ((S) interfaceC0676v).add(Long.valueOf(eVar.s()));
        } while (eVar.f() < iF);
    }

    public C0665j(L3.e eVar) {
        this.f9209a = 0;
        this.f9212d = 0;
        Charset charset = AbstractC0677w.f9255a;
        this.f9213e = eVar;
        eVar.f4335b = this;
    }

    public C0665j(L3.e eVar, byte b7) {
        this.f9209a = 1;
        this.f9212d = 0;
        com.google.crypto.tink.shaded.protobuf.A.a(eVar, "input");
        this.f9213e = eVar;
        eVar.f4335b = this;
    }

    public C0665j(int i7, int i8, int i9) {
        this.f9209a = 3;
        this.f9210b = i7;
        this.f9211c = i8;
        this.f9212d = i9;
    }
}
