package Y3;

import android.content.Context;
import p048g4.r;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements N4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7656c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f7654a = i7;
        this.f7655b = obj;
        this.f7656c = obj2;
    }

    @Override // N4.b
    public final Object get() {
        switch (this.f7654a) {
            case 0:
                i iVar = (i) this.f7655b;
                return new O4.a((Context) this.f7656c, iVar.g(), (A4.b) iVar.f7666d.a(A4.b.class));
            default:
                p048g4.f fVar = (p048g4.f) this.f7655b;
                fVar.getClass();
                p048g4.a aVar = (p048g4.a) this.f7656c;
                return aVar.f13194f.e(new r(aVar, fVar));
        }
    }
}
