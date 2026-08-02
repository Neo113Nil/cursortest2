package com.tekartik.sqflite;

import android.os.HandlerThread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class j implements h {
    public final int b;
    public final int c;
    public final LinkedList<f> d = new LinkedList<>();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public final HashMap g = new HashMap();
    public final String a = "Sqflite";

    public j(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // com.tekartik.sqflite.h
    public final synchronized void a() {
        try {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                synchronized (gVar) {
                    HandlerThread handlerThread = gVar.c;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        gVar.c = null;
                        gVar.d = null;
                    }
                }
            }
            Iterator it2 = this.f.iterator();
            while (it2.hasNext()) {
                g gVar2 = (g) it2.next();
                synchronized (gVar2) {
                    HandlerThread handlerThread2 = gVar2.c;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        gVar2.c = null;
                        gVar2.d = null;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.tekartik.sqflite.h
    public final synchronized void b(f fVar) {
        this.d.add(fVar);
        Iterator it = new HashSet(this.e).iterator();
        while (it.hasNext()) {
            e((g) it.next());
        }
    }

    public final synchronized f d(g gVar) {
        f next;
        g gVar2;
        try {
            ListIterator<f> listIterator = this.d.listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                next = listIterator.next();
                gVar2 = next.a() != null ? (g) this.g.get(next.a()) : null;
                if (gVar2 == null) {
                    break;
                }
            } while (gVar2 != gVar);
            listIterator.remove();
            return next;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(g gVar) {
        try {
            f d = d(gVar);
            if (d != null) {
                this.f.add(gVar);
                this.e.remove(gVar);
                if (d.a() != null) {
                    this.g.put(d.a(), gVar);
                }
                gVar.d.post(new com.google.android.exoplayer2.drm.n(1, gVar, d));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.tekartik.sqflite.h
    public final synchronized void start() {
        for (int i = 0; i < this.b; i++) {
            g gVar = new g(this.a + i, this.c);
            gVar.a(new i(0, this, gVar));
            this.e.add(gVar);
        }
    }
}
