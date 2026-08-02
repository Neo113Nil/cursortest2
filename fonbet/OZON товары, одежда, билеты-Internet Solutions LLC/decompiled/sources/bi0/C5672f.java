package bi0;

import di0.C6201a;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: bi0.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5672f implements InterfaceC5669c {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.common.cache.b<String, C6201a> f56042a;

    public C5672f() {
        com.google.common.cache.c<Object, Object> c11 = com.google.common.cache.c.c();
        c11.b(100L);
        this.f56042a = c11.a();
    }

    @Override // bi0.InterfaceC5669c
    public final void a() {
        ConcurrentMap<String, C6201a> b11 = this.f56042a.b();
        Intrinsics.f(b11);
        for (Map.Entry<String, C6201a> entry : b11.entrySet()) {
            if (entry.getValue().d()) {
                b11.remove(entry.getKey());
            }
        }
    }

    @Override // bi0.InterfaceC5669c
    @NotNull
    public final C6201a b(@NotNull final C6201a trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        Object e11 = this.f56042a.e(trace.a(), new Callable() { // from class: bi0.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C5672f.this.getClass();
                return new C6201a(trace);
            }
        });
        C6201a c6201a = (C6201a) e11;
        c6201a.g();
        Intrinsics.checkNotNullExpressionValue(e11, "also(...)");
        return c6201a;
    }

    @Override // bi0.InterfaceC5669c
    @NotNull
    public final C6201a beginTrace(@NotNull final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object e11 = this.f56042a.e(name, new Callable() { // from class: bi0.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C5672f.this.getClass();
                return new C6201a(name);
            }
        });
        C6201a c6201a = (C6201a) e11;
        c6201a.g();
        Intrinsics.checkNotNullExpressionValue(e11, "also(...)");
        return c6201a;
    }

    @Override // bi0.InterfaceC5669c
    public final C6201a endTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        C6201a remove = this.f56042a.b().remove(name);
        if (remove == null) {
            return null;
        }
        remove.h();
        return remove;
    }

    @Override // bi0.InterfaceC5669c
    public final C6201a removeTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f56042a.b().remove(name);
    }
}
