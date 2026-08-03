package com.squareup.picasso;

/* loaded from: classes5.dex */
public class RequestCreator {
    private static final java.util.concurrent.atomic.AtomicInteger nextId = new java.util.concurrent.atomic.AtomicInteger();
    private final com.squareup.picasso.Request.Builder data;
    private boolean deferred;
    private android.graphics.drawable.Drawable errorDrawable;
    private int errorResId;
    private int memoryPolicy;
    private int networkPolicy;
    private boolean noFade;
    private final com.squareup.picasso.Picasso picasso;
    private android.graphics.drawable.Drawable placeholderDrawable;
    private int placeholderResId;
    private boolean setPlaceholder;
    private java.lang.Object tag;

    RequestCreator(com.squareup.picasso.Picasso picasso, android.net.Uri uri, int i) {
        this.setPlaceholder = true;
        if (picasso.shutdown) {
            throw new java.lang.IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        }
        this.picasso = picasso;
        this.data = new com.squareup.picasso.Request.Builder(uri, i, picasso.defaultBitmapConfig);
    }

    RequestCreator() {
        this.setPlaceholder = true;
        this.picasso = null;
        this.data = new com.squareup.picasso.Request.Builder(null, 0, null);
    }

    public com.squareup.picasso.RequestCreator noPlaceholder() {
        if (this.placeholderResId != 0) {
            throw new java.lang.IllegalStateException("Placeholder resource already set.");
        }
        if (this.placeholderDrawable != null) {
            throw new java.lang.IllegalStateException("Placeholder image already set.");
        }
        this.setPlaceholder = false;
        return this;
    }

    public com.squareup.picasso.RequestCreator placeholder(int i) {
        if (!this.setPlaceholder) {
            throw new java.lang.IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Placeholder image resource invalid.");
        }
        if (this.placeholderDrawable != null) {
            throw new java.lang.IllegalStateException("Placeholder image already set.");
        }
        this.placeholderResId = i;
        return this;
    }

    public com.squareup.picasso.RequestCreator placeholder(android.graphics.drawable.Drawable drawable) {
        if (!this.setPlaceholder) {
            throw new java.lang.IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (this.placeholderResId != 0) {
            throw new java.lang.IllegalStateException("Placeholder image already set.");
        }
        this.placeholderDrawable = drawable;
        return this;
    }

    public com.squareup.picasso.RequestCreator error(int i) {
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Error image resource invalid.");
        }
        if (this.errorDrawable != null) {
            throw new java.lang.IllegalStateException("Error image already set.");
        }
        this.errorResId = i;
        return this;
    }

