package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/goldenboot/saga/zone/MenuMemento;", "", "Lcom/goldenboot/saga/zone/WatcherDelta;", "text", "Lcom/goldenboot/saga/zone/ConsumerAction;", "offsetMapping", "<init>", "(Lcom/goldenboot/saga/zone/WatcherDelta;Lcom/goldenboot/saga/zone/ConsumerAction;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "evictLayout", "Lcom/goldenboot/saga/zone/WatcherDelta;", "growPayload", "()Lcom/goldenboot/saga/zone/WatcherDelta;", "Lcom/goldenboot/saga/zone/ConsumerAction;", "()Lcom/goldenboot/saga/zone/ConsumerAction;", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.MenuMemento, reason: from toString */
/* loaded from: classes.dex */
public final class TransformedText {
    public static final int injectMetric = 8;

    /* renamed from: evictLayout, reason: from kotlin metadata and from toString */
    private final WatcherDelta text;

    /* renamed from: growPayload, reason: from kotlin metadata and from toString */
    private final ConsumerAction offsetMapping;

    public TransformedText(WatcherDelta watcherDelta, ConsumerAction consumerAction) {
        this.text = watcherDelta;
        this.offsetMapping = consumerAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransformedText)) {
            return false;
        }
        TransformedText transformedText = (TransformedText) other;
        return Intrinsics.areEqual(this.text, transformedText.text) && Intrinsics.areEqual(this.offsetMapping, transformedText.offsetMapping);
    }

    /* renamed from: evictLayout, reason: from getter */
    public final ConsumerAction getOffsetMapping() {
        return this.offsetMapping;
    }

    /* renamed from: growPayload, reason: from getter */
    public final WatcherDelta getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
    }
}
