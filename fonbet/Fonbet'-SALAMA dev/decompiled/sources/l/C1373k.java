package l;

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
import n3.AbstractC1464a;
import s5.C1599a;
import w1.C1719l1;
import w1.C1761y0;

/* renamed from: l.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1373k implements A5.f {

    /* renamed from: a, reason: collision with root package name */
    public long f14851a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14852b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14853c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14854d;

    /* renamed from: e, reason: collision with root package name */
    public Object f14855e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14856f;

    public C1373k() {
        this.f14851a = -1L;
        this.f14856f = new i1(this);
        this.f14853c = new ArrayList();
    }

    public void a() {
        if (this.f14852b) {
            Iterator it = ((ArrayList) this.f14853c).iterator();
            while (it.hasNext()) {
                ((b0) it.next()).b();
            }
            this.f14852b = false;
        }
    }

    public void b(C1599a c1599a, List list) {
        if (this.f14852b) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        S5.a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(c1599a);
            ((FlutterJNI) this.f14853c).runBundleAndSnapshotFromLibrary(c1599a.f16181a, c1599a.f16183c, c1599a.f16182b, (AssetManager) this.f14854d, list, this.f14851a);
            this.f14852b = true;
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
    public void c(String str, A5.d dVar) {
        ((C1719l1) this.f14856f).c(str, dVar);
    }

    public void d() {
        View view;
        if (this.f14852b) {
            return;
        }
        Iterator it = ((ArrayList) this.f14853c).iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            long j = this.f14851a;
            if (j >= 0) {
                b0Var.c(j);
            }
            BaseInterpolator baseInterpolator = (BaseInterpolator) this.f14854d;
            if (baseInterpolator != null && (view = (View) b0Var.f5049a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (((AbstractC1464a) this.f14855e) != null) {
                b0Var.d((i1) this.f14856f);
            }
            View view2 = (View) b0Var.f5049a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f14852b = true;
    }

    @Override // A5.f
    public void j(String str, ByteBuffer byteBuffer) {
        ((C1719l1) this.f14856f).j(str, byteBuffer);
    }

    @Override // A5.f
    public void k(String str, ByteBuffer byteBuffer, A5.e eVar) {
        ((C1719l1) this.f14856f).k(str, byteBuffer, eVar);
    }

    @Override // A5.f
    public V m(A5.m mVar) {
        return ((s5.i) ((C1719l1) this.f14856f).f17771a).m(mVar);
    }

    @Override // A5.f
    public void n(String str, A5.d dVar, V v6) {
        ((C1719l1) this.f14856f).n(str, dVar, v6);
    }

    public C1373k(FlutterJNI flutterJNI, AssetManager assetManager, long j) {
        this.f14852b = false;
        C1761y0 c1761y0 = new C1761y0(this, 21);
        this.f14853c = flutterJNI;
        this.f14854d = assetManager;
        this.f14851a = j;
        s5.i iVar = new s5.i(flutterJNI);
        this.f14855e = iVar;
        iVar.n("flutter/isolate", c1761y0, null);
        this.f14856f = new C1719l1(iVar);
        if (flutterJNI.isAttached()) {
            this.f14852b = true;
        }
    }
}
