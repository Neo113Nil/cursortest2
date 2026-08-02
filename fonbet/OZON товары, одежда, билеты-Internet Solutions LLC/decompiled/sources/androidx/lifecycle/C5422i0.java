package androidx.lifecycle;

import androidx.lifecycle.AbstractC5434v;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.lifecycle.i0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5422i0 implements G, Closeable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f43325a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C5418g0 f43326b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f43327c;

    public C5422i0(@NotNull C5418g0 handle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f43325a = key;
        this.f43326b = handle;
    }

    public final void c(@NotNull M4.c registry, @NotNull AbstractC5434v lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f43327c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f43327c = true;
        lifecycle.a(this);
        registry.g(this.f43325a, this.f43326b.f());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @NotNull
    public final C5418g0 d() {
        return this.f43326b;
    }

    public final boolean j() {
        return this.f43327c;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(@NotNull J source, @NotNull AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC5434v.a.ON_DESTROY) {
            this.f43327c = false;
            source.getLifecycle().e(this);
        }
    }
}
