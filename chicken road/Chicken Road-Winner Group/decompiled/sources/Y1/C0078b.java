package Y1;

import I1.AbstractActivityC0027d;
import m0.C1116d;

/* renamed from: Y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0078b implements P1.b, Q1.a {

    /* renamed from: a, reason: collision with root package name */
    public I f1669a;

    @Override // Q1.a
    public final void onAttachedToActivity(Q1.b bVar) {
        A0.h hVar = (A0.h) bVar;
        ((AbstractActivityC0027d) hVar.f54b).getIntent().putExtra("PROXY_PACKAGE", "io.flutter.plugins.inapppurchase");
        this.f1669a.f1665c = (AbstractActivityC0027d) hVar.f54b;
    }

    @Override // P1.b
    public final void onAttachedToEngine(P1.a aVar) {
        T1.f fVar = aVar.f1153b;
        I i3 = new I(aVar.f1152a, new b0.i(27, fVar), new C0077a(1));
        this.f1669a = i3;
        I.d(fVar, i3);
    }

    @Override // Q1.a
    public final void onDetachedFromActivity() {
        I i3 = this.f1669a;
        i3.f1665c = null;
        C1116d c1116d = i3.f1663a;
        if (c1116d != null) {
            c1116d.a();
            i3.f1663a = null;
        }
    }

    @Override // Q1.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f1669a.f1665c = null;
    }

    @Override // P1.b
    public final void onDetachedFromEngine(P1.a aVar) {
        I.d(aVar.f1153b, null);
        this.f1669a = null;
    }

    @Override // Q1.a
    public final void onReattachedToActivityForConfigChanges(Q1.b bVar) {
        onAttachedToActivity(bVar);
    }
}
