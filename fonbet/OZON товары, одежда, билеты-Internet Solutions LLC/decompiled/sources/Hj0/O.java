package Hj0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;

/* loaded from: classes7.dex */
public final class O implements Jb.e<DeviceInfoManager> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f11097a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f11098b;

    public O(Jb.f fVar, Jb.f fVar2) {
        this.f11097a = fVar;
        this.f11098b = fVar2;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) this.f11097a.get();
        fi0.x trackerSettings = (fi0.x) this.f11098b.get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(trackerSettings, "trackerSettings");
        DeviceInfoManager invoke = DeviceInfoManager.INSTANCE.invoke(context, trackerSettings.u());
        Jb.j.d(invoke);
        return invoke;
    }
}
