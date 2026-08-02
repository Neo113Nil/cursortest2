package S4;

import android.util.Log;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static final Runtime f6325f = Runtime.getRuntime();

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f6326a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6327b = new byte[262144];

    /* renamed from: c, reason: collision with root package name */
    public int f6328c = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6330e = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6329d = false;

    public d(InputStream inputStream) {
        this.f6326a = inputStream;
    }

    public final int a(int i7) {
        int i8 = this.f6328c;
        int i9 = 0;
        if (i7 <= i8) {
            int i10 = i8 - i7;
            this.f6328c = i10;
            byte[] bArr = this.f6327b;
            System.arraycopy(bArr, i7, bArr, 0, i10);
            return i7;
        }
        this.f6328c = 0;
        while (i9 < i7) {
            InputStream inputStream = this.f6326a;
            int skip = (int) inputStream.skip(i7 - i9);
            if (skip > 0) {
                i9 += skip;
            } else if (skip != 0) {
                continue;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                i9++;
            }
        }
        return i9;
    }

    public final void b(int i7) {
        byte[] bArr = this.f6327b;
        if (i7 > bArr.length) {
            int max = Math.max(bArr.length * 2, i7);
            Runtime runtime = f6325f;
            long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
            if (!this.f6330e || max >= maxMemory) {
                Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing to conserve memory.");
            } else {
                try {
                    byte[] bArr2 = new byte[max];
                    System.arraycopy(this.f6327b, 0, bArr2, 0, this.f6328c);
                    this.f6327b = bArr2;
                } catch (OutOfMemoryError unused) {
                    Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing due to low memory.");
                    this.f6330e = false;
                }
            }
            i7 = Math.min(i7, this.f6327b.length);
        }
        while (true) {
            int i8 = this.f6328c;
            if (i8 >= i7) {
                return;
            }
            int read = this.f6326a.read(this.f6327b, i8, i7 - i8);
            if (read == -1) {
                this.f6329d = true;
                return;
            }
            this.f6328c += read;
        }
    }
}
