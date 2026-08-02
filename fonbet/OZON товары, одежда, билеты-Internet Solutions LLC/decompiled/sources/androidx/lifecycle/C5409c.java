package androidx.lifecycle;

import nc.C8486a;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5409c implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8486a f43260a = new C8486a();

    @NotNull
    public final C8486a c() {
        return this.f43260a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f43260a.dispose();
    }
}
