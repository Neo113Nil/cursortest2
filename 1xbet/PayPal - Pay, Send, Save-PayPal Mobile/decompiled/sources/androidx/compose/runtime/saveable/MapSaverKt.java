package androidx.compose.runtime.saveable;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001au\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u000b\"\u0004\b\u0000\u0010\u000020\u0010\b\u001a,\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0001¢\u0006\u0002\b\u00072\"\u0010\n\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t¢\u0006\u0004\b\f\u0010\r"}, d2 = {"T", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", "", "", "", "Lkotlin/ExtensionFunctionType;", "save", "Lkotlin/Function1;", "restore", "Landroidx/compose/runtime/saveable/Saver;", "mapSaver", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MapSaverKt {
    public static final <T> androidx.compose.runtime.saveable.Saver<T, java.lang.Object> mapSaver(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.saveable.SaverScope, ? super T, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> function2, final kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, ? extends java.lang.Object>, ? extends T> function1) {
        return androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.saveable.MapSaverKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.compose.runtime.saveable.MapSaverKt.$r8$lambda$zfeOF2SnbucZz2Yn1hSPKQej1mo(kotlin.jvm.functions.Function2.this, (androidx.compose.runtime.saveable.SaverScope) obj, obj2);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.saveable.MapSaverKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.runtime.saveable.MapSaverKt.$r8$lambda$UlF9purCFzs0aFt24DaME2BGozk(kotlin.jvm.functions.Function1.this, (java.util.List) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$UlF9purCFzs0aFt24DaME2BGozk(kotlin.jvm.functions.Function1 function1, java.util.List list) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (list.size() % 2 != 0) {
            throw new java.lang.IllegalStateException("non-zero remainder".toString());
        }
        for (int i = 0; i < list.size(); i += 2) {
            java.lang.Object obj = list.get(i);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            linkedHashMap.put((java.lang.String) obj, list.get(i + 1));
        }
        return function1.invoke(linkedHashMap);
    }

    public static /* synthetic */ java.util.List $r8$lambda$zfeOF2SnbucZz2Yn1hSPKQej1mo(kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.saveable.SaverScope saverScope, java.lang.Object obj) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : ((java.util.Map) function2.invoke(saverScope, obj)).entrySet()) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }
}
