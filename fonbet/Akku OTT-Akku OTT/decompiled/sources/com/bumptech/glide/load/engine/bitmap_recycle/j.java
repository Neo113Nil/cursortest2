package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.util.m;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class j implements d {
    public static final Bitmap.Config f = Bitmap.Config.ARGB_8888;
    public final l a;
    public final Set<Bitmap.Config> b;
    public final a c;
    public final long d;
    public long e;

    public static final class a {
    }

    public j(long j) {
        Bitmap.Config config;
        l lVar = new l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j;
        this.a = lVar;
        this.b = unmodifiableSet;
        this.c = new a();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    @SuppressLint({"InlinedApi"})
    public final void a(int i) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i >= 40 || i >= 20) {
            b();
        } else if (i >= 20 || i == 15) {
            g(this.d / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public final void b() {
        Log.isLoggable("LruBitmapPool", 3);
        g(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    @NonNull
    public final Bitmap c(int i, int i2, Bitmap.Config config) {
        Bitmap f2 = f(i, i2, config);
        if (f2 != null) {
            return f2;
        }
        if (config == null) {
            config = f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.a.getClass();
                if (m.c(bitmap) <= this.d && this.b.contains(bitmap.getConfig())) {
                    this.a.getClass();
                    int c = m.c(bitmap);
                    this.a.e(bitmap);
                    this.c.getClass();
                    this.e += c;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.a.getClass();
                        l.c(m.c(bitmap), bitmap.getConfig());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Objects.toString(this.a);
                    }
                    g(this.d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.a.getClass();
                l.c(m.c(bitmap), bitmap.getConfig());
                bitmap.isMutable();
                this.b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    @NonNull
    public final Bitmap e(int i, int i2, Bitmap.Config config) {
        Bitmap f2 = f(i, i2, config);
        if (f2 != null) {
            f2.eraseColor(0);
            return f2;
        }
        if (config == null) {
            config = f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Nullable
    public final synchronized Bitmap f(int i, int i2, @Nullable Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap b;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                config2 = Bitmap.Config.HARDWARE;
                if (config == config2) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            b = this.a.b(i, i2, config != null ? config : f);
            if (b != null) {
                long j = this.e;
                this.a.getClass();
                this.e = j - m.c(b);
                this.c.getClass();
                b.setHasAlpha(true);
                b.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                this.a.getClass();
                l.c(m.d(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.a.getClass();
                l.c(m.d(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public final synchronized void g(long j) {
        while (this.e > j) {
            l lVar = this.a;
            Bitmap c = lVar.b.c();
            if (c != null) {
                lVar.a(Integer.valueOf(m.c(c)), c);
            }
            if (c == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.a);
                }
                this.e = 0L;
                return;
            }
            this.c.getClass();
            long j2 = this.e;
            this.a.getClass();
            this.e = j2 - m.c(c);
            if (Log.isLoggable("LruBitmapPool", 3)) {
                this.a.getClass();
                l.c(m.c(c), c.getConfig());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.a);
            }
            c.recycle();
        }
    }
}
