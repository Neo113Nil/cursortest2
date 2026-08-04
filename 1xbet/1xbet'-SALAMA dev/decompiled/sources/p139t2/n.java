package p139t2;

import A1.X;
import p018c2.e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f16373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X f16375d;

    public n(int i7, e0 e0Var, int i8) {
        this.f16372a = i7;
        this.f16373b = e0Var;
        this.f16374c = i8;
        this.f16375d = e0Var.f10344d[i8];
    }

    public abstract int a();

    public abstract boolean b(n nVar);
}
