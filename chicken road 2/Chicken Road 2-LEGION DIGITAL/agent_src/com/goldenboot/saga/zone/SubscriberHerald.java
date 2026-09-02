package com.goldenboot.saga.zone;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.Html;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import com.goldenboot.saga.zone.FeatureConverter;
import com.goldenboot.saga.zone.SpanSequence;
import com.goldenboot.saga.zone.WatcherDelta;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xml.sax.XMLReader;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\n*\u0001(\u001a1\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u0010\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a?\u0010\u0017\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010\"\u001a\u00020\u001e*\u00020!H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b&\u0010'\"\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010)\"\u0014\u0010,\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010+\"\u0014\u0010-\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010+\"\u0014\u0010/\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010+\"\u0014\u00100\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010+¨\u00061"}, d2 = {"Lcom/goldenboot/saga/zone/WatcherDelta$FeedbackFlow;", "", "htmlString", "Lcom/goldenboot/saga/zone/ProgressRecord;", "linkStyles", "Lcom/goldenboot/saga/zone/ToastSnapshot;", "linkInteractionListener", "Lcom/goldenboot/saga/zone/WatcherDelta;", "injectMetric", "(Lcom/goldenboot/saga/zone/WatcherDelta$FeedbackFlow;Ljava/lang/String;Lcom/goldenboot/saga/zone/ProgressRecord;Lcom/goldenboot/saga/zone/ToastSnapshot;)Lcom/goldenboot/saga/zone/WatcherDelta;", "Landroid/text/Spanned;", "clipOrigin", "(Landroid/text/Spanned;Lcom/goldenboot/saga/zone/ProgressRecord;Lcom/goldenboot/saga/zone/ToastSnapshot;)Lcom/goldenboot/saga/zone/WatcherDelta;", "Lcom/goldenboot/saga/zone/WatcherDelta$BounceHandler;", "spanned", "Lcom/goldenboot/saga/zone/DpadBuilder;", "growPayload", "(Lcom/goldenboot/saga/zone/WatcherDelta$BounceHandler;Landroid/text/Spanned;Lcom/goldenboot/saga/zone/ProgressRecord;Lcom/goldenboot/saga/zone/ToastSnapshot;)V", "", "span", "", "start", "end", "evictLayout", "(Lcom/goldenboot/saga/zone/WatcherDelta$BounceHandler;Ljava/lang/Object;IILcom/goldenboot/saga/zone/ProgressRecord;Lcom/goldenboot/saga/zone/ToastSnapshot;)V", "Landroid/text/style/AlignmentSpan;", "Lcom/goldenboot/saga/zone/RailPropagator;", "updateTimer", "(Landroid/text/style/AlignmentSpan;)Lcom/goldenboot/saga/zone/RailPropagator;", "Landroid/text/style/StyleSpan;", "Lcom/goldenboot/saga/zone/MenuEdge;", "applyTask", "(Landroid/text/style/StyleSpan;)Lcom/goldenboot/saga/zone/MenuEdge;", "Landroid/text/style/TypefaceSpan;", "popBlueprint", "(Landroid/text/style/TypefaceSpan;)Lcom/goldenboot/saga/zone/MenuEdge;", "familyName", "Lcom/goldenboot/saga/zone/FeatureConverter;", "releaseHeader", "(Ljava/lang/String;)Lcom/goldenboot/saga/zone/FeatureConverter;", "com/goldenboot/saga/zone/SubscriberHerald$ActivityMutator", "Lcom/goldenboot/saga/zone/SubscriberHerald$ActivityMutator;", "TagHandler", "Ljava/lang/String;", SubscriberHerald.growPayload, "AnnotationTag", "detachStream", "Li", "Ul", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SubscriberHerald {
    private static final String detachStream = "li";
    private static final ActivityMutator evictLayout = new ActivityMutator();
    private static final String growPayload = "ContentHandlerReplacementTag";
    private static final String injectMetric = "annotation";
    private static final String releaseHeader = "ul";

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J5\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/goldenboot/saga/zone/SubscriberHerald$ActivityMutator", "Landroid/text/Html$TagHandler;", "", "opening", "", "tag", "Landroid/text/Editable;", "output", "Lorg/xml/sax/XMLReader;", "xmlReader", "Lcom/goldenboot/saga/zone/DpadBuilder;", "handleTag", "(ZLjava/lang/String;Landroid/text/Editable;Lorg/xml/sax/XMLReader;)V", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator implements Html.TagHandler {
        @Override // android.text.Html.TagHandler
        public void handleTag(boolean opening, String tag, Editable output, XMLReader xmlReader) {
            if (xmlReader == null || output == null || !opening || !Intrinsics.areEqual(tag, SubscriberHerald.growPayload)) {
                return;
            }
            xmlReader.setContentHandler(new DimenAnalyzer(xmlReader.getContentHandler(), output));
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class BounceHandler {
        public static final /* synthetic */ int[] evictLayout;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            evictLayout = iArr;
        }
    }

    private static final SpanStyle applyTask(StyleSpan styleSpan) {
        int style = styleSpan.getStyle();
        if (style == 1) {
            return new SpanStyle(0L, 0L, FontWeight.INSTANCE.injectMetric(), (ProgressMutator) null, (InputHerald) null, (FeatureConverter) null, (String) null, 0L, (BoxMaterializer) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (PatternInspector) null, (Shadow) null, (KeyboardVersion) null, (JoystickUseCase) null, 65531, (DefaultConstructorMarker) null);
        }
        if (style == 2) {
            return new SpanStyle(0L, 0L, (FontWeight) null, ProgressMutator.injectMetric(ProgressMutator.INSTANCE.evictLayout()), (InputHerald) null, (FeatureConverter) null, (String) null, 0L, (BoxMaterializer) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (PatternInspector) null, (Shadow) null, (KeyboardVersion) null, (JoystickUseCase) null, 65527, (DefaultConstructorMarker) null);
        }
        if (style != 3) {
            return null;
        }
        return new SpanStyle(0L, 0L, FontWeight.INSTANCE.injectMetric(), ProgressMutator.injectMetric(ProgressMutator.INSTANCE.evictLayout()), (InputHerald) null, (FeatureConverter) null, (String) null, 0L, (BoxMaterializer) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (PatternInspector) null, (Shadow) null, (KeyboardVersion) null, (JoystickUseCase) null, 65523, (DefaultConstructorMarker) null);
    }

    public static final WatcherDelta clipOrigin(Spanned spanned, ProgressRecord progressRecord, ToastSnapshot toastSnapshot) {
        WatcherDelta.BounceHandler append = new WatcherDelta.BounceHandler(spanned.length()).append(spanned);
        growPayload(append, spanned, progressRecord, toastSnapshot);
        return append.syncScope();
    }

    public static /* synthetic */ WatcherDelta detachStream(WatcherDelta.Companion companion, String str, ProgressRecord progressRecord, ToastSnapshot toastSnapshot, int i, Object obj) {
        if ((i & 2) != 0) {
            progressRecord = null;
        }
        if ((i & 4) != 0) {
            toastSnapshot = null;
        }
        return injectMetric(companion, str, progressRecord, toastSnapshot);
    }

    private static final void evictLayout(WatcherDelta.BounceHandler bounceHandler, Object obj, int i, int i2, ProgressRecord progressRecord, ToastSnapshot toastSnapshot) {
        String url;
        if (obj instanceof AbsoluteSizeSpan) {
            return;
        }
        if (obj instanceof AlignmentSpan) {
            bounceHandler.clipOrigin(updateTimer((AlignmentSpan) obj), i, i2);
            return;
        }
        if (obj instanceof SlotBuilder) {
            SlotBuilder slotBuilder = (SlotBuilder) obj;
            bounceHandler.releaseHeader(slotBuilder.getKey(), slotBuilder.getValue(), i, i2);
            return;
        }
        if (obj instanceof BackgroundColorSpan) {
            bounceHandler.flushSample(new SpanStyle(0L, 0L, (FontWeight) null, (ProgressMutator) null, (InputHerald) null, (FeatureConverter) null, (String) null, 0L, (BoxMaterializer) null, (TextGeometricTransform) null, (LocaleList) null, BoxSaver.growPayload(((BackgroundColorSpan) obj).getBackgroundColor()), (PatternInspector) null, (Shadow) null, (KeyboardVersion) null, (JoystickUseCase) null, 63487, (DefaultConstructorMarker) null), i, i2);
            return;
        }
        if (obj instanceof BulletSpanWithLevel) {
            long growPayload2 = Bullet.INSTANCE.growPayload();
            BulletSpanWithLevel bulletSpanWithLevel = (BulletSpanWithLevel) obj;
            int indentationLevel = bulletSpanWithLevel.getIndentationLevel();
            FrameSaver.growPayload(growPayload2);
            bounceHandler.growPayload(bulletSpanWithLevel.getBullet(), FrameSaver.drawRequest(PooledStatus.connectJob(growPayload2), PooledStatus.serializeOffset(growPayload2) * indentationLevel), i, i2);
            return;
        }
        if (obj instanceof ForegroundColorSpan) {
            bounceHandler.flushSample(new SpanStyle(BoxSaver.growPayload(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (FontWeight) null, (ProgressMutator) null, (InputHerald) null, (FeatureConverter) null, (String) null, 0L, (BoxMaterializer) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (PatternInspector) null, (Shadow) null, (KeyboardVersion) null, (JoystickUseCase) null, 65534, (DefaultConstructorMarker) null), i, i2);
            return;
        }
        if (obj instanceof RelativeSizeSpan) {
            bounceHandler.flushSample(new SpanStyle(0L, FrameSaver.clipOrigin(((RelativeSizeSpan) obj).getSizeChange()), (FontWeight) null, (ProgressMutator) null, (InputHerald) null, (FeatureConverter) null, (String) null, 0L, (BoxMaterializer) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (PatternInspector) null, (Shadow) null, (KeyboardVersion) null, (JoystickUseCase) null, 65533, (DefaultConstructorMarker) null), i, i2);
            return;
        }
        if (obj instanceof StrikethroughSpan) {
            bounceHandler.flushSample(new SpanStyle(0L, 0L, (FontWeight) null, (ProgressMutator) null, (InputHerald) null, (FeatureConverter) null, (String) null, 0L, (BoxMaterializer) null, (TextGeometricTransform) null, (LocaleList) null, 0L, PatternInspector.INSTANCE.growPayload(), (Shadow) null, (KeyboardVersion) null, (JoystickUseCase) null, 61439, (DefaultConstructorMarker) null), i, i2);
            return;
        }
        if (obj instanceof StyleSpan) {
            SpanStyle applyTask = applyTask((StyleSpan) obj);
            if (applyTask != null) {
                bounceHandler.flushSample(applyTask, i, i2);
                return;
            }
            return;
        }
        if (obj instanceof SubscriptSpan) {
            bounceHandler.flushSample(new SpanStyle(0L, 0L, (FontWeight) null, (ProgressMutator) null, (InputHerald) null, (FeatureConverter) null, (String) null, 0L, BoxMaterializer.detachStream(BoxMaterializer.INSTANCE.injectMetric()), (TextGeometricTransform) null, (LocaleList) null, 0L, (PatternInspector) null, (Shadow) null, (KeyboardVersion) null, (JoystickUseCase) null, 65279, (DefaultConstructorMarker) null), i, i2);
            return;
        }
        if (obj instanceof SuperscriptSpan) {
            bounceHandler.flushSample(new SpanStyle(0L, 0L, (FontWeight) null, (ProgressMutator) null, (InputHerald) null, (FeatureConverter) null, (String) null, 0L, BoxMaterializer.detachStream(BoxMaterializer.INSTANCE.releaseHeader()), (TextGeometricTransform) null, (LocaleList) null, 0L, (PatternInspector) null, (Shadow) null, (KeyboardVersion) null, (JoystickUseCase) null, 65279, (DefaultConstructorMarker) null), i, i2);
            return;
        }
        if (obj instanceof TypefaceSpan) {
            bounceHandler.flushSample(popBlueprint((TypefaceSpan) obj), i, i2);
            return;
        }
        if (obj instanceof UnderlineSpan) {
            bounceHandler.flushSample(new SpanStyle(0L, 0L, (FontWeight) null, (ProgressMutator) null, (InputHerald) null, (FeatureConverter) null, (String) null, 0L, (BoxMaterializer) null, (TextGeometricTransform) null, (LocaleList) null, 0L, PatternInspector.INSTANCE.clipOrigin(), (Shadow) null, (KeyboardVersion) null, (JoystickUseCase) null, 61439, (DefaultConstructorMarker) null), i, i2);
        } else {
            if (!(obj instanceof URLSpan) || (url = ((URLSpan) obj).getURL()) == null) {
                return;
            }
            bounceHandler.detachStream(new SpanSequence.BounceHandler(url, progressRecord, toastSnapshot), i, i2);
        }
    }

    public static /* synthetic */ WatcherDelta flushSample(Spanned spanned, ProgressRecord progressRecord, ToastSnapshot toastSnapshot, int i, Object obj) {
        if ((i & 1) != 0) {
            progressRecord = null;
        }
        if ((i & 2) != 0) {
            toastSnapshot = null;
        }
        return clipOrigin(spanned, progressRecord, toastSnapshot);
    }

    private static final void growPayload(WatcherDelta.BounceHandler bounceHandler, Spanned spanned, ProgressRecord progressRecord, ToastSnapshot toastSnapshot) {
        for (Object obj : spanned.getSpans(0, bounceHandler.attachConfig(), Object.class)) {
            long growPayload2 = ContextDelta.growPayload(spanned.getSpanStart(obj), spanned.getSpanEnd(obj));
            evictLayout(bounceHandler, obj, StylusEvent.serializeOffset(growPayload2), StylusEvent.applyTask(growPayload2), progressRecord, toastSnapshot);
        }
    }

    public static final WatcherDelta injectMetric(WatcherDelta.Companion companion, String str, ProgressRecord progressRecord, ToastSnapshot toastSnapshot) {
        return clipOrigin(PanelSyncer.evictLayout("<ContentHandlerReplacementTag />" + str, 63, null, evictLayout), progressRecord, toastSnapshot);
    }

    private static final SpanStyle popBlueprint(TypefaceSpan typefaceSpan) {
        String family = typefaceSpan.getFamily();
        FeatureConverter.Companion companion = FeatureConverter.INSTANCE;
        return new SpanStyle(0L, 0L, (FontWeight) null, (ProgressMutator) null, (InputHerald) null, Intrinsics.areEqual(family, companion.evictLayout().getName()) ? companion.evictLayout() : Intrinsics.areEqual(family, companion.injectMetric().getName()) ? companion.injectMetric() : Intrinsics.areEqual(family, companion.detachStream().getName()) ? companion.detachStream() : Intrinsics.areEqual(family, companion.releaseHeader().getName()) ? companion.releaseHeader() : releaseHeader(typefaceSpan.getFamily()), (String) null, 0L, (BoxMaterializer) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (PatternInspector) null, (Shadow) null, (KeyboardVersion) null, (JoystickUseCase) null, 65503, (DefaultConstructorMarker) null);
    }

    private static final FeatureConverter releaseHeader(String str) {
        if (str != null && str.length() != 0) {
            Typeface create = Typeface.create(str, 0);
            Typeface typeface = Typeface.DEFAULT;
            if (Intrinsics.areEqual(create, typeface) || Intrinsics.areEqual(create, Typeface.create(typeface, 0))) {
                create = null;
            }
            if (create != null) {
                return IndicatorBootstrapper.evictLayout(create);
            }
        }
        return null;
    }

    private static final ParagraphStyle updateTimer(AlignmentSpan alignmentSpan) {
        Layout.Alignment alignment = alignmentSpan.getAlignment();
        int i = alignment == null ? -1 : BounceHandler.evictLayout[alignment.ordinal()];
        return new ParagraphStyle(i != 1 ? i != 2 ? i != 3 ? LifecycleGenerator.INSTANCE.flushSample() : LifecycleGenerator.INSTANCE.growPayload() : LifecycleGenerator.INSTANCE.evictLayout() : LifecycleGenerator.INSTANCE.clipOrigin(), 0, 0L, (TextIndent) null, (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (DefaultRelay) null, 510, (DefaultConstructorMarker) null);
    }
}
