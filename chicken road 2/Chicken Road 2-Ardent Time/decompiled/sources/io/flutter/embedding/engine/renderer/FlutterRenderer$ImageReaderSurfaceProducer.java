package io.flutter.embedding.engine.renderer;

@androidx.annotation.Keep
/* loaded from: classes.dex */
final class FlutterRenderer$ImageReaderSurfaceProducer implements io.flutter.view.TextureRegistry$SurfaceProducer, io.flutter.view.TextureRegistry$ImageConsumer, io.flutter.view.o {
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_DEQUEUED_IMAGES = 2;
    private static final int MAX_IMAGES = 7;
    private static final java.lang.String TAG = "ImageReaderSurfaceProducer";
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;
    io.flutter.view.p callback;
    private final long id;
    private boolean released;
    final /* synthetic */ io.flutter.embedding.engine.renderer.h this$0;
    private boolean ignoringFence = false;
    private int requestedWidth = 1;
    private int requestedHeight = 1;
    private boolean createNewReader = true;
    boolean notifiedDestroy = false;
    private long lastDequeueTime = 0;
    private long lastQueueTime = 0;
    private long lastScheduleTime = 0;
    private int numTrims = 0;
    private final java.lang.Object lock = new java.lang.Object();
    private final java.util.ArrayDeque<io.flutter.embedding.engine.renderer.e> imageReaderQueue = new java.util.ArrayDeque<>();
    private final java.util.HashMap<android.media.ImageReader, io.flutter.embedding.engine.renderer.e> perImageReaders = new java.util.HashMap<>();
    private java.util.ArrayList<io.flutter.embedding.engine.renderer.c> lastDequeuedImage = new java.util.ArrayList<>();
    private io.flutter.embedding.engine.renderer.e lastReaderDequeuedFrom = null;

    public FlutterRenderer$ImageReaderSurfaceProducer(io.flutter.embedding.engine.renderer.h hVar, long j2) {
        this.this$0 = hVar;
        this.id = j2;
    }

