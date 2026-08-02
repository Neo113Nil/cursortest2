package A5;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class t implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f444a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final WeakReference<l5.i> f445b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final u5.f f446c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f447d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f448e;

    public t(@NotNull l5.i iVar, @NotNull Context context, boolean z11) {
        u5.f hVar;
        this.f444a = context;
        this.f445b = new WeakReference<>(iVar);
        if (z11) {
            iVar.getClass();
            hVar = u5.g.a(context, this);
        } else {
            hVar = new H5.h();
        }
        this.f446c = hVar;
        this.f447d = hVar.a();
        this.f448e = new AtomicBoolean(false);
    }

    public final boolean a() {
        return this.f447d;
    }

    public final void b(boolean z11) {
        Unit unit;
        if (this.f445b.get() != null) {
            this.f447d = z11;
            unit = Unit.f71690a;
        } else {
            unit = null;
        }
        if (unit == null) {
            d();
        }
    }

    public final void c() {
        this.f444a.registerComponentCallbacks(this);
    }

    public final void d() {
        if (this.f448e.getAndSet(true)) {
            return;
        }
        this.f444a.unregisterComponentCallbacks(this);
        this.f446c.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        if (this.f445b.get() == null) {
            d();
            Unit unit = Unit.f71690a;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i11) {
        Unit unit;
        l5.i iVar = this.f445b.get();
        if (iVar != null) {
            iVar.i(i11);
            unit = Unit.f71690a;
        } else {
            unit = null;
        }
        if (unit == null) {
            d();
        }
    }
}
