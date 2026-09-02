package com.goldenboot.saga.zone;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import com.goldenboot.saga.zone.AccentSerializer;
import com.goldenboot.saga.zone.LifecycleGenerator;
import com.goldenboot.saga.zone.SingletonAssembler;
import com.goldenboot.saga.zone.ThemePartition;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0004\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0004\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001b\u0010\u0013\u001a\u00020\u0002*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001f\u001a\u00020\u0002*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010\u0004¨\u0006 "}, d2 = {"Lcom/goldenboot/saga/zone/LifecycleGenerator;", "align", "", "peekRevision", "(I)I", "Lcom/goldenboot/saga/zone/SingletonAssembler;", "hyphens", "reduceScope", "Lcom/goldenboot/saga/zone/AccentSerializer$BounceHandler;", "breakStrategy", "serializeOffset", "Lcom/goldenboot/saga/zone/AccentSerializer$FeedbackFlow;", "lineBreakStrictness", "notifyMessage", "Lcom/goldenboot/saga/zone/AccentSerializer$LayerUseCase;", "lineBreakWordStyle", "connectPatch", "Lcom/goldenboot/saga/zone/RuntimeBackup;", "maxHeight", "drawField", "(Lcom/goldenboot/saga/zone/RuntimeBackup;I)I", "Lcom/goldenboot/saga/zone/ChannelList;", "textStyle", "", "ellipsis", "connectJob", "(Lcom/goldenboot/saga/zone/ChannelList;Z)Z", "", "popBlueprint", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "Lcom/goldenboot/saga/zone/ThemePartition;", "attachConfig", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FeedbackTranslator {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int attachConfig(int i) {
        ThemePartition.Companion companion = ThemePartition.INSTANCE;
        return (!ThemePartition.clipOrigin(i, companion.evictLayout()) && ThemePartition.clipOrigin(i, companion.growPayload())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean connectJob(TextStyle textStyle, boolean z) {
        if (z && !PooledStatus.popBlueprint(textStyle.injectConstraint(), FrameSaver.peekRevision(0)) && !PooledStatus.popBlueprint(textStyle.injectConstraint(), PooledStatus.INSTANCE.growPayload())) {
            int updateAction = textStyle.updateAction();
            LifecycleGenerator.Companion companion = LifecycleGenerator.INSTANCE;
            if (!LifecycleGenerator.drawField(updateAction, companion.flushSample()) && !LifecycleGenerator.drawField(textStyle.updateAction(), companion.clipOrigin()) && !LifecycleGenerator.drawField(textStyle.updateAction(), companion.injectMetric())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int connectPatch(int i) {
        AccentSerializer.LayerUseCase.Companion companion = AccentSerializer.LayerUseCase.INSTANCE;
        return (!AccentSerializer.LayerUseCase.flushSample(i, companion.evictLayout()) && AccentSerializer.LayerUseCase.flushSample(i, companion.growPayload())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int drawField(RuntimeBackup runtimeBackup, int i) {
        int lineCount = runtimeBackup.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (runtimeBackup.connectPatch(i2) > i) {
                return i2;
            }
        }
        return runtimeBackup.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int notifyMessage(int i) {
        AccentSerializer.FeedbackFlow.Companion companion = AccentSerializer.FeedbackFlow.INSTANCE;
        if (AccentSerializer.FeedbackFlow.applyTask(i, companion.evictLayout())) {
            return 0;
        }
        if (AccentSerializer.FeedbackFlow.applyTask(i, companion.growPayload())) {
            return 1;
        }
        if (AccentSerializer.FeedbackFlow.applyTask(i, companion.injectMetric())) {
            return 2;
        }
        return AccentSerializer.FeedbackFlow.applyTask(i, companion.detachStream()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int peekRevision(int i) {
        LifecycleGenerator.Companion companion = LifecycleGenerator.INSTANCE;
        if (LifecycleGenerator.drawField(i, companion.detachStream())) {
            return 3;
        }
        if (LifecycleGenerator.drawField(i, companion.releaseHeader())) {
            return 4;
        }
        if (LifecycleGenerator.drawField(i, companion.evictLayout())) {
            return 2;
        }
        return (!LifecycleGenerator.drawField(i, companion.clipOrigin()) && LifecycleGenerator.drawField(i, companion.growPayload())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence popBlueprint(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable == null) {
            spannable = new SpannableString(charSequence);
        }
        if (!BackgroundRunner.evictLayout(spannable, AnimLatch.class)) {
            SpanImporter.drawScope(spannable, new AnimLatch(), spannable.length() - 1, spannable.length() - 1);
        }
        return spannable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reduceScope(int i) {
        SingletonAssembler.Companion companion = SingletonAssembler.INSTANCE;
        if (SingletonAssembler.flushSample(i, companion.evictLayout())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        SingletonAssembler.flushSample(i, companion.growPayload());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int serializeOffset(int i) {
        AccentSerializer.BounceHandler.Companion companion = AccentSerializer.BounceHandler.INSTANCE;
        if (AccentSerializer.BounceHandler.updateTimer(i, companion.injectMetric())) {
            return 0;
        }
        if (AccentSerializer.BounceHandler.updateTimer(i, companion.growPayload())) {
            return 1;
        }
        return AccentSerializer.BounceHandler.updateTimer(i, companion.evictLayout()) ? 2 : 0;
    }
}
