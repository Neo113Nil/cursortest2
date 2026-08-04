package p139t2;

import p018c2.e0;
import p151v2.a;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f16397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f16398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16399c;

    public q(int i7, e0 e0Var, int[] iArr) {
        if (iArr.length == 0) {
            a.l("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f16397a = e0Var;
        this.f16398b = iArr;
        this.f16399c = i7;
    }
}
