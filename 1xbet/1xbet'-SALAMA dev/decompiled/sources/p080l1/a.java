package p080l1;

import W5.RunnableC0493d;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.activity.g;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p023d1.h;
import p023d1.n;
import p031e1.k;
import p031e1.l;
import p060i1.b;
import p060i1.c;
import p088m1.i;
import p155w1.C1050x1;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b, p031e1.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f14866A = n.g("SystemFgDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f14867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1050x1 f14868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14869c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f14871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f14872f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashSet f14873x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f14874y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SystemForegroundService f14875z;

    public a(Context context) {
        l lVarM0 = l.m0(context);
        this.f14867a = lVarM0;
        C1050x1 c1050x1 = lVarM0.f12553x;
        this.f14868b = c1050x1;
        this.f14870d = null;
        this.f14871e = new LinkedHashMap();
        this.f14873x = new HashSet();
        this.f14872f = new HashMap();
        this.f14874y = new c(context, c1050x1, this);
        lVarM0.f12555z.a(this);
    }

    public static Intent a(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f12364a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f12365b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f12366c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f12364a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f12365b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f12366c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // p031e1.a
    public final void b(String str, boolean z4) {
        Map.Entry entry;
        synchronized (this.f14869c) {
            try {
                i iVar = (i) this.f14872f.remove(str);
                if (iVar != null ? this.f14873x.remove(iVar) : false) {
                    this.f14874y.b(this.f14873x);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        h hVar = (h) this.f14871e.remove(str);
        if (str.equals(this.f14870d) && this.f14871e.size() > 0) {
            Iterator it = this.f14871e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f14870d = (String) entry.getKey();
            if (this.f14875z != null) {
                h hVar2 = (h) entry.getValue();
                SystemForegroundService systemForegroundService = this.f14875z;
                systemForegroundService.f9888b.post(new b(systemForegroundService, hVar2.f12364a, hVar2.f12366c, hVar2.f12365b));
                SystemForegroundService systemForegroundService2 = this.f14875z;
                systemForegroundService2.f9888b.post(new RunnableC0493d(systemForegroundService2, hVar2.f12364a, 4));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f14875z;
        if (hVar == null || systemForegroundService3 == null) {
            return;
        }
        n nVarD = n.d();
        String str2 = f14866A;
        int i7 = hVar.f12364a;
        int i8 = hVar.f12365b;
        StringBuilder sb = new StringBuilder("Removing Notification (id: ");
        sb.append(i7);
        sb.append(", workSpecId: ");
        sb.append(str);
        sb.append(" ,notificationType: ");
        nVarD.b(str2, k.g(sb, i8, ")"), new Throwable[0]);
        systemForegroundService3.f9888b.post(new RunnableC0493d(systemForegroundService3, hVar.f12364a, 4));
    }

    @Override // p060i1.b
    public final void d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            n.d().b(f14866A, L.i("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            l lVar = this.f14867a;
            lVar.f12553x.G(new p096n1.i(lVar, str, true));
        }
    }

    public final void e(Intent intent) {
        int i7 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        n nVarD = n.d();
        StringBuilder sb = new StringBuilder("Notifying with (id: ");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType: ");
        nVarD.b(f14866A, k.g(sb, intExtra2, ")"), new Throwable[0]);
        if (notification == null || this.f14875z == null) {
            return;
        }
        h hVar = new h(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f14871e;
        linkedHashMap.put(stringExtra, hVar);
        if (TextUtils.isEmpty(this.f14870d)) {
            this.f14870d = stringExtra;
            SystemForegroundService systemForegroundService = this.f14875z;
            systemForegroundService.f9888b.post(new b(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f14875z;
        systemForegroundService2.f9888b.post(new g(systemForegroundService2, intExtra, notification, 4));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i7 |= ((h) ((Map.Entry) it.next()).getValue()).f12365b;
        }
        h hVar2 = (h) linkedHashMap.get(this.f14870d);
        if (hVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.f14875z;
            systemForegroundService3.f9888b.post(new b(systemForegroundService3, hVar2.f12364a, hVar2.f12366c, i7));
        }
    }

    public final void g() {
        this.f14875z = null;
        synchronized (this.f14869c) {
            this.f14874y.c();
        }
        this.f14867a.f12555z.e(this);
    }

    @Override // p060i1.b
    public final void f(List list) {
    }
}