    public com.squareup.picasso.RequestCreator error(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            throw new java.lang.IllegalArgumentException("Error image may not be null.");
        }
        if (this.errorResId != 0) {
            throw new java.lang.IllegalStateException("Error image already set.");
        }
        this.errorDrawable = drawable;
        return this;
    }

    public com.squareup.picasso.RequestCreator tag(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("Tag invalid.");
        }
        if (this.tag != null) {
            throw new java.lang.IllegalStateException("Tag already set.");
        }
        this.tag = obj;
        return this;
    }

    public com.squareup.picasso.RequestCreator fit() {
        this.deferred = true;
        return this;
    }

    com.squareup.picasso.RequestCreator unfit() {
        this.deferred = false;
        return this;
    }

    com.squareup.picasso.RequestCreator clearTag() {
        this.tag = null;
        return this;
    }

    java.lang.Object getTag() {
        return this.tag;
    }

    public com.squareup.picasso.RequestCreator resizeDimen(int i, int i2) {
        android.content.res.Resources resources = this.picasso.context.getResources();
        return resize(resources.getDimensionPixelSize(i), resources.getDimensionPixelSize(i2));
    }

    public com.squareup.picasso.RequestCreator resize(int i, int i2) {
        this.data.resize(i, i2);
        return this;
    }

    public com.squareup.picasso.RequestCreator centerCrop() {
        this.data.centerCrop(17);
        return this;
    }

    public com.squareup.picasso.RequestCreator centerCrop(int i) {
        this.data.centerCrop(i);
        return this;
    }

    public com.squareup.picasso.RequestCreator centerInside() {
        this.data.centerInside();
        return this;
    }

    public com.squareup.picasso.RequestCreator onlyScaleDown() {
        this.data.onlyScaleDown();
        return this;
    }

    public com.squareup.picasso.RequestCreator rotate(float f) {
        this.data.rotate(f);
        return this;
    }

    public com.squareup.picasso.RequestCreator rotate(float f, float f2, float f3) {
        this.data.rotate(f, f2, f3);
        return this;
    }

    public com.squareup.picasso.RequestCreator config(android.graphics.Bitmap.Config config) {
        this.data.config(config);
        return this;
    }

    public com.squareup.picasso.RequestCreator stableKey(java.lang.String str) {
        this.data.stableKey(str);
        return this;
    }

    public com.squareup.picasso.RequestCreator priority(com.squareup.picasso.Picasso.Priority priority) {
        this.data.priority(priority);
        return this;
    }

    public com.squareup.picasso.RequestCreator transform(com.squareup.picasso.Transformation transformation) {
        this.data.transform(transformation);
        return this;
    }

    public com.squareup.picasso.RequestCreator transform(java.util.List<? extends com.squareup.picasso.Transformation> list) {
        this.data.transform(list);
        return this;
    }

    public com.squareup.picasso.RequestCreator memoryPolicy(com.squareup.picasso.MemoryPolicy memoryPolicy, com.squareup.picasso.MemoryPolicy... memoryPolicyArr) {
        if (memoryPolicy == null) {
            throw new java.lang.IllegalArgumentException("Memory policy cannot be null.");
        }
        this.memoryPolicy = memoryPolicy.index | this.memoryPolicy;
        if (memoryPolicyArr == null) {
            throw new java.lang.IllegalArgumentException("Memory policy cannot be null.");
        }
        if (memoryPolicyArr.length > 0) {
            for (com.squareup.picasso.MemoryPolicy memoryPolicy2 : memoryPolicyArr) {
                if (memoryPolicy2 == null) {
                    throw new java.lang.IllegalArgumentException("Memory policy cannot be null.");
                }
                this.memoryPolicy = memoryPolicy2.index | this.memoryPolicy;
            }
        }
        return this;
    }

    public com.squareup.picasso.RequestCreator networkPolicy(com.squareup.picasso.NetworkPolicy networkPolicy, com.squareup.picasso.NetworkPolicy... networkPolicyArr) {
        if (networkPolicy == null) {
            throw new java.lang.IllegalArgumentException("Network policy cannot be null.");
        }
        this.networkPolicy = networkPolicy.index | this.networkPolicy;
        if (networkPolicyArr == null) {
            throw new java.lang.IllegalArgumentException("Network policy cannot be null.");
        }
        if (networkPolicyArr.length > 0) {
            for (com.squareup.picasso.NetworkPolicy networkPolicy2 : networkPolicyArr) {
                if (networkPolicy2 == null) {
                    throw new java.lang.IllegalArgumentException("Network policy cannot be null.");
                }
                this.networkPolicy = networkPolicy2.index | this.networkPolicy;
            }
        }
        return this;
    }

    public com.squareup.picasso.RequestCreator purgeable() {
        this.data.purgeable();
        return this;
    }

    public com.squareup.picasso.RequestCreator noFade() {
        this.noFade = true;
        return this;
    }

    public android.graphics.Bitmap get() throws java.io.IOException {
        long nanoTime = java.lang.System.nanoTime();
        com.squareup.picasso.Utils.checkNotMain();
        if (this.deferred) {
            throw new java.lang.IllegalStateException("Fit cannot be used with get.");
        }
        if (!this.data.hasImage()) {
            return null;
        }
        com.squareup.picasso.Request createRequest = createRequest(nanoTime);
        com.squareup.picasso.GetAction getAction = new com.squareup.picasso.GetAction(this.picasso, createRequest, this.memoryPolicy, this.networkPolicy, this.tag, com.squareup.picasso.Utils.createKey(createRequest, new java.lang.StringBuilder()));
        com.squareup.picasso.Picasso picasso = this.picasso;
        return com.squareup.picasso.BitmapHunter.forRequest(picasso, picasso.dispatcher, this.picasso.cache, this.picasso.stats, getAction).hunt();
    }

    public void fetch() {
        fetch(null);
    }

    public void fetch(com.squareup.picasso.Callback callback) {
        long nanoTime = java.lang.System.nanoTime();
        if (this.deferred) {
            throw new java.lang.IllegalStateException("Fit cannot be used with fetch.");
        }
        if (this.data.hasImage()) {
            if (!this.data.hasPriority()) {
                this.data.priority(com.squareup.picasso.Picasso.Priority.LOW);
            }
            com.squareup.picasso.Request createRequest = createRequest(nanoTime);
            java.lang.String createKey = com.squareup.picasso.Utils.createKey(createRequest, new java.lang.StringBuilder());
            if (com.squareup.picasso.MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) && this.picasso.quickMemoryCacheCheck(createKey) != null) {
                if (this.picasso.loggingEnabled) {
                    com.squareup.picasso.Utils.log("Main", "completed", createRequest.plainId(), "from " + com.squareup.picasso.Picasso.LoadedFrom.MEMORY);
                }
                if (callback != null) {
                    callback.onSuccess();
                    return;
                }
                return;
            }
            this.picasso.submit(new com.squareup.picasso.FetchAction(this.picasso, createRequest, this.memoryPolicy, this.networkPolicy, this.tag, createKey, callback));
        }
    }

    public void into(com.squareup.picasso.Target target) {
        android.graphics.Bitmap quickMemoryCacheCheck;
        long nanoTime = java.lang.System.nanoTime();
        com.squareup.picasso.Utils.checkMain();
        if (target == null) {
            throw new java.lang.IllegalArgumentException("Target must not be null.");
        }
        if (this.deferred) {
            throw new java.lang.IllegalStateException("Fit cannot be used with a Target.");
        }
        if (!this.data.hasImage()) {
            this.picasso.cancelRequest(target);
            target.onPrepareLoad(this.setPlaceholder ? getPlaceholderDrawable() : null);
            return;
        }
        com.squareup.picasso.Request createRequest = createRequest(nanoTime);
        java.lang.String createKey = com.squareup.picasso.Utils.createKey(createRequest);
        if (com.squareup.picasso.MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) && (quickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(createKey)) != null) {
            this.picasso.cancelRequest(target);
            target.onBitmapLoaded(quickMemoryCacheCheck, com.squareup.picasso.Picasso.LoadedFrom.MEMORY);
        } else {
            target.onPrepareLoad(this.setPlaceholder ? getPlaceholderDrawable() : null);
            this.picasso.enqueueAndSubmit(new com.squareup.picasso.TargetAction(this.picasso, target, createRequest, this.memoryPolicy, this.networkPolicy, this.errorDrawable, createKey, this.tag, this.errorResId));
        }
    }

    public void into(android.widget.RemoteViews remoteViews, int i, int i2, android.app.Notification notification) {
        into(remoteViews, i, i2, notification, null);
    }

    public void into(android.widget.RemoteViews remoteViews, int i, int i2, android.app.Notification notification, java.lang.String str) {
        into(remoteViews, i, i2, notification, str, null);
    }

    public void into(android.widget.RemoteViews remoteViews, int i, int i2, android.app.Notification notification, java.lang.String str, com.squareup.picasso.Callback callback) {
        long nanoTime = java.lang.System.nanoTime();
        if (remoteViews == null) {
            throw new java.lang.IllegalArgumentException("RemoteViews must not be null.");
        }
        if (notification == null) {
            throw new java.lang.IllegalArgumentException("Notification must not be null.");
        }
        if (this.deferred) {
            throw new java.lang.IllegalStateException("Fit cannot be used with RemoteViews.");
        }
        if (this.placeholderDrawable != null || this.placeholderResId != 0 || this.errorDrawable != null) {
            throw new java.lang.IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
        }
        com.squareup.picasso.Request createRequest = createRequest(nanoTime);
        performRemoteViewInto(new com.squareup.picasso.RemoteViewsAction.NotificationAction(this.picasso, createRequest, remoteViews, i, i2, notification, str, this.memoryPolicy, this.networkPolicy, com.squareup.picasso.Utils.createKey(createRequest, new java.lang.StringBuilder()), this.tag, this.errorResId, callback));
    }

    public void into(android.widget.RemoteViews remoteViews, int i, int[] iArr) {
        into(remoteViews, i, iArr, (com.squareup.picasso.Callback) null);
    }

    public void into(android.widget.RemoteViews remoteViews, int i, int[] iArr, com.squareup.picasso.Callback callback) {
        long nanoTime = java.lang.System.nanoTime();
        if (remoteViews == null) {
            throw new java.lang.IllegalArgumentException("remoteViews must not be null.");
        }
        if (iArr == null) {
            throw new java.lang.IllegalArgumentException("appWidgetIds must not be null.");
        }
        if (this.deferred) {
            throw new java.lang.IllegalStateException("Fit cannot be used with remote views.");
        }
        if (this.placeholderDrawable != null || this.placeholderResId != 0 || this.errorDrawable != null) {
            throw new java.lang.IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
        }
        com.squareup.picasso.Request createRequest = createRequest(nanoTime);
        performRemoteViewInto(new com.squareup.picasso.RemoteViewsAction.AppWidgetAction(this.picasso, createRequest, remoteViews, i, iArr, this.memoryPolicy, this.networkPolicy, com.squareup.picasso.Utils.createKey(createRequest, new java.lang.StringBuilder()), this.tag, this.errorResId, callback));
    }

    public void into(android.widget.ImageView imageView) {
        into(imageView, null);
    }

    public void into(android.widget.ImageView imageView, com.squareup.picasso.Callback callback) {
        android.graphics.Bitmap quickMemoryCacheCheck;
        long nanoTime = java.lang.System.nanoTime();
        com.squareup.picasso.Utils.checkMain();
        if (imageView == null) {
            throw new java.lang.IllegalArgumentException("Target must not be null.");
        }
        if (!this.data.hasImage()) {
            this.picasso.cancelRequest(imageView);
            if (this.setPlaceholder) {
                com.squareup.picasso.PicassoDrawable.setPlaceholder(imageView, getPlaceholderDrawable());
                return;
            }
            return;
        }
        if (this.deferred) {
            if (this.data.hasSize()) {
                throw new java.lang.IllegalStateException("Fit cannot be used with resize.");
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                if (this.setPlaceholder) {
                    com.squareup.picasso.PicassoDrawable.setPlaceholder(imageView, getPlaceholderDrawable());
                }
                this.picasso.defer(imageView, new com.squareup.picasso.DeferredRequestCreator(this, imageView, callback));
                return;
            }
            this.data.resize(width, height);
        }
        com.squareup.picasso.Request createRequest = createRequest(nanoTime);
        java.lang.String createKey = com.squareup.picasso.Utils.createKey(createRequest);
        if (com.squareup.picasso.MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) && (quickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(createKey)) != null) {
            this.picasso.cancelRequest(imageView);
            com.squareup.picasso.PicassoDrawable.setBitmap(imageView, this.picasso.context, quickMemoryCacheCheck, com.squareup.picasso.Picasso.LoadedFrom.MEMORY, this.noFade, this.picasso.indicatorsEnabled);
            if (this.picasso.loggingEnabled) {
                com.squareup.picasso.Utils.log("Main", "completed", createRequest.plainId(), "from " + com.squareup.picasso.Picasso.LoadedFrom.MEMORY);
            }
            if (callback != null) {
                callback.onSuccess();
                return;
            }
            return;
        }
        if (this.setPlaceholder) {
            com.squareup.picasso.PicassoDrawable.setPlaceholder(imageView, getPlaceholderDrawable());
        }
        this.picasso.enqueueAndSubmit(new com.squareup.picasso.ImageViewAction(this.picasso, imageView, createRequest, this.memoryPolicy, this.networkPolicy, this.errorResId, this.errorDrawable, createKey, this.tag, callback, this.noFade));
    }

    private android.graphics.drawable.Drawable getPlaceholderDrawable() {
        if (this.placeholderResId != 0) {
            return this.picasso.context.getDrawable(this.placeholderResId);
        }
        return this.placeholderDrawable;
    }

    private com.squareup.picasso.Request createRequest(long j) {
        int andIncrement = nextId.getAndIncrement();
        com.squareup.picasso.Request build = this.data.build();
        build.id = andIncrement;
        build.started = j;
        boolean z = this.picasso.loggingEnabled;
        if (z) {
            com.squareup.picasso.Utils.log("Main", "created", build.plainId(), build.toString());
        }
        com.squareup.picasso.Request transformRequest = this.picasso.transformRequest(build);
        if (transformRequest != build) {
            transformRequest.id = andIncrement;
            transformRequest.started = j;
            if (z) {
                com.squareup.picasso.Utils.log("Main", "changed", transformRequest.logId(), "into " + transformRequest);
            }
        }
        return transformRequest;
    }

    private void performRemoteViewInto(com.squareup.picasso.RemoteViewsAction remoteViewsAction) {
        android.graphics.Bitmap quickMemoryCacheCheck;
        if (com.squareup.picasso.MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) && (quickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(remoteViewsAction.getKey())) != null) {
            remoteViewsAction.complete(quickMemoryCacheCheck, com.squareup.picasso.Picasso.LoadedFrom.MEMORY);
            return;
        }
        int i = this.placeholderResId;
        if (i != 0) {
            remoteViewsAction.setImageResource(i);
        }
        this.picasso.enqueueAndSubmit(remoteViewsAction);
    }
}
