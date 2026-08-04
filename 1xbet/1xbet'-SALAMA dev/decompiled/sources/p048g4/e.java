package p048g4;

import N4.b;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p056h4.a;
import p056h4.f;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13198a;

    public /* synthetic */ e(int i7) {
        this.f13198a = i7;
    }

    @Override // N4.b
    public final Object get() {
        switch (this.f13198a) {
            case 0:
                return Collections.emptySet();
            case 1:
                return null;
            case 2:
                m mVar = ExecutorsRegistrar.f11958a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i7 = Build.VERSION.SDK_INT;
                builderDetectNetwork.detectResourceMismatches();
                if (i7 >= 26) {
                    builderDetectNetwork.detectUnbufferedIo();
                }
                return new f(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f11961d.get());
            case 3:
                m mVar2 = ExecutorsRegistrar.f11958a;
                return new f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f11961d.get());
            case 4:
                m mVar3 = ExecutorsRegistrar.f11958a;
                return new f(Executors.newCachedThreadPool(new a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f11961d.get());
            default:
                m mVar4 = ExecutorsRegistrar.f11958a;
                return Executors.newSingleThreadScheduledExecutor(new a("Firebase Scheduler", 0, null));
        }
    }
}
