package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/goldenboot/saga/zone/NavBarShaper;", "", "<init>", "()V", "Lcom/goldenboot/saga/zone/DpadBuilder;", "injectMetric", "Lcom/goldenboot/saga/zone/StepperAdministrator;", "evictLayout", "(Lcom/goldenboot/saga/zone/StepperAdministrator;)V", "Lkotlin/Function1;", "Lcom/goldenboot/saga/zone/TouchRecord;", "growPayload", "()Lcom/goldenboot/saga/zone/TouchRecord;", "detachStream", "(Lcom/goldenboot/saga/zone/TouchRecord;)V", "invalidateListener", "Lcom/goldenboot/saga/zone/ReceiverAdapter;", "Lcom/goldenboot/saga/zone/CoreForger;", "Lcom/goldenboot/saga/zone/SingletonHeap;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class NavBarShaper {
    public static final int growPayload = 8;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private TouchRecord invalidateListener;

    public /* synthetic */ NavBarShaper(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public void detachStream(TouchRecord touchRecord) {
        this.invalidateListener = touchRecord;
    }

    public abstract void evictLayout(StepperAdministrator stepperAdministrator);

    /* renamed from: growPayload, reason: from getter */
    public TouchRecord getInvalidateListener() {
        return this.invalidateListener;
    }

    public final void injectMetric() {
        TouchRecord invalidateListener = getInvalidateListener();
        if (invalidateListener != null) {
            invalidateListener.invoke(this);
        }
    }

    private NavBarShaper() {
    }
}
