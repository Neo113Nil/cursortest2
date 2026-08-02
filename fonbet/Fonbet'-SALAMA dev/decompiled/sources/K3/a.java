package K3;

import V3.B;
import V3.C0466h;
import V3.C0481x;
import V3.J;
import V3.m0;
import V3.p0;
import V3.s0;
import V3.u0;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes2.dex */
public abstract class a {
    static {
        f[] fVarArr = {new f(J3.a.class, 0)};
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < 1; i7++) {
            f fVar = fVarArr[i7];
            boolean containsKey = hashMap.containsKey(fVar.f3906a);
            Class cls = fVar.f3906a;
            if (containsKey) {
                throw new IllegalArgumentException(e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls));
            }
            hashMap.put(cls, fVar);
        }
        Class cls2 = fVarArr[0].f3906a;
        Collections.unmodifiableMap(hashMap);
        f[] fVarArr2 = {new f(J3.a.class, 3)};
        HashMap hashMap2 = new HashMap();
        f fVar2 = fVarArr2[0];
        boolean containsKey2 = hashMap2.containsKey(fVar2.f3906a);
        Class cls3 = fVar2.f3906a;
        if (containsKey2) {
            throw new IllegalArgumentException(e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls3));
        }
        hashMap2.put(cls3, fVar2);
        Class cls4 = fVarArr2[0].f3906a;
        Collections.unmodifiableMap(hashMap2);
        f[] fVarArr3 = {new f(J3.a.class, 4)};
        HashMap hashMap3 = new HashMap();
        f fVar3 = fVarArr3[0];
        boolean containsKey3 = hashMap3.containsKey(fVar3.f3906a);
        Class cls5 = fVar3.f3906a;
        if (containsKey3) {
            throw new IllegalArgumentException(e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls5));
        }
        hashMap3.put(cls5, fVar3);
        Class cls6 = fVarArr3[0].f3906a;
        Collections.unmodifiableMap(hashMap3);
        f[] fVarArr4 = {new f(J3.a.class, 2)};
        HashMap hashMap4 = new HashMap();
        f fVar4 = fVarArr4[0];
        boolean containsKey4 = hashMap4.containsKey(fVar4.f3906a);
        Class cls7 = fVar4.f3906a;
        if (containsKey4) {
            throw new IllegalArgumentException(e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls7));
        }
        hashMap4.put(cls7, fVar4);
        Class cls8 = fVarArr4[0].f3906a;
        Collections.unmodifiableMap(hashMap4);
        f[] fVarArr5 = {new f(J3.a.class, 6)};
        HashMap hashMap5 = new HashMap();
        f fVar5 = fVarArr5[0];
        boolean containsKey5 = hashMap5.containsKey(fVar5.f3906a);
        Class cls9 = fVar5.f3906a;
        if (containsKey5) {
            throw new IllegalArgumentException(e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls9));
        }
        hashMap5.put(cls9, fVar5);
        Class cls10 = fVarArr5[0].f3906a;
        Collections.unmodifiableMap(hashMap5);
        f[] fVarArr6 = {new f(J3.a.class, 7)};
        HashMap hashMap6 = new HashMap();
        f fVar6 = fVarArr6[0];
        boolean containsKey6 = hashMap6.containsKey(fVar6.f3906a);
        Class cls11 = fVar6.f3906a;
        if (containsKey6) {
            throw new IllegalArgumentException(e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls11));
        }
        hashMap6.put(cls11, fVar6);
        Class cls12 = fVarArr6[0].f3906a;
        Collections.unmodifiableMap(hashMap6);
        f[] fVarArr7 = {new f(J3.a.class, 5)};
        HashMap hashMap7 = new HashMap();
        f fVar7 = fVarArr7[0];
        boolean containsKey7 = hashMap7.containsKey(fVar7.f3906a);
        Class cls13 = fVar7.f3906a;
        if (containsKey7) {
            throw new IllegalArgumentException(e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls13));
        }
        hashMap7.put(cls13, fVar7);
        Class cls14 = fVarArr7[0].f3906a;
        Collections.unmodifiableMap(hashMap7);
        f[] fVarArr8 = {new f(J3.a.class, 8)};
        HashMap hashMap8 = new HashMap();
        f fVar8 = fVarArr8[0];
        boolean containsKey8 = hashMap8.containsKey(fVar8.f3906a);
        Class cls15 = fVar8.f3906a;
        if (containsKey8) {
            throw new IllegalArgumentException(e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls15));
        }
        hashMap8.put(cls15, fVar8);
        Class cls16 = fVarArr8[0].f3906a;
        Collections.unmodifiableMap(hashMap8);
        int i8 = s0.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e7) {
            throw new ExceptionInInitializerError(e7);
        }
    }

    public static void a() {
        int i7 = 7;
        int i8 = 6;
        int i9 = 5;
        int i10 = 4;
        int i11 = 3;
        int i12 = 1;
        J3.n.h(e.f3905b);
        R3.m.a();
        Class<C0466h> cls = C0466h.class;
        J3.n.f(new h(cls, new f[]{new f(J3.a.class, 0)}, 0), true);
        Class<C0481x> cls2 = C0481x.class;
        J3.n.f(new h(cls2, new f[]{new f(J3.a.class, 3)}, 2), true);
        Q3.k kVar = o.f3939a;
        Q3.i iVar = Q3.i.f5812b;
        iVar.e(o.f3939a);
        iVar.d(o.f3940b);
        iVar.c(o.f3941c);
        iVar.b(o.f3942d);
        if (N3.a.f4779b.get()) {
            return;
        }
        J3.n.f(new h(V3.r.class, new f[]{new f(J3.a.class, 2)}, i12), true);
        iVar.e(l.f3931a);
        iVar.d(l.f3932b);
        iVar.c(l.f3933c);
        iVar.b(l.f3934d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            J3.n.f(new h(B.class, new f[]{new f(J3.a.class, 4)}, i11), true);
            iVar.e(r.f3945a);
            iVar.d(r.f3946b);
            iVar.c(r.f3947c);
            iVar.b(r.f3948d);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        J3.n.f(new h(J.class, new f[]{new f(J3.a.class, 5)}, i10), true);
        Q3.k kVar2 = u.f3949a;
        Q3.i iVar2 = Q3.i.f5812b;
        iVar2.e(u.f3949a);
        iVar2.d(u.f3950b);
        iVar2.c(u.f3951c);
        iVar2.b(u.f3952d);
        J3.n.f(new h(m0.class, new f[]{new f(J3.a.class, 6)}, i9), true);
        J3.n.f(new h(p0.class, new f[]{new f(J3.a.class, 7)}, i8), true);
        J3.n.f(new h(u0.class, new f[]{new f(J3.a.class, 8)}, i7), true);
        iVar2.e(y.f3956a);
        iVar2.d(y.f3957b);
        iVar2.c(y.f3958c);
        iVar2.b(y.f3959d);
    }
}
