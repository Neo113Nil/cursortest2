package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.N;
import androidx.work.o;
import h5.u;

/* loaded from: classes8.dex */
public class SystemAlarmService extends N {

    /* renamed from: d, reason: collision with root package name */
    private static final String f45369d = o.i("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    private f f45370b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f45371c;

    public final void a() {
        this.f45371c = true;
        o.e().a(f45369d, "All commands completed in dispatcher");
        u.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.N, android.app.Service
    public final void onCreate() {
        super.onCreate();
        f fVar = new f(this);
        this.f45370b = fVar;
        fVar.j(this);
        this.f45371c = false;
    }

    @Override // androidx.lifecycle.N, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f45371c = true;
        this.f45370b.h();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i11, int i12) {
        super.onStartCommand(intent, i11, i12);
        if (this.f45371c) {
            o.e().f(f45369d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f45370b.h();
            f fVar = new f(this);
            this.f45370b = fVar;
            fVar.j(this);
            this.f45371c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f45370b.a(i12, intent);
        return 3;
    }
}
