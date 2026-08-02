package A;

import java.util.List;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: m, reason: collision with root package name */
    public static final r f97m = new r(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final r f98n = new r(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f99l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, int i5) {
        super(i);
        this.f99l = i5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f99l) {
            case 0:
                return W3.o.f6046a;
            case 1:
                List list = (List) obj;
                return new E(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            default:
                ((Number) obj).intValue();
                return null;
        }
    }
}
