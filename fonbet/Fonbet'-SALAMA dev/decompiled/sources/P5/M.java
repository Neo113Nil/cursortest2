package P5;

import D6.A0;
import a.AbstractC0603a;
import android.content.Context;
import android.util.Base64;
import b0.InterfaceC0761i;
import d0.C0939a;
import d0.C0940b;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ A6.d[] f5630a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0940b f5631b;

    static {
        t6.l lVar = new t6.l(M.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        t6.q.f16473a.getClass();
        f5630a = new A6.d[]{lVar};
        C0939a c0939a = C0939a.f12326a;
        K6.c cVar = D6.M.f1797b;
        A0 a02 = new A0(null);
        cVar.getClass();
        f5631b = new C0940b(c0939a, D6.E.b(AbstractC0603a.m0(cVar, a02)));
    }

    public static final InterfaceC0761i a(Context context) {
        t6.h.e(context, "<this>");
        return (InterfaceC0761i) f5631b.getValue(context, f5630a[0]);
    }

    public static final boolean b(String str, Object obj, Set set) {
        t6.h.e(str, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(str);
    }

    public static final Object c(Object obj, M4.e eVar) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (!C6.o.B0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            if (!C6.o.B0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return obj;
            }
            String substring = str.substring(40);
            t6.h.d(substring, "substring(...)");
            return Double.valueOf(Double.parseDouble(substring));
        }
        if (C6.o.B0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return obj;
        }
        String substring2 = str.substring(40);
        t6.h.d(substring2, "substring(...)");
        eVar.getClass();
        t6.h.e(substring2, "listString");
        Object readObject = new O(new ByteArrayInputStream(Base64.decode(substring2, 0))).readObject();
        t6.h.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) readObject) {
            if (obj2 instanceof String) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
