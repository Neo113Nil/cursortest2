package com.izettle.android.auth.model.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\bJ\u0017\u0010\t\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\u0006J#\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lcom/izettle/android/auth/model/mapper/Mapper;", "TFrom", "TTo", "", "from", "inverseMap", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", "map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface Mapper<TFrom, TTo> {
    java.lang.Iterable<TFrom> inverseMap(java.lang.Iterable<? extends TTo> from);

    TFrom inverseMap(TTo from);

    java.lang.Iterable<TTo> map(java.lang.Iterable<? extends TFrom> from);

    TTo map(TFrom from);

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <TFrom, TTo> java.lang.Iterable<TTo> map(com.izettle.android.auth.model.mapper.Mapper<TFrom, TTo> mapper, java.lang.Iterable<? extends TFrom> iterable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
            java.util.Iterator<? extends TFrom> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(mapper.map((com.izettle.android.auth.model.mapper.Mapper<TFrom, TTo>) it.next()));
            }
            return arrayList;
        }

        public static <TFrom, TTo> java.lang.Iterable<TFrom> inverseMap(com.izettle.android.auth.model.mapper.Mapper<TFrom, TTo> mapper, java.lang.Iterable<? extends TTo> iterable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
            java.util.Iterator<? extends TTo> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(mapper.inverseMap((com.izettle.android.auth.model.mapper.Mapper<TFrom, TTo>) it.next()));
            }
            return arrayList;
        }
    }
}
