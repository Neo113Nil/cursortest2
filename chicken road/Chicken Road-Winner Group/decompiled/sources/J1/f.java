package J1;

import io.flutter.embedding.engine.FlutterEngine;

/* loaded from: classes.dex */
public final class f implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlutterEngine f719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f720b;

    public f(h hVar, FlutterEngine flutterEngine) {
        this.f720b = hVar;
        this.f719a = flutterEngine;
    }

    @Override // J1.b
    public final void a() {
        this.f720b.f726a.remove(this.f719a);
    }

    @Override // J1.b
    public final void b() {
    }
}
