package G0;

import A.B;
import A0.AbstractC0039k;
import A0.F;
import G.r;
import G4.l;
import H0.n;
import P.AbstractC0329z;
import P.C0305m0;
import W3.o;
import a.AbstractC0444a;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import e2.C1930k;
import java.util.function.Consumer;
import k4.AbstractC2036a;
import p4.AbstractC2282w;
import p4.C2285z;
import p4.e0;

/* loaded from: classes.dex */
public final class f implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final n f1796a;

    /* renamed from: b, reason: collision with root package name */
    public final W0.k f1797b;

    /* renamed from: c, reason: collision with root package name */
    public final C1930k f1798c;

    /* renamed from: d, reason: collision with root package name */
    public final F f1799d;

    /* renamed from: e, reason: collision with root package name */
    public final u4.c f1800e;
    public final i f;

    public f(n nVar, W0.k kVar, u4.c cVar, C1930k c1930k, F f) {
        this.f1796a = nVar;
        this.f1797b = kVar;
        this.f1798c = c1930k;
        this.f1799d = f;
        this.f1800e = new u4.c(cVar.f20083k.m(g.f1801k));
        this.f = new i(kVar.f6014d - kVar.f6012b, new e(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        if (r9 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, ScrollCaptureSession scrollCaptureSession, W0.k kVar, AbstractC0542c abstractC0542c) {
        c cVar;
        EnumC0510a enumC0510a;
        int i;
        int i5;
        int i6;
        d dVar;
        ScrollCaptureSession scrollCaptureSession2;
        W0.k kVar2;
        int i7;
        int i8;
        int t5;
        int t6;
        Surface surface;
        Surface surface2;
        Surface surface3;
        if (abstractC0542c instanceof c) {
            cVar = (c) abstractC0542c;
            int i9 = cVar.f1788q;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                cVar.f1788q = i9 - Integer.MIN_VALUE;
                Object obj = cVar.f1786o;
                enumC0510a = EnumC0510a.f7289k;
                i = cVar.f1788q;
                if (i != 0) {
                    l.N(obj);
                    i5 = kVar.f6012b;
                    i iVar = fVar.f;
                    cVar.f1782k = scrollCaptureSession;
                    cVar.f1783l = kVar;
                    cVar.f1784m = i5;
                    i6 = kVar.f6014d;
                    cVar.f1785n = i6;
                    cVar.f1788q = 1;
                    if (i5 > i6) {
                        iVar.getClass();
                        throw new IllegalArgumentException(("Expected min=" + i5 + " ≤ max=" + i6).toString());
                    }
                    int i10 = i6 - i5;
                    int i11 = iVar.f1805a;
                    if (i10 > i11) {
                        throw new IllegalArgumentException(L1.a.k(i10, i11, "Expected range (", ") to be ≤ viewportSize=").toString());
                    }
                    float f = i5;
                    float f5 = iVar.f1806b;
                    Object obj2 = o.f6046a;
                    if (f < f5 || i6 > i11 + f5) {
                        Object b3 = iVar.b((f < f5 ? i5 : i6 - i11) - f5, cVar);
                        if (b3 != enumC0510a) {
                            b3 = obj2;
                        }
                        if (b3 == enumC0510a) {
                            obj2 = b3;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i8 = cVar.f1785n;
                        i7 = cVar.f1784m;
                        kVar2 = cVar.f1783l;
                        scrollCaptureSession2 = AbstractC0039k.n(cVar.f1782k);
                        l.N(obj);
                        i iVar2 = fVar.f;
                        t5 = AbstractC0444a.t(i7 - AbstractC2036a.U(iVar2.f1806b), 0, iVar2.f1805a);
                        i iVar3 = fVar.f;
                        t6 = AbstractC0444a.t(i8 - AbstractC2036a.U(iVar3.f1806b), 0, iVar3.f1805a);
                        int i12 = kVar2.f6011a;
                        if (t5 != t6) {
                            return W0.k.f6010e;
                        }
                        surface = scrollCaptureSession2.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-i12, -t5);
                            W0.k kVar3 = fVar.f1797b;
                            lockHardwareCanvas.translate(-kVar3.f6011a, -kVar3.f6012b);
                            fVar.f1799d.getRootView().draw(lockHardwareCanvas);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            int U4 = AbstractC2036a.U(fVar.f.f1806b);
                            return new W0.k(i12, t5 + U4, kVar2.f6013c, t6 + U4);
                        } catch (Throwable th) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i13 = cVar.f1785n;
                    int i14 = cVar.f1784m;
                    W0.k kVar4 = cVar.f1783l;
                    ScrollCaptureSession n5 = AbstractC0039k.n(cVar.f1782k);
                    l.N(obj);
                    i6 = i13;
                    i5 = i14;
                    kVar = kVar4;
                    scrollCaptureSession = n5;
                }
                dVar = d.f1789m;
                cVar.f1782k = scrollCaptureSession;
                cVar.f1783l = kVar;
                cVar.f1784m = i5;
                cVar.f1785n = i6;
                cVar.f1788q = 2;
                if (AbstractC0329z.q(cVar.getContext()).n(dVar, cVar) != enumC0510a) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    kVar2 = kVar;
                    i7 = i5;
                    i8 = i6;
                    i iVar22 = fVar.f;
                    t5 = AbstractC0444a.t(i7 - AbstractC2036a.U(iVar22.f1806b), 0, iVar22.f1805a);
                    i iVar32 = fVar.f;
                    t6 = AbstractC0444a.t(i8 - AbstractC2036a.U(iVar32.f1806b), 0, iVar32.f1805a);
                    int i122 = kVar2.f6011a;
                    if (t5 != t6) {
                    }
                }
                return enumC0510a;
            }
        }
        cVar = new c(fVar, abstractC0542c);
        Object obj3 = cVar.f1786o;
        enumC0510a = EnumC0510a.f7289k;
        i = cVar.f1788q;
        if (i != 0) {
        }
        dVar = d.f1789m;
        cVar.f1782k = scrollCaptureSession;
        cVar.f1783l = kVar;
        cVar.f1784m = i5;
        cVar.f1785n = i6;
        cVar.f1788q = 2;
        if (AbstractC0329z.q(cVar.getContext()).n(dVar, cVar) != enumC0510a) {
        }
        return enumC0510a;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC2282w.p(this.f1800e, e0.f18788l, new a(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        C2285z p5 = AbstractC2282w.p(this.f1800e, null, new b(this, scrollCaptureSession, rect, consumer, null), 3);
        p5.p(new B(13, cancellationSignal));
        cancellationSignal.setOnCancelListener(new r(1, p5));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(i0.F.r(this.f1797b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.f1806b = 0.0f;
        C1930k c1930k = this.f1798c;
        ((C0305m0) c1930k.f16910l).setValue(Boolean.TRUE);
        runnable.run();
    }
}
