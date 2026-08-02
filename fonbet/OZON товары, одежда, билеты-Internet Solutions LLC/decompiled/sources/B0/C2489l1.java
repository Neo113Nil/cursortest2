package B0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import m0.C8004n;
import m0.V;
import ru.ozon.fintech.ui.input.CounterView;

/* renamed from: B0.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2489l1 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f1840a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1841b = 0;

    /* renamed from: B0.l1$a */
    static final class a extends AbstractC7737t implements Function1<V.b<Float>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f1842b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(V.b<Float> bVar) {
            V.b<Float> bVar2 = bVar;
            bVar2.e(1000);
            Float valueOf = Float.valueOf(1.0f);
            bVar2.f(0, valueOf);
            bVar2.f(499, valueOf);
            Float valueOf2 = Float.valueOf(0.0f);
            bVar2.f(CounterView.COUNTER_MAX_DEFAULT, valueOf2);
            bVar2.f(999, valueOf2);
            return Unit.f71690a;
        }
    }

    static {
        C8004n.b(a.f1842b);
        f1840a = 2;
    }

    public static final float a() {
        return f1840a;
    }
}
