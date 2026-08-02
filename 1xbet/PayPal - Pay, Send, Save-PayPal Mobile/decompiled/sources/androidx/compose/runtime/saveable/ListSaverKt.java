package androidx.compose.runtime.saveable;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001ap\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012(\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0002¢\u0006\u0002\b\u00062\u001f\u0010\t\u001a\u001b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\b\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Original", "Saveable", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", "", "Lkotlin/ExtensionFunctionType;", "save", "Lkotlin/Function1;", "restore", "Landroidx/compose/runtime/saveable/Saver;", "", "listSaver", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ListSaverKt {
    public static final <Original, Saveable> androidx.compose.runtime.saveable.Saver<Original, java.lang.Object> listSaver(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.saveable.SaverScope, ? super Original, ? extends java.util.List<? extends Saveable>> function2, kotlin.jvm.functions.Function1<? super java.util.List<? extends Saveable>, ? extends Original> function1) {
        kotlin.jvm.functions.Function2 function22 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.saveable.ListSaverKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.compose.runtime.saveable.ListSaverKt.m5462$r8$lambda$mFeWh6YjnIJe9XkAMcsHP5zys(kotlin.jvm.functions.Function2.this, (androidx.compose.runtime.saveable.SaverScope) obj, obj2);
            }
        };
        kotlin.jvm.internal.Intrinsics.checkNotNull(function1, "");
        return androidx.compose.runtime.saveable.SaverKt.Saver(function22, (kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1));
    }

    /* renamed from: $r8$lambda$mFeWh6YjnIJe-9XkAM-csHP5zys, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m5462$r8$lambda$mFeWh6YjnIJe9XkAMcsHP5zys(kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.saveable.SaverScope saverScope, java.lang.Object obj) {
        java.util.List list = (java.util.List) function2.invoke(saverScope, obj);
        java.util.List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj2 = list.get(i);
            if (obj2 != null && !saverScope.canBeSaved(obj2)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("item at index ");
                sb.append(i);
                sb.append(" can't be saved: ");
                sb.append(obj2);
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
        }
        if (list2.isEmpty()) {
            return null;
        }
        return new java.util.ArrayList(list2);
    }
}
