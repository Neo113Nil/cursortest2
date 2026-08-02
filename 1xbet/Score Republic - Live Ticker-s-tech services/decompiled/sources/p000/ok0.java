package p000;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ok0 implements InterfaceC0318ic {

    /* JADX INFO: renamed from: s */
    public static final Bitmap.Config f5769s = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: j */
    public final r81 f5770j;

    /* JADX INFO: renamed from: k */
    public final Set f5771k;

    /* JADX INFO: renamed from: l */
    public final x80 f5772l;

    /* JADX INFO: renamed from: m */
    public final long f5773m;

    /* JADX INFO: renamed from: n */
    public long f5774n;

    /* JADX INFO: renamed from: o */
    public int f5775o;

    /* JADX INFO: renamed from: p */
    public int f5776p;

    /* JADX INFO: renamed from: q */
    public int f5777q;

    /* JADX INFO: renamed from: r */
    public int f5778r;

    public ok0(long j) {
        r81 r81Var = new r81();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f5773m = j;
        this.f5770j = r81Var;
        this.f5771k = setUnmodifiableSet;
        this.f5772l = new x80(6);
    }

    /* JADX INFO: renamed from: a */
    public final void m3701a() {
        Log.v("LruBitmapPool", "Hits=" + this.f5775o + ", misses=" + this.f5776p + ", puts=" + this.f5777q + ", evictions=" + this.f5778r + ", currentSize=" + this.f5774n + ", maxSize=" + this.f5773m + "\nStrategy=" + this.f5770j);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Bitmap m3702b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM4278b;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapM4278b = this.f5770j.m4278b(i, i2, config != null ? config : f5769s);
            if (bitmapM4278b == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f5770j.getClass();
                    Log.d("LruBitmapPool", "Missing bitmap=".concat(r81.m4276c(zg1.m5897h(config) * i * i2, config)));
                }
                this.f5776p++;
            } else {
                this.f5775o++;
                long j = this.f5774n;
                this.f5770j.getClass();
                this.f5774n = j - ((long) zg1.m5896g(bitmapM4278b));
                this.f5772l.getClass();
                bitmapM4278b.setHasAlpha(true);
                bitmapM4278b.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f5770j.getClass();
                Log.v("LruBitmapPool", "Get bitmap=".concat(r81.m4276c(zg1.m5897h(config) * i * i2, config)));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                m3701a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapM4278b;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m3703c(long j) {
        while (this.f5774n > j) {
            try {
                r81 r81Var = this.f5770j;
                Bitmap bitmap = (Bitmap) r81Var.f6737b.m1623Z();
                if (bitmap != null) {
                    r81Var.m4277a(Integer.valueOf(zg1.m5896g(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m3701a();
                    }
                    this.f5774n = 0L;
                    return;
                }
                this.f5772l.getClass();
                long j2 = this.f5774n;
                this.f5770j.getClass();
                this.f5774n = j2 - ((long) zg1.m5896g(bitmap));
                this.f5778r++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f5770j.getClass();
                    sb.append(r81.m4276c(zg1.m5896g(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    m3701a();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0318ic
    /* JADX INFO: renamed from: e */
    public final Bitmap mo2589e(int i, int i2) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapM3702b = m3702b(i, i2, config);
        if (bitmapM3702b != null) {
            bitmapM3702b.eraseColor(0);
            return bitmapM3702b;
        }
        if (config == null) {
            config = f5769s;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC0318ic
    /* JADX INFO: renamed from: f */
    public final Bitmap mo2590f(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM3702b = m3702b(i, i2, config);
        if (bitmapM3702b != null) {
            return bitmapM3702b;
        }
        if (config == null) {
            config = f5769s;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC0318ic
    /* JADX INFO: renamed from: h */
    public final synchronized void mo2591h(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f5770j.getClass();
                if (zg1.m5896g(bitmap) <= this.f5773m && this.f5771k.contains(bitmap.getConfig())) {
                    this.f5770j.getClass();
                    int iM5896g = zg1.m5896g(bitmap);
                    this.f5770j.m4280e(bitmap);
                    this.f5772l.getClass();
                    this.f5777q++;
                    this.f5774n += (long) iM5896g;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.f5770j.getClass();
                        Log.v("LruBitmapPool", "Put bitmap in pool=".concat(r81.m4276c(zg1.m5896g(bitmap), bitmap.getConfig())));
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        m3701a();
                    }
                    m3703c(this.f5773m);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f5770j.getClass();
                sb.append(r81.m4276c(zg1.m5896g(bitmap), bitmap.getConfig()));
                sb.append(", is mutable: ");
                sb.append(bitmap.isMutable());
                sb.append(", is allowed config: ");
                sb.append(this.f5771k.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.InterfaceC0318ic
    /* JADX INFO: renamed from: i */
    public final void mo2592i(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            mo2593l();
        } else if (i >= 20 || i == 15) {
            m3703c(this.f5773m / 2);
        }
    }

    @Override // p000.InterfaceC0318ic
    /* JADX INFO: renamed from: l */
    public final void mo2593l() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m3703c(0L);
    }
}
