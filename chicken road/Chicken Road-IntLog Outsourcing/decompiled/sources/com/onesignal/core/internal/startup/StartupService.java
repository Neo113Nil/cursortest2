package com.onesignal.core.internal.startup;

import B2.b;
import com.onesignal.common.services.ServiceProvider;
import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.core.internal.features.FeatureFlag;
import com.onesignal.core.internal.features.IFeatureManager;
import com.onesignal.debug.internal.logging.Logging;
import java.util.Iterator;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class StartupService {
    private final ServiceProvider services;

    public StartupService(ServiceProvider services) {
        i.e(services, "services");
        this.services = services;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleStart$lambda$2(StartupService this$0) {
        i.e(this$0, "this$0");
        for (IStartableService iStartableService : this$0.services.getAllServices(IStartableService.class)) {
            try {
                iStartableService.start();
            } catch (Throwable th) {
                Logging.error("OneSignal: Startable service failed: ".concat(iStartableService.getClass().getSimpleName()), th);
            }
        }
    }

    public final void bootstrap() {
        Iterator it = this.services.getAllServices(IBootstrapService.class).iterator();
        while (it.hasNext()) {
            ((IBootstrapService) it.next()).bootstrap();
        }
    }

    public final void scheduleStart() {
        boolean z;
        try {
            z = ((IFeatureManager) this.services.getService(IFeatureManager.class)).isEnabled(FeatureFlag.SDK_BACKGROUND_THREADING);
        } catch (Throwable th) {
            Logging.warn("OneSignal: Failed to resolve BACKGROUND_THREADING in StartupService. Falling back to legacy thread.", th);
            z = false;
        }
        if (z) {
            OneSignalDispatchers.INSTANCE.launchOnDefault(new StartupService$scheduleStart$1(this, null));
        } else {
            new Thread(new b(9, this)).start();
        }
    }
}
