package com.goldenboot.saga.zone;

import java.util.Collection;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/goldenboot/saga/zone/InterpolatorCallback;", "T", "Lcom/goldenboot/saga/zone/DividerSegment;", "", "collection", "<init>", "(Ljava/util/Collection;)V", "evictLayout", "Ljava/util/Collection;", "Lcom/goldenboot/saga/zone/CompatCache;", "growPayload", "()Lcom/goldenboot/saga/zone/CompatCache;", "values", "ui-tooling-preview"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class InterpolatorCallback<T> implements DividerSegment<T> {
    public static final int growPayload = 8;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final Collection<T> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public InterpolatorCallback(Collection<? extends T> collection) {
        this.collection = collection;
    }

    @Override // com.goldenboot.saga.zone.DividerSegment
    public CompatCache growPayload() {
        return CursorCollector.prepareTask(this.collection);
    }
}
