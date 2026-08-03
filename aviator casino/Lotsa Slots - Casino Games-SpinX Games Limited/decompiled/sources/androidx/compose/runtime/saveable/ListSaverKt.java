package androidx.compose.runtime.saveable;

/* compiled from: ListSaver.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a}\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000422\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000b0\u0006¢\u0006\u0002\b\f2)\u0010\r\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00040\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000f\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000e¨\u0006\u0010"}, d2 = {"listSaver", "Landroidx/compose/runtime/saveable/Saver;", "Original", "", "Saveable", "save", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", "name", "value", "", "Lkotlin/ExtensionFunctionType;", "restore", "Lkotlin/Function1;", "list", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListSaverKt {
    public static final <Original, Saveable> androidx.compose.runtime.saveable.Saver<Original, java.lang.Object> listSaver(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.saveable.SaverScope, ? super Original, ? extends java.util.List<? extends Saveable>> function2, kotlin.jvm.functions.Function1<? super java.util.List<? extends Saveable>, ? extends Original> function1) {
        kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, Original, java.lang.Object> function22 = new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, Original, java.lang.Object>() { // from class: androidx.compose.runtime.saveable.ListSaverKt$listSaver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(androidx.compose.runtime.saveable.SaverScope saverScope, java.lang.Object obj) {
                return invoke2(saverScope, (androidx.compose.runtime.saveable.SaverScope) obj);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(androidx.compose.runtime.saveable.SaverScope saverScope, Original original) {
                java.util.List list = (java.util.List) function2.invoke(saverScope, original);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    java.lang.Object obj = list.get(i);
                    if (obj != null && !saverScope.canBeSaved(obj)) {
                        throw new java.lang.IllegalArgumentException("item can't be saved".toString());
                    }
                }
                java.util.List list2 = list;
                if (!list2.isEmpty()) {
                    return new java.util.ArrayList(list2);
                }
                return null;
            }
        };
        kotlin.jvm.internal.Intrinsics.checkNotNull(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return androidx.compose.runtime.saveable.SaverKt.Saver(function22, (kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1));
    }
}
