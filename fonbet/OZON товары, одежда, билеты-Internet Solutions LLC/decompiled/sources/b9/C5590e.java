package b9;

import a9.C4962a;
import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.I;
import androidx.lifecycle.X;
import c9.C5769a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzlx;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@KeepForSdk
/* renamed from: b9.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C5590e<DetectionResultT> implements Closeable, I {

    /* renamed from: e, reason: collision with root package name */
    private static final GmsLogger f55729e = new GmsLogger("MobileVisionBase", "");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f55730f = 0;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f55731a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final com.google.mlkit.common.sdkinternal.f f55732b;

    /* renamed from: c, reason: collision with root package name */
    private final CancellationTokenSource f55733c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f55734d;

    @KeepForSdk
    public C5590e(@NonNull com.google.mlkit.common.sdkinternal.f<DetectionResultT, C4962a> fVar, @NonNull Executor executor) {
        this.f55732b = fVar;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.f55733c = cancellationTokenSource;
        this.f55734d = executor;
        fVar.c();
        fVar.a(executor, CallableC5592g.f55737a, cancellationTokenSource.getToken()).addOnFailureListener(C5593h.f55738a);
    }

    @NonNull
    public Task<C5769a> N(@NonNull C4962a c4962a) {
        return c(c4962a);
    }

    @NonNull
    @KeepForSdk
    public final synchronized Task<DetectionResultT> c(@NonNull final C4962a c4962a) {
        Preconditions.checkNotNull(c4962a, "InputImage can not be null");
        if (this.f55731a.get()) {
            return Tasks.forException(new R8.a("This detector is already closed!", 14));
        }
        if (c4962a.e() < 32 || c4962a.d() < 32) {
            return Tasks.forException(new R8.a("InputImage width and height should be at least 32!", 3));
        }
        return this.f55732b.a(this.f55734d, new Callable() { // from class: b9.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5590e.this.d(c4962a);
            }
        }, this.f55733c.getToken());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, W8.a
    @KeepForSdk
    @X(AbstractC5434v.a.ON_DESTROY)
    public synchronized void close() {
        if (this.f55731a.getAndSet(true)) {
            return;
        }
        this.f55733c.cancel();
        this.f55732b.e(this.f55734d);
    }

    final /* synthetic */ Object d(C4962a c4962a) throws Exception {
        zzlx zze = zzlx.zze("detectorTaskWithResource#run");
        zze.zzb();
        try {
            Object h11 = this.f55732b.h(c4962a);
            zze.close();
            return h11;
        } catch (Throwable th2) {
            try {
                zze.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }
}
