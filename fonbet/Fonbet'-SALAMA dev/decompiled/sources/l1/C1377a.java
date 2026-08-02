package l1;

import W5.RunnableC0493d;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.activity.g;
import androidx.work.impl.foreground.SystemForegroundService;
import d1.C0955h;
import d1.n;
import e1.InterfaceC0994a;
import e1.k;
import e1.l;
import i1.C1244c;
import i1.InterfaceC1243b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m1.i;
import n1.RunnableC1454i;
import w1.C1759x1;
import w1.L;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1377a implements InterfaceC1243b, InterfaceC0994a {

    /* renamed from: A, reason: collision with root package name */
    public static final String f14860A = n.g("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final l f14861a;

    /* renamed from: b, reason: collision with root package name */
    public final C1759x1 f14862b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14863c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public String f14864d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f14865e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f14866f;

    /* renamed from: x, reason: collision with root package name */
    public final HashSet f14867x;

    /* renamed from: y, reason: collision with root package name */
    public final C1244c f14868y;

    /* renamed from: z, reason: collision with root package name */
    public SystemForegroundService f14869z;

    public C1377a(Context context) {
        l m02 = l.m0(context);
        this.f14861a = m02;
        C1759x1 c1759x1 = m02.f12547x;
        this.f14862b = c1759x1;
        this.f14864d = null;
        this.f14865e = new LinkedHashMap();
        this.f14867x = new HashSet();
        this.f14866f = new HashMap();
        this.f14868y = new C1244c(context, c1759x1, this);
        m02.f12549z.a(this);
    }

    public static Intent a(Context context, String str, C0955h c0955h) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c0955h.f12358a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c0955h.f12359b);
        intent.putExtra("KEY_NOTIFICATION", c0955h.f12360c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, C0955h c0955h) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", c0955h.f12358a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c0955h.f12359b);
        intent.putExtra("KEY_NOTIFICATION", c0955h.f12360c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // e1.InterfaceC0994a
    public final void b(String str, boolean z4) {
        Map.Entry entry;
        synchronized (this.f14863c) {
            try {
                i iVar = (i) this.f14866f.remove(str);
                if (iVar != null ? this.f14867x.remove(iVar) : false) {
                    this.f14868y.b(this.f14867x);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0955h c0955h = (C0955h) this.f14865e.remove(str);
        if (str.equals(this.f14864d) && this.f14865e.size() > 0) {
            Iterator it = this.f14865e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f14864d = (String) entry.getKey();
            if (this.f14869z != null) {
                C0955h c0955h2 = (C0955h) entry.getValue();
                SystemForegroundService systemForegroundService = this.f14869z;
                systemForegroundService.f9888b.post(new RunnableC1378b(systemForegroundService, c0955h2.f12358a, c0955h2.f12360c, c0955h2.f12359b));
                SystemForegroundService systemForegroundService2 = this.f14869z;
                systemForegroundService2.f9888b.post(new RunnableC0493d(systemForegroundService2, c0955h2.f12358a, 4));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f14869z;
        if (c0955h == null || systemForegroundService3 == null) {
            return;
        }
        n d7 = n.d();
        String str2 = f14860A;
        int i7 = c0955h.f12358a;
        int i8 = c0955h.f12359b;
        StringBuilder sb = new StringBuilder("Removing Notification (id: ");
        sb.append(i7);
        sb.append(", workSpecId: ");
        sb.append(str);
        sb.append(" ,notificationType: ");
        d7.b(str2, k.g(sb, i8, ")"), new Throwable[0]);
        systemForegroundService3.f9888b.post(new RunnableC0493d(systemForegroundService3, c0955h.f12358a, 4));
    }

    @Override // i1.InterfaceC1243b
    public final void d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            n.d().b(f14860A, L.i("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            l lVar = this.f14861a;
            lVar.f12547x.G(new RunnableC1454i(lVar, str, true));
        }
    }

    public final void e(Intent intent) {
        int i7 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        n d7 = n.d();
        StringBuilder sb = new StringBuilder("Notifying with (id: ");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType: ");
        d7.b(f14860A, k.g(sb, intExtra2, ")"), new Throwable[0]);
        if (notification == null || this.f14869z == null) {
            return;
        }
        C0955h c0955h = new C0955h(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f14865e;
        linkedHashMap.put(stringExtra, c0955h);
        if (TextUtils.isEmpty(this.f14864d)) {
            this.f14864d = stringExtra;
            SystemForegroundService systemForegroundService = this.f14869z;
            systemForegroundService.f9888b.post(new RunnableC1378b(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f14869z;
        systemForegroundService2.f9888b.post(new g(systemForegroundService2, intExtra, notification, 4));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i7 |= ((C0955h) ((Map.Entry) it.next()).getValue()).f12359b;
        }
        C0955h c0955h2 = (C0955h) linkedHashMap.get(this.f14864d);
        if (c0955h2 != null) {
            SystemForegroundService systemForegroundService3 = this.f14869z;
            systemForegroundService3.f9888b.post(new RunnableC1378b(systemForegroundService3, c0955h2.f12358a, c0955h2.f12360c, i7));
        }
    }

    public final void g() {
        this.f14869z = null;
        synchronized (this.f14863c) {
            this.f14868y.c();
        }
        this.f14861a.f12549z.e(this);
    }

    @Override // i1.InterfaceC1243b
    public final void f(List list) {
    }
}
