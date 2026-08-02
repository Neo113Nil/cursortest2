package com.datadog.android.sessionreplay.internal.recorder.mapper;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002'(B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/mapper/SwitchCompatMapper;", "Lcom/datadog/android/sessionreplay/internal/recorder/mapper/CheckableWireframeMapper;", "Landroidx/appcompat/widget/SwitchCompat;", "Lcom/datadog/android/sessionreplay/recorder/mapper/TextViewMapper;", "textWireframeMapper", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "viewIdentifierResolver", "Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;", "colorStringFormatter", "Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "viewBoundsResolver", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "drawableToColorMapper", "<init>", "(Lcom/datadog/android/sessionreplay/recorder/mapper/TextViewMapper;Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;)V", "view", "Lcom/datadog/android/sessionreplay/recorder/MappingContext;", "mappingContext", "Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;", "asyncJobStatusCallback", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "resolveCheckable", "(Landroidx/appcompat/widget/SwitchCompat;Lcom/datadog/android/sessionreplay/recorder/MappingContext;Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;)Ljava/util/List;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "resolveMainWireframes", "(Landroidx/appcompat/widget/SwitchCompat;Lcom/datadog/android/sessionreplay/recorder/MappingContext;Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;Lcom/datadog/android/api/InternalLogger;)Ljava/util/List;", "resolveMaskedCheckable", "(Landroidx/appcompat/widget/SwitchCompat;Lcom/datadog/android/sessionreplay/recorder/MappingContext;)Ljava/util/List;", "p0", "", "p1", "Lcom/datadog/android/sessionreplay/internal/recorder/mapper/SwitchCompatMapper$GlobalBoundsInPx;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/appcompat/widget/SwitchCompat;F)Lcom/datadog/android/sessionreplay/internal/recorder/mapper/SwitchCompatMapper$GlobalBoundsInPx;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/recorder/mapper/TextViewMapper;", "getHighSpeedVideoFpsRanges", "Companion", "GlobalBoundsInPx"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class SwitchCompatMapper extends com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableWireframeMapper<androidx.appcompat.widget.SwitchCompat> {
    public static final java.lang.String THUMB_KEY_NAME = "thumb";
    public static final java.lang.String TRACK_KEY_NAME = "track";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.recorder.mapper.TextViewMapper<androidx.appcompat.widget.SwitchCompat> getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwitchCompatMapper(com.datadog.android.sessionreplay.recorder.mapper.TextViewMapper<? super androidx.appcompat.widget.SwitchCompat> textViewMapper, com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver, com.datadog.android.sessionreplay.utils.ColorStringFormatter colorStringFormatter, com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver, com.datadog.android.sessionreplay.utils.DrawableToColorMapper drawableToColorMapper) {
        super(viewIdentifierResolver, colorStringFormatter, viewBoundsResolver, drawableToColorMapper);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textViewMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIdentifierResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorStringFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBoundsResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawableToColorMapper, "");
        this.getHighSpeedVideoFpsRanges = textViewMapper;
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableWireframeMapper
    public java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> resolveMainWireframes(androidx.appcompat.widget.SwitchCompat view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncJobStatusCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        return this.getHighSpeedVideoFpsRanges.map((com.datadog.android.sessionreplay.recorder.mapper.TextViewMapper<androidx.appcompat.widget.SwitchCompat>) view, mappingContext, asyncJobStatusCallback, internalLogger);
    }

    private final com.datadog.android.sessionreplay.internal.recorder.mapper.SwitchCompatMapper.GlobalBoundsInPx getHighSpeedVideoFpsRangesFor(androidx.appcompat.widget.SwitchCompat p0, float p1) {
        android.graphics.drawable.Drawable trackDrawable;
        com.datadog.android.sessionreplay.utils.GlobalBounds resolveViewGlobalBounds = getViewBoundsResolver().resolveViewGlobalBounds(p0, p1);
        android.graphics.drawable.Drawable trackDrawable2 = p0.getTrackDrawable();
        kotlin.Pair pair = trackDrawable2 != null ? new kotlin.Pair(java.lang.Integer.valueOf(trackDrawable2.getBounds().width()), java.lang.Integer.valueOf(trackDrawable2.getBounds().height())) : null;
        if (pair == null || (trackDrawable = p0.getTrackDrawable()) == null) {
            return null;
        }
        return new com.datadog.android.sessionreplay.internal.recorder.mapper.SwitchCompatMapper.GlobalBoundsInPx(((int) (resolveViewGlobalBounds.getX() * p1)) + trackDrawable.getBounds().left, ((int) (resolveViewGlobalBounds.getY() * p1)) + trackDrawable.getBounds().top, ((java.lang.Number) pair.getFirst()).intValue(), ((java.lang.Number) pair.getSecond()).intValue());
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableWireframeMapper
    public java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> resolveMaskedCheckable(androidx.appcompat.widget.SwitchCompat view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        float screenDensity = mappingContext.getSystemInformation().getScreenDensity();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (getHighSpeedVideoFpsRangesFor(view, screenDensity) == null) {
            return null;
        }
        java.lang.String formatColorAndAlphaAsHexString = getColorStringFormatter().formatColorAndAlphaAsHexString(view.getCurrentTextColor(), 255);
        java.lang.Long resolveChildUniqueIdentifier = getViewIdentifierResolver().resolveChildUniqueIdentifier(view, "track");
        if (resolveChildUniqueIdentifier != null) {
            arrayList.add(new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe(resolveChildUniqueIdentifier.longValue(), com.datadog.android.internal.utils.IntExtKt.densityNormalized(r4.getX(), screenDensity), com.datadog.android.internal.utils.IntExtKt.densityNormalized(r4.getY(), screenDensity), com.datadog.android.internal.utils.IntExtKt.densityNormalized(r4.getWidth(), screenDensity), com.datadog.android.internal.utils.IntExtKt.densityNormalized(r4.getHeight(), screenDensity), null, new com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle(formatColorAndAlphaAsHexString, java.lang.Float.valueOf(view.getAlpha()), null, 4, null), null, 32, null));
        }
        return arrayList;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/mapper/SwitchCompatMapper$GlobalBoundsInPx;", "", "", "x", "y", "width", "height", "<init>", "(IIII)V", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Lcom/datadog/android/sessionreplay/internal/recorder/mapper/SwitchCompatMapper$GlobalBoundsInPx;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getHeight", "getWidth", "getX", "getY"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class GlobalBoundsInPx {
        private final int height;
        private final int width;
        private final int x;
        private final int y;

        public GlobalBoundsInPx(int i, int i2, int i3, int i4) {
            this.x = i;
            this.y = i2;
            this.width = i3;
            this.height = i4;
        }

        public final int getX() {
            return this.x;
        }

        public final int getY() {
            return this.y;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getHeight() {
            return this.height;
        }

        public final java.lang.String toString() {
            int i = this.x;
            int i2 = this.y;
            int i3 = this.width;
            int i4 = this.height;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GlobalBoundsInPx(x=");
            sb.append(i);
            sb.append(", y=");
            sb.append(i2);
            sb.append(", width=");
            sb.append(i3);
            sb.append(", height=");
            sb.append(i4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((java.lang.Integer.hashCode(this.x) * 31) + java.lang.Integer.hashCode(this.y)) * 31) + java.lang.Integer.hashCode(this.width)) * 31) + java.lang.Integer.hashCode(this.height);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.sessionreplay.internal.recorder.mapper.SwitchCompatMapper.GlobalBoundsInPx)) {
                return false;
            }
            com.datadog.android.sessionreplay.internal.recorder.mapper.SwitchCompatMapper.GlobalBoundsInPx globalBoundsInPx = (com.datadog.android.sessionreplay.internal.recorder.mapper.SwitchCompatMapper.GlobalBoundsInPx) other;
            return this.x == globalBoundsInPx.x && this.y == globalBoundsInPx.y && this.width == globalBoundsInPx.width && this.height == globalBoundsInPx.height;
        }

        public final com.datadog.android.sessionreplay.internal.recorder.mapper.SwitchCompatMapper.GlobalBoundsInPx copy(int x, int y, int width, int height) {
            return new com.datadog.android.sessionreplay.internal.recorder.mapper.SwitchCompatMapper.GlobalBoundsInPx(x, y, width, height);
        }

        /* renamed from: component4, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* renamed from: component3, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final int getY() {
            return this.y;
        }

        /* renamed from: component1, reason: from getter */
        public final int getX() {
            return this.x;
        }

        public static /* synthetic */ com.datadog.android.sessionreplay.internal.recorder.mapper.SwitchCompatMapper.GlobalBoundsInPx copy$default(com.datadog.android.sessionreplay.internal.recorder.mapper.SwitchCompatMapper.GlobalBoundsInPx globalBoundsInPx, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
            if ((i5 & 1) != 0) {
                i = globalBoundsInPx.x;
            }
            if ((i5 & 2) != 0) {
                i2 = globalBoundsInPx.y;
            }
            if ((i5 & 4) != 0) {
                i3 = globalBoundsInPx.width;
            }
            if ((i5 & 8) != 0) {
                i4 = globalBoundsInPx.height;
            }
            return globalBoundsInPx.copy(i, i2, i3, i4);
        }
    }

    /* renamed from: $r8$lambda$S2MEkU5rUpxIU-zR2mhKolWtuVo, reason: not valid java name */
    public static /* synthetic */ android.graphics.drawable.Drawable m10027$r8$lambda$S2MEkU5rUpxIUzR2mhKolWtuVo(androidx.appcompat.widget.SwitchCompat switchCompat, android.graphics.drawable.Drawable drawable, android.content.res.Resources resources) {
        android.graphics.drawable.Drawable newDrawable;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null || (newDrawable = constantState.newDrawable(resources)) == null) {
            return null;
        }
        newDrawable.setState(switchCompat.getThumbDrawable().getState());
        newDrawable.setBounds(switchCompat.getThumbDrawable().getBounds());
        android.content.res.ColorStateList thumbTintList = switchCompat.getThumbTintList();
        if (thumbTintList != null) {
            newDrawable.setTintList(thumbTintList);
        }
        return newDrawable;
    }

    public static /* synthetic */ android.graphics.drawable.Drawable $r8$lambda$rwXbqabdOGmGmXaL8_RY1YKltG0(androidx.appcompat.widget.SwitchCompat switchCompat, android.graphics.drawable.Drawable drawable, android.content.res.Resources resources) {
        android.graphics.drawable.Drawable newDrawable;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null || (newDrawable = constantState.newDrawable(resources)) == null) {
            return null;
        }
        newDrawable.setState(switchCompat.getTrackDrawable().getState());
        newDrawable.setBounds(switchCompat.getTrackDrawable().getBounds());
        android.content.res.ColorStateList trackTintList = switchCompat.getTrackTintList();
        if (trackTintList != null) {
            newDrawable.setTintList(trackTintList);
        }
        return newDrawable;
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableWireframeMapper
    public java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> resolveCheckable(final androidx.appcompat.widget.SwitchCompat view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback) {
        com.datadog.android.sessionreplay.internal.recorder.mapper.SwitchCompatMapper.GlobalBoundsInPx globalBoundsInPx;
        androidx.appcompat.widget.SwitchCompat switchCompat;
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe;
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncJobStatusCallback, "");
        float screenDensity = mappingContext.getSystemInformation().getScreenDensity();
        androidx.appcompat.widget.SwitchCompat switchCompat2 = view;
        com.datadog.android.sessionreplay.utils.GlobalBounds resolveViewGlobalBounds = getViewBoundsResolver().resolveViewGlobalBounds(switchCompat2, screenDensity);
        android.graphics.drawable.Drawable thumbDrawable = view.getThumbDrawable();
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe3 = null;
        kotlin.Pair pair = thumbDrawable != null ? new kotlin.Pair(java.lang.Integer.valueOf(thumbDrawable.getIntrinsicWidth()), java.lang.Integer.valueOf(thumbDrawable.getIntrinsicHeight())) : null;
        if (pair == null) {
            globalBoundsInPx = null;
        } else {
            globalBoundsInPx = new com.datadog.android.sessionreplay.internal.recorder.mapper.SwitchCompatMapper.GlobalBoundsInPx(((int) (resolveViewGlobalBounds.getX() * screenDensity)) + view.getThumbDrawable().getBounds().left, ((int) (resolveViewGlobalBounds.getY() * screenDensity)) + view.getThumbDrawable().getBounds().top, ((java.lang.Number) pair.getFirst()).intValue(), ((java.lang.Number) pair.getSecond()).intValue());
        }
        android.graphics.drawable.Drawable thumbDrawable2 = view.getThumbDrawable();
        com.datadog.android.sessionreplay.recorder.resources.DrawableCopier drawableCopier = new com.datadog.android.sessionreplay.recorder.resources.DrawableCopier() { // from class: com.datadog.android.sessionreplay.internal.recorder.mapper.SwitchCompatMapper$$ExternalSyntheticLambda1
            @Override // com.datadog.android.sessionreplay.recorder.resources.DrawableCopier
            public final android.graphics.drawable.Drawable copy(android.graphics.drawable.Drawable drawable, android.content.res.Resources resources) {
                return com.datadog.android.sessionreplay.internal.recorder.mapper.SwitchCompatMapper.m10027$r8$lambda$S2MEkU5rUpxIUzR2mhKolWtuVo(androidx.appcompat.widget.SwitchCompat.this, drawable, resources);
            }
        };
        if (globalBoundsInPx != null) {
            com.datadog.android.sessionreplay.utils.ImageWireframeHelper imageWireframeHelper = mappingContext.getImageWireframeHelper();
            com.datadog.android.sessionreplay.ImagePrivacy mapInputPrivacyToImagePrivacy = mapInputPrivacyToImagePrivacy(mappingContext.getTextAndInputPrivacy());
            long densityNormalized = com.datadog.android.internal.utils.IntExtKt.densityNormalized(globalBoundsInPx.getX(), mappingContext.getSystemInformation().getScreenDensity());
            long densityNormalized2 = com.datadog.android.internal.utils.IntExtKt.densityNormalized(globalBoundsInPx.getY(), mappingContext.getSystemInformation().getScreenDensity());
            int intrinsicWidth = thumbDrawable2.getIntrinsicWidth();
            int intrinsicHeight = thumbDrawable2.getIntrinsicHeight();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(thumbDrawable2, "");
            switchCompat = switchCompat2;
            wireframe = com.datadog.android.sessionreplay.utils.ImageWireframeHelper.DefaultImpls.createImageWireframeByDrawable$default(imageWireframeHelper, switchCompat, mapInputPrivacyToImagePrivacy, 1, densityNormalized, densityNormalized2, intrinsicWidth, intrinsicHeight, true, thumbDrawable2, drawableCopier, asyncJobStatusCallback, null, null, null, null, null, 16384, null);
        } else {
            switchCompat = switchCompat2;
            wireframe = null;
        }
        int i = wireframe != null ? 1 : 0;
        com.datadog.android.sessionreplay.internal.recorder.mapper.SwitchCompatMapper.GlobalBoundsInPx highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(view, mappingContext.getSystemInformation().getScreenDensity());
        if (highSpeedVideoFpsRangesFor != null) {
            android.graphics.drawable.Drawable trackDrawable = view.getTrackDrawable();
            com.datadog.android.sessionreplay.recorder.resources.DrawableCopier drawableCopier2 = new com.datadog.android.sessionreplay.recorder.resources.DrawableCopier() { // from class: com.datadog.android.sessionreplay.internal.recorder.mapper.SwitchCompatMapper$$ExternalSyntheticLambda0
                @Override // com.datadog.android.sessionreplay.recorder.resources.DrawableCopier
                public final android.graphics.drawable.Drawable copy(android.graphics.drawable.Drawable drawable, android.content.res.Resources resources) {
                    return com.datadog.android.sessionreplay.internal.recorder.mapper.SwitchCompatMapper.$r8$lambda$rwXbqabdOGmGmXaL8_RY1YKltG0(androidx.appcompat.widget.SwitchCompat.this, drawable, resources);
                }
            };
            com.datadog.android.sessionreplay.utils.ImageWireframeHelper imageWireframeHelper2 = mappingContext.getImageWireframeHelper();
            com.datadog.android.sessionreplay.ImagePrivacy mapInputPrivacyToImagePrivacy2 = mapInputPrivacyToImagePrivacy(mappingContext.getTextAndInputPrivacy());
            long densityNormalized3 = com.datadog.android.internal.utils.IntExtKt.densityNormalized(highSpeedVideoFpsRangesFor.getX(), mappingContext.getSystemInformation().getScreenDensity());
            long densityNormalized4 = com.datadog.android.internal.utils.IntExtKt.densityNormalized(highSpeedVideoFpsRangesFor.getY(), mappingContext.getSystemInformation().getScreenDensity());
            int width = highSpeedVideoFpsRangesFor.getWidth();
            int height = highSpeedVideoFpsRangesFor.getHeight();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trackDrawable, "");
            wireframe2 = wireframe;
            wireframe3 = com.datadog.android.sessionreplay.utils.ImageWireframeHelper.DefaultImpls.createImageWireframeByDrawable$default(imageWireframeHelper2, switchCompat, mapInputPrivacyToImagePrivacy2, 1 + i, densityNormalized3, densityNormalized4, width, height, true, trackDrawable, drawableCopier2, asyncJobStatusCallback, null, null, null, null, null, 18432, null);
        } else {
            wireframe2 = wireframe;
        }
        return kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe[]{wireframe3, wireframe2});
    }
}
