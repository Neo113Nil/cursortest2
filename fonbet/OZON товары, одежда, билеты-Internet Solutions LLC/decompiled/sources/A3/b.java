package A3;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.exoplayer.k0;
import j3.C7272n;
import j3.u;
import j3.v;
import java.io.IOException;
import java.nio.ByteBuffer;
import m3.N;
import p3.C8843c;
import s3.h;

/* loaded from: classes8.dex */
public final class b extends h<s3.f, e, d> implements c {

    /* renamed from: n, reason: collision with root package name */
    private final Context f316n;

    /* renamed from: o, reason: collision with root package name */
    private final int f317o;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f318a;

        public a(Context context) {
            this.f318a = context;
        }

        public final b a() {
            return new b(this.f318a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
        
            if (android.os.Build.VERSION.SDK_INT >= 34) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int b(C7272n c7272n) {
            String str = c7272n.f69127o;
            if (str == null || !u.j(str)) {
                return k0.g(0, 0, 0, 0);
            }
            int i11 = N.f74289a;
            String str2 = c7272n.f69127o;
            str2.getClass();
            switch (str2) {
                case "image/heic":
                case "image/heif":
                case "image/jpeg":
                case "image/webp":
                case "image/bmp":
                case "image/png":
                    return k0.g(4, 0, 0, 0);
            }
            return k0.g(1, 0, 0, 0);
        }
    }

    b(Context context) {
        super(new s3.f[1], new e[1]);
        this.f316n = context;
        this.f317o = -1;
    }

    @Override // s3.h
    protected final s3.f h() {
        return new s3.f(1);
    }

    @Override // s3.h
    protected final e i() {
        return new A3.a(this);
    }

    @Override // s3.h
    protected final d j(Throwable th2) {
        return new d("Unexpected decode error", th2);
    }

    @Override // s3.h
    protected final d k(s3.f fVar, e eVar, boolean z11) {
        e eVar2 = eVar;
        ByteBuffer byteBuffer = fVar.f98184d;
        byteBuffer.getClass();
        G10.a.h(byteBuffer.hasArray());
        G10.a.c(byteBuffer.arrayOffset() == 0);
        try {
            int i11 = this.f317o;
            if (i11 == -1) {
                Context context = this.f316n;
                if (context != null) {
                    Point x11 = N.x(context);
                    int i12 = x11.x;
                    int i13 = x11.y;
                    C7272n c7272n = fVar.f98182b;
                    if (c7272n != null) {
                        int i14 = c7272n.f69109N;
                        if (i14 != -1) {
                            i12 *= i14;
                        }
                        int i15 = c7272n.f69110O;
                        if (i15 != -1) {
                            i13 *= i15;
                        }
                    }
                    i11 = (Math.max(i12, i13) * 2) - 1;
                } else {
                    i11 = 4096;
                }
            }
            eVar2.f319d = C8843c.a(byteBuffer.remaining(), i11, byteBuffer.array());
            eVar2.f98189b = fVar.f98186f;
            return null;
        } catch (v e11) {
            return new d("Could not decode image data with BitmapFactory.", e11);
        } catch (IOException e12) {
            return new d(e12);
        }
    }
}
