package kotlin.enums;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u00062\u00060\u0007j\u0002`\bB\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lkotlin/enums/EnumEntriesList;", "", "T", "Lkotlin/enums/EnumEntries;", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/getHighResolutionOutputSizeshNQ4ISI;", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "", "p0", "<init>", "([Ljava/lang/Enum;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/getHighSpeedVideoSizes;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "Camera2StreamConfigurationMap", "[Ljava/lang/Enum;", "", "getSize", "()I", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class EnumEntriesList<T extends java.lang.Enum<T>> extends kotlin.collections.AbstractList<T> implements kotlin.enums.EnumEntries<T>, java.util.RandomAccess, java.io.Serializable {
    private final T[] Camera2StreamConfigurationMap;

    public EnumEntriesList(T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        this.Camera2StreamConfigurationMap = tArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Enum)) {
            return false;
        }
        java.lang.Enum r4 = (java.lang.Enum) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "");
        return ((java.lang.Enum) kotlin.collections.ArraysKt.getOrNull(this.Camera2StreamConfigurationMap, r4.ordinal())) == r4;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Enum)) {
            return -1;
        }
        java.lang.Enum r4 = (java.lang.Enum) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "");
        int ordinal = r4.ordinal();
        if (((java.lang.Enum) kotlin.collections.ArraysKt.getOrNull(this.Camera2StreamConfigurationMap, ordinal)) == r4) {
            return ordinal;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Enum)) {
            return -1;
        }
        java.lang.Enum r4 = (java.lang.Enum) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "");
        int ordinal = r4.ordinal();
        if (((java.lang.Enum) kotlin.collections.ArraysKt.getOrNull(this.Camera2StreamConfigurationMap, ordinal)) == r4) {
            return ordinal;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.Camera2StreamConfigurationMap.length;
    }

    private final java.lang.Object writeReplace() {
        return new kotlin.enums.EnumEntriesSerializationProxy(this.Camera2StreamConfigurationMap);
    }

    private final void readObject(java.io.ObjectInputStream input) {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(i, this.Camera2StreamConfigurationMap.length);
        return this.Camera2StreamConfigurationMap[i];
    }
}
