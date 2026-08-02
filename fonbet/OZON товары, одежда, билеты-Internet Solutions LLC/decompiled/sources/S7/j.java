package S7;

import S7.j;
import T7.E;
import com.google.crypto.tink.internal.C5891j;
import com.google.crypto.tink.internal.C5893l;
import com.google.crypto.tink.internal.H;
import com.google.crypto.tink.internal.L;
import com.google.crypto.tink.internal.M;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import f8.E;
import f8.F;
import f8.I;
import f8.O;
import f8.z;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final List<c> f26002a;

    /* renamed from: b, reason: collision with root package name */
    private final C5893l f26003b;

    /* renamed from: c, reason: collision with root package name */
    private final j f26004c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26005a;

        static {
            int[] iArr = new int[F.values().length];
            f26005a = iArr;
            try {
                iArr[F.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26005a[F.DESTROYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26005a[F.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f26006a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private C5893l f26007b = C5893l.f59279b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f26008c = false;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f26009a;

            /* renamed from: b, reason: collision with root package name */
            private final q f26010b;

            /* renamed from: c, reason: collision with root package name */
            private C0514b f26011c = null;

            /* renamed from: d, reason: collision with root package name */
            private b f26012d = null;

            a(q qVar) {
                this.f26010b = qVar;
            }

            public final void g() {
                b bVar = this.f26012d;
                if (bVar != null) {
                    b.a(bVar);
                }
                this.f26009a = true;
            }

            public final void h() {
                this.f26011c = C0514b.f26013a;
            }
        }

        /* renamed from: S7.j$b$b, reason: collision with other inner class name */
        private static class C0514b {

            /* renamed from: a, reason: collision with root package name */
            private static final C0514b f26013a = new C0514b();
        }

        static void a(b bVar) {
            Iterator it = bVar.f26006a.iterator();
            while (it.hasNext()) {
                ((a) it.next()).f26009a = false;
            }
        }

        public final void b(a aVar) {
            if (aVar.f26012d != null) {
                throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
            }
            boolean z11 = aVar.f26009a;
            ArrayList arrayList = this.f26006a;
            if (z11) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).f26009a = false;
                }
            }
            aVar.f26012d = this;
            arrayList.add(aVar);
        }

        public final j c() throws GeneralSecurityException {
            int i11;
            F f7;
            if (this.f26008c) {
                throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
            }
            this.f26008c = true;
            ArrayList arrayList = this.f26006a;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (int i12 = 0; i12 < arrayList.size() - 1; i12++) {
                if (((a) arrayList.get(i12)).f26011c == C0514b.f26013a && ((a) arrayList.get(i12 + 1)).f26011c != C0514b.f26013a) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            Integer num = null;
            while (it.hasNext()) {
                a aVar = (a) it.next();
                aVar.getClass();
                if (aVar.f26011c == null) {
                    throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                }
                if (aVar.f26011c == C0514b.f26013a) {
                    int i13 = 0;
                    while (true) {
                        if (i13 != 0 && !hashSet.contains(Integer.valueOf(i13))) {
                            break;
                        }
                        int i14 = M.f59252a;
                        i13 = 0;
                        while (i13 == 0) {
                            byte[] a11 = H.a(4);
                            i13 = (a11[3] & 255) | ((a11[0] & 255) << 24) | ((a11[1] & 255) << 16) | ((a11[2] & 255) << 8);
                        }
                    }
                    i11 = i13;
                } else {
                    aVar.f26011c.getClass();
                    i11 = 0;
                }
                if (hashSet.contains(Integer.valueOf(i11))) {
                    throw new GeneralSecurityException(E.a(i11, "Id ", " is used twice in the keyset"));
                }
                hashSet.add(Integer.valueOf(i11));
                He.g b11 = com.google.crypto.tink.internal.p.c().b(aVar.f26010b, aVar.f26010b.a() ? Integer.valueOf(i11) : null);
                Object obj = g.f25997b;
                if (obj.equals(obj)) {
                    f7 = F.ENABLED;
                } else if (g.f25998c.equals(obj)) {
                    f7 = F.DISABLED;
                } else {
                    if (!g.f25999d.equals(obj)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    f7 = F.DESTROYED;
                }
                c cVar = new c(b11, f7, i11, aVar.f26009a, false, c.f26014h);
                if (aVar.f26009a) {
                    if (num != null) {
                        throw new GeneralSecurityException("Two primaries were set");
                    }
                    num = Integer.valueOf(i11);
                }
                arrayList2.add(cVar);
            }
            if (num != null) {
                return j.a(new j(arrayList2, this.f26007b));
            }
            throw new GeneralSecurityException("No primary was set");
        }
    }

    public static final class c {

        /* renamed from: h, reason: collision with root package name */
        private static final k f26014h = new k();

        /* renamed from: a, reason: collision with root package name */
        private final He.g f26015a;

        /* renamed from: b, reason: collision with root package name */
        private final F f26016b;

        /* renamed from: c, reason: collision with root package name */
        private final g f26017c;

        /* renamed from: d, reason: collision with root package name */
        private final int f26018d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f26019e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f26020f;

        /* renamed from: g, reason: collision with root package name */
        private final a f26021g;

        /* JADX INFO: Access modifiers changed from: private */
        interface a {
            void a(c cVar);
        }

        c(He.g gVar, F f7, int i11, boolean z11, boolean z12, a aVar) {
            this.f26015a = gVar;
            this.f26016b = f7;
            int i12 = a.f26005a[f7.ordinal()];
            this.f26017c = i12 != 1 ? i12 != 2 ? g.f25998c : g.f25999d : g.f25997b;
            this.f26018d = i11;
            this.f26019e = z11;
            this.f26020f = z12;
            this.f26021g = aVar;
        }

        public final int g() {
            return this.f26018d;
        }

        public final He.g h() {
            this.f26021g.a(this);
            return this.f26015a;
        }

        public final g i() {
            return this.f26017c;
        }

        public final boolean j() {
            return this.f26019e;
        }
    }

    /* synthetic */ j(ArrayList arrayList, C5893l c5893l) throws GeneralSecurityException {
        this((List<c>) arrayList, c5893l);
    }

    static j a(final j jVar) {
        final C5893l c5893l = jVar.f26003b;
        if (c5893l.a()) {
            return jVar;
        }
        c.a aVar = new c.a(jVar, c5893l) { // from class: S7.i
            @Override // S7.j.c.a
            public final void a(j.c cVar) {
                com.google.crypto.tink.internal.r.b().a().getClass();
                cVar.getClass();
            }
        };
        List<c> list = jVar.f26002a;
        ArrayList arrayList = new ArrayList(list.size());
        for (c cVar : list) {
            arrayList.add(new c(cVar.f26015a, cVar.f26016b, cVar.f26018d, cVar.f26019e, cVar.f26020f, aVar));
        }
        return new j(arrayList, c5893l, jVar);
    }

    private static I.c b(He.g gVar, F f7, int i11) throws GeneralSecurityException {
        com.google.crypto.tink.internal.F f11 = (com.google.crypto.tink.internal.F) com.google.crypto.tink.internal.u.a().j(gVar, r.a());
        Integer c11 = gVar.c();
        if (c11 != null && c11.intValue() != i11) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        I.c.a N11 = I.c.N();
        E.b L11 = f8.E.L();
        L11.j(f11.f());
        L11.k(f11.g());
        L11.i(f11.c());
        N11.i(L11);
        N11.l(f7);
        N11.j(i11);
        N11.k(f11.e());
        return N11.b();
    }

    static final j c(I i11) throws GeneralSecurityException {
        He.g c5891j;
        boolean z11;
        if (i11.H() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(i11.H());
        for (I.c cVar : i11.I()) {
            int J11 = cVar.J();
            try {
                c5891j = com.google.crypto.tink.internal.u.a().c(l(cVar), r.a());
                z11 = false;
            } catch (GeneralSecurityException e11) {
                if (W7.a.f33294a.getValue()) {
                    throw e11;
                }
                c5891j = new C5891j(l(cVar), r.a());
                z11 = true;
            }
            if (W7.a.f33294a.getValue() && !i(cVar.L())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            arrayList.add(new c(c5891j, cVar.L(), J11, J11 == i11.J(), z11, c.f26014h));
        }
        return new j((List<c>) Collections.unmodifiableList(arrayList), C5893l.f59279b);
    }

    public static final j d(h hVar) throws GeneralSecurityException {
        q b11 = hVar.b();
        b bVar = new b();
        b.a aVar = new b.a(b11);
        aVar.h();
        aVar.g();
        bVar.b(aVar);
        return bVar.c();
    }

    private static boolean i(F f7) {
        int i11 = a.f26005a[f7.ordinal()];
        return i11 == 1 || i11 == 2 || i11 == 3;
    }

    @Deprecated
    public static final j j(S7.b bVar, a8.c cVar, byte[] bArr) throws GeneralSecurityException, IOException {
        z b11 = bVar.b();
        if (b11.G().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            I M11 = I.M(cVar.b(b11.G().n(), bArr), C5910p.b());
            if (M11 == null || M11.H() <= 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            return c(M11);
        } catch (A unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static com.google.crypto.tink.internal.F l(I.c cVar) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.F.a(cVar.I().J(), cVar.I().K(), cVar.I().I(), cVar.K(), cVar.K() == O.RAW ? null : Integer.valueOf(cVar.J()));
    }

    public final c e(int i11) {
        List<c> list = this.f26002a;
        if (i11 < 0 || i11 >= list.size()) {
            StringBuilder f7 = P4.f.f(i11, "Invalid index ", " for keyset of size ");
            f7.append(list.size());
            throw new IndexOutOfBoundsException(f7.toString());
        }
        c cVar = list.get(i11);
        if (!i(cVar.f26016b)) {
            throw new IllegalStateException(T7.E.a(i11, "Keyset-Entry at position ", " has wrong status"));
        }
        if (cVar.f26020f) {
            throw new IllegalStateException(T7.E.a(i11, "Keyset-Entry at position ", " didn't parse correctly"));
        }
        return list.get(i11);
    }

    final I f() {
        try {
            I.b K11 = I.K();
            for (c cVar : this.f26002a) {
                K11.i(b(cVar.h(), cVar.f26016b, cVar.g()));
                if (cVar.j()) {
                    K11.j(cVar.g());
                }
            }
            return K11.b();
        } catch (GeneralSecurityException e11) {
            throw new L(e11);
        }
    }

    public final c g() {
        for (c cVar : this.f26002a) {
            if (cVar != null && cVar.j()) {
                if (cVar.i() == g.f25997b) {
                    return cVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
    
        r12 = r1.G(r4);
        r0 = P4.f.f(r4, "Key parsing of key with index ", " and type_url ");
        r0.append(r12.I().J());
        r0.append(" failed, unable to get primitive");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010e, code lost:
    
        throw new java.security.GeneralSecurityException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(com.google.crypto.tink.internal.I i11, Class cls) throws GeneralSecurityException {
        if (i11 == null) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        j jVar = this.f26004c;
        I f7 = (jVar == null ? this : jVar).f();
        int i12 = u.f26025a;
        int J11 = f7.J();
        int i13 = 0;
        boolean z11 = true;
        int i14 = 0;
        boolean z12 = false;
        for (I.c cVar : f7.I()) {
            if (cVar.L() == F.ENABLED) {
                if (!cVar.M()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.J())));
                }
                if (cVar.K() == O.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.J())));
                }
                if (cVar.L() == F.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.J())));
                }
                if (cVar.J() == J11) {
                    if (z12) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z12 = true;
                }
                if (cVar.I().I() != E.c.ASYMMETRIC_PUBLIC) {
                    z11 = false;
                }
                i14++;
            }
        }
        if (i14 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z12 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        while (true) {
            List<c> list = this.f26002a;
            if (i13 >= list.size()) {
                if (jVar == null) {
                    jVar = this;
                }
                return com.google.crypto.tink.internal.t.b().e(jVar, this.f26003b, cls);
            }
            if (list.get(i13).f26020f || !i(list.get(i13).f26016b)) {
                break;
            }
            i13++;
        }
    }

    public final int k() {
        return this.f26002a.size();
    }

    public final String toString() {
        return u.a(f()).toString();
    }

    private j(List<c> list, C5893l c5893l) throws GeneralSecurityException {
        this.f26002a = list;
        this.f26003b = c5893l;
        if (W7.a.f33294a.getValue()) {
            HashSet hashSet = new HashSet();
            boolean z11 = false;
            for (c cVar : list) {
                if (hashSet.contains(Integer.valueOf(cVar.g()))) {
                    throw new GeneralSecurityException("KeyID " + cVar.g() + " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                }
                hashSet.add(Integer.valueOf(cVar.g()));
                if (cVar.j()) {
                    z11 = true;
                }
            }
            if (!z11) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.f26004c = null;
    }

    private j(ArrayList arrayList, C5893l c5893l, j jVar) {
        this.f26002a = arrayList;
        this.f26003b = c5893l;
        this.f26004c = jVar;
    }
}
