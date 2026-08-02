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
import kotlinx.coroutines.CoroutineScope;
import org.betup.utils.FormatHelper;

/* compiled from: OneClickBetSettingsDialogFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.OneClickBetSettingsDialogFragmentKt$OneClickSheetStyleAmountField$1$1$1", f = "OneClickBetSettingsDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class OneClickBetSettingsDialogFragmentKt$OneClickSheetStyleAmountField$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $amount;
    final /* synthetic */ MutableState<TextFieldValue> $textState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneClickBetSettingsDialogFragmentKt$OneClickSheetStyleAmountField$1$1$1(long j, MutableState<TextFieldValue> mutableState, Continuation<? super OneClickBetSettingsDialogFragmentKt$OneClickSheetStyleAmountField$1$1$1> continuation) {
        super(2, continuation);
        this.$amount = j;
        this.$textState$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneClickBetSettingsDialogFragmentKt$OneClickSheetStyleAmountField$1$1$1(this.$amount, this.$textState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OneClickBetSettingsDialogFragmentKt$OneClickSheetStyleAmountField$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TextFieldValue OneClickSheetStyleAmountField$lambda$20$lambda$14;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String shopBetcoinsFormated = FormatHelper.getShopBetcoinsFormated(this.$amount);
        OneClickSheetStyleAmountField$lambda$20$lambda$14 = OneClickBetSettingsDialogFragmentKt.OneClickSheetStyleAmountField$lambda$20$lambda$14(this.$textState$delegate);
        if (!Intrinsics.areEqual(OneClickSheetStyleAmountField$lambda$20$lambda$14.getText(), shopBetcoinsFormated)) {
            MutableState<TextFieldValue> mutableState = this.$textState$delegate;
            Intrinsics.checkNotNull(shopBetcoinsFormated);
            mutableState.setValue(new TextFieldValue(shopBetcoinsFormated, TextRangeKt.TextRange(shopBetcoinsFormated.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
        }
        return Unit.INSTANCE;
    }
}
