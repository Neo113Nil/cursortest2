package U90;

import O30.b;
import P90.c;
import Q90.n;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import androidx.core.app.l;
import i3.C7003a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class a extends Service {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C0554a f27460a = new C0554a();

    /* renamed from: b, reason: collision with root package name */
    public n f27461b;

    /* renamed from: c, reason: collision with root package name */
    public ru.ozon.fintech.settings.domain.a f27462c;

    /* renamed from: U90.a$a, reason: collision with other inner class name */
    public static final class C0554a extends BroadcastReceiver {
        C0554a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if (!Intrinsics.d(intent.getAction(), "ru.ozon.fintech.settings.domain.START_ALIAS_ACTIVITY")) {
                    intent = null;
                }
                if (intent != null) {
                    Thread.sleep(1000L);
                    a aVar = a.this;
                    Context applicationContext = aVar.getApplicationContext();
                    if (applicationContext != null) {
                        n nVar = aVar.f27461b;
                        if (nVar == null) {
                            Intrinsics.n("fintechUltraManager");
                            throw null;
                        }
                        Context appContext = aVar.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(appContext, "getApplicationContext(...)");
                        Intrinsics.checkNotNullParameter(appContext, "appContext");
                        Intent component = nVar.d() ? new Intent().setComponent(new ComponentName(appContext, "ru.ozon.fintech.features.tabber.presentation.finance.FinanceActivityUltra")) : new Intent().setComponent(new ComponentName(appContext, "ru.ozon.fintech.features.tabber.presentation.finance.FinanceActivity"));
                        Intrinsics.f(component);
                        component.setFlags(268435456);
                        applicationContext.startActivity(component);
                    }
                    aVar.stopSelf();
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((c) O30.a.a(b.FINANCE).a(O90.a.class)).C(this);
        C7003a.b(getApplicationContext()).c(this.f27460a, new IntentFilter("ru.ozon.fintech.settings.domain.START_ALIAS_ACTIVITY"));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C7003a.b(getApplicationContext()).e(this.f27460a);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i11, int i12) {
        NotificationChannel notificationChannel = new NotificationChannel("ozonBankId = 1", "Все уведомления", 3);
        Object systemService = getSystemService("notification");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        l.d dVar = new l.d(this, "ozonBankId = 1");
        ru.ozon.fintech.settings.domain.a aVar = this.f27462c;
        if (aVar == null) {
            Intrinsics.n("fintechSettings");
            throw null;
        }
        dVar.j(aVar.getAppName());
        ru.ozon.fintech.settings.domain.a aVar2 = this.f27462c;
        if (aVar2 == null) {
            Intrinsics.n("fintechSettings");
            throw null;
        }
        dVar.i(aVar2.getAppName());
        dVar.C(R.drawable.ic_m_bank);
        Notification b11 = dVar.b();
        Intrinsics.checkNotNullExpressionValue(b11, "build(...)");
        startForeground(1, b11);
        return 2;
    }
}
