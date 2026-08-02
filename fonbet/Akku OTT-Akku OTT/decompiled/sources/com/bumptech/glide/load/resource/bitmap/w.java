package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.l;
import com.bumptech.glide.load.resource.bitmap.q;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class w implements com.bumptech.glide.load.k<InputStream, Bitmap> {
    public final l a;
    public final com.bumptech.glide.load.engine.bitmap_recycle.b b;

    public static class a implements l.b {
        public final u a;
        public final com.bumptech.glide.util.d b;

        public a(u uVar, com.bumptech.glide.util.d dVar) {
            this.a = uVar;
            this.b = dVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l.b
        public final void a(Bitmap bitmap, com.bumptech.glide.load.engine.bitmap_recycle.d dVar) throws IOException {
            IOException iOException = this.b.b;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                dVar.d(bitmap);
                throw iOException;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l.b
        public final void b() {
            u uVar = this.a;
            synchronized (uVar) {
                uVar.c = uVar.a.length;
            }
        }
    }

    public w(l lVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.a = lVar;
        this.b = bVar;
    }

    @Override // com.bumptech.glide.load.k
    public final boolean a(@NonNull InputStream inputStream, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        this.a.getClass();
        return true;
    }

    @Override // com.bumptech.glide.load.k
    public final com.bumptech.glide.load.engine.x<Bitmap> b(@NonNull InputStream inputStream, int i, int i2, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        boolean z;
        u uVar;
        com.bumptech.glide.util.d dVar;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof u) {
            uVar = (u) inputStream2;
            z = false;
        } else {
            z = true;
            uVar = new u(inputStream2, this.b);
        }
        ArrayDeque arrayDeque = com.bumptech.glide.util.d.c;
        synchronized (arrayDeque) {
            dVar = (com.bumptech.glide.util.d) arrayDeque.poll();
        }
        if (dVar == null) {
            dVar = new com.bumptech.glide.util.d();
        }
        com.bumptech.glide.util.d dVar2 = dVar;
        dVar2.a = uVar;
        com.bumptech.glide.util.j jVar = new com.bumptech.glide.util.j(dVar2);
        a aVar = new a(uVar, dVar2);
        try {
            l lVar = this.a;
            e a2 = lVar.a(new q.b(jVar, lVar.d, lVar.c), i, i2, iVar, aVar);
            dVar2.b = null;
            dVar2.a = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(dVar2);
            }
            if (z) {
                uVar.l();
            }
            return a2;
        } catch (Throwable th) {
            dVar2.b = null;
            dVar2.a = null;
            ArrayDeque arrayDeque2 = com.bumptech.glide.util.d.c;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(dVar2);
                if (!z) {
                    throw th;
                }
                uVar.l();
                throw th;
            }
        }
    }
}
