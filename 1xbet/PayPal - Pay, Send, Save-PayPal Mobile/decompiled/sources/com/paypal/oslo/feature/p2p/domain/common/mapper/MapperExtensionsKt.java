package com.paypal.oslo.feature.p2p.domain.common.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a=\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {com.visa.cbp.getEncExpo.warmup, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "", "input", "", "mapCollection", "(Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;Ljava/util/Collection;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapperExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <I, O> java.util.List<O> mapCollection(com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<I, O> mapper, java.util.Collection<? extends I> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.util.Collection<? extends I> collection2 = collection;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection2, 10));
        java.util.Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(mapper.map(it.next()));
        }
        return arrayList;
    }
}
