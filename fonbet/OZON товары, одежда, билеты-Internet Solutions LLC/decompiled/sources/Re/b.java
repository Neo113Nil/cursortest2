package Re;

import Le.InterfaceC3583a;
import Le.f;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<kotlin.reflect.d<?>, a> f25034a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<kotlin.reflect.d<?>, Map<kotlin.reflect.d<?>, InterfaceC3583a<?>>> f25035b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<kotlin.reflect.d<?>, Function1<?, f<?>>> f25036c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<kotlin.reflect.d<?>, Map<String, InterfaceC3583a<?>>> f25037d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<kotlin.reflect.d<?>, Function1<String, Object>> f25038e;

    public b(@NotNull Map class2ContextualFactory, @NotNull Map polyBase2Serializers, @NotNull Map polyBase2DefaultSerializerProvider, @NotNull Map polyBase2NamedSerializers, @NotNull Map polyBase2DefaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f25034a = class2ContextualFactory;
        this.f25035b = polyBase2Serializers;
        this.f25036c = polyBase2DefaultSerializerProvider;
        this.f25037d = polyBase2NamedSerializers;
        this.f25038e = polyBase2DefaultDeserializerProvider;
    }

    @Override // Re.c
    public final <T> InterfaceC3583a<T> a(@NotNull kotlin.reflect.d<T> kClass, @NotNull List<? extends InterfaceC3583a<?>> typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        a aVar = this.f25034a.get(kClass);
        InterfaceC3583a<T> a11 = aVar != null ? aVar.a() : null;
        if (a11 != null) {
            return a11;
        }
        return null;
    }

    @Override // Re.c
    public final <T> f<T> b(@NotNull kotlin.reflect.d<? super T> baseClass, @NotNull T value) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(value, "value");
        if (baseClass.A(value)) {
            Map<kotlin.reflect.d<?>, InterfaceC3583a<?>> map = this.f25035b.get(baseClass);
            InterfaceC3583a<?> interfaceC3583a = map != null ? map.get(N.b(value.getClass())) : null;
            if (interfaceC3583a == null) {
                interfaceC3583a = null;
            }
            if (interfaceC3583a != null) {
                return interfaceC3583a;
            }
            Function1<?, f<?>> function1 = this.f25036c.get(baseClass);
            Function1<?, f<?>> function12 = U.h(1, function1) ? function1 : null;
            if (function12 != null) {
                return (f) function12.invoke(value);
            }
        }
        return null;
    }
}
