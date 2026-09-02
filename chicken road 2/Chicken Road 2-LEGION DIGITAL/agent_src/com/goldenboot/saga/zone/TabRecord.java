package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.AccentSerializer;
import com.goldenboot.saga.zone.LifecycleGenerator;
import com.goldenboot.saga.zone.SingletonAssembler;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ac\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b \u0010!\u001a\u001f\u0010#\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b#\u0010$\"\u0014\u0010&\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%¨\u0006'"}, d2 = {"Lcom/goldenboot/saga/zone/RailPropagator;", "start", "stop", "", "fraction", "growPayload", "(Lcom/goldenboot/saga/zone/RailPropagator;Lcom/goldenboot/saga/zone/RailPropagator;F)Lcom/goldenboot/saga/zone/RailPropagator;", "Lcom/goldenboot/saga/zone/IconUpgrade;", "injectMetric", "(Lcom/goldenboot/saga/zone/IconUpgrade;Lcom/goldenboot/saga/zone/IconUpgrade;F)Lcom/goldenboot/saga/zone/IconUpgrade;", "style", "Lcom/goldenboot/saga/zone/LabelCache;", "direction", "releaseHeader", "(Lcom/goldenboot/saga/zone/RailPropagator;Lcom/goldenboot/saga/zone/LabelCache;)Lcom/goldenboot/saga/zone/RailPropagator;", "Lcom/goldenboot/saga/zone/LifecycleGenerator;", "textAlign", "Lcom/goldenboot/saga/zone/ModuleChain;", "textDirection", "Lcom/goldenboot/saga/zone/PooledStatus;", "lineHeight", "Lcom/goldenboot/saga/zone/PluginState;", "textIndent", "platformStyle", "Lcom/goldenboot/saga/zone/BundleBin;", "lineHeightStyle", "Lcom/goldenboot/saga/zone/AccentSerializer;", "lineBreak", "Lcom/goldenboot/saga/zone/SingletonAssembler;", "hyphens", "Lcom/goldenboot/saga/zone/DefaultRelay;", "textMotion", "evictLayout", "(Lcom/goldenboot/saga/zone/RailPropagator;IIJLcom/goldenboot/saga/zone/PluginState;Lcom/goldenboot/saga/zone/IconUpgrade;Lcom/goldenboot/saga/zone/BundleBin;IILcom/goldenboot/saga/zone/DefaultRelay;)Lcom/goldenboot/saga/zone/RailPropagator;", "other", "detachStream", "(Lcom/goldenboot/saga/zone/RailPropagator;Lcom/goldenboot/saga/zone/IconUpgrade;)Lcom/goldenboot/saga/zone/IconUpgrade;", "J", "DefaultLineHeight", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabRecord {
    private static final long evictLayout = PooledStatus.INSTANCE.growPayload();

    private static final PlatformParagraphStyle detachStream(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        return paragraphStyle.getPlatformStyle() == null ? platformParagraphStyle : platformParagraphStyle == null ? paragraphStyle.getPlatformStyle() : paragraphStyle.getPlatformStyle().releaseHeader(platformParagraphStyle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0048, code lost:
    
        if (com.goldenboot.saga.zone.PooledStatus.popBlueprint(r11, r24.getLineHeight()) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ParagraphStyle evictLayout(ParagraphStyle paragraphStyle, int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, DefaultRelay defaultRelay) {
        long j2;
        long j3;
        int i5 = i;
        TextIndent textIndent2 = textIndent;
        LifecycleGenerator.Companion companion = LifecycleGenerator.INSTANCE;
        if (LifecycleGenerator.drawField(i5, companion.flushSample()) || LifecycleGenerator.drawField(i5, paragraphStyle.getTextAlign())) {
            if (PooledStatus.connectJob(j) == 0) {
                j2 = 0;
                j3 = j;
            } else {
                j2 = 0;
                j3 = j;
            }
            if ((textIndent2 == null || Intrinsics.areEqual(textIndent2, paragraphStyle.getTextIndent())) && ((ModuleChain.popBlueprint(i2, ModuleChain.INSTANCE.clipOrigin()) || ModuleChain.popBlueprint(i2, paragraphStyle.getTextDirection())) && ((platformParagraphStyle == null || Intrinsics.areEqual(platformParagraphStyle, paragraphStyle.getPlatformStyle())) && ((lineHeightStyle == null || Intrinsics.areEqual(lineHeightStyle, paragraphStyle.getLineHeightStyle())) && ((AccentSerializer.drawField(i3, AccentSerializer.INSTANCE.flushSample()) || AccentSerializer.drawField(i3, paragraphStyle.getLineBreak())) && ((SingletonAssembler.flushSample(i4, SingletonAssembler.INSTANCE.injectMetric()) || SingletonAssembler.flushSample(i4, paragraphStyle.getHyphens())) && (defaultRelay == null || Intrinsics.areEqual(defaultRelay, paragraphStyle.getTextMotion())))))))) {
                return paragraphStyle;
            }
        } else {
            j2 = 0;
            j3 = j;
        }
        long lineHeight = PooledStatus.connectJob(j3) == j2 ? paragraphStyle.getLineHeight() : j3;
        if (textIndent2 == null) {
            textIndent2 = paragraphStyle.getTextIndent();
        }
        TextIndent textIndent3 = textIndent2;
        if (LifecycleGenerator.drawField(i5, companion.flushSample())) {
            i5 = paragraphStyle.getTextAlign();
        }
        return new ParagraphStyle(i5, !ModuleChain.popBlueprint(i2, ModuleChain.INSTANCE.clipOrigin()) ? i2 : paragraphStyle.getTextDirection(), lineHeight, textIndent3, detachStream(paragraphStyle, platformParagraphStyle), lineHeightStyle == null ? paragraphStyle.getLineHeightStyle() : lineHeightStyle, !AccentSerializer.drawField(i3, AccentSerializer.INSTANCE.flushSample()) ? i3 : paragraphStyle.getLineBreak(), !SingletonAssembler.flushSample(i4, SingletonAssembler.INSTANCE.injectMetric()) ? i4 : paragraphStyle.getHyphens(), defaultRelay == null ? paragraphStyle.getTextMotion() : defaultRelay, (DefaultConstructorMarker) null);
    }

    public static final ParagraphStyle growPayload(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, float f) {
        int value = ((LifecycleGenerator) AnimInterpreter.detachStream(LifecycleGenerator.updateTimer(paragraphStyle.getTextAlign()), LifecycleGenerator.updateTimer(paragraphStyle2.getTextAlign()), f)).getValue();
        int value2 = ((ModuleChain) AnimInterpreter.detachStream(ModuleChain.flushSample(paragraphStyle.getTextDirection()), ModuleChain.flushSample(paragraphStyle2.getTextDirection()), f)).getValue();
        long clipOrigin = AnimInterpreter.clipOrigin(paragraphStyle.getLineHeight(), paragraphStyle2.getLineHeight(), f);
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.evictLayout();
        }
        TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.INSTANCE.evictLayout();
        }
        return new ParagraphStyle(value, value2, clipOrigin, WindowAllocator.evictLayout(textIndent, textIndent2, f), injectMetric(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f), (LineHeightStyle) AnimInterpreter.detachStream(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f), ((AccentSerializer) AnimInterpreter.detachStream(AccentSerializer.releaseHeader(paragraphStyle.getLineBreak()), AccentSerializer.releaseHeader(paragraphStyle2.getLineBreak()), f)).getMask(), ((SingletonAssembler) AnimInterpreter.detachStream(SingletonAssembler.detachStream(paragraphStyle.getHyphens()), SingletonAssembler.detachStream(paragraphStyle2.getHyphens()), f)).getValue(), (DefaultRelay) AnimInterpreter.detachStream(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f), (DefaultConstructorMarker) null);
    }

    private static final PlatformParagraphStyle injectMetric(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.INSTANCE.evictLayout();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.INSTANCE.evictLayout();
        }
        return BorderSlot.growPayload(platformParagraphStyle, platformParagraphStyle2, f);
    }

    public static final ParagraphStyle releaseHeader(ParagraphStyle paragraphStyle, LabelCache labelCache) {
        int textAlign = paragraphStyle.getTextAlign();
        LifecycleGenerator.Companion companion = LifecycleGenerator.INSTANCE;
        int clipOrigin = LifecycleGenerator.drawField(textAlign, companion.flushSample()) ? companion.clipOrigin() : paragraphStyle.getTextAlign();
        int releaseHeader = DelegateConfigurator.releaseHeader(labelCache, paragraphStyle.getTextDirection());
        long lineHeight = PooledStatus.connectJob(paragraphStyle.getLineHeight()) == 0 ? evictLayout : paragraphStyle.getLineHeight();
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.evictLayout();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int lineBreak = paragraphStyle.getLineBreak();
        AccentSerializer.Companion companion2 = AccentSerializer.INSTANCE;
        int releaseHeader2 = AccentSerializer.drawField(lineBreak, companion2.flushSample()) ? companion2.releaseHeader() : paragraphStyle.getLineBreak();
        int hyphens = paragraphStyle.getHyphens();
        SingletonAssembler.Companion companion3 = SingletonAssembler.INSTANCE;
        int growPayload = SingletonAssembler.flushSample(hyphens, companion3.injectMetric()) ? companion3.growPayload() : paragraphStyle.getHyphens();
        DefaultRelay textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = DefaultRelay.INSTANCE.growPayload();
        }
        return new ParagraphStyle(clipOrigin, releaseHeader, lineHeight, textIndent2, platformStyle, lineHeightStyle, releaseHeader2, growPayload, textMotion, (DefaultConstructorMarker) null);
    }
}
