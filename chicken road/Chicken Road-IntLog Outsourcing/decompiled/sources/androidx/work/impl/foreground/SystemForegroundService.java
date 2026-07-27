package androidx.work.impl.foreground;

import A0.a;
import A0.b;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC0253x;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.UUID;
import s0.s;
import t0.o;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC0253x {

    /* renamed from: f, reason: collision with root package name */
    public static final String f4746f = s.f("SystemFgService");

    /* renamed from: b, reason: collision with root package name */
    public Handler f4747b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4748c;

    /* renamed from: d, reason: collision with root package name */
    public b f4749d;

    /* renamed from: e, reason: collision with root package name */
    public NotificationManager f4750e;

    public final void a() {
        this.f4747b = new Handler(Looper.getMainLooper());
        this.f4750e = (NotificationManager) getApplicationContext().getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
        b bVar = new b(getApplicationContext());
        this.f4749d = bVar;
        if (bVar.f15i != null) {
            s.d().b(b.f6j, "A callback already exists.");
        } else {
            bVar.f15i = this;
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC0253x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.AbstractServiceC0253x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f4749d.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        boolean z = this.f4748c;
        String str = f4746f;
        if (z) {
            s.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f4749d.g();
            a();
            this.f4748c = false;
        }
        if (intent == null) {
            return 3;
        }
        b bVar = this.f4749d;
        bVar.getClass();
        String action = intent.getAction();
        boolean equals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = b.f6j;
        if (equals) {
            s.d().e(str2, "Started foreground service " + intent);
            bVar.f8b.o(new a(bVar, 0, intent.getStringExtra("KEY_WORKSPEC_ID")));
            bVar.f(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            bVar.f(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            s.d().e(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = bVar.f15i;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f4748c = true;
            s.d().a(str, "All commands completed.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        s.d().e(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        UUID fromString = UUID.fromString(stringExtra);
        o oVar = bVar.f7a;
        oVar.getClass();
        oVar.f11885d.o(new C0.b(oVar, fromString, 0));
        return 3;
    }
}
