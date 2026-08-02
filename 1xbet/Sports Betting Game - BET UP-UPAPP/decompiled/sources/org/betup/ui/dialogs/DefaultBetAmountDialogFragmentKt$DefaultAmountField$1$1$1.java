package org.betup.ui.dialogs;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DefaultBetAmountDialogFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.DefaultBetAmountDialogFragmentKt$DefaultAmountField$1$1$1", f = "DefaultBetAmountDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class DefaultBetAmountDialogFragmentKt$DefaultAmountField$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $amountInput;
    final /* synthetic */ MutableState<TextFieldValue> $textState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultBetAmountDialogFragmentKt$DefaultAmountField$1$1$1(String str, MutableState<TextFieldValue> mutableState, Continuation<? super DefaultBetAmountDialogFragmentKt$DefaultAmountField$1$1$1> continuation) {
        super(2, continuation);
        this.$amountInput = str;
        this.$textState$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultBetAmountDialogFragmentKt$DefaultAmountField$1$1$1(this.$amountInput, this.$textState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultBetAmountDialogFragmentKt$DefaultAmountField$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TextFieldValue DefaultAmountField$lambda$11$lambda$5;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str = this.$amountInput;
        if (StringsKt.isBlank(str)) {
            str = "";
        }
        String str2 = str;
        DefaultAmountField$lambda$11$lambda$5 = DefaultBetAmountDialogFragmentKt.DefaultAmountField$lambda$11$lambda$5(this.$textState$delegate);
        if (!Intrinsics.areEqual(DefaultAmountField$lambda$11$lambda$5.getText(), str2)) {
            this.$textState$delegate.setValue(new TextFieldValue(str2, TextRangeKt.TextRange(str2.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
        }
        return Unit.INSTANCE;
    }
}
