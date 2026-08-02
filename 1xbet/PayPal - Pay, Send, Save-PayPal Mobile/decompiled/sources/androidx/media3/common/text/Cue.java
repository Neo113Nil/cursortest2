package androidx.media3.common.text;

/* loaded from: classes7.dex */
public final class Cue {
    public static final int ANCHOR_TYPE_END = 2;
    public static final int ANCHOR_TYPE_MIDDLE = 1;
    public static final int ANCHOR_TYPE_START = 0;
    public static final float DIMEN_UNSET = -3.4028235E38f;
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
    public final int zIndex;

    @java.lang.Deprecated
    public static final androidx.media3.common.text.Cue EMPTY = new androidx.media3.common.text.Cue.Builder().setText("").build();
    private static final java.lang.String getOutputSizes = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(17);
    private static final java.lang.String getOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String getOutputMinFrameDuration = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(18);
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String getInputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(5);
    private static final java.lang.String getHighSpeedVideoSizesFor = androidx.media3.common.util.Util.intToStringMaxRadix(6);
    private static final java.lang.String getInputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(7);
    private static final java.lang.String getOutputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(8);
    private static final java.lang.String getValidOutputFormatsForInputhNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(9);
    private static final java.lang.String getOutputStallDurationlomOqCM = androidx.media3.common.util.Util.intToStringMaxRadix(10);
    private static final java.lang.String getOutputMinFrameDurationlomOqCM = androidx.media3.common.util.Util.intToStringMaxRadix(11);
    private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(12);
    private static final java.lang.String unwrapAs = androidx.media3.common.util.Util.intToStringMaxRadix(13);
    private static final java.lang.String isOutputSupportedForhNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(14);
    private static final java.lang.String toString = androidx.media3.common.util.Util.intToStringMaxRadix(15);
    private static final java.lang.String getOutputStallDuration = androidx.media3.common.util.Util.intToStringMaxRadix(16);
    private static final java.lang.String isOutputSupportedFor = androidx.media3.common.util.Util.intToStringMaxRadix(19);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface AnchorType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface LineType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface TextSizeType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface VerticalType {
    }

    /* synthetic */ Cue(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, android.text.Layout.Alignment alignment2, android.graphics.Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, int i7, byte b) {
        this(charSequence, alignment, alignment2, bitmap, f, i, i2, f2, i3, i4, f3, f4, f5, z, i5, i6, f6, i7);
    }

    private Cue(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, android.text.Layout.Alignment alignment2, android.graphics.Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, int i7) {
        if (charSequence == null) {
            com.google.common.base.Preconditions.checkNotNull(bitmap);
        } else {
            com.google.common.base.Preconditions.checkArgument(bitmap == null);
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
        this.zIndex = i7;
    }

    public final androidx.media3.common.text.Cue.Builder buildUpon() {
        return new androidx.media3.common.text.Cue.Builder(this, (byte) 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.text.Cue cue = (androidx.media3.common.text.Cue) obj;
        if (!android.text.TextUtils.equals(this.text, cue.text) || this.textAlignment != cue.textAlignment || this.multiRowAlignment != cue.multiRowAlignment) {
            return false;
        }
        android.graphics.Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            android.graphics.Bitmap bitmap2 = cue.bitmap;
            if (bitmap2 == null || !bitmap.sameAs(bitmap2)) {
                return false;
            }
        } else if (cue.bitmap != null) {
            return false;
        }
        return this.line == cue.line && this.lineType == cue.lineType && this.lineAnchor == cue.lineAnchor && this.position == cue.position && this.positionAnchor == cue.positionAnchor && this.size == cue.size && this.bitmapHeight == cue.bitmapHeight && this.windowColorSet == cue.windowColorSet && this.windowColor == cue.windowColor && this.textSizeType == cue.textSizeType && this.textSize == cue.textSize && this.verticalType == cue.verticalType && this.shearDegrees == cue.shearDegrees && this.zIndex == cue.zIndex;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.text, this.textAlignment, this.multiRowAlignment, this.bitmap, java.lang.Float.valueOf(this.line), java.lang.Integer.valueOf(this.lineType), java.lang.Integer.valueOf(this.lineAnchor), java.lang.Float.valueOf(this.position), java.lang.Integer.valueOf(this.positionAnchor), java.lang.Float.valueOf(this.size), java.lang.Float.valueOf(this.bitmapHeight), java.lang.Boolean.valueOf(this.windowColorSet), java.lang.Integer.valueOf(this.windowColor), java.lang.Integer.valueOf(this.textSizeType), java.lang.Float.valueOf(this.textSize), java.lang.Integer.valueOf(this.verticalType), java.lang.Float.valueOf(this.shearDegrees), java.lang.Integer.valueOf(this.zIndex));
    }

