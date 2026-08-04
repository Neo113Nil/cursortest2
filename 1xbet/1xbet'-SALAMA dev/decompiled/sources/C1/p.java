package C1;

import A1.X;

/* JADX INFO: loaded from: classes.dex */
public final class p extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X f1511c;

    /* JADX WARN: Illegal instructions before constructor call */
    public p(int i7, int i8, int i9, int i10, X x4, boolean z4, RuntimeException runtimeException) {
        StringBuilder sbG = p150v0.a.g("AudioTrack init failed ", i7, " Config(", i8, ", ");
        sbG.append(i9);
        sbG.append(", ");
        sbG.append(i10);
        sbG.append(")");
        sbG.append(z4 ? " (recoverable)" : "");
        super(sbG.toString(), runtimeException);
        this.f1509a = i7;
        this.f1510b = z4;
        this.f1511c = x4;
    }
}
