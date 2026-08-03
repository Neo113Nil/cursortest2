package com.google.android.exoplayer2.text;

/* loaded from: classes3.dex */
public final class Cue implements com.google.android.exoplayer2.Bundleable {
    public static final int ANCHOR_TYPE_END = 2;
    public static final int ANCHOR_TYPE_MIDDLE = 1;
    public static final int ANCHOR_TYPE_START = 0;
    public static final float DIMEN_UNSET = -3.4028235E38f;
    private static final int FIELD_BITMAP = 3;
    private static final int FIELD_BITMAP_HEIGHT = 12;
    private static final int FIELD_LINE = 4;
    private static final int FIELD_LINE_ANCHOR = 6;
    private static final int FIELD_LINE_TYPE = 5;
    private static final int FIELD_MULTI_ROW_ALIGNMENT = 2;
    private static final int FIELD_POSITION = 7;
    private static final int FIELD_POSITION_ANCHOR = 8;
    private static final int FIELD_SHEAR_DEGREES = 16;
    private static final int FIELD_SIZE = 11;
    private static final int FIELD_TEXT = 0;
    private static final int FIELD_TEXT_ALIGNMENT = 1;
    private static final int FIELD_TEXT_SIZE = 10;
    private static final int FIELD_TEXT_SIZE_TYPE = 9;
    private static final int FIELD_VERTICAL_TYPE = 15;
    private static final int FIELD_WINDOW_COLOR = 13;
    private static final int FIELD_WINDOW_COLOR_SET = 14;
    public static final int LINE_TYPE_FRACTION = 0;
    public static final int LINE_TYPE_NUMBER = 1;
    public static final int TEXT_SIZE_TYPE_ABSOLUTE = 2;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL = 0;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL_IGNORE_PADDING = 1;
    public static final int TYPE_UNSET = Integer.MIN_VALUE;
    public static final int VERTICAL_TYPE_LR = 2;
    public static final int VERTICAL_TYPE_RL = 1;
    public final android.graphics.Bitmap bitmap;
    public final float bitmapHeight;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final android.text.Layout.Alignment multiRowAlignment;
    public final float position;
    public final int positionAnchor;
    public final float shearDegrees;
    public final float size;
    public final java.lang.CharSequence text;
    public final android.text.Layout.Alignment textAlignment;
    public final float textSize;
    public final int textSizeType;
    public final int verticalType;
    public final int windowColor;
    public final boolean windowColorSet;
    public static final com.google.android.exoplayer2.text.Cue EMPTY = new com.google.android.exoplayer2.text.Cue.Builder().setText("").build();
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.text.Cue> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.text.Cue$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            com.google.android.exoplayer2.text.Cue fromBundle;
            fromBundle = com.google.android.exoplayer2.text.Cue.fromBundle(bundle);
            return fromBundle;
        }
    };

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AnchorType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LineType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TextSizeType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface VerticalType {
    }

    @java.lang.Deprecated
    public Cue(java.lang.CharSequence charSequence) {
        this(charSequence, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f);
    }

    @java.lang.Deprecated
    public Cue(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, f, i, i2, f2, i3, f3, false, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
    }

    @java.lang.Deprecated
    public Cue(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, null, null, f, i, i2, f2, i3, i4, f4, f3, -3.4028235E38f, false, androidx.core.view.ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);
    }

    @java.lang.Deprecated
    public Cue(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
        this(charSequence, alignment, null, null, f, i, i2, f2, i3, Integer.MIN_VALUE, -3.4028235E38f, f3, -3.4028235E38f, z, i4, Integer.MIN_VALUE, 0.0f);
    }

    private Cue(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, android.text.Layout.Alignment alignment2, android.graphics.Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            com.google.android.exoplayer2.util.Assertions.checkNotNull(bitmap);
        } else {
            com.google.android.exoplayer2.util.Assertions.checkArgument(bitmap == null);
        }
        if (charSequence instanceof android.text.Spanned) {
            this.text = android.text.SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.text = charSequence.toString();
        } else {
            this.text = null;
        }
        this.textAlignment = alignment;
        this.multiRowAlignment = alignment2;
        this.bitmap = bitmap;
        this.line = f;
        this.lineType = i;
        this.lineAnchor = i2;
        this.position = f2;
        this.positionAnchor = i3;
        this.size = f4;
        this.bitmapHeight = f5;
        this.windowColorSet = z;
        this.windowColor = i5;
        this.textSizeType = i4;
        this.textSize = f3;
        this.verticalType = i6;
        this.shearDegrees = f6;
    }

    public com.google.android.exoplayer2.text.Cue.Builder buildUpon() {
        return new com.google.android.exoplayer2.text.Cue.Builder();
    }

    public boolean equals(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.text.Cue cue = (com.google.android.exoplayer2.text.Cue) obj;
        return android.text.TextUtils.equals(this.text, cue.text) && this.textAlignment == cue.textAlignment && this.multiRowAlignment == cue.multiRowAlignment && ((bitmap = this.bitmap) != null ? !((bitmap2 = cue.bitmap) == null || !bitmap.sameAs(bitmap2)) : cue.bitmap == null) && this.line == cue.line && this.lineType == cue.lineType && this.lineAnchor == cue.lineAnchor && this.position == cue.position && this.positionAnchor == cue.positionAnchor && this.size == cue.size && this.bitmapHeight == cue.bitmapHeight && this.windowColorSet == cue.windowColorSet && this.windowColor == cue.windowColor && this.textSizeType == cue.textSizeType && this.textSize == cue.textSize && this.verticalType == cue.verticalType && this.shearDegrees == cue.shearDegrees;
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(this.text, this.textAlignment, this.multiRowAlignment, this.bitmap, java.lang.Float.valueOf(this.line), java.lang.Integer.valueOf(this.lineType), java.lang.Integer.valueOf(this.lineAnchor), java.lang.Float.valueOf(this.position), java.lang.Integer.valueOf(this.positionAnchor), java.lang.Float.valueOf(this.size), java.lang.Float.valueOf(this.bitmapHeight), java.lang.Boolean.valueOf(this.windowColorSet), java.lang.Integer.valueOf(this.windowColor), java.lang.Integer.valueOf(this.textSizeType), java.lang.Float.valueOf(this.textSize), java.lang.Integer.valueOf(this.verticalType), java.lang.Float.valueOf(this.shearDegrees));
    }

    public static final class Builder {
        private android.graphics.Bitmap bitmap;
        private float bitmapHeight;
        private float line;
        private int lineAnchor;
        private int lineType;
        private android.text.Layout.Alignment multiRowAlignment;
        private float position;
        private int positionAnchor;
        private float shearDegrees;
        private float size;
        private java.lang.CharSequence text;
        private android.text.Layout.Alignment textAlignment;
        private float textSize;
        private int textSizeType;
        private int verticalType;
        private int windowColor;
        private boolean windowColorSet;

        public Builder() {
            this.text = null;
            this.bitmap = null;
            this.textAlignment = null;
            this.multiRowAlignment = null;
            this.line = -3.4028235E38f;
            this.lineType = Integer.MIN_VALUE;
            this.lineAnchor = Integer.MIN_VALUE;
            this.position = -3.4028235E38f;
            this.positionAnchor = Integer.MIN_VALUE;
            this.textSizeType = Integer.MIN_VALUE;
            this.textSize = -3.4028235E38f;
            this.size = -3.4028235E38f;
            this.bitmapHeight = -3.4028235E38f;
            this.windowColorSet = false;
            this.windowColor = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
            this.verticalType = Integer.MIN_VALUE;
        }

        private Builder(com.google.android.exoplayer2.text.Cue cue) {
            this.text = cue.text;
            this.bitmap = cue.bitmap;
            this.textAlignment = cue.textAlignment;
            this.multiRowAlignment = cue.multiRowAlignment;
            this.line = cue.line;
            this.lineType = cue.lineType;
            this.lineAnchor = cue.lineAnchor;
            this.position = cue.position;
            this.positionAnchor = cue.positionAnchor;
            this.textSizeType = cue.textSizeType;
            this.textSize = cue.textSize;
            this.size = cue.size;
            this.bitmapHeight = cue.bitmapHeight;
            this.windowColorSet = cue.windowColorSet;
            this.windowColor = cue.windowColor;
            this.verticalType = cue.verticalType;
            this.shearDegrees = cue.shearDegrees;
        }

        public com.google.android.exoplayer2.text.Cue.Builder setText(java.lang.CharSequence charSequence) {
            this.text = charSequence;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public java.lang.CharSequence getText() {
            return this.text;
        }

        public com.google.android.exoplayer2.text.Cue.Builder setBitmap(android.graphics.Bitmap bitmap) {
            this.bitmap = bitmap;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public com.google.android.exoplayer2.text.Cue.Builder setTextAlignment(android.text.Layout.Alignment alignment) {
            this.textAlignment = alignment;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public android.text.Layout.Alignment getTextAlignment() {
            return this.textAlignment;
        }

        public com.google.android.exoplayer2.text.Cue.Builder setMultiRowAlignment(android.text.Layout.Alignment alignment) {
            this.multiRowAlignment = alignment;
            return this;
        }

        public com.google.android.exoplayer2.text.Cue.Builder setLine(float f, int i) {
            this.line = f;
            this.lineType = i;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public float getLine() {
            return this.line;
        }

        @org.checkerframework.dataflow.qual.Pure
        public int getLineType() {
            return this.lineType;
        }

        public com.google.android.exoplayer2.text.Cue.Builder setLineAnchor(int i) {
            this.lineAnchor = i;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public int getLineAnchor() {
            return this.lineAnchor;
        }

        public com.google.android.exoplayer2.text.Cue.Builder setPosition(float f) {
            this.position = f;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public float getPosition() {
            return this.position;
        }

        public com.google.android.exoplayer2.text.Cue.Builder setPositionAnchor(int i) {
            this.positionAnchor = i;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public int getPositionAnchor() {
            return this.positionAnchor;
        }

        public com.google.android.exoplayer2.text.Cue.Builder setTextSize(float f, int i) {
            this.textSize = f;
            this.textSizeType = i;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public int getTextSizeType() {
            return this.textSizeType;
        }

        @org.checkerframework.dataflow.qual.Pure
        public float getTextSize() {
            return this.textSize;
        }

        public com.google.android.exoplayer2.text.Cue.Builder setSize(float f) {
            this.size = f;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public float getSize() {
            return this.size;
        }

        public com.google.android.exoplayer2.text.Cue.Builder setBitmapHeight(float f) {
            this.bitmapHeight = f;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public float getBitmapHeight() {
            return this.bitmapHeight;
        }

        public com.google.android.exoplayer2.text.Cue.Builder setWindowColor(int i) {
            this.windowColor = i;
            this.windowColorSet = true;
            return this;
        }

        public com.google.android.exoplayer2.text.Cue.Builder clearWindowColor() {
            this.windowColorSet = false;
            return this;
        }

        public boolean isWindowColorSet() {
            return this.windowColorSet;
        }

        @org.checkerframework.dataflow.qual.Pure
        public int getWindowColor() {
            return this.windowColor;
        }

        public com.google.android.exoplayer2.text.Cue.Builder setVerticalType(int i) {
            this.verticalType = i;
            return this;
        }

        public com.google.android.exoplayer2.text.Cue.Builder setShearDegrees(float f) {
            this.shearDegrees = f;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public int getVerticalType() {
            return this.verticalType;
        }

        public com.google.android.exoplayer2.text.Cue build() {
            return new com.google.android.exoplayer2.text.Cue(this.text, this.textAlignment, this.multiRowAlignment, this.bitmap, this.line, this.lineType, this.lineAnchor, this.position, this.positionAnchor, this.textSizeType, this.textSize, this.size, this.bitmapHeight, this.windowColorSet, this.windowColor, this.verticalType, this.shearDegrees);
        }
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putCharSequence(keyForField(0), this.text);
        bundle.putSerializable(keyForField(1), this.textAlignment);
        bundle.putSerializable(keyForField(2), this.multiRowAlignment);
        bundle.putParcelable(keyForField(3), this.bitmap);
        bundle.putFloat(keyForField(4), this.line);
        bundle.putInt(keyForField(5), this.lineType);
        bundle.putInt(keyForField(6), this.lineAnchor);
        bundle.putFloat(keyForField(7), this.position);
        bundle.putInt(keyForField(8), this.positionAnchor);
        bundle.putInt(keyForField(9), this.textSizeType);
        bundle.putFloat(keyForField(10), this.textSize);
        bundle.putFloat(keyForField(11), this.size);
        bundle.putFloat(keyForField(12), this.bitmapHeight);
        bundle.putBoolean(keyForField(14), this.windowColorSet);
        bundle.putInt(keyForField(13), this.windowColor);
        bundle.putInt(keyForField(15), this.verticalType);
        bundle.putFloat(keyForField(16), this.shearDegrees);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.android.exoplayer2.text.Cue fromBundle(android.os.Bundle bundle) {
        com.google.android.exoplayer2.text.Cue.Builder builder = new com.google.android.exoplayer2.text.Cue.Builder();
        java.lang.CharSequence charSequence = bundle.getCharSequence(keyForField(0));
        if (charSequence != null) {
            builder.setText(charSequence);
        }
        android.text.Layout.Alignment alignment = (android.text.Layout.Alignment) bundle.getSerializable(keyForField(1));
        if (alignment != null) {
            builder.setTextAlignment(alignment);
        }
        android.text.Layout.Alignment alignment2 = (android.text.Layout.Alignment) bundle.getSerializable(keyForField(2));
        if (alignment2 != null) {
            builder.setMultiRowAlignment(alignment2);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) bundle.getParcelable(keyForField(3));
        if (bitmap != null) {
            builder.setBitmap(bitmap);
        }
        if (bundle.containsKey(keyForField(4)) && bundle.containsKey(keyForField(5))) {
            builder.setLine(bundle.getFloat(keyForField(4)), bundle.getInt(keyForField(5)));
        }
        if (bundle.containsKey(keyForField(6))) {
            builder.setLineAnchor(bundle.getInt(keyForField(6)));
        }
        if (bundle.containsKey(keyForField(7))) {
            builder.setPosition(bundle.getFloat(keyForField(7)));
        }
        if (bundle.containsKey(keyForField(8))) {
            builder.setPositionAnchor(bundle.getInt(keyForField(8)));
        }
        if (bundle.containsKey(keyForField(10)) && bundle.containsKey(keyForField(9))) {
            builder.setTextSize(bundle.getFloat(keyForField(10)), bundle.getInt(keyForField(9)));
        }
        if (bundle.containsKey(keyForField(11))) {
            builder.setSize(bundle.getFloat(keyForField(11)));
        }
        if (bundle.containsKey(keyForField(12))) {
            builder.setBitmapHeight(bundle.getFloat(keyForField(12)));
        }
        if (bundle.containsKey(keyForField(13))) {
            builder.setWindowColor(bundle.getInt(keyForField(13)));
        }
        if (!bundle.getBoolean(keyForField(14), false)) {
            builder.clearWindowColor();
        }
        if (bundle.containsKey(keyForField(15))) {
            builder.setVerticalType(bundle.getInt(keyForField(15)));
        }
        if (bundle.containsKey(keyForField(16))) {
            builder.setShearDegrees(bundle.getFloat(keyForField(16)));
        }
        return builder.build();
    }

    private static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
