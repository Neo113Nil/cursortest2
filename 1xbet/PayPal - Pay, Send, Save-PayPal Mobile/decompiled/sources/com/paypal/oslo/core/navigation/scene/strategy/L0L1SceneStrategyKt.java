package com.paypal.oslo.core.navigation.scene.strategy;

@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0089\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000b0\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\r0\tH\u0007¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018²\u0006\u0018\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\r0\tX\u008a\u0084\u0002"}, d2 = {"CompositeL0L1SceneKey", "", "rememberL0L1SceneStrategy", "Lcom/paypal/oslo/core/navigation/scene/strategy/L0L1SceneStrategy;", "topBarConfig", "Lcom/paypal/oslo/core/navigation/ui/TopBarConfig;", "bottomNavigationConfig", "Lcom/paypal/oslo/core/navigation/ui/BottomNavigationConfig;", "entryProvider", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/NavKey;", "Landroidx/navigation3/runtime/NavEntry;", "onNavigate", "", "onMoveL0BeforeL1", "Lkotlin/Function0;", "overlayProviders", "", "Lcom/paypal/oslo/core/navigation/ui/NavigationOverlayProvider;", "isL0EntryEnabled", "", "onSoftInputModeOverride", "Lcom/paypal/oslo/core/navigation/SoftInputMode;", "(Lcom/paypal/oslo/core/navigation/ui/TopBarConfig;Lcom/paypal/oslo/core/navigation/ui/BottomNavigationConfig;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/util/Set;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/paypal/oslo/core/navigation/scene/strategy/L0L1SceneStrategy;", "navigation_release", "currentOnSoftInputModeOverride"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class L0L1SceneStrategyKt {
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v6 ??, still in use, count: 1, list:
          (r12v6 ?? I:java.lang.Object) from 0x00cd: INVOKE (r24v0 ?? I:androidx.compose.runtime.Composer), (r12v6 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:181)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final com.paypal.oslo.core.navigation.scene.strategy.L0L1SceneStrategy rememberL0L1SceneStrategy(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v6 ??, still in use, count: 1, list:
          (r12v6 ?? I:java.lang.Object) from 0x00cd: INVOKE (r24v0 ?? I:androidx.compose.runtime.Composer), (r12v6 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:181)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public static /* synthetic */ kotlin.Unit $r8$lambda$EMKlz6NZSPvY8or5vvQ2yXFsgio(androidx.compose.runtime.State state, com.paypal.oslo.core.navigation.SoftInputMode softInputMode) {
        ((kotlin.jvm.functions.Function1) state.getValue()).invoke(softInputMode);
        return kotlin.Unit.INSTANCE;
    }
}
