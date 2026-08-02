package org.betup.ui.dialogs.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.betup.utils.SnackbarHelper;

/* compiled from: ReferralCodeScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReferralCodeScreenKt$ReferralCodeScreen$1$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $codeText$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $errorMessage$delegate;
    final /* synthetic */ Function1<String, Boolean> $isValid;
    final /* synthetic */ Function1<String, Unit> $onSave;
    final /* synthetic */ Function1<CharSequence, Unit> $onShowMessage;

    /* JADX WARN: Multi-variable type inference failed */
    ReferralCodeScreenKt$ReferralCodeScreen$1$2(Context context, Function1<? super String, Boolean> function1, Function1<? super String, Unit> function12, Function1<? super CharSequence, Unit> function13, MutableState<String> mutableState, MutableState<String> mutableState2) {
        this.$context = context;
        this.$isValid = function1;
        this.$onSave = function12;
        this.$onShowMessage = function13;
        this.$codeText$delegate = mutableState;
        this.$errorMessage$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v13 ??, still in use, count: 1, list:
          (r2v13 ?? I:java.lang.Object) from 0x008c: INVOKE (r28v0 ?? I:androidx.compose.runtime.Composer), (r2v13 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:178)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v13 ??, still in use, count: 1, list:
          (r2v13 ?? I:java.lang.Object) from 0x008c: INVOKE (r28v0 ?? I:androidx.compose.runtime.Composer), (r2v13 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:178)
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
    public static final Unit invoke$lambda$2$lambda$1(Function1 function1, MutableState mutableState, Context context, Function1 function12, MutableState mutableState2, Function1 function13) {
        String ReferralCodeScreen$lambda$1;
        boolean ReferralCodeScreen$validateCode;
        String ReferralCodeScreen$lambda$4;
        String ReferralCodeScreen$lambda$12;
        ReferralCodeScreen$lambda$1 = ReferralCodeScreenKt.ReferralCodeScreen$lambda$1(mutableState);
        ReferralCodeScreen$validateCode = ReferralCodeScreenKt.ReferralCodeScreen$validateCode(context, function12, mutableState2, ReferralCodeScreen$lambda$1);
        if (ReferralCodeScreen$validateCode) {
            ReferralCodeScreen$lambda$12 = ReferralCodeScreenKt.ReferralCodeScreen$lambda$1(mutableState);
            function1.invoke(ReferralCodeScreen$lambda$12);
        } else {
            ReferralCodeScreen$lambda$4 = ReferralCodeScreenKt.ReferralCodeScreen$lambda$4(mutableState2);
            if (ReferralCodeScreen$lambda$4 != null) {
                if (function13 != null) {
                    function13.invoke(ReferralCodeScreen$lambda$4);
                } else {
                    SnackbarHelper.showShort(context, ReferralCodeScreen$lambda$4);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
