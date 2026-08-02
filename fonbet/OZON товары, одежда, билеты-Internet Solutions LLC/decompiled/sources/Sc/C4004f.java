package Sc;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* renamed from: Sc.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4004f<T> implements InterfaceC4008j<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final T f26097a;

    public C4004f(T t2) {
        this.f26097a = t2;
    }

    @Override // Sc.InterfaceC4008j
    public final T getValue() {
        return this.f26097a;
    }

    @Override // Sc.InterfaceC4008j
    public final boolean isInitialized() {
        return true;
    }

    @NotNull
    public final String toString() {
        return String.valueOf(this.f26097a);
    }
}
