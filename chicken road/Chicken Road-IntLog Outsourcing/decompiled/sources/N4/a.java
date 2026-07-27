package N4;

import Q4.q;
import g4.C0471p;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2158a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2159b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f2160c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2161d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2162e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2163f = new ArrayList();

    public a(String str) {
        this.f2158a = str;
    }

    public static void a(a aVar, String str, q qVar) {
        C0471p c0471p = C0471p.f5750a;
        aVar.getClass();
        if (aVar.f2160c.add(str)) {
            aVar.f2159b.add(str);
            aVar.f2161d.add(qVar);
            aVar.f2162e.add(c0471p);
            aVar.f2163f.add(false);
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + aVar.f2158a).toString());
    }
}
