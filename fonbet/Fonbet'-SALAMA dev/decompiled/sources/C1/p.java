package C1;

import A1.X;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class p extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f1509a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1510b;

    /* renamed from: c, reason: collision with root package name */
    public final X f1511c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(int i7, int i8, int i9, int i10, X x4, boolean z4, RuntimeException runtimeException) {
        super(r5.toString(), runtimeException);
        StringBuilder g3 = AbstractC1663a.g("AudioTrack init failed ", i7, " Config(", i8, ", ");
        g3.append(i9);
        g3.append(", ");
        g3.append(i10);
        g3.append(")");
        g3.append(z4 ? " (recoverable)" : "");
        this.f1509a = i7;
        this.f1510b = z4;
        this.f1511c = x4;
    }
}
