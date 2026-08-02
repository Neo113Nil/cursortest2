package Ji0;

import fj0.e;
import ij0.InterfaceC7088c;
import java.util.Comparator;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vi0.AbstractC10323a;

/* loaded from: classes3.dex */
public final class d extends b {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final fj0.d<?>[] f14815c;

    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t2, T t11) {
            return Vc.a.b(Boolean.valueOf(!(((fj0.d) t2) instanceof e)), Boolean.valueOf(!(((fj0.d) t11) instanceof e)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull InterfaceC7088c loadConfiguration) {
        super(loadConfiguration);
        Intrinsics.checkNotNullParameter(loadConfiguration, "loadConfiguration");
        Tc.b builder = C7714v.B();
        builder.add(AbstractC10323a.k.f102993c);
        builder.add(AbstractC10323a.i.f102991c);
        C7714v.r(builder, super.a());
        builder.add(AbstractC10323a.e.f102987c);
        builder.add(AbstractC10323a.c.f102985c);
        Intrinsics.checkNotNullParameter(builder, "builder");
        fj0.d<?>[] dVarArr = (fj0.d[]) builder.B().toArray(new fj0.d[0]);
        if (dVarArr.length > 1) {
            C7705l.a0(dVarArr, new a());
        }
        this.f14815c = dVarArr;
    }

    @Override // Ji0.b
    @NotNull
    protected final fj0.d<?>[] a() {
        return this.f14815c;
    }
}
