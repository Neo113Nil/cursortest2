package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DownloadRequestQueue.java */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, d> f8998a;
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<d>> b;
    private final AtomicInteger c;

    /* compiled from: DownloadRequestQueue.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final f f8999a = new f();
    }

    public static f a() {
        return b.f8999a;
    }

    private int b() {
        return this.c.incrementAndGet();
    }

    public void c() {
    }

    private f() {
        this.f8998a = new ConcurrentHashMap<>();
        this.c = new AtomicInteger();
        this.b = new ConcurrentHashMap<>();
    }

    public synchronized void a(d dVar) {
        String e = dVar.e();
        dVar.a(b());
        if (this.f8998a.containsKey(e)) {
            dVar.b(dVar.i() != 7 ? 8 : 7);
            if (this.b.containsKey(e)) {
                CopyOnWriteArrayList<d> copyOnWriteArrayList = this.b.get(e);
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.add(dVar);
                    this.b.remove(e);
                    this.b.put(e, copyOnWriteArrayList);
                }
            } else {
                CopyOnWriteArrayList<d> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList2.add(dVar);
                this.b.put(e, copyOnWriteArrayList2);
            }
        } else {
            dVar.b(dVar.i() != 7 ? 2 : 7);
            this.f8998a.put(e, dVar);
            dVar.a(i.b().a().getDownloadTasks().submit(new h(dVar)));
        }
    }

    public synchronized void b(d dVar) {
        CopyOnWriteArrayList<d> remove;
        String e = dVar.e();
        this.f8998a.remove(e);
        if (this.b.containsKey(e) && (remove = this.b.remove(e)) != null && !remove.isEmpty()) {
            d remove2 = remove.remove(0);
            remove2.b(2);
            this.f8998a.put(e, remove2);
            remove2.a(i.b().a().getDownloadTasks().submit(new h(remove2)));
            if (!remove.isEmpty()) {
                this.b.put(e, remove);
            }
        }
    }

    public synchronized void a(String str) {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if (!TextUtils.isEmpty(str) && this.b.containsKey(str) && (copyOnWriteArrayList = this.b.get(str)) != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator<d> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                d next = it.next();
                copyOnWriteArrayList.remove(next);
                next.b(next.c());
            }
            if (!copyOnWriteArrayList.isEmpty()) {
                this.b.remove(str);
                this.b.put(str, copyOnWriteArrayList);
            } else {
                this.b.remove(str);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            a(this.f8998a.get(str), str);
        }
    }

    private void a(d dVar, String str) {
        if (dVar != null) {
            dVar.a(dVar.c());
            this.f8998a.remove(str);
        }
    }
}
