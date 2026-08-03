package androidx.compose.runtime.saveable;

/* compiled from: MapSaver.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001ax\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u00022:\u0010\u0004\u001a6\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n0\u0005¢\u0006\u0002\b\f2\"\u0010\r\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000e¨\u0006\u000f"}, d2 = {"mapSaver", "Landroidx/compose/runtime/saveable/Saver;", "T", "", "save", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", "name", "value", "", "", "Lkotlin/ExtensionFunctionType;", "restore", "Lkotlin/Function1;", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MapSaverKt {
    public static final <T> androidx.compose.runtime.saveable.Saver<T, java.lang.Object> mapSaver(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.saveable.SaverScope, ? super T, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> function2, final kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, ? extends java.lang.Object>, ? extends T> function1) {
        return androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, T, java.util.List<? extends java.lang.Object>>() { // from class: androidx.compose.runtime.saveable.MapSaverKt$mapSaver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.util.List<? extends java.lang.Object> invoke(androidx.compose.runtime.saveable.SaverScope saverScope, java.lang.Object obj) {
                return invoke2(saverScope, (androidx.compose.runtime.saveable.SaverScope) obj);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.util.List<java.lang.Object> invoke2(androidx.compose.runtime.saveable.SaverScope saverScope, T t) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : function2.invoke(saverScope, t).entrySet()) {
                    arrayList.add(entry.getKey());
                    arrayList.add(entry.getValue());
                }
                return arrayList;
            }
        }, new kotlin.jvm.functions.Function1<java.util.List<? extends java.lang.Object>, T>() { // from class: androidx.compose.runtime.saveable.MapSaverKt$mapSaver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final T invoke(java.util.List<? extends java.lang.Object> list) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                if (list.size() % 2 != 0) {
                    throw new java.lang.IllegalStateException("non-zero remainder".toString());
                }
                for (int i = 0; i < list.size(); i += 2) {
                    java.lang.Object obj = list.get(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((java.lang.String) obj, list.get(i + 1));
                }
                return function1.invoke(linkedHashMap);
            }
        });
    }
}
