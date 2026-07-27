package io.flutter.embedding.engine.renderer;

import android.os.Build;
import java.util.Iterator;
import w2.AbstractActivityC1515c;
import w2.C1517e;
import w2.m;
import w2.z;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10107b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f10106a = i2;
        this.f10107b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void a() {
        switch (this.f10106a) {
            case 0:
                ((i) this.f10107b).f10148c = false;
                break;
            case 1:
                C1517e c1517e = (C1517e) this.f10107b;
                c1517e.f12133a.getClass();
                c1517e.f12140h = false;
                break;
            case 2:
                m mVar = (m) this.f10107b;
                mVar.f12177h = false;
                Iterator it = mVar.f12176g.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).a();
                }
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void b() {
        switch (this.f10106a) {
            case 0:
                ((i) this.f10107b).f10148c = true;
                break;
            case 1:
                C1517e c1517e = (C1517e) this.f10107b;
                AbstractActivityC1515c abstractActivityC1515c = c1517e.f12133a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC1515c.reportFullyDrawn();
                } else {
                    abstractActivityC1515c.getClass();
                }
                c1517e.f12140h = true;
                c1517e.f12141i = true;
                break;
            case 2:
                m mVar = (m) this.f10107b;
                mVar.f12177h = true;
                Iterator it = mVar.f12176g.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).b();
                }
                break;
            default:
                z zVar = (z) this.f10107b;
                zVar.f12222a.setAlpha(1.0f);
                i iVar = zVar.f12223b;
                if (iVar != null) {
                    iVar.c(this);
                    break;
                }
                break;
        }
    }

    private final void c() {
    }
}
