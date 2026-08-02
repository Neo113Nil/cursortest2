package org.betup.ui.dialogs.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.betup.utils.SnackbarHelper;

/* compiled from: ChangeDisplayNameScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ChangeDisplayNameScreenKt$ChangeDisplayNameScreen$1$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $errorMessage$delegate;
    final /* synthetic */ MutableState<String> $nameText$delegate;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function1<String, Unit> $onSave;
    final /* synthetic */ Function1<CharSequence, Unit> $onShowMessage;

    /* JADX WARN: Multi-variable type inference failed */
    ChangeDisplayNameScreenKt$ChangeDisplayNameScreen$1$2(Context context, Function1<? super String, Unit> function1, Function0<Unit> function0, Function1<? super CharSequence, Unit> function12, MutableState<String> mutableState, MutableState<String> mutableState2) {
        this.$context = context;
        this.$onSave = function1;
        this.$onDismiss = function0;
        this.$onShowMessage = function12;
        this.$nameText$delegate = mutableState;
        this.$errorMessage$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v13 ??, still in use, count: 1, list:
          (r2v13 ?? I:java.lang.Object) from 0x008c: INVOKE (r28v0 ?? I:androidx.compose.runtime.Composer), (r2v13 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:181)
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
          (r2v13 ?? I:java.lang.Object) from 0x008c: INVOKE (r28v0 ?? I:androidx.compose.runtime.Composer), (r2v13 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:181)
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
    public static final Unit invoke$lambda$2$lambda$1(Function1 function1, Function0 function0, MutableState mutableState, Context context, MutableState mutableState2, Function1 function12) {
        String ChangeDisplayNameScreen$lambda$1;
        boolean ChangeDisplayNameScreen$validateName;
        String ChangeDisplayNameScreen$lambda$4;
        String ChangeDisplayNameScreen$lambda$12;
        ChangeDisplayNameScreen$lambda$1 = ChangeDisplayNameScreenKt.ChangeDisplayNameScreen$lambda$1(mutableState);
        ChangeDisplayNameScreen$validateName = ChangeDisplayNameScreenKt.ChangeDisplayNameScreen$validateName(context, mutableState2, ChangeDisplayNameScreen$lambda$1);
        if (ChangeDisplayNameScreen$validateName) {
            ChangeDisplayNameScreen$lambda$12 = ChangeDisplayNameScreenKt.ChangeDisplayNameScreen$lambda$1(mutableState);
            function1.invoke(ChangeDisplayNameScreen$lambda$12);
            function0.invoke();
        } else {
            ChangeDisplayNameScreen$lambda$4 = ChangeDisplayNameScreenKt.ChangeDisplayNameScreen$lambda$4(mutableState2);
            if (ChangeDisplayNameScreen$lambda$4 != null) {
                if (function12 != null) {
                    function12.invoke(ChangeDisplayNameScreen$lambda$4);
                } else {
                    SnackbarHelper.showShort(context, ChangeDisplayNameScreen$lambda$4);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
