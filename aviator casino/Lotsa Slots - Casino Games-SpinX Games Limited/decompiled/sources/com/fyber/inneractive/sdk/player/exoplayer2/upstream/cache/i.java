package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

/* loaded from: classes3.dex */
public final class i {
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.c c;
    public boolean f;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.p g;
    public final javax.crypto.Cipher d = null;
    public final javax.crypto.spec.SecretKeySpec e = null;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f4081a = new java.util.HashMap();
    public final android.util.SparseArray b = new android.util.SparseArray();

    public i(java.io.File file) {
        this.c = new com.fyber.inneractive.sdk.player.exoplayer2.util.c(new java.io.File(file, "cached_content_index.exi"));
    }

    public final void a() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h hVar : this.f4081a.values()) {
            if (hVar.c.isEmpty()) {
                linkedList.add(hVar.b);
            }
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h hVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h) this.f4081a.remove((java.lang.String) it.next());
            if (hVar2 != null) {
                if (!hVar2.c.isEmpty()) {
                    throw new java.lang.IllegalStateException();
                }
                this.b.remove(hVar2.f4080a);
                this.f = true;
            }
        }
    }

    public final void b() {
        java.io.DataOutputStream dataOutputStream;
        java.io.IOException e;
        java.lang.Throwable th;
        if (!this.f) {
            return;
        }
        java.io.DataOutputStream dataOutputStream2 = null;
        try {
            com.fyber.inneractive.sdk.player.exoplayer2.util.b b = this.c.b();
            com.fyber.inneractive.sdk.player.exoplayer2.util.p pVar = this.g;
            if (pVar == null) {
                this.g = new com.fyber.inneractive.sdk.player.exoplayer2.util.p(b);
            } else {
                pVar.a(b);
            }
            dataOutputStream = new java.io.DataOutputStream(this.g);
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(this.d != null ? 1 : 0);
                if (this.d != null) {
                    byte[] bArr = new byte[16];
                    new java.util.Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.d.init(1, this.e, new javax.crypto.spec.IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream2 = new java.io.DataOutputStream(new javax.crypto.CipherOutputStream(this.g, this.d));
                    } catch (java.security.InvalidAlgorithmParameterException e2) {
                        e = e2;
                        throw new java.lang.IllegalStateException(e);
                    } catch (java.security.InvalidKeyException e3) {
                        e = e3;
                        throw new java.lang.IllegalStateException(e);
                    }
                } else {
                    dataOutputStream2 = dataOutputStream;
                }
                dataOutputStream2.writeInt(this.f4081a.size());
                int i = 0;
                for (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h hVar : this.f4081a.values()) {
                    dataOutputStream2.writeInt(hVar.f4080a);
                    dataOutputStream2.writeUTF(hVar.b);
                    dataOutputStream2.writeLong(hVar.d);
                    int hashCode = (hVar.b.hashCode() + (hVar.f4080a * 31)) * 31;
                    long j = hVar.d;
                    i += hashCode + ((int) (j ^ (j >>> 32)));
                }
                dataOutputStream2.writeInt(i);
                com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar = this.c;
                cVar.getClass();
                dataOutputStream2.close();
                cVar.b.delete();
                int i2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
                this.f = false;
            } catch (java.io.IOException e4) {
                e = e4;
                try {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a(e);
                } catch (java.lang.Throwable th2) {
                    java.io.DataOutputStream dataOutputStream3 = dataOutputStream;
                    th = th2;
                    dataOutputStream2 = dataOutputStream3;
                    java.lang.Throwable th3 = th;
                    dataOutputStream = dataOutputStream2;
                    th = th3;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(dataOutputStream);
                    throw th;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(dataOutputStream);
                throw th;
            }
        } catch (java.io.IOException e5) {
            dataOutputStream = dataOutputStream2;
            e = e5;
        } catch (java.lang.Throwable th5) {
            th = th5;
            java.lang.Throwable th32 = th;
            dataOutputStream = dataOutputStream2;
            th = th32;
            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(dataOutputStream);
            throw th;
        }
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h a(java.lang.String str, long j) {
        android.util.SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h hVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h(keyAt, str, j);
        this.f4081a.put(str, hVar);
        this.b.put(keyAt, str);
        this.f = true;
        return hVar;
    }
}