    private void cleanup() {
        synchronized (this.lock) {
            try {
                for (io.flutter.embedding.engine.renderer.e eVar : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == eVar) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    eVar.f7647c = true;
                    eVar.f7645a.close();
                    eVar.f7646b.clear();
                }
                this.perImageReaders.clear();
                if (this.lastDequeuedImage.size() > 0) {
                    java.util.Iterator<io.flutter.embedding.engine.renderer.c> it = this.lastDequeuedImage.iterator();
                    while (it.hasNext()) {
                        it.next().f7642a.close();
                    }
                    this.lastDequeuedImage.clear();
                }
                io.flutter.embedding.engine.renderer.e eVar2 = this.lastReaderDequeuedFrom;
                if (eVar2 != null) {
                    eVar2.f7647c = true;
                    eVar2.f7645a.close();
                    eVar2.f7646b.clear();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private android.media.ImageReader createImageReader29() {
        android.media.ImageReader newInstance;
        newInstance = android.media.ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 7, 256L);
        return newInstance;
    }

    private android.media.ImageReader createImageReader33() {
        android.media.ImageReader build;
        F0.f.l();
        android.media.ImageReader.Builder g2 = F0.f.g(this.requestedWidth, this.requestedHeight);
        g2.setMaxImages(7);
        g2.setImageFormat(34);
        g2.setUsage(256L);
        build = g2.build();
        return build;
    }

    private io.flutter.embedding.engine.renderer.e getActiveReader() {
        synchronized (this.lock) {
            try {
                if (!this.createNewReader) {
                    io.flutter.embedding.engine.renderer.e peekLast = this.imageReaderQueue.peekLast();
                    if (peekLast.f7645a.getSurface().isValid()) {
                        return peekLast;
                    }
                }
                this.createNewReader = false;
                return getOrCreatePerImageReader(createImageReader());
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private io.flutter.embedding.engine.renderer.e getOrCreatePerImageReader(android.media.ImageReader imageReader) {
        io.flutter.embedding.engine.renderer.e eVar = this.perImageReaders.get(imageReader);
        if (eVar != null) {
            return eVar;
        }
        io.flutter.embedding.engine.renderer.e createPerImageReader = createPerImageReader(imageReader);
        this.perImageReaders.put(imageReader, createPerImageReader);
        this.imageReaderQueue.add(createPerImageReader);
        return createPerImageReader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$dequeueImage$0() {
        if (this.released) {
            return;
        }
        this.this$0.f7676a.scheduleFrame();
    }

    private void maybeWaitOnFence(android.media.Image image) {
        if (image == null || this.ignoringFence) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            waitOnFence(image);
        } else {
            this.ignoringFence = true;
        }
    }

    private void releaseInternal() {
        cleanup();
        this.released = true;
        java.util.HashSet hashSet = this.this$0.f7680e;
        java.util.Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference.get() == this) {
                hashSet.remove(weakReference);
                break;
            }
        }
        this.this$0.f7681f.remove(this);
    }

    private void waitOnFence(android.media.Image image) {
        android.hardware.SyncFence fence;
        try {
            fence = image.getFence();
            fence.awaitForever();
        } catch (java.io.IOException unused) {
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageConsumer
    public android.media.Image acquireLatestImage() {
        io.flutter.embedding.engine.renderer.c dequeueImage = dequeueImage();
        if (dequeueImage == null) {
            return null;
        }
        android.media.Image image = dequeueImage.f7642a;
        maybeWaitOnFence(image);
        return image;
    }

    public android.media.ImageReader createImageReader() {
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return createImageReader33();
        }
        if (i2 >= 29) {
            return createImageReader29();
        }
        throw new java.lang.UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    public io.flutter.embedding.engine.renderer.e createPerImageReader(android.media.ImageReader imageReader) {
        return new io.flutter.embedding.engine.renderer.e(this, imageReader);
    }

    public double deltaMillis(long j2) {
        return j2 / 1000000.0d;
    }

    public io.flutter.embedding.engine.renderer.c dequeueImage() {
        io.flutter.embedding.engine.renderer.c cVar;
        boolean z2;
        synchronized (this.lock) {
            try {
                java.util.Iterator<io.flutter.embedding.engine.renderer.e> it = this.imageReaderQueue.iterator();
                cVar = null;
                while (true) {
                    z2 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    io.flutter.embedding.engine.renderer.e next = it.next();
                    java.util.ArrayDeque arrayDeque = next.f7646b;
                    io.flutter.embedding.engine.renderer.c cVar2 = arrayDeque.isEmpty() ? null : (io.flutter.embedding.engine.renderer.c) arrayDeque.removeFirst();
                    if (cVar2 == null) {
                        cVar = cVar2;
                    } else {
                        while (this.lastDequeuedImage.size() > 2) {
                            this.lastDequeuedImage.remove(0).f7642a.close();
                        }
                        this.lastDequeuedImage.add(cVar2);
                        this.lastReaderDequeuedFrom = next;
                        cVar = cVar2;
                    }
                }
                pruneImageReaderQueue();
                java.util.Iterator<io.flutter.embedding.engine.renderer.e> it2 = this.imageReaderQueue.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().f7646b.isEmpty()) {
                        z2 = true;
                        break;
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (z2) {
            this.this$0.f7679d.post(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.renderer.b
                @Override // java.lang.Runnable
                public final void run() {
                    io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer.this.lambda$dequeueImage$0();
                }
            });
        }
        return cVar;
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
            io.flutter.embedding.engine.renderer.h hVar = this.this$0;
            hVar.f7679d.post(new io.flutter.embedding.engine.renderer.f(this.id, hVar.f7676a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public android.view.Surface getForcedNewSurface() {
        this.createNewReader = true;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getHeight() {
        return this.requestedHeight;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public android.view.Surface getSurface() {
        return getActiveReader().f7645a.getSurface();
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
        int i2;
        synchronized (this.lock) {
            try {
                java.util.Iterator<io.flutter.embedding.engine.renderer.e> it = this.imageReaderQueue.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    i2 += it.next().f7646b.size();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    public int numTrims() {
        int i2;
        synchronized (this.lock) {
            i2 = this.numTrims;
        }
        return i2;
    }

    public void onImage(android.media.ImageReader imageReader, android.media.Image image) {
        io.flutter.embedding.engine.renderer.c cVar;
        synchronized (this.lock) {
            io.flutter.embedding.engine.renderer.e orCreatePerImageReader = getOrCreatePerImageReader(imageReader);
            if (orCreatePerImageReader.f7647c) {
                cVar = null;
            } else {
                io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = orCreatePerImageReader.f7648d;
                java.lang.System.nanoTime();
                io.flutter.embedding.engine.renderer.c cVar2 = new io.flutter.embedding.engine.renderer.c(flutterRenderer$ImageReaderSurfaceProducer, image);
                java.util.ArrayDeque arrayDeque = orCreatePerImageReader.f7646b;
                arrayDeque.add(cVar2);
                while (arrayDeque.size() > 2) {
                    ((io.flutter.embedding.engine.renderer.c) arrayDeque.removeFirst()).f7642a.close();
                }
                cVar = cVar2;
            }
        }
        if (cVar == null) {
            return;
        }
        this.this$0.f7676a.scheduleFrame();
    }

    @Override // io.flutter.view.o
    public void onTrimMemory(int i2) {
        if (i2 < 40) {
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
        io.flutter.embedding.engine.renderer.e peekFirst;
        while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null) {
            java.util.ArrayDeque arrayDeque = peekFirst.f7646b;
            if (!arrayDeque.isEmpty() || peekFirst.f7648d.lastReaderDequeuedFrom == peekFirst) {
                return;
            }
            this.imageReaderQueue.removeFirst();
            java.util.HashMap<android.media.ImageReader, io.flutter.embedding.engine.renderer.e> hashMap = this.perImageReaders;
            android.media.ImageReader imageReader = peekFirst.f7645a;
            hashMap.remove(imageReader);
            peekFirst.f7647c = true;
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
        io.flutter.embedding.engine.renderer.h hVar = this.this$0;
        hVar.f7676a.unregisterTexture(this.id);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void scheduleFrame() {
        this.this$0.f7676a.scheduleFrame();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setCallback(io.flutter.view.p pVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setSize(int i2, int i3) {
        int max = java.lang.Math.max(1, i2);
        int max2 = java.lang.Math.max(1, i3);
        if (this.requestedWidth == max && this.requestedHeight == max2) {
            return;
        }
        this.createNewReader = true;
        this.requestedHeight = max2;
        this.requestedWidth = max;
    }
}
