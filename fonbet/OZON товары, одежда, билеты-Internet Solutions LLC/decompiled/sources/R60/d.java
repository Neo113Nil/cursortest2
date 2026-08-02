package R60;

import Jb.j;
import R60.a;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;
import ru.ozon.android.hardwareinfo.DeviceType;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class d implements Jb.e<DeviceInfoManager> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f24770a;

    public d(Pc.a<Context> aVar) {
        this.f24770a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) ((a.h) this.f24770a).get();
        Intrinsics.checkNotNullParameter(context, "context");
        DeviceInfoManager invoke = DeviceInfoManager.INSTANCE.invoke(context, context.getResources().getBoolean(R.bool.isTablet) ? DeviceType.TABLET : DeviceType.MOBILE);
        j.d(invoke);
        return invoke;
    }
}
