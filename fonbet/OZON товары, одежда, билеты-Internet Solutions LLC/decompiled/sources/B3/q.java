package B3;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import j3.C7272n;
import java.io.IOException;
import java.nio.ByteBuffer;
import s3.C9589c;

/* loaded from: classes.dex */
public interface q {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final t f2361a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f2362b;

        /* renamed from: c, reason: collision with root package name */
        public final C7272n f2363c;

        /* renamed from: d, reason: collision with root package name */
        public final Surface f2364d;

        /* renamed from: e, reason: collision with root package name */
        public final MediaCrypto f2365e;

        /* renamed from: f, reason: collision with root package name */
        public final C2571o f2366f;

        private a(t tVar, MediaFormat mediaFormat, C7272n c7272n, Surface surface, MediaCrypto mediaCrypto, C2571o c2571o) {
            this.f2361a = tVar;
            this.f2362b = mediaFormat;
            this.f2363c = c7272n;
            this.f2364d = surface;
            this.f2365e = mediaCrypto;
            this.f2366f = c2571o;
        }

        public static a a(t tVar, MediaFormat mediaFormat, C7272n c7272n, MediaCrypto mediaCrypto, C2571o c2571o) {
            return new a(tVar, mediaFormat, c7272n, null, mediaCrypto, c2571o);
        }

        public static a b(t tVar, MediaFormat mediaFormat, C7272n c7272n, Surface surface, MediaCrypto mediaCrypto) {
            return new a(tVar, mediaFormat, c7272n, surface, mediaCrypto, null);
        }
    }

    public interface b {
        q a(a aVar) throws IOException;
    }

    public interface c {
    }

    public interface d {
        void a(long j11);
    }

    void a(Bundle bundle);

    void b(int i11, C9589c c9589c, long j11, int i12);

    void c(int i11, int i12, int i13, long j11);

    void d(d dVar, Handler handler);

    void e(int i11);

    void f(int i11);

    void flush();

    void g(int i11, long j11);

    default boolean h(c cVar) {
        return false;
    }

    int i(MediaCodec.BufferInfo bufferInfo);

    MediaFormat j();

    void k();

    ByteBuffer l(int i11);

    void m(Surface surface);

    int n();

    ByteBuffer o(int i11);

    void release();
}
