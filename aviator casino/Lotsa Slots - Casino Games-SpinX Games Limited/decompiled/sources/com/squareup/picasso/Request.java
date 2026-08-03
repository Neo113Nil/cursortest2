package com.squareup.picasso;

/* loaded from: classes5.dex */
public final class Request {
    private static final long TOO_LONG_LOG = java.util.concurrent.TimeUnit.SECONDS.toNanos(5);
    public final boolean centerCrop;
    public final int centerCropGravity;
    public final boolean centerInside;
    public final android.graphics.Bitmap.Config config;
    public final boolean hasRotationPivot;
    int id;
    int networkPolicy;
    public final boolean onlyScaleDown;
    public final com.squareup.picasso.Picasso.Priority priority;
    public final boolean purgeable;
    public final int resourceId;
    public final float rotationDegrees;
    public final float rotationPivotX;
    public final float rotationPivotY;
    public final java.lang.String stableKey;
    long started;
    public final int targetHeight;
    public final int targetWidth;
    public final java.util.List<com.squareup.picasso.Transformation> transformations;
    public final android.net.Uri uri;

    private Request(android.net.Uri uri, int i, java.lang.String str, java.util.List<com.squareup.picasso.Transformation> list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, android.graphics.Bitmap.Config config, com.squareup.picasso.Picasso.Priority priority) {
        this.uri = uri;
        this.resourceId = i;
        this.stableKey = str;
        if (list == null) {
            this.transformations = null;
        } else {
            this.transformations = java.util.Collections.unmodifiableList(list);
        }
        this.targetWidth = i2;
        this.targetHeight = i3;
        this.centerCrop = z;
        this.centerInside = z2;
        this.centerCropGravity = i4;
        this.onlyScaleDown = z3;
        this.rotationDegrees = f;
        this.rotationPivotX = f2;
        this.rotationPivotY = f3;
        this.hasRotationPivot = z4;
        this.purgeable = z5;
        this.config = config;
        this.priority = priority;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Request{");
        int i = this.resourceId;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.uri);
        }
        java.util.List<com.squareup.picasso.Transformation> list = this.transformations;
        if (list != null && !list.isEmpty()) {
            for (com.squareup.picasso.Transformation transformation : this.transformations) {
                sb.append(' ');
                sb.append(transformation.key());
            }
        }
        if (this.stableKey != null) {
            sb.append(" stableKey(");
            sb.append(this.stableKey);
            sb.append(')');
        }
        if (this.targetWidth > 0) {
            sb.append(" resize(");
            sb.append(this.targetWidth);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            sb.append(this.targetHeight);
            sb.append(')');
        }
        if (this.centerCrop) {
            sb.append(" centerCrop");
        }
        if (this.centerInside) {
            sb.append(" centerInside");
        }
        if (this.rotationDegrees != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.rotationDegrees);
            if (this.hasRotationPivot) {
                sb.append(" @ ");
                sb.append(this.rotationPivotX);
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                sb.append(this.rotationPivotY);
            }
            sb.append(')');
        }
        if (this.purgeable) {
            sb.append(" purgeable");
        }
        if (this.config != null) {
            sb.append(' ');
            sb.append(this.config);
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    java.lang.String logId() {
        long nanoTime = java.lang.System.nanoTime() - this.started;
        if (nanoTime > TOO_LONG_LOG) {
            return plainId() + '+' + java.util.concurrent.TimeUnit.NANOSECONDS.toSeconds(nanoTime) + io.ktor.util.date.GMTDateParser.SECONDS;
        }
        return plainId() + '+' + java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    java.lang.String plainId() {
        return "[R" + this.id + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST;
    }

    java.lang.String getName() {
        android.net.Uri uri = this.uri;
        if (uri != null) {
            return java.lang.String.valueOf(uri.getPath());
        }
        return java.lang.Integer.toHexString(this.resourceId);
    }

    public boolean hasSize() {
        return (this.targetWidth == 0 && this.targetHeight == 0) ? false : true;
    }

    boolean needsTransformation() {
        return needsMatrixTransform() || hasCustomTransformations();
    }

    boolean needsMatrixTransform() {
        return hasSize() || this.rotationDegrees != 0.0f;
    }

    boolean hasCustomTransformations() {
        return this.transformations != null;
    }

    public com.squareup.picasso.Request.Builder buildUpon() {
        return new com.squareup.picasso.Request.Builder();
    }

    public static final class Builder {
        private boolean centerCrop;
        private int centerCropGravity;
        private boolean centerInside;
        private android.graphics.Bitmap.Config config;
        private boolean hasRotationPivot;
        private boolean onlyScaleDown;
        private com.squareup.picasso.Picasso.Priority priority;
        private boolean purgeable;
        private int resourceId;
        private float rotationDegrees;
        private float rotationPivotX;
        private float rotationPivotY;
        private java.lang.String stableKey;
        private int targetHeight;
        private int targetWidth;
        private java.util.List<com.squareup.picasso.Transformation> transformations;
        private android.net.Uri uri;

        public Builder(android.net.Uri uri) {
            setUri(uri);
        }

        public Builder(int i) {
            setResourceId(i);
        }

        Builder(android.net.Uri uri, int i, android.graphics.Bitmap.Config config) {
            this.uri = uri;
            this.resourceId = i;
            this.config = config;
        }

        private Builder(com.squareup.picasso.Request request) {
            this.uri = request.uri;
            this.resourceId = request.resourceId;
            this.stableKey = request.stableKey;
            this.targetWidth = request.targetWidth;
            this.targetHeight = request.targetHeight;
            this.centerCrop = request.centerCrop;
            this.centerInside = request.centerInside;
            this.centerCropGravity = request.centerCropGravity;
            this.rotationDegrees = request.rotationDegrees;
            this.rotationPivotX = request.rotationPivotX;
            this.rotationPivotY = request.rotationPivotY;
            this.hasRotationPivot = request.hasRotationPivot;
            this.purgeable = request.purgeable;
            this.onlyScaleDown = request.onlyScaleDown;
            if (request.transformations != null) {
                this.transformations = new java.util.ArrayList(request.transformations);
            }
            this.config = request.config;
            this.priority = request.priority;
        }

        boolean hasImage() {
            return (this.uri == null && this.resourceId == 0) ? false : true;
        }

        boolean hasSize() {
            return (this.targetWidth == 0 && this.targetHeight == 0) ? false : true;
        }

        boolean hasPriority() {
            return this.priority != null;
        }

        public com.squareup.picasso.Request.Builder setUri(android.net.Uri uri) {
            if (uri == null) {
                throw new java.lang.IllegalArgumentException("Image URI may not be null.");
            }
            this.uri = uri;
            this.resourceId = 0;
            return this;
        }

        public com.squareup.picasso.Request.Builder setResourceId(int i) {
            if (i == 0) {
                throw new java.lang.IllegalArgumentException("Image resource ID may not be 0.");
            }
            this.resourceId = i;
            this.uri = null;
            return this;
        }

        public com.squareup.picasso.Request.Builder stableKey(java.lang.String str) {
            this.stableKey = str;
            return this;
        }

        public com.squareup.picasso.Request.Builder resize(int i, int i2) {
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i2 < 0) {
                throw new java.lang.IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i2 == 0 && i == 0) {
                throw new java.lang.IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.targetWidth = i;
            this.targetHeight = i2;
            return this;
        }

        public com.squareup.picasso.Request.Builder clearResize() {
            this.targetWidth = 0;
            this.targetHeight = 0;
            this.centerCrop = false;
            this.centerInside = false;
            return this;
        }

        public com.squareup.picasso.Request.Builder centerCrop() {
            return centerCrop(17);
        }

        public com.squareup.picasso.Request.Builder centerCrop(int i) {
            if (this.centerInside) {
                throw new java.lang.IllegalStateException("Center crop can not be used after calling centerInside");
            }
            this.centerCrop = true;
            this.centerCropGravity = i;
            return this;
        }

        public com.squareup.picasso.Request.Builder clearCenterCrop() {
            this.centerCrop = false;
            this.centerCropGravity = 17;
            return this;
        }

        public com.squareup.picasso.Request.Builder centerInside() {
            if (this.centerCrop) {
                throw new java.lang.IllegalStateException("Center inside can not be used after calling centerCrop");
            }
            this.centerInside = true;
            return this;
        }

        public com.squareup.picasso.Request.Builder clearCenterInside() {
            this.centerInside = false;
            return this;
        }

        public com.squareup.picasso.Request.Builder onlyScaleDown() {
            if (this.targetHeight == 0 && this.targetWidth == 0) {
                throw new java.lang.IllegalStateException("onlyScaleDown can not be applied without resize");
            }
            this.onlyScaleDown = true;
            return this;
        }

        public com.squareup.picasso.Request.Builder clearOnlyScaleDown() {
            this.onlyScaleDown = false;
            return this;
        }

        public com.squareup.picasso.Request.Builder rotate(float f) {
            this.rotationDegrees = f;
            return this;
        }

        public com.squareup.picasso.Request.Builder rotate(float f, float f2, float f3) {
            this.rotationDegrees = f;
            this.rotationPivotX = f2;
            this.rotationPivotY = f3;
            this.hasRotationPivot = true;
            return this;
        }

        public com.squareup.picasso.Request.Builder clearRotation() {
            this.rotationDegrees = 0.0f;
            this.rotationPivotX = 0.0f;
            this.rotationPivotY = 0.0f;
            this.hasRotationPivot = false;
            return this;
        }

        public com.squareup.picasso.Request.Builder purgeable() {
            this.purgeable = true;
            return this;
        }

        public com.squareup.picasso.Request.Builder config(android.graphics.Bitmap.Config config) {
            if (config == null) {
                throw new java.lang.IllegalArgumentException("config == null");
            }
            this.config = config;
            return this;
        }

        public com.squareup.picasso.Request.Builder priority(com.squareup.picasso.Picasso.Priority priority) {
            if (priority == null) {
                throw new java.lang.IllegalArgumentException("Priority invalid.");
            }
            if (this.priority != null) {
                throw new java.lang.IllegalStateException("Priority already set.");
            }
            this.priority = priority;
            return this;
        }

        public com.squareup.picasso.Request.Builder transform(com.squareup.picasso.Transformation transformation) {
            if (transformation == null) {
                throw new java.lang.IllegalArgumentException("Transformation must not be null.");
            }
            if (transformation.key() == null) {
                throw new java.lang.IllegalArgumentException("Transformation key must not be null.");
            }
            if (this.transformations == null) {
                this.transformations = new java.util.ArrayList(2);
            }
            this.transformations.add(transformation);
            return this;
        }

        public com.squareup.picasso.Request.Builder transform(java.util.List<? extends com.squareup.picasso.Transformation> list) {
            if (list == null) {
                throw new java.lang.IllegalArgumentException("Transformation list must not be null.");
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                transform(list.get(i));
            }
            return this;
        }

        public com.squareup.picasso.Request build() {
            boolean z = this.centerInside;
            if (z && this.centerCrop) {
                throw new java.lang.IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.centerCrop && this.targetWidth == 0 && this.targetHeight == 0) {
                throw new java.lang.IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z && this.targetWidth == 0 && this.targetHeight == 0) {
                throw new java.lang.IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.priority == null) {
                this.priority = com.squareup.picasso.Picasso.Priority.NORMAL;
            }
            return new com.squareup.picasso.Request(this.uri, this.resourceId, this.stableKey, this.transformations, this.targetWidth, this.targetHeight, this.centerCrop, this.centerInside, this.centerCropGravity, this.onlyScaleDown, this.rotationDegrees, this.rotationPivotX, this.rotationPivotY, this.hasRotationPivot, this.purgeable, this.config, this.priority);
        }
    }
}
