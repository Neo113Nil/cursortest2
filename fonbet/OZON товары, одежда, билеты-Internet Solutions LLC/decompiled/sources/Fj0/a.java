package Fj0;

import id.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
final class a<T> implements f<Object, T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f9498a;

    /* renamed from: b, reason: collision with root package name */
    private T f9499b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f9498a = (AbstractC7737t) message;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // id.e
    public final T getValue(Object obj, @NotNull m<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        T t2 = this.f9499b;
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException(this.f9498a.invoke().toString());
    }

    @Override // id.f
    public final void setValue(Object obj, @NotNull m<?> property, T t2) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f9499b = t2;
    }
}
