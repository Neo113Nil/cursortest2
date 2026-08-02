package androidx.lifecycle;

import Sc.InterfaceC3999a;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/N;", "Landroid/app/Service;", "Landroidx/lifecycle/J;", "<init>", "()V", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class N extends Service implements J {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final p0 f43220a = new p0(this);

    @Override // androidx.lifecycle.J
    @NotNull
    public final AbstractC5434v getLifecycle() {
        return this.f43220a.a();
    }

    @Override // android.app.Service
    public final IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f43220a.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f43220a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f43220a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    @InterfaceC3999a
    public final void onStart(Intent intent, int i11) {
        this.f43220a.e();
        super.onStart(intent, i11);
    }
}
