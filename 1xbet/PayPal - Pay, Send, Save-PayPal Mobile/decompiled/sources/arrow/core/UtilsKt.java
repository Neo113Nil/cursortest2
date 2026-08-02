package arrow.core;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a?\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00070\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0006*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00028\u0000`\b¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\r*(\u0010\u000f\u001a\u0004\b\u0000\u0010\u0001\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0003"}, d2 = {"P1", "T", "t", "Lkotlin/Function1;", "constant", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "", "", "Larrow/core/Predicate;", "mapNullable", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "", "DeprecatedUnsafeAccess", "Ljava/lang/String;", "DeprecatedAmbiguity", "Predicate"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UtilsKt {
    public static final java.lang.String DeprecatedAmbiguity = "This function is ambiguous and will be removed in future versions of Arrow";
    public static final java.lang.String DeprecatedUnsafeAccess = "This function is unsafe and will be removed in future versions of Arrow. Replace or import `arrow.syntax.unsafe.*` if you wish to continue using it in this way";

    public static /* synthetic */ java.lang.Object $r8$lambda$cHL04KKvFyf4Mv7IGjBbUvkSRPY(java.lang.Object obj, java.lang.Object obj2) {
        return obj;
    }

    public static final <P1, T> kotlin.jvm.functions.Function1<P1, T> constant(final T t) {
        return new kotlin.jvm.functions.Function1() { // from class: arrow.core.UtilsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return arrow.core.UtilsKt.$r8$lambda$cHL04KKvFyf4Mv7IGjBbUvkSRPY(t, obj);
            }
        };
    }

    public static final <T> kotlin.jvm.functions.Function1<T, java.lang.Boolean> mapNullable(final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new kotlin.jvm.functions.Function1() { // from class: arrow.core.UtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(arrow.core.UtilsKt.$r8$lambda$E2zu_3weLa9agQfAS7urAPk3jYc(kotlin.jvm.functions.Function1.this, obj));
            }
        };
    }

    public static /* synthetic */ boolean $r8$lambda$E2zu_3weLa9agQfAS7urAPk3jYc(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        if (obj != null) {
            return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
        }
        return false;
    }
}
