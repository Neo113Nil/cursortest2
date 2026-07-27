package a2;

import K.C0037e;
import K.O;
import K.T;
import K.U;
import Y1.C0077a;
import android.content.Context;
import g2.C0318b;
import g2.C0320d;
import g2.InterfaceC0321e;
import java.util.List;
import java.util.Set;
import w2.AbstractC1242v;
import w2.InterfaceC1241u;
import w2.f0;

/* renamed from: a2.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0101K {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ t2.g[] f1821a;

    /* renamed from: b, reason: collision with root package name */
    public static final M.c f1822b;

    static {
        C0318b c0318b;
        kotlin.jvm.internal.m mVar = new kotlin.jvm.internal.m(kotlin.jvm.internal.c.NO_RECEIVER, AbstractC0101K.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        kotlin.jvm.internal.r.f9673a.getClass();
        f1821a = new t2.g[]{mVar};
        M.a aVar = M.a.f954e;
        g2.h hVar = w2.B.f10463b;
        f0 f0Var = new f0();
        hVar.getClass();
        g2.i iVar = g2.i.f4981a;
        if (f0Var != iVar) {
            g2.h g3 = hVar.g(f0Var.getKey());
            if (g3 == iVar) {
                hVar = f0Var;
            } else {
                C0320d c0320d = C0320d.f4980a;
                InterfaceC0321e interfaceC0321e = (InterfaceC0321e) g3.k(c0320d);
                if (interfaceC0321e == null) {
                    c0318b = new C0318b(g3, f0Var);
                } else {
                    g2.h g4 = g3.g(c0320d);
                    if (g4 == iVar) {
                        hVar = new C0318b(f0Var, interfaceC0321e);
                    } else {
                        c0318b = new C0318b(new C0318b(g4, f0Var), interfaceC0321e);
                    }
                }
                hVar = c0318b;
            }
        }
        f1822b = new M.c(aVar, AbstractC1242v.a(hVar));
    }

    public static final J1.i a(Context context) {
        J1.i iVar;
        kotlin.jvm.internal.j.e(context, "<this>");
        M.c cVar = f1822b;
        t2.g property = f1821a[0];
        cVar.getClass();
        kotlin.jvm.internal.j.e(property, "property");
        J1.i iVar2 = cVar.f960d;
        if (iVar2 != null) {
            return iVar2;
        }
        synchronized (cVar.f959c) {
            try {
                if (cVar.f960d == null) {
                    Context applicationContext = context.getApplicationContext();
                    o2.l lVar = cVar.f957a;
                    kotlin.jvm.internal.j.d(applicationContext, "applicationContext");
                    List migrations = (List) lVar.invoke(applicationContext);
                    InterfaceC1241u interfaceC1241u = cVar.f958b;
                    M.b bVar = new M.b(applicationContext, 0, cVar);
                    kotlin.jvm.internal.j.e(migrations, "migrations");
                    O o3 = new O(new U(new T(1, bVar)), X0.a.z(new C0037e(migrations, null)), new P0.j(7), interfaceC1241u);
                    cVar.f960d = new J1.i(10, new J1.i(10, o3));
                }
                iVar = cVar.f960d;
                kotlin.jvm.internal.j.b(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public static final boolean b(String key, Object obj, Set set) {
        kotlin.jvm.internal.j.e(key, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(key);
    }

    public static final Object c(Object obj, C0077a c0077a) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (v2.m.q0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            if (v2.m.q0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                return obj;
            }
            String substring = str.substring(40);
            kotlin.jvm.internal.j.d(substring, "substring(...)");
            return c0077a.e(substring);
        }
        if (!v2.m.q0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            return obj;
        }
        String substring2 = str.substring(40);
        kotlin.jvm.internal.j.d(substring2, "substring(...)");
        return Double.valueOf(Double.parseDouble(substring2));
    }
}
