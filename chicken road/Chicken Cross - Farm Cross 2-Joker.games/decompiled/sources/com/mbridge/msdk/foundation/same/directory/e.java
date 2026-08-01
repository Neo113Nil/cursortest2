package com.mbridge.msdk.foundation.same.directory;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MBridgeDirManager.java */
/* loaded from: classes6.dex */
public class e {
    private static volatile e c;

    /* renamed from: a, reason: collision with root package name */
    private final b f9331a;
    private final ArrayList<a> b = new ArrayList<>();

    /* compiled from: MBridgeDirManager.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public File f9332a;
        public c b;

        public a(c cVar, File file) {
            this.b = cVar;
            this.f9332a = file;
        }
    }

    private e(b bVar) {
        this.f9331a = bVar;
    }

    public static File a(c cVar) {
        try {
            if (b() == null || b().b == null || b().b.isEmpty()) {
                return null;
            }
            Iterator<a> it = b().b.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.b.equals(cVar)) {
                    return next.f9332a;
                }
            }
            return null;
        } catch (Throwable th) {
            q0.b("MBridgeDirManager", th.getMessage(), th);
            return null;
        }
    }

    public static String b(c cVar) {
        File a2 = a(cVar);
        if (a2 != null) {
            return a2.getAbsolutePath();
        }
        return null;
    }

    public static synchronized e b() {
        e eVar;
        synchronized (e.class) {
            if (c == null && com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                t0.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
            eVar = c;
        }
        return eVar;
    }

    public static synchronized void a(b bVar) {
        synchronized (e.class) {
            if (c == null) {
                c = new e(bVar);
            }
        }
    }

    public boolean a() {
        return a(this.f9331a.a());
    }

    private boolean a(com.mbridge.msdk.foundation.same.directory.a aVar) {
        String str;
        com.mbridge.msdk.foundation.same.directory.a c2 = aVar.c();
        if (c2 == null) {
            str = aVar.b();
        } else {
            File a2 = a(c2.d());
            if (a2 == null) {
                return false;
            }
            str = a2.getAbsolutePath() + File.separator + aVar.b();
        }
        File file = new File(str);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.b.add(new a(aVar.d(), file));
        List<com.mbridge.msdk.foundation.same.directory.a> a3 = aVar.a();
        if (a3 != null) {
            Iterator<com.mbridge.msdk.foundation.same.directory.a> it = a3.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
