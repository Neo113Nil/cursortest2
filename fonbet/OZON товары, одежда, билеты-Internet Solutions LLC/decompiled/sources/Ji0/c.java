package Ji0;

import fj0.e;
import ij0.InterfaceC7088c;
import java.util.Comparator;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vi0.AbstractC10323a;

/* loaded from: classes3.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final fj0.d<? extends Object>[] f14813c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final fj0.d<?>[] f14814d;

    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t2, T t11) {
            return Vc.a.b(Boolean.valueOf(!(((fj0.d) t2) instanceof e)), Boolean.valueOf(!(((fj0.d) t11) instanceof e)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull InterfaceC7088c loadConfiguration) {
        super(loadConfiguration);
        Intrinsics.checkNotNullParameter(loadConfiguration, "loadConfiguration");
        fj0.d<? extends Object>[] dVarArr = {AbstractC10323a.f.f102988c, AbstractC10323a.d.f102986c, AbstractC10323a.h.f102990c};
        this.f14813c = dVarArr;
        fj0.d<?>[] dVarArr2 = (fj0.d[]) C7705l.V(super.a(), dVarArr);
        if (dVarArr2.length > 1) {
            C7705l.a0(dVarArr2, new a());
        }
        this.f14814d = dVarArr2;
    }

    @Override // Ji0.b
    @NotNull
    protected final fj0.d<?>[] a() {
        return this.f14814d;
    }
}
