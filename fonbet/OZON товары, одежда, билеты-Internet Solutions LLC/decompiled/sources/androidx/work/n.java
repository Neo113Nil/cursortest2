package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.NonNull;
import h5.C6801B;
import i5.InterfaceC7008a;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class n {

    @NonNull
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;

    @NonNull
    private WorkerParameters mWorkerParams;

    /* loaded from: classes8.dex */
    public static abstract class a {

        /* renamed from: androidx.work.n$a$a, reason: collision with other inner class name */
        public static final class C0823a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final e f45544a = e.f45282c;

            @NonNull
            public final e c() {
                return this.f45544a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0823a.class != obj.getClass()) {
                    return false;
                }
                return this.f45544a.equals(((C0823a) obj).f45544a);
            }

            public final int hashCode() {
                return this.f45544a.hashCode() + (C0823a.class.getName().hashCode() * 31);
            }

            @NonNull
            public final String toString() {
                return "Failure {mOutputData=" + this.f45544a + '}';
            }
        }

        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            @NonNull
            public final String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            private final e f45545a;

            public c() {
                this(e.f45282c);
            }

            @NonNull
            public final e c() {
                return this.f45545a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f45545a.equals(((c) obj).f45545a);
            }

            public final int hashCode() {
                return this.f45545a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            @NonNull
            public final String toString() {
                return "Success {mOutputData=" + this.f45545a + '}';
            }

            public c(@NonNull e eVar) {
                this.f45545a = eVar;
            }
        }

        a() {
        }

        @NonNull
        public static C0823a a() {
            return new C0823a();
        }

        @NonNull
        public static c b() {
            return new c();
        }
    }

    public n(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    @NonNull
    public com.google.common.util.concurrent.m<h> getForegroundInfoAsync() {
        androidx.work.impl.utils.futures.c k11 = androidx.work.impl.utils.futures.c.k();
        k11.l(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return k11;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.c();
    }

    @NonNull
    public final e getInputData() {
        return this.mWorkerParams.d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.g();
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.h();
    }

    @NonNull
    public InterfaceC7008a getTaskExecutor() {
        return this.mWorkerParams.i();
    }

    @NonNull
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.j();
    }

    @NonNull
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.k();
    }

    @NonNull
    public z getWorkerFactory() {
        return this.mWorkerParams.l();
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    @NonNull
    public final com.google.common.util.concurrent.m<Void> setForegroundAsync(@NonNull h hVar) {
        return ((h5.z) this.mWorkerParams.b()).a(getApplicationContext(), getId(), hVar);
    }

    @NonNull
    public com.google.common.util.concurrent.m<Void> setProgressAsync(@NonNull e eVar) {
        u f7 = this.mWorkerParams.f();
        getApplicationContext();
        return ((C6801B) f7).a(getId(), eVar);
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    @NonNull
    public abstract com.google.common.util.concurrent.m<a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
