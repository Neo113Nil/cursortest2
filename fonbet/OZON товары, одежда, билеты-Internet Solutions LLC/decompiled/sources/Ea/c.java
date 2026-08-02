package Ea;

import com.vk.id.tracking.tracer.TrackingDeps;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes9.dex */
public final /* synthetic */ class c implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread tracer$lambda$1$lambda$0;
        tracer$lambda$1$lambda$0 = TrackingDeps.tracer$lambda$1$lambda$0(runnable);
        return tracer$lambda$1$lambda$0;
    }
}
