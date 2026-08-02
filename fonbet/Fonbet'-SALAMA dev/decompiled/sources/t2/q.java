package t2;

import c2.e0;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f16391a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f16392b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16393c;

    public q(int i7, e0 e0Var, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC1664a.l("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f16391a = e0Var;
        this.f16392b = iArr;
        this.f16393c = i7;
    }
}
