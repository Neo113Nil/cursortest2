package p000;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: mk */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0473mk implements my0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5059a;

    @Override // p000.my0
    public final Object get() {
        switch (this.f5059a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                dh0 dh0Var = ExecutorsRegistrar.f1355a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                builderDetectNetwork.detectUnbufferedIo();
                return new ScheduledExecutorServiceC0333is(Executors.newFixedThreadPool(4, new ThreadFactoryC0883xn("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f1358d.get());
            case 2:
                dh0 dh0Var2 = ExecutorsRegistrar.f1355a;
                return new ScheduledExecutorServiceC0333is(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC0883xn("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f1358d.get());
            case 3:
                dh0 dh0Var3 = ExecutorsRegistrar.f1355a;
                return new ScheduledExecutorServiceC0333is(Executors.newCachedThreadPool(new ThreadFactoryC0883xn("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f1358d.get());
            case 4:
                dh0 dh0Var4 = ExecutorsRegistrar.f1355a;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC0883xn("Firebase Scheduler", 0, null));
            default:
                return null;
        }
    }
}
