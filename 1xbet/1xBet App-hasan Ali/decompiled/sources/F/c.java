package F;

import W3.o;
import k4.AbstractC2036a;
import kotlin.jvm.internal.m;
import x0.Y;
import x0.Z;

/* loaded from: classes.dex */
public final class c extends m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1511l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1512m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f1513n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1514o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, Z z3, int i5) {
        super(1);
        this.f1511l = 1;
        this.f1512m = i;
        this.f1513n = z3;
        this.f1514o = i5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f1511l) {
            case 0:
                Y.g((Y) obj, this.f1513n, -this.f1512m, -this.f1514o);
                break;
            case 1:
                Y.g((Y) obj, this.f1513n, AbstractC2036a.U((this.f1512m - r0.f20973k) / 2.0f), AbstractC2036a.U((this.f1514o - r0.f20974l) / 2.0f));
                break;
            default:
                Y.g((Y) obj, this.f1513n, this.f1512m, this.f1514o);
                break;
        }
        return o.f6046a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Z z3, int i, int i5, int i6) {
        super(1);
        this.f1511l = i6;
        this.f1513n = z3;
        this.f1512m = i;
        this.f1514o = i5;
    }
}
