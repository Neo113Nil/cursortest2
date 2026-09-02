package com.goldenboot.saga.zone;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import com.goldenboot.saga.zone.AlarmEmitter;
import com.goldenboot.saga.zone.LineHeightStyle;
import com.goldenboot.saga.zone.PatternInspector;
import com.goldenboot.saga.zone.WatcherDelta;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010\u001e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b \u0010!\u001a'\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010\u001a\u001a\u0017\u0010$\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010%\u001aa\u0010/\u001a\u00020\u0006*\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2&\u0010.\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0(H\u0000¢\u0006\u0004\b/\u00100\u001a3\u00103\u001a\u00020\u0006*\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b3\u00104\u001aY\u00105\u001a\u00020\u0006*\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00112&\u0010.\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0(H\u0002¢\u0006\u0004\b5\u00106\u001aM\u0010;\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u0001012\u0012\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00120\u00112\u001e\u0010:\u001a\u001a\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000609H\u0000¢\u0006\u0004\b;\u0010<\u001a!\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010=\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b?\u0010@\u001a-\u0010C\u001a\u00020\u0006*\u00020\u00002\b\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bC\u0010D\u001a-\u0010G\u001a\u00020\u0006*\u00020\u00002\b\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bG\u0010H\u001a+\u0010K\u001a\u00020\u0006*\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bK\u0010L\u001a-\u0010O\u001a\u00020\u0006*\u00020\u00002\b\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bO\u0010P\u001a-\u0010S\u001a\u00020\u0006*\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bS\u0010T\u001a-\u0010W\u001a\u00020\u0006*\u00020\u00002\b\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bW\u0010X\u001a3\u0010Z\u001a\u00020\u0006*\u00020\u00002\u0006\u0010Y\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bZ\u0010[\u001a-\u0010^\u001a\u00020\u0006*\u00020\u00002\b\u0010]\u001a\u0004\u0018\u00010\\2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b^\u0010_\u001a+\u0010`\u001a\u00020\u0006*\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b`\u0010L\u001a-\u0010c\u001a\u00020\u0006*\u00020\u00002\b\u0010b\u001a\u0004\u0018\u00010a2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bc\u0010d\u001a5\u0010h\u001a\u00020\u0006*\u00020\u00002\b\u0010f\u001a\u0004\u0018\u00010e2\u0006\u0010g\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bh\u0010i\u001a\u0013\u0010j\u001a\u00020#*\u00020&H\u0002¢\u0006\u0004\bj\u0010k\u001a\u001d\u0010m\u001a\u000201*\u0004\u0018\u0001012\u0006\u0010l\u001a\u000201H\u0002¢\u0006\u0004\bm\u0010n\"\u0018\u0010q\u001a\u00020#*\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006r"}, d2 = {"Landroid/text/Spannable;", "", "span", "", "start", "end", "Lcom/goldenboot/saga/zone/DpadBuilder;", "drawScope", "(Landroid/text/Spannable;Ljava/lang/Object;II)V", "Lcom/goldenboot/saga/zone/PluginState;", "textIndent", "", "contextFontSize", "Lcom/goldenboot/saga/zone/BackgroundCollection;", "density", "syncScope", "(Landroid/text/Spannable;Lcom/goldenboot/saga/zone/PluginState;FLcom/goldenboot/saga/zone/BackgroundCollection;)V", "", "Lcom/goldenboot/saga/zone/WatcherDelta$EndpointList;", "Lcom/goldenboot/saga/zone/WatcherDelta$ActivityMutator;", "annotations", "peekRevision", "(Landroid/text/Spannable;Ljava/util/List;FLcom/goldenboot/saga/zone/BackgroundCollection;Lcom/goldenboot/saga/zone/PluginState;)V", "Lcom/goldenboot/saga/zone/PooledStatus;", "size", "updateTimer", "(JFLcom/goldenboot/saga/zone/BackgroundCollection;)F", "lineHeight", "Lcom/goldenboot/saga/zone/BundleBin;", "lineHeightStyle", "purgeNode", "(Landroid/text/Spannable;JFLcom/goldenboot/saga/zone/BackgroundCollection;Lcom/goldenboot/saga/zone/BundleBin;)V", "drawRequest", "(Landroid/text/Spannable;JFLcom/goldenboot/saga/zone/BackgroundCollection;)V", "applyTask", "", "clipOrigin", "(Lcom/goldenboot/saga/zone/BackgroundCollection;)Z", "Lcom/goldenboot/saga/zone/ChannelList;", "contextTextStyle", "Lkotlin/Function4;", "Lcom/goldenboot/saga/zone/FeatureConverter;", "Lcom/goldenboot/saga/zone/CardReducer;", "Lcom/goldenboot/saga/zone/ProgressMutator;", "Lcom/goldenboot/saga/zone/InputHerald;", "Landroid/graphics/Typeface;", "resolveTypeface", "findTask", "(Landroid/text/Spannable;Lcom/goldenboot/saga/zone/ChannelList;Ljava/util/List;Lcom/goldenboot/saga/zone/BackgroundCollection;Lcom/goldenboot/saga/zone/BoxSteward;)V", "Lcom/goldenboot/saga/zone/MenuEdge;", "style", "expandArgs", "(Landroid/text/Spannable;Lcom/goldenboot/saga/zone/MenuEdge;IILcom/goldenboot/saga/zone/BackgroundCollection;)V", "notifyMessage", "(Landroid/text/Spannable;Lcom/goldenboot/saga/zone/ChannelList;Ljava/util/List;Lcom/goldenboot/saga/zone/BoxSteward;)V", "contextFontSpanStyle", "spanStyles", "Lkotlin/Function3;", "block", "injectMetric", "(Lcom/goldenboot/saga/zone/MenuEdge;Ljava/util/List;Lcom/goldenboot/saga/zone/ConfigListener;)V", "letterSpacing", "Landroid/text/style/MetricAffectingSpan;", "growPayload", "(JLcom/goldenboot/saga/zone/BackgroundCollection;)Landroid/text/style/MetricAffectingSpan;", "Lcom/goldenboot/saga/zone/ColumnWriter;", "shadow", "decodePath", "(Landroid/text/Spannable;Lcom/goldenboot/saga/zone/ColumnWriter;II)V", "Lcom/goldenboot/saga/zone/JoystickUseCase;", "drawStyle", "reduceScope", "(Landroid/text/Spannable;Lcom/goldenboot/saga/zone/JoystickUseCase;II)V", "Lcom/goldenboot/saga/zone/ContainerSource;", "color", "popBlueprint", "(Landroid/text/Spannable;JII)V", "Lcom/goldenboot/saga/zone/BundleTask;", "localeList", "gatherAdapter", "(Landroid/text/Spannable;Lcom/goldenboot/saga/zone/BundleTask;II)V", "Lcom/goldenboot/saga/zone/SnackbarTransformer;", "textGeometricTransform", "inflateAdapter", "(Landroid/text/Spannable;Lcom/goldenboot/saga/zone/SnackbarTransformer;II)V", "", "fontFeatureSettings", "attachConfig", "(Landroid/text/Spannable;Ljava/lang/String;II)V", "fontSize", "resetDelta", "(Landroid/text/Spannable;JLcom/goldenboot/saga/zone/BackgroundCollection;II)V", "Lcom/goldenboot/saga/zone/PatternInspector;", "textDecoration", "mergeLocale", "(Landroid/text/Spannable;Lcom/goldenboot/saga/zone/PatternInspector;II)V", "serializeOffset", "Lcom/goldenboot/saga/zone/BoxMaterializer;", "baselineShift", "drawField", "(Landroid/text/Spannable;Lcom/goldenboot/saga/zone/BoxMaterializer;II)V", "Lcom/goldenboot/saga/zone/LayerTunnel;", "brush", "alpha", "connectJob", "(Landroid/text/Spannable;Lcom/goldenboot/saga/zone/LayerTunnel;FII)V", "releaseHeader", "(Lcom/goldenboot/saga/zone/ChannelList;)Z", "spanStyle", "flushSample", "(Lcom/goldenboot/saga/zone/MenuEdge;Lcom/goldenboot/saga/zone/MenuEdge;)Lcom/goldenboot/saga/zone/MenuEdge;", "detachStream", "(Lcom/goldenboot/saga/zone/MenuEdge;)Z", "needsLetterSpacingSpan", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpanImporter {
    private static final float applyTask(long j, float f, BackgroundCollection backgroundCollection) {
        float serializeOffset;
        long peekRevision = PooledStatus.peekRevision(j);
        AlarmEmitter.Companion companion = AlarmEmitter.INSTANCE;
        if (AlarmEmitter.flushSample(peekRevision, companion.growPayload())) {
            if (!clipOrigin(backgroundCollection)) {
                return backgroundCollection.disposeVersion(j);
            }
            serializeOffset = PooledStatus.serializeOffset(j) / PooledStatus.serializeOffset(backgroundCollection.commitItem(f));
        } else {
            if (!AlarmEmitter.flushSample(peekRevision, companion.evictLayout())) {
                return Float.NaN;
            }
            serializeOffset = PooledStatus.serializeOffset(j);
        }
        return serializeOffset * f;
    }

    private static final void attachConfig(Spannable spannable, String str, int i, int i2) {
        if (str != null) {
            drawScope(spannable, new HoverMap(str), i, i2);
        }
    }

    private static final boolean clipOrigin(BackgroundCollection backgroundCollection) {
        return ((double) backgroundCollection.getFontScale()) > 1.05d;
    }

    private static final void connectJob(Spannable spannable, LayerTunnel layerTunnel, float f, int i, int i2) {
        if (layerTunnel != null) {
            if (layerTunnel instanceof SolidColor) {
                serializeOffset(spannable, ((SolidColor) layerTunnel).getValue(), i, i2);
            } else {
                if (!(layerTunnel instanceof MarginModerator)) {
                    throw new EndpointArchive();
                }
                drawScope(spannable, new ModuleStore((MarginModerator) layerTunnel, f), i, i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DpadBuilder connectPatch(Spannable spannable, BoxSteward boxSteward, SpanStyle spanStyle, int i, int i2) {
        FeatureConverter fontFamily = spanStyle.getFontFamily();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.peekRevision();
        }
        ProgressMutator fontStyle = spanStyle.getFontStyle();
        ProgressMutator injectMetric = ProgressMutator.injectMetric(fontStyle != null ? fontStyle.popBlueprint() : ProgressMutator.INSTANCE.injectMetric());
        InputHerald fontSynthesis = spanStyle.getFontSynthesis();
        spannable.setSpan(new SaveProvider((Typeface) boxSteward.invoke(fontFamily, fontWeight, injectMetric, InputHerald.releaseHeader(fontSynthesis != null ? fontSynthesis.getValue() : InputHerald.INSTANCE.evictLayout()))), i, i2, 33);
        return DpadBuilder.evictLayout;
    }

    private static final void decodePath(Spannable spannable, Shadow shadow, int i, int i2) {
        if (shadow != null) {
            drawScope(spannable, new SnackbarArranger(BoxSaver.inflateAdapter(shadow.getColor()), Float.intBitsToFloat((int) (shadow.getOffset() >> 32)), Float.intBitsToFloat((int) (shadow.getOffset() & 4294967295L)), ItemDispatcher.injectMetric(shadow.getBlurRadius())), i, i2);
        }
    }

    private static final boolean detachStream(SpanStyle spanStyle) {
        long peekRevision = PooledStatus.peekRevision(spanStyle.getLetterSpacing());
        AlarmEmitter.Companion companion = AlarmEmitter.INSTANCE;
        return AlarmEmitter.flushSample(peekRevision, companion.growPayload()) || AlarmEmitter.flushSample(PooledStatus.peekRevision(spanStyle.getLetterSpacing()), companion.evictLayout());
    }

    private static final void drawField(Spannable spannable, BoxMaterializer boxMaterializer, int i, int i2) {
        if (boxMaterializer != null) {
            drawScope(spannable, new CardNotifier(boxMaterializer.getMultiplier()), i, i2);
        }
    }

    public static final void drawRequest(Spannable spannable, long j, float f, BackgroundCollection backgroundCollection) {
        float applyTask = applyTask(j, f, backgroundCollection);
        if (Float.isNaN(applyTask)) {
            return;
        }
        drawScope(spannable, new ToastSpawner(applyTask), 0, spannable.length());
    }

    public static final void drawScope(Spannable spannable, Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }

    private static final void expandArgs(Spannable spannable, SpanStyle spanStyle, int i, int i2, BackgroundCollection backgroundCollection) {
        drawField(spannable, spanStyle.getBaselineShift(), i, i2);
        serializeOffset(spannable, spanStyle.peekRevision(), i, i2);
        connectJob(spannable, spanStyle.connectJob(), spanStyle.applyTask(), i, i2);
        mergeLocale(spannable, spanStyle.getTextDecoration(), i, i2);
        resetDelta(spannable, spanStyle.getFontSize(), backgroundCollection, i, i2);
        attachConfig(spannable, spanStyle.getFontFeatureSettings(), i, i2);
        inflateAdapter(spannable, spanStyle.getTextGeometricTransform(), i, i2);
        gatherAdapter(spannable, spanStyle.getLocaleList(), i, i2);
        popBlueprint(spannable, spanStyle.getBackground(), i, i2);
        decodePath(spannable, spanStyle.getShadow(), i, i2);
        reduceScope(spannable, spanStyle.getDrawStyle(), i, i2);
    }

    public static final void findTask(Spannable spannable, TextStyle textStyle, List<? extends WatcherDelta.Range<? extends WatcherDelta.ActivityMutator>> list, BackgroundCollection backgroundCollection, BoxSteward boxSteward) {
        MetricAffectingSpan growPayload;
        notifyMessage(spannable, textStyle, list, boxSteward);
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            WatcherDelta.Range<? extends WatcherDelta.ActivityMutator> range = list.get(i);
            if (range.updateTimer() instanceof SpanStyle) {
                int start = range.getStart();
                int end = range.getEnd();
                if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                    expandArgs(spannable, (SpanStyle) range.updateTimer(), start, end, backgroundCollection);
                    if (detachStream((SpanStyle) range.updateTimer())) {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                WatcherDelta.Range<? extends WatcherDelta.ActivityMutator> range2 = list.get(i2);
                WatcherDelta.ActivityMutator updateTimer = range2.updateTimer();
                if (updateTimer instanceof SpanStyle) {
                    int start2 = range2.getStart();
                    int end2 = range2.getEnd();
                    if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (growPayload = growPayload(((SpanStyle) updateTimer).getLetterSpacing(), backgroundCollection)) != null) {
                        drawScope(spannable, growPayload, start2, end2);
                    }
                }
            }
        }
    }

    private static final SpanStyle flushSample(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.injectConstraint(spanStyle2);
    }

    public static final void gatherAdapter(Spannable spannable, LocaleList localeList, int i, int i2) {
        if (localeList != null) {
            drawScope(spannable, FramePool.evictLayout.evictLayout(localeList), i, i2);
        }
    }

    private static final MetricAffectingSpan growPayload(long j, BackgroundCollection backgroundCollection) {
        long peekRevision = PooledStatus.peekRevision(j);
        AlarmEmitter.Companion companion = AlarmEmitter.INSTANCE;
        if (AlarmEmitter.flushSample(peekRevision, companion.growPayload())) {
            return new SessionSource(backgroundCollection.disposeVersion(j));
        }
        if (AlarmEmitter.flushSample(peekRevision, companion.evictLayout())) {
            return new EndpointBuffer(PooledStatus.serializeOffset(j));
        }
        return null;
    }

    private static final void inflateAdapter(Spannable spannable, TextGeometricTransform textGeometricTransform, int i, int i2) {
        if (textGeometricTransform != null) {
            drawScope(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i, i2);
            drawScope(spannable, new SpringReader(textGeometricTransform.getSkewX()), i, i2);
        }
    }

    public static final void injectMetric(SpanStyle spanStyle, List<WatcherDelta.Range<SpanStyle>> list, ConfigListener configListener) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            configListener.invoke(flushSample(spanStyle, list.get(0).updateTimer()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
            return;
        }
        int size = list.size();
        int i = size * 2;
        int[] iArr = new int[i];
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            WatcherDelta.Range<SpanStyle> range = list.get(i2);
            iArr[i2] = range.getStart();
            iArr[i2 + size] = range.getEnd();
        }
        InsetsReader.storeCharset(iArr);
        int connectComponent = PluginInspector.connectComponent(iArr);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            if (i4 != connectComponent) {
                int size3 = list.size();
                SpanStyle spanStyle2 = spanStyle;
                for (int i5 = 0; i5 < size3; i5++) {
                    WatcherDelta.Range<SpanStyle> range2 = list.get(i5);
                    if (range2.getStart() != range2.getEnd() && IconLink.expandArgs(connectComponent, i4, range2.getStart(), range2.getEnd())) {
                        spanStyle2 = flushSample(spanStyle2, range2.updateTimer());
                    }
                }
                if (spanStyle2 != null) {
                    configListener.invoke(spanStyle2, Integer.valueOf(connectComponent), Integer.valueOf(i4));
                }
                connectComponent = i4;
            }
        }
    }

    public static final void mergeLocale(Spannable spannable, PatternInspector patternInspector, int i, int i2) {
        if (patternInspector != null) {
            PatternInspector.Companion companion = PatternInspector.INSTANCE;
            drawScope(spannable, new FadeActivator(patternInspector.detachStream(companion.clipOrigin()), patternInspector.detachStream(companion.growPayload())), i, i2);
        }
    }

    private static final void notifyMessage(final Spannable spannable, TextStyle textStyle, List<? extends WatcherDelta.Range<? extends WatcherDelta.ActivityMutator>> list, final BoxSteward boxSteward) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            WatcherDelta.Range<? extends WatcherDelta.ActivityMutator> range = list.get(i);
            if ((range.updateTimer() instanceof SpanStyle) && (ItemDispatcher.releaseHeader((SpanStyle) range.updateTimer()) || ((SpanStyle) range.updateTimer()).getFontSynthesis() != null)) {
                Intrinsics.checkNotNull(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                arrayList.add(range);
            }
        }
        injectMetric(releaseHeader(textStyle) ? new SpanStyle(0L, 0L, textStyle.findTask(), textStyle.drawScope(), textStyle.expandArgs(), textStyle.drawRequest(), (String) null, 0L, (BoxMaterializer) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (PatternInspector) null, (Shadow) null, (KeyboardVersion) null, (JoystickUseCase) null, 65475, (DefaultConstructorMarker) null) : null, arrayList, new ConfigListener() { // from class: com.goldenboot.saga.zone.CursorArranger
            @Override // com.goldenboot.saga.zone.ConfigListener
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                DpadBuilder connectPatch;
                connectPatch = SpanImporter.connectPatch(spannable, boxSteward, (SpanStyle) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                return connectPatch;
            }
        });
    }

    public static final void peekRevision(Spannable spannable, List<? extends WatcherDelta.Range<? extends WatcherDelta.ActivityMutator>> list, float f, BackgroundCollection backgroundCollection, TextIndent textIndent) {
        BackgroundCollection backgroundCollection2 = backgroundCollection;
        float f2 = 0.0f;
        if (textIndent != null) {
            long peekRevision = PooledStatus.peekRevision(textIndent.getFirstLine());
            AlarmEmitter.Companion companion = AlarmEmitter.INSTANCE;
            if (AlarmEmitter.flushSample(peekRevision, companion.growPayload())) {
                f2 = backgroundCollection2.disposeVersion(textIndent.getFirstLine());
            } else if (AlarmEmitter.flushSample(peekRevision, companion.evictLayout())) {
                f2 = PooledStatus.serializeOffset(textIndent.getFirstLine()) * f;
            }
        }
        float f3 = f2;
        int size = list.size();
        int i = 0;
        while (i < size) {
            WatcherDelta.Range<? extends WatcherDelta.ActivityMutator> range = list.get(i);
            WatcherDelta.ActivityMutator updateTimer = range.updateTimer();
            Bullet bullet = updateTimer instanceof Bullet ? (Bullet) updateTimer : null;
            if (bullet != null) {
                float updateTimer2 = updateTimer(bullet.getSize(), f, backgroundCollection2);
                float updateTimer3 = updateTimer(bullet.getHeight(), f, backgroundCollection2);
                float updateTimer4 = updateTimer(bullet.getPadding(), f, backgroundCollection2);
                if (!Float.isNaN(updateTimer2) && !Float.isNaN(updateTimer3) && !Float.isNaN(updateTimer4)) {
                    drawScope(spannable, new ToastWork(bullet.getShape(), updateTimer2, updateTimer3, updateTimer4, bullet.getBrush(), bullet.getAlpha(), bullet.getDrawStyle(), backgroundCollection2, f3), range.getStart(), range.getEnd());
                }
            }
            i++;
            backgroundCollection2 = backgroundCollection;
        }
    }

    public static final void popBlueprint(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            drawScope(spannable, new BackgroundColorSpan(BoxSaver.inflateAdapter(j)), i, i2);
        }
    }

    public static final void purgeNode(Spannable spannable, long j, float f, BackgroundCollection backgroundCollection, LineHeightStyle lineHeightStyle) {
        float applyTask = applyTask(j, f, backgroundCollection);
        if (Float.isNaN(applyTask)) {
            return;
        }
        drawScope(spannable, new SocketBootstrapper(applyTask, 0, (spannable.length() == 0 || GestureInterpreter.loadItem(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), LineHeightStyle.LayerUseCase.popBlueprint(lineHeightStyle.getTrim()), LineHeightStyle.LayerUseCase.drawField(lineHeightStyle.getTrim()), lineHeightStyle.getAlignment(), LineHeightStyle.FeedbackFlow.clipOrigin(lineHeightStyle.getMode(), LineHeightStyle.FeedbackFlow.INSTANCE.growPayload())), 0, spannable.length());
    }

    private static final void reduceScope(Spannable spannable, JoystickUseCase joystickUseCase, int i, int i2) {
        if (joystickUseCase != null) {
            drawScope(spannable, new DragGuardian(joystickUseCase), i, i2);
        }
    }

    private static final boolean releaseHeader(TextStyle textStyle) {
        return ItemDispatcher.releaseHeader(textStyle.peekDescriptor()) || textStyle.expandArgs() != null;
    }

    public static final void resetDelta(Spannable spannable, long j, BackgroundCollection backgroundCollection, int i, int i2) {
        long peekRevision = PooledStatus.peekRevision(j);
        AlarmEmitter.Companion companion = AlarmEmitter.INSTANCE;
        if (AlarmEmitter.flushSample(peekRevision, companion.growPayload())) {
            drawScope(spannable, new AbsoluteSizeSpan(ChipChain.injectMetric(backgroundCollection.disposeVersion(j)), false), i, i2);
        } else if (AlarmEmitter.flushSample(peekRevision, companion.evictLayout())) {
            drawScope(spannable, new RelativeSizeSpan(PooledStatus.serializeOffset(j)), i, i2);
        }
    }

    public static final void serializeOffset(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            drawScope(spannable, new ForegroundColorSpan(BoxSaver.inflateAdapter(j)), i, i2);
        }
    }

    public static final void syncScope(Spannable spannable, TextIndent textIndent, float f, BackgroundCollection backgroundCollection) {
        if (textIndent != null) {
            if ((PooledStatus.popBlueprint(textIndent.getFirstLine(), FrameSaver.peekRevision(0)) && PooledStatus.popBlueprint(textIndent.getRestLine(), FrameSaver.peekRevision(0))) || PooledStatus.connectJob(textIndent.getFirstLine()) == 0 || PooledStatus.connectJob(textIndent.getRestLine()) == 0) {
                return;
            }
            long peekRevision = PooledStatus.peekRevision(textIndent.getFirstLine());
            AlarmEmitter.Companion companion = AlarmEmitter.INSTANCE;
            float f2 = 0.0f;
            float disposeVersion = AlarmEmitter.flushSample(peekRevision, companion.growPayload()) ? backgroundCollection.disposeVersion(textIndent.getFirstLine()) : AlarmEmitter.flushSample(peekRevision, companion.evictLayout()) ? PooledStatus.serializeOffset(textIndent.getFirstLine()) * f : 0.0f;
            long peekRevision2 = PooledStatus.peekRevision(textIndent.getRestLine());
            if (AlarmEmitter.flushSample(peekRevision2, companion.growPayload())) {
                f2 = backgroundCollection.disposeVersion(textIndent.getRestLine());
            } else if (AlarmEmitter.flushSample(peekRevision2, companion.evictLayout())) {
                f2 = PooledStatus.serializeOffset(textIndent.getRestLine()) * f;
            }
            drawScope(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(disposeVersion), (int) Math.ceil(f2)), 0, spannable.length());
        }
    }

    private static final float updateTimer(long j, float f, BackgroundCollection backgroundCollection) {
        if (PooledStatus.popBlueprint(j, PooledStatus.INSTANCE.growPayload())) {
            return f;
        }
        long peekRevision = PooledStatus.peekRevision(j);
        AlarmEmitter.Companion companion = AlarmEmitter.INSTANCE;
        if (AlarmEmitter.flushSample(peekRevision, companion.growPayload())) {
            return backgroundCollection.disposeVersion(j);
        }
        if (AlarmEmitter.flushSample(peekRevision, companion.evictLayout())) {
            return PooledStatus.serializeOffset(j) * f;
        }
        return Float.NaN;
    }
}
