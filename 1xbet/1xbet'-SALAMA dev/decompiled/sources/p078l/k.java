package p078l;

import A5.d;
import A5.e;
import A5.f;
import A5.m;
import B4.V;
import P.b0;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.animation.BaseInterpolator;
import androidx.appcompat.widget.i1;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p135s5.a;
import p135s5.i;
import p155w1.C1010l1;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f14861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f14862f;

    public k() {
        this.f14857a = -1L;
        this.f14862f = new i1(this);
        this.f14859c = new ArrayList();
    }

    public void a() {
        if (this.f14858b) {
            Iterator it = ((ArrayList) this.f14859c).iterator();
            while (it.hasNext()) {
                ((b0) it.next()).b();
            }
            this.f14858b = false;
        }
    }

    public void b(a aVar, List list) {
        if (this.f14858b) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        S5.a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            ((FlutterJNI) this.f14859c).runBundleAndSnapshotFromLibrary(aVar.f16187a, aVar.f16189c, aVar.f16188b, (AssetManager) this.f14860d, list, this.f14857a);
            this.f14858b = true;
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

    @Override // A5.f
    public void c(String str, d dVar) {
        ((C1010l1) this.f14862f).c(str, dVar);
    }

    public void d() {
        View view;
        if (this.f14858b) {
            return;
        }
        for (b0 b0Var : (ArrayList) this.f14859c) {
            long j = this.f14857a;
            if (j >= 0) {
                b0Var.c(j);
            }
            BaseInterpolator baseInterpolator = (BaseInterpolator) this.f14860d;
            if (baseInterpolator != null && (view = (View) b0Var.f5049a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (((p097n3.a) this.f14861e) != null) {
                b0Var.d((i1) this.f14862f);
            }
            View view2 = (View) b0Var.f5049a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f14858b = true;
    }

    @Override // A5.f
    public void j(String str, ByteBuffer byteBuffer) {
        ((C1010l1) this.f14862f).j(str, byteBuffer);
    }

    @Override // A5.f
    public void k(String str, ByteBuffer byteBuffer, e eVar) {
        ((C1010l1) this.f14862f).k(str, byteBuffer, eVar);
    }

    @Override // A5.f
    public V m(m mVar) {
        return ((i) ((C1010l1) this.f14862f).f17777a).m(mVar);
    }

    @Override // A5.f
    public void n(String str, d dVar, V v6) {
        ((C1010l1) this.f14862f).n(str, dVar, v6);
    }

    public k(FlutterJNI flutterJNI, AssetManager assetManager, long j) {
        this.f14858b = false;
        C1052y0 c1052y0 = new C1052y0(this, 21);
        this.f14859c = flutterJNI;
        this.f14860d = assetManager;
        this.f14857a = j;
        i iVar = new i(flutterJNI);
        this.f14861e = iVar;
        iVar.n("flutter/isolate", c1052y0, null);
        this.f14862f = new C1010l1(iVar);
        if (flutterJNI.isAttached()) {
            this.f14858b = true;
        }
    }
}
