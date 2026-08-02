package androidx.navigation3.runtime;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001BF\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\"\u0010\t\u001a\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bR+\u0010\u0006\u001a\u0013\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR6\u0010\t\u001a\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/navigation3/runtime/NavEntryDecorator;", "", "T", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "onPop", "Landroidx/navigation3/runtime/NavEntry;", "Landroidx/compose/runtime/Composable;", "decorate", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "Lkotlin/jvm/functions/Function1;", "getOnPop$navigation3_runtime", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function3;", "getDecorate$navigation3_runtime", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class NavEntryDecorator<T> {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function3<androidx.navigation3.runtime.NavEntry<T>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> decorate;
    private final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> onPop;

    /* JADX WARN: Multi-variable type inference failed */
    public NavEntryDecorator(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super androidx.navigation3.runtime.NavEntry<T>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        this.onPop = function1;
        this.decorate = function3;
    }

    public /* synthetic */ NavEntryDecorator(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.runtime.NavEntryDecorator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function1, function3);
    }

    public final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> getOnPop$navigation3_runtime() {
        return this.onPop;
    }

    public final kotlin.jvm.functions.Function3<androidx.navigation3.runtime.NavEntry<T>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getDecorate$navigation3_runtime() {
        return this.decorate;
    }
}
