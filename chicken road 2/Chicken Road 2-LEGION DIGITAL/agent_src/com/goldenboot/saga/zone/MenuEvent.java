package com.goldenboot.saga.zone;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class MenuEvent extends ContextWrapper {
    public static ArrayList detachStream;
    public static final Object injectMetric = new Object();
    public final Resources evictLayout;
    public final Resources.Theme growPayload;

    public MenuEvent(Context context) {
        super(context);
        if (!ClickAllocator.injectMetric()) {
            this.evictLayout = new ShapeSensor(this, context.getResources());
            this.growPayload = null;
            return;
        }
        ClickAllocator clickAllocator = new ClickAllocator(this, context.getResources());
        this.evictLayout = clickAllocator;
        Resources.Theme newTheme = clickAllocator.newTheme();
        this.growPayload = newTheme;
        newTheme.setTo(context.getTheme());
    }

    public static boolean evictLayout(Context context) {
        return ((context instanceof MenuEvent) || (context.getResources() instanceof ShapeSensor) || (context.getResources() instanceof ClickAllocator) || !ClickAllocator.injectMetric()) ? false : true;
    }

    public static Context growPayload(Context context) {
        if (!evictLayout(context)) {
            return context;
        }
        synchronized (injectMetric) {
            try {
                ArrayList arrayList = detachStream;
                if (arrayList == null) {
                    detachStream = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) detachStream.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            detachStream.remove(size);
                        }
                    }
                    for (int size2 = detachStream.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) detachStream.get(size2);
                        MenuEvent menuEvent = weakReference2 != null ? (MenuEvent) weakReference2.get() : null;
                        if (menuEvent != null && menuEvent.getBaseContext() == context) {
                            return menuEvent;
                        }
                    }
                }
                MenuEvent menuEvent2 = new MenuEvent(context);
                detachStream.add(new WeakReference(menuEvent2));
                return menuEvent2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.evictLayout.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.evictLayout;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.growPayload;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.growPayload;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
