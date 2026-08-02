package androidx.work.impl.foreground;

import S2.q;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC0494x;
import f2.m;
import g2.l;
import java.util.UUID;
import n2.C2185a;
import p2.C2243a;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC0494x {

    /* renamed from: p, reason: collision with root package name */
    public static final String f7117p = m.f("SystemFgService");

    /* renamed from: l, reason: collision with root package name */
    public Handler f7118l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7119m;

    /* renamed from: n, reason: collision with root package name */
    public C2185a f7120n;

    /* renamed from: o, reason: collision with root package name */
    public NotificationManager f7121o;

    public final void c() {
        this.f7118l = new Handler(Looper.getMainLooper());
        this.f7121o = (NotificationManager) getApplicationContext().getSystemService("notification");
        C2185a c2185a = new C2185a(getApplicationContext());
        this.f7120n = c2185a;
        if (c2185a.f18467s == null) {
            c2185a.f18467s = this;
        } else {
            m.d().b(C2185a.f18458t, "A callback already exists.", new Throwable[0]);
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC0494x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        c();
    }

    @Override // androidx.lifecycle.AbstractServiceC0494x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f7120n.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i5) {
        super.onStartCommand(intent, i, i5);
        boolean z3 = this.f7119m;
        String str = f7117p;
        if (z3) {
            m.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f7120n.g();
            c();
            this.f7119m = false;
        }
        if (intent == null) {
            return 3;
        }
        C2185a c2185a = this.f7120n;
        c2185a.getClass();
        String action = intent.getAction();
        boolean equals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = C2185a.f18458t;
        l lVar = c2185a.f18459k;
        if (equals) {
            m.d().e(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            c2185a.f18460l.t(new q(c2185a, lVar.f17130m, intent.getStringExtra("KEY_WORKSPEC_ID"), 10, false));
            c2185a.f(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            c2185a.f(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            m.d().e(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            UUID fromString = UUID.fromString(stringExtra);
            lVar.getClass();
            lVar.f17131n.t(new C2243a(lVar, fromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        m.d().e(str2, "Stopping foreground service", new Throwable[0]);
        SystemForegroundService systemForegroundService = c2185a.f18467s;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.f7119m = true;
        m.d().a(str, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }
}
