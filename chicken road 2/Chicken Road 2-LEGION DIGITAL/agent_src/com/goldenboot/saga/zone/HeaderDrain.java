package com.goldenboot.saga.zone;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ljava/util/Comparator;", "Lcom/goldenboot/saga/zone/ContentRepository;", "Lkotlin/Comparator;", "evictLayout", "Ljava/util/Comparator;", "DepthComparator", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HeaderDrain {
    private static final Comparator<ContentRepository> evictLayout = new ActivityMutator();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/goldenboot/saga/zone/HeaderDrain$ActivityMutator", "Ljava/util/Comparator;", "Lcom/goldenboot/saga/zone/ContentRepository;", "Lkotlin/Comparator;", "a", "b", "", "evictLayout", "(Lcom/goldenboot/saga/zone/ContentRepository;Lcom/goldenboot/saga/zone/ContentRepository;)I", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator implements Comparator<ContentRepository> {
        @Override // java.util.Comparator
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public int compare(ContentRepository a, ContentRepository b) {
            int compare = Intrinsics.compare(a.getDepth(), b.getDepth());
            return compare != 0 ? compare : Intrinsics.compare(a.hashCode(), b.hashCode());
        }
    }
}
