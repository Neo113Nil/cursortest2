package com.goldenboot.saga.zone;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ClipboardCompiler {
    public static volatile ClipboardCompiler detachStream;
    public static final Object releaseHeader = new Object();
    public final Context injectMetric;
    public final Set growPayload = new HashSet();
    public final Map evictLayout = new HashMap();

    public ClipboardCompiler(Context context) {
        this.injectMetric = context.getApplicationContext();
    }

    public static ClipboardCompiler releaseHeader(Context context) {
        if (detachStream == null) {
            synchronized (releaseHeader) {
                try {
                    if (detachStream == null) {
                        detachStream = new ClipboardCompiler(context);
                    }
                } finally {
                }
            }
        }
        return detachStream;
    }

    public Object clipOrigin(Class cls) {
        return injectMetric(cls);
    }

    public final Object detachStream(Class cls, Set set) {
        Object obj;
        if (TabSupervisor.injectMetric()) {
            try {
                TabSupervisor.evictLayout(cls.getSimpleName());
            } finally {
                TabSupervisor.growPayload();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.evictLayout.containsKey(cls)) {
            obj = this.evictLayout.get(cls);
        } else {
            set.add(cls);
            try {
                SlidePipeline slidePipeline = (SlidePipeline) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> evictLayout = slidePipeline.evictLayout();
                if (!evictLayout.isEmpty()) {
                    for (Class cls2 : evictLayout) {
                        if (!this.evictLayout.containsKey(cls2)) {
                            detachStream(cls2, set);
                        }
                    }
                }
                obj = slidePipeline.growPayload(this.injectMetric);
                set.remove(cls);
                this.evictLayout.put(cls, obj);
            } catch (Throwable th) {
                throw new HoverMerger(th);
            }
        }
        return obj;
    }

    public void evictLayout() {
        try {
            try {
                TabSupervisor.evictLayout("Startup");
                growPayload(this.injectMetric.getPackageManager().getProviderInfo(new ComponentName(this.injectMetric.getPackageName(), InitializationProvider.class.getName()), ContentOperation.SpotShadowColor).metaData);
            } catch (PackageManager.NameNotFoundException e) {
                throw new HoverMerger(e);
            }
        } finally {
            TabSupervisor.growPayload();
        }
    }

    public boolean flushSample(Class cls) {
        return this.growPayload.contains(cls);
    }

    public void growPayload(Bundle bundle) {
        String string = this.injectMetric.getString(ResponseChain.evictLayout);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (SlidePipeline.class.isAssignableFrom(cls)) {
                            this.growPayload.add(cls);
                        }
                    }
                }
                Iterator it = this.growPayload.iterator();
                while (it.hasNext()) {
                    detachStream((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new HoverMerger(e);
            }
        }
    }

    public Object injectMetric(Class cls) {
        Object obj;
        synchronized (releaseHeader) {
            try {
                obj = this.evictLayout.get(cls);
                if (obj == null) {
                    obj = detachStream(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
