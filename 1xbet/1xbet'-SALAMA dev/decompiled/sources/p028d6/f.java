package p028d6;

import U5.C0447n;
import U5.M;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f12430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f12431c;

    public /* synthetic */ f(b bVar, M m7, int i7) {
        this.f12429a = i7;
        this.f12431c = bVar;
        this.f12430b = m7;
    }

    @Override // U5.M
    public final void a(C0447n c0447n) {
        switch (this.f12429a) {
            case 0:
                this.f12430b.a(c0447n);
                ((g) this.f12431c).f12433b.a(c0447n);
                break;
            default:
                s sVar = (s) this.f12431c;
                sVar.f12475d = c0447n;
                if (!sVar.f12474c) {
                    this.f12430b.a(c0447n);
                }
                break;
        }
    }
}
