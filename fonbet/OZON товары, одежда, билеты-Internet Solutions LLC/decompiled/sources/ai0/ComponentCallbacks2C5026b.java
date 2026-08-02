package ai0;

import B90.V;
import Sc.InterfaceC3999a;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.OzonApplication;

/* renamed from: ai0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ComponentCallbacks2C5026b implements DefaultLifecycleObserver, ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC5434v f36793a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f36794b;

    /* renamed from: c, reason: collision with root package name */
    private OzonApplication f36795c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36796d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Handler f36797e;

    public ComponentCallbacks2C5026b() {
        this(0);
    }

    private final void c() {
        if (this.f36794b.compareAndSet(false, true)) {
            if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
                d();
            } else {
                this.f36797e.post(new V(this, 3));
            }
        }
    }

    public final boolean a() {
        return this.f36794b.get();
    }

    public final void b(@NotNull OzonApplication application) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (this.f36796d) {
            return;
        }
        this.f36796d = true;
        this.f36795c = application;
        this.f36793a.a(this);
        application.registerComponentCallbacks(this);
    }

    public final void d() {
        if (this.f36796d) {
            this.f36796d = false;
            this.f36793a.e(this);
            OzonApplication ozonApplication = this.f36795c;
            if (ozonApplication != null) {
                ozonApplication.unregisterComponentCallbacks(this);
            }
            this.f36795c = null;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks
    @InterfaceC3999a
    public final void onLowMemory() {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i11) {
        boolean z11 = i11 == 20;
        boolean z12 = i11 >= 40;
        if (z11 || z12) {
            c();
        }
    }

    public ComponentCallbacks2C5026b(int i11) {
        ProcessLifecycleOwner processLifecycleOwner;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        AbstractC5434v appLifecycle = processLifecycleOwner.getLifecycle();
        Intrinsics.checkNotNullParameter(appLifecycle, "appLifecycle");
        this.f36793a = appLifecycle;
        this.f36794b = new AtomicBoolean(false);
        this.f36797e = new Handler(Looper.getMainLooper());
    }
}
