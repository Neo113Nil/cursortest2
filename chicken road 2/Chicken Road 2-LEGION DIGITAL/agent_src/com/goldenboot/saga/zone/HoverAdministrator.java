package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/goldenboot/saga/zone/HoverAdministrator;", "", "", "capacity", "<init>", "(I)V", "Lcom/goldenboot/saga/zone/CachedPatch;", "key", "Lcom/goldenboot/saga/zone/OverlayThread;", "evictLayout", "(Lcom/goldenboot/saga/zone/CachedPatch;)Lcom/goldenboot/saga/zone/OverlayThread;", "value", "Lcom/goldenboot/saga/zone/DpadBuilder;", "growPayload", "(Lcom/goldenboot/saga/zone/CachedPatch;Lcom/goldenboot/saga/zone/OverlayThread;)V", "Lcom/goldenboot/saga/zone/LegacyComposer;", "Lcom/goldenboot/saga/zone/PipelineProcess;", "Lcom/goldenboot/saga/zone/LegacyComposer;", "cache", "Lcom/goldenboot/saga/zone/PipelineProcess;", "singleSizeCacheInput", "injectMetric", "Lcom/goldenboot/saga/zone/OverlayThread;", "singleSizeCacheResult", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HoverAdministrator {
    public static final int detachStream = 8;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final LegacyComposer cache;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private PipelineProcess singleSizeCacheInput;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private TextLayoutResult singleSizeCacheResult;

    public HoverAdministrator() {
        this(0, 1, null);
    }

    public final TextLayoutResult evictLayout(TextLayoutInput key) {
        TextLayoutResult textLayoutResult;
        PipelineProcess pipelineProcess = new PipelineProcess(key);
        LegacyComposer legacyComposer = this.cache;
        if (legacyComposer != null) {
            textLayoutResult = (TextLayoutResult) legacyComposer.injectMetric(pipelineProcess);
        } else {
            if (!Intrinsics.areEqual(this.singleSizeCacheInput, pipelineProcess)) {
                return null;
            }
            textLayoutResult = this.singleSizeCacheResult;
        }
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().injectMetric()) {
            return null;
        }
        return textLayoutResult;
    }

    public final void growPayload(TextLayoutInput key, TextLayoutResult value) {
        LegacyComposer legacyComposer = this.cache;
        if (legacyComposer != null) {
            legacyComposer.detachStream(new PipelineProcess(key), value);
        } else {
            this.singleSizeCacheInput = new PipelineProcess(key);
            this.singleSizeCacheResult = value;
        }
    }

    public HoverAdministrator(int i) {
        this.cache = i != 1 ? new LegacyComposer(i) : null;
    }

    public /* synthetic */ HoverAdministrator(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i);
    }
}
