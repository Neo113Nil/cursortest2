package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.resource.gif.c;
import com.bumptech.glide.util.m;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class a implements k<ByteBuffer, c> {
    public static final C0064a f = new C0064a();
    public static final b g = new b();
    public final Context a;
    public final ArrayList b;
    public final com.bumptech.glide.load.resource.gif.b e;
    public final C0064a d = f;
    public final b c = g;

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.resource.gif.a$a, reason: collision with other inner class name */
    public static class C0064a {
    }

    @VisibleForTesting
    public static class b {
        public final ArrayDeque a;

        public b() {
            char[] cArr = m.a;
            this.a = new ArrayDeque(0);
        }

        public final synchronized void a(com.bumptech.glide.gifdecoder.d dVar) {
            dVar.b = null;
            dVar.c = null;
            this.a.offer(dVar);
        }
    }

    public a(Context context, ArrayList arrayList, com.bumptech.glide.load.engine.bitmap_recycle.d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.a = context.getApplicationContext();
        this.b = arrayList;
        this.e = new com.bumptech.glide.load.resource.gif.b(dVar, bVar);
    }

    @Override // com.bumptech.glide.load.k
    public final boolean a(@NonNull ByteBuffer byteBuffer, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        return !((Boolean) iVar.b(i.b)).booleanValue() && com.bumptech.glide.load.f.c(this.b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.bumptech.glide.load.k
    public final com.bumptech.glide.load.engine.x<com.bumptech.glide.load.resource.gif.c> b(@androidx.annotation.NonNull java.nio.ByteBuffer r8, int r9, int r10, @androidx.annotation.NonNull com.bumptech.glide.load.i r11) throws java.io.IOException {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            com.bumptech.glide.load.resource.gif.a$b r8 = r7.c
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            com.bumptech.glide.gifdecoder.d r0 = (com.bumptech.glide.gifdecoder.d) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            com.bumptech.glide.gifdecoder.d r0 = new com.bumptech.glide.gifdecoder.d     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r0
            goto L1b
        L17:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L57
        L1b:
            r0 = 0
            r5.b = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.a     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            com.bumptech.glide.gifdecoder.c r0 = new com.bumptech.glide.gifdecoder.c     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.c = r0     // Catch: java.lang.Throwable -> L54
            r5.d = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.b = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.b     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            com.bumptech.glide.load.resource.gif.e r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            com.bumptech.glide.load.resource.gif.a$b r9 = r1.c
            r9.a(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            com.bumptech.glide.load.resource.gif.a$b r9 = r1.c
            r9.a(r5)
            throw r8
        L54:
            r0 = move-exception
            r1 = r7
        L56:
            r9 = r0
        L57:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L59
            throw r9
        L59:
            r0 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.gif.a.b(java.lang.Object, int, int, com.bumptech.glide.load.i):com.bumptech.glide.load.engine.x");
    }

    @Nullable
    public final e c(ByteBuffer byteBuffer, int i, int i2, com.bumptech.glide.gifdecoder.d dVar, com.bumptech.glide.load.i iVar) {
        int i3 = com.bumptech.glide.util.h.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            com.bumptech.glide.gifdecoder.c b2 = dVar.b();
            if (b2.c > 0 && b2.b == 0) {
                Bitmap.Config config = iVar.b(i.a) == com.bumptech.glide.load.b.b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int min = Math.min(b2.g / i2, b2.f / i);
                int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
                Log.isLoggable("BufferGifDecoder", 2);
                C0064a c0064a = this.d;
                com.bumptech.glide.load.resource.gif.b bVar = this.e;
                c0064a.getClass();
                com.bumptech.glide.gifdecoder.e eVar = new com.bumptech.glide.gifdecoder.e(bVar, b2, byteBuffer, max);
                eVar.d(config);
                eVar.b();
                Bitmap a = eVar.a();
                if (a == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        SystemClock.elapsedRealtimeNanos();
                        return null;
                    }
                    return null;
                }
                e eVar2 = new e(new c(new c.a(new g(com.bumptech.glide.b.a(this.a), eVar, i, i2, com.bumptech.glide.load.resource.c.b, a))));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
                return eVar2;
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