    public static final class Builder {
        private int Camera2StreamConfigurationMap;
        private float getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private float getHighSpeedVideoFpsRangesFor;
        private android.graphics.Bitmap getHighSpeedVideoSizes;
        private android.text.Layout.Alignment getHighSpeedVideoSizesFor;
        private float getInputFormats;
        private float getInputSizeshNQ4ISI;
        private float getOutputFormats;
        private int getOutputMinFrameDuration;
        private java.lang.CharSequence getOutputMinFrameDurationlomOqCM;
        private android.text.Layout.Alignment getOutputSizes;
        private int getOutputSizeshNQ4ISI;
        private float getOutputStallDuration;
        private int getOutputStallDurationlomOqCM;
        private boolean getValidOutputFormatsForInputhNQ4ISI;
        private int isOutputSupportedForhNQ4ISI;
        private int toString;

        /* synthetic */ Builder(androidx.media3.common.text.Cue cue, byte b) {
            this(cue);
        }

        public Builder() {
            this.getOutputMinFrameDurationlomOqCM = null;
            this.getHighSpeedVideoSizes = null;
            this.getOutputSizes = null;
            this.getHighSpeedVideoSizesFor = null;
            this.getHighSpeedVideoFpsRangesFor = -3.4028235E38f;
            this.getHighSpeedVideoFpsRanges = Integer.MIN_VALUE;
            this.Camera2StreamConfigurationMap = Integer.MIN_VALUE;
            this.getOutputFormats = -3.4028235E38f;
            this.getOutputMinFrameDuration = Integer.MIN_VALUE;
            this.getOutputSizeshNQ4ISI = Integer.MIN_VALUE;
            this.getOutputStallDuration = -3.4028235E38f;
            this.getInputSizeshNQ4ISI = -3.4028235E38f;
            this.getHighResolutionOutputSizeshNQ4ISI = -3.4028235E38f;
            this.getValidOutputFormatsForInputhNQ4ISI = false;
            this.isOutputSupportedForhNQ4ISI = -16777216;
            this.getOutputStallDurationlomOqCM = Integer.MIN_VALUE;
        }

        private Builder(androidx.media3.common.text.Cue cue) {
            this.getOutputMinFrameDurationlomOqCM = cue.text;
            this.getHighSpeedVideoSizes = cue.bitmap;
            this.getOutputSizes = cue.textAlignment;
            this.getHighSpeedVideoSizesFor = cue.multiRowAlignment;
            this.getHighSpeedVideoFpsRangesFor = cue.line;
            this.getHighSpeedVideoFpsRanges = cue.lineType;
            this.Camera2StreamConfigurationMap = cue.lineAnchor;
            this.getOutputFormats = cue.position;
            this.getOutputMinFrameDuration = cue.positionAnchor;
            this.getOutputSizeshNQ4ISI = cue.textSizeType;
            this.getOutputStallDuration = cue.textSize;
            this.getInputSizeshNQ4ISI = cue.size;
            this.getHighResolutionOutputSizeshNQ4ISI = cue.bitmapHeight;
            this.getValidOutputFormatsForInputhNQ4ISI = cue.windowColorSet;
            this.isOutputSupportedForhNQ4ISI = cue.windowColor;
            this.getOutputStallDurationlomOqCM = cue.verticalType;
            this.getInputFormats = cue.shearDegrees;
            this.toString = cue.zIndex;
        }

