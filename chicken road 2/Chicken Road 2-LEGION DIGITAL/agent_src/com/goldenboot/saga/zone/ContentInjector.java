package com.goldenboot.saga.zone;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import com.goldenboot.saga.zone.ConnectionCallback;
import com.goldenboot.saga.zone.RestoreSegment;
import com.goldenboot.saga.zone.SpringDemux;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ContentInjector {
    public static final KeyboardSensor evictLayout;
    public static final LegacyComposer growPayload;
    public static Paint injectMetric;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class ActivityMutator extends SpringDemux.FeedbackFlow {
        public RestoreSegment.FeedbackFlow evictLayout;

        public ActivityMutator(RestoreSegment.FeedbackFlow feedbackFlow) {
            this.evictLayout = feedbackFlow;
        }

        @Override // com.goldenboot.saga.zone.SpringDemux.FeedbackFlow
        public void evictLayout(int i) {
            RestoreSegment.FeedbackFlow feedbackFlow = this.evictLayout;
            if (feedbackFlow != null) {
                feedbackFlow.onFontRetrievalFailed(i);
            }
        }

        @Override // com.goldenboot.saga.zone.SpringDemux.FeedbackFlow
        public void growPayload(Typeface typeface) {
            RestoreSegment.FeedbackFlow feedbackFlow = this.evictLayout;
            if (feedbackFlow != null) {
                feedbackFlow.onFontRetrieved(typeface);
            }
        }
    }

    static {
        TabSupervisor.evictLayout("TypefaceCompat static init");
        if (Build.VERSION.SDK_INT >= 31) {
            evictLayout = new FontAdministrator();
        } else {
            evictLayout = new FontMigration();
        }
        growPayload = new LegacyComposer(16);
        injectMetric = null;
        TabSupervisor.growPayload();
    }

    public static Typeface applyTask(ConnectionCallback.LayerUseCase layerUseCase) {
        FontFamily build;
        Typeface updateTimer;
        String injectMetric2 = layerUseCase.injectMetric();
        if (!TextUtils.isEmpty(injectMetric2) && (updateTimer = updateTimer(injectMetric2)) != null) {
            return updateTimer;
        }
        List growPayload2 = layerUseCase.growPayload();
        int i = 0;
        if (growPayload2.size() == 1) {
            return updateTimer(((ClipboardPipeline) growPayload2.get(0)).updateTimer());
        }
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        for (int i2 = 0; i2 < growPayload2.size(); i2++) {
            if (updateTimer(((ClipboardPipeline) growPayload2.get(i2)).updateTimer()) == null) {
                return null;
            }
        }
        Typeface.CustomFallbackBuilder customFallbackBuilder = null;
        while (true) {
            if (i >= growPayload2.size()) {
                break;
            }
            ClipboardPipeline clipboardPipeline = (ClipboardPipeline) growPayload2.get(i);
            if (i == growPayload2.size() - 1 && TextUtils.isEmpty(clipboardPipeline.applyTask())) {
                customFallbackBuilder.setSystemFallback(clipboardPipeline.updateTimer());
                break;
            }
            Font popBlueprint = popBlueprint(updateTimer(clipboardPipeline.updateTimer()));
            if (popBlueprint == null) {
                clipboardPipeline.updateTimer();
                return null;
            }
            if (TextUtils.isEmpty(clipboardPipeline.applyTask())) {
                build = new FontFamily.Builder(popBlueprint).build();
            } else {
                try {
                    InputUpgrade.evictLayout();
                    build = new FontFamily.Builder(DragSaver.evictLayout(popBlueprint).setFontVariationSettings(clipboardPipeline.applyTask()).build()).build();
                } catch (IOException unused) {
                    return null;
                }
            }
            if (customFallbackBuilder == null) {
                customFallbackBuilder = new Typeface.CustomFallbackBuilder(build);
            } else {
                customFallbackBuilder.addCustomFallback(build);
            }
            i++;
        }
        return customFallbackBuilder.build();
    }

    public static String clipOrigin(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface detachStream(Context context, ConnectionCallback.ActivityMutator activityMutator, Resources resources, int i, String str, int i2, int i3, RestoreSegment.FeedbackFlow feedbackFlow, Handler handler, boolean z) {
        Typeface evictLayout2;
        if (activityMutator instanceof ConnectionCallback.LayerUseCase) {
            ConnectionCallback.LayerUseCase layerUseCase = (ConnectionCallback.LayerUseCase) activityMutator;
            Typeface applyTask = applyTask(layerUseCase);
            if (applyTask != null) {
                if (feedbackFlow != null) {
                    feedbackFlow.callbackSuccessAsync(applyTask, handler);
                }
                growPayload.detachStream(clipOrigin(resources, i, str, i2, i3), applyTask);
                return applyTask;
            }
            evictLayout2 = SpringDemux.injectMetric(context, layerUseCase.growPayload(), i3, !z ? feedbackFlow != null : layerUseCase.evictLayout() != 0, z ? layerUseCase.detachStream() : -1, RestoreSegment.FeedbackFlow.getHandler(handler), new ActivityMutator(feedbackFlow));
        } else {
            evictLayout2 = evictLayout.evictLayout(context, (ConnectionCallback.BounceHandler) activityMutator, resources, i3);
            if (feedbackFlow != null) {
                if (evictLayout2 != null) {
                    feedbackFlow.callbackSuccessAsync(evictLayout2, handler);
                } else {
                    feedbackFlow.callbackFailAsync(-3, handler);
                }
            }
        }
        if (evictLayout2 != null) {
            growPayload.detachStream(clipOrigin(resources, i, str, i2, i3), evictLayout2);
        }
        return evictLayout2;
    }

    public static Typeface evictLayout(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface flushSample(Resources resources, int i, String str, int i2, int i3) {
        return (Typeface) growPayload.injectMetric(clipOrigin(resources, i, str, i2, i3));
    }

    public static Typeface growPayload(Context context, CancellationSignal cancellationSignal, SpringDemux.BounceHandler[] bounceHandlerArr, int i) {
        TabSupervisor.evictLayout("TypefaceCompat.createFromFontInfo");
        try {
            return evictLayout.growPayload(context, cancellationSignal, bounceHandlerArr, i);
        } finally {
            TabSupervisor.growPayload();
        }
    }

    public static Typeface injectMetric(Context context, CancellationSignal cancellationSignal, List list, int i) {
        TabSupervisor.evictLayout("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return evictLayout.injectMetric(context, cancellationSignal, list, i);
        } finally {
            TabSupervisor.growPayload();
        }
    }

    public static Font popBlueprint(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (injectMetric == null) {
            injectMetric = new Paint();
        }
        injectMetric.setTextSize(10.0f);
        injectMetric.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, injectMetric);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }

    public static Typeface releaseHeader(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface detachStream = evictLayout.detachStream(context, resources, i, str, i3);
        if (detachStream != null) {
            growPayload.detachStream(clipOrigin(resources, i, str, i2, i3), detachStream);
        }
        return detachStream;
    }

    public static Typeface updateTimer(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }
}
