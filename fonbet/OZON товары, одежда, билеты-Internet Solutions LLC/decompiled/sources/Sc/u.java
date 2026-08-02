package Sc;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LSc/u;", "T", "LSc/j;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class u<T> implements InterfaceC4008j<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Function0<? extends T> f26112a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f26113b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f26114c;

    public u(Object obj, @NotNull Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f26112a = initializer;
        this.f26113b = E.f26093a;
        this.f26114c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new C4004f(getValue());
    }

    @Override // Sc.InterfaceC4008j
    public final T getValue() {
        T t2;
        T t11 = (T) this.f26113b;
        E e11 = E.f26093a;
        if (t11 != e11) {
            return t11;
        }
        synchronized (this.f26114c) {
            t2 = (T) this.f26113b;
            if (t2 == e11) {
                Function0<? extends T> function0 = this.f26112a;
                Intrinsics.f(function0);
                t2 = function0.invoke();
                this.f26113b = t2;
                this.f26112a = null;
            }
        }
        return t2;
    }

    @Override // Sc.InterfaceC4008j
    public final boolean isInitialized() {
        return this.f26113b != E.f26093a;
    }

    @NotNull
    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ u(Function0 function0, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 2) != 0 ? null : obj, function0);
    }
}
