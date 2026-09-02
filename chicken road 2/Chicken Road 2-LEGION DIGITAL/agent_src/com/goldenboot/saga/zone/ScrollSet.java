package com.goldenboot.saga.zone;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import com.goldenboot.saga.zone.BreadcrumbBenchmark;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class ScrollSet extends RailSynthesizer {
    public static final PorterDuff.Mode drawScope = PorterDuff.Mode.SRC_IN;
    public ColorFilter attachConfig;
    public PorterDuffColorFilter connectPatch;
    public final Rect decodePath;
    public final float[] drawRequest;
    public final Matrix gatherAdapter;
    public boolean inflateAdapter;
    public PluginInterpreter notifyMessage;
    public Drawable.ConstantState purgeNode;
    public boolean resetDelta;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class BounceHandler extends StylusConverter {
        public BounceHandler() {
        }

        private void clipOrigin(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.growPayload = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.evictLayout = BreadcrumbBenchmark.detachStream(string2);
            }
            this.injectMetric = ViewSteward.flushSample(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // com.goldenboot.saga.zone.ScrollSet.StylusConverter
        public boolean injectMetric() {
            return true;
        }

        public void releaseHeader(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (ViewSteward.updateTimer(xmlPullParser, "pathData")) {
                TypedArray applyTask = ViewSteward.applyTask(resources, theme, attributeSet, PrimaryLauncher.detachStream);
                clipOrigin(applyTask, xmlPullParser);
                applyTask.recycle();
            }
        }

        public BounceHandler(BounceHandler bounceHandler) {
            super(bounceHandler);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static abstract class EndpointList {
        public EndpointList() {
        }

        public boolean evictLayout() {
            return false;
        }

        public boolean growPayload(int[] iArr) {
            return false;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class PluginInterpreter extends Drawable.ConstantState {
        public int applyTask;
        public Bitmap clipOrigin;
        public Paint connectJob;
        public PorterDuff.Mode detachStream;
        public boolean drawField;
        public int evictLayout;
        public ColorStateList flushSample;
        public ScopedMigration growPayload;
        public ColorStateList injectMetric;
        public boolean popBlueprint;
        public boolean releaseHeader;
        public PorterDuff.Mode updateTimer;

        public PluginInterpreter(PluginInterpreter pluginInterpreter) {
            this.injectMetric = null;
            this.detachStream = ScrollSet.drawScope;
            if (pluginInterpreter != null) {
                this.evictLayout = pluginInterpreter.evictLayout;
                ScopedMigration scopedMigration = new ScopedMigration(pluginInterpreter.growPayload);
                this.growPayload = scopedMigration;
                if (pluginInterpreter.growPayload.releaseHeader != null) {
                    scopedMigration.releaseHeader = new Paint(pluginInterpreter.growPayload.releaseHeader);
                }
                if (pluginInterpreter.growPayload.detachStream != null) {
                    this.growPayload.detachStream = new Paint(pluginInterpreter.growPayload.detachStream);
                }
                this.injectMetric = pluginInterpreter.injectMetric;
                this.detachStream = pluginInterpreter.detachStream;
                this.releaseHeader = pluginInterpreter.releaseHeader;
            }
        }

        public void applyTask() {
            this.flushSample = this.injectMetric;
            this.updateTimer = this.detachStream;
            this.applyTask = this.growPayload.getRootAlpha();
            this.popBlueprint = this.releaseHeader;
            this.drawField = false;
        }

        public boolean clipOrigin() {
            return this.growPayload.getRootAlpha() < 255;
        }

        public void detachStream(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.clipOrigin, (Rect) null, rect, releaseHeader(colorFilter));
        }

        public boolean evictLayout(int i, int i2) {
            return i == this.clipOrigin.getWidth() && i2 == this.clipOrigin.getHeight();
        }

        public boolean flushSample() {
            return this.growPayload.clipOrigin();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.evictLayout;
        }

        public boolean growPayload() {
            return !this.drawField && this.flushSample == this.injectMetric && this.updateTimer == this.detachStream && this.popBlueprint == this.releaseHeader && this.applyTask == this.growPayload.getRootAlpha();
        }

        public void injectMetric(int i, int i2) {
            if (this.clipOrigin == null || !evictLayout(i, i2)) {
                this.clipOrigin = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.drawField = true;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new ScrollSet(this);
        }

        public void popBlueprint(int i, int i2) {
            this.clipOrigin.eraseColor(0);
            this.growPayload.growPayload(new Canvas(this.clipOrigin), i, i2, null);
        }

        public Paint releaseHeader(ColorFilter colorFilter) {
            if (!clipOrigin() && colorFilter == null) {
                return null;
            }
            if (this.connectJob == null) {
                Paint paint = new Paint();
                this.connectJob = paint;
                paint.setFilterBitmap(true);
            }
            this.connectJob.setAlpha(this.growPayload.getRootAlpha());
            this.connectJob.setColorFilter(colorFilter);
            return this.connectJob;
        }

        public boolean updateTimer(int[] iArr) {
            boolean flushSample = this.growPayload.flushSample(iArr);
            this.drawField |= flushSample;
            return flushSample;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new ScrollSet(this);
        }

        public PluginInterpreter() {
            this.injectMetric = null;
            this.detachStream = ScrollSet.drawScope;
            this.growPayload = new ScopedMigration();
        }
    }

    public ScrollSet() {
        this.inflateAdapter = true;
        this.drawRequest = new float[9];
        this.gatherAdapter = new Matrix();
        this.decodePath = new Rect();
        this.notifyMessage = new PluginInterpreter();
    }

    public static PorterDuff.Mode clipOrigin(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case ViewStreamer.connectJob /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static int evictLayout(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    public static ScrollSet growPayload(Resources resources, int i, Resources.Theme theme) {
        ScrollSet scrollSet = new ScrollSet();
        scrollSet.reduceScope = RestoreSegment.clipOrigin(resources, i, theme);
        scrollSet.purgeNode = new RestoreToggle(scrollSet.reduceScope.getConstantState());
        return scrollSet;
    }

    public PorterDuffColorFilter applyTask(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // com.goldenboot.saga.zone.RailSynthesizer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.reduceScope;
        if (drawable == null) {
            return false;
        }
        LayerTimer.growPayload(drawable);
        return false;
    }

    @Override // com.goldenboot.saga.zone.RailSynthesizer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final void detachStream(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        PluginInterpreter pluginInterpreter = this.notifyMessage;
        ScopedMigration scopedMigration = pluginInterpreter.growPayload;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(scopedMigration.updateTimer);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                LayerUseCase layerUseCase = (LayerUseCase) arrayDeque.peek();
                if ("path".equals(name)) {
                    FeedbackFlow feedbackFlow = new FeedbackFlow();
                    feedbackFlow.flushSample(resources, attributeSet, theme, xmlPullParser);
                    layerUseCase.growPayload.add(feedbackFlow);
                    if (feedbackFlow.getPathName() != null) {
                        scopedMigration.notifyMessage.put(feedbackFlow.getPathName(), feedbackFlow);
                    }
                    pluginInterpreter.evictLayout = feedbackFlow.detachStream | pluginInterpreter.evictLayout;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    BounceHandler bounceHandler = new BounceHandler();
                    bounceHandler.releaseHeader(resources, attributeSet, theme, xmlPullParser);
                    layerUseCase.growPayload.add(bounceHandler);
                    if (bounceHandler.getPathName() != null) {
                        scopedMigration.notifyMessage.put(bounceHandler.getPathName(), bounceHandler);
                    }
                    pluginInterpreter.evictLayout = bounceHandler.detachStream | pluginInterpreter.evictLayout;
                } else if ("group".equals(name)) {
                    LayerUseCase layerUseCase2 = new LayerUseCase();
                    layerUseCase2.injectMetric(resources, attributeSet, theme, xmlPullParser);
                    layerUseCase.growPayload.add(layerUseCase2);
                    arrayDeque.push(layerUseCase2);
                    if (layerUseCase2.getGroupName() != null) {
                        scopedMigration.notifyMessage.put(layerUseCase2.getGroupName(), layerUseCase2);
                    }
                    pluginInterpreter.evictLayout = layerUseCase2.drawField | pluginInterpreter.evictLayout;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.reduceScope;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.decodePath);
        if (this.decodePath.width() <= 0 || this.decodePath.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.attachConfig;
        if (colorFilter == null) {
            colorFilter = this.connectPatch;
        }
        canvas.getMatrix(this.gatherAdapter);
        this.gatherAdapter.getValues(this.drawRequest);
        float abs = Math.abs(this.drawRequest[0]);
        float abs2 = Math.abs(this.drawRequest[4]);
        float abs3 = Math.abs(this.drawRequest[1]);
        float abs4 = Math.abs(this.drawRequest[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(ContentOperation.CameraDistance, (int) (this.decodePath.width() * abs));
        int min2 = Math.min(ContentOperation.CameraDistance, (int) (this.decodePath.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.decodePath;
        canvas.translate(rect.left, rect.top);
        if (releaseHeader()) {
            canvas.translate(this.decodePath.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.decodePath.offsetTo(0, 0);
        this.notifyMessage.injectMetric(min, min2);
        if (!this.inflateAdapter) {
            this.notifyMessage.popBlueprint(min, min2);
        } else if (!this.notifyMessage.growPayload()) {
            this.notifyMessage.popBlueprint(min, min2);
            this.notifyMessage.applyTask();
        }
        this.notifyMessage.detachStream(canvas, colorFilter, this.decodePath);
        canvas.restoreToCount(save);
    }

    public void flushSample(boolean z) {
        this.inflateAdapter = z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.reduceScope;
        return drawable != null ? LayerTimer.detachStream(drawable) : this.notifyMessage.growPayload.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.reduceScope;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.notifyMessage.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.reduceScope;
        return drawable != null ? LayerTimer.releaseHeader(drawable) : this.attachConfig;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.reduceScope != null) {
            return new RestoreToggle(this.reduceScope.getConstantState());
        }
        this.notifyMessage.evictLayout = getChangingConfigurations();
        return this.notifyMessage;
    }

    @Override // com.goldenboot.saga.zone.RailSynthesizer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.reduceScope;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.notifyMessage.growPayload.popBlueprint;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.reduceScope;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.notifyMessage.growPayload.applyTask;
    }

    @Override // com.goldenboot.saga.zone.RailSynthesizer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // com.goldenboot.saga.zone.RailSynthesizer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.reduceScope;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // com.goldenboot.saga.zone.RailSynthesizer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // com.goldenboot.saga.zone.RailSynthesizer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // com.goldenboot.saga.zone.RailSynthesizer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.reduceScope;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public Object injectMetric(String str) {
        return this.notifyMessage.growPayload.notifyMessage.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.reduceScope;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.reduceScope;
        return drawable != null ? LayerTimer.updateTimer(drawable) : this.notifyMessage.releaseHeader;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.reduceScope;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        PluginInterpreter pluginInterpreter = this.notifyMessage;
        if (pluginInterpreter == null) {
            return false;
        }
        if (pluginInterpreter.flushSample()) {
            return true;
        }
        ColorStateList colorStateList = this.notifyMessage.injectMetric;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // com.goldenboot.saga.zone.RailSynthesizer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.reduceScope;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.resetDelta && super.mutate() == this) {
            this.notifyMessage = new PluginInterpreter(this.notifyMessage);
            this.resetDelta = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.reduceScope;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.reduceScope;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        PluginInterpreter pluginInterpreter = this.notifyMessage;
        ColorStateList colorStateList = pluginInterpreter.injectMetric;
        if (colorStateList == null || (mode = pluginInterpreter.detachStream) == null) {
            z = false;
        } else {
            this.connectPatch = applyTask(this.connectPatch, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!pluginInterpreter.flushSample() || !pluginInterpreter.updateTimer(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public final boolean releaseHeader() {
        return isAutoMirrored() && LayerTimer.clipOrigin(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.reduceScope;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.reduceScope;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.notifyMessage.growPayload.getRootAlpha() != i) {
            this.notifyMessage.growPayload.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.reduceScope;
        if (drawable != null) {
            LayerTimer.popBlueprint(drawable, z);
        } else {
            this.notifyMessage.releaseHeader = z;
        }
    }

    @Override // com.goldenboot.saga.zone.RailSynthesizer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // com.goldenboot.saga.zone.RailSynthesizer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // com.goldenboot.saga.zone.RailSynthesizer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // com.goldenboot.saga.zone.RailSynthesizer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // com.goldenboot.saga.zone.RailSynthesizer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.goldenboot.saga.zone.RailSynthesizer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.reduceScope;
        if (drawable != null) {
            LayerTimer.serializeOffset(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.reduceScope;
        if (drawable != null) {
            LayerTimer.reduceScope(drawable, colorStateList);
            return;
        }
        PluginInterpreter pluginInterpreter = this.notifyMessage;
        if (pluginInterpreter.injectMetric != colorStateList) {
            pluginInterpreter.injectMetric = colorStateList;
            this.connectPatch = applyTask(this.connectPatch, colorStateList, pluginInterpreter.detachStream);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.reduceScope;
        if (drawable != null) {
            LayerTimer.notifyMessage(drawable, mode);
            return;
        }
        PluginInterpreter pluginInterpreter = this.notifyMessage;
        if (pluginInterpreter.detachStream != mode) {
            pluginInterpreter.detachStream = mode;
            this.connectPatch = applyTask(this.connectPatch, pluginInterpreter.injectMetric, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.reduceScope;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.reduceScope;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public final void updateTimer(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        PluginInterpreter pluginInterpreter = this.notifyMessage;
        ScopedMigration scopedMigration = pluginInterpreter.growPayload;
        pluginInterpreter.detachStream = clipOrigin(ViewSteward.flushSample(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList injectMetric = ViewSteward.injectMetric(typedArray, xmlPullParser, theme, "tint", 1);
        if (injectMetric != null) {
            pluginInterpreter.injectMetric = injectMetric;
        }
        pluginInterpreter.releaseHeader = ViewSteward.evictLayout(typedArray, xmlPullParser, "autoMirrored", 5, pluginInterpreter.releaseHeader);
        scopedMigration.drawField = ViewSteward.clipOrigin(typedArray, xmlPullParser, "viewportWidth", 7, scopedMigration.drawField);
        float clipOrigin = ViewSteward.clipOrigin(typedArray, xmlPullParser, "viewportHeight", 8, scopedMigration.connectJob);
        scopedMigration.connectJob = clipOrigin;
        if (scopedMigration.drawField <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (clipOrigin <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        scopedMigration.applyTask = typedArray.getDimension(3, scopedMigration.applyTask);
        float dimension = typedArray.getDimension(2, scopedMigration.popBlueprint);
        scopedMigration.popBlueprint = dimension;
        if (scopedMigration.applyTask <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        scopedMigration.setAlpha(ViewSteward.clipOrigin(typedArray, xmlPullParser, "alpha", 4, scopedMigration.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            scopedMigration.serializeOffset = string;
            scopedMigration.notifyMessage.put(string, scopedMigration);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class RestoreToggle extends Drawable.ConstantState {
        public final Drawable.ConstantState evictLayout;

        public RestoreToggle(Drawable.ConstantState constantState) {
            this.evictLayout = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.evictLayout.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.evictLayout.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            ScrollSet scrollSet = new ScrollSet();
            scrollSet.reduceScope = (VectorDrawable) this.evictLayout.newDrawable();
            return scrollSet;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            ScrollSet scrollSet = new ScrollSet();
            scrollSet.reduceScope = (VectorDrawable) this.evictLayout.newDrawable(resources);
            return scrollSet;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            ScrollSet scrollSet = new ScrollSet();
            scrollSet.reduceScope = (VectorDrawable) this.evictLayout.newDrawable(resources, theme);
            return scrollSet;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.reduceScope;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.attachConfig = colorFilter;
            invalidateSelf();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static abstract class StylusConverter extends EndpointList {
        public int detachStream;
        public BreadcrumbBenchmark.BounceHandler[] evictLayout;
        public String growPayload;
        public int injectMetric;

        public StylusConverter() {
            super();
            this.evictLayout = null;
            this.injectMetric = 0;
        }

        public void detachStream(Path path) {
            path.reset();
            BreadcrumbBenchmark.BounceHandler[] bounceHandlerArr = this.evictLayout;
            if (bounceHandlerArr != null) {
                BreadcrumbBenchmark.BounceHandler.updateTimer(bounceHandlerArr, path);
            }
        }

        public BreadcrumbBenchmark.BounceHandler[] getPathData() {
            return this.evictLayout;
        }

        public String getPathName() {
            return this.growPayload;
        }

        public boolean injectMetric() {
            return false;
        }

        public void setPathData(BreadcrumbBenchmark.BounceHandler[] bounceHandlerArr) {
            if (BreadcrumbBenchmark.growPayload(this.evictLayout, bounceHandlerArr)) {
                BreadcrumbBenchmark.drawField(this.evictLayout, bounceHandlerArr);
            } else {
                this.evictLayout = BreadcrumbBenchmark.clipOrigin(bounceHandlerArr);
            }
        }

        public StylusConverter(StylusConverter stylusConverter) {
            super();
            this.evictLayout = null;
            this.injectMetric = 0;
            this.growPayload = stylusConverter.growPayload;
            this.detachStream = stylusConverter.detachStream;
            this.evictLayout = BreadcrumbBenchmark.clipOrigin(stylusConverter.evictLayout);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.reduceScope;
        if (drawable != null) {
            LayerTimer.flushSample(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        PluginInterpreter pluginInterpreter = this.notifyMessage;
        pluginInterpreter.growPayload = new ScopedMigration();
        TypedArray applyTask = ViewSteward.applyTask(resources, theme, attributeSet, PrimaryLauncher.evictLayout);
        updateTimer(applyTask, xmlPullParser, theme);
        applyTask.recycle();
        pluginInterpreter.evictLayout = getChangingConfigurations();
        pluginInterpreter.drawField = true;
        detachStream(resources, xmlPullParser, attributeSet, theme);
        this.connectPatch = applyTask(this.connectPatch, pluginInterpreter.injectMetric, pluginInterpreter.detachStream);
    }

    public ScrollSet(PluginInterpreter pluginInterpreter) {
        this.inflateAdapter = true;
        this.drawRequest = new float[9];
        this.gatherAdapter = new Matrix();
        this.decodePath = new Rect();
        this.notifyMessage = pluginInterpreter;
        this.connectPatch = applyTask(this.connectPatch, pluginInterpreter.injectMetric, pluginInterpreter.detachStream);
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class FeedbackFlow extends StylusConverter {
        public float applyTask;
        public BadgeMulticaster clipOrigin;
        public float connectJob;
        public float drawField;
        public float flushSample;
        public float notifyMessage;
        public float peekRevision;
        public float popBlueprint;
        public Paint.Join reduceScope;
        public int[] releaseHeader;
        public Paint.Cap serializeOffset;
        public BadgeMulticaster updateTimer;

        public FeedbackFlow() {
            this.flushSample = 0.0f;
            this.applyTask = 1.0f;
            this.popBlueprint = 1.0f;
            this.drawField = 0.0f;
            this.connectJob = 1.0f;
            this.peekRevision = 0.0f;
            this.serializeOffset = Paint.Cap.BUTT;
            this.reduceScope = Paint.Join.MITER;
            this.notifyMessage = 4.0f;
        }

        public final Paint.Join clipOrigin(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        @Override // com.goldenboot.saga.zone.ScrollSet.EndpointList
        public boolean evictLayout() {
            return this.updateTimer.applyTask() || this.clipOrigin.applyTask();
        }

        public void flushSample(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray applyTask = ViewSteward.applyTask(resources, theme, attributeSet, PrimaryLauncher.injectMetric);
            updateTimer(applyTask, xmlPullParser, theme);
            applyTask.recycle();
        }

        public float getFillAlpha() {
            return this.popBlueprint;
        }

        public int getFillColor() {
            return this.updateTimer.releaseHeader();
        }

        public float getStrokeAlpha() {
            return this.applyTask;
        }

        public int getStrokeColor() {
            return this.clipOrigin.releaseHeader();
        }

        public float getStrokeWidth() {
            return this.flushSample;
        }

        public float getTrimPathEnd() {
            return this.connectJob;
        }

        public float getTrimPathOffset() {
            return this.peekRevision;
        }

        public float getTrimPathStart() {
            return this.drawField;
        }

        @Override // com.goldenboot.saga.zone.ScrollSet.EndpointList
        public boolean growPayload(int[] iArr) {
            return this.clipOrigin.popBlueprint(iArr) | this.updateTimer.popBlueprint(iArr);
        }

        public final Paint.Cap releaseHeader(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        public void setFillAlpha(float f) {
            this.popBlueprint = f;
        }

        public void setFillColor(int i) {
            this.updateTimer.drawField(i);
        }

        public void setStrokeAlpha(float f) {
            this.applyTask = f;
        }

        public void setStrokeColor(int i) {
            this.clipOrigin.drawField(i);
        }

        public void setStrokeWidth(float f) {
            this.flushSample = f;
        }

        public void setTrimPathEnd(float f) {
            this.connectJob = f;
        }

        public void setTrimPathOffset(float f) {
            this.peekRevision = f;
        }

        public void setTrimPathStart(float f) {
            this.drawField = f;
        }

        public final void updateTimer(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.releaseHeader = null;
            if (ViewSteward.updateTimer(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.growPayload = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.evictLayout = BreadcrumbBenchmark.detachStream(string2);
                }
                this.updateTimer = ViewSteward.releaseHeader(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.popBlueprint = ViewSteward.clipOrigin(typedArray, xmlPullParser, "fillAlpha", 12, this.popBlueprint);
                this.serializeOffset = releaseHeader(ViewSteward.flushSample(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.serializeOffset);
                this.reduceScope = clipOrigin(ViewSteward.flushSample(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.reduceScope);
                this.notifyMessage = ViewSteward.clipOrigin(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.notifyMessage);
                this.clipOrigin = ViewSteward.releaseHeader(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.applyTask = ViewSteward.clipOrigin(typedArray, xmlPullParser, "strokeAlpha", 11, this.applyTask);
                this.flushSample = ViewSteward.clipOrigin(typedArray, xmlPullParser, "strokeWidth", 4, this.flushSample);
                this.connectJob = ViewSteward.clipOrigin(typedArray, xmlPullParser, "trimPathEnd", 6, this.connectJob);
                this.peekRevision = ViewSteward.clipOrigin(typedArray, xmlPullParser, "trimPathOffset", 7, this.peekRevision);
                this.drawField = ViewSteward.clipOrigin(typedArray, xmlPullParser, "trimPathStart", 5, this.drawField);
                this.injectMetric = ViewSteward.flushSample(typedArray, xmlPullParser, "fillType", 13, this.injectMetric);
            }
        }

        public FeedbackFlow(FeedbackFlow feedbackFlow) {
            super(feedbackFlow);
            this.flushSample = 0.0f;
            this.applyTask = 1.0f;
            this.popBlueprint = 1.0f;
            this.drawField = 0.0f;
            this.connectJob = 1.0f;
            this.peekRevision = 0.0f;
            this.serializeOffset = Paint.Cap.BUTT;
            this.reduceScope = Paint.Join.MITER;
            this.notifyMessage = 4.0f;
            this.releaseHeader = feedbackFlow.releaseHeader;
            this.clipOrigin = feedbackFlow.clipOrigin;
            this.flushSample = feedbackFlow.flushSample;
            this.applyTask = feedbackFlow.applyTask;
            this.updateTimer = feedbackFlow.updateTimer;
            this.injectMetric = feedbackFlow.injectMetric;
            this.popBlueprint = feedbackFlow.popBlueprint;
            this.drawField = feedbackFlow.drawField;
            this.connectJob = feedbackFlow.connectJob;
            this.peekRevision = feedbackFlow.peekRevision;
            this.serializeOffset = feedbackFlow.serializeOffset;
            this.reduceScope = feedbackFlow.reduceScope;
            this.notifyMessage = feedbackFlow.notifyMessage;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class ScopedMigration {
        public static final Matrix connectPatch = new Matrix();
        public float applyTask;
        public PathMeasure clipOrigin;
        public float connectJob;
        public Paint detachStream;
        public float drawField;
        public final Path evictLayout;
        public int flushSample;
        public final Path growPayload;
        public final Matrix injectMetric;
        public final TouchStack notifyMessage;
        public int peekRevision;
        public float popBlueprint;
        public Boolean reduceScope;
        public Paint releaseHeader;
        public String serializeOffset;
        public final LayerUseCase updateTimer;

        public ScopedMigration() {
            this.injectMetric = new Matrix();
            this.applyTask = 0.0f;
            this.popBlueprint = 0.0f;
            this.drawField = 0.0f;
            this.connectJob = 0.0f;
            this.peekRevision = LayoutMap.flushSample;
            this.serializeOffset = null;
            this.reduceScope = null;
            this.notifyMessage = new TouchStack();
            this.updateTimer = new LayerUseCase();
            this.evictLayout = new Path();
            this.growPayload = new Path();
        }

        public static float evictLayout(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public boolean clipOrigin() {
            if (this.reduceScope == null) {
                this.reduceScope = Boolean.valueOf(this.updateTimer.evictLayout());
            }
            return this.reduceScope.booleanValue();
        }

        public final void detachStream(LayerUseCase layerUseCase, StylusConverter stylusConverter, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.drawField;
            float f2 = i2 / this.connectJob;
            float min = Math.min(f, f2);
            Matrix matrix = layerUseCase.evictLayout;
            this.injectMetric.set(matrix);
            this.injectMetric.postScale(f, f2);
            float releaseHeader = releaseHeader(matrix);
            if (releaseHeader == 0.0f) {
                return;
            }
            stylusConverter.detachStream(this.evictLayout);
            Path path = this.evictLayout;
            this.growPayload.reset();
            if (stylusConverter.injectMetric()) {
                this.growPayload.setFillType(stylusConverter.injectMetric == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.growPayload.addPath(path, this.injectMetric);
                canvas.clipPath(this.growPayload);
                return;
            }
            FeedbackFlow feedbackFlow = (FeedbackFlow) stylusConverter;
            float f3 = feedbackFlow.drawField;
            if (f3 != 0.0f || feedbackFlow.connectJob != 1.0f) {
                float f4 = feedbackFlow.peekRevision;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (feedbackFlow.connectJob + f4) % 1.0f;
                if (this.clipOrigin == null) {
                    this.clipOrigin = new PathMeasure();
                }
                this.clipOrigin.setPath(this.evictLayout, false);
                float length = this.clipOrigin.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.clipOrigin.getSegment(f7, length, path, true);
                    this.clipOrigin.getSegment(0.0f, f8, path, true);
                } else {
                    this.clipOrigin.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.growPayload.addPath(path, this.injectMetric);
            if (feedbackFlow.updateTimer.connectJob()) {
                BadgeMulticaster badgeMulticaster = feedbackFlow.updateTimer;
                if (this.releaseHeader == null) {
                    Paint paint = new Paint(1);
                    this.releaseHeader = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.releaseHeader;
                if (badgeMulticaster.updateTimer()) {
                    Shader clipOrigin = badgeMulticaster.clipOrigin();
                    clipOrigin.setLocalMatrix(this.injectMetric);
                    paint2.setShader(clipOrigin);
                    paint2.setAlpha(Math.round(feedbackFlow.popBlueprint * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(LayoutMap.flushSample);
                    paint2.setColor(ScrollSet.evictLayout(badgeMulticaster.releaseHeader(), feedbackFlow.popBlueprint));
                }
                paint2.setColorFilter(colorFilter);
                this.growPayload.setFillType(feedbackFlow.injectMetric == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.growPayload, paint2);
            }
            if (feedbackFlow.clipOrigin.connectJob()) {
                BadgeMulticaster badgeMulticaster2 = feedbackFlow.clipOrigin;
                if (this.detachStream == null) {
                    Paint paint3 = new Paint(1);
                    this.detachStream = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.detachStream;
                Paint.Join join = feedbackFlow.reduceScope;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = feedbackFlow.serializeOffset;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(feedbackFlow.notifyMessage);
                if (badgeMulticaster2.updateTimer()) {
                    Shader clipOrigin2 = badgeMulticaster2.clipOrigin();
                    clipOrigin2.setLocalMatrix(this.injectMetric);
                    paint4.setShader(clipOrigin2);
                    paint4.setAlpha(Math.round(feedbackFlow.applyTask * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(LayoutMap.flushSample);
                    paint4.setColor(ScrollSet.evictLayout(badgeMulticaster2.releaseHeader(), feedbackFlow.applyTask));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(feedbackFlow.flushSample * min * releaseHeader);
                canvas.drawPath(this.growPayload, paint4);
            }
        }

        public boolean flushSample(int[] iArr) {
            return this.updateTimer.growPayload(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.peekRevision;
        }

        public void growPayload(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            injectMetric(this.updateTimer, connectPatch, canvas, i, i2, colorFilter);
        }

        public final void injectMetric(LayerUseCase layerUseCase, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            LayerUseCase layerUseCase2 = layerUseCase;
            layerUseCase2.evictLayout.set(matrix);
            layerUseCase2.evictLayout.preConcat(layerUseCase2.popBlueprint);
            canvas.save();
            int i3 = 0;
            while (i3 < layerUseCase2.growPayload.size()) {
                EndpointList endpointList = (EndpointList) layerUseCase2.growPayload.get(i3);
                if (endpointList instanceof LayerUseCase) {
                    injectMetric((LayerUseCase) endpointList, layerUseCase2.evictLayout, canvas, i, i2, colorFilter);
                } else if (endpointList instanceof StylusConverter) {
                    detachStream(layerUseCase2, (StylusConverter) endpointList, canvas, i, i2, colorFilter);
                }
                i3++;
                layerUseCase2 = layerUseCase;
            }
            canvas.restore();
        }

        public final float releaseHeader(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float evictLayout = evictLayout(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(evictLayout) / max;
            }
            return 0.0f;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.peekRevision = i;
        }

        public ScopedMigration(ScopedMigration scopedMigration) {
            this.injectMetric = new Matrix();
            this.applyTask = 0.0f;
            this.popBlueprint = 0.0f;
            this.drawField = 0.0f;
            this.connectJob = 0.0f;
            this.peekRevision = LayoutMap.flushSample;
            this.serializeOffset = null;
            this.reduceScope = null;
            TouchStack touchStack = new TouchStack();
            this.notifyMessage = touchStack;
            this.updateTimer = new LayerUseCase(scopedMigration.updateTimer, touchStack);
            this.evictLayout = new Path(scopedMigration.evictLayout);
            this.growPayload = new Path(scopedMigration.growPayload);
            this.applyTask = scopedMigration.applyTask;
            this.popBlueprint = scopedMigration.popBlueprint;
            this.drawField = scopedMigration.drawField;
            this.connectJob = scopedMigration.connectJob;
            this.flushSample = scopedMigration.flushSample;
            this.peekRevision = scopedMigration.peekRevision;
            this.serializeOffset = scopedMigration.serializeOffset;
            String str = scopedMigration.serializeOffset;
            if (str != null) {
                touchStack.put(str, this);
            }
            this.reduceScope = scopedMigration.reduceScope;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class LayerUseCase extends EndpointList {
        public float applyTask;
        public float clipOrigin;
        public int[] connectJob;
        public float detachStream;
        public int drawField;
        public final Matrix evictLayout;
        public float flushSample;
        public final ArrayList growPayload;
        public float injectMetric;
        public String peekRevision;
        public final Matrix popBlueprint;
        public float releaseHeader;
        public float updateTimer;

        public LayerUseCase(LayerUseCase layerUseCase, TouchStack touchStack) {
            super();
            StylusConverter bounceHandler;
            this.evictLayout = new Matrix();
            this.growPayload = new ArrayList();
            this.injectMetric = 0.0f;
            this.detachStream = 0.0f;
            this.releaseHeader = 0.0f;
            this.clipOrigin = 1.0f;
            this.flushSample = 1.0f;
            this.updateTimer = 0.0f;
            this.applyTask = 0.0f;
            Matrix matrix = new Matrix();
            this.popBlueprint = matrix;
            this.peekRevision = null;
            this.injectMetric = layerUseCase.injectMetric;
            this.detachStream = layerUseCase.detachStream;
            this.releaseHeader = layerUseCase.releaseHeader;
            this.clipOrigin = layerUseCase.clipOrigin;
            this.flushSample = layerUseCase.flushSample;
            this.updateTimer = layerUseCase.updateTimer;
            this.applyTask = layerUseCase.applyTask;
            this.connectJob = layerUseCase.connectJob;
            String str = layerUseCase.peekRevision;
            this.peekRevision = str;
            this.drawField = layerUseCase.drawField;
            if (str != null) {
                touchStack.put(str, this);
            }
            matrix.set(layerUseCase.popBlueprint);
            ArrayList arrayList = layerUseCase.growPayload;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof LayerUseCase) {
                    this.growPayload.add(new LayerUseCase((LayerUseCase) obj, touchStack));
                } else {
                    if (obj instanceof FeedbackFlow) {
                        bounceHandler = new FeedbackFlow((FeedbackFlow) obj);
                    } else {
                        if (!(obj instanceof BounceHandler)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bounceHandler = new BounceHandler((BounceHandler) obj);
                    }
                    this.growPayload.add(bounceHandler);
                    Object obj2 = bounceHandler.growPayload;
                    if (obj2 != null) {
                        touchStack.put(obj2, bounceHandler);
                    }
                }
            }
        }

        public final void detachStream() {
            this.popBlueprint.reset();
            this.popBlueprint.postTranslate(-this.detachStream, -this.releaseHeader);
            this.popBlueprint.postScale(this.clipOrigin, this.flushSample);
            this.popBlueprint.postRotate(this.injectMetric, 0.0f, 0.0f);
            this.popBlueprint.postTranslate(this.updateTimer + this.detachStream, this.applyTask + this.releaseHeader);
        }

        @Override // com.goldenboot.saga.zone.ScrollSet.EndpointList
        public boolean evictLayout() {
            for (int i = 0; i < this.growPayload.size(); i++) {
                if (((EndpointList) this.growPayload.get(i)).evictLayout()) {
                    return true;
                }
            }
            return false;
        }

        public String getGroupName() {
            return this.peekRevision;
        }

        public Matrix getLocalMatrix() {
            return this.popBlueprint;
        }

        public float getPivotX() {
            return this.detachStream;
        }

        public float getPivotY() {
            return this.releaseHeader;
        }

        public float getRotation() {
            return this.injectMetric;
        }

        public float getScaleX() {
            return this.clipOrigin;
        }

        public float getScaleY() {
            return this.flushSample;
        }

        public float getTranslateX() {
            return this.updateTimer;
        }

        public float getTranslateY() {
            return this.applyTask;
        }

        @Override // com.goldenboot.saga.zone.ScrollSet.EndpointList
        public boolean growPayload(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.growPayload.size(); i++) {
                z |= ((EndpointList) this.growPayload.get(i)).growPayload(iArr);
            }
            return z;
        }

        public void injectMetric(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray applyTask = ViewSteward.applyTask(resources, theme, attributeSet, PrimaryLauncher.growPayload);
            releaseHeader(applyTask, xmlPullParser);
            applyTask.recycle();
        }

        public final void releaseHeader(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.connectJob = null;
            this.injectMetric = ViewSteward.clipOrigin(typedArray, xmlPullParser, "rotation", 5, this.injectMetric);
            this.detachStream = typedArray.getFloat(1, this.detachStream);
            this.releaseHeader = typedArray.getFloat(2, this.releaseHeader);
            this.clipOrigin = ViewSteward.clipOrigin(typedArray, xmlPullParser, "scaleX", 3, this.clipOrigin);
            this.flushSample = ViewSteward.clipOrigin(typedArray, xmlPullParser, "scaleY", 4, this.flushSample);
            this.updateTimer = ViewSteward.clipOrigin(typedArray, xmlPullParser, "translateX", 6, this.updateTimer);
            this.applyTask = ViewSteward.clipOrigin(typedArray, xmlPullParser, "translateY", 7, this.applyTask);
            String string = typedArray.getString(0);
            if (string != null) {
                this.peekRevision = string;
            }
            detachStream();
        }

        public void setPivotX(float f) {
            if (f != this.detachStream) {
                this.detachStream = f;
                detachStream();
            }
        }

        public void setPivotY(float f) {
            if (f != this.releaseHeader) {
                this.releaseHeader = f;
                detachStream();
            }
        }

        public void setRotation(float f) {
            if (f != this.injectMetric) {
                this.injectMetric = f;
                detachStream();
            }
        }

        public void setScaleX(float f) {
            if (f != this.clipOrigin) {
                this.clipOrigin = f;
                detachStream();
            }
        }

        public void setScaleY(float f) {
            if (f != this.flushSample) {
                this.flushSample = f;
                detachStream();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.updateTimer) {
                this.updateTimer = f;
                detachStream();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.applyTask) {
                this.applyTask = f;
                detachStream();
            }
        }

        public LayerUseCase() {
            super();
            this.evictLayout = new Matrix();
            this.growPayload = new ArrayList();
            this.injectMetric = 0.0f;
            this.detachStream = 0.0f;
            this.releaseHeader = 0.0f;
            this.clipOrigin = 1.0f;
            this.flushSample = 1.0f;
            this.updateTimer = 0.0f;
            this.applyTask = 0.0f;
            this.popBlueprint = new Matrix();
            this.peekRevision = null;
        }
    }
}
