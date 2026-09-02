package R0;

/* loaded from: classes.dex */
public final class b implements a1.f {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.FlutterJNI f1654a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.res.AssetManager f1655b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1656c;

    /* renamed from: d, reason: collision with root package name */
    public final R0.i f1657d;

    /* renamed from: e, reason: collision with root package name */
    public final C.j f1658e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1659f;

    public b(io.flutter.embedding.engine.FlutterJNI flutterJNI, android.content.res.AssetManager assetManager, long j2) {
        this.f1659f = false;
        C.j jVar = new C.j(19, this);
        this.f1654a = flutterJNI;
        this.f1655b = assetManager;
        this.f1656c = j2;
        R0.i iVar = new R0.i(flutterJNI);
        this.f1657d = iVar;
        iVar.j("flutter/isolate", jVar, null);
        this.f1658e = new C.j(20, iVar);
        if (flutterJNI.isAttached()) {
            this.f1659f = true;
        }
    }

    public final void a(R0.a aVar, java.util.List list) {
        if (this.f1659f) {
            android.util.Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        g1.AbstractC0130a.b("DartExecutor#executeDartEntrypoint");
        try {
            java.util.Objects.toString(aVar);
            this.f1654a.runBundleAndSnapshotFromLibrary(aVar.f1651a, aVar.f1653c, aVar.f1652b, this.f1655b, list, this.f1656c);
            this.f1659f = true;
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th) {
            try {
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // a1.f
    public final void c(java.lang.String str, java.nio.ByteBuffer byteBuffer, a1.e eVar) {
        this.f1658e.c(str, byteBuffer, eVar);
    }

    @Override // a1.f
    public final m0.j f(a1.i iVar) {
        return ((R0.i) this.f1658e.f88b).f(iVar);
    }

    @Override // a1.f
    public final void h(java.lang.String str, a1.InterfaceC0064d interfaceC0064d) {
        this.f1658e.h(str, interfaceC0064d);
    }

    @Override // a1.f
    public final void j(java.lang.String str, a1.InterfaceC0064d interfaceC0064d, m0.j jVar) {
        this.f1658e.j(str, interfaceC0064d, jVar);
    }
}
