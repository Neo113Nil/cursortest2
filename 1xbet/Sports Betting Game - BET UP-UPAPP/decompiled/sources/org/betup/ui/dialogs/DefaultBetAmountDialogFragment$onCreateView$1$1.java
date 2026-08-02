package org.betup.ui.dialogs;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.betup.utils.FormatHelper;
import org.betup.utils.SharedPrefs;

/* compiled from: DefaultBetAmountDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DefaultBetAmountDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ DefaultBetAmountDialogFragment this$0;

    DefaultBetAmountDialogFragment$onCreateView$1$1(DefaultBetAmountDialogFragment defaultBetAmountDialogFragment) {
        this.this$0 = defaultBetAmountDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    private static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final long invoke$lambda$4(MutableState<Long> mutableState) {
        return mutableState.getValue().longValue();
    }

    private static final void invoke$lambda$5(MutableState<Long> mutableState, long j) {
        mutableState.setValue(Long.valueOf(j));
    }

    private static final String invoke$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v8 ??, still in use, count: 1, list:
          (r3v8 ?? I:java.lang.Object) from 0x01ab: INVOKE (r24v0 ?? I:androidx.compose.runtime.Composer), (r3v8 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:501)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v8 ??, still in use, count: 1, list:
          (r3v8 ?? I:java.lang.Object) from 0x01ab: INVOKE (r24v0 ?? I:androidx.compose.runtime.Composer), (r3v8 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:501)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r24v0 ??
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
    public static final Unit invoke$lambda$10$lambda$9(MutableState mutableState) {
        invoke$lambda$2(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11(MutableState mutableState) {
        invoke$lambda$2(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13(MutableState mutableState, long j) {
        invoke$lambda$5(mutableState, RangesKt.coerceAtLeast(j, 100L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$16(MutableState mutableState, MutableState mutableState2, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        mutableState.setValue(value);
        String str = value;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        Long longOrNull = StringsKt.toLongOrNull(sb.toString());
        if (longOrNull != null && longOrNull.longValue() > 0) {
            invoke$lambda$5(mutableState2, longOrNull.longValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$18(MutableState mutableState, MutableState mutableState2, long j) {
        invoke$lambda$5(mutableState, j);
        mutableState2.setValue(FormatHelper.getShopBetcoinsFormated(j));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$21$lambda$20(DefaultBetAmountDialogFragment defaultBetAmountDialogFragment) {
        defaultBetAmountDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$24$lambda$23(Context context, DefaultBetAmountDialogFragment defaultBetAmountDialogFragment, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        long coerceAtLeast;
        Function0 function0;
        SharedPrefs.setIsSelectedDefaultsBetsAmounts(context, invoke$lambda$1(mutableState));
        String invoke$lambda$7 = invoke$lambda$7(mutableState2);
        Intrinsics.checkNotNullExpressionValue(invoke$lambda$7, "invoke$lambda$7(...)");
        String str = invoke$lambda$7;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        Long longOrNull = StringsKt.toLongOrNull(sb.toString());
        if (longOrNull != null) {
            coerceAtLeast = RangesKt.coerceAtLeast(longOrNull.longValue(), 100L);
        } else {
            coerceAtLeast = RangesKt.coerceAtLeast(invoke$lambda$4(mutableState3), 100L);
        }
        SharedPrefs.saveCustomBetAmount(context, coerceAtLeast);
        function0 = defaultBetAmountDialogFragment.onSavedListener;
        if (function0 != null) {
            function0.invoke();
        }
        defaultBetAmountDialogFragment.dismiss();
        return Unit.INSTANCE;
    }
}
