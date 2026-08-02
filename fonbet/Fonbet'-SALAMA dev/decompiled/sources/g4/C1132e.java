package g4;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import h4.ScheduledExecutorServiceC1203f;
import h4.ThreadFactoryC1198a;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: g4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1132e implements N4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13192a;

    public /* synthetic */ C1132e(int i7) {
        this.f13192a = i7;
    }

    @Override // N4.b
    public final Object get() {
        switch (this.f13192a) {
            case 0:
                return Collections.emptySet();
            case 1:
                return null;
            case 2:
                C1140m c1140m = ExecutorsRegistrar.f11958a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i7 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i7 >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new ScheduledExecutorServiceC1203f(Executors.newFixedThreadPool(4, new ThreadFactoryC1198a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f11961d.get());
            case 3:
                C1140m c1140m2 = ExecutorsRegistrar.f11958a;
                return new ScheduledExecutorServiceC1203f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC1198a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f11961d.get());
            case 4:
                C1140m c1140m3 = ExecutorsRegistrar.f11958a;
                return new ScheduledExecutorServiceC1203f(Executors.newCachedThreadPool(new ThreadFactoryC1198a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f11961d.get());
            default:
                C1140m c1140m4 = ExecutorsRegistrar.f11958a;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC1198a("Firebase Scheduler", 0, null));
        }
    }
}
