package O3;

import L4.A;
import L4.C;
import L4.C0224g;
import O4.C0277x;
import P.C0305m0;
import P.EnumC0330z0;
import P.F0;
import P.InterfaceC0289e0;
import a.AbstractC0444a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.L;
import androidx.lifecycle.Y;
import c.C0517D;
import c.C0519F;
import game.betting133.sports1xbet.aqua_application.AquaGuideDeckActivity;
import game.betting133.sports1xbet.aqua_viewmodels.AquaTournamentCatalogViewModel;
import h0.C1991e;
import i4.InterfaceC2015a;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CancellationException;
import k4.AbstractC2036a;
import p4.C2268h;
import p4.InterfaceC2266f;
import r.C2322H;
import t3.AbstractC2425d;
import u2.C2497l;
import v.AbstractC2529y;
import y1.C2659c;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements InterfaceC2015a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4081k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4082l;

    public /* synthetic */ l(int i, Object obj) {
        this.f4081k = i;
        this.f4082l = obj;
    }

    /* JADX WARN: Finally extract failed */
    private final Object a() {
        int i;
        Object[] objArr;
        int i5;
        int i6;
        Z.s sVar = (Z.s) this.f4082l;
        do {
            synchronized (sVar.f6235g) {
                try {
                    if (!sVar.f6232c) {
                        sVar.f6232c = true;
                        try {
                            R.e eVar = sVar.f;
                            Object[] objArr2 = eVar.f5106k;
                            int i7 = eVar.f5108m;
                            int i8 = 0;
                            while (i8 < i7) {
                                Z.r rVar = (Z.r) objArr2[i8];
                                C2322H c2322h = rVar.f6225g;
                                Object[] objArr3 = c2322h.f18934b;
                                long[] jArr = c2322h.f18933a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i9 = 0;
                                    while (true) {
                                        long j5 = jArr[i9];
                                        objArr = objArr2;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i10 = 8;
                                            int i11 = 8 - ((~(i9 - length)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j5 & 255) < 128) {
                                                    i6 = i10;
                                                    i5 = i7;
                                                    rVar.f6220a.c(objArr3[(i9 << 3) + i12]);
                                                } else {
                                                    i5 = i7;
                                                    i6 = i10;
                                                }
                                                j5 >>= i6;
                                                i12++;
                                                i7 = i5;
                                                i10 = i6;
                                            }
                                            i = i7;
                                            if (i11 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i7;
                                        }
                                        if (i9 == length) {
                                            break;
                                        }
                                        i9++;
                                        objArr2 = objArr;
                                        i7 = i;
                                    }
                                } else {
                                    i = i7;
                                    objArr = objArr2;
                                }
                                c2322h.b();
                                i8++;
                                objArr2 = objArr;
                                i7 = i;
                            }
                            sVar.f6232c = false;
                        } catch (Throwable th) {
                            sVar.f6232c = false;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (sVar.c());
        return W3.o.f6046a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0063, code lost:
    
        if (v2.k.f20417a.contains(r9) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    @Override // i4.InterfaceC2015a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        InterfaceC2266f y5;
        v2.g gVar;
        Exception exc;
        Context context;
        boolean z3;
        int i;
        int i5;
        int min;
        double max;
        Bitmap createBitmap;
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        ColorSpace colorSpace;
        int e3;
        C2659c c5;
        int e5;
        int i6;
        int i7 = 1;
        switch (this.f4081k) {
            case 0:
                ((InterfaceC0289e0) this.f4082l).setValue(null);
                return W3.o.f6046a;
            case 1:
                F0 f02 = (F0) this.f4082l;
                synchronized (f02.f4291b) {
                    y5 = f02.y();
                    if (((EnumC0330z0) f02.f4307t.getValue()).compareTo(EnumC0330z0.f4608l) <= 0) {
                        Throwable th = f02.f4293d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (y5 != null) {
                    ((C2268h) y5).resumeWith(W3.o.f6046a);
                }
                return W3.o.f6046a;
            case 2:
                int i8 = AquaGuideDeckActivity.f17163E;
                c.n.a((AquaGuideDeckActivity) this.f4082l);
                return W3.o.f6046a;
            case 3:
                ((AquaTournamentCatalogViewModel) this.f4082l).reviseSemeansarchDraft("");
                return W3.o.f6046a;
            case 4:
                U0.b bVar = (U0.b) this.f4082l;
                if (((C1991e) bVar.f5847c.getValue()).f17204a != 9205357640488583168L) {
                    C0305m0 c0305m0 = bVar.f5847c;
                    if (!C1991e.e(((C1991e) c0305m0.getValue()).f17204a)) {
                        return bVar.f5845a.B(((C1991e) c0305m0.getValue()).f17204a);
                    }
                }
                return null;
            case 5:
                U1.e eVar = (U1.e) this.f4082l;
                eVar.g().a(new U1.b(eVar, 0));
                return W3.o.f6046a;
            case 6:
                return (V0.o) this.f4082l;
            case 7:
                Y.b bVar2 = (Y.b) this.f4082l;
                Y.j jVar = bVar2.f6099k;
                Object obj = bVar2.f6102n;
                if (obj != null) {
                    return jVar.i(bVar2, obj);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case 8:
                Bundle l5 = AbstractC2425d.l((W3.h[]) Arrays.copyOf(new W3.h[0], 0));
                ((Y.i) this.f4082l).f6116l.p(l5);
                if (l5.isEmpty()) {
                    return null;
                }
                return l5;
            case 9:
                return a();
            case 10:
                return L.i((Y) this.f4082l);
            case 11:
                return new C0517D((C0519F) this.f4082l);
            case 12:
                return this.f4082l;
            case 13:
                return (E2.i) ((C2497l) this.f4082l).f20007A.getValue();
            default:
                BitmapFactory.Options options = new BitmapFactory.Options();
                v2.d dVar = (v2.d) this.f4082l;
                v2.m mVar = dVar.f20398a;
                C0277x c0277x = new C0277x(mVar.d());
                C k5 = N4.b.k(c0277x);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new C0224g(N4.b.k(new A(k5)), i7), null, options);
                Exception exc2 = (Exception) c0277x.f4239m;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inJustDecodeBounds = false;
                Paint paint = v2.j.f20416a;
                String str = options.outMimeType;
                Set set = v2.k.f20417a;
                int ordinal = dVar.f20401d.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        if (str != null) {
                            break;
                        }
                    } else if (ordinal != 2) {
                        throw new D2.e();
                    }
                    y1.g gVar2 = new y1.g(new v2.h(new C0224g(N4.b.k(new A(k5)), i7)));
                    C2659c c6 = gVar2.c("Orientation");
                    if (c6 != null) {
                        try {
                            e3 = c6.e(gVar2.f);
                        } catch (NumberFormatException unused) {
                        }
                        boolean z5 = e3 != 2 || e3 == 7 || e3 == 4 || e3 == 5;
                        c5 = gVar2.c("Orientation");
                        if (c5 != null) {
                            try {
                                e5 = c5.e(gVar2.f);
                            } catch (NumberFormatException unused2) {
                            }
                            switch (e5) {
                                case 3:
                                case 4:
                                    i6 = 180;
                                    break;
                                case 5:
                                case 8:
                                    i6 = 270;
                                    break;
                                case 6:
                                case 7:
                                    i6 = 90;
                                    break;
                                default:
                                    i6 = 0;
                                    break;
                            }
                            gVar = new v2.g(i6, z5);
                            exc = (Exception) c0277x.f4239m;
                            if (exc == null) {
                                throw exc;
                            }
                            options.inMutable = false;
                            int i9 = Build.VERSION.SDK_INT;
                            E2.m mVar2 = dVar.f20399b;
                            if (i9 >= 26 && (colorSpace = mVar2.f1464c) != null) {
                                options.inPreferredColorSpace = colorSpace;
                            }
                            options.inPremultiplied = mVar2.f1468h;
                            int i10 = gVar.f20411b;
                            Bitmap.Config config4 = mVar2.f1463b;
                            boolean z6 = gVar.f20410a;
                            if ((z6 || i10 > 0) && (config4 == null || AbstractC2425d.z(config4))) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            if (mVar2.f1467g && config4 == Bitmap.Config.ARGB_8888 && kotlin.jvm.internal.l.a(options.outMimeType, "image/jpeg")) {
                                config4 = Bitmap.Config.RGB_565;
                            }
                            if (i9 >= 26) {
                                config = options.outConfig;
                                config2 = Bitmap.Config.RGBA_F16;
                                if (config == config2) {
                                    config3 = Bitmap.Config.HARDWARE;
                                    if (config4 != config3) {
                                        config4 = Bitmap.Config.RGBA_F16;
                                    }
                                }
                            }
                            options.inPreferredConfig = config4;
                            AbstractC2529y b3 = mVar.b();
                            boolean z7 = b3 instanceof v2.n;
                            Context context2 = mVar2.f1462a;
                            F2.h hVar = mVar2.f1465d;
                            if (z7 && kotlin.jvm.internal.l.a(hVar, F2.h.f1535c)) {
                                options.inSampleSize = 1;
                                options.inScaled = true;
                                options.inDensity = ((v2.n) b3).f20424a;
                                options.inTargetDensity = context2.getResources().getDisplayMetrics().densityDpi;
                                i = 1;
                                context = context2;
                                z3 = z6;
                            } else {
                                int i11 = options.outWidth;
                                if (i11 > 0) {
                                    int i12 = options.outHeight;
                                    if (i12 <= 0) {
                                        i = 1;
                                        context = context2;
                                        z3 = z6;
                                    } else {
                                        int i13 = (i10 == 90 || i10 == 270) ? i12 : i11;
                                        if (i10 != 90 && i10 != 270) {
                                            i11 = i12;
                                        }
                                        F2.h hVar2 = F2.h.f1535c;
                                        boolean a5 = kotlin.jvm.internal.l.a(hVar, hVar2);
                                        F2.g gVar3 = mVar2.f1466e;
                                        int d5 = a5 ? i13 : H2.e.d(hVar.f1536a, gVar3);
                                        int d6 = kotlin.jvm.internal.l.a(hVar, hVar2) ? i11 : H2.e.d(hVar.f1537b, gVar3);
                                        int highestOneBit = Integer.highestOneBit(i13 / d5);
                                        int highestOneBit2 = Integer.highestOneBit(i11 / d6);
                                        int ordinal2 = gVar3.ordinal();
                                        if (ordinal2 != 0) {
                                            context = context2;
                                            i5 = 1;
                                            if (ordinal2 != 1) {
                                                throw new D2.e();
                                            }
                                            min = Math.max(highestOneBit, highestOneBit2);
                                        } else {
                                            context = context2;
                                            i5 = 1;
                                            min = Math.min(highestOneBit, highestOneBit2);
                                        }
                                        if (min < i5) {
                                            min = 1;
                                        }
                                        options.inSampleSize = min;
                                        z3 = z6;
                                        double d7 = min;
                                        double d8 = d5 / (i13 / d7);
                                        double d9 = d6 / (i11 / d7);
                                        int ordinal3 = gVar3.ordinal();
                                        if (ordinal3 == 0) {
                                            max = Math.max(d8, d9);
                                        } else {
                                            if (ordinal3 != 1) {
                                                throw new D2.e();
                                            }
                                            max = Math.min(d8, d9);
                                        }
                                        if (mVar2.f && max > 1.0d) {
                                            max = 1.0d;
                                        }
                                        boolean z8 = max == 1.0d;
                                        options.inScaled = !z8;
                                        if (!z8) {
                                            if (max > 1.0d) {
                                                options.inDensity = AbstractC2036a.T(Integer.MAX_VALUE / max);
                                                options.inTargetDensity = Integer.MAX_VALUE;
                                            } else {
                                                options.inDensity = Integer.MAX_VALUE;
                                                options.inTargetDensity = AbstractC2036a.T(Integer.MAX_VALUE * max);
                                            }
                                        }
                                        i = 1;
                                    }
                                } else {
                                    context = context2;
                                    z3 = z6;
                                    i = 1;
                                }
                                options.inSampleSize = i;
                                options.inScaled = false;
                            }
                            try {
                                Bitmap decodeStream = BitmapFactory.decodeStream(new C0224g(k5, i), null, options);
                                k5.close();
                                Exception exc3 = (Exception) c0277x.f4239m;
                                if (exc3 != null) {
                                    throw exc3;
                                }
                                if (decodeStream == null) {
                                    throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                                }
                                decodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                                if (z3 || i10 > 0) {
                                    Matrix matrix = new Matrix();
                                    float width = decodeStream.getWidth() / 2.0f;
                                    float height = decodeStream.getHeight() / 2.0f;
                                    if (z3) {
                                        matrix.postScale(-1.0f, 1.0f, width, height);
                                    }
                                    if (i10 > 0) {
                                        matrix.postRotate(i10, width, height);
                                    }
                                    RectF rectF = new RectF(0.0f, 0.0f, decodeStream.getWidth(), decodeStream.getHeight());
                                    matrix.mapRect(rectF);
                                    float f = rectF.left;
                                    if (f != 0.0f || rectF.top != 0.0f) {
                                        matrix.postTranslate(-f, -rectF.top);
                                    }
                                    if (i10 == 90 || i10 == 270) {
                                        int height2 = decodeStream.getHeight();
                                        int width2 = decodeStream.getWidth();
                                        Bitmap.Config config5 = decodeStream.getConfig();
                                        if (config5 == null) {
                                            config5 = Bitmap.Config.ARGB_8888;
                                        }
                                        createBitmap = Bitmap.createBitmap(height2, width2, config5);
                                    } else {
                                        int width3 = decodeStream.getWidth();
                                        int height3 = decodeStream.getHeight();
                                        Bitmap.Config config6 = decodeStream.getConfig();
                                        if (config6 == null) {
                                            config6 = Bitmap.Config.ARGB_8888;
                                        }
                                        createBitmap = Bitmap.createBitmap(width3, height3, config6);
                                    }
                                    new Canvas(createBitmap).drawBitmap(decodeStream, matrix, v2.j.f20416a);
                                    decodeStream.recycle();
                                    decodeStream = createBitmap;
                                }
                                return new v2.f(new BitmapDrawable(context.getResources(), decodeStream), options.inSampleSize > 1 || options.inScaled);
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    AbstractC0444a.p(k5, th2);
                                    throw th3;
                                }
                            }
                        }
                        e5 = 1;
                        switch (e5) {
                        }
                        gVar = new v2.g(i6, z5);
                        exc = (Exception) c0277x.f4239m;
                        if (exc == null) {
                        }
                    }
                    e3 = 1;
                    if (e3 != 2) {
                    }
                    c5 = gVar2.c("Orientation");
                    if (c5 != null) {
                    }
                    e5 = 1;
                    switch (e5) {
                    }
                    gVar = new v2.g(i6, z5);
                    exc = (Exception) c0277x.f4239m;
                    if (exc == null) {
                    }
                }
                gVar = v2.g.f20409c;
                exc = (Exception) c0277x.f4239m;
                if (exc == null) {
                }
                break;
        }
    }
}
