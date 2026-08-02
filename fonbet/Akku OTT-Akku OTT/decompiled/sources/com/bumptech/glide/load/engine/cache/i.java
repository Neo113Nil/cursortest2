package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import com.bumptech.glide.util.m;
import com.bumptech.glide.util.pool.a;
import com.bumptech.glide.util.pool.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class i {
    public final com.bumptech.glide.util.i<com.bumptech.glide.load.g, String> a = new com.bumptech.glide.util.i<>(1000);
    public final a.c b = com.bumptech.glide.util.pool.a.a(10, new a());

    public class a implements a.b<b> {
        @Override // com.bumptech.glide.util.pool.a.b
        public final b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static final class b implements a.d {
        public final MessageDigest a;
        public final d.a b = new d.a();

        public b(MessageDigest messageDigest) {
            this.a = messageDigest;
        }

        @Override // com.bumptech.glide.util.pool.a.d
        @NonNull
        public final d.a b() {
            return this.b;
        }
    }

    public final String a(com.bumptech.glide.load.g gVar) {
        String str;
        synchronized (this.a) {
            str = this.a.get(gVar);
        }
        if (str == null) {
            b bVar = (b) this.b.acquire();
            try {
                gVar.updateDiskCacheKey(bVar.a);
                byte[] digest = bVar.a.digest();
                char[] cArr = m.b;
                synchronized (cArr) {
                    for (int i = 0; i < digest.length; i++) {
                        byte b2 = digest[i];
                        int i2 = b2 & UByte.MAX_VALUE;
                        int i3 = i * 2;
                        char[] cArr2 = m.a;
                        cArr[i3] = cArr2[i2 >>> 4];
                        cArr[i3 + 1] = cArr2[b2 & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                this.b.release(bVar);
            }
        }
        synchronized (this.a) {
            this.a.put(gVar, str);
        }
        return str;
    }
}
