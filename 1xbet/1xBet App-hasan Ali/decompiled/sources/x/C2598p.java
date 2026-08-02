package x;

/* renamed from: x.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2598p implements U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2600q f20846a;

    public C2598p(C2600q c2600q) {
        this.f20846a = c2600q;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // x.U
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        C2600q c2600q = this.f20846a;
        float floatValue = ((Number) c2600q.f20848a.c(Float.valueOf(f))).floatValue();
        c2600q.f20852e.setValue(Boolean.valueOf(floatValue > 0.0f));
        c2600q.f.setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
