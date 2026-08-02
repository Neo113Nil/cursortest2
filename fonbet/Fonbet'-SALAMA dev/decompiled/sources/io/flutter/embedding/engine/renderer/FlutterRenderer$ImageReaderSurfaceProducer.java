package io.flutter.embedding.engine.renderer;

import W5.r;
import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.Keep;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.o;
import io.flutter.view.p;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

@Keep
/* loaded from: classes2.dex */
final class FlutterRenderer$ImageReaderSurfaceProducer implements TextureRegistry$SurfaceProducer, TextureRegistry$ImageConsumer, o {
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_DEQUEUED_IMAGES = 2;
    private static final int MAX_IMAGES = 6;
    private static final String TAG = "ImageReaderSurfaceProducer";
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;
    private p callback;
    private final long id;
    private boolean released;
    final /* synthetic */ k this$0;
    private boolean ignoringFence = false;
    private int requestedWidth = 1;
    private int requestedHeight = 1;
    private boolean createNewReader = true;
    private boolean notifiedDestroy = false;
    private long lastDequeueTime = 0;
    private long lastQueueTime = 0;
    private long lastScheduleTime = 0;
    private int numTrims = 0;
    private final Object lock = new Object();
    private final ArrayDeque<g> imageReaderQueue = new ArrayDeque<>();
    private final HashMap<ImageReader, g> perImageReaders = new HashMap<>();
    private ArrayList<e> lastDequeuedImage = new ArrayList<>();
    private g lastReaderDequeuedFrom = null;

    public FlutterRenderer$ImageReaderSurfaceProducer(k kVar, long j) {
        this.this$0 = kVar;
        this.id = j;
    }

    public static /* synthetic */ p access$200(FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer) {
        flutterRenderer$ImageReaderSurfaceProducer.getClass();
        return null;
    }

