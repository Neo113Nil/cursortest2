package B;

import E.C0028c;
import F4.o;
import N1.q;
import N1.r;
import T4.p;
import T4.x;
import a1.C0179c;
import a1.RunnableC0177a;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.Y;
import b1.C0267d;
import b2.AbstractC0279e;
import com.onesignal.core.activities.PermissionsActivity$special$$inlined$viewModels$default$1;
import com.onesignal.core.activities.PermissionsActivity$special$$inlined$viewModels$default$2;
import com.onesignal.core.activities.PermissionsActivity$special$$inlined$viewModels$default$3;
import e4.InterfaceC0412a;
import f4.InterfaceC0428e;
import g4.C0472q;
import h2.C0482c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import u1.AbstractC1477a;
import w2.AbstractActivityC1515c;

/* loaded from: classes.dex */
public final class d implements N1.b, X0.b, InterfaceC0428e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105a;

    /* renamed from: b, reason: collision with root package name */
    public Object f106b;

    /* renamed from: c, reason: collision with root package name */
    public Object f107c;

    /* renamed from: d, reason: collision with root package name */
    public Object f108d;

    /* renamed from: e, reason: collision with root package name */
    public Object f109e;

    /* renamed from: f, reason: collision with root package name */
    public Object f110f;

    public /* synthetic */ d(boolean z) {
        this.f105a = 3;
    }

    public static d g(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        d dVar = new d(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) dVar.f109e)) {
            try {
                ((ArrayDeque) dVar.f109e).clear();
                String string = ((SharedPreferences) dVar.f108d).getString((String) dVar.f106b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) dVar.f107c)) {
                    String[] split = string.split((String) dVar.f107c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) dVar.f109e).add(str);
                        }
                    }
                }
            } finally {
            }
        }
        return dVar;
    }

    @Override // N1.b
    public Object a(Class cls) {
        if (!((Set) this.f106b).contains(q.a(cls))) {
            throw new C1.b("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object a6 = ((N1.b) this.f110f).a(cls);
        if (!cls.equals(V1.a.class)) {
            return a6;
        }
        return new r();
    }

    @Override // N1.b
    public Y1.a b(q qVar) {
        if (((Set) this.f107c).contains(qVar)) {
            return ((N1.b) this.f110f).b(qVar);
        }
        throw new C1.b("Attempting to request an undeclared dependency Provider<" + qVar + ">.");
    }

    @Override // N1.b
    public Y1.a c(q qVar) {
        if (((Set) this.f109e).contains(qVar)) {
            return ((N1.b) this.f110f).c(qVar);
        }
        throw new C1.b("Attempting to request an undeclared dependency Provider<Set<" + qVar + ">>.");
    }

    @Override // N1.b
    public Set d(q qVar) {
        if (((Set) this.f108d).contains(qVar)) {
            return ((N1.b) this.f110f).d(qVar);
        }
        throw new C1.b("Attempting to request an undeclared dependency Set<" + qVar + ">.");
    }

    @Override // N1.b
    public Y1.a e(Class cls) {
        return b(q.a(cls));
    }

    @Override // N1.b
    public Object f(q qVar) {
        if (((Set) this.f106b).contains(qVar)) {
            return ((N1.b) this.f110f).f(qVar);
        }
        throw new C1.b("Attempting to request an undeclared dependency " + qVar + ".");
    }

    @Override // e4.InterfaceC0412a
    public Object get() {
        return new C0179c((Executor) ((InterfaceC0412a) this.f106b).get(), (W0.f) ((InterfaceC0412a) this.f107c).get(), (C0267d) ((B4.i) this.f108d).get(), (c1.d) ((InterfaceC0412a) this.f109e).get(), (d1.c) ((InterfaceC0412a) this.f110f).get());
    }

    @Override // f4.InterfaceC0428e
    public Object getValue() {
        T t5 = (T) this.f110f;
        if (t5 != null) {
            return t5;
        }
        B4.i iVar = new B4.i((Y) ((PermissionsActivity$special$$inlined$viewModels$default$2) this.f107c).invoke(), (W) ((PermissionsActivity$special$$inlined$viewModels$default$1) this.f108d).invoke(), (S.b) ((PermissionsActivity$special$$inlined$viewModels$default$3) this.f109e).invoke());
        Class a6 = ((kotlin.jvm.internal.d) this.f106b).a();
        kotlin.jvm.internal.i.c(a6, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        String canonicalName = a6.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        T D5 = iVar.D("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), a6);
        this.f110f = D5;
        return D5;
    }

    public C0482c h(AbstractActivityC1515c context) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        int i2 = 1;
        kotlin.jvm.internal.i.e(context, "context");
        Set set = (Set) this.f109e;
        if (set != null) {
            return new C0482c(set);
        }
        Set set2 = K0.b.f1374a;
        Intent addCategory = new Intent("android.intent.action.VIEW", Uri.parse("http://")).addCategory("android.intent.category.BROWSABLE");
        kotlin.jvm.internal.i.d(addCategory, "Intent(ACTION_VIEW, Uri.…ntent.CATEGORY_BROWSABLE)");
        PackageManager pm = context.getPackageManager();
        kotlin.jvm.internal.i.d(pm, "pm");
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.ResolveInfoFlags.of(131072);
            queryIntentActivities = pm.queryIntentActivities(addCategory, of);
            kotlin.jvm.internal.i.d(queryIntentActivities, "{\n            pm.queryIn…)\n            )\n        }");
        } else {
            queryIntentActivities = pm.queryIntentActivities(addCategory, 131072);
            kotlin.jvm.internal.i.d(queryIntentActivities, "{\n            pm.queryIn…s(intent, flag)\n        }");
        }
        return new C0482c(A4.g.Q(A4.g.O(A4.g.O(new A4.e(new A4.h(1, queryIntentActivities), K0.a.f1371f, 1), K0.a.f1372g), new o(i2, pm))));
    }

    public void i(String str, String value) {
        kotlin.jvm.internal.i.e(value, "value");
        L3.j jVar = (L3.j) this.f108d;
        jVar.getClass();
        B0.f.z(str);
        B0.f.A(value, str);
        jVar.h(str);
        B0.f.i(jVar, str, value);
    }

    public void j(String method, x xVar) {
        kotlin.jvm.internal.i.e(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (xVar == null) {
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("QUERY") || method.equals("REPORT")) {
                throw new IllegalArgumentException(AbstractC0279e.f("method ", method, " must have a request body.").toString());
            }
        } else if (!AbstractC1477a.v(method)) {
            throw new IllegalArgumentException(AbstractC0279e.f("method ", method, " must not have a request body.").toString());
        }
        this.f106b = method;
        this.f109e = xVar;
    }

    public void k(S0.a aVar) {
        C0028c c0028c = new C0028c(0);
        V0.i iVar = (V0.i) this.f107c;
        String str = (String) this.f106b;
        S0.e eVar = (S0.e) this.f109e;
        S0.c cVar = (S0.c) this.f108d;
        V0.o oVar = (V0.o) this.f110f;
        S0.d dVar = S0.d.f2741a;
        B4.i a6 = V0.i.a();
        a6.R(iVar.f3208a);
        a6.f313d = dVar;
        a6.f312c = iVar.f3209b;
        V0.i v4 = a6.v();
        M0.e eVar2 = new M0.e(2);
        eVar2.f1788h = new HashMap();
        eVar2.f1786f = Long.valueOf(oVar.f3221a.e());
        eVar2.f1787g = Long.valueOf(oVar.f3222b.e());
        eVar2.f1783c = str;
        eVar2.f1785e = new V0.k(cVar, (byte[]) eVar.apply(aVar.f2737a));
        eVar2.f1784d = null;
        V0.h c2 = eVar2.c();
        C0179c c0179c = (C0179c) oVar.f3223c;
        c0179c.getClass();
        c0179c.f3844b.execute(new RunnableC0177a(c0179c, v4, c0028c, c2, 0));
    }

    public void l(String url) {
        kotlin.jvm.internal.i.e(url, "url");
        if (B4.r.O(url, "ws:", true)) {
            String substring = url.substring(3);
            kotlin.jvm.internal.i.d(substring, "substring(...)");
            url = "http:".concat(substring);
        } else if (B4.r.O(url, "wss:", true)) {
            String substring2 = url.substring(4);
            kotlin.jvm.internal.i.d(substring2, "substring(...)");
            url = "https:".concat(substring2);
        }
        kotlin.jvm.internal.i.e(url, "<this>");
        p pVar = new p();
        pVar.c(null, url);
        this.f107c = pVar.a();
    }

    public String toString() {
        switch (this.f105a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f106b) + ", mProviderPackage: " + ((String) this.f107c) + ", mQuery: " + ((String) this.f108d) + ", mCertificates:");
                int i2 = 0;
                while (true) {
                    List list = (List) this.f110f;
                    if (i2 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i2);
                    for (int i3 = 0; i3 < list2.size(); i3++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i2++;
                }
            default:
                return super.toString();
        }
    }

    public d(Boolean bool, Boolean bool2, Set set, Map map, String str) {
        this.f105a = 2;
        this.f107c = bool;
        this.f108d = bool2;
        this.f109e = set;
        this.f110f = map;
        this.f106b = str;
    }

    public d(InterfaceC0412a interfaceC0412a, InterfaceC0412a interfaceC0412a2, B4.i iVar, InterfaceC0412a interfaceC0412a3, InterfaceC0412a interfaceC0412a4) {
        this.f105a = 5;
        this.f106b = interfaceC0412a;
        this.f107c = interfaceC0412a2;
        this.f108d = iVar;
        this.f109e = interfaceC0412a3;
        this.f110f = interfaceC0412a4;
    }

    public d(V0.i iVar, String str, S0.c cVar, S0.e eVar, V0.o oVar) {
        this.f105a = 4;
        this.f107c = iVar;
        this.f106b = str;
        this.f108d = cVar;
        this.f109e = eVar;
        this.f110f = oVar;
    }

    public d(kotlin.jvm.internal.d dVar, PermissionsActivity$special$$inlined$viewModels$default$2 permissionsActivity$special$$inlined$viewModels$default$2, PermissionsActivity$special$$inlined$viewModels$default$1 permissionsActivity$special$$inlined$viewModels$default$1, PermissionsActivity$special$$inlined$viewModels$default$3 permissionsActivity$special$$inlined$viewModels$default$3) {
        this.f105a = 6;
        this.f106b = dVar;
        this.f107c = permissionsActivity$special$$inlined$viewModels$default$2;
        this.f108d = permissionsActivity$special$$inlined$viewModels$default$1;
        this.f109e = permissionsActivity$special$$inlined$viewModels$default$3;
    }

    public d(N1.a aVar, N1.b bVar) {
        this.f105a = 1;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (N1.i iVar : aVar.f1998c) {
            int i2 = iVar.f2021c;
            boolean z = i2 == 0;
            int i3 = iVar.f2020b;
            q qVar = iVar.f2019a;
            if (z) {
                if (i3 == 2) {
                    hashSet4.add(qVar);
                } else {
                    hashSet.add(qVar);
                }
            } else if (i2 == 2) {
                hashSet3.add(qVar);
            } else if (i3 == 2) {
                hashSet5.add(qVar);
            } else {
                hashSet2.add(qVar);
            }
        }
        if (!aVar.f2002g.isEmpty()) {
            hashSet.add(q.a(V1.a.class));
        }
        this.f106b = Collections.unmodifiableSet(hashSet);
        this.f107c = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.f108d = Collections.unmodifiableSet(hashSet4);
        this.f109e = Collections.unmodifiableSet(hashSet5);
        this.f110f = bVar;
    }

    public d(String str, String str2, String str3, List list) {
        this.f105a = 0;
        this.f106b = str;
        this.f107c = str2;
        this.f108d = str3;
        list.getClass();
        this.f110f = list;
        this.f109e = str + "-" + str2 + "-" + str3;
    }

    public d(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f105a = 7;
        this.f109e = new ArrayDeque();
        this.f108d = sharedPreferences;
        this.f106b = "topic_operation_queue";
        this.f107c = StringUtils.COMMA;
        this.f110f = scheduledThreadPoolExecutor;
    }

    public d() {
        this.f105a = 3;
        this.f110f = C0472q.f5751a;
        this.f106b = "GET";
        this.f108d = new L3.j(3);
    }
}
