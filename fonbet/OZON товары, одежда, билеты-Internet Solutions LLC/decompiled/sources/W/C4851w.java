package W;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import x2.InterfaceC10646a;

/* renamed from: W.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4851w {

    /* renamed from: a, reason: collision with root package name */
    private final Context f33140a;

    /* renamed from: b, reason: collision with root package name */
    private final K f33141b;

    /* renamed from: c, reason: collision with root package name */
    private final r f33142c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC10646a<t0> f33143d;

    /* renamed from: e, reason: collision with root package name */
    private Executor f33144e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33145f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f33146g = false;

    C4851w(@NonNull Context context, @NonNull K k11, @NonNull r rVar) {
        this.f33140a = G.f.a(context);
        this.f33141b = k11;
        this.f33142c = rVar;
    }

    @NonNull
    public final void a() {
        this.f33146g = true;
    }

    @NonNull
    final Context b() {
        return this.f33140a;
    }

    final InterfaceC10646a<t0> c() {
        return this.f33143d;
    }

    final Executor d() {
        return this.f33144e;
    }

    @NonNull
    final AbstractC4849u e() {
        return this.f33142c;
    }

    @NonNull
    final K f() {
        return this.f33141b;
    }

    final boolean g() {
        return this.f33145f;
    }

    final boolean h() {
        return this.f33146g;
    }

    @NonNull
    public final W i(@NonNull Executor executor, @NonNull InterfaceC10646a<t0> interfaceC10646a) {
        x2.i.e(executor, "Listener Executor can't be null.");
        this.f33144e = executor;
        this.f33143d = interfaceC10646a;
        return this.f33141b.P(this);
    }

    @NonNull
    public final void j() {
        if (androidx.core.content.e.a(this.f33140a, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
        }
        x2.i.f("The Recorder this recording is associated to doesn't support audio.", ((AbstractC4847s) K.t(this.f33141b.f32887C)).a().b() != 0);
        this.f33145f = true;
    }
}
