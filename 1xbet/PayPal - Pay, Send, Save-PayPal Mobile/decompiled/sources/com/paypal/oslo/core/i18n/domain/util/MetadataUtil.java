package com.paypal.oslo.core.i18n.domain.util;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/util/MetadataUtil;", "", "<init>", "()V", "", "layoutRow", "", "getFieldList", "(Ljava/lang/String;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MetadataUtil {
    @javax.inject.Inject
    public MetadataUtil() {
    }

    public final java.util.List<java.lang.String> getFieldList(java.lang.String layoutRow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutRow, "");
        java.lang.String str = layoutRow;
        java.util.List list = kotlin.sequences.SequencesKt.toList(kotlin.text.Regex.findAll$default(new kotlin.text.Regex("\\{([^}]+)\\}"), str, 0, 2, null));
        if (!list.isEmpty()) {
            java.util.List list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.text.MatchResult) it.next()).getGroupValues().get(1));
            }
            return arrayList;
        }
        if (str.length() != 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != '\n') {
                    java.lang.String replace$default = kotlin.text.StringsKt.replace$default(layoutRow, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "", false, 4, (java.lang.Object) null);
                    java.lang.String str2 = replace$default;
                    for (int i2 = 0; i2 < str2.length(); i2++) {
                        char charAt = str2.charAt(i2);
                        if (charAt != ',' && charAt != ' ') {
                            return kotlin.collections.CollectionsKt.listOf(replace$default);
                        }
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(str2.length());
                    for (int i3 = 0; i3 < str2.length(); i3++) {
                        arrayList2.add(java.lang.String.valueOf(str2.charAt(i3)));
                    }
                    return arrayList2;
                }
            }
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
