package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a@\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "", "Landroidx/navigation/NavArgument;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "isArgumentMissing", "", "missingRequiredArguments", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/List;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavArgumentKt {
    public static final java.util.List<java.lang.String> missingRequiredArguments(java.util.Map<java.lang.String, androidx.view.NavArgument> map, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, androidx.view.NavArgument> entry : map.entrySet()) {
            androidx.view.NavArgument value = entry.getValue();
            java.lang.Boolean valueOf = value != null ? java.lang.Boolean.valueOf(value.getIsNullable()) : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf);
            if (!valueOf.booleanValue() && !value.getIsDefaultValuePresent()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Set keySet = linkedHashMap.keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : keySet) {
            if (function1.invoke((java.lang.String) obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