        public final androidx.media3.common.text.Cue.Builder setText(java.lang.CharSequence charSequence) {
            this.getOutputMinFrameDurationlomOqCM = charSequence;
            this.getHighSpeedVideoSizes = null;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public final java.lang.CharSequence getText() {
            return this.getOutputMinFrameDurationlomOqCM;
        }

        public final androidx.media3.common.text.Cue.Builder setBitmap(android.graphics.Bitmap bitmap) {
            this.getHighSpeedVideoSizes = bitmap;
            this.getOutputMinFrameDurationlomOqCM = null;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public final android.graphics.Bitmap getBitmap() {
            return this.getHighSpeedVideoSizes;
        }

        public final androidx.media3.common.text.Cue.Builder setTextAlignment(android.text.Layout.Alignment alignment) {
            this.getOutputSizes = alignment;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public final android.text.Layout.Alignment getTextAlignment() {
            return this.getOutputSizes;
        }

        public final androidx.media3.common.text.Cue.Builder setMultiRowAlignment(android.text.Layout.Alignment alignment) {
            this.getHighSpeedVideoSizesFor = alignment;
            return this;
        }

        public final androidx.media3.common.text.Cue.Builder setLine(float f, int i) {
            this.getHighSpeedVideoFpsRangesFor = f;
            this.getHighSpeedVideoFpsRanges = i;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public final float getLine() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @org.checkerframework.dataflow.qual.Pure
        public final int getLineType() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final androidx.media3.common.text.Cue.Builder setLineAnchor(int i) {
            this.Camera2StreamConfigurationMap = i;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public final int getLineAnchor() {
            return this.Camera2StreamConfigurationMap;
        }

        public final androidx.media3.common.text.Cue.Builder setPosition(float f) {
            this.getOutputFormats = f;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public final float getPosition() {
            return this.getOutputFormats;
        }

        public final androidx.media3.common.text.Cue.Builder setPositionAnchor(int i) {
            this.getOutputMinFrameDuration = i;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public final int getPositionAnchor() {
            return this.getOutputMinFrameDuration;
        }

        public final androidx.media3.common.text.Cue.Builder setTextSize(float f, int i) {
            this.getOutputStallDuration = f;
            this.getOutputSizeshNQ4ISI = i;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public final int getTextSizeType() {
            return this.getOutputSizeshNQ4ISI;
        }

        @org.checkerframework.dataflow.qual.Pure
        public final float getTextSize() {
            return this.getOutputStallDuration;
        }

        public final androidx.media3.common.text.Cue.Builder setSize(float f) {
            this.getInputSizeshNQ4ISI = f;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public final float getSize() {
            return this.getInputSizeshNQ4ISI;
        }

        public final androidx.media3.common.text.Cue.Builder setBitmapHeight(float f) {
            this.getHighResolutionOutputSizeshNQ4ISI = f;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public final float getBitmapHeight() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final androidx.media3.common.text.Cue.Builder setWindowColor(int i) {
            this.isOutputSupportedForhNQ4ISI = i;
            this.getValidOutputFormatsForInputhNQ4ISI = true;
            return this;
        }

        public final androidx.media3.common.text.Cue.Builder clearWindowColor() {
            this.getValidOutputFormatsForInputhNQ4ISI = false;
            return this;
        }

        public final boolean isWindowColorSet() {
            return this.getValidOutputFormatsForInputhNQ4ISI;
        }

        @org.checkerframework.dataflow.qual.Pure
        public final int getWindowColor() {
            return this.isOutputSupportedForhNQ4ISI;
        }

        public final androidx.media3.common.text.Cue.Builder setVerticalType(int i) {
            this.getOutputStallDurationlomOqCM = i;
            return this;
        }

        public final androidx.media3.common.text.Cue.Builder setShearDegrees(float f) {
            this.getInputFormats = f;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public final int getVerticalType() {
            return this.getOutputStallDurationlomOqCM;
        }

        public final androidx.media3.common.text.Cue.Builder setZIndex(int i) {
            this.toString = i;
            return this;
        }

        @org.checkerframework.dataflow.qual.Pure
        public final int getZIndex() {
            return this.toString;
        }

        public final androidx.media3.common.text.Cue build() {
            return new androidx.media3.common.text.Cue(this.getOutputMinFrameDurationlomOqCM, this.getOutputSizes, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getOutputFormats, this.getOutputMinFrameDuration, this.getOutputSizeshNQ4ISI, this.getOutputStallDuration, this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getValidOutputFormatsForInputhNQ4ISI, this.isOutputSupportedForhNQ4ISI, this.getOutputStallDurationlomOqCM, this.getInputFormats, this.toString, (byte) 0);
        }
    }

    public final android.os.Bundle toSerializableBundle() {
        android.os.Bundle highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        if (this.bitmap != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            com.google.common.base.Preconditions.checkState(this.bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            highResolutionOutputSizeshNQ4ISI.putByteArray(getHighResolutionOutputSizeshNQ4ISI, byteArrayOutputStream.toByteArray());
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    public final android.os.Bundle toBinderBasedBundle() {
        android.os.Bundle highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        android.graphics.Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            highResolutionOutputSizeshNQ4ISI.putParcelable(getHighSpeedVideoFpsRangesFor, bitmap);
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    @java.lang.Deprecated
    public final android.os.Bundle toBundle() {
        return toBinderBasedBundle();
    }

    private android.os.Bundle getHighResolutionOutputSizeshNQ4ISI() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.CharSequence charSequence = this.text;
        if (charSequence != null) {
            bundle.putCharSequence(getOutputSizes, charSequence);
            java.lang.CharSequence charSequence2 = this.text;
            if (charSequence2 instanceof android.text.Spanned) {
                java.util.ArrayList<android.os.Bundle> highSpeedVideoFpsRangesFor = androidx.media3.common.text.CustomSpanBundler.getHighSpeedVideoFpsRangesFor((android.text.Spanned) charSequence2);
                if (!highSpeedVideoFpsRangesFor.isEmpty()) {
                    bundle.putParcelableArrayList(Camera2StreamConfigurationMap, highSpeedVideoFpsRangesFor);
                }
            }
        }
        bundle.putSerializable(getOutputSizeshNQ4ISI, this.textAlignment);
        bundle.putSerializable(getOutputMinFrameDuration, this.multiRowAlignment);
        bundle.putFloat(getHighSpeedVideoFpsRanges, this.line);
        bundle.putInt(getInputFormats, this.lineType);
        bundle.putInt(getHighSpeedVideoSizesFor, this.lineAnchor);
        bundle.putFloat(getInputSizeshNQ4ISI, this.position);
        bundle.putInt(getOutputFormats, this.positionAnchor);
        bundle.putInt(getValidOutputFormatsForInputhNQ4ISI, this.textSizeType);
        bundle.putFloat(getOutputStallDurationlomOqCM, this.textSize);
        bundle.putFloat(getOutputMinFrameDurationlomOqCM, this.size);
        bundle.putFloat(getHighSpeedVideoSizes, this.bitmapHeight);
        bundle.putBoolean(isOutputSupportedForhNQ4ISI, this.windowColorSet);
        bundle.putInt(unwrapAs, this.windowColor);
        bundle.putInt(toString, this.verticalType);
        bundle.putFloat(getOutputStallDuration, this.shearDegrees);
        bundle.putInt(isOutputSupportedFor, this.zIndex);
        return bundle;
    }

    public static androidx.media3.common.text.Cue fromBundle(android.os.Bundle bundle) {
        androidx.media3.common.text.Cue.Builder builder = new androidx.media3.common.text.Cue.Builder();
        java.lang.CharSequence charSequence = bundle.getCharSequence(getOutputSizes);
        if (charSequence != null) {
            builder.setText(charSequence);
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(Camera2StreamConfigurationMap);
            if (parcelableArrayList != null) {
                android.text.SpannableString valueOf = android.text.SpannableString.valueOf(charSequence);
                java.util.Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    androidx.media3.common.text.CustomSpanBundler.Camera2StreamConfigurationMap((android.os.Bundle) it.next(), valueOf);
                }
                builder.setText(valueOf);
            }
        }
        android.text.Layout.Alignment alignment = (android.text.Layout.Alignment) bundle.getSerializable(getOutputSizeshNQ4ISI);
        if (alignment != null) {
            builder.setTextAlignment(alignment);
        }
        android.text.Layout.Alignment alignment2 = (android.text.Layout.Alignment) bundle.getSerializable(getOutputMinFrameDuration);
        if (alignment2 != null) {
            builder.setMultiRowAlignment(alignment2);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) bundle.getParcelable(getHighSpeedVideoFpsRangesFor);
        if (bitmap != null) {
            builder.setBitmap(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(getHighResolutionOutputSizeshNQ4ISI);
            if (byteArray != null) {
                builder.setBitmap(android.graphics.BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        java.lang.String str = getHighSpeedVideoFpsRanges;
        if (bundle.containsKey(str)) {
            java.lang.String str2 = getInputFormats;
            if (bundle.containsKey(str2)) {
                builder.setLine(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        java.lang.String str3 = getHighSpeedVideoSizesFor;
        if (bundle.containsKey(str3)) {
            builder.setLineAnchor(bundle.getInt(str3));
        }
        java.lang.String str4 = getInputSizeshNQ4ISI;
        if (bundle.containsKey(str4)) {
            builder.setPosition(bundle.getFloat(str4));
        }
        java.lang.String str5 = getOutputFormats;
        if (bundle.containsKey(str5)) {
            builder.setPositionAnchor(bundle.getInt(str5));
        }
        java.lang.String str6 = getOutputStallDurationlomOqCM;
        if (bundle.containsKey(str6)) {
            java.lang.String str7 = getValidOutputFormatsForInputhNQ4ISI;
            if (bundle.containsKey(str7)) {
                builder.setTextSize(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        java.lang.String str8 = getOutputMinFrameDurationlomOqCM;
        if (bundle.containsKey(str8)) {
            builder.setSize(bundle.getFloat(str8));
        }
        java.lang.String str9 = getHighSpeedVideoSizes;
        if (bundle.containsKey(str9)) {
            builder.setBitmapHeight(bundle.getFloat(str9));
        }
        java.lang.String str10 = unwrapAs;
        if (bundle.containsKey(str10)) {
            builder.setWindowColor(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(isOutputSupportedForhNQ4ISI, false)) {
            builder.clearWindowColor();
        }
        java.lang.String str11 = toString;
        if (bundle.containsKey(str11)) {
            builder.setVerticalType(bundle.getInt(str11));
        }
        java.lang.String str12 = getOutputStallDuration;
        if (bundle.containsKey(str12)) {
            builder.setShearDegrees(bundle.getFloat(str12));
        }
        java.lang.String str13 = isOutputSupportedFor;
        if (bundle.containsKey(str13)) {
            builder.setZIndex(bundle.getInt(str13));
        }
        return builder.build();
    }
}