    private void cleanup() {
        synchronized (this.lock) {
            try {
                for (g gVar : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == gVar) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    gVar.f14081c = true;
                    gVar.f14079a.close();
                    gVar.f14080b.clear();
                }
                this.perImageReaders.clear();
                if (this.lastDequeuedImage.size() > 0) {
                    Iterator<e> it = this.lastDequeuedImage.iterator();
                    while (it.hasNext()) {
                        it.next().f14076a.close();
                    }
                    this.lastDequeuedImage.clear();
                }
                g gVar2 = this.lastReaderDequeuedFrom;
                if (gVar2 != null) {
                    gVar2.f14081c = true;
                    gVar2.f14079a.close();
                    gVar2.f14080b.clear();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ImageReader createImageReader() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            return createImageReader33();
        }
        if (i7 >= 29) {
            return createImageReader29();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    private ImageReader createImageReader29() {
        ImageReader newInstance;
        newInstance = ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 6, 256L);
        return newInstance;
    }

    private ImageReader createImageReader33() {
        ImageReader build;
        Q.b.q();
        ImageReader.Builder g3 = Q.b.g(this.requestedWidth, this.requestedHeight);
        g3.setMaxImages(6);
        g3.setImageFormat(34);
        g3.setUsage(256L);
        build = g3.build();
        return build;
    }

    private g getActiveReader() {
        synchronized (this.lock) {
            try {
                if (!this.createNewReader) {
                    return this.imageReaderQueue.peekLast();
                }
                this.createNewReader = false;
                return getOrCreatePerImageReader(createImageReader());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$dequeueImage$0() {
        if (this.released) {
            return;
        }
        this.this$0.f14106a.scheduleFrame();
    }

    private void maybeWaitOnFence(Image image) {
        if (image == null || this.ignoringFence) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            waitOnFence(image);
        } else {
            this.ignoringFence = true;
        }
    }

    private void releaseInternal() {
        cleanup();
        this.released = true;
        this.this$0.f(this);
        this.this$0.f14112g.remove(this);
    }

    private void waitOnFence(Image image) {
        SyncFence fence;
        try {
            fence = image.getFence();
            fence.awaitForever();
        } catch (IOException unused) {
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageConsumer
    public Image acquireLatestImage() {
        e dequeueImage = dequeueImage();
        if (dequeueImage == null) {
            return null;
        }
        Image image = dequeueImage.f14076a;
        maybeWaitOnFence(image);
        return image;
    }

    public double deltaMillis(long j) {
        return j / 1000000.0d;
    }

    public e dequeueImage() {
        e eVar;
        boolean z4;
        synchronized (this.lock) {
            try {
                Iterator<g> it = this.imageReaderQueue.iterator();
                eVar = null;
                while (true) {
                    z4 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    g next = it.next();
                    ArrayDeque arrayDeque = next.f14080b;
                    e eVar2 = arrayDeque.isEmpty() ? null : (e) arrayDeque.removeFirst();
                    if (eVar2 == null) {
                        eVar = eVar2;
                    } else {
                        while (this.lastDequeuedImage.size() > 2) {
                            this.lastDequeuedImage.remove(0).f14076a.close();
                        }
                        this.lastDequeuedImage.add(eVar2);
                        this.lastReaderDequeuedFrom = next;
                        eVar = eVar2;
                    }
                }
                pruneImageReaderQueue();
                Iterator<g> it2 = this.imageReaderQueue.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().f14080b.isEmpty()) {
                        z4 = true;
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            this.this$0.f14110e.post(new d(this, 0));
        }
        return eVar;
    }

    public void disableFenceForTest() {
        this.ignoringFence = true;
    }

    public void finalize() {
        try {
            if (this.released) {
                return;
            }
            releaseInternal();
            k kVar = this.this$0;
            kVar.f14110e.post(new r(this.id, kVar.f14106a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getHeight() {
        return this.requestedHeight;
    }

    public g getOrCreatePerImageReader(ImageReader imageReader) {
        g gVar = this.perImageReaders.get(imageReader);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, imageReader);
        this.perImageReaders.put(imageReader, gVar2);
        this.imageReaderQueue.add(gVar2);
        return gVar2;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getSurface() {
        return getActiveReader().f14079a.getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getWidth() {
        return this.requestedWidth;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public boolean handlesCropAndRotation() {
        return false;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public long id() {
        return this.id;
    }

    public int numImageReaders() {
        int size;
        synchronized (this.lock) {
            size = this.imageReaderQueue.size();
        }
        return size;
    }

    public int numImages() {
        int i7;
        synchronized (this.lock) {
            try {
                Iterator<g> it = this.imageReaderQueue.iterator();
                i7 = 0;
                while (it.hasNext()) {
                    i7 += it.next().f14080b.size();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i7;
    }

    public int numTrims() {
        int i7;
        synchronized (this.lock) {
            i7 = this.numTrims;
        }
        return i7;
    }

    public void onImage(ImageReader imageReader, Image image) {
        e eVar;
        synchronized (this.lock) {
            g orCreatePerImageReader = getOrCreatePerImageReader(imageReader);
            if (orCreatePerImageReader.f14081c) {
                eVar = null;
            } else {
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = orCreatePerImageReader.f14082d;
                System.nanoTime();
                e eVar2 = new e(flutterRenderer$ImageReaderSurfaceProducer, image);
                ArrayDeque arrayDeque = orCreatePerImageReader.f14080b;
                arrayDeque.add(eVar2);
                while (arrayDeque.size() > 2) {
                    ((e) arrayDeque.removeFirst()).f14076a.close();
                }
                eVar = eVar2;
            }
        }
        if (eVar == null) {
            return;
        }
        this.this$0.f14106a.scheduleFrame();
    }

    @Override // io.flutter.view.o
    public void onTrimMemory(int i7) {
        if (i7 < 40) {
            return;
        }
        synchronized (this.lock) {
            this.numTrims++;
        }
        cleanup();
        this.createNewReader = true;
    }

    public int pendingDequeuedImages() {
        return this.lastDequeuedImage.size();
    }

    public void pruneImageReaderQueue() {
        g peekFirst;
        while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null) {
            ArrayDeque arrayDeque = peekFirst.f14080b;
            if (!arrayDeque.isEmpty() || peekFirst.f14082d.lastReaderDequeuedFrom == peekFirst) {
                return;
            }
            this.imageReaderQueue.removeFirst();
            HashMap<ImageReader, g> hashMap = this.perImageReaders;
            ImageReader imageReader = peekFirst.f14079a;
            hashMap.remove(imageReader);
            peekFirst.f14081c = true;
            imageReader.close();
            arrayDeque.clear();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void release() {
        if (this.released) {
            return;
        }
        releaseInternal();
        k kVar = this.this$0;
        kVar.f14106a.unregisterTexture(this.id);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void scheduleFrame() {
        this.this$0.f14106a.scheduleFrame();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setCallback(p pVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setSize(int i7, int i8) {
        int max = Math.max(1, i7);
        int max2 = Math.max(1, i8);
        if (this.requestedWidth == max && this.requestedHeight == max2) {
            return;
        }
        this.createNewReader = true;
        this.requestedHeight = max2;
        this.requestedWidth = max;
    }
}
