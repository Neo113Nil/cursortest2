package com.alexmercerind.media_kit_video;

import android.os.Handler;
import android.os.Looper;
import com.alexmercerind.mediakitandroidhelper.MediaKitAndroidHelper;
import io.flutter.view.TextureRegistry;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes3.dex */
public class VideoOutput implements TextureRegistry.SurfaceProducer.Callback {
    private static final String TAG = "VideoOutput";
    private static final Method deleteGlobalObjectRef;
    private static final HashSet<Long> deletedGlobalObjectRefs = new HashSet<>();
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static final Method newGlobalObjectRef;
    private final TextureRegistry.SurfaceProducer surfaceProducer;
    private final TextureUpdateCallback textureUpdateCallback;

    /* renamed from: id, reason: collision with root package name */
    private long f65id = 0;
    private long wid = 0;
    private final Object lock = new Object();

    static {
        int i = MediaKitAndroidHelper.a;
        Method declaredMethod = MediaKitAndroidHelper.class.getDeclaredMethod("newGlobalObjectRef", Object.class);
        newGlobalObjectRef = declaredMethod;
        Method declaredMethod2 = MediaKitAndroidHelper.class.getDeclaredMethod("deleteGlobalObjectRef", Long.TYPE);
        deleteGlobalObjectRef = declaredMethod2;
        declaredMethod.setAccessible(true);
        declaredMethod2.setAccessible(true);
    }

    public VideoOutput(TextureRegistry textureRegistry, TextureUpdateCallback textureUpdateCallback) {
        this.textureUpdateCallback = textureUpdateCallback;
        TextureRegistry.SurfaceProducer createSurfaceProducer = textureRegistry.createSurfaceProducer();
        this.surfaceProducer = createSurfaceProducer;
        createSurfaceProducer.setCallback(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void deleteGlobalObjectRef(long j) {
        HashSet<Long> hashSet = deletedGlobalObjectRefs;
        if (hashSet.contains(Long.valueOf(j))) {
            Locale locale = Locale.ENGLISH;
            StringBuilder sb = new StringBuilder("deleteGlobalObjectRef: ref = ");
            sb.append(j);
            sb.append(" ALREADY DELETED");
            return;
        }
        if (hashSet.size() > 100) {
            hashSet.clear();
        }
        hashSet.add(Long.valueOf(j));
        Locale locale2 = Locale.ENGLISH;
        new StringBuilder("deleteGlobalObjectRef: ref = ").append(j);
        try {
            deleteGlobalObjectRef.invoke(null, Long.valueOf(j));
        } catch (Throwable unused) {
        }
    }

    private static long newGlobalObjectRef(Object obj) {
        String.format(Locale.ENGLISH, "newGlobalRef: object = %s", obj);
        try {
            Object invoke = newGlobalObjectRef.invoke(null, obj);
            Objects.requireNonNull(invoke);
            return ((Long) invoke).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public void dispose() {
        synchronized (this.lock) {
            try {
                this.surfaceProducer.getSurface().release();
            } catch (Throwable unused) {
            }
            try {
                this.surfaceProducer.release();
            } catch (Throwable unused2) {
            }
            onSurfaceCleanup();
        }
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
    public void onSurfaceAvailable() {
        synchronized (this.lock) {
            this.f65id = this.surfaceProducer.id();
            long newGlobalObjectRef2 = newGlobalObjectRef(this.surfaceProducer.getSurface());
            this.wid = newGlobalObjectRef2;
            this.textureUpdateCallback.onTextureUpdate(this.f65id, newGlobalObjectRef2, this.surfaceProducer.getWidth(), this.surfaceProducer.getHeight());
        }
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
    public void onSurfaceCleanup() {
        synchronized (this.lock) {
            try {
                this.textureUpdateCallback.onTextureUpdate(this.f65id, 0L, this.surfaceProducer.getWidth(), this.surfaceProducer.getHeight());
                final long j = this.wid;
                if (j != 0) {
                    handler.postDelayed(new Runnable() { // from class: com.alexmercerind.media_kit_video.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            VideoOutput.deleteGlobalObjectRef(j);
                        }
                    }, 5000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setSurfaceSize(int i, int i2) {
        setSurfaceSize(i, i2, false);
    }

    private void setSurfaceSize(int i, int i2, boolean z) {
        synchronized (this.lock) {
            if (!z) {
                try {
                    if (this.surfaceProducer.getWidth() == i && this.surfaceProducer.getHeight() == i2) {
                        return;
                    }
                } catch (Throwable unused) {
                }
            }
            this.surfaceProducer.setSize(i, i2);
            onSurfaceAvailable();
        }
    }
}
