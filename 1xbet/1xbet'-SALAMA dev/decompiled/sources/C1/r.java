package C1;

import A1.X;

/* JADX INFO: loaded from: classes.dex */
public final class r extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X f1514c;

    public r(int i7, X x4, boolean z4) {
        super(p031e1.k.d(i7, "AudioTrack write failed: "));
        this.f1513b = z4;
        this.f1512a = i7;
        this.f1514c = x4;
    }
}
