package androidx.navigation3.runtime;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001al\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001f\b\n\u0010\u0005\u001a\u0019\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00022\u001d\u0010\t\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "T", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "Landroidx/navigation3/runtime/NavEntry;", "fallback", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lkotlin/ExtensionFunctionType;", "builder", "entryProvider", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EntryProviderKt {
    public static /* synthetic */ kotlin.jvm.functions.Function1 entryProvider$default(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.runtime.EntryProviderKt$entryProvider$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    return invoke((androidx.navigation3.runtime.EntryProviderKt$entryProvider$1) obj2);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Void invoke(T t) {
                    throw new java.lang.IllegalStateException("Unknown screen ".concat(java.lang.String.valueOf(t)));
                }
            };
        }
        androidx.navigation3.runtime.EntryProviderScope entryProviderScope = new androidx.navigation3.runtime.EntryProviderScope(function1);
        function12.invoke(entryProviderScope);
        return entryProviderScope.build();
    }

    public static final <T> kotlin.jvm.functions.Function1<T, androidx.navigation3.runtime.NavEntry<T>> entryProvider(kotlin.jvm.functions.Function1<? super T, androidx.navigation3.runtime.NavEntry<T>> function1, kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.EntryProviderScope<T>, kotlin.Unit> function12) {
        androidx.navigation3.runtime.EntryProviderScope entryProviderScope = new androidx.navigation3.runtime.EntryProviderScope(function1);
        function12.invoke(entryProviderScope);
        return entryProviderScope.build();
    }
}
