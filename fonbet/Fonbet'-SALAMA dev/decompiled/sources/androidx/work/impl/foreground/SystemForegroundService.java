package androidx.work.impl.foreground;

import H2.q;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC0748w;
import d1.n;
import e1.l;
import java.util.UUID;
import l1.C1377a;
import n1.C1446a;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC0748w {

    /* renamed from: f, reason: collision with root package name */
    public static final String f9887f = n.g("SystemFgService");

    /* renamed from: b, reason: collision with root package name */
    public Handler f9888b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9889c;

    /* renamed from: d, reason: collision with root package name */
    public C1377a f9890d;

    /* renamed from: e, reason: collision with root package name */
    public NotificationManager f9891e;

    public final void a() {
        this.f9888b = new Handler(Looper.getMainLooper());
        this.f9891e = (NotificationManager) getApplicationContext().getSystemService("notification");
        C1377a c1377a = new C1377a(getApplicationContext());
        this.f9890d = c1377a;
        if (c1377a.f14869z == null) {
            c1377a.f14869z = this;
        } else {
            n.d().c(C1377a.f14860A, "A callback already exists.", new Throwable[0]);
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC0748w, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.AbstractServiceC0748w, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f9890d.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i8) {
        super.onStartCommand(intent, i7, i8);
        boolean z4 = this.f9889c;
        String str = f9887f;
        if (z4) {
            n.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f9890d.g();
            a();
            this.f9889c = false;
        }
        if (intent == null) {
            return 3;
        }
        C1377a c1377a = this.f9890d;
        c1377a.getClass();
        String action = intent.getAction();
        boolean equals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = C1377a.f14860A;
        l lVar = c1377a.f14861a;
        if (equals) {
            n.d().e(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            int i9 = 22;
            c1377a.f14862b.G(new q(i9, c1377a, lVar.f12546f, intent.getStringExtra("KEY_WORKSPEC_ID"), false));
            c1377a.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            c1377a.e(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            n.d().e(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            UUID fromString = UUID.fromString(stringExtra);
            lVar.getClass();
            lVar.f12547x.G(new C1446a(lVar, fromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        n.d().e(str2, "Stopping foreground service", new Throwable[0]);
        SystemForegroundService systemForegroundService = c1377a.f14869z;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.f9889c = true;
        n.d().b(str, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }
}
