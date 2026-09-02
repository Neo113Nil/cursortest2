package com.goldenboot.saga.zone;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.goldenboot.saga.zone.ObserverSaver;
import com.goldenboot.saga.zone.SlotMediator;
import com.goldenboot.saga.zone.TimelineCompiler;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ItemFacilitator {
    public static WeakHashMap evictLayout;
    public static final int[] growPayload = {CompatPropagator.growPayload, CompatPropagator.injectMetric, CompatPropagator.serializeOffset, CompatPropagator.drawScope, CompatPropagator.mergeLocale, CompatPropagator.syncScope, CompatPropagator.flattenPackage, CompatPropagator.injectConstraint, CompatPropagator.storeCharset, CompatPropagator.filterPayload, CompatPropagator.detachStream, CompatPropagator.releaseHeader, CompatPropagator.clipOrigin, CompatPropagator.flushSample, CompatPropagator.updateTimer, CompatPropagator.applyTask, CompatPropagator.popBlueprint, CompatPropagator.drawField, CompatPropagator.connectJob, CompatPropagator.peekRevision, CompatPropagator.reduceScope, CompatPropagator.notifyMessage, CompatPropagator.connectPatch, CompatPropagator.attachConfig, CompatPropagator.resetDelta, CompatPropagator.inflateAdapter, CompatPropagator.purgeNode, CompatPropagator.drawRequest, CompatPropagator.gatherAdapter, CompatPropagator.decodePath, CompatPropagator.expandArgs, CompatPropagator.findTask};
    public static final VibrationState injectMetric = new VibrationState() { // from class: com.goldenboot.saga.zone.WorkerStore
        @Override // com.goldenboot.saga.zone.VibrationState
        public final LegacyDelegate onReceiveContent(LegacyDelegate legacyDelegate) {
            return ItemFacilitator.evictLayout(legacyDelegate);
        }
    };
    public static final EndpointList detachStream = new EndpointList();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class ActivityMutator extends StylusConverter {
        public ActivityMutator(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // com.goldenboot.saga.zone.ItemFacilitator.StylusConverter
        /* renamed from: applyTask, reason: merged with bridge method [inline-methods] */
        public void detachStream(View view, Boolean bool) {
            HeaderUtil.clipOrigin(view, bool.booleanValue());
        }

        @Override // com.goldenboot.saga.zone.ItemFacilitator.StylusConverter
        /* renamed from: popBlueprint, reason: merged with bridge method [inline-methods] */
        public boolean flushSample(Boolean bool, Boolean bool2) {
            return !evictLayout(bool, bool2);
        }

        @Override // com.goldenboot.saga.zone.ItemFacilitator.StylusConverter
        /* renamed from: updateTimer, reason: merged with bridge method [inline-methods] */
        public Boolean injectMetric(View view) {
            return Boolean.valueOf(HeaderUtil.injectMetric(view));
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class BounceHandler extends StylusConverter {
        public BounceHandler(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // com.goldenboot.saga.zone.ItemFacilitator.StylusConverter
        /* renamed from: applyTask, reason: merged with bridge method [inline-methods] */
        public void detachStream(View view, CharSequence charSequence) {
            HeaderUtil.releaseHeader(view, charSequence);
        }

        @Override // com.goldenboot.saga.zone.ItemFacilitator.StylusConverter
        /* renamed from: popBlueprint, reason: merged with bridge method [inline-methods] */
        public boolean flushSample(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }

        @Override // com.goldenboot.saga.zone.ItemFacilitator.StylusConverter
        /* renamed from: updateTimer, reason: merged with bridge method [inline-methods] */
        public CharSequence injectMetric(View view) {
            return HeaderUtil.evictLayout(view);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ClipboardState {
        public static String[] evictLayout(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static LegacyDelegate growPayload(View view, LegacyDelegate legacyDelegate) {
            ContentInfo clipOrigin = legacyDelegate.clipOrigin();
            ContentInfo performReceiveContent = view.performReceiveContent(clipOrigin);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == clipOrigin ? legacyDelegate : LegacyDelegate.flushSample(performReceiveContent);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class FeedbackFlow extends StylusConverter {
        public FeedbackFlow(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // com.goldenboot.saga.zone.ItemFacilitator.StylusConverter
        /* renamed from: applyTask, reason: merged with bridge method [inline-methods] */
        public void detachStream(View view, CharSequence charSequence) {
            RemoteCallback.detachStream(view, charSequence);
        }

        @Override // com.goldenboot.saga.zone.ItemFacilitator.StylusConverter
        /* renamed from: popBlueprint, reason: merged with bridge method [inline-methods] */
        public boolean flushSample(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }

        @Override // com.goldenboot.saga.zone.ItemFacilitator.StylusConverter
        /* renamed from: updateTimer, reason: merged with bridge method [inline-methods] */
        public CharSequence injectMetric(View view) {
            return RemoteCallback.growPayload(view);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class HeaderUtil {
        public static void clipOrigin(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }

        public static void detachStream(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static CharSequence evictLayout(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean growPayload(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean injectMetric(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void releaseHeader(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class HoverThrottle {
        public static View.AccessibilityDelegate evictLayout(View view) {
            return view.getAccessibilityDelegate();
        }

        public static void growPayload(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        public static void injectMetric(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class LayerUseCase extends StylusConverter {
        public LayerUseCase(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // com.goldenboot.saga.zone.ItemFacilitator.StylusConverter
        /* renamed from: applyTask, reason: merged with bridge method [inline-methods] */
        public void detachStream(View view, Boolean bool) {
            HeaderUtil.detachStream(view, bool.booleanValue());
        }

        @Override // com.goldenboot.saga.zone.ItemFacilitator.StylusConverter
        /* renamed from: popBlueprint, reason: merged with bridge method [inline-methods] */
        public boolean flushSample(Boolean bool, Boolean bool2) {
            return !evictLayout(bool, bool2);
        }

        @Override // com.goldenboot.saga.zone.ItemFacilitator.StylusConverter
        /* renamed from: updateTimer, reason: merged with bridge method [inline-methods] */
        public Boolean injectMetric(View view) {
            return Boolean.valueOf(HeaderUtil.growPayload(view));
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class MorphDirector {
        public static int evictLayout(View view) {
            return view.getImportantForAutofill();
        }

        public static void growPayload(View view, int i) {
            view.setImportantForAutofill(i);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class PluginInterpreter {
        public static ConfigSnapshot evictLayout(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            ConfigSnapshot injectConstraint = ConfigSnapshot.injectConstraint(rootWindowInsets);
            injectConstraint.expandArgs(injectConstraint);
            injectConstraint.notifyMessage(view.getRootView());
            return injectConstraint;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class RemoteCallback {
        public static void detachStream(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        public static WindowInsets evictLayout(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static CharSequence growPayload(View view) {
            return view.getStateDescription();
        }

        public static StatePort injectMetric(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return StatePort.flushSample(windowInsetsController);
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class RestoreToggle {
        public static void evictLayout(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class ScopedMigration {

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public class ActivityMutator implements View.OnApplyWindowInsetsListener {
            public ConfigSnapshot evictLayout = null;
            public final /* synthetic */ View growPayload;
            public final /* synthetic */ PaletteShard injectMetric;

            public ActivityMutator(View view, PaletteShard paletteShard) {
                this.growPayload = view;
                this.injectMetric = paletteShard;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                ConfigSnapshot storeCharset = ConfigSnapshot.storeCharset(windowInsets, view);
                this.evictLayout = storeCharset;
                return this.injectMetric.onApplyWindowInsets(view, storeCharset).flattenPackage();
            }
        }

        public static ConfigSnapshot evictLayout(View view, ConfigSnapshot configSnapshot, Rect rect) {
            WindowInsets flattenPackage = configSnapshot.flattenPackage();
            if (flattenPackage != null) {
                return ConfigSnapshot.storeCharset(view.computeSystemWindowInsets(flattenPackage, rect), view);
            }
            rect.setEmpty();
            return configSnapshot;
        }

        public static void growPayload(View view, PaletteShard paletteShard) {
            ActivityMutator activityMutator = paletteShard != null ? new ActivityMutator(view, paletteShard) : null;
            if (view.getTag(CompatPropagator.bindBody) != null) {
                return;
            }
            if (activityMutator != null) {
                view.setOnApplyWindowInsetsListener(activityMutator);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(CompatPropagator.updateAction));
            }
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static abstract class StylusConverter {
        public final int detachStream;
        public final int evictLayout;
        public final Class growPayload;
        public final int injectMetric;

        public StylusConverter(int i, Class cls, int i2) {
            this(i, cls, 0, i2);
        }

        public void clipOrigin(View view, Object obj) {
            if (growPayload()) {
                detachStream(view, obj);
            } else if (flushSample(releaseHeader(view), obj)) {
                ItemFacilitator.applyTask(view);
                view.setTag(this.evictLayout, obj);
                ItemFacilitator.mapJob(view, this.detachStream);
            }
        }

        public abstract void detachStream(View view, Object obj);

        public boolean evictLayout(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract boolean flushSample(Object obj, Object obj2);

        public final boolean growPayload() {
            return Build.VERSION.SDK_INT >= this.injectMetric;
        }

        public abstract Object injectMetric(View view);

        public Object releaseHeader(View view) {
            if (growPayload()) {
                return injectMetric(view);
            }
            Object tag = view.getTag(this.evictLayout);
            if (this.growPayload.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public StylusConverter(int i, Class cls, int i2, int i3) {
            this.evictLayout = i;
            this.growPayload = cls;
            this.detachStream = i2;
            this.injectMetric = i3;
        }
    }

    public static void appendEvent(View view) {
        view.stopNestedScroll();
    }

    public static void appendKey(View view) {
        view.requestApplyInsets();
    }

    public static void applyTask(View view) {
        ObserverSaver popBlueprint = popBlueprint(view);
        if (popBlueprint == null) {
            popBlueprint = new ObserverSaver();
        }
        emitStrategy(view, popBlueprint);
    }

    public static void attachCallback(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static VibrationState attachConfig(View view) {
        return view instanceof VibrationState ? (VibrationState) view : injectMetric;
    }

    public static boolean bindBody(View view) {
        return view.isAttachedToWindow();
    }

    public static void cancelArchive(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static ConfigSnapshot clipOrigin(View view, ConfigSnapshot configSnapshot, Rect rect) {
        return ScopedMigration.evictLayout(view, configSnapshot, rect);
    }

    public static void closePayload(View view, List list) {
        HoverThrottle.injectMetric(view, list);
    }

    public static void commitBounds(View view, CharSequence charSequence) {
        subscribeEvent().clipOrigin(view, charSequence);
    }

    public static void commitKey(View view, float f) {
        view.setZ(f);
    }

    public static void compressVersion(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static void computeTarget(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        HoverThrottle.growPayload(view, context, iArr, attributeSet, typedArray, i, i2);
    }

    public static void connectComponent(View view, SlotMediator slotMediator) {
        view.onInitializeAccessibilityNodeInfo(slotMediator.flushHeader());
    }

    public static CharSequence connectJob(View view) {
        return (CharSequence) startResource().releaseHeader(view);
    }

    public static Display connectPatch(View view) {
        return view.getDisplay();
    }

    public static int decodePath(View view) {
        return view.getMinimumWidth();
    }

    public static void detachStream(View view, SlotMediator.ActivityMutator activityMutator) {
        applyTask(view);
        serializeTask(activityMutator.growPayload(), view);
        peekRevision(view).add(activityMutator);
        mapJob(view, 0);
    }

    public static boolean dispatchTimezone(View view) {
        return view.isLaidOut();
    }

    public static void drawConfig(View view, WindowSignal windowSignal) {
        RestoreToggle.evictLayout(view, (PointerIcon) (windowSignal != null ? windowSignal.evictLayout() : null));
    }

    public static View.AccessibilityDelegate drawField(View view) {
        return HoverThrottle.evictLayout(view);
    }

    public static int drawRequest(View view) {
        return view.getLayoutDirection();
    }

    public static String[] drawScope(View view) {
        return Build.VERSION.SDK_INT >= 31 ? ClipboardState.evictLayout(view) : (String[]) view.getTag(CompatPropagator.parseAsset);
    }

    public static void emitStrategy(View view, ObserverSaver observerSaver) {
        if (observerSaver == null && (drawField(view) instanceof ObserverSaver.ActivityMutator)) {
            observerSaver = new ObserverSaver();
        }
        transformCurrency(view);
        view.setAccessibilityDelegate(observerSaver == null ? null : observerSaver.getBridge());
    }

    public static void executeRecord(View view, TimelineCompiler.BounceHandler bounceHandler) {
        TimelineCompiler.releaseHeader(view, bounceHandler);
    }

    public static int expandArgs(View view) {
        return view.getPaddingEnd();
    }

    public static void expandScope(View view, String str) {
        view.setTransitionName(str);
    }

    public static int filterPayload(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static int findTask(View view) {
        return view.getPaddingStart();
    }

    public static String flattenPackage(View view) {
        return view.getTransitionName();
    }

    public static ConfigSnapshot flushSample(View view, ConfigSnapshot configSnapshot) {
        WindowInsets flattenPackage = configSnapshot.flattenPackage();
        if (flattenPackage != null) {
            WindowInsets evictLayout2 = RemoteCallback.evictLayout(view, flattenPackage);
            if (!evictLayout2.equals(flattenPackage)) {
                return ConfigSnapshot.storeCharset(evictLayout2, view);
            }
        }
        return configSnapshot;
    }

    public static void formatMessage(View view, float f) {
        view.setTranslationZ(f);
    }

    public static boolean formatPosition(View view, int i) {
        int evictLayout2 = NotificationGuard.evictLayout(i);
        if (evictLayout2 == -1) {
            return false;
        }
        return view.performHapticFeedback(evictLayout2);
    }

    public static int gatherAdapter(View view) {
        return view.getMinimumHeight();
    }

    public static void groupArchive(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void growCallback(View view, PaletteShard paletteShard) {
        ScopedMigration.growPayload(view, paletteShard);
    }

    public static StylusConverter growPayload() {
        return new LayerUseCase(CompatPropagator.packPackage, Boolean.class, 28);
    }

    public static void handleFooter(View view, boolean z) {
        growPayload().clipOrigin(view, Boolean.valueOf(z));
    }

    public static int inflateAdapter(View view) {
        return view.getImportantForAccessibility();
    }

    public static float inflateEdge(View view) {
        return view.getZ();
    }

    public static float injectConstraint(View view) {
        return view.getTranslationZ();
    }

    public static void injectField(View view, SlotMediator.ActivityMutator activityMutator, CharSequence charSequence, WorkerPlanner workerPlanner) {
        if (workerPlanner == null && charSequence == null) {
            resetValue(view, activityMutator.growPayload());
        } else {
            detachStream(view, activityMutator.evictLayout(charSequence, workerPlanner));
        }
    }

    public static int injectMetric(View view, CharSequence charSequence, WorkerPlanner workerPlanner) {
        int serializeOffset = serializeOffset(view, charSequence);
        if (serializeOffset != -1) {
            detachStream(view, new SlotMediator.ActivityMutator(serializeOffset, charSequence, workerPlanner));
        }
        return serializeOffset;
    }

    public static StylusConverter locateSignal() {
        return new ActivityMutator(CompatPropagator.mapJob, Boolean.class, 28);
    }

    public static void mapJob(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = connectJob(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : ContentOperation.CameraDistance);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(connectJob(view));
                    transformCurrency(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(connectJob(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static ConfigSnapshot mergeLocale(View view) {
        return PluginInterpreter.evictLayout(view);
    }

    public static void normalizeBundle(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    public static PorterDuff.Mode notifyMessage(View view) {
        return view.getBackgroundTintMode();
    }

    public static boolean packPackage(View view) {
        return view.hasTransientState();
    }

    public static boolean parseAsset(View view) {
        Boolean bool = (Boolean) locateSignal().releaseHeader(view);
        return bool != null && bool.booleanValue();
    }

    public static void peekDescriptor(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static List peekRevision(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(CompatPropagator.inflateEdge);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(CompatPropagator.inflateEdge, arrayList2);
        return arrayList2;
    }

    public static ObserverSaver popBlueprint(View view) {
        View.AccessibilityDelegate drawField = drawField(view);
        if (drawField == null) {
            return null;
        }
        return drawField instanceof ObserverSaver.ActivityMutator ? ((ObserverSaver.ActivityMutator) drawField).evictLayout : new ObserverSaver(drawField);
    }

    public static void prepareTask(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    public static void protectGauge(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void purgeMetric(View view, CharSequence charSequence) {
        startResource().clipOrigin(view, charSequence);
        if (charSequence != null) {
            detachStream.evictLayout(view);
        } else {
            detachStream.injectMetric(view);
        }
    }

    public static int purgeNode(View view) {
        return MorphDirector.evictLayout(view);
    }

    public static boolean queryModel(View view) {
        return drawField(view) != null;
    }

    public static ColorStateList reduceScope(View view) {
        return view.getBackgroundTintList();
    }

    public static void refreshCounter(View view, float f) {
        view.setElevation(f);
    }

    public static PulseStack releaseHeader(View view) {
        if (evictLayout == null) {
            evictLayout = new WeakHashMap();
        }
        PulseStack pulseStack = (PulseStack) evictLayout.get(view);
        if (pulseStack != null) {
            return pulseStack;
        }
        PulseStack pulseStack2 = new PulseStack(view);
        evictLayout.put(view, pulseStack2);
        return pulseStack2;
    }

    public static void removeCount(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static boolean resetDelta(View view) {
        return view.getFitsSystemWindows();
    }

    public static void resetValue(View view, int i) {
        serializeTask(i, view);
        mapJob(view, 0);
    }

    public static void resolveDelta(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static LegacyDelegate resumeSignature(View view, LegacyDelegate legacyDelegate) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(legacyDelegate);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return ClipboardState.growPayload(view, legacyDelegate);
        }
        RotateMolder rotateMolder = (RotateMolder) view.getTag(CompatPropagator.dispatchTimezone);
        if (rotateMolder == null) {
            return attachConfig(view).onReceiveContent(legacyDelegate);
        }
        LegacyDelegate evictLayout2 = rotateMolder.evictLayout(view, legacyDelegate);
        if (evictLayout2 == null) {
            return null;
        }
        return attachConfig(view).onReceiveContent(evictLayout2);
    }

    public static int serializeOffset(View view, CharSequence charSequence) {
        List peekRevision = peekRevision(view);
        for (int i = 0; i < peekRevision.size(); i++) {
            if (TextUtils.equals(charSequence, ((SlotMediator.ActivityMutator) peekRevision.get(i)).injectMetric())) {
                return ((SlotMediator.ActivityMutator) peekRevision.get(i)).growPayload();
            }
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[] iArr = growPayload;
            if (i3 >= iArr.length || i2 != -1) {
                break;
            }
            int i4 = iArr[i3];
            boolean z = true;
            for (int i5 = 0; i5 < peekRevision.size(); i5++) {
                z &= ((SlotMediator.ActivityMutator) peekRevision.get(i5)).growPayload() != i4;
            }
            if (z) {
                i2 = i4;
            }
            i3++;
        }
        return i2;
    }

    public static void serializeTask(int i, View view) {
        List peekRevision = peekRevision(view);
        for (int i2 = 0; i2 < peekRevision.size(); i2++) {
            if (((SlotMediator.ActivityMutator) peekRevision.get(i2)).growPayload() == i) {
                peekRevision.remove(i2);
                return;
            }
        }
    }

    public static StylusConverter startResource() {
        return new BounceHandler(CompatPropagator.unlockMessage, CharSequence.class, 8, 28);
    }

    public static StatePort storeCharset(View view) {
        return RemoteCallback.injectMetric(view);
    }

    public static StylusConverter subscribeEvent() {
        return new FeedbackFlow(CompatPropagator.attachCallback, CharSequence.class, 64, 30);
    }

    public static CharSequence syncScope(View view) {
        return (CharSequence) subscribeEvent().releaseHeader(view);
    }

    public static void transformCurrency(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static boolean unlockMessage(View view) {
        Boolean bool = (Boolean) growPayload().releaseHeader(view);
        return bool != null && bool.booleanValue();
    }

    public static ConfigSnapshot updateAction(View view, ConfigSnapshot configSnapshot) {
        WindowInsets flattenPackage = configSnapshot.flattenPackage();
        if (flattenPackage != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(flattenPackage);
            if (!onApplyWindowInsets.equals(flattenPackage)) {
                return ConfigSnapshot.storeCharset(onApplyWindowInsets, view);
            }
        }
        return configSnapshot;
    }

    public static boolean updateTimer(View view, KeyEvent keyEvent) {
        return false;
    }

    public static void validateOffset(View view, int i) {
        MorphDirector.growPayload(view, i);
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class EndpointList implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap reduceScope = new WeakHashMap();

        public final void detachStream(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        public void evictLayout(View view) {
            this.reduceScope.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                growPayload(view);
            }
        }

        public final void growPayload(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void injectMetric(View view) {
            this.reduceScope.remove(view);
            view.removeOnAttachStateChangeListener(this);
            detachStream(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            growPayload(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ LegacyDelegate evictLayout(LegacyDelegate legacyDelegate) {
        return legacyDelegate;
    }
}
