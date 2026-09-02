package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a@\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005H\u0080\b¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0018\u0010\u0010\u001a\u00020\u000e*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/goldenboot/saga/zone/BreadcrumbMerger;", "T", "Lcom/goldenboot/saga/zone/ContentRepository;", "Lcom/goldenboot/saga/zone/PluginScheduler;", "destination", "Lkotlin/Function1;", "transform", "Lcom/goldenboot/saga/zone/DpadBuilder;", "growPayload", "(Lcom/goldenboot/saga/zone/ContentRepository;Lcom/goldenboot/saga/zone/PluginScheduler;Lcom/goldenboot/saga/zone/TouchRecord;)V", "", "evictLayout", "Ljava/lang/String;", "MeasuredTwiceErrorMessage", "", "(Lcom/goldenboot/saga/zone/ContentRepository;)Z", "isOutMostLookaheadRoot", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StateWorkflow {
    public static final String evictLayout = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()";

    public static final boolean evictLayout(ContentRepository contentRepository) {
        if (contentRepository.getLookaheadRoot() == null) {
            return false;
        }
        ContentRepository acquireAsset = contentRepository.acquireAsset();
        return (acquireAsset != null ? acquireAsset.getLookaheadRoot() : null) == null || contentRepository.getLayoutDelegate().getDetachedFromParentLookaheadPass();
    }

    public static final <T extends BreadcrumbMerger> void growPayload(ContentRepository contentRepository, PluginScheduler pluginScheduler, TouchRecord touchRecord) {
        PluginScheduler measureEndpoint = contentRepository.measureEndpoint();
        Object[] objArr = measureEndpoint.reduceScope;
        int reduceScope = measureEndpoint.reduceScope();
        for (int i = 0; i < reduceScope; i++) {
            ContentRepository contentRepository2 = (ContentRepository) objArr[i];
            if (pluginScheduler.reduceScope() <= i) {
                pluginScheduler.growPayload(touchRecord.invoke(contentRepository2));
            } else {
                pluginScheduler.mergeLocale(i, touchRecord.invoke(contentRepository2));
            }
        }
        pluginScheduler.drawScope(contentRepository.appendKey().size(), pluginScheduler.reduceScope());
    }
}
