package androidx.compose.ui.platform;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class K1 implements D1.y0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f40709a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f40710b;

    /* renamed from: c, reason: collision with root package name */
    private Float f40711c = null;

    /* renamed from: d, reason: collision with root package name */
    private Float f40712d = null;

    /* renamed from: e, reason: collision with root package name */
    private I1.j f40713e = null;

    /* renamed from: f, reason: collision with root package name */
    private I1.j f40714f = null;

    public K1(int i11, @NotNull ArrayList arrayList) {
        this.f40709a = i11;
        this.f40710b = arrayList;
    }

    public final I1.j a() {
        return this.f40713e;
    }

    public final Float b() {
        return this.f40711c;
    }

    public final Float c() {
        return this.f40712d;
    }

    public final int d() {
        return this.f40709a;
    }

    public final I1.j e() {
        return this.f40714f;
    }

    public final void f(I1.j jVar) {
        this.f40713e = jVar;
    }

    public final void g(Float f7) {
        this.f40711c = f7;
    }

    public final void h(Float f7) {
        this.f40712d = f7;
    }

    public final void i(I1.j jVar) {
        this.f40714f = jVar;
    }

    @Override // D1.y0
    public final boolean m0() {
        return this.f40710b.contains(this);
    }
}
