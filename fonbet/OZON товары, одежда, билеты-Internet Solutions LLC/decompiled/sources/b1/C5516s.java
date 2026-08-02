package b1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: b1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5516s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C5517t f55468a = new C5517t(a.f55470b, b.f55471b);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f55469b = 0;

    /* renamed from: b1.s$a */
    static final class a extends AbstractC7737t implements Function2<InterfaceC5518u, Object, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f55470b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC5518u interfaceC5518u, Object obj) {
            return obj;
        }
    }

    /* renamed from: b1.s$b */
    static final class b extends AbstractC7737t implements Function1<Object, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f55471b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(@NotNull Object obj) {
            return obj;
        }
    }

    @NotNull
    public static final C5517t a(@NotNull Function2 function2, @NotNull Function1 function1) {
        return new C5517t(function2, function1);
    }

    @NotNull
    public static final C5517t b() {
        return f55468a;
    }
}
