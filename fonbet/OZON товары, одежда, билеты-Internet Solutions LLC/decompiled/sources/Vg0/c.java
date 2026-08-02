package Vg0;

import Sc.k;
import Sc.n;
import android.content.Intent;
import androidx.lifecycle.w0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f32793a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Rg0.c f32794b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f32795c;

    /* renamed from: d, reason: collision with root package name */
    private final Intent f32796d;

    static final class a extends AbstractC7737t implements Function0<List<? extends Intent>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Intent> invoke() {
            c cVar = c.this;
            return cVar.f32794b.e(cVar.f32793a);
        }
    }

    public c(Rg0.c interactor, String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f32793a = applicationId;
        this.f32794b = interactor;
        this.f32795c = k.a(n.NONE, new a());
        this.f32796d = interactor.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final List<Intent> f0() {
        return (List) this.f32795c.getValue();
    }

    public final Intent g0() {
        return this.f32796d;
    }

    public final void h0() {
        this.f32794b.g();
    }
}
