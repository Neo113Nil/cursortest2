package androidx.paging.internal;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/paging/LoadStates;", "mediatorStates", "Lkotlin/Function0;", "", "log", "appendMediatorStatesIfNotNull", "(Landroidx/paging/LoadStates;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LogUtilKt {
    public static final java.lang.String appendMediatorStatesIfNotNull(androidx.paging.LoadStates loadStates, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        java.lang.String invoke = function0.invoke();
        if (loadStates != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(invoke);
            sb.append("|   mediatorLoadStates: ");
            sb.append(loadStates);
            sb.append('\n');
            invoke = sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(invoke);
        sb2.append("|)");
        return kotlin.text.StringsKt.trimMargin$default(sb2.toString(), null, 1, null);
    }
}
