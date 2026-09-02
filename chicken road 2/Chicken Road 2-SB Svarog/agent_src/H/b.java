package H;

import F.t;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements P.f {

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f220b;

    /* renamed from: c, reason: collision with root package name */
    public final AssetManager f221c;

    /* renamed from: d, reason: collision with root package name */
    public final long f222d;

    /* renamed from: e, reason: collision with root package name */
    public final j f223e;

    /* renamed from: f, reason: collision with root package name */
    public final t f224f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f225g;

    public b(FlutterJNI flutterJNI, AssetManager assetManager, long j2) {
        this.f225g = false;
        C.b bVar = new C.b(3, this);
        this.f220b = flutterJNI;
        this.f221c = assetManager;
        this.f222d = j2;
        j jVar = new j(flutterJNI);
        this.f223e = jVar;
        jVar.j("flutter/isolate", bVar, null);
        this.f224f = new t(2, jVar);
        if (flutterJNI.isAttached()) {
            this.f225g = true;
        }
    }

    public final void a(a aVar, List list) {
        if (this.f225g) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        V.a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            this.f220b.runBundleAndSnapshotFromLibrary(aVar.f217a, aVar.f219c, aVar.f218b, this.f221c, list, this.f222d);
            this.f225g = true;
            Trace.endSection();
        } finally {
        }
    }

    @Override // P.f
    public final void b(String str, ByteBuffer byteBuffer, P.e eVar) {
        this.f224f.b(str, byteBuffer, eVar);
    }

    @Override // P.f
    public final C.b c(P.h hVar) {
        return ((j) this.f224f.f114c).c(hVar);
    }

    @Override // P.f
    public final void i(String str, P.d dVar) {
        this.f224f.i(str, dVar);
    }

    @Override // P.f
    public final void j(String str, P.d dVar, C.b bVar) {
        this.f224f.j(str, dVar, bVar);
    }
}
