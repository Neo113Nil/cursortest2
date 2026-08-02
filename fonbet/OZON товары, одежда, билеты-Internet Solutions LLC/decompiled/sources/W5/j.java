package W5;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: k, reason: collision with root package name */
    private static final Bitmap.Config f33270k = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    private final l f33271a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Bitmap.Config> f33272b;

    /* renamed from: c, reason: collision with root package name */
    private final long f33273c;

    /* renamed from: d, reason: collision with root package name */
    private final a f33274d;

    /* renamed from: e, reason: collision with root package name */
    private long f33275e;

    /* renamed from: f, reason: collision with root package name */
    private long f33276f;

    /* renamed from: g, reason: collision with root package name */
    private int f33277g;

    /* renamed from: h, reason: collision with root package name */
    private int f33278h;

    /* renamed from: i, reason: collision with root package name */
    private int f33279i;

    /* renamed from: j, reason: collision with root package name */
    private int f33280j;

    private static final class a {
    }

    public j(long j11) {
        l lVar = new l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f33273c = j11;
        this.f33275e = j11;
        this.f33271a = lVar;
        this.f33272b = unmodifiableSet;
        this.f33274d = new a();
    }

    private void g() {
        Log.v("LruBitmapPool", "Hits=" + this.f33277g + ", misses=" + this.f33278h + ", puts=" + this.f33279i + ", evictions=" + this.f33280j + ", currentSize=" + this.f33276f + ", maxSize=" + this.f33275e + "\nStrategy=" + this.f33271a);
    }

    private synchronized Bitmap h(int i11, int i12, Bitmap.Config config) {
        Bitmap b11;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            b11 = this.f33271a.b(i11, i12, config != null ? config : f33270k);
            if (b11 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder("Missing bitmap=");
                    this.f33271a.getClass();
                    sb2.append(l.c(p6.l.d(config) * i11 * i12, config));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                this.f33278h++;
            } else {
                this.f33277g++;
                long j11 = this.f33276f;
                this.f33271a.getClass();
                this.f33276f = j11 - p6.l.c(b11);
                this.f33274d.getClass();
                b11.setHasAlpha(true);
                b11.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Get bitmap=");
                this.f33271a.getClass();
                sb3.append(l.c(p6.l.d(config) * i11 * i12, config));
                Log.v("LruBitmapPool", sb3.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return b11;
    }

    private synchronized void i(long j11) {
        while (this.f33276f > j11) {
            try {
                Bitmap f7 = this.f33271a.f();
                if (f7 == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        g();
                    }
                    this.f33276f = 0L;
                    return;
                }
                this.f33274d.getClass();
                long j12 = this.f33276f;
                this.f33271a.getClass();
                this.f33276f = j12 - p6.l.c(f7);
                this.f33280j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Evicting bitmap=");
                    this.f33271a.getClass();
                    sb2.append(l.c(p6.l.c(f7), f7.getConfig()));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    g();
                }
                f7.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // W5.d
    @SuppressLint({"InlinedApi"})
    public final void a(int i11) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i11);
        }
        if (i11 >= 40 || i11 >= 20) {
            e();
        } else if (i11 >= 20 || i11 == 15) {
            i(this.f33275e / 2);
        }
    }

    @Override // W5.d
    public final synchronized void b(float f7) {
        long round = Math.round(this.f33273c * f7);
        this.f33275e = round;
        i(round);
    }

    @Override // W5.d
    public final synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f33271a.getClass();
                if (p6.l.c(bitmap) <= this.f33275e && this.f33272b.contains(bitmap.getConfig())) {
                    this.f33271a.getClass();
                    int c11 = p6.l.c(bitmap);
                    this.f33271a.e(bitmap);
                    this.f33274d.getClass();
                    this.f33279i++;
                    this.f33276f += c11;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder("Put bitmap in pool=");
                        this.f33271a.getClass();
                        sb2.append(l.c(p6.l.c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb2.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        g();
                    }
                    i(this.f33275e);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f33271a.getClass();
                sb3.append(l.c(p6.l.c(bitmap), bitmap.getConfig()));
                sb3.append(", is mutable: ");
                sb3.append(bitmap.isMutable());
                sb3.append(", is allowed config: ");
                sb3.append(this.f33272b.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb3.toString());
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // W5.d
    @NonNull
    public final Bitmap d(int i11, int i12, Bitmap.Config config) {
        Bitmap h11 = h(i11, i12, config);
        if (h11 != null) {
            return h11;
        }
        if (config == null) {
            config = f33270k;
        }
        return Bitmap.createBitmap(i11, i12, config);
    }

    @Override // W5.d
    public final void e() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        i(0L);
    }

    @Override // W5.d
    @NonNull
    public final Bitmap f(int i11, int i12, Bitmap.Config config) {
        Bitmap h11 = h(i11, i12, config);
        if (h11 != null) {
            h11.eraseColor(0);
            return h11;
        }
        if (config == null) {
            config = f33270k;
        }
        return Bitmap.createBitmap(i11, i12, config);
    }
}
