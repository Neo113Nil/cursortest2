package E;

import A0.C0016c0;
import h0.C1988b;

/* renamed from: E.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0110o extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1242l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I.O f1243m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0110o(I.O o5, int i) {
        super(1);
        this.f1242l = i;
        this.f1243m = o5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f1242l) {
            case 0:
                return new C0016c0(4, this.f1243m);
            default:
                long j5 = ((C1988b) obj).f17191a;
                this.f1243m.o();
                return W3.o.f6046a;
        }
    }
}
