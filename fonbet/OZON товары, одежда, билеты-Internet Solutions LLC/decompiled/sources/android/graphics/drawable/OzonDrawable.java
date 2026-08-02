package android.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J(\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\bH\u0016J\u0018\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020\nH\u0016J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\nH\u0016J\b\u0010*\u001a\u00020\nH\u0016J\u0010\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\nH\u0016J\u0012\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00100\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u00102\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u000104H\u0017J\n\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020\bH\u0016J\u0018\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:H\u0016J(\u0010<\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u0013H\u0016J\b\u0010?\u001a\u00020\u001aH\u0017J\b\u0010@\u001a\u00020\u001aH\u0016J\u0010\u0010A\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020CH\u0016J\b\u0010D\u001a\u00020CH\u0016J\b\u0010E\u001a\u00020\bH\u0016J\b\u0010F\u001a\u00020\u0001H\u0016J\u0018\u0010G\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020\u001aH\u0016J\u0010\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\u001aH\u0016J\b\u0010L\u001a\u00020\u001aH\u0016J\u0014\u0010M\u001a\u00020\b2\n\u0010N\u001a\u00060OR\u00020PH\u0016J\b\u0010Q\u001a\u00020\u001aH\u0016J\n\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u0010\u0010T\u001a\u00020\u001a2\u0006\u0010U\u001a\u00020CH\u0014J\u0010\u0010V\u001a\u00020\u001a2\u0006\u0010W\u001a\u00020\nH\u0014J\u0010\u0010X\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010Y\u001a\u00020\nH\u0016J\b\u0010Z\u001a\u00020\nH\u0016J\b\u0010[\u001a\u00020\nH\u0016J\b\u0010\\\u001a\u00020\nH\u0016J\u0010\u0010]\u001a\u00020\u001a2\u0006\u0010^\u001a\u00020\u0013H\u0016J\b\u0010_\u001a\u00020`H\u0017J\u0010\u0010a\u001a\u00020\b2\u0006\u0010b\u001a\u00020cH\u0016J\b\u0010d\u001a\u00020\u0001H\u0016J \u0010e\u001a\u00020\b2\u0006\u0010f\u001a\u00020P2\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020jH\u0016J.\u0010e\u001a\u00020\b2\u0006\u0010f\u001a\u00020P2\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020j2\f\u0010k\u001a\b\u0018\u00010OR\u00020PH\u0016J\n\u0010l\u001a\u0004\u0018\u00010mH\u0016J\u0010\u0010n\u001a\u00020\b2\u0006\u0010o\u001a\u00020pH\u0016J\u0010\u0010q\u001a\u00020\b2\u0006\u0010r\u001a\u00020\nH\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010s\u001a\u0004\u0018\u000106H\u0016J\b\u0010t\u001a\u00020\nH\u0016J\u0013\u0010u\u001a\u00020\u001a2\b\u0010v\u001a\u0004\u0018\u00010wH\u0096\u0002J\b\u0010x\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006y"}, d2 = {"Landroid/graphics/drawable/OzonDrawable;", "Landroid/graphics/drawable/Drawable;", "source", "", "delegateDrawable", "<init>", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V", "setColorFilter", "", "color", "", "mode", "Landroid/graphics/PorterDuff$Mode;", "setBounds", "left", "top", "right", "bottom", "bounds", "Landroid/graphics/Rect;", "getDirtyBounds", "setChangingConfigurations", "configs", "getChangingConfigurations", "setDither", "dither", "", "setFilterBitmap", "filter", "isFilterBitmap", "getCallback", "Landroid/graphics/drawable/Drawable$Callback;", "invalidateSelf", "scheduleSelf", "what", "Ljava/lang/Runnable;", "schedule", "", "unscheduleSelf", "getLayoutDirection", "onLayoutDirectionChanged", "layoutDirection", "getAlpha", "setTint", "tintColor", "setTintList", "tint", "Landroid/content/res/ColorStateList;", "setTintMode", "tintMode", "setTintBlendMode", "blendMode", "Landroid/graphics/BlendMode;", "getColorFilter", "Landroid/graphics/ColorFilter;", "clearColorFilter", "setHotspot", "x", "", "y", "setHotspotBounds", "getHotspotBounds", "outRect", "isProjected", "isStateful", "setState", "stateSet", "", "getState", "jumpToCurrentState", "getCurrent", "setVisible", "visible", "restart", "setAutoMirrored", "mirrored", "isAutoMirrored", "applyTheme", "t", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "canApplyTheme", "getTransparentRegion", "Landroid/graphics/Region;", "onStateChange", "state", "onLevelChange", "level", "onBoundsChange", "getIntrinsicWidth", "getIntrinsicHeight", "getMinimumWidth", "getMinimumHeight", "getPadding", "padding", "getOpticalInsets", "Landroid/graphics/Insets;", "getOutline", "outline", "Landroid/graphics/Outline;", "mutate", "inflate", "r", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "attrs", "Landroid/util/AttributeSet;", "theme", "getConstantState", "Landroid/graphics/drawable/Drawable$ConstantState;", "draw", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "colorFilter", "getOpacity", "equals", "other", "", "hashCode", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OzonDrawable extends Drawable {

    @NotNull
    private final Drawable delegateDrawable;

    @NotNull
    private final String source;

    public OzonDrawable(@NotNull String source, @NotNull Drawable delegateDrawable) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(delegateDrawable, "delegateDrawable");
        this.source = source;
        this.delegateDrawable = delegateDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(@NotNull Resources.Theme t2) {
        Intrinsics.checkNotNullParameter(t2, "t");
        this.delegateDrawable.applyTheme(t2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.delegateDrawable.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.delegateDrawable.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.delegateDrawable.draw(canvas);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!OzonDrawable.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type android.graphics.drawable.OzonDrawable");
        return Intrinsics.d(this.source, ((OzonDrawable) other).source);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.delegateDrawable.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return this.delegateDrawable.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.delegateDrawable.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.delegateDrawable.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.delegateDrawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    @NotNull
    public Drawable getCurrent() {
        Drawable current = this.delegateDrawable.getCurrent();
        Intrinsics.checkNotNullExpressionValue(current, "getCurrent(...)");
        return current;
    }

    @Override // android.graphics.drawable.Drawable
    @NotNull
    public Rect getDirtyBounds() {
        Rect dirtyBounds = this.delegateDrawable.getDirtyBounds();
        Intrinsics.checkNotNullExpressionValue(dirtyBounds, "getDirtyBounds(...)");
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@NotNull Rect outRect) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        this.delegateDrawable.getHotspotBounds(outRect);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.delegateDrawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.delegateDrawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return this.delegateDrawable.getLayoutDirection();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.delegateDrawable.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.delegateDrawable.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.delegateDrawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    @NotNull
    public Insets getOpticalInsets() {
        Insets opticalInsets;
        opticalInsets = this.delegateDrawable.getOpticalInsets();
        Intrinsics.checkNotNullExpressionValue(opticalInsets, "getOpticalInsets(...)");
        return opticalInsets;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NotNull Outline outline) {
        Intrinsics.checkNotNullParameter(outline, "outline");
        this.delegateDrawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NotNull Rect padding) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        return this.delegateDrawable.getPadding(padding);
    }

    @Override // android.graphics.drawable.Drawable
    @NotNull
    public int[] getState() {
        int[] state = this.delegateDrawable.getState();
        Intrinsics.checkNotNullExpressionValue(state, "getState(...)");
        return state;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.delegateDrawable.getTransparentRegion();
    }

    public int hashCode() {
        return this.source.hashCode();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(@NotNull Resources r11, @NotNull XmlPullParser parser, @NotNull AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(r11, "r");
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.delegateDrawable.inflate(r11, parser, attrs);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.delegateDrawable.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.delegateDrawable.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isFilterBitmap() {
        return this.delegateDrawable.isFilterBitmap();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        boolean isProjected;
        isProjected = this.delegateDrawable.isProjected();
        return isProjected;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.delegateDrawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.delegateDrawable.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @NotNull
    public Drawable mutate() {
        Drawable mutate = this.delegateDrawable.mutate();
        Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
        return mutate;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.delegateDrawable.onBoundsChange(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int layoutDirection) {
        return this.delegateDrawable.onLayoutDirectionChanged(layoutDirection);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int level) {
        return this.delegateDrawable.onLevelChange(level);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@NotNull int[] state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return this.delegateDrawable.onStateChange(state);
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(@NotNull Runnable what, long schedule) {
        Intrinsics.checkNotNullParameter(what, "what");
        this.delegateDrawable.scheduleSelf(what, schedule);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.delegateDrawable.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean mirrored) {
        this.delegateDrawable.setAutoMirrored(mirrored);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int left, int top, int right, int bottom) {
        this.delegateDrawable.setBounds(left, top, right, bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int configs) {
        this.delegateDrawable.setChangingConfigurations(configs);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int color, @NotNull PorterDuff.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.delegateDrawable.setColorFilter(color, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean dither) {
        this.delegateDrawable.setDither(dither);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean filter) {
        this.delegateDrawable.setFilterBitmap(filter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float x11, float y11) {
        this.delegateDrawable.setHotspot(x11, y11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int left, int top, int right, int bottom) {
        this.delegateDrawable.setHotspotBounds(left, top, right, bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@NotNull int[] stateSet) {
        Intrinsics.checkNotNullParameter(stateSet, "stateSet");
        return this.delegateDrawable.setState(stateSet);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int tintColor) {
        this.delegateDrawable.setTint(tintColor);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        this.delegateDrawable.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tint) {
        this.delegateDrawable.setTintList(tint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode tintMode) {
        this.delegateDrawable.setTintMode(tintMode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        return this.delegateDrawable.setVisible(visible, restart);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(@NotNull Runnable what) {
        Intrinsics.checkNotNullParameter(what, "what");
        this.delegateDrawable.unscheduleSelf(what);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(@NotNull Resources r11, @NotNull XmlPullParser parser, @NotNull AttributeSet attrs, Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(r11, "r");
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.delegateDrawable.inflate(r11, parser, attrs, theme);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.delegateDrawable.setBounds(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.delegateDrawable.setColorFilter(colorFilter);
    }
}
