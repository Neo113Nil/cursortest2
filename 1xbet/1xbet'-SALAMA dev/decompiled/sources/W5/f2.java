package W5;

import java.io.OutputStream;
import java.net.ProxySelector;
import java.nio.ByteBuffer;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class f2 implements InterfaceC0555y, b2, D3.q, U5.X, U5.a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f2 f7216b = new f2(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7217a;

    public /* synthetic */ f2(int i7) {
        this.f7217a = i7;
    }

    public static V g() {
        V v6 = new V();
        v6.f7069a = new Random();
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        v6.f7070b = TimeUnit.MINUTES.toNanos(2L);
        v6.f7071c = 1.6d;
        v6.f7072d = 0.2d;
        v6.f7073e = nanos;
        return v6;
    }

    @Override // U5.a0
    /* JADX INFO: renamed from: a */
    public byte[] mo0a(Object obj) {
        switch (this.f7217a) {
            case 11:
                return (byte[]) obj;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // W5.b2
    public Object b() {
        switch (this.f7217a) {
            case 8:
                return Executors.newCachedThreadPool(AbstractC0494d0.e("grpc-default-executor-%d"));
            default:
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, AbstractC0494d0.e("grpc-timer-%d"));
                try {
                    scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
                    break;
                } catch (NoSuchMethodException unused) {
                } catch (RuntimeException e7) {
                    throw e7;
                } catch (Exception e8) {
                    throw new RuntimeException(e8);
                }
                return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
        }
    }

    @Override // W5.InterfaceC0555y
    public int c(AbstractC0490c abstractC0490c, int i7, Object obj, int i8) {
        switch (this.f7217a) {
            case 2:
                return abstractC0490c.h();
            case 3:
                abstractC0490c.j(i7);
                return 0;
            case 4:
                abstractC0490c.g((byte[]) obj, i8, i7);
                return i8 + i7;
            case 5:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + i7);
                abstractC0490c.f(byteBuffer);
                byteBuffer.limit(iLimit);
                return 0;
            default:
                abstractC0490c.e((OutputStream) obj, i7);
                return 0;
        }
    }

    public long d() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    @Override // U5.X
    public Object e(String str) {
        p113p3.f.d("empty timeout", str.length() > 0);
        p113p3.f.d("bad timeout format", str.length() <= 9);
        long j = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j);
        }
        throw new IllegalArgumentException("Invalid timeout unit: " + cCharAt);
    }

    @Override // U5.a0
    public Object f(byte[] bArr) {
        switch (this.f7217a) {
            case 11:
                return bArr;
            default:
                if (bArr.length < 3) {
                    throw new NumberFormatException("Malformed status code ".concat(new String(bArr, U5.G.f6421a)));
                }
                return Integer.valueOf((bArr[2] - 48) + ((bArr[1] - 48) * 10) + ((bArr[0] - 48) * 100));
        }
    }

    @Override // D3.q
    public Object get() {
        switch (this.f7217a) {
            case 10:
                return new D3.p(0);
            default:
                return ProxySelector.getDefault();
        }
    }

    @Override // W5.b2
    public void l(Object obj) {
        switch (this.f7217a) {
            case 8:
                ((ExecutorService) ((Executor) obj)).shutdown();
                break;
            default:
                ((ScheduledExecutorService) obj).shutdown();
                break;
        }
    }

    public String toString() {
        switch (this.f7217a) {
            case 8:
                return "grpc-default-executor";
            default:
                return super.toString();
        }
    }

    @Override // U5.X
    public String a(Object obj) {
        Long l7 = (Long) obj;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (l7.longValue() < 0) {
            throw new IllegalArgumentException("Timeout too small");
        }
        if (l7.longValue() < 100000000) {
            return l7 + "n";
        }
        if (l7.longValue() < 100000000000L) {
            return timeUnit.toMicros(l7.longValue()) + "u";
        }
        if (l7.longValue() < 100000000000000L) {
            return timeUnit.toMillis(l7.longValue()) + "m";
        }
        if (l7.longValue() < 100000000000000000L) {
            return timeUnit.toSeconds(l7.longValue()) + "S";
        }
        if (l7.longValue() < 6000000000000000000L) {
            return timeUnit.toMinutes(l7.longValue()) + "M";
        }
        return timeUnit.toHours(l7.longValue()) + "H";
    }
}
