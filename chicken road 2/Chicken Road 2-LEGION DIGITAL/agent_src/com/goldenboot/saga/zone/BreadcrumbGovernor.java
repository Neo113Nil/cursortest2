package com.goldenboot.saga.zone;

import android.view.DragEvent;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/goldenboot/saga/zone/BreadcrumbGovernor;", "", "Landroid/view/DragEvent;", "dragEvent", "<init>", "(Landroid/view/DragEvent;)V", "evictLayout", "Landroid/view/DragEvent;", "()Landroid/view/DragEvent;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BreadcrumbGovernor {
    public static final int growPayload = 8;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final DragEvent dragEvent;

    public BreadcrumbGovernor(DragEvent dragEvent) {
        this.dragEvent = dragEvent;
    }

    /* renamed from: evictLayout, reason: from getter */
    public final DragEvent getDragEvent() {
        return this.dragEvent;
    }
}
