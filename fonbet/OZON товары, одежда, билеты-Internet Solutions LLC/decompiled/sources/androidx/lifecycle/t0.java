package androidx.lifecycle;

import Sc.InterfaceC4003e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class t0 {

    static final class a implements W, InterfaceC7732n {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ AbstractC7737t f43388a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f43388a = (AbstractC7737t) function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof W) && (obj instanceof InterfaceC7732n)) {
                return this.f43388a.equals(((InterfaceC7732n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC7732n
        @NotNull
        public final InterfaceC4003e<?> getFunctionDelegate() {
            return this.f43388a;
        }

        public final int hashCode() {
            return this.f43388a.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
        @Override // androidx.lifecycle.W
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43388a.invoke(obj);
        }
    }

    @NotNull
    public static final T a(@NotNull T t2) {
        T t11;
        Intrinsics.checkNotNullParameter(t2, "<this>");
        kotlin.jvm.internal.I i11 = new kotlin.jvm.internal.I();
        i11.f71783a = true;
        if (t2.isInitialized()) {
            i11.f71783a = false;
            t11 = new T(t2.getValue());
        } else {
            t11 = new T();
        }
        t11.a(t2, new a(new r0(t11, i11)));
        return t11;
    }

    @NotNull
    public static final T b(@NotNull P p11, @NotNull Function1 transform) {
        Intrinsics.checkNotNullParameter(p11, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        T t2 = p11.isInitialized() ? new T(transform.invoke(p11.getValue())) : new T();
        t2.a(p11, new a(new s0(t2, transform)));
        return t2;
    }

    @NotNull
    public static final T c(@NotNull T t2, @NotNull Function1 transform) {
        T t11;
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        if (t2.isInitialized()) {
            P p11 = (P) transform.invoke(t2.getValue());
            t11 = (p11 == null || !p11.isInitialized()) ? new T() : new T(p11.getValue());
        } else {
            t11 = new T();
        }
        t11.a(t2, new a(new v0(transform, m11, t11)));
        return t11;
    }
}
