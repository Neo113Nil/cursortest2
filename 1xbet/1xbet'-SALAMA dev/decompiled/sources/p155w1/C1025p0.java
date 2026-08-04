package p155w1;

import com.google.android.gms.common.internal.w;

/* JADX INFO: renamed from: w1.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1025p0 extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1034s0 f17826d;

    public C1025p0(C1034s0 c1034s0, int i7, String str, String str2) {
        this.f17826d = c1034s0;
        this.f17823a = i7;
        this.f17824b = str;
        this.f17825c = str2;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        C1034s0 c1034s0 = this.f17826d;
        if (c1034s0.f17859B != null) {
            if (this.f17823a == 200) {
                C1047w1.j(true);
            } else {
                C1047w1.j(false);
            }
        }
        w wVar = c1034s0.f17861D;
        String str = this.f17824b;
        wVar.r(str, this.f17825c);
        c1034s0.f17860C.remove(str);
    }
}
