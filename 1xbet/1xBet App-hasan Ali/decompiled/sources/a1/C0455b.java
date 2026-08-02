package a1;

import A0.C0016c0;

/* renamed from: a1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455b extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6379l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f6380m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0455b(u uVar, int i) {
        super(1);
        this.f6379l = i;
        this.f6380m = uVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f6379l) {
            case 0:
                return new C0016c0(6, this.f6380m);
            default:
                u uVar = this.f6380m;
                if (uVar.f6439p.f6429a) {
                    uVar.f6438o.invoke();
                }
                return W3.o.f6046a;
        }
    }
}
