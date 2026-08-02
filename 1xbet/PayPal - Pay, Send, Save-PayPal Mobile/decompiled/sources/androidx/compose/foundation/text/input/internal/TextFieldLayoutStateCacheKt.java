package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldLayoutStateCacheKt {
    public static final /* synthetic */ java.util.List access$mergeNullableLists(java.util.List list, java.util.List list2) {
        java.util.List list3;
        java.util.List list4 = list;
        if ((list4 == null || list4.isEmpty()) && ((list3 = list2) == null || list3.isEmpty())) {
            return null;
        }
        if (list4 == null || list4.isEmpty()) {
            return list2;
        }
        java.util.List list5 = list2;
        if (list5 == null || list5.isEmpty()) {
            return list;
        }
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder.addAll(list4);
        createListBuilder.addAll(list5);
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }
}
