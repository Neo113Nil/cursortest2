package H6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class b extends J6.b<I6.a, I6.b> {

    /* renamed from: t, reason: collision with root package name */
    private I6.b f10655t;

    /* renamed from: u, reason: collision with root package name */
    private int f10656u;

    /* renamed from: v, reason: collision with root package name */
    private final Paint f10657v;

    /* renamed from: w, reason: collision with root package name */
    private final a f10658w;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        byte f10659a;

        /* renamed from: b, reason: collision with root package name */
        Rect f10660b;

        /* renamed from: c, reason: collision with root package name */
        ByteBuffer f10661c;
    }

    public b(M6.c cVar, F6.a aVar) {
        super(cVar, aVar);
        Paint paint = new Paint();
        this.f10657v = paint;
        a aVar2 = new a();
        aVar2.f10660b = new Rect();
        this.f10658w = aVar2;
        paint.setAntiAlias(true);
    }

    @Override // J6.b
    protected final Rect B(I6.a aVar) throws IOException {
        I6.a aVar2 = aVar;
        if (!aVar2.a("\u0089PNG") || !aVar2.a("\r\n\u001a\n")) {
            throw new d("APNG Format error");
        }
        ArrayList arrayList = new ArrayList();
        while (aVar2.available() > 0) {
            int position = aVar2.position();
            int d11 = aVar2.d();
            int b11 = aVar2.b();
            e aVar3 = b11 == H6.a.f10653d ? new H6.a() : b11 == f.f10672k ? new f() : b11 == g.f10681c ? new g() : b11 == h.f10682c ? new h() : b11 == i.f10683c ? new i() : b11 == j.f10684f ? new j() : new e();
            aVar3.f10671b = position;
            aVar3.f10670a = d11;
            int available = aVar2.available();
            aVar3.b(aVar2);
            int available2 = available - aVar2.available();
            int i11 = aVar3.f10670a;
            if (available2 > i11) {
                throw new IOException("Out of chunk area");
            }
            if (available2 < i11) {
                aVar2.skip(i11 - available2);
            }
            aVar2.d();
            arrayList.add(aVar3);
        }
        ArrayList arrayList2 = new ArrayList();
        byte[] bArr = new byte[0];
        Iterator it = arrayList.iterator();
        c cVar = null;
        boolean z11 = false;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            e eVar = (e) it.next();
            boolean z12 = eVar instanceof i;
            if (z12) {
                Log.e("b", "chunk read reach to end");
                break;
            }
            if (eVar instanceof H6.a) {
                this.f10656u = ((H6.a) eVar).f10654c;
                z11 = true;
            } else {
                boolean z13 = eVar instanceof f;
                ArrayList arrayList3 = this.f14131c;
                if (z13) {
                    cVar = new c(aVar2, (f) eVar);
                    cVar.f10669m = arrayList2;
                    cVar.f10667k = bArr;
                    arrayList3.add(cVar);
                } else if (eVar instanceof g) {
                    if (cVar != null) {
                        cVar.f10668l.add(eVar);
                    }
                } else if (eVar instanceof h) {
                    if (!z11) {
                        k kVar = new k(aVar2);
                        kVar.f14121b = i12;
                        kVar.f14122c = i13;
                        arrayList3.add(kVar);
                        this.f10656u = 1;
                        break;
                    }
                    if (cVar != null) {
                        cVar.f10668l.add(eVar);
                    }
                } else if (eVar instanceof j) {
                    j jVar = (j) eVar;
                    i12 = jVar.f10685c;
                    i13 = jVar.f10686d;
                    bArr = jVar.f10687e;
                } else if (!z12) {
                    arrayList2.add(eVar);
                }
            }
        }
        int i14 = i12 * i13;
        int i15 = this.f14137i;
        this.f14141m = ByteBuffer.allocate(((i14 / (i15 * i15)) + 1) * 4);
        int i16 = this.f14137i;
        this.f10658w.f10661c = ByteBuffer.allocate(((i14 / (i16 * i16)) + 1) * 4);
        return new Rect(0, 0, i12, i13);
    }

    @Override // J6.b
    protected final void D() {
        this.f10658w.f10661c = null;
        this.f10655t = null;
    }

    @Override // J6.b
    protected final void F(J6.a<I6.a, I6.b> aVar) {
        if (this.f14142n == null) {
            return;
        }
        try {
            Bitmap A11 = A(this.f14142n.width() / this.f14137i, this.f14142n.height() / this.f14137i);
            Canvas canvas = (Canvas) this.f14140l.get(A11);
            if (canvas == null) {
                canvas = new Canvas(A11);
                this.f14140l.put(A11, canvas);
            }
            Canvas canvas2 = canvas;
            if (aVar instanceof c) {
                this.f14141m.rewind();
                A11.copyPixelsFromBuffer(this.f14141m);
                if (this.f14132d == 0) {
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                } else {
                    canvas2.save();
                    canvas2.clipRect(this.f10658w.f10660b);
                    a aVar2 = this.f10658w;
                    byte b11 = aVar2.f10659a;
                    if (b11 == 1) {
                        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                    } else if (b11 == 2) {
                        aVar2.f10661c.rewind();
                        A11.copyPixelsFromBuffer(this.f10658w.f10661c);
                    }
                    canvas2.restore();
                }
                if (((c) aVar).f10666j == 2) {
                    a aVar3 = this.f10658w;
                    if (aVar3.f10659a != 2) {
                        aVar3.f10661c.rewind();
                        A11.copyPixelsToBuffer(this.f10658w.f10661c);
                    }
                }
                this.f10658w.f10659a = ((c) aVar).f10666j;
                canvas2.save();
                if (((c) aVar).f10665i == 0) {
                    int i11 = aVar.f14123d;
                    int i12 = this.f14137i;
                    int i13 = aVar.f14124e;
                    canvas2.clipRect(i11 / i12, i13 / i12, (i11 + aVar.f14121b) / i12, (i13 + aVar.f14122c) / i12);
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                }
                Rect rect = this.f10658w.f10660b;
                int i14 = aVar.f14123d;
                int i15 = this.f14137i;
                int i16 = aVar.f14124e;
                rect.set(i14 / i15, i16 / i15, (i14 + aVar.f14121b) / i15, (i16 + aVar.f14122c) / i15);
                canvas2.restore();
            }
            Bitmap A12 = A(aVar.f14121b, aVar.f14122c);
            Paint paint = this.f10657v;
            int i17 = this.f14137i;
            if (this.f10655t == null) {
                this.f10655t = new I6.b();
            }
            C(aVar.a(canvas2, paint, i17, A12, this.f10655t));
            C(A12);
            this.f14141m.rewind();
            A11.copyPixelsToBuffer(this.f14141m);
            C(A11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // J6.b
    protected final int s() {
        return this.f10656u;
    }

    @Override // J6.b
    protected final I6.a t(L6.d dVar) {
        return new I6.a(dVar);
    }

    @Override // J6.b
    protected final I6.b v() {
        if (this.f10655t == null) {
            this.f10655t = new I6.b();
        }
        return this.f10655t;
    }
}
