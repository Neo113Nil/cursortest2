package com.squareup.picasso;

/* loaded from: classes5.dex */
class BitmapHunter implements java.lang.Runnable {
    com.squareup.picasso.Action action;
    java.util.List<com.squareup.picasso.Action> actions;
    final com.squareup.picasso.Cache cache;
    final com.squareup.picasso.Request data;
    final com.squareup.picasso.Dispatcher dispatcher;
    java.lang.Exception exception;
    int exifOrientation;
    java.util.concurrent.Future<?> future;
    final java.lang.String key;
    com.squareup.picasso.Picasso.LoadedFrom loadedFrom;
    final int memoryPolicy;
    int networkPolicy;
    final com.squareup.picasso.Picasso picasso;
    com.squareup.picasso.Picasso.Priority priority;
    final com.squareup.picasso.RequestHandler requestHandler;
    android.graphics.Bitmap result;
    int retryCount;
    final int sequence = SEQUENCE_GENERATOR.incrementAndGet();
    final com.squareup.picasso.Stats stats;
    private static final java.lang.Object DECODE_LOCK = new java.lang.Object();
    private static final java.lang.ThreadLocal<java.lang.StringBuilder> NAME_BUILDER = new java.lang.ThreadLocal<java.lang.StringBuilder>() { // from class: com.squareup.picasso.BitmapHunter.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.lang.StringBuilder initialValue() {
            return new java.lang.StringBuilder("Picasso-");
        }
    };
    private static final java.util.concurrent.atomic.AtomicInteger SEQUENCE_GENERATOR = new java.util.concurrent.atomic.AtomicInteger();
    private static final com.squareup.picasso.RequestHandler ERRORING_HANDLER = new com.squareup.picasso.RequestHandler() { // from class: com.squareup.picasso.BitmapHunter.2
        @Override // com.squareup.picasso.RequestHandler
        public boolean canHandleRequest(com.squareup.picasso.Request request) {
            return true;
        }

        @Override // com.squareup.picasso.RequestHandler
        public com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request request, int i) throws java.io.IOException {
            throw new java.lang.IllegalStateException("Unrecognized type of request: " + request);
        }
    };

    static int getExifRotation(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    static int getExifTranslation(int i) {
        return (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
    }

    private static boolean shouldResize(boolean z, int i, int i2, int i3, int i4) {
        return !z || (i3 != 0 && i > i3) || (i4 != 0 && i2 > i4);
    }

    BitmapHunter(com.squareup.picasso.Picasso picasso, com.squareup.picasso.Dispatcher dispatcher, com.squareup.picasso.Cache cache, com.squareup.picasso.Stats stats, com.squareup.picasso.Action action, com.squareup.picasso.RequestHandler requestHandler) {
        this.picasso = picasso;
        this.dispatcher = dispatcher;
        this.cache = cache;
        this.stats = stats;
        this.action = action;
        this.key = action.getKey();
        this.data = action.getRequest();
        this.priority = action.getPriority();
        this.memoryPolicy = action.getMemoryPolicy();
        this.networkPolicy = action.getNetworkPolicy();
        this.requestHandler = requestHandler;
        this.retryCount = requestHandler.getRetryCount();
    }

    static android.graphics.Bitmap decodeStream(okio.Source source, com.squareup.picasso.Request request) throws java.io.IOException {
        okio.BufferedSource buffer = okio.Okio.buffer(source);
        boolean isWebPFile = com.squareup.picasso.Utils.isWebPFile(buffer);
        boolean z = request.purgeable;
        android.graphics.BitmapFactory.Options createBitmapOptions = com.squareup.picasso.RequestHandler.createBitmapOptions(request);
        boolean requiresInSampleSize = com.squareup.picasso.RequestHandler.requiresInSampleSize(createBitmapOptions);
        if (isWebPFile) {
            byte[] readByteArray = buffer.readByteArray();
            if (requiresInSampleSize) {
                android.graphics.BitmapFactory.decodeByteArray(readByteArray, 0, readByteArray.length, createBitmapOptions);
                com.squareup.picasso.RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, createBitmapOptions, request);
            }
            return android.graphics.BitmapFactory.decodeByteArray(readByteArray, 0, readByteArray.length, createBitmapOptions);
        }
        java.io.InputStream inputStream = buffer.inputStream();
        if (requiresInSampleSize) {
            com.squareup.picasso.MarkableInputStream markableInputStream = new com.squareup.picasso.MarkableInputStream(inputStream);
            markableInputStream.allowMarksToExpire(false);
            long savePosition = markableInputStream.savePosition(1024);
            android.graphics.BitmapFactory.decodeStream(markableInputStream, null, createBitmapOptions);
            com.squareup.picasso.RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, createBitmapOptions, request);
            markableInputStream.reset(savePosition);
            markableInputStream.allowMarksToExpire(true);
            inputStream = markableInputStream;
        }
        android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(inputStream, null, createBitmapOptions);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new java.io.IOException("Failed to decode stream.");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    updateThreadName(this.data);
                    if (this.picasso.loggingEnabled) {
                        com.squareup.picasso.Utils.log("Hunter", "executing", com.squareup.picasso.Utils.getLogIdsForHunter(this));
                    }
                    android.graphics.Bitmap hunt = hunt();
                    this.result = hunt;
                    if (hunt == null) {
                        this.dispatcher.dispatchFailed(this);
                    } else {
                        this.dispatcher.dispatchComplete(this);
                    }
                } catch (java.lang.Exception e) {
                    this.exception = e;
                    this.dispatcher.dispatchFailed(this);
                } catch (java.lang.OutOfMemoryError e2) {
                    java.io.StringWriter stringWriter = new java.io.StringWriter();
                    this.stats.createSnapshot().dump(new java.io.PrintWriter(stringWriter));
                    this.exception = new java.lang.RuntimeException(stringWriter.toString(), e2);
                    this.dispatcher.dispatchFailed(this);
                }
            } catch (com.squareup.picasso.NetworkRequestHandler.ResponseException e3) {
                if (!com.squareup.picasso.NetworkPolicy.isOfflineOnly(e3.networkPolicy) || e3.code != 504) {
                    this.exception = e3;
                }
                this.dispatcher.dispatchFailed(this);
            } catch (java.io.IOException e4) {
                this.exception = e4;
                this.dispatcher.dispatchRetry(this);
            }
        } finally {
            java.lang.Thread.currentThread().setName("Picasso-Idle");
        }
    }

    android.graphics.Bitmap hunt() throws java.io.IOException {
        android.graphics.Bitmap bitmap;
        if (com.squareup.picasso.MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy)) {
            bitmap = this.cache.get(this.key);
            if (bitmap != null) {
                this.stats.dispatchCacheHit();
                this.loadedFrom = com.squareup.picasso.Picasso.LoadedFrom.MEMORY;
                if (this.picasso.loggingEnabled) {
                    com.squareup.picasso.Utils.log("Hunter", "decoded", this.data.logId(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        int i = this.retryCount == 0 ? com.squareup.picasso.NetworkPolicy.OFFLINE.index : this.networkPolicy;
        this.networkPolicy = i;
        com.squareup.picasso.RequestHandler.Result load = this.requestHandler.load(this.data, i);
        if (load != null) {
            this.loadedFrom = load.getLoadedFrom();
            this.exifOrientation = load.getExifOrientation();
            bitmap = load.getBitmap();
            if (bitmap == null) {
                okio.Source source = load.getSource();
                try {
                    bitmap = decodeStream(source, this.data);
                } finally {
                    try {
                        source.close();
                    } catch (java.io.IOException unused) {
                    }
                }
            }
        }
        if (bitmap != null) {
            if (this.picasso.loggingEnabled) {
                com.squareup.picasso.Utils.log("Hunter", "decoded", this.data.logId());
            }
            this.stats.dispatchBitmapDecoded(bitmap);
            if (this.data.needsTransformation() || this.exifOrientation != 0) {
                synchronized (DECODE_LOCK) {
                    if (this.data.needsMatrixTransform() || this.exifOrientation != 0) {
                        bitmap = transformResult(this.data, bitmap, this.exifOrientation);
                        if (this.picasso.loggingEnabled) {
                            com.squareup.picasso.Utils.log("Hunter", "transformed", this.data.logId());
                        }
                    }
                    if (this.data.hasCustomTransformations()) {
                        bitmap = applyCustomTransformations(this.data.transformations, bitmap);
                        if (this.picasso.loggingEnabled) {
                            com.squareup.picasso.Utils.log("Hunter", "transformed", this.data.logId(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.stats.dispatchBitmapTransformed(bitmap);
                }
            }
        }
        return bitmap;
    }

    void attach(com.squareup.picasso.Action action) {
        boolean z = this.picasso.loggingEnabled;
        com.squareup.picasso.Request request = action.request;
        if (this.action == null) {
            this.action = action;
            if (z) {
                java.util.List<com.squareup.picasso.Action> list = this.actions;
                if (list == null || list.isEmpty()) {
                    com.squareup.picasso.Utils.log("Hunter", "joined", request.logId(), "to empty hunter");
                    return;
                } else {
                    com.squareup.picasso.Utils.log("Hunter", "joined", request.logId(), com.squareup.picasso.Utils.getLogIdsForHunter(this, "to "));
                    return;
                }
            }
            return;
        }
        if (this.actions == null) {
            this.actions = new java.util.ArrayList(3);
        }
        this.actions.add(action);
        if (z) {
            com.squareup.picasso.Utils.log("Hunter", "joined", request.logId(), com.squareup.picasso.Utils.getLogIdsForHunter(this, "to "));
        }
        com.squareup.picasso.Picasso.Priority priority = action.getPriority();
        if (priority.ordinal() > this.priority.ordinal()) {
            this.priority = priority;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0010, code lost:
    
        if (r0.remove(r4) != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void detach(com.squareup.picasso.Action action) {
        if (this.action == action) {
            this.action = null;
        } else {
            java.util.List<com.squareup.picasso.Action> list = this.actions;
            if (list != null) {
            }
            if (this.picasso.loggingEnabled) {
                return;
            }
            com.squareup.picasso.Utils.log("Hunter", "removed", action.request.logId(), com.squareup.picasso.Utils.getLogIdsForHunter(this, "from "));
            return;
        }
        if (action.getPriority() == this.priority) {
            this.priority = computeNewPriority();
        }
        if (this.picasso.loggingEnabled) {
        }
    }

    private com.squareup.picasso.Picasso.Priority computeNewPriority() {
        com.squareup.picasso.Picasso.Priority priority = com.squareup.picasso.Picasso.Priority.LOW;
        java.util.List<com.squareup.picasso.Action> list = this.actions;
        boolean z = (list == null || list.isEmpty()) ? false : true;
        com.squareup.picasso.Action action = this.action;
        if (action == null && !z) {
            return priority;
        }
        if (action != null) {
            priority = action.getPriority();
        }
        if (z) {
            int size = this.actions.size();
            for (int i = 0; i < size; i++) {
                com.squareup.picasso.Picasso.Priority priority2 = this.actions.get(i).getPriority();
                if (priority2.ordinal() > priority.ordinal()) {
                    priority = priority2;
                }
            }
        }
        return priority;
    }

    boolean cancel() {
        java.util.concurrent.Future<?> future;
        if (this.action != null) {
            return false;
        }
        java.util.List<com.squareup.picasso.Action> list = this.actions;
        return (list == null || list.isEmpty()) && (future = this.future) != null && future.cancel(false);
    }

    boolean isCancelled() {
        java.util.concurrent.Future<?> future = this.future;
        return future != null && future.isCancelled();
    }

    boolean shouldRetry(boolean z, android.net.NetworkInfo networkInfo) {
        int i = this.retryCount;
        if (i <= 0) {
            return false;
        }
        this.retryCount = i - 1;
        return this.requestHandler.shouldRetry(z, networkInfo);
    }

    boolean supportsReplay() {
        return this.requestHandler.supportsReplay();
    }

    android.graphics.Bitmap getResult() {
        return this.result;
    }

    java.lang.String getKey() {
        return this.key;
    }

    int getMemoryPolicy() {
        return this.memoryPolicy;
    }

    com.squareup.picasso.Request getData() {
        return this.data;
    }

    com.squareup.picasso.Action getAction() {
        return this.action;
    }

    com.squareup.picasso.Picasso getPicasso() {
        return this.picasso;
    }

    java.util.List<com.squareup.picasso.Action> getActions() {
        return this.actions;
    }

    java.lang.Exception getException() {
        return this.exception;
    }

    com.squareup.picasso.Picasso.LoadedFrom getLoadedFrom() {
        return this.loadedFrom;
    }

    com.squareup.picasso.Picasso.Priority getPriority() {
        return this.priority;
    }

    static void updateThreadName(com.squareup.picasso.Request request) {
        java.lang.String name = request.getName();
        java.lang.StringBuilder sb = NAME_BUILDER.get();
        sb.ensureCapacity(name.length() + 8);
        sb.replace(8, sb.length(), name);
        java.lang.Thread.currentThread().setName(sb.toString());
    }

    static com.squareup.picasso.BitmapHunter forRequest(com.squareup.picasso.Picasso picasso, com.squareup.picasso.Dispatcher dispatcher, com.squareup.picasso.Cache cache, com.squareup.picasso.Stats stats, com.squareup.picasso.Action action) {
        com.squareup.picasso.Request request = action.getRequest();
        java.util.List<com.squareup.picasso.RequestHandler> requestHandlers = picasso.getRequestHandlers();
        int size = requestHandlers.size();
        for (int i = 0; i < size; i++) {
            com.squareup.picasso.RequestHandler requestHandler = requestHandlers.get(i);
            if (requestHandler.canHandleRequest(request)) {
                return new com.squareup.picasso.BitmapHunter(picasso, dispatcher, cache, stats, action, requestHandler);
            }
        }
        return new com.squareup.picasso.BitmapHunter(picasso, dispatcher, cache, stats, action, ERRORING_HANDLER);
    }

    static android.graphics.Bitmap applyCustomTransformations(java.util.List<com.squareup.picasso.Transformation> list, android.graphics.Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            final com.squareup.picasso.Transformation transformation = list.get(i);
            try {
                android.graphics.Bitmap transform = transformation.transform(bitmap);
                if (transform == null) {
                    final java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Transformation ");
                    sb.append(transformation.key());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    java.util.Iterator<com.squareup.picasso.Transformation> it = list.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next().key());
                        sb.append('\n');
                    }
                    com.squareup.picasso.Picasso.HANDLER.post(new java.lang.Runnable() { // from class: com.squareup.picasso.BitmapHunter.4
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new java.lang.NullPointerException(sb.toString());
                        }
                    });
                    return null;
                }
                if (transform == bitmap && bitmap.isRecycled()) {
                    com.squareup.picasso.Picasso.HANDLER.post(new java.lang.Runnable() { // from class: com.squareup.picasso.BitmapHunter.5
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new java.lang.IllegalStateException("Transformation " + com.squareup.picasso.Transformation.this.key() + " returned input Bitmap but recycled it.");
                        }
                    });
                    return null;
                }
                if (transform != bitmap && !bitmap.isRecycled()) {
                    com.squareup.picasso.Picasso.HANDLER.post(new java.lang.Runnable() { // from class: com.squareup.picasso.BitmapHunter.6
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new java.lang.IllegalStateException("Transformation " + com.squareup.picasso.Transformation.this.key() + " mutated input Bitmap but failed to recycle the original.");
                        }
                    });
                    return null;
                }
                i++;
                bitmap = transform;
            } catch (java.lang.RuntimeException e) {
                com.squareup.picasso.Picasso.HANDLER.post(new java.lang.Runnable() { // from class: com.squareup.picasso.BitmapHunter.3
                    @Override // java.lang.Runnable
                    public void run() {
                        throw new java.lang.RuntimeException("Transformation " + com.squareup.picasso.Transformation.this.key() + " crashed with exception.", e);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static android.graphics.Bitmap transformResult(com.squareup.picasso.Request request, android.graphics.Bitmap bitmap, int i) {
        int i2;
        int i3;
        boolean z;
        android.graphics.Matrix matrix;
        android.graphics.Matrix matrix2;
        int i4;
        int i5;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i6;
        int i7;
        float f9;
        float f10;
        float f11;
        int i8;
        int i9;
        float f12;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        android.graphics.Bitmap createBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z3 = request.onlyScaleDown;
        android.graphics.Matrix matrix3 = new android.graphics.Matrix();
        if (request.needsMatrixTransform() || i != 0) {
            int i18 = request.targetWidth;
            int i19 = request.targetHeight;
            float f13 = request.rotationDegrees;
            if (f13 != 0.0f) {
                double d = f13;
                double cos = java.lang.Math.cos(java.lang.Math.toRadians(d));
                double sin = java.lang.Math.sin(java.lang.Math.toRadians(d));
                if (request.hasRotationPivot) {
                    matrix3.setRotate(f13, request.rotationPivotX, request.rotationPivotY);
                    double d2 = 1.0d - cos;
                    double d3 = (request.rotationPivotX * d2) + (request.rotationPivotY * sin);
                    double d4 = (request.rotationPivotY * d2) - (request.rotationPivotX * sin);
                    double d5 = (request.targetWidth * cos) + d3;
                    i3 = height;
                    z = z3;
                    double d6 = (request.targetWidth * sin) + d4;
                    matrix = matrix3;
                    i2 = width;
                    double d7 = ((request.targetWidth * cos) + d3) - (request.targetHeight * sin);
                    double d8 = (request.targetWidth * sin) + d4 + (request.targetHeight * cos);
                    double d9 = d3 - (request.targetHeight * sin);
                    double d10 = (request.targetHeight * cos) + d4;
                    double max = java.lang.Math.max(d9, java.lang.Math.max(d7, java.lang.Math.max(d3, d5)));
                    double min = java.lang.Math.min(d9, java.lang.Math.min(d7, java.lang.Math.min(d3, d5)));
                    double max2 = java.lang.Math.max(d10, java.lang.Math.max(d8, java.lang.Math.max(d4, d6)));
                    double min2 = java.lang.Math.min(d10, java.lang.Math.min(d8, java.lang.Math.min(d4, d6)));
                    i18 = (int) java.lang.Math.floor(max - min);
                    i19 = (int) java.lang.Math.floor(max2 - min2);
                } else {
                    i2 = width;
                    i3 = height;
                    z = z3;
                    matrix3.setRotate(f13);
                    double d11 = request.targetWidth * cos;
                    double d12 = request.targetWidth * sin;
                    double d13 = (request.targetWidth * cos) - (request.targetHeight * sin);
                    double d14 = (request.targetWidth * sin) + (request.targetHeight * cos);
                    double d15 = -(request.targetHeight * sin);
                    double d16 = request.targetHeight * cos;
                    matrix = matrix3;
                    double max3 = java.lang.Math.max(d15, java.lang.Math.max(d13, java.lang.Math.max(0.0d, d11)));
                    double min3 = java.lang.Math.min(d15, java.lang.Math.min(d13, java.lang.Math.min(0.0d, d11)));
                    double max4 = java.lang.Math.max(d16, java.lang.Math.max(d14, java.lang.Math.max(0.0d, d12)));
                    double min4 = java.lang.Math.min(d16, java.lang.Math.min(d14, java.lang.Math.min(0.0d, d12)));
                    int floor = (int) java.lang.Math.floor(max3 - min3);
                    i19 = (int) java.lang.Math.floor(max4 - min4);
                    i18 = floor;
                }
            } else {
                i2 = width;
                i3 = height;
                z = z3;
                matrix = matrix3;
            }
            if (i != 0) {
                int exifRotation = getExifRotation(i);
                int exifTranslation = getExifTranslation(i);
                if (exifRotation != 0) {
                    matrix2 = matrix;
                    matrix2.preRotate(exifRotation);
                    if (exifRotation == 90 || exifRotation == 270) {
                        int i20 = i19;
                        i19 = i18;
                        i18 = i20;
                    }
                } else {
                    matrix2 = matrix;
                }
                if (exifTranslation != 1) {
                    matrix2.postScale(exifTranslation, 1.0f);
                }
            } else {
                matrix2 = matrix;
            }
            if (request.centerCrop) {
                if (i18 != 0) {
                    i6 = i2;
                    f9 = i18 / i6;
                    i7 = i3;
                } else {
                    i6 = i2;
                    i7 = i3;
                    f9 = i19 / i7;
                }
                if (i19 != 0) {
                    f10 = i19;
                    f11 = i7;
                } else {
                    f10 = i18;
                    f11 = i6;
                }
                float f14 = f10 / f11;
                if (f9 > f14) {
                    int ceil = (int) java.lang.Math.ceil(i7 * (f14 / f9));
                    if ((request.centerCropGravity & 48) == 48) {
                        i17 = 0;
                    } else {
                        i17 = (request.centerCropGravity & 80) == 80 ? i7 - ceil : (i7 - ceil) / 2;
                    }
                    f12 = i19 / ceil;
                    i9 = ceil;
                    z2 = z;
                    i11 = 0;
                    i10 = i17;
                    i8 = i6;
                } else if (f9 < f14) {
                    int ceil2 = (int) java.lang.Math.ceil(i6 * (f9 / f14));
                    if ((request.centerCropGravity & 3) == 3) {
                        i12 = 0;
                    } else {
                        i12 = (request.centerCropGravity & 5) == 5 ? i6 - ceil2 : (i6 - ceil2) / 2;
                    }
                    i11 = i12;
                    i8 = ceil2;
                    i9 = i7;
                    f9 = i18 / ceil2;
                    z2 = z;
                    f12 = f14;
                    i10 = 0;
                } else {
                    i8 = i6;
                    i9 = i7;
                    f9 = f14;
                    f12 = f9;
                    z2 = z;
                    i10 = 0;
                    i11 = 0;
                }
                if (shouldResize(z2, i6, i7, i18, i19)) {
                    matrix2.preScale(f9, f12);
                }
                i13 = i10;
                i14 = i9;
                i15 = i11;
                i16 = i8;
                createBitmap = android.graphics.Bitmap.createBitmap(bitmap, i15, i13, i16, i14, matrix2, true);
                if (createBitmap != bitmap) {
                    return bitmap;
                }
                bitmap.recycle();
                return createBitmap;
            }
            i4 = i3;
            boolean z4 = z;
            i5 = i2;
            if (request.centerInside) {
                if (i18 != 0) {
                    f5 = i18;
                    f6 = i5;
                } else {
                    f5 = i19;
                    f6 = i4;
                }
                float f15 = f5 / f6;
                if (i19 != 0) {
                    f7 = i19;
                    f8 = i4;
                } else {
                    f7 = i18;
                    f8 = i5;
                }
                float f16 = f7 / f8;
                if (f15 >= f16) {
                    f15 = f16;
                }
                if (shouldResize(z4, i5, i4, i18, i19)) {
                    matrix2.preScale(f15, f15);
                }
            } else if ((i18 != 0 || i19 != 0) && (i18 != i5 || i19 != i4)) {
                if (i18 != 0) {
                    f = i18;
                    f2 = i5;
                } else {
                    f = i19;
                    f2 = i4;
                }
                float f17 = f / f2;
                if (i19 != 0) {
                    f3 = i19;
                    f4 = i4;
                } else {
                    f3 = i18;
                    f4 = i5;
                }
                float f18 = f3 / f4;
                if (shouldResize(z4, i5, i4, i18, i19)) {
                    matrix2.preScale(f17, f18);
                }
            }
        } else {
            i4 = height;
            matrix2 = matrix3;
            i5 = width;
        }
        i16 = i5;
        i14 = i4;
        i15 = 0;
        i13 = 0;
        createBitmap = android.graphics.Bitmap.createBitmap(bitmap, i15, i13, i16, i14, matrix2, true);
        if (createBitmap != bitmap) {
        }
    }
}
