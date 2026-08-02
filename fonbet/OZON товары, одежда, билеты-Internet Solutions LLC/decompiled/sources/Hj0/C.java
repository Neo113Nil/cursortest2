package Hj0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;
import ru.ozon.android.hardwareinfo.powermanager.PowerManagerFactory;
import ru.ozon.android.hardwareinfo.powermanager.PowerManagerRepository;

/* loaded from: classes7.dex */
public final class C implements Jb.e<PowerManagerRepository> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f11075a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<DeviceInfoManager> f11076b;

    public C(Jb.f fVar, Pc.a aVar) {
        this.f11075a = fVar;
        this.f11076b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) this.f11075a.get();
        DeviceInfoManager deviceInfoManager = this.f11076b.get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceInfoManager, "deviceInfoManager");
        PowerManagerRepository create = PowerManagerFactory.INSTANCE.create(deviceInfoManager, context);
        Jb.j.d(create);
        return create;
    }
}
