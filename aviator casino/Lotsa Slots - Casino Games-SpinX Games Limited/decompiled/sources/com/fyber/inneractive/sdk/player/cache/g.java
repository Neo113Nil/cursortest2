package com.fyber.inneractive.sdk.player.cache;

/* loaded from: classes3.dex */
public final class g implements java.io.Closeable {
    public static final java.util.regex.Pattern p = java.util.regex.Pattern.compile("[a-z0-9_-]{1,120}");
    public static final com.fyber.inneractive.sdk.player.cache.b q = new com.fyber.inneractive.sdk.player.cache.b();

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f3870a;
    public final java.io.File b;
    public final java.io.File c;
    public final java.io.File d;
    public final long f;
    public java.io.BufferedWriter i;
    public int k;
    public com.fyber.inneractive.sdk.player.cache.f l;
    public long h = 0;
    public final java.util.LinkedHashMap j = new java.util.LinkedHashMap(0, 0.75f, true);
    public long m = 0;
    public final java.util.concurrent.ThreadPoolExecutor n = new java.util.concurrent.ThreadPoolExecutor(0, 1, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue());
    public final com.fyber.inneractive.sdk.player.cache.a o = new com.fyber.inneractive.sdk.player.cache.a(this);
    public final int e = 0;
    public final int g = 1;

    public g(java.io.File file, long j) {
        this.f3870a = file;
        this.b = new java.io.File(file, coil.disk.DiskLruCache.JOURNAL_FILE);
        this.c = new java.io.File(file, coil.disk.DiskLruCache.JOURNAL_FILE_TMP);
        this.d = new java.io.File(file, coil.disk.DiskLruCache.JOURNAL_FILE_BACKUP);
        this.f = j;
    }

