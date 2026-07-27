package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.tracking.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class v6 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f5040a;
    public final e3 b;
    public final f3 c;
    public final AtomicReference d;
    public final ph e;
    public final k8 f;
    public int g = 1;
    public z1 h = null;
    public final PriorityQueue i = new PriorityQueue();
    public final l7 j;

    public v6(Executor executor, k8 k8Var, e3 e3Var, f3 f3Var, AtomicReference atomicReference, ph phVar, l7 l7Var) {
        this.f5040a = executor;
        this.f = k8Var;
        this.b = e3Var;
        this.c = f3Var;
        this.d = atomicReference;
        this.e = phVar;
        this.j = l7Var;
    }

    public synchronized void a(ue ueVar, Map map, AtomicInteger atomicInteger, u1 u1Var, String str) {
        AtomicInteger atomicInteger2 = new AtomicInteger();
        AtomicReference atomicReference = new AtomicReference(u1Var);
        for (t1 t1Var : map.values()) {
            this.i.add(new y1(ueVar, t1Var.b, t1Var.c, t1Var.f5012a, atomicInteger, atomicReference, atomicInteger2, str));
        }
        int i = this.g;
        if (i == 1 || i == 2) {
            d();
        }
    }

    public synchronized void b() {
        if (this.g == 1) {
            try {
                mb.a("########### Trimming the disk cache", null);
                File file = this.f.a().f4858a;
                ArrayList arrayList = new ArrayList();
                String[] list = file.list();
                if (list != null && list.length > 0) {
                    for (String str : list) {
                        if (!str.equalsIgnoreCase("requests") && !str.equalsIgnoreCase("track") && !str.equalsIgnoreCase("session") && !str.equalsIgnoreCase("videoCompletionEvents") && !str.equalsIgnoreCase("precache") && !str.contains(".")) {
                            arrayList.addAll(l3.a(new File(file, str), true));
                        }
                    }
                }
                int size = arrayList.size();
                File[] fileArr = new File[size];
                arrayList.toArray(fileArr);
                if (size > 1) {
                    Arrays.sort(fileArr, new Comparator() { // from class: com.chartboost.sdk.impl.v6$$ExternalSyntheticLambda0
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int compareTo;
                            compareTo = Long.valueOf(((File) obj).lastModified()).compareTo(Long.valueOf(((File) obj2).lastModified()));
                            return compareTo;
                        }
                    });
                }
                if (size > 0) {
                    com.chartboost.sdk.internal.Model.a aVar = (com.chartboost.sdk.internal.Model.a) this.d.get();
                    long j = aVar.n;
                    k8 k8Var = this.f;
                    long b = k8Var.b(k8Var.a().g);
                    long a2 = this.e.a();
                    List list2 = aVar.d;
                    mb.a("Total local file count:" + size, null);
                    mb.a("Video Folder Size in bytes :" + b, null);
                    mb.a("Max Bytes allowed:" + j, null);
                    int i = 0;
                    while (i < size) {
                        File file2 = fileArr[i];
                        long j2 = j;
                        com.chartboost.sdk.internal.Model.a aVar2 = aVar;
                        boolean z = TimeUnit.MILLISECONDS.toDays(a2 - file2.lastModified()) >= ((long) aVar.p);
                        boolean endsWith = file2.getName().endsWith(".tmp");
                        File parentFile = file2.getParentFile();
                        String absolutePath = parentFile != null ? parentFile.getAbsolutePath() : null;
                        boolean contains = absolutePath != null ? absolutePath.contains("/videos") : false;
                        boolean z2 = b > j2 && contains;
                        if (file2.length() != 0) {
                            if (!endsWith) {
                                if (!z) {
                                    if (!list2.contains(parentFile.getName())) {
                                        if (z2) {
                                        }
                                        i++;
                                        aVar = aVar2;
                                        j = j2;
                                    }
                                }
                            }
                        }
                        if (contains) {
                            b -= file2.length();
                        }
                        mb.a("Deleting file at path:" + file2.getPath(), null);
                        if (!file2.delete()) {
                            mb.b("Unable to delete " + file2.getPath(), null);
                            i++;
                            aVar = aVar2;
                            j = j2;
                        }
                        i++;
                        aVar = aVar2;
                        j = j2;
                    }
                }
            } catch (Exception e) {
                mb.b("reduceCacheSize", e);
            }
        }
    }

    public synchronized void c() {
        int i = this.g;
        if (i == 3) {
            mb.a("Change state to DOWNLOADING", null);
            this.g = 2;
        } else {
            if (i != 4) {
                return;
            }
            mb.a("Change state to IDLE", null);
            this.g = 1;
            d();
        }
    }

    public final void d() {
        y1 y1Var;
        y1 y1Var2;
        if (this.h != null && (y1Var2 = (y1) this.i.peek()) != null && this.h.m.b.b() > y1Var2.b.b() && this.h.b()) {
            this.i.add(this.h.m);
            this.h = null;
        }
        while (this.h == null && (y1Var = (y1) this.i.poll()) != null) {
            if (y1Var.g.get() > 0) {
                File file = new File(this.f.a().f4858a, y1Var.e);
                if (file.exists() || file.mkdirs() || file.isDirectory()) {
                    File file2 = new File(file, y1Var.c);
                    if (file2.exists()) {
                        this.f.d(file2);
                        y1Var.a(this.f5040a, true);
                    } else {
                        z1 z1Var = new z1(this, this.c, y1Var, file2, this.b.a());
                        this.h = z1Var;
                        this.b.a(z1Var);
                    }
                } else {
                    mb.b("Unable to create directory " + file.getPath(), null);
                    y1Var.a(this.f5040a, false);
                }
            }
        }
        if (this.h != null) {
            if (this.g != 2) {
                mb.a("Change state to DOWNLOADING", null);
                this.g = 2;
                return;
            }
            return;
        }
        if (this.g != 1) {
            mb.a("Change state to IDLE", null);
            this.g = 1;
        }
    }

    public synchronized void a(AtomicInteger atomicInteger) {
        atomicInteger.set(-10000);
        if (this.g == 2) {
            z1 z1Var = this.h;
            if (z1Var.m.g != atomicInteger) {
                return;
            }
            if (z1Var.b()) {
                this.h = null;
                d();
            }
        }
    }

    public synchronized void a() {
        int i = this.g;
        if (i == 1) {
            mb.a("Change state to PAUSED", null);
            this.g = 4;
        } else {
            if (i != 2) {
                return;
            }
            if (this.h.b()) {
                this.i.add(this.h.m);
                this.h = null;
                mb.a("Change state to PAUSED", null);
                this.g = 4;
                return;
            }
            mb.a("Change state to PAUSING", null);
            this.g = 3;
        }
    }

    public synchronized void a(z1 z1Var, CBError cBError, d3 d3Var) {
        int i = this.g;
        if ((i == 2 || i == 3) && z1Var == this.h) {
            this.h = null;
            long millis = TimeUnit.NANOSECONDS.toMillis(z1Var.f);
            y1 y1Var = z1Var.m;
            y1Var.i.addAndGet((int) millis);
            y1Var.a(this.f5040a, cBError == null);
            if (cBError == null) {
                mb.a("Downloaded " + y1Var.d, null);
            } else {
                String str = z1Var.m.f;
                String errorDesc = cBError.getErrorDesc();
                mb.a("Failed to download " + y1Var.d + (d3Var != null ? " Status code=" + d3Var.b() : "") + " Error message=" + errorDesc, null);
                String str2 = "Name: " + y1Var.c + " Url: " + y1Var.d + " Error: " + errorDesc;
                h7 a2 = this.j.a();
                if (a2 != null) {
                    a2.mo4759track(new com.chartboost.sdk.tracking.b(g.a.i, str2, str, "", null));
                }
            }
            if (this.g == 3) {
                mb.a("Change state to PAUSED", null);
                this.g = 4;
            } else {
                d();
            }
        }
    }
}
