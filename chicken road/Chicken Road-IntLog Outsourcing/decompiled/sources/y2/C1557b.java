package y2;

import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* renamed from: y2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1557b implements H2.f {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f12346a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager f12347b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12348c;

    /* renamed from: d, reason: collision with root package name */
    public final C1564i f12349d;

    /* renamed from: e, reason: collision with root package name */
    public final V0.j f12350e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12351f;

    public C1557b(FlutterJNI flutterJNI, AssetManager assetManager, long j2) {
        this.f12351f = false;
        U.e eVar = new U.e(this);
        this.f12346a = flutterJNI;
        this.f12347b = assetManager;
        this.f12348c = j2;
        C1564i c1564i = new C1564i(flutterJNI);
        this.f12349d = c1564i;
        c1564i.u("flutter/isolate", eVar, null);
        this.f12350e = new V0.j(28, c1564i);
        if (flutterJNI.isAttached()) {
            this.f12351f = true;
        }
    }

    public final void a(C1556a c1556a, List list) {
        if (this.f12351f) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        O2.a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(c1556a);
            this.f12346a.runBundleAndSnapshotFromLibrary(c1556a.f12343a, c1556a.f12345c, c1556a.f12344b, this.f12347b, list, this.f12348c);
            this.f12351f = true;
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // H2.f
    public final s0.k d(H2.j jVar) {
        return ((C1564i) this.f12350e.f3212b).d(jVar);
    }

    @Override // H2.f
    public final void i(String str, H2.d dVar) {
        this.f12350e.i(str, dVar);
    }

    @Override // H2.f
    public final void o(String str, ByteBuffer byteBuffer) {
        this.f12350e.o(str, byteBuffer);
    }

    @Override // H2.f
    public final void u(String str, H2.d dVar, s0.k kVar) {
        this.f12350e.u(str, dVar, kVar);
    }

    @Override // H2.f
    public final void w(String str, ByteBuffer byteBuffer, H2.e eVar) {
        this.f12350e.w(str, byteBuffer, eVar);
    }
}
