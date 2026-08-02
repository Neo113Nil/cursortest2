package androidx.datastore.preferences.protobuf;

import android.media.VolumeProvider;
import android.os.Build;
import com.google.crypto.tink.shaded.protobuf.AbstractC0869e;
import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0877m;
import com.google.crypto.tink.shaded.protobuf.AbstractC0882s;
import com.google.crypto.tink.shaded.protobuf.AbstractC0887x;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import com.google.protobuf.AbstractC0899e;
import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.AbstractC0934y;
import com.google.protobuf.C0916m0;
import com.google.protobuf.C0928t;
import com.google.protobuf.InterfaceC0925r0;
import com.google.protobuf.S0;
import com.ryanheise.audioservice.AudioService;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9209a;

    /* renamed from: b, reason: collision with root package name */
    public int f9210b;

    /* renamed from: c, reason: collision with root package name */
    public int f9211c;

    /* renamed from: d, reason: collision with root package name */
    public int f9212d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9213e;

    public C0686j(H6.b bVar) {
        this.f9209a = 2;
        this.f9212d = 0;
        com.google.protobuf.K.a(bVar, "input");
        this.f9213e = bVar;
        bVar.f3426c = this;
    }

    public static void Y(int i7) {
        if ((i7 & 3) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.f();
        }
    }

    public static void Z(int i7) {
        if ((i7 & 3) != 0) {
            throw com.google.protobuf.M.g();
        }
    }

    public static void a0(int i7) {
        if ((i7 & 7) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.f();
        }
    }

    public static void b0(int i7) {
        if ((i7 & 7) != 0) {
            throw com.google.protobuf.M.g();
        }
    }

    public static void i(int i7) {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("androidAdjustRemoteVolume", g5.l.k("direction", Integer.valueOf(i7)), null);
    }

    public static void j(int i7) {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("androidSetRemoteVolume", g5.l.k("volumeIndex", Integer.valueOf(i7)), null);
    }

    public void A(List list) {
        int C3;
        int C7;
        int A7;
        int A8;
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
                                C3 = eVar.C();
                            }
                        } while (C3 == this.f9210b);
                        this.f9212d = C3;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int D7 = eVar.D();
                    a0(D7);
                    int f7 = eVar.f() + D7;
                    do {
                        list.add(Long.valueOf(eVar.s()));
                    } while (eVar.f() < f7);
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
                            C7 = eVar.C();
                        }
                    } while (C7 == this.f9210b);
                    this.f9212d = C7;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int D8 = eVar.D();
                a0(D8);
                int f8 = eVar.f() + D8;
                do {
                    j.t(eVar.s());
                } while (eVar.f() < f8);
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
                                A7 = bVar.A();
                            }
                        } while (A7 == this.f9210b);
                        this.f9212d = A7;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int B7 = bVar.B();
                    b0(B7);
                    int e7 = bVar.e() + B7;
                    do {
                        list.add(Long.valueOf(bVar.o()));
                    } while (bVar.e() < e7);
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
                            A8 = bVar.A();
                        }
                    } while (A8 == this.f9210b);
                    this.f9212d = A8;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int B8 = bVar.B();
                b0(B8);
                int e8 = bVar.e() + B8;
                do {
                    v6.t(bVar.o());
                } while (bVar.e() < e8);
                return;
        }
    }

    public void B(InterfaceC0697v interfaceC0697v) {
        int C3;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 2) {
            int D7 = eVar.D();
            if ((D7 & 3) != 0) {
                throw new C0700y("Failed to parse the message.");
            }
            int f7 = eVar.f() + D7;
            do {
                ((S) interfaceC0697v).add(Float.valueOf(eVar.t()));
            } while (eVar.f() < f7);
            return;
        }
        if (i7 != 5) {
            throw C0700y.b();
        }
        do {
            ((S) interfaceC0697v).add(Float.valueOf(eVar.t()));
            if (eVar.g()) {
                return;
            } else {
                C3 = eVar.C();
            }
        } while (C3 == this.f9210b);
        this.f9212d = C3;
    }

    public void C(List list) {
        int C3;
        int C7;
        int A7;
        int A8;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof AbstractC0882s;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 2) {
                        int D7 = eVar.D();
                        Y(D7);
                        int f7 = eVar.f() + D7;
                        do {
                            list.add(Float.valueOf(eVar.t()));
                        } while (eVar.f() < f7);
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
                            C3 = eVar.C();
                        }
                    } while (C3 == this.f9210b);
                    this.f9212d = C3;
                    return;
                }
                AbstractC0882s abstractC0882s = (AbstractC0882s) list;
                int i8 = this.f9210b & 7;
                if (i8 == 2) {
                    int D8 = eVar.D();
                    Y(D8);
                    int f8 = eVar.f() + D8;
                    do {
                        abstractC0882s.t(eVar.t());
                    } while (eVar.f() < f8);
                    return;
                }
                if (i8 != 5) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                do {
                    abstractC0882s.t(eVar.t());
                    if (eVar.g()) {
                        return;
                    } else {
                        C7 = eVar.C();
                    }
                } while (C7 == this.f9210b);
                this.f9212d = C7;
                return;
            default:
                boolean z7 = list instanceof AbstractC0934y;
                H6.b bVar = (H6.b) this.f9213e;
                if (!z7) {
                    int i9 = this.f9210b & 7;
                    if (i9 == 2) {
                        int B7 = bVar.B();
                        Z(B7);
                        int e7 = bVar.e() + B7;
                        do {
                            list.add(Float.valueOf(bVar.p()));
                        } while (bVar.e() < e7);
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
                            A7 = bVar.A();
                        }
                    } while (A7 == this.f9210b);
                    this.f9212d = A7;
                    return;
                }
                AbstractC0934y abstractC0934y = (AbstractC0934y) list;
                int i10 = this.f9210b & 7;
                if (i10 == 2) {
                    int B8 = bVar.B();
                    Z(B8);
                    int e8 = bVar.e() + B8;
                    do {
                        abstractC0934y.t(bVar.p());
                    } while (bVar.e() < e8);
                    return;
                }
                if (i10 != 5) {
                    throw com.google.protobuf.M.d();
                }
                do {
                    abstractC0934y.t(bVar.p());
                    if (bVar.f()) {
                        return;
                    } else {
                        A8 = bVar.A();
                    }
                } while (A8 == this.f9210b);
                this.f9212d = A8;
                return;
        }
    }

    public void D(InterfaceC0697v interfaceC0697v) {
        int C3;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 0) {
            do {
                ((S) interfaceC0697v).add(Integer.valueOf(eVar.u()));
                if (eVar.g()) {
                    return;
                } else {
                    C3 = eVar.C();
                }
            } while (C3 == this.f9210b);
            this.f9212d = C3;
            return;
        }
        if (i7 != 2) {
            throw C0700y.b();
        }
        int f7 = eVar.f() + eVar.D();
        do {
            ((S) interfaceC0697v).add(Integer.valueOf(eVar.u()));
        } while (eVar.f() < f7);
        V(f7);
    }

    public void E(List list) {
        int C3;
        int C7;
        int A7;
        int A8;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof AbstractC0887x;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 0) {
                        do {
                            list.add(Integer.valueOf(eVar.u()));
                            if (eVar.g()) {
                                return;
                            } else {
                                C3 = eVar.C();
                            }
                        } while (C3 == this.f9210b);
                        this.f9212d = C3;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int f7 = eVar.f() + eVar.D();
                    do {
                        list.add(Integer.valueOf(eVar.u()));
                    } while (eVar.f() < f7);
                    V(f7);
                    return;
                }
                AbstractC0887x abstractC0887x = (AbstractC0887x) list;
                int i8 = this.f9210b & 7;
                if (i8 == 0) {
                    do {
                        abstractC0887x.t(eVar.u());
                        if (eVar.g()) {
                            return;
                        } else {
                            C7 = eVar.C();
                        }
                    } while (C7 == this.f9210b);
                    this.f9212d = C7;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int f8 = eVar.f() + eVar.D();
                do {
                    abstractC0887x.t(eVar.u());
                } while (eVar.f() < f8);
                V(f8);
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
                                A7 = bVar.A();
                            }
                        } while (A7 == this.f9210b);
                        this.f9212d = A7;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int e7 = bVar.e() + bVar.B();
                    do {
                        list.add(Integer.valueOf(bVar.q()));
                    } while (bVar.e() < e7);
                    V(e7);
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
                            A8 = bVar.A();
                        }
                    } while (A8 == this.f9210b);
                    this.f9212d = A8;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int e8 = bVar.e() + bVar.B();
                do {
                    g3.t(bVar.q());
                } while (bVar.e() < e8);
                V(e8);
                return;
        }
    }

    public void F(InterfaceC0697v interfaceC0697v) {
        int C3;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 0) {
            do {
                ((S) interfaceC0697v).add(Long.valueOf(eVar.v()));
                if (eVar.g()) {
                    return;
                } else {
                    C3 = eVar.C();
                }
            } while (C3 == this.f9210b);
            this.f9212d = C3;
            return;
        }
        if (i7 != 2) {
            throw C0700y.b();
        }
        int f7 = eVar.f() + eVar.D();
        do {
            ((S) interfaceC0697v).add(Long.valueOf(eVar.v()));
        } while (eVar.f() < f7);
        V(f7);
    }

    public void G(List list) {
        int C3;
        int C7;
        int A7;
        int A8;
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
                                C3 = eVar.C();
                            }
                        } while (C3 == this.f9210b);
                        this.f9212d = C3;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int f7 = eVar.f() + eVar.D();
                    do {
                        list.add(Long.valueOf(eVar.v()));
                    } while (eVar.f() < f7);
                    V(f7);
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
                            C7 = eVar.C();
                        }
                    } while (C7 == this.f9210b);
                    this.f9212d = C7;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int f8 = eVar.f() + eVar.D();
                do {
                    j.t(eVar.v());
                } while (eVar.f() < f8);
                V(f8);
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
                                A7 = bVar.A();
                            }
                        } while (A7 == this.f9210b);
                        this.f9212d = A7;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int e7 = bVar.e() + bVar.B();
                    do {
                        list.add(Long.valueOf(bVar.s()));
                    } while (bVar.e() < e7);
                    V(e7);
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
                            A8 = bVar.A();
                        }
                    } while (A8 == this.f9210b);
                    this.f9212d = A8;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int e8 = bVar.e() + bVar.B();
                do {
                    v6.t(bVar.s());
                } while (bVar.e() < e8);
                V(e8);
                return;
        }
    }

    public void H(InterfaceC0697v interfaceC0697v) {
        int C3;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 2) {
            int D7 = eVar.D();
            if ((D7 & 3) != 0) {
                throw new C0700y("Failed to parse the message.");
            }
            int f7 = eVar.f() + D7;
            do {
                ((S) interfaceC0697v).add(Integer.valueOf(eVar.w()));
            } while (eVar.f() < f7);
            return;
        }
        if (i7 != 5) {
            throw C0700y.b();
        }
        do {
            ((S) interfaceC0697v).add(Integer.valueOf(eVar.w()));
            if (eVar.g()) {
                return;
            } else {
                C3 = eVar.C();
            }
        } while (C3 == this.f9210b);
        this.f9212d = C3;
    }

    public void I(List list) {
        int C3;
        int C7;
        int A7;
        int A8;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof AbstractC0887x;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 2) {
                        int D7 = eVar.D();
                        Y(D7);
                        int f7 = eVar.f() + D7;
                        do {
                            list.add(Integer.valueOf(eVar.w()));
                        } while (eVar.f() < f7);
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
                            C3 = eVar.C();
                        }
                    } while (C3 == this.f9210b);
                    this.f9212d = C3;
                    return;
                }
                AbstractC0887x abstractC0887x = (AbstractC0887x) list;
                int i8 = this.f9210b & 7;
                if (i8 == 2) {
                    int D8 = eVar.D();
                    Y(D8);
                    int f8 = eVar.f() + D8;
                    do {
                        abstractC0887x.t(eVar.w());
                    } while (eVar.f() < f8);
                    return;
                }
                if (i8 != 5) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                do {
                    abstractC0887x.t(eVar.w());
                    if (eVar.g()) {
                        return;
                    } else {
                        C7 = eVar.C();
                    }
                } while (C7 == this.f9210b);
                this.f9212d = C7;
                return;
            default:
                boolean z7 = list instanceof com.google.protobuf.G;
                H6.b bVar = (H6.b) this.f9213e;
                if (!z7) {
                    int i9 = this.f9210b & 7;
                    if (i9 == 2) {
                        int B7 = bVar.B();
                        Z(B7);
                        int e7 = bVar.e() + B7;
                        do {
                            list.add(Integer.valueOf(bVar.u()));
                        } while (bVar.e() < e7);
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
                            A7 = bVar.A();
                        }
                    } while (A7 == this.f9210b);
                    this.f9212d = A7;
                    return;
                }
                com.google.protobuf.G g3 = (com.google.protobuf.G) list;
                int i10 = this.f9210b & 7;
                if (i10 == 2) {
                    int B8 = bVar.B();
                    Z(B8);
                    int e8 = bVar.e() + B8;
                    do {
                        g3.t(bVar.u());
                    } while (bVar.e() < e8);
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
                        A8 = bVar.A();
                    }
                } while (A8 == this.f9210b);
                this.f9212d = A8;
                return;
        }
    }

    public void J(InterfaceC0697v interfaceC0697v) {
        int C3;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 1) {
            do {
                ((S) interfaceC0697v).add(Long.valueOf(eVar.x()));
                if (eVar.g()) {
                    return;
                } else {
                    C3 = eVar.C();
                }
            } while (C3 == this.f9210b);
            this.f9212d = C3;
            return;
        }
        if (i7 != 2) {
            throw C0700y.b();
        }
        int D7 = eVar.D();
        if ((D7 & 7) != 0) {
            throw new C0700y("Failed to parse the message.");
        }
        int f7 = eVar.f() + D7;
        do {
            ((S) interfaceC0697v).add(Long.valueOf(eVar.x()));
        } while (eVar.f() < f7);
    }

    public void K(List list) {
        int C3;
        int C7;
        int A7;
        int A8;
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
                                C3 = eVar.C();
                            }
                        } while (C3 == this.f9210b);
                        this.f9212d = C3;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int D7 = eVar.D();
                    a0(D7);
                    int f7 = eVar.f() + D7;
                    do {
                        list.add(Long.valueOf(eVar.x()));
                    } while (eVar.f() < f7);
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
                            C7 = eVar.C();
                        }
                    } while (C7 == this.f9210b);
                    this.f9212d = C7;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int D8 = eVar.D();
                a0(D8);
                int f8 = eVar.f() + D8;
                do {
                    j.t(eVar.x());
                } while (eVar.f() < f8);
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
                                A7 = bVar.A();
                            }
                        } while (A7 == this.f9210b);
                        this.f9212d = A7;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int B7 = bVar.B();
                    b0(B7);
                    int e7 = bVar.e() + B7;
                    do {
                        list.add(Long.valueOf(bVar.v()));
                    } while (bVar.e() < e7);
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
                            A8 = bVar.A();
                        }
                    } while (A8 == this.f9210b);
                    this.f9212d = A8;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int B8 = bVar.B();
                b0(B8);
                int e8 = bVar.e() + B8;
                do {
                    v6.t(bVar.v());
                } while (bVar.e() < e8);
                return;
        }
    }

    public void L(InterfaceC0697v interfaceC0697v) {
        int C3;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 0) {
            do {
                ((S) interfaceC0697v).add(Integer.valueOf(eVar.y()));
                if (eVar.g()) {
                    return;
                } else {
                    C3 = eVar.C();
                }
            } while (C3 == this.f9210b);
            this.f9212d = C3;
            return;
        }
        if (i7 != 2) {
            throw C0700y.b();
        }
        int f7 = eVar.f() + eVar.D();
        do {
            ((S) interfaceC0697v).add(Integer.valueOf(eVar.y()));
        } while (eVar.f() < f7);
        V(f7);
    }

    public void M(List list) {
        int C3;
        int C7;
        int A7;
        int A8;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof AbstractC0887x;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 0) {
                        do {
                            list.add(Integer.valueOf(eVar.y()));
                            if (eVar.g()) {
                                return;
                            } else {
                                C3 = eVar.C();
                            }
                        } while (C3 == this.f9210b);
                        this.f9212d = C3;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int f7 = eVar.f() + eVar.D();
                    do {
                        list.add(Integer.valueOf(eVar.y()));
                    } while (eVar.f() < f7);
                    V(f7);
                    return;
                }
                AbstractC0887x abstractC0887x = (AbstractC0887x) list;
                int i8 = this.f9210b & 7;
                if (i8 == 0) {
                    do {
                        abstractC0887x.t(eVar.y());
                        if (eVar.g()) {
                            return;
                        } else {
                            C7 = eVar.C();
                        }
                    } while (C7 == this.f9210b);
                    this.f9212d = C7;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int f8 = eVar.f() + eVar.D();
                do {
                    abstractC0887x.t(eVar.y());
                } while (eVar.f() < f8);
                V(f8);
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
                                A7 = bVar.A();
                            }
                        } while (A7 == this.f9210b);
                        this.f9212d = A7;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int e7 = bVar.e() + bVar.B();
                    do {
                        list.add(Integer.valueOf(bVar.w()));
                    } while (bVar.e() < e7);
                    V(e7);
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
                            A8 = bVar.A();
                        }
                    } while (A8 == this.f9210b);
                    this.f9212d = A8;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int e8 = bVar.e() + bVar.B();
                do {
                    g3.t(bVar.w());
                } while (bVar.e() < e8);
                V(e8);
                return;
        }
    }

    public void N(InterfaceC0697v interfaceC0697v) {
        int C3;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 0) {
            do {
                ((S) interfaceC0697v).add(Long.valueOf(eVar.z()));
                if (eVar.g()) {
                    return;
                } else {
                    C3 = eVar.C();
                }
            } while (C3 == this.f9210b);
            this.f9212d = C3;
            return;
        }
        if (i7 != 2) {
            throw C0700y.b();
        }
        int f7 = eVar.f() + eVar.D();
        do {
            ((S) interfaceC0697v).add(Long.valueOf(eVar.z()));
        } while (eVar.f() < f7);
        V(f7);
    }

    public void O(List list) {
        int C3;
        int C7;
        int A7;
        int A8;
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
                                C3 = eVar.C();
                            }
                        } while (C3 == this.f9210b);
                        this.f9212d = C3;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int f7 = eVar.f() + eVar.D();
                    do {
                        list.add(Long.valueOf(eVar.z()));
                    } while (eVar.f() < f7);
                    V(f7);
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
                            C7 = eVar.C();
                        }
                    } while (C7 == this.f9210b);
                    this.f9212d = C7;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int f8 = eVar.f() + eVar.D();
                do {
                    j.t(eVar.z());
                } while (eVar.f() < f8);
                V(f8);
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
                                A7 = bVar.A();
                            }
                        } while (A7 == this.f9210b);
                        this.f9212d = A7;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int e7 = bVar.e() + bVar.B();
                    do {
                        list.add(Long.valueOf(bVar.x()));
                    } while (bVar.e() < e7);
                    V(e7);
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
                            A8 = bVar.A();
                        }
                    } while (A8 == this.f9210b);
                    this.f9212d = A8;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int e8 = bVar.e() + bVar.B();
                do {
                    v6.t(bVar.x());
                } while (bVar.e() < e8);
                V(e8);
                return;
        }
    }

    public void P(InterfaceC0697v interfaceC0697v, boolean z4) {
        String A7;
        int C3;
        if ((this.f9210b & 7) != 2) {
            throw C0700y.b();
        }
        do {
            L3.e eVar = (L3.e) this.f9213e;
            if (z4) {
                W(2);
                A7 = eVar.B();
            } else {
                W(2);
                A7 = eVar.A();
            }
            ((S) interfaceC0697v).add(A7);
            if (eVar.g()) {
                return;
            } else {
                C3 = eVar.C();
            }
        } while (C3 == this.f9210b);
        this.f9212d = C3;
    }

    public void Q(List list, boolean z4) {
        String A7;
        int C3;
        int C7;
        String y4;
        int A8;
        int A9;
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
                            C7 = eVar.C();
                        }
                    } while (C7 == this.f9210b);
                    this.f9212d = C7;
                    return;
                }
                do {
                    if (z4) {
                        W(2);
                        A7 = eVar.B();
                    } else {
                        W(2);
                        A7 = eVar.A();
                    }
                    list.add(A7);
                    if (eVar.g()) {
                        return;
                    } else {
                        C3 = eVar.C();
                    }
                } while (C3 == this.f9210b);
                this.f9212d = C3;
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
                            A9 = bVar.A();
                        }
                    } while (A9 == this.f9210b);
                    this.f9212d = A9;
                    return;
                }
                do {
                    if (z4) {
                        W(2);
                        y4 = bVar.z();
                    } else {
                        W(2);
                        y4 = bVar.y();
                    }
                    list.add(y4);
                    if (bVar.f()) {
                        return;
                    } else {
                        A8 = bVar.A();
                    }
                } while (A8 == this.f9210b);
                this.f9212d = A8;
                return;
        }
    }

    public void R(InterfaceC0697v interfaceC0697v) {
        int C3;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 0) {
            do {
                ((S) interfaceC0697v).add(Integer.valueOf(eVar.D()));
                if (eVar.g()) {
                    return;
                } else {
                    C3 = eVar.C();
                }
            } while (C3 == this.f9210b);
            this.f9212d = C3;
            return;
        }
        if (i7 != 2) {
            throw C0700y.b();
        }
        int f7 = eVar.f() + eVar.D();
        do {
            ((S) interfaceC0697v).add(Integer.valueOf(eVar.D()));
        } while (eVar.f() < f7);
        V(f7);
    }

    public void S(List list) {
        int C3;
        int C7;
        int A7;
        int A8;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof AbstractC0887x;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 0) {
                        do {
                            list.add(Integer.valueOf(eVar.D()));
                            if (eVar.g()) {
                                return;
                            } else {
                                C3 = eVar.C();
                            }
                        } while (C3 == this.f9210b);
                        this.f9212d = C3;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int f7 = eVar.f() + eVar.D();
                    do {
                        list.add(Integer.valueOf(eVar.D()));
                    } while (eVar.f() < f7);
                    V(f7);
                    return;
                }
                AbstractC0887x abstractC0887x = (AbstractC0887x) list;
                int i8 = this.f9210b & 7;
                if (i8 == 0) {
                    do {
                        abstractC0887x.t(eVar.D());
                        if (eVar.g()) {
                            return;
                        } else {
                            C7 = eVar.C();
                        }
                    } while (C7 == this.f9210b);
                    this.f9212d = C7;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int f8 = eVar.f() + eVar.D();
                do {
                    abstractC0887x.t(eVar.D());
                } while (eVar.f() < f8);
                V(f8);
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
                                A7 = bVar.A();
                            }
                        } while (A7 == this.f9210b);
                        this.f9212d = A7;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int e7 = bVar.e() + bVar.B();
                    do {
                        list.add(Integer.valueOf(bVar.B()));
                    } while (bVar.e() < e7);
                    V(e7);
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
                            A8 = bVar.A();
                        }
                    } while (A8 == this.f9210b);
                    this.f9212d = A8;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int e8 = bVar.e() + bVar.B();
                do {
                    g3.t(bVar.B());
                } while (bVar.e() < e8);
                V(e8);
                return;
        }
    }

    public void T(InterfaceC0697v interfaceC0697v) {
        int C3;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 0) {
            do {
                ((S) interfaceC0697v).add(Long.valueOf(eVar.E()));
                if (eVar.g()) {
                    return;
                } else {
                    C3 = eVar.C();
                }
            } while (C3 == this.f9210b);
            this.f9212d = C3;
            return;
        }
        if (i7 != 2) {
            throw C0700y.b();
        }
        int f7 = eVar.f() + eVar.D();
        do {
            ((S) interfaceC0697v).add(Long.valueOf(eVar.E()));
        } while (eVar.f() < f7);
        V(f7);
    }

    public void U(List list) {
        int C3;
        int C7;
        int A7;
        int A8;
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
                                C3 = eVar.C();
                            }
                        } while (C3 == this.f9210b);
                        this.f9212d = C3;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int f7 = eVar.f() + eVar.D();
                    do {
                        list.add(Long.valueOf(eVar.E()));
                    } while (eVar.f() < f7);
                    V(f7);
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
                            C7 = eVar.C();
                        }
                    } while (C7 == this.f9210b);
                    this.f9212d = C7;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int f8 = eVar.f() + eVar.D();
                do {
                    j.t(eVar.E());
                } while (eVar.f() < f8);
                V(f8);
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
                                A7 = bVar.A();
                            }
                        } while (A7 == this.f9210b);
                        this.f9212d = A7;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int e7 = bVar.e() + bVar.B();
                    do {
                        list.add(Long.valueOf(bVar.C()));
                    } while (bVar.e() < e7);
                    V(e7);
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
                            A8 = bVar.A();
                        }
                    } while (A8 == this.f9210b);
                    this.f9212d = A8;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int e8 = bVar.e() + bVar.B();
                do {
                    v6.t(bVar.C());
                } while (bVar.e() < e8);
                V(e8);
                return;
        }
    }

    public void V(int i7) {
        switch (this.f9209a) {
            case 0:
                if (((L3.e) this.f9213e).f() != i7) {
                    throw C0700y.e();
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

    public void W(int i7) {
        switch (this.f9209a) {
            case 0:
                if ((this.f9210b & 7) != i7) {
                    throw C0700y.b();
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
                this.f9213e = new q0.w(this, i9, i8, this.f9212d);
            } else {
                this.f9213e = new q0.x(this, i9, i8, this.f9212d);
            }
        }
        return (VolumeProvider) this.f9213e;
    }

    public void c(Object obj, U u4, C0689m c0689m) {
        int i7 = this.f9211c;
        this.f9211c = ((this.f9210b >>> 3) << 3) | 4;
        try {
            u4.i(obj, this, c0689m);
            if (this.f9210b == this.f9211c) {
            } else {
                throw new C0700y("Failed to parse the message.");
            }
        } finally {
            this.f9211c = i7;
        }
    }

    public void d(Object obj, com.google.crypto.tink.shaded.protobuf.c0 c0Var, C0879o c0879o) {
        int i7 = this.f9211c;
        this.f9211c = ((this.f9210b >>> 3) << 3) | 4;
        try {
            c0Var.j(obj, this, c0879o);
            if (this.f9210b == this.f9211c) {
            } else {
                throw com.google.crypto.tink.shaded.protobuf.C.f();
            }
        } finally {
            this.f9211c = i7;
        }
    }

    public void e(Object obj, InterfaceC0925r0 interfaceC0925r0, C0928t c0928t) {
        int i7 = this.f9211c;
        this.f9211c = ((this.f9210b >>> 3) << 3) | 4;
        try {
            interfaceC0925r0.g(obj, this, c0928t);
            if (this.f9210b == this.f9211c) {
            } else {
                throw com.google.protobuf.M.g();
            }
        } finally {
            this.f9211c = i7;
        }
    }

    public void f(Object obj, U u4, C0689m c0689m) {
        L3.e eVar = (L3.e) this.f9213e;
        int D7 = eVar.D();
        if (eVar.f4334a >= 100) {
            throw new C0700y("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int l7 = eVar.l(D7);
        eVar.f4334a++;
        u4.i(obj, this, c0689m);
        eVar.b(0);
        eVar.f4334a--;
        eVar.j(l7);
    }

    public void g(Object obj, com.google.crypto.tink.shaded.protobuf.c0 c0Var, C0879o c0879o) {
        L3.e eVar = (L3.e) this.f9213e;
        int D7 = eVar.D();
        if (eVar.f4334a >= 100) {
            throw new com.google.crypto.tink.shaded.protobuf.C("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int l7 = eVar.l(D7);
        eVar.f4334a++;
        c0Var.j(obj, this, c0879o);
        eVar.b(0);
        eVar.f4334a--;
        eVar.j(l7);
    }

    public void h(Object obj, InterfaceC0925r0 interfaceC0925r0, C0928t c0928t) {
        H6.b bVar = (H6.b) this.f9213e;
        int B7 = bVar.B();
        if (bVar.f3424a >= bVar.f3425b) {
            throw new com.google.protobuf.M("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int i7 = bVar.i(B7);
        bVar.f3424a++;
        interfaceC0925r0.g(obj, this, c0928t);
        bVar.a(0);
        bVar.f3424a--;
        bVar.h(i7);
    }

    public void k(InterfaceC0697v interfaceC0697v) {
        int C3;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 0) {
            do {
                ((S) interfaceC0697v).add(Boolean.valueOf(eVar.m()));
                if (eVar.g()) {
                    return;
                } else {
                    C3 = eVar.C();
                }
            } while (C3 == this.f9210b);
            this.f9212d = C3;
            return;
        }
        if (i7 != 2) {
            throw C0700y.b();
        }
        int f7 = eVar.f() + eVar.D();
        do {
            ((S) interfaceC0697v).add(Boolean.valueOf(eVar.m()));
        } while (eVar.f() < f7);
        V(f7);
    }

    public void l(List list) {
        int C3;
        int C7;
        int A7;
        int A8;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof AbstractC0869e;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 0) {
                        do {
                            list.add(Boolean.valueOf(eVar.m()));
                            if (eVar.g()) {
                                return;
                            } else {
                                C3 = eVar.C();
                            }
                        } while (C3 == this.f9210b);
                        this.f9212d = C3;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int f7 = eVar.f() + eVar.D();
                    do {
                        list.add(Boolean.valueOf(eVar.m()));
                    } while (eVar.f() < f7);
                    V(f7);
                    return;
                }
                AbstractC0869e abstractC0869e = (AbstractC0869e) list;
                int i8 = this.f9210b & 7;
                if (i8 == 0) {
                    do {
                        abstractC0869e.t(eVar.m());
                        if (eVar.g()) {
                            return;
                        } else {
                            C7 = eVar.C();
                        }
                    } while (C7 == this.f9210b);
                    this.f9212d = C7;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int f8 = eVar.f() + eVar.D();
                do {
                    abstractC0869e.t(eVar.m());
                } while (eVar.f() < f8);
                V(f8);
                return;
            default:
                boolean z7 = list instanceof AbstractC0899e;
                H6.b bVar = (H6.b) this.f9213e;
                if (!z7) {
                    int i9 = this.f9210b & 7;
                    if (i9 == 0) {
                        do {
                            list.add(Boolean.valueOf(bVar.j()));
                            if (bVar.f()) {
                                return;
                            } else {
                                A7 = bVar.A();
                            }
                        } while (A7 == this.f9210b);
                        this.f9212d = A7;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int e7 = bVar.e() + bVar.B();
                    do {
                        list.add(Boolean.valueOf(bVar.j()));
                    } while (bVar.e() < e7);
                    V(e7);
                    return;
                }
                AbstractC0899e abstractC0899e = (AbstractC0899e) list;
                int i10 = this.f9210b & 7;
                if (i10 == 0) {
                    do {
                        abstractC0899e.t(bVar.j());
                        if (bVar.f()) {
                            return;
                        } else {
                            A8 = bVar.A();
                        }
                    } while (A8 == this.f9210b);
                    this.f9212d = A8;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int e8 = bVar.e() + bVar.B();
                do {
                    abstractC0899e.t(bVar.j());
                } while (bVar.e() < e8);
                V(e8);
                return;
        }
    }

    public C0683g m() {
        W(2);
        return ((L3.e) this.f9213e).n();
    }

    public AbstractC0873i n() {
        W(2);
        return ((L3.e) this.f9213e).o();
    }

    public AbstractC0911k o() {
        W(2);
        return ((H6.b) this.f9213e).k();
    }

    public void p(InterfaceC0697v interfaceC0697v) {
        int C3;
        if ((this.f9210b & 7) != 2) {
            throw C0700y.b();
        }
        do {
            ((S) interfaceC0697v).add(m());
            L3.e eVar = (L3.e) this.f9213e;
            if (eVar.g()) {
                return;
            } else {
                C3 = eVar.C();
            }
        } while (C3 == this.f9210b);
        this.f9212d = C3;
    }

    public void q(List list) {
        int C3;
        int A7;
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
                        C3 = eVar.C();
                    }
                } while (C3 == this.f9210b);
                this.f9212d = C3;
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
                        A7 = bVar.A();
                    }
                } while (A7 == this.f9210b);
                this.f9212d = A7;
                return;
        }
    }

    public void r(InterfaceC0697v interfaceC0697v) {
        int C3;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 1) {
            do {
                ((S) interfaceC0697v).add(Double.valueOf(eVar.p()));
                if (eVar.g()) {
                    return;
                } else {
                    C3 = eVar.C();
                }
            } while (C3 == this.f9210b);
            this.f9212d = C3;
            return;
        }
        if (i7 != 2) {
            throw C0700y.b();
        }
        int D7 = eVar.D();
        if ((D7 & 7) != 0) {
            throw new C0700y("Failed to parse the message.");
        }
        int f7 = eVar.f() + D7;
        do {
            ((S) interfaceC0697v).add(Double.valueOf(eVar.p()));
        } while (eVar.f() < f7);
    }

    public void s(List list) {
        int C3;
        int C7;
        int A7;
        int A8;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof AbstractC0877m;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 1) {
                        do {
                            list.add(Double.valueOf(eVar.p()));
                            if (eVar.g()) {
                                return;
                            } else {
                                C3 = eVar.C();
                            }
                        } while (C3 == this.f9210b);
                        this.f9212d = C3;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int D7 = eVar.D();
                    a0(D7);
                    int f7 = eVar.f() + D7;
                    do {
                        list.add(Double.valueOf(eVar.p()));
                    } while (eVar.f() < f7);
                    return;
                }
                AbstractC0877m abstractC0877m = (AbstractC0877m) list;
                int i8 = this.f9210b & 7;
                if (i8 == 1) {
                    do {
                        abstractC0877m.t(eVar.p());
                        if (eVar.g()) {
                            return;
                        } else {
                            C7 = eVar.C();
                        }
                    } while (C7 == this.f9210b);
                    this.f9212d = C7;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int D8 = eVar.D();
                a0(D8);
                int f8 = eVar.f() + D8;
                do {
                    abstractC0877m.t(eVar.p());
                } while (eVar.f() < f8);
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
                                A7 = bVar.A();
                            }
                        } while (A7 == this.f9210b);
                        this.f9212d = A7;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int B7 = bVar.B();
                    b0(B7);
                    int e7 = bVar.e() + B7;
                    do {
                        list.add(Double.valueOf(bVar.l()));
                    } while (bVar.e() < e7);
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
                            A8 = bVar.A();
                        }
                    } while (A8 == this.f9210b);
                    this.f9212d = A8;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int B8 = bVar.B();
                b0(B8);
                int e8 = bVar.e() + B8;
                do {
                    rVar.t(bVar.l());
                } while (bVar.e() < e8);
                return;
        }
    }

    public void t(InterfaceC0697v interfaceC0697v) {
        int C3;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 0) {
            do {
                ((S) interfaceC0697v).add(Integer.valueOf(eVar.q()));
                if (eVar.g()) {
                    return;
                } else {
                    C3 = eVar.C();
                }
            } while (C3 == this.f9210b);
            this.f9212d = C3;
            return;
        }
        if (i7 != 2) {
            throw C0700y.b();
        }
        int f7 = eVar.f() + eVar.D();
        do {
            ((S) interfaceC0697v).add(Integer.valueOf(eVar.q()));
        } while (eVar.f() < f7);
        V(f7);
    }

    public void u(List list) {
        int C3;
        int C7;
        int A7;
        int A8;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof AbstractC0887x;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 0) {
                        do {
                            list.add(Integer.valueOf(eVar.q()));
                            if (eVar.g()) {
                                return;
                            } else {
                                C3 = eVar.C();
                            }
                        } while (C3 == this.f9210b);
                        this.f9212d = C3;
                        return;
                    }
                    if (i7 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.C.c();
                    }
                    int f7 = eVar.f() + eVar.D();
                    do {
                        list.add(Integer.valueOf(eVar.q()));
                    } while (eVar.f() < f7);
                    V(f7);
                    return;
                }
                AbstractC0887x abstractC0887x = (AbstractC0887x) list;
                int i8 = this.f9210b & 7;
                if (i8 == 0) {
                    do {
                        abstractC0887x.t(eVar.q());
                        if (eVar.g()) {
                            return;
                        } else {
                            C7 = eVar.C();
                        }
                    } while (C7 == this.f9210b);
                    this.f9212d = C7;
                    return;
                }
                if (i8 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                int f8 = eVar.f() + eVar.D();
                do {
                    abstractC0887x.t(eVar.q());
                } while (eVar.f() < f8);
                V(f8);
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
                                A7 = bVar.A();
                            }
                        } while (A7 == this.f9210b);
                        this.f9212d = A7;
                        return;
                    }
                    if (i9 != 2) {
                        throw com.google.protobuf.M.d();
                    }
                    int e7 = bVar.e() + bVar.B();
                    do {
                        list.add(Integer.valueOf(bVar.m()));
                    } while (bVar.e() < e7);
                    V(e7);
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
                            A8 = bVar.A();
                        }
                    } while (A8 == this.f9210b);
                    this.f9212d = A8;
                    return;
                }
                if (i10 != 2) {
                    throw com.google.protobuf.M.d();
                }
                int e8 = bVar.e() + bVar.B();
                do {
                    g3.t(bVar.m());
                } while (bVar.e() < e8);
                V(e8);
                return;
        }
    }

    public Object v(p0 p0Var, Class cls, C0689m c0689m) {
        int ordinal = p0Var.ordinal();
        L3.e eVar = (L3.e) this.f9213e;
        switch (ordinal) {
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
                U a2 = Q.f9136c.a(cls);
                AbstractC0696u d7 = a2.d();
                f(d7, a2, c0689m);
                a2.b(d7);
                return d7;
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

    public Object w(S0 s02, Class cls, C0928t c0928t) {
        int ordinal = s02.ordinal();
        H6.b bVar = (H6.b) this.f9213e;
        switch (ordinal) {
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
                InterfaceC0925r0 a2 = C0916m0.f12232c.a(cls);
                com.google.protobuf.C d7 = a2.d();
                h(d7, a2, c0928t);
                a2.b(d7);
                return d7;
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

    public void x(InterfaceC0697v interfaceC0697v) {
        int C3;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 2) {
            int D7 = eVar.D();
            if ((D7 & 3) != 0) {
                throw new C0700y("Failed to parse the message.");
            }
            int f7 = eVar.f() + D7;
            do {
                ((S) interfaceC0697v).add(Integer.valueOf(eVar.r()));
            } while (eVar.f() < f7);
            return;
        }
        if (i7 != 5) {
            throw C0700y.b();
        }
        do {
            ((S) interfaceC0697v).add(Integer.valueOf(eVar.r()));
            if (eVar.g()) {
                return;
            } else {
                C3 = eVar.C();
            }
        } while (C3 == this.f9210b);
        this.f9212d = C3;
    }

    public void y(List list) {
        int C3;
        int C7;
        int A7;
        int A8;
        switch (this.f9209a) {
            case 1:
                boolean z4 = list instanceof AbstractC0887x;
                L3.e eVar = (L3.e) this.f9213e;
                if (!z4) {
                    int i7 = this.f9210b & 7;
                    if (i7 == 2) {
                        int D7 = eVar.D();
                        Y(D7);
                        int f7 = eVar.f() + D7;
                        do {
                            list.add(Integer.valueOf(eVar.r()));
                        } while (eVar.f() < f7);
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
                            C3 = eVar.C();
                        }
                    } while (C3 == this.f9210b);
                    this.f9212d = C3;
                    return;
                }
                AbstractC0887x abstractC0887x = (AbstractC0887x) list;
                int i8 = this.f9210b & 7;
                if (i8 == 2) {
                    int D8 = eVar.D();
                    Y(D8);
                    int f8 = eVar.f() + D8;
                    do {
                        abstractC0887x.t(eVar.r());
                    } while (eVar.f() < f8);
                    return;
                }
                if (i8 != 5) {
                    throw com.google.crypto.tink.shaded.protobuf.C.c();
                }
                do {
                    abstractC0887x.t(eVar.r());
                    if (eVar.g()) {
                        return;
                    } else {
                        C7 = eVar.C();
                    }
                } while (C7 == this.f9210b);
                this.f9212d = C7;
                return;
            default:
                boolean z7 = list instanceof com.google.protobuf.G;
                H6.b bVar = (H6.b) this.f9213e;
                if (!z7) {
                    int i9 = this.f9210b & 7;
                    if (i9 == 2) {
                        int B7 = bVar.B();
                        Z(B7);
                        int e7 = bVar.e() + B7;
                        do {
                            list.add(Integer.valueOf(bVar.n()));
                        } while (bVar.e() < e7);
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
                            A7 = bVar.A();
                        }
                    } while (A7 == this.f9210b);
                    this.f9212d = A7;
                    return;
                }
                com.google.protobuf.G g3 = (com.google.protobuf.G) list;
                int i10 = this.f9210b & 7;
                if (i10 == 2) {
                    int B8 = bVar.B();
                    Z(B8);
                    int e8 = bVar.e() + B8;
                    do {
                        g3.t(bVar.n());
                    } while (bVar.e() < e8);
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
                        A8 = bVar.A();
                    }
                } while (A8 == this.f9210b);
                this.f9212d = A8;
                return;
        }
    }

    public void z(InterfaceC0697v interfaceC0697v) {
        int C3;
        int i7 = this.f9210b & 7;
        L3.e eVar = (L3.e) this.f9213e;
        if (i7 == 1) {
            do {
                ((S) interfaceC0697v).add(Long.valueOf(eVar.s()));
                if (eVar.g()) {
                    return;
                } else {
                    C3 = eVar.C();
                }
            } while (C3 == this.f9210b);
            this.f9212d = C3;
            return;
        }
        if (i7 != 2) {
            throw C0700y.b();
        }
        int D7 = eVar.D();
        if ((D7 & 7) != 0) {
            throw new C0700y("Failed to parse the message.");
        }
        int f7 = eVar.f() + D7;
        do {
            ((S) interfaceC0697v).add(Long.valueOf(eVar.s()));
        } while (eVar.f() < f7);
    }

    public C0686j(L3.e eVar) {
        this.f9209a = 0;
        this.f9212d = 0;
        Charset charset = AbstractC0698w.f9255a;
        this.f9213e = eVar;
        eVar.f4335b = this;
    }

    public C0686j(L3.e eVar, byte b7) {
        this.f9209a = 1;
        this.f9212d = 0;
        com.google.crypto.tink.shaded.protobuf.A.a(eVar, "input");
        this.f9213e = eVar;
        eVar.f4335b = this;
    }

    public C0686j(int i7, int i8, int i9) {
        this.f9209a = 3;
        this.f9210b = i7;
        this.f9211c = i8;
        this.f9212d = i9;
    }
}
