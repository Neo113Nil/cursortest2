package Qe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final j f23335a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23336b;

    public d(@NotNull j writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f23335a = writer;
        this.f23336b = true;
    }

    public final boolean a() {
        return this.f23336b;
    }

    public void b() {
        this.f23336b = true;
    }

    public void c() {
        this.f23336b = false;
    }

    public void d() {
        this.f23336b = false;
    }

    public void e(byte b11) {
        this.f23335a.e(b11);
    }

    public final void f(char c11) {
        this.f23335a.d(c11);
    }

    public void g(int i11) {
        this.f23335a.e(i11);
    }

    public void h(long j11) {
        this.f23335a.e(j11);
    }

    public final void i(@NotNull String v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        this.f23335a.c(v11);
    }

    public void j(short s11) {
        this.f23335a.e(s11);
    }

    public void k(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f23335a.f(value);
    }

    public void l() {
    }

    public void m() {
    }
}
