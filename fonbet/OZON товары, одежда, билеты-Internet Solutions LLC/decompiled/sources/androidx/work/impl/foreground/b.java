package androidx.work.impl.foreground;

import Cm.e;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.h;
import androidx.work.impl.C;
import androidx.work.impl.InterfaceC5476d;
import androidx.work.o;
import d5.C6089d;
import d5.InterfaceC6088c;
import g5.C6627B;
import g5.C6643p;
import g5.S;
import i5.InterfaceC7008a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class b implements InterfaceC6088c, InterfaceC5476d {

    /* renamed from: j, reason: collision with root package name */
    static final String f45446j = o.i("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    private C f45447a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7008a f45448b;

    /* renamed from: c, reason: collision with root package name */
    final Object f45449c = new Object();

    /* renamed from: d, reason: collision with root package name */
    C6643p f45450d;

    /* renamed from: e, reason: collision with root package name */
    final LinkedHashMap f45451e;

    /* renamed from: f, reason: collision with root package name */
    final HashMap f45452f;

    /* renamed from: g, reason: collision with root package name */
    final HashSet f45453g;

    /* renamed from: h, reason: collision with root package name */
    final C6089d f45454h;

    /* renamed from: i, reason: collision with root package name */
    private SystemForegroundService f45455i;

    b(@NonNull Context context) {
        C i11 = C.i(context);
        this.f45447a = i11;
        this.f45448b = i11.p();
        this.f45450d = null;
        this.f45451e = new LinkedHashMap();
        this.f45453g = new HashSet();
        this.f45452f = new HashMap();
        this.f45454h = new C6089d(i11.m(), this);
        i11.k().c(this);
    }

    @NonNull
    public static Intent c(@NonNull Context context, @NonNull C6643p c6643p, @NonNull h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.a());
        intent.putExtra("KEY_NOTIFICATION", hVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", c6643p.b());
        intent.putExtra("KEY_GENERATION", c6643p.a());
        return intent;
    }

    @NonNull
    public static Intent d(@NonNull Context context, @NonNull C6643p c6643p, @NonNull h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", c6643p.b());
        intent.putExtra("KEY_GENERATION", c6643p.a());
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.a());
        intent.putExtra("KEY_NOTIFICATION", hVar.b());
        return intent;
    }

    @NonNull
    public static Intent g(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void h(@NonNull Intent intent) {
        int i11 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        C6643p c6643p = new C6643p(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        o.e().a(f45446j, K00.b.e(intExtra2, ")", e.g(intExtra, "Notifying with (id:", ", workSpecId: ", stringExtra, ", notificationType :")));
        if (notification == null || this.f45455i == null) {
            return;
        }
        h hVar = new h(intExtra, intExtra2, notification);
        LinkedHashMap linkedHashMap = this.f45451e;
        linkedHashMap.put(c6643p, hVar);
        if (this.f45450d == null) {
            this.f45450d = c6643p;
            this.f45455i.e(intExtra, intExtra2, notification);
            return;
        }
        this.f45455i.d(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i11 |= ((h) ((Map.Entry) it.next()).getValue()).a();
        }
        h hVar2 = (h) linkedHashMap.get(this.f45450d);
        if (hVar2 != null) {
            this.f45455i.e(hVar2.c(), i11, hVar2.b());
        }
    }

    @Override // androidx.work.impl.InterfaceC5476d
    public final void b(@NonNull C6643p c6643p, boolean z11) {
        Map.Entry entry;
        synchronized (this.f45449c) {
            try {
                C6627B c6627b = (C6627B) this.f45452f.remove(c6643p);
                if (c6627b != null ? this.f45453g.remove(c6627b) : false) {
                    this.f45454h.d(this.f45453g);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h hVar = (h) this.f45451e.remove(c6643p);
        if (c6643p.equals(this.f45450d) && this.f45451e.size() > 0) {
            Iterator it = this.f45451e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f45450d = (C6643p) entry.getKey();
            if (this.f45455i != null) {
                h hVar2 = (h) entry.getValue();
                this.f45455i.e(hVar2.c(), hVar2.a(), hVar2.b());
                this.f45455i.b(hVar2.c());
            }
        }
        SystemForegroundService systemForegroundService = this.f45455i;
        if (hVar == null || systemForegroundService == null) {
            return;
        }
        o.e().a(f45446j, "Removing Notification (id: " + hVar.c() + ", workSpecId: " + c6643p + ", notificationType: " + hVar.a());
        systemForegroundService.b(hVar.c());
    }

    @Override // d5.InterfaceC6088c
    public final void e(@NonNull ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6627B c6627b = (C6627B) it.next();
            String str = c6627b.f63799a;
            o.e().a(f45446j, Nk.a.b("Constraints unmet for WorkSpec ", str));
            this.f45447a.v(S.a(c6627b));
        }
    }

    @Override // d5.InterfaceC6088c
    public final void f(@NonNull List<C6627B> list) {
    }

    final void i() {
        this.f45455i = null;
        synchronized (this.f45449c) {
            this.f45454h.e();
        }
        this.f45447a.k().i(this);
    }

    final void j(@NonNull Intent intent) {
        String action = intent.getAction();
        boolean equals = "ACTION_START_FOREGROUND".equals(action);
        String str = f45446j;
        if (equals) {
            o.e().f(str, "Started foreground service " + intent);
            this.f45448b.a(new a(this, intent.getStringExtra("KEY_WORKSPEC_ID")));
            h(intent);
            return;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            h(intent);
            return;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if ("ACTION_STOP_FOREGROUND".equals(action)) {
                o.e().f(str, "Stopping foreground service");
                SystemForegroundService systemForegroundService = this.f45455i;
                if (systemForegroundService != null) {
                    systemForegroundService.f();
                    return;
                }
                return;
            }
            return;
        }
        o.e().f(str, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f45447a.d(UUID.fromString(stringExtra));
    }

    final void k(@NonNull SystemForegroundService systemForegroundService) {
        if (this.f45455i != null) {
            o.e().c(f45446j, "A callback already exists.");
        } else {
            this.f45455i = systemForegroundService;
        }
    }
}
