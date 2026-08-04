package P5;

import D6.A0;
import android.content.Context;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p010b0.InterfaceC0738i;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ A6.d[] f5630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p022d0.b f5631b;

    static {
        t6.l lVar = new t6.l(M.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        t6.q.f16479a.getClass();
        f5630a = new A6.d[]{lVar};
        p022d0.a aVar = p022d0.a.f12332a;
        K6.c cVar = D6.M.f1797b;
        A0 a2 = new A0(null);
        cVar.getClass();
        f5631b = new p022d0.b(aVar, D6.E.b(p003a.a.m0(cVar, a2)));
    }

    public static final InterfaceC0738i a(Context context) {
        t6.h.e(context, "<this>");
        return (InterfaceC0738i) f5631b.getValue(context, f5630a[0]);
    }

    public static final boolean b(String str, Object obj, Set set) {
        t6.h.e(str, "key");
        if (set == null) {
            return (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double);
        }
        return set.contains(str);
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
            String strSubstring = str.substring(40);
            t6.h.d(strSubstring, "substring(...)");
            return Double.valueOf(Double.parseDouble(strSubstring));
        }
        if (C6.o.B0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return obj;
        }
        String strSubstring2 = str.substring(40);
        t6.h.d(strSubstring2, "substring(...)");
        eVar.getClass();
        t6.h.e(strSubstring2, "listString");
        Object object = new O(new ByteArrayInputStream(Base64.decode(strSubstring2, 0))).readObject();
        t6.h.c(object, "null cannot be cast to non-null type kotlin.collections.List<*>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) object) {
            if (obj2 instanceof String) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
