package S0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.k0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3968k0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3964i0<Object> f25428a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f25429b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3988v f25430c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3947c1 f25431d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3945c f25432e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private Object f25433f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final A0 f25434g;

    public C3968k0(@NotNull C3964i0 c3964i0, Object obj, @NotNull C3988v c3988v, @NotNull C3947c1 c3947c1, @NotNull C3945c c3945c, @NotNull List list, @NotNull A0 a02) {
        this.f25428a = c3964i0;
        this.f25429b = obj;
        this.f25430c = c3988v;
        this.f25431d = c3947c1;
        this.f25432e = c3945c;
        this.f25433f = list;
        this.f25434g = a02;
    }

    @NotNull
    public final C3945c a() {
        return this.f25432e;
    }

    @NotNull
    public final G b() {
        return this.f25430c;
    }

    @NotNull
    public final C3964i0<Object> c() {
        return this.f25428a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<kotlin.Pair<S0.J0, java.lang.Object>>] */
    @NotNull
    public final List<Pair<J0, Object>> d() {
        return this.f25433f;
    }

    @NotNull
    public final A0 e() {
        return this.f25434g;
    }

    public final Object f() {
        return this.f25429b;
    }

    @NotNull
    public final C3947c1 g() {
        return this.f25431d;
    }

    public final void h(@NotNull ArrayList arrayList) {
        this.f25433f = arrayList;
    }
}
