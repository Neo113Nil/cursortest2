package K1;

import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import b2.AbstractC0164a;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements T1.f {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f921a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager f922b;

    /* renamed from: c, reason: collision with root package name */
    public final long f923c;

    /* renamed from: d, reason: collision with root package name */
    public final i f924d;

    /* renamed from: e, reason: collision with root package name */
    public final J1.i f925e;
    public boolean f;

    public b(FlutterJNI flutterJNI, AssetManager assetManager, long j3) {
        this.f = false;
        b0.i iVar = new b0.i(7, this);
        this.f921a = flutterJNI;
        this.f922b = assetManager;
        this.f923c = j3;
        i iVar2 = new i(flutterJNI);
        this.f924d = iVar2;
        iVar2.o("flutter/isolate", iVar, null);
        this.f925e = new J1.i(8, iVar2);
        if (flutterJNI.isAttached()) {
            this.f = true;
        }
    }

    public final void a(a aVar, List list) {
        if (this.f) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        AbstractC0164a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            this.f921a.runBundleAndSnapshotFromLibrary(aVar.f918a, aVar.f920c, aVar.f919b, this.f922b, list, this.f923c);
            this.f = true;
            Trace.endSection();
        } finally {
        }
    }

    @Override // T1.f
    public final void h(String str, T1.d dVar) {
        this.f925e.h(str, dVar);
    }

    @Override // T1.f
    public final void i(String str, ByteBuffer byteBuffer, T1.e eVar) {
        this.f925e.i(str, byteBuffer, eVar);
    }

    @Override // T1.f
    public final P0.j j(T1.j jVar) {
        return ((i) this.f925e.f729b).j(jVar);
    }

    @Override // T1.f
    public final void k(String str, ByteBuffer byteBuffer) {
        this.f925e.k(str, byteBuffer);
    }

    @Override // T1.f
    public final void o(String str, T1.d dVar, P0.j jVar) {
        this.f925e.o(str, dVar, jVar);
    }
}
