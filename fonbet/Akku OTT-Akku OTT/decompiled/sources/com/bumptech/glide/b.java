package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.g;
import com.bumptech.glide.load.engine.cache.h;
import com.bumptech.glide.load.engine.executor.a;
import com.bumptech.glide.manager.p;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class b implements ComponentCallbacks2 {

    @GuardedBy("Glide.class")
    public static volatile b j;
    public static volatile boolean k;
    public final com.bumptech.glide.load.engine.bitmap_recycle.d a;
    public final com.bumptech.glide.load.engine.cache.g b;
    public final f c;
    public final com.bumptech.glide.load.engine.bitmap_recycle.b d;
    public final p e;
    public final com.bumptech.glide.manager.c f;

    @GuardedBy("managers")
    public final ArrayList i = new ArrayList();

    public interface a {
    }

    public b(@NonNull Context context, @NonNull com.bumptech.glide.load.engine.m mVar, @NonNull com.bumptech.glide.load.engine.cache.g gVar, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.d dVar, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar, @NonNull p pVar, @NonNull com.bumptech.glide.manager.c cVar, int i, @NonNull a aVar, @NonNull Map map, @NonNull List list, @NonNull ArrayList arrayList, @Nullable com.bumptech.glide.module.a aVar2, @NonNull g gVar2) {
        this.a = dVar;
        this.d = bVar;
        this.b = gVar;
        this.e = pVar;
        this.f = cVar;
        this.c = new f(context, bVar, new j(this, arrayList, aVar2), aVar, map, list, mVar, gVar2, i);
    }

    @NonNull
    public static b a(@NonNull Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (j == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                Log.isLoggable("Glide", 5);
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (b.class) {
                if (j == null) {
                    if (k) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    k = true;
                    try {
                        b(context, generatedAppGlideModule);
                        k = false;
                    } catch (Throwable th) {
                        k = false;
                        throw th;
                    }
                }
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0 A[LOOP:3: B:49:0x00da->B:51:0x00e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023f  */
    @GuardedBy("Glide.class")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        Iterator it;
        Iterator it2;
        ApplicationInfo applicationInfo;
        ArrayMap arrayMap = new ArrayMap();
        g.a aVar = new g.a();
        c cVar = new c();
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable("ManifestParser", 6);
        }
        if (applicationInfo != null && applicationInfo.metaData != null) {
            if (Log.isLoggable("ManifestParser", 2)) {
                Objects.toString(applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(com.bumptech.glide.module.d.a(str));
                    Log.isLoggable("ManifestParser", 3);
                }
            }
            Log.isLoggable("ManifestParser", 3);
            if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
                HashSet hashSet = new HashSet();
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.bumptech.glide.module.b bVar = (com.bumptech.glide.module.b) it2.next();
                    if (hashSet.contains(bVar.getClass())) {
                        if (Log.isLoggable("Glide", 3)) {
                            bVar.toString();
                        }
                        it2.remove();
                    }
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((com.bumptech.glide.module.b) it3.next()).getClass().toString();
                }
            }
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.module.b) it.next()).b();
            }
            a.ThreadFactoryC0057a threadFactoryC0057a = new a.ThreadFactoryC0057a();
            if (com.bumptech.glide.load.engine.executor.a.c == 0) {
                com.bumptech.glide.load.engine.executor.a.c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i = com.bumptech.glide.load.engine.executor.a.c;
            if (!TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            com.bumptech.glide.load.engine.executor.a aVar2 = new com.bumptech.glide.load.engine.executor.a(new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(threadFactoryC0057a, "source", false)));
            int i2 = com.bumptech.glide.load.engine.executor.a.c;
            a.ThreadFactoryC0057a threadFactoryC0057a2 = new a.ThreadFactoryC0057a();
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            com.bumptech.glide.load.engine.executor.a aVar3 = new com.bumptech.glide.load.engine.executor.a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(threadFactoryC0057a2, "disk-cache", true)));
            if (com.bumptech.glide.load.engine.executor.a.c == 0) {
                com.bumptech.glide.load.engine.executor.a.c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i3 = com.bumptech.glide.load.engine.executor.a.c >= 4 ? 2 : 1;
            a.ThreadFactoryC0057a threadFactoryC0057a3 = new a.ThreadFactoryC0057a();
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            com.bumptech.glide.load.engine.executor.a aVar4 = new com.bumptech.glide.load.engine.executor.a(new ThreadPoolExecutor(i3, i3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(threadFactoryC0057a3, "animation", true)));
            com.bumptech.glide.load.engine.cache.h hVar = new com.bumptech.glide.load.engine.cache.h(new h.a(applicationContext));
            com.bumptech.glide.manager.e eVar = new com.bumptech.glide.manager.e();
            int i4 = hVar.a;
            com.bumptech.glide.load.engine.bitmap_recycle.d jVar = i4 > 0 ? new com.bumptech.glide.load.engine.bitmap_recycle.j(i4) : new com.bumptech.glide.load.engine.bitmap_recycle.e();
            com.bumptech.glide.load.engine.bitmap_recycle.i iVar = new com.bumptech.glide.load.engine.bitmap_recycle.i(hVar.c);
            com.bumptech.glide.load.engine.cache.g gVar = new com.bumptech.glide.load.engine.cache.g(hVar.b);
            b bVar2 = new b(applicationContext, new com.bumptech.glide.load.engine.m(gVar, new com.bumptech.glide.load.engine.cache.f(new com.bumptech.glide.load.engine.cache.e(applicationContext)), aVar3, aVar2, new com.bumptech.glide.load.engine.executor.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, com.bumptech.glide.load.engine.executor.a.b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.b(new a.ThreadFactoryC0057a(), "source-unlimited", false))), aVar4), gVar, jVar, iVar, new p(), eVar, 4, cVar, arrayMap, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new g(aVar));
            applicationContext.registerComponentCallbacks(bVar2);
            j = bVar2;
            return;
        }
        Log.isLoggable("ManifestParser", 3);
        if (generatedAppGlideModule != null) {
            HashSet hashSet2 = new HashSet();
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
            }
        }
        if (Log.isLoggable("Glide", 3)) {
        }
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        a.ThreadFactoryC0057a threadFactoryC0057a4 = new a.ThreadFactoryC0057a();
        if (com.bumptech.glide.load.engine.executor.a.c == 0) {
        }
        int i5 = com.bumptech.glide.load.engine.executor.a.c;
        if (!TextUtils.isEmpty("source")) {
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        com.bumptech.glide.util.m.a();
        this.b.clearMemory();
        this.a.b();
        this.d.b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        com.bumptech.glide.util.m.a();
        synchronized (this.i) {
            try {
                Iterator it = this.i.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.bumptech.glide.load.engine.cache.g gVar = this.b;
        gVar.getClass();
        if (i >= 40) {
            gVar.clearMemory();
        } else if (i >= 20 || i == 15) {
            gVar.trimToSize(gVar.getMaxSize() / 2);
        }
        this.a.a(i);
        this.d.a(i);
    }
}