    public static void a(com.fyber.inneractive.sdk.player.cache.g gVar, com.fyber.inneractive.sdk.player.cache.d dVar, boolean z) {
        int i;
        synchronized (gVar) {
            com.fyber.inneractive.sdk.player.cache.e eVar = dVar.f3868a;
            if (eVar.d != dVar) {
                throw new java.lang.IllegalStateException();
            }
            if (z && !eVar.c) {
                for (int i2 = 0; i2 < gVar.g; i2++) {
                    if (!dVar.b[i2]) {
                        a(dVar.d, dVar, false);
                        throw new java.lang.IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                    if (!eVar.b(i2).exists()) {
                        a(dVar.d, dVar, false);
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < gVar.g; i3++) {
                java.io.File b = eVar.b(i3);
                if (!z) {
                    a(b);
                } else if (b.exists()) {
                    java.io.File a2 = eVar.a(i3);
                    b.renameTo(a2);
                    long j = eVar.b[i3];
                    long length = a2.length();
                    eVar.b[i3] = length;
                    gVar.h = (gVar.h - j) + length;
                }
            }
            gVar.k++;
            eVar.d = null;
            if (eVar.c || z) {
                eVar.c = true;
                java.io.BufferedWriter bufferedWriter = gVar.i;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("CLEAN ");
                sb.append(eVar.f3869a);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                for (long j2 : eVar.b) {
                    sb2.append(' ');
                    sb2.append(j2);
                }
                sb.append(sb2.toString());
                sb.append('\n');
                bufferedWriter.write(sb.toString());
                if (z) {
                    gVar.m++;
                }
            } else {
                gVar.j.remove(eVar.f3869a);
                gVar.i.write("REMOVE " + eVar.f3869a + '\n');
            }
            gVar.i.flush();
            if (gVar.h > gVar.f || ((i = gVar.k) >= 2000 && i >= gVar.j.size())) {
                gVar.n.submit(gVar.o);
            }
        }
    }

    public final void b() {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.b);
        java.nio.charset.Charset charset = com.fyber.inneractive.sdk.player.cache.l.f3874a;
        com.fyber.inneractive.sdk.player.cache.k kVar = new com.fyber.inneractive.sdk.player.cache.k(fileInputStream);
        try {
            java.lang.String a2 = kVar.a();
            java.lang.String a3 = kVar.a();
            java.lang.String a4 = kVar.a();
            java.lang.String a5 = kVar.a();
            java.lang.String a6 = kVar.a();
            if (!coil.disk.DiskLruCache.MAGIC.equals(a2) || !"1".equals(a3) || !java.lang.Integer.toString(this.e).equals(a4) || !java.lang.Integer.toString(this.g).equals(a5) || !"".equals(a6)) {
                throw new java.io.IOException("unexpected journal header: [" + a2 + ", " + a3 + ", " + a5 + ", " + a6 + com.ironsource.X3.j.e);
            }
            int i = 0;
            while (true) {
                try {
                    b(kVar.a());
                    i++;
                } catch (java.io.EOFException unused) {
                    this.k = i - this.j.size();
                    if (kVar.e == -1) {
                        c();
                    } else {
                        this.i = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.b, true), com.fyber.inneractive.sdk.player.cache.l.f3874a));
                    }
                    try {
                        kVar.close();
                        return;
                    } catch (java.lang.RuntimeException e) {
                        throw e;
                    } catch (java.lang.Exception unused2) {
                        return;
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            try {
                kVar.close();
            } catch (java.lang.RuntimeException e2) {
                throw e2;
            } catch (java.lang.Exception unused3) {
            }
            throw th;
        }
    }

    public final synchronized void c() {
        java.io.BufferedWriter bufferedWriter = this.i;
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        java.io.BufferedWriter bufferedWriter2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.c), com.fyber.inneractive.sdk.player.cache.l.f3874a));
        try {
            bufferedWriter2.write(coil.disk.DiskLruCache.MAGIC);
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(java.lang.Integer.toString(this.e));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(java.lang.Integer.toString(this.g));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (com.fyber.inneractive.sdk.player.cache.e eVar : this.j.values()) {
                if (eVar.d != null) {
                    bufferedWriter2.write("DIRTY " + eVar.f3869a + '\n');
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("CLEAN ");
                    sb.append(eVar.f3869a);
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    for (long j : eVar.b) {
                        sb2.append(' ');
                        sb2.append(j);
                    }
                    sb.append(sb2.toString());
                    sb.append('\n');
                    bufferedWriter2.write(sb.toString());
                }
            }
            bufferedWriter2.close();
            if (this.b.exists()) {
                java.io.File file = this.b;
                java.io.File file2 = this.d;
                a(file2);
                if (!file.renameTo(file2)) {
                    throw new java.io.IOException();
                }
            }
            if (!this.c.renameTo(this.b)) {
                throw new java.io.IOException();
            }
            this.d.delete();
            this.i = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.b, true), com.fyber.inneractive.sdk.player.cache.l.f3874a));
        } catch (java.lang.Throwable th) {
            bufferedWriter2.close();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.i == null) {
            return;
        }
        java.util.Iterator it = new java.util.ArrayList(this.j.values()).iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.player.cache.d dVar = ((com.fyber.inneractive.sdk.player.cache.e) it.next()).d;
            if (dVar != null) {
                a(dVar.d, dVar, false);
            }
        }
        d();
        this.i.close();
        this.i = null;
    }

    public final void d() {
        while (this.h > this.f) {
            java.lang.String str = (java.lang.String) ((java.util.Map.Entry) this.j.entrySet().iterator().next()).getKey();
            com.fyber.inneractive.sdk.player.cache.f fVar = this.l;
            if (fVar == null) {
                c(str);
            } else if (fVar.a(str)) {
                c(str);
            } else {
                boolean z = false;
                for (java.lang.String str2 : this.j.keySet()) {
                    if (this.l.a(str2)) {
                        z |= c(str2);
                    }
                }
                if (!z) {
                    return;
                }
            }
        }
    }

    public final void b(java.lang.String str) {
        java.lang.String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            com.fyber.inneractive.sdk.player.cache.e eVar = (com.fyber.inneractive.sdk.player.cache.e) this.j.get(substring);
            if (eVar == null) {
                eVar = new com.fyber.inneractive.sdk.player.cache.e(this, substring);
                this.j.put(substring, eVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                java.lang.String[] split = str.substring(indexOf2 + 1).split(io.ktor.sse.ServerSentEventKt.SPACE);
                eVar.c = true;
                eVar.d = null;
                if (split.length == eVar.e.g) {
                    for (int i2 = 0; i2 < split.length; i2++) {
                        try {
                            eVar.b[i2] = java.lang.Long.parseLong(split[i2]);
                        } catch (java.lang.NumberFormatException unused) {
                            throw new java.io.IOException("unexpected journal line: " + java.util.Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new java.io.IOException("unexpected journal line: " + java.util.Arrays.toString(split));
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                eVar.d = new com.fyber.inneractive.sdk.player.cache.d(this, eVar);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new java.io.IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        throw new java.io.IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized boolean c(java.lang.String str) {
        com.fyber.inneractive.sdk.util.IAlog.e("DiskLruCache remove %s", str);
        if (this.i != null) {
            if (p.matcher(str).matches()) {
                com.fyber.inneractive.sdk.player.cache.e eVar = (com.fyber.inneractive.sdk.player.cache.e) this.j.get(str);
                if (eVar != null && eVar.d == null) {
                    for (int i = 0; i < this.g; i++) {
                        java.io.File a2 = eVar.a(i);
                        if (a2.exists() && !a2.delete()) {
                            throw new java.io.IOException("failed to delete " + a2);
                        }
                        long j = this.h;
                        long[] jArr = eVar.b;
                        this.h = j - jArr[i];
                        jArr[i] = 0;
                    }
                    this.k++;
                    this.i.append((java.lang.CharSequence) ("REMOVE " + str + '\n'));
                    this.j.remove(str);
                    int i2 = this.k;
                    if (i2 >= 2000 && i2 >= this.j.size()) {
                        this.n.submit(this.o);
                    }
                    return true;
                }
                return false;
            }
            throw new java.lang.IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
        throw new java.lang.IllegalStateException("cache is closed");
    }

    public static com.fyber.inneractive.sdk.player.cache.g a(java.io.File file, long j) {
        if (j > 0) {
            java.io.File file2 = new java.io.File(file, coil.disk.DiskLruCache.JOURNAL_FILE_BACKUP);
            if (file2.exists()) {
                java.io.File file3 = new java.io.File(file, coil.disk.DiskLruCache.JOURNAL_FILE);
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new java.io.IOException();
                }
            }
            com.fyber.inneractive.sdk.player.cache.g gVar = new com.fyber.inneractive.sdk.player.cache.g(file, j);
            if (gVar.b.exists()) {
                try {
                    gVar.b();
                    gVar.a();
                    return gVar;
                } catch (java.io.IOException e) {
                    java.lang.System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    com.fyber.inneractive.sdk.util.IAlog.e("DiskLruCache delete cache", new java.lang.Object[0]);
                    gVar.close();
                    com.fyber.inneractive.sdk.player.cache.l.a(gVar.f3870a);
                }
            }
            file.mkdirs();
            com.fyber.inneractive.sdk.player.cache.g gVar2 = new com.fyber.inneractive.sdk.player.cache.g(file, j);
            gVar2.c();
            return gVar2;
        }
        throw new java.lang.IllegalArgumentException("maxSize <= 0");
    }

    public final void a() {
        a(this.c);
        java.util.Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.player.cache.e eVar = (com.fyber.inneractive.sdk.player.cache.e) it.next();
            int i = 0;
            if (eVar.d == null) {
                while (i < this.g) {
                    this.h += eVar.b[i];
                    i++;
                }
            } else {
                eVar.d = null;
                while (i < this.g) {
                    a(eVar.a(i));
                    a(eVar.b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public static void a(java.io.File file) {
        com.fyber.inneractive.sdk.util.IAlog.e("DiskLruCache deleteIfExists - %s", file);
        if (file.exists() && !file.delete()) {
            throw new java.io.IOException();
        }
    }

    public final com.fyber.inneractive.sdk.player.cache.d a(java.lang.String str) {
        synchronized (this) {
            if (this.i != null) {
                if (p.matcher(str).matches()) {
                    com.fyber.inneractive.sdk.player.cache.e eVar = (com.fyber.inneractive.sdk.player.cache.e) this.j.get(str);
                    if (eVar == null) {
                        eVar = new com.fyber.inneractive.sdk.player.cache.e(this, str);
                        this.j.put(str, eVar);
                    } else if (eVar.d != null) {
                        return null;
                    }
                    com.fyber.inneractive.sdk.player.cache.d dVar = new com.fyber.inneractive.sdk.player.cache.d(this, eVar);
                    eVar.d = dVar;
                    this.i.write("DIRTY " + str + '\n');
                    this.i.flush();
                    return dVar;
                }
                throw new java.lang.IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            throw new java.lang.IllegalStateException("cache is closed");
        }
    }
}
