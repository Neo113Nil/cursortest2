package androidx.work.impl.foreground;

import H2.q;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC0727w;
import java.util.UUID;
import p023d1.n;
import p031e1.l;
import p080l1.a;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC0727w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f9887f = n.g("SystemFgService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f9888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f9890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public NotificationManager f9891e;

    public final void a() {
        this.f9888b = new Handler(Looper.getMainLooper());
        this.f9891e = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f9890d = aVar;
        if (aVar.f14875z == null) {
            aVar.f14875z = this;
        } else {
            n.d().c(a.f14866A, "A callback already exists.", new Throwable[0]);
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC0727w, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.AbstractServiceC0727w, android.app.Service
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
        a aVar = this.f9890d;
        aVar.getClass();
        String action = intent.getAction();
        boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = a.f14866A;
        l lVar = aVar.f14867a;
        if (zEquals) {
            n.d().e(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            int i9 = 22;
            aVar.f14868b.G(new q(i9, aVar, lVar.f12552f, intent.getStringExtra("KEY_WORKSPEC_ID"), false));
            aVar.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            aVar.e(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            n.d().e(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            UUID uuidFromString = UUID.fromString(stringExtra);
            lVar.getClass();
            lVar.f12553x.G(new p096n1.a(lVar, uuidFromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        n.d().e(str2, "Stopping foreground service", new Throwable[0]);
        SystemForegroundService systemForegroundService = aVar.f14875z;
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
