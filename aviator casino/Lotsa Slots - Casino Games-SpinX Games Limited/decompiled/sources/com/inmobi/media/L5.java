package com.inmobi.media;

/* loaded from: classes5.dex */
public final class L5 implements java.io.Closeable {
    public static final java.util.regex.Pattern p = java.util.regex.Pattern.compile("[a-z0-9_-]{1,64}");
    public static final com.inmobi.media.E5 q = new com.inmobi.media.E5();
    public final java.io.File b;
    public final java.io.File c;
    public final java.io.File d;
    public final java.io.File e;
    public final com.inmobi.media.J5 g;
    public final long j;
    public java.io.BufferedWriter l;
    public int m;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ThreadPoolExecutor f4811a = new java.util.concurrent.ThreadPoolExecutor(0, 1, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue());
    public final java.util.LinkedHashMap i = new java.util.LinkedHashMap(0, 0.75f, true);
    public long k = 0;
    public long n = 0;
    public final com.inmobi.media.F5 o = new com.inmobi.media.F5(this);
    public final int f = 1;
    public final int h = 2;

    public L5(java.io.File file, long j, com.inmobi.media.J5 j5) {
        this.b = file;
        this.c = new java.io.File(file, coil.disk.DiskLruCache.JOURNAL_FILE);
        this.d = new java.io.File(file, coil.disk.DiskLruCache.JOURNAL_FILE_TMP);
        this.e = new java.io.File(file, coil.disk.DiskLruCache.JOURNAL_FILE_BACKUP);
        this.j = j;
        this.g = j5;
    }

