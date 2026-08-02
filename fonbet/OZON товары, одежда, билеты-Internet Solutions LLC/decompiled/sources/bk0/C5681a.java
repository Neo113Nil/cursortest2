package bk0;

import Sc.InterfaceC4008j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: bk0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5681a<T> implements InterfaceC4008j<T> {

    /* renamed from: a, reason: collision with root package name */
    private Function0<? extends T> f56086a;

    /* renamed from: b, reason: collision with root package name */
    private volatile T f56087b;

    public C5681a(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f56086a = initializer;
    }

    @Override // Sc.InterfaceC4008j
    public final T getValue() {
        T t2 = this.f56087b;
        if (t2 != null) {
            return t2;
        }
        synchronized (this) {
            try {
                T t11 = this.f56087b;
                if (t11 != null) {
                    return t11;
                }
                Function0<? extends T> function0 = this.f56086a;
                T invoke = function0 != null ? function0.invoke() : null;
                if (invoke != null) {
                    this.f56087b = invoke;
                    this.f56086a = null;
                }
                return invoke;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Sc.InterfaceC4008j
    public final boolean isInitialized() {
        return this.f56087b != null;
    }
}
