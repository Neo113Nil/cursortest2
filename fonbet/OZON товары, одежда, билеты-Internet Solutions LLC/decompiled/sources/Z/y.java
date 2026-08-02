package Z;

import C.S;
import Z.o;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class y implements o {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f35308a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f35309b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private final int f35310c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35311d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f35312e;

    /* renamed from: f, reason: collision with root package name */
    private long f35313f;

    public y(@NonNull a aVar) {
        this.f35310c = aVar.d();
        this.f35311d = aVar.f();
    }

    private void a() {
        x2.i.f("AudioStream has been released.", !this.f35309b.get());
    }

    public final void b() {
        this.f35309b.getAndSet(true);
    }

    public final void c() {
        a();
        if (this.f35308a.getAndSet(true)) {
            return;
        }
        this.f35313f = System.nanoTime();
    }

    public final void d() {
        a();
        this.f35308a.set(false);
    }

    @Override // Z.o
    @NonNull
    public final o.c read(@NonNull ByteBuffer byteBuffer) {
        a();
        x2.i.f("AudioStream has not been started.", this.f35308a.get());
        long remaining = byteBuffer.remaining();
        int i11 = this.f35310c;
        long b11 = r.b(i11, remaining);
        long j11 = i11;
        x2.i.a("bytesPerFrame must be greater than 0.", j11 > 0);
        int i12 = (int) (j11 * b11);
        if (i12 <= 0) {
            return new t(0, this.f35313f);
        }
        long a11 = this.f35313f + r.a(this.f35311d, b11);
        long nanoTime = a11 - System.nanoTime();
        if (nanoTime > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            } catch (InterruptedException e11) {
                S.l("SilentAudioStream", "Ignore interruption", e11);
            }
        }
        x2.i.f(null, i12 <= byteBuffer.remaining());
        byte[] bArr = this.f35312e;
        if (bArr == null || bArr.length < i12) {
            this.f35312e = new byte[i12];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.f35312e, 0, i12).limit(position + i12).position(position);
        t tVar = new t(i12, this.f35313f);
        this.f35313f = a11;
        return tVar;
    }
}
