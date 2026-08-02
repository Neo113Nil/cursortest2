package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/J;", "<init>", "()V", "a", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleOwner implements J {

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final ProcessLifecycleOwner f43230i = new ProcessLifecycleOwner();

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f43231j = 0;

    /* renamed from: a, reason: collision with root package name */
    private int f43232a;

    /* renamed from: b, reason: collision with root package name */
    private int f43233b;

    /* renamed from: e, reason: collision with root package name */
    private Handler f43236e;

    /* renamed from: c, reason: collision with root package name */
    private boolean f43234c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f43235d = true;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final L f43237f = new L(this);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final RunnableC5408b0 f43238g = new Runnable() { // from class: androidx.lifecycle.b0
        @Override // java.lang.Runnable
        public final void run() {
            ProcessLifecycleOwner.a(ProcessLifecycleOwner.this);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final c f43239h = new c();

    public static final class a {
        public static final void a(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"androidx/lifecycle/ProcessLifecycleOwner$b", "Landroidx/lifecycle/m;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityCreated", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStopped", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends C5426m {

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/lifecycle/ProcessLifecycleOwner$b$a", "Landroidx/lifecycle/m;", "Landroid/app/Activity;", "activity", "", "onActivityPostStarted", "(Landroid/app/Activity;)V", "onActivityPostResumed", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends C5426m {
            final /* synthetic */ ProcessLifecycleOwner this$0;

            a(ProcessLifecycleOwner processLifecycleOwner) {
                this.this$0 = processLifecycleOwner;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.f();
            }
        }

        b() {
        }

        @Override // androidx.lifecycle.C5426m, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                int i11 = FragmentC5414e0.f43309b;
                Intrinsics.checkNotNullParameter(activity, "<this>");
                Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
                Intrinsics.g(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
                ((FragmentC5414e0) findFragmentByTag).b(ProcessLifecycleOwner.this.f43239h);
            }
        }

        @Override // androidx.lifecycle.C5426m, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ProcessLifecycleOwner.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@NotNull Activity activity, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            a.a(activity, new a(ProcessLifecycleOwner.this));
        }

        @Override // androidx.lifecycle.C5426m, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ProcessLifecycleOwner.this.g();
        }
    }

    public static final class c {
        c() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.b0] */
    private ProcessLifecycleOwner() {
    }

    public static void a(ProcessLifecycleOwner this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i11 = this$0.f43233b;
        L l11 = this$0.f43237f;
        if (i11 == 0) {
            this$0.f43234c = true;
            l11.h(AbstractC5434v.a.ON_PAUSE);
        }
        if (this$0.f43232a == 0 && this$0.f43234c) {
            l11.h(AbstractC5434v.a.ON_STOP);
            this$0.f43235d = true;
        }
    }

    public final void d() {
        int i11 = this.f43233b - 1;
        this.f43233b = i11;
        if (i11 == 0) {
            Handler handler = this.f43236e;
            Intrinsics.f(handler);
            handler.postDelayed(this.f43238g, 700L);
        }
    }

    public final void e() {
        int i11 = this.f43233b + 1;
        this.f43233b = i11;
        if (i11 == 1) {
            if (this.f43234c) {
                this.f43237f.h(AbstractC5434v.a.ON_RESUME);
                this.f43234c = false;
            } else {
                Handler handler = this.f43236e;
                Intrinsics.f(handler);
                handler.removeCallbacks(this.f43238g);
            }
        }
    }

    public final void f() {
        int i11 = this.f43232a + 1;
        this.f43232a = i11;
        if (i11 == 1 && this.f43235d) {
            this.f43237f.h(AbstractC5434v.a.ON_START);
            this.f43235d = false;
        }
    }

    public final void g() {
        int i11 = this.f43232a - 1;
        this.f43232a = i11;
        if (i11 == 0 && this.f43234c) {
            this.f43237f.h(AbstractC5434v.a.ON_STOP);
            this.f43235d = true;
        }
    }

    @Override // androidx.lifecycle.J
    @NotNull
    public final AbstractC5434v getLifecycle() {
        return this.f43237f;
    }

    public final void h(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43236e = new Handler();
        this.f43237f.h(AbstractC5434v.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new b());
    }
}
