package n2;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.internal.ads.RunnableC0920e5;
import f2.C1949g;
import f2.m;
import g2.InterfaceC1977a;
import g2.l;
import i2.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k2.C2032c;
import k2.InterfaceC2031b;
import o2.i;
import p2.RunnableC2252j;
import v3.e;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2185a implements InterfaceC2031b, InterfaceC1977a {

    /* renamed from: t, reason: collision with root package name */
    public static final String f18458t = m.f("SystemFgDispatcher");

    /* renamed from: k, reason: collision with root package name */
    public final l f18459k;

    /* renamed from: l, reason: collision with root package name */
    public final e f18460l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f18461m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public String f18462n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f18463o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f18464p;

    /* renamed from: q, reason: collision with root package name */
    public final HashSet f18465q;

    /* renamed from: r, reason: collision with root package name */
    public final C2032c f18466r;

    /* renamed from: s, reason: collision with root package name */
    public SystemForegroundService f18467s;

    public C2185a(Context context) {
        l Q5 = l.Q(context);
        this.f18459k = Q5;
        e eVar = Q5.f17131n;
        this.f18460l = eVar;
        this.f18462n = null;
        this.f18463o = new LinkedHashMap();
        this.f18465q = new HashSet();
        this.f18464p = new HashMap();
        this.f18466r = new C2032c(context, eVar, this);
        Q5.f17133p.b(this);
    }

    public static Intent b(Context context, String str, C1949g c1949g) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c1949g.f16995a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c1949g.f16996b);
        intent.putExtra("KEY_NOTIFICATION", c1949g.f16997c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, C1949g c1949g) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", c1949g.f16995a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c1949g.f16996b);
        intent.putExtra("KEY_NOTIFICATION", c1949g.f16997c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // g2.InterfaceC1977a
    public final void a(String str, boolean z3) {
        Map.Entry entry;
        synchronized (this.f18461m) {
            try {
                i iVar = (i) this.f18464p.remove(str);
                if (iVar != null ? this.f18465q.remove(iVar) : false) {
                    this.f18466r.c(this.f18465q);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1949g c1949g = (C1949g) this.f18463o.remove(str);
        if (str.equals(this.f18462n) && this.f18463o.size() > 0) {
            Iterator it = this.f18463o.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f18462n = (String) entry.getKey();
            if (this.f18467s != null) {
                C1949g c1949g2 = (C1949g) entry.getValue();
                SystemForegroundService systemForegroundService = this.f18467s;
                systemForegroundService.f7118l.post(new RunnableC2186b(systemForegroundService, c1949g2.f16995a, c1949g2.f16997c, c1949g2.f16996b));
                SystemForegroundService systemForegroundService2 = this.f18467s;
                systemForegroundService2.f7118l.post(new RunnableC0920e5(c1949g2.f16995a, 7, systemForegroundService2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f18467s;
        if (c1949g == null || systemForegroundService3 == null) {
            return;
        }
        m d5 = m.d();
        String str2 = f18458t;
        int i = c1949g.f16995a;
        int i5 = c1949g.f16996b;
        StringBuilder sb = new StringBuilder("Removing Notification (id: ");
        sb.append(i);
        sb.append(", workSpecId: ");
        sb.append(str);
        sb.append(" ,notificationType: ");
        d5.a(str2, L1.a.o(sb, i5, ")"), new Throwable[0]);
        systemForegroundService3.f7118l.post(new RunnableC0920e5(c1949g.f16995a, 7, systemForegroundService3));
    }

    @Override // k2.InterfaceC2031b
    public final void c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            m.d().a(f18458t, L1.a.m("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            l lVar = this.f18459k;
            lVar.f17131n.t(new RunnableC2252j(lVar, str, true));
        }
    }

    public final void f(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        m d5 = m.d();
        StringBuilder sb = new StringBuilder("Notifying with (id: ");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType: ");
        d5.a(f18458t, L1.a.o(sb, intExtra2, ")"), new Throwable[0]);
        if (notification == null || this.f18467s == null) {
            return;
        }
        C1949g c1949g = new C1949g(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f18463o;
        linkedHashMap.put(stringExtra, c1949g);
        if (TextUtils.isEmpty(this.f18462n)) {
            this.f18462n = stringExtra;
            SystemForegroundService systemForegroundService = this.f18467s;
            systemForegroundService.f7118l.post(new RunnableC2186b(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f18467s;
        systemForegroundService2.f7118l.post(new g(systemForegroundService2, intExtra, notification, 2));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((C1949g) ((Map.Entry) it.next()).getValue()).f16996b;
        }
        C1949g c1949g2 = (C1949g) linkedHashMap.get(this.f18462n);
        if (c1949g2 != null) {
            SystemForegroundService systemForegroundService3 = this.f18467s;
            systemForegroundService3.f7118l.post(new RunnableC2186b(systemForegroundService3, c1949g2.f16995a, c1949g2.f16997c, i));
        }
    }

    public final void g() {
        this.f18467s = null;
        synchronized (this.f18461m) {
            this.f18466r.d();
        }
        this.f18459k.f17133p.f(this);
    }

    @Override // k2.InterfaceC2031b
    public final void e(List list) {
    }
}
