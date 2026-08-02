package A0;

import android.view.View;

/* loaded from: classes.dex */
public final class A extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f148l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f149m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(int i, int i5) {
        super(1);
        this.f148l = i5;
        this.f149m = i;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f148l) {
            case 0:
                return Boolean.valueOf(((g0.s) obj).C0(this.f149m));
            case 1:
                return Boolean.valueOf(((View) obj).getId() == this.f149m);
            default:
                return Boolean.valueOf(((g0.s) obj).C0(this.f149m));
        }
    }
}
