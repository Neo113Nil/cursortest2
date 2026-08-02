package OF;

import ru.ozon.android.ozonLogger.core.h;
import ru.ozon.app.android.push.di.module.OzonPushModule;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Pc.a {
    @Override // Pc.a
    public final Object get() {
        h providePushConfiguration$lambda$1;
        providePushConfiguration$lambda$1 = OzonPushModule.Companion.providePushConfiguration$lambda$1();
        return providePushConfiguration$lambda$1;
    }
}
