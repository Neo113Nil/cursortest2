package org.betup.ui.dialogs.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: VisualEffectsScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VisualEffectsScreenKt$AppExperienceSettingsScreen$1$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<Boolean> $hapticFeedbackEnabled$delegate;
    final /* synthetic */ MutableState<Boolean> $inAppMessagesEnabled$delegate;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function1<AppExperienceSettingsState, Unit> $onSave;
    final /* synthetic */ MutableState<Boolean> $visualEffectsEnabled$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    VisualEffectsScreenKt$AppExperienceSettingsScreen$1$2(Function1<? super AppExperienceSettingsState, Unit> function1, Function0<Unit> function0, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3) {
        this.$onSave = function1;
        this.$onDismiss = function0;
        this.$visualEffectsEnabled$delegate = mutableState;
        this.$hapticFeedbackEnabled$delegate = mutableState2;
        this.$inAppMessagesEnabled$delegate = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v11 ??, still in use, count: 1, list:
          (r2v11 ?? I:java.lang.Object) from 0x007c: INVOKE (r28v0 ?? I:androidx.compose.runtime.Composer), (r2v11 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:198)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void invoke(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v11 ??, still in use, count: 1, list:
          (r2v11 ?? I:java.lang.Object) from 0x007c: INVOKE (r28v0 ?? I:androidx.compose.runtime.Composer), (r2v11 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:198)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r28v0 ??
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, Function0 function0, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        boolean AppExperienceSettingsScreen$lambda$1;
        boolean AppExperienceSettingsScreen$lambda$4;
        boolean AppExperienceSettingsScreen$lambda$7;
        AppExperienceSettingsScreen$lambda$1 = VisualEffectsScreenKt.AppExperienceSettingsScreen$lambda$1(mutableState);
        AppExperienceSettingsScreen$lambda$4 = VisualEffectsScreenKt.AppExperienceSettingsScreen$lambda$4(mutableState2);
        AppExperienceSettingsScreen$lambda$7 = VisualEffectsScreenKt.AppExperienceSettingsScreen$lambda$7(mutableState3);
        function1.invoke(new AppExperienceSettingsState(AppExperienceSettingsScreen$lambda$1, AppExperienceSettingsScreen$lambda$4, AppExperienceSettingsScreen$lambda$7));
        function0.invoke();
        return Unit.INSTANCE;
    }
}
