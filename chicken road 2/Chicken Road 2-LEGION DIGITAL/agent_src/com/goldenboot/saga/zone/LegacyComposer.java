package com.goldenboot.saga.zone;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class LegacyComposer {
    public int applyTask;
    public int clipOrigin;
    public int detachStream;
    public int evictLayout;
    public int flushSample;
    public final IconSteward growPayload;
    public final JoystickGuardian injectMetric;
    public int releaseHeader;
    public int updateTimer;

    public LegacyComposer(int i) {
        this.evictLayout = i;
        if (!(i > 0)) {
            LifecycleCreator.evictLayout("maxSize <= 0");
        }
        this.growPayload = new IconSteward(0, 0.75f);
        this.injectMetric = new JoystickGuardian();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001c A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0010, B:13:0x001c, B:14:0x0021, B:16:0x0025, B:18:0x002e, B:20:0x0040), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[Catch: all -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0010, B:13:0x001c, B:14:0x0021, B:16:0x0025, B:18:0x002e, B:20:0x0040), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applyTask(int i) {
        boolean z;
        Map.Entry entry;
        Object key;
        Object value;
        while (true) {
            synchronized (this.injectMetric) {
                try {
                    if (this.detachStream < 0 || (this.growPayload.injectMetric() && this.detachStream != 0)) {
                        z = false;
                        if (!z) {
                            LifecycleCreator.growPayload("LruCache.sizeOf() is reporting inconsistent results!");
                        }
                        if (this.detachStream > i || this.growPayload.injectMetric()) {
                            break;
                        }
                        entry = (Map.Entry) CursorCollector.resumeSignature(this.growPayload.growPayload());
                        if (entry != null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        this.growPayload.releaseHeader(key);
                        this.detachStream -= clipOrigin(key, value);
                        this.flushSample++;
                    }
                    z = true;
                    if (!z) {
                    }
                    if (this.detachStream > i) {
                        break;
                        break;
                    } else {
                        entry = (Map.Entry) CursorCollector.resumeSignature(this.growPayload.growPayload());
                        if (entry != null) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            growPayload(true, key, value, null);
        }
    }

    public final int clipOrigin(Object obj, Object obj2) {
        int updateTimer = updateTimer(obj, obj2);
        if (!(updateTimer >= 0)) {
            LifecycleCreator.growPayload("Negative size: " + obj + '=' + obj2);
        }
        return updateTimer;
    }

    public final Object detachStream(Object key, Object value) {
        Object detachStream;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.injectMetric) {
            try {
                this.releaseHeader++;
                this.detachStream += clipOrigin(key, value);
                detachStream = this.growPayload.detachStream(key, value);
                if (detachStream != null) {
                    this.detachStream -= clipOrigin(key, detachStream);
                }
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (detachStream != null) {
            growPayload(false, key, detachStream, value);
        }
        applyTask(this.evictLayout);
        return detachStream;
    }

    public Object evictLayout(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    public final int flushSample() {
        int i;
        synchronized (this.injectMetric) {
            i = this.detachStream;
        }
        return i;
    }

    public void growPayload(boolean z, Object key, Object oldValue, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
    }

    public final Object injectMetric(Object key) {
        Object detachStream;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.injectMetric) {
            Object evictLayout = this.growPayload.evictLayout(key);
            if (evictLayout != null) {
                this.updateTimer++;
                return evictLayout;
            }
            this.applyTask++;
            Object evictLayout2 = evictLayout(key);
            if (evictLayout2 == null) {
                return null;
            }
            synchronized (this.injectMetric) {
                try {
                    this.clipOrigin++;
                    detachStream = this.growPayload.detachStream(key, evictLayout2);
                    if (detachStream != null) {
                        this.growPayload.detachStream(key, detachStream);
                    } else {
                        this.detachStream += clipOrigin(key, evictLayout2);
                        DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (detachStream != null) {
                growPayload(false, key, evictLayout2, detachStream);
                return detachStream;
            }
            applyTask(this.evictLayout);
            return evictLayout2;
        }
    }

    public final Object releaseHeader(Object key) {
        Object releaseHeader;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.injectMetric) {
            try {
                releaseHeader = this.growPayload.releaseHeader(key);
                if (releaseHeader != null) {
                    this.detachStream -= clipOrigin(key, releaseHeader);
                }
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (releaseHeader != null) {
            growPayload(false, key, releaseHeader, null);
        }
        return releaseHeader;
    }

    public String toString() {
        String str;
        synchronized (this.injectMetric) {
            try {
                int i = this.updateTimer;
                int i2 = this.applyTask + i;
                str = "LruCache[maxSize=" + this.evictLayout + ",hits=" + this.updateTimer + ",misses=" + this.applyTask + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public int updateTimer(Object key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return 1;
    }
}
