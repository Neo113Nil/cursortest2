package G0;

import W3.o;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class d extends m implements i4.c {

    /* renamed from: m, reason: collision with root package name */
    public static final d f1789m = new d(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final d f1790n = new d(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final d f1791o = new d(1, 2);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1792l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, int i5) {
        super(i);
        this.f1792l = i5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f1792l) {
            case 0:
                ((Number) obj).longValue();
                return o.f6046a;
            case 1:
                return Integer.valueOf(((k) obj).f1809b);
            default:
                W0.k kVar = ((k) obj).f1810c;
                return Integer.valueOf(kVar.f6014d - kVar.f6012b);
        }
    }
}
