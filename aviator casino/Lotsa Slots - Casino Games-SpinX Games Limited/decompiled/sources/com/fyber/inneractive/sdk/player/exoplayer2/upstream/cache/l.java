package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f4084a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i d;
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a f;
    public final java.util.HashMap c = new java.util.HashMap();
    public final java.util.HashMap e = new java.util.HashMap();

    public l(java.io.File file, com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j jVar) {
        this.f4084a = file;
        this.b = jVar;
        this.d = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i(file);
        android.os.ConditionVariable conditionVariable = new android.os.ConditionVariable();
        new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.k(this, conditionVariable).start();
        conditionVariable.block();
    }

    public final synchronized com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m a(java.lang.String str, long j) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m a2;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m mVar;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a aVar = this.f;
        if (aVar != null) {
            throw aVar;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h) this.d.f4081a.get(str);
        if (hVar == null) {
            mVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m(str, j, -1L, -9223372036854775807L, null);
        } else {
            while (true) {
                a2 = hVar.a(j);
                if (!a2.d || a2.e.length() == a2.c) {
                    break;
                }
                a();
            }
            mVar = a2;
        }
        if (!mVar.d) {
            if (this.c.containsKey(str)) {
                return null;
            }
            this.c.put(str, mVar);
            return mVar;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h hVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h) this.d.f4081a.get(str);
        if (!hVar2.c.remove(mVar)) {
            throw new java.lang.IllegalStateException();
        }
        int i = hVar2.f4080a;
        if (!mVar.d) {
            throw new java.lang.IllegalStateException();
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.io.File parentFile = mVar.e.getParentFile();
        long j2 = mVar.b;
        java.util.regex.Pattern pattern = com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m.g;
        java.io.File file = new java.io.File(parentFile, i + "." + j2 + "." + currentTimeMillis + ".v3.exo");
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m mVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m(mVar.f4079a, mVar.b, mVar.c, currentTimeMillis, file);
        if (!mVar.e.renameTo(file)) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a("Renaming of " + mVar.e + " to " + file + " failed.");
        }
        hVar2.c.add(mVar2);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.e.get(mVar.f4079a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j jVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j) arrayList.get(size);
                jVar.f4082a.remove(mVar);
                jVar.b -= mVar.c;
                jVar.f4082a.add(mVar2);
                jVar.b += mVar2.c;
                jVar.a(this, 0L);
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j jVar2 = this.b;
        jVar2.f4082a.remove(mVar);
        jVar2.b -= mVar.c;
        jVar2.f4082a.add(mVar2);
        jVar2.b += mVar2.c;
        jVar2.a(this, 0L);
        return mVar2;
    }

    public final synchronized void b(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m mVar) {
        if (mVar != this.c.remove(mVar.f4079a)) {
            throw new java.lang.IllegalStateException();
        }
        notifyAll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d8, code lost:
    
        if (r5 == null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l lVar) {
        java.io.DataInputStream dataInputStream;
        java.io.DataInputStream dataInputStream2;
        java.io.File[] listFiles;
        java.io.BufferedInputStream bufferedInputStream;
        if (!lVar.f4084a.exists()) {
            lVar.f4084a.mkdirs();
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i iVar = lVar.d;
        if (!iVar.f) {
            java.io.DataInputStream dataInputStream3 = null;
            try {
                try {
                    bufferedInputStream = new java.io.BufferedInputStream(iVar.c.a());
                    dataInputStream = new java.io.DataInputStream(bufferedInputStream);
                    try {
                    } catch (java.io.FileNotFoundException unused) {
                    } catch (java.io.IOException e) {
                        e = e;
                        android.util.Log.e("CachedContentIndex", "Error reading cache content index file.", e);
                        if (dataInputStream != null) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(dataInputStream);
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar = iVar.c;
                        cVar.f4103a.delete();
                        cVar.b.delete();
                        iVar.f4081a.clear();
                        iVar.b.clear();
                        listFiles = lVar.f4084a.listFiles();
                        if (listFiles != null) {
                        }
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (dataInputStream2 != null) {
                    }
                    throw th;
                }
            } catch (java.io.FileNotFoundException unused2) {
                dataInputStream = null;
            } catch (java.io.IOException e2) {
                e = e2;
                dataInputStream = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
            if (dataInputStream.readInt() == 1) {
                if ((dataInputStream.readInt() & 1) != 0) {
                    if (iVar.d != null) {
                        byte[] bArr = new byte[16];
                        dataInputStream.readFully(bArr);
                        try {
                            iVar.d.init(2, iVar.e, new javax.crypto.spec.IvParameterSpec(bArr));
                            dataInputStream = new java.io.DataInputStream(new javax.crypto.CipherInputStream(bufferedInputStream, iVar.d));
                        } catch (java.security.InvalidAlgorithmParameterException e3) {
                            e = e3;
                            throw new java.lang.IllegalStateException(e);
                        } catch (java.security.InvalidKeyException e4) {
                            e = e4;
                            throw new java.lang.IllegalStateException(e);
                        }
                    }
                } else if (iVar.d != null) {
                    iVar.f = true;
                }
                try {
                    int readInt = dataInputStream.readInt();
                    int i = 0;
                    for (int i2 = 0; i2 < readInt; i2++) {
                        int readInt2 = dataInputStream.readInt();
                        java.lang.String readUTF = dataInputStream.readUTF();
                        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h hVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h(readInt2, readUTF, dataInputStream.readLong());
                        iVar.f4081a.put(readUTF, hVar);
                        iVar.b.put(readInt2, readUTF);
                        int hashCode = readUTF.hashCode();
                        long j = hVar.d;
                        i += ((hashCode + (readInt2 * 31)) * 31) + ((int) (j ^ (j >>> 32)));
                    }
                    if (dataInputStream.readInt() == i) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(dataInputStream);
                        listFiles = lVar.f4084a.listFiles();
                        if (listFiles != null) {
                            return;
                        }
                        for (java.io.File file : listFiles) {
                            if (!file.getName().equals("cached_content_index.exi")) {
                                com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m a2 = file.length() > 0 ? com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m.a(file, lVar.d) : null;
                                if (a2 != null) {
                                    lVar.a(a2);
                                } else {
                                    file.delete();
                                }
                            }
                        }
                        lVar.d.a();
                        lVar.d.b();
                        return;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(dataInputStream);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar2 = iVar.c;
                    cVar2.f4103a.delete();
                    cVar2.b.delete();
                    iVar.f4081a.clear();
                    iVar.b.clear();
                    listFiles = lVar.f4084a.listFiles();
                    if (listFiles != null) {
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    dataInputStream3 = dataInputStream;
                    dataInputStream2 = dataInputStream3;
                    if (dataInputStream2 != null) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(dataInputStream2);
                    }
                    throw th;
                }
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(dataInputStream);
            com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar22 = iVar.c;
            cVar22.f4103a.delete();
            cVar22.b.delete();
            iVar.f4081a.clear();
            iVar.b.clear();
            listFiles = lVar.f4084a.listFiles();
            if (listFiles != null) {
            }
        } else {
            throw new java.lang.IllegalStateException();
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m mVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i iVar = this.d;
        java.lang.String str = mVar.f4079a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h) iVar.f4081a.get(str);
        if (hVar == null) {
            hVar = iVar.a(str, -1L);
        }
        hVar.c.add(mVar);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.e.get(mVar.f4079a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j jVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j) arrayList.get(size);
                jVar.f4082a.add(mVar);
                jVar.b += mVar.c;
                jVar.a(this, 0L);
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j jVar2 = this.b;
        jVar2.f4082a.add(mVar);
        jVar2.b += mVar.c;
        jVar2.a(this, 0L);
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g gVar, boolean z) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h) this.d.f4081a.get(gVar.f4079a);
        if (hVar == null || !hVar.c.remove(gVar)) {
            return;
        }
        gVar.e.delete();
        if (z && hVar.c.isEmpty()) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i iVar = this.d;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h hVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h) iVar.f4081a.remove(hVar.b);
            if (hVar2 != null) {
                if (hVar2.c.isEmpty()) {
                    iVar.b.remove(hVar2.f4080a);
                    iVar.f = true;
                } else {
                    throw new java.lang.IllegalStateException();
                }
            }
            this.d.b();
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.e.get(gVar.f4079a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j jVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j) arrayList.get(size);
                jVar.f4082a.remove(gVar);
                jVar.b -= gVar.c;
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j jVar2 = this.b;
        jVar2.f4082a.remove(gVar);
        jVar2.b -= gVar.c;
    }

    public final void a() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = this.d.f4081a.values().iterator();
        while (it.hasNext()) {
            java.util.Iterator it2 = ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h) it.next()).c.iterator();
            while (it2.hasNext()) {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g) it2.next();
                if (gVar.e.length() != gVar.c) {
                    linkedList.add(gVar);
                }
            }
        }
        java.util.Iterator it3 = linkedList.iterator();
        while (it3.hasNext()) {
            a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g) it3.next(), false);
        }
        this.d.a();
        this.d.b();
    }

    public final synchronized long a(java.lang.String str) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h hVar;
        hVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h) this.d.f4081a.get(str);
        return hVar == null ? -1L : hVar.d;
    }
}
