package u0;

import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0840b implements D0.f {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f6697a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager f6698b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6699c;

    /* renamed from: d, reason: collision with root package name */
    public final C0847i f6700d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.editing.a f6701e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6702f;

    public C0840b(FlutterJNI flutterJNI, AssetManager assetManager, long j2) {
        this.f6702f = false;
        io.flutter.plugin.editing.a aVar = new io.flutter.plugin.editing.a(10, this);
        this.f6697a = flutterJNI;
        this.f6698b = assetManager;
        this.f6699c = j2;
        C0847i c0847i = new C0847i(flutterJNI);
        this.f6700d = c0847i;
        c0847i.f("flutter/isolate", aVar, null);
        this.f6701e = new io.flutter.plugin.editing.a(11, c0847i);
        if (flutterJNI.isAttached()) {
            this.f6702f = true;
        }
    }

    public final void a(C0839a c0839a, List list) {
        if (this.f6702f) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        J0.a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(c0839a);
            this.f6697a.runBundleAndSnapshotFromLibrary(c0839a.f6694a, c0839a.f6696c, c0839a.f6695b, this.f6698b, list, this.f6699c);
            this.f6702f = true;
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

    @Override // D0.f
    public final void b(String str, D0.d dVar) {
        this.f6701e.b(str, dVar);
    }

    @Override // D0.f
    public final N.i d(D0.h hVar) {
        return ((C0847i) this.f6701e.f5792b).d(hVar);
    }

    @Override // D0.f
    public final void f(String str, D0.d dVar, N.i iVar) {
        this.f6701e.f(str, dVar, iVar);
    }

    @Override // D0.f
    public final void g(String str, ByteBuffer byteBuffer, D0.e eVar) {
        this.f6701e.g(str, byteBuffer, eVar);
    }
}
