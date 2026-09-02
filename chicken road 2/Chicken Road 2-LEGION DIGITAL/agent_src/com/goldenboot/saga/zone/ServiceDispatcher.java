package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@ReceiverAdministrator
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\u00020\u0002J3\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/ServiceDispatcher;", "Lcom/goldenboot/saga/zone/CachedDeserializer;", "Lcom/goldenboot/saga/zone/AnimHook;", "Lcom/goldenboot/saga/zone/StackCheckpoint;", "transferData", "Lcom/goldenboot/saga/zone/ShapeSender;", "decorationSize", "Lkotlin/Function1;", "Lcom/goldenboot/saga/zone/StepperAdministrator;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "drawDragDecoration", "connectAttr", "(Lcom/goldenboot/saga/zone/StackCheckpoint;JLcom/goldenboot/saga/zone/TouchRecord;)V", "Lcom/goldenboot/saga/zone/BreadcrumbGovernor;", "startEvent", "", "shrinkBundle", "(Lcom/goldenboot/saga/zone/BreadcrumbGovernor;)Z", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ServiceDispatcher extends CachedDeserializer, AnimHook {
    @ReceiverAdministrator
    void connectAttr(StackCheckpoint transferData, long decorationSize, TouchRecord drawDragDecoration);

    boolean shrinkBundle(BreadcrumbGovernor startEvent);
}
