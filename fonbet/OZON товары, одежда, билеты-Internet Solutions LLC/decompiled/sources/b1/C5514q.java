package b1;

import S0.B1;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: b1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5514q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final B1 f55465a = new B1(a.f55467b);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f55466b = 0;

    /* renamed from: b1.q$a */
    static final class a extends AbstractC7737t implements Function0<InterfaceC5512o> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f55467b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ InterfaceC5512o invoke() {
            return null;
        }
    }

    @NotNull
    public static final InterfaceC5512o a(Map<String, ? extends List<? extends Object>> map, @NotNull Function1<Object, Boolean> function1) {
        return new C5513p(map, function1);
    }

    @NotNull
    public static final B1 b() {
        return f55465a;
    }
}
