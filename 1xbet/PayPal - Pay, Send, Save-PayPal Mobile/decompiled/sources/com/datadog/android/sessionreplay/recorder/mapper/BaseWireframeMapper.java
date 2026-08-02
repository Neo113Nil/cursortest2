package com.datadog.android.sessionreplay.recorder.mapper;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\b&\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0001H\u0004¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\n8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Lcom/datadog/android/sessionreplay/recorder/mapper/BaseWireframeMapper;", "Landroid/view/View;", "T", "Lcom/datadog/android/sessionreplay/recorder/mapper/WireframeMapper;", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "viewIdentifierResolver", "Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;", "colorStringFormatter", "Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "viewBoundsResolver", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "drawableToColorMapper", "<init>", "(Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "", "viewAlpha", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "resolveShapeStyle", "(Landroid/graphics/drawable/Drawable;FLcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "view", "", "resolveViewId", "(Landroid/view/View;)J", "Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;", "getColorStringFormatter", "()Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "getDrawableToColorMapper", "()Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "getViewBoundsResolver", "()Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "getViewIdentifierResolver", "()Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class BaseWireframeMapper<T extends android.view.View> implements com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<T> {
    private final com.datadog.android.sessionreplay.utils.ColorStringFormatter colorStringFormatter;
    private final com.datadog.android.sessionreplay.utils.DrawableToColorMapper drawableToColorMapper;
    private final com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver;
    private final com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver;

    public BaseWireframeMapper(com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver, com.datadog.android.sessionreplay.utils.ColorStringFormatter colorStringFormatter, com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver, com.datadog.android.sessionreplay.utils.DrawableToColorMapper drawableToColorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIdentifierResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorStringFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBoundsResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawableToColorMapper, "");
        this.viewIdentifierResolver = viewIdentifierResolver;
        this.colorStringFormatter = colorStringFormatter;
        this.viewBoundsResolver = viewBoundsResolver;
        this.drawableToColorMapper = drawableToColorMapper;
    }

    protected final com.datadog.android.sessionreplay.utils.ViewIdentifierResolver getViewIdentifierResolver() {
        return this.viewIdentifierResolver;
    }

    protected final com.datadog.android.sessionreplay.utils.ColorStringFormatter getColorStringFormatter() {
        return this.colorStringFormatter;
    }

    protected final com.datadog.android.sessionreplay.utils.ViewBoundsResolver getViewBoundsResolver() {
        return this.viewBoundsResolver;
    }

    protected final com.datadog.android.sessionreplay.utils.DrawableToColorMapper getDrawableToColorMapper() {
        return this.drawableToColorMapper;
    }

    protected final long resolveViewId(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        return this.viewIdentifierResolver.resolveViewId(view);
    }

    protected final com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle resolveShapeStyle(android.graphics.drawable.Drawable drawable, float viewAlpha, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        java.lang.Integer mapDrawableToColor = this.drawableToColorMapper.mapDrawableToColor(drawable, internalLogger);
        if (mapDrawableToColor != null) {
            return new com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle(this.colorStringFormatter.formatColorAsHexString(mapDrawableToColor.intValue()), java.lang.Float.valueOf(viewAlpha), null, 4, null);
        }
        return null;
    }
}