    public final void a() {
        java.io.File file = this.d;
        if (file.exists() && !file.delete()) {
            throw new java.io.IOException();
        }
        java.util.Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            com.inmobi.media.I5 i5 = (com.inmobi.media.I5) it.next();
            int i = 0;
            if (i5.d == null) {
                while (i < this.h) {
                    this.k += i5.b[i];
                    i++;
                }
            } else {
                i5.d = null;
                while (i < this.h) {
                    java.io.File a2 = i5.a(i);
                    if (a2.exists() && !a2.delete()) {
                        throw new java.io.IOException();
                    }
                    java.io.File b = i5.b(i);
                    if (b.exists() && !b.delete()) {
                        throw new java.io.IOException();
                    }
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void b() {
        com.inmobi.media.Xj xj = new com.inmobi.media.Xj(new java.io.FileInputStream(this.c), com.inmobi.media.AbstractC2758sl.f5451a);
        try {
            java.lang.String a2 = xj.a();
            java.lang.String a3 = xj.a();
            java.lang.String a4 = xj.a();
            java.lang.String a5 = xj.a();
            java.lang.String a6 = xj.a();
            if (!coil.disk.DiskLruCache.MAGIC.equals(a2) || !"1".equals(a3) || !java.lang.Integer.toString(this.f).equals(a4) || !java.lang.Integer.toString(this.h).equals(a5) || !"".equals(a6)) {
                throw new java.io.IOException("unexpected journal header: [" + a2 + ", " + a3 + ", " + a5 + ", " + a6 + com.ironsource.X3.j.e);
            }
            int i = 0;
            while (true) {
                try {
                    c(xj.a());
                    i++;
                } catch (java.io.EOFException unused) {
                    this.m = i - this.i.size();
                    com.inmobi.media.AbstractC2758sl.a(xj);
                    return;
                }
            }
        } catch (java.lang.Throwable th) {
            com.inmobi.media.AbstractC2758sl.a(xj);
            throw th;
        }
    }

    public final void c(java.lang.String str) {
        java.lang.String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new java.io.IOException("unexpected journal line: ".concat(str));
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.i.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        com.inmobi.media.I5 i5 = (com.inmobi.media.I5) this.i.get(substring);
        if (i5 == null) {
            i5 = new com.inmobi.media.I5(this, substring);
            this.i.put(substring, i5);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                i5.d = new com.inmobi.media.H5(this, i5);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new java.io.IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        java.lang.String[] split = str.substring(indexOf2 + 1).split(io.ktor.sse.ServerSentEventKt.SPACE);
        i5.c = true;
        i5.d = null;
        if (split.length != i5.e.h) {
            throw new java.io.IOException("unexpected journal line: " + java.util.Arrays.toString(split));
        }
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                i5.b[i2] = java.lang.Long.parseLong(split[i2]);
            } catch (java.lang.NumberFormatException unused) {
                throw new java.io.IOException("unexpected journal line: " + java.util.Arrays.toString(split));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.l == null) {
            return;
        }
        java.util.Iterator it = new java.util.ArrayList(this.i.values()).iterator();
        while (it.hasNext()) {
            com.inmobi.media.H5 h5 = ((com.inmobi.media.I5) it.next()).d;
            if (h5 != null) {
                h5.d.a(h5, false);
            }
        }
        while (this.k > this.j) {
            d((java.lang.String) ((java.util.Map.Entry) this.i.entrySet().iterator().next()).getKey());
        }
        this.l.close();
        this.l = null;
    }

    public final synchronized void d(java.lang.String str) {
        if (this.l == null) {
            throw new java.lang.IllegalStateException("cache is closed");
        }
        if (!p.matcher(str).matches()) {
            throw new java.lang.IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
        com.inmobi.media.I5 i5 = (com.inmobi.media.I5) this.i.get(str);
        if (i5 != null && i5.d == null) {
            for (int i = 0; i < this.h; i++) {
                java.io.File file = i5.a(i);
                if (this.g != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
                    if (str != null && i == 0) {
                        java.lang.String str2 = "";
                        try {
                            java.lang.String a2 = com.inmobi.media.AbstractC2758sl.a(new java.io.InputStreamReader(new java.io.FileInputStream(file), com.inmobi.media.AbstractC2758sl.b));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "readFully(...)");
                            str2 = a2;
                        } catch (java.lang.Exception unused) {
                        }
                        java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("urlKey", str), kotlin.TuplesKt.to("url", str2));
                        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
                        com.inmobi.media.C2624nk.b("ResourceDiskCacheFileEvicted", mutableMapOf, com.inmobi.media.EnumC2728rk.f5431a);
                    }
                }
                if (file.exists() && !file.delete()) {
                    throw new java.io.IOException("failed to delete " + file);
                }
                long j = this.k;
                long[] jArr = i5.b;
                this.k = j - jArr[i];
                jArr[i] = 0;
            }
            this.m++;
            this.l.append((java.lang.CharSequence) ("REMOVE " + str + '\n'));
            this.i.remove(str);
            int i2 = this.m;
            if (i2 >= 2000 && i2 >= this.i.size()) {
                this.f4811a.submit(this.o);
            }
        }
    }

    public final com.inmobi.media.H5 a(java.lang.String str) {
        synchronized (this) {
            if (this.l != null) {
                if (p.matcher(str).matches()) {
                    com.inmobi.media.I5 i5 = (com.inmobi.media.I5) this.i.get(str);
                    if (i5 == null) {
                        i5 = new com.inmobi.media.I5(this, str);
                        this.i.put(str, i5);
                    } else if (i5.d != null) {
                        return null;
                    }
                    com.inmobi.media.H5 h5 = new com.inmobi.media.H5(this, i5);
                    i5.d = h5;
                    this.l.write("DIRTY " + str + '\n');
                    this.l.flush();
                    return h5;
                }
                throw new java.lang.IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
            }
            throw new java.lang.IllegalStateException("cache is closed");
        }
    }

    public final synchronized void c() {
        java.io.BufferedWriter bufferedWriter = this.l;
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        java.io.BufferedWriter bufferedWriter2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.d), com.inmobi.media.AbstractC2758sl.f5451a));
        try {
            bufferedWriter2.write(coil.disk.DiskLruCache.MAGIC);
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(java.lang.Integer.toString(this.f));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(java.lang.Integer.toString(this.h));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (com.inmobi.media.I5 i5 : this.i.values()) {
                if (i5.d != null) {
                    bufferedWriter2.write("DIRTY " + i5.f4757a + '\n');
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("CLEAN ");
                    sb.append(i5.f4757a);
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    for (long j : i5.b) {
                        sb2.append(' ');
                        sb2.append(j);
                    }
                    sb.append(sb2.toString());
                    sb.append('\n');
                    bufferedWriter2.write(sb.toString());
                }
            }
            bufferedWriter2.close();
            if (this.c.exists()) {
                java.io.File file = this.c;
                java.io.File file2 = this.e;
                if (file2.exists() && !file2.delete()) {
                    throw new java.io.IOException();
                }
                if (!file.renameTo(file2)) {
                    throw new java.io.IOException();
                }
            }
            if (this.d.renameTo(this.c)) {
                this.e.delete();
                this.l = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.c, true), com.inmobi.media.AbstractC2758sl.f5451a));
            } else {
                throw new java.io.IOException();
            }
        } catch (java.lang.Throwable th) {
            bufferedWriter2.close();
            throw th;
        }
    }

    public final synchronized void a(com.inmobi.media.H5 h5, boolean z) {
        int i;
        com.inmobi.media.I5 i5 = h5.f4739a;
        if (i5.d == h5) {
            if (z && !i5.c) {
                for (int i2 = 0; i2 < this.h; i2++) {
                    if (h5.b[i2]) {
                        if (!i5.b(i2).exists()) {
                            h5.d.a(h5, false);
                            return;
                        }
                    } else {
                        h5.d.a(h5, false);
                        throw new java.lang.IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                }
            }
            for (int i3 = 0; i3 < this.h; i3++) {
                java.io.File b = i5.b(i3);
                if (z) {
                    if (b.exists()) {
                        java.io.File a2 = i5.a(i3);
                        b.renameTo(a2);
                        long j = i5.b[i3];
                        long length = a2.length();
                        i5.b[i3] = length;
                        this.k = (this.k - j) + length;
                    }
                } else if (b.exists() && !b.delete()) {
                    throw new java.io.IOException();
                }
            }
            this.m++;
            i5.d = null;
            if (i5.c | z) {
                i5.c = true;
                java.io.BufferedWriter bufferedWriter = this.l;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("CLEAN ");
                sb.append(i5.f4757a);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                for (long j2 : i5.b) {
                    sb2.append(' ');
                    sb2.append(j2);
                }
                sb.append(sb2.toString());
                sb.append('\n');
                bufferedWriter.write(sb.toString());
                if (z) {
                    this.n++;
                }
            } else {
                this.i.remove(i5.f4757a);
                this.l.write("REMOVE " + i5.f4757a + '\n');
            }
            this.l.flush();
            if (this.k > this.j || ((i = this.m) >= 2000 && i >= this.i.size())) {
                this.f4811a.submit(this.o);
                return;
            }
            return;
        }
        throw new java.lang.IllegalStateException("CurrentEditor of Entry didn't match with CurrentEditor instance.");
    }

    public final synchronized com.inmobi.media.K5 b(java.lang.String key) {
        java.io.InputStream inputStream;
        if (this.l != null) {
            if (p.matcher(key).matches()) {
                com.inmobi.media.I5 i5 = (com.inmobi.media.I5) this.i.get(key);
                if (i5 == null) {
                    return null;
                }
                if (!i5.c) {
                    return null;
                }
                java.io.InputStream[] inputStreamArr = new java.io.InputStream[this.h];
                for (int i = 0; i < this.h; i++) {
                    try {
                        inputStreamArr[i] = new java.io.FileInputStream(i5.a(i));
                    } catch (java.io.FileNotFoundException unused) {
                        if (this.g != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                            java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("urlKey", key));
                            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
                            com.inmobi.media.C2624nk.b("ResourceDiskCacheFileMissing", mutableMapOf, com.inmobi.media.EnumC2728rk.f5431a);
                        }
                        for (int i2 = 0; i2 < this.h && (inputStream = inputStreamArr[i2]) != null; i2++) {
                            com.inmobi.media.AbstractC2758sl.a(inputStream);
                        }
                        return null;
                    }
                }
                this.m++;
                this.l.append((java.lang.CharSequence) ("READ " + key + '\n'));
                int i3 = this.m;
                if (i3 >= 2000 && i3 >= this.i.size()) {
                    this.f4811a.submit(this.o);
                }
                return new com.inmobi.media.K5(inputStreamArr);
            }
            throw new java.lang.IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + key + "\"");
        }
        throw new java.lang.IllegalStateException("cache is closed");
    }
}
