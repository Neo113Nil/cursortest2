package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/TransitionScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "Landroidx/constraintlayout/compose/Transition;", "Transition", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroidx/constraintlayout/compose/Transition;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransitionScopeKt {
    public static /* synthetic */ androidx.constraintlayout.compose.Transition Transition$default(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START;
        }
        if ((i & 2) != 0) {
            str2 = "end";
        }
        return Transition(str, str2, function1);
    }

    public static final androidx.constraintlayout.compose.Transition Transition(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1<? super androidx.constraintlayout.compose.TransitionScope, kotlin.Unit> function1) {
        androidx.constraintlayout.compose.TransitionScope transitionScope = new androidx.constraintlayout.compose.TransitionScope(str, str2);
        function1.invoke(transitionScope);
        return new androidx.constraintlayout.compose.TransitionImpl(transitionScope.getObject$constraintlayout_compose_release());
    }
}
