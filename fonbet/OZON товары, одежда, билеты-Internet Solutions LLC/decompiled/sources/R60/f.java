package R60;

import Jb.j;
import R60.a;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;
import ru.ozon.android.hardwareinfo.powermanager.PowerManagerFactory;
import ru.ozon.android.hardwareinfo.powermanager.PowerManagerRepository;

/* loaded from: classes3.dex */
public final class f implements Jb.e<PowerManagerRepository> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f24773a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<DeviceInfoManager> f24774b;

    public f(Pc.a<Context> aVar, Pc.a<DeviceInfoManager> aVar2) {
        this.f24773a = aVar;
        this.f24774b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) ((a.h) this.f24773a).get();
        DeviceInfoManager deviceInfoManager = this.f24774b.get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceInfoManager, "deviceInfoManager");
        PowerManagerRepository create = PowerManagerFactory.INSTANCE.create(deviceInfoManager, context);
        j.d(create);
        return create;
    }
}
