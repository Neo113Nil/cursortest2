package org.betup.ui.common.compose;

import android.view.View;
import androidx.compose.runtime.MutableState;
import com.vanniktech.emoji.EmojiEditText;
import com.vanniktech.emoji.EmojiPopup;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MessagingComponents.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.common.compose.MessagingComponentsKt$MessageInputBar$2$1", f = "MessagingComponents.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class MessagingComponentsKt$MessageInputBar$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<EmojiEditText> $emojiEditText$delegate;
    final /* synthetic */ MutableState<EmojiPopup> $emojiPopup$delegate;
    final /* synthetic */ View $rootView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessagingComponentsKt$MessageInputBar$2$1(MutableState<EmojiPopup> mutableState, MutableState<EmojiEditText> mutableState2, View view, Continuation<? super MessagingComponentsKt$MessageInputBar$2$1> continuation) {
        super(2, continuation);
        this.$emojiPopup$delegate = mutableState;
        this.$emojiEditText$delegate = mutableState2;
        this.$rootView = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessagingComponentsKt$MessageInputBar$2$1(this.$emojiPopup$delegate, this.$emojiEditText$delegate, this.$rootView, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessagingComponentsKt$MessageInputBar$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EmojiPopup MessageInputBar$lambda$14;
        EmojiEditText MessageInputBar$lambda$11;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            MessageInputBar$lambda$14 = MessagingComponentsKt.MessageInputBar$lambda$14(this.$emojiPopup$delegate);
            if (MessageInputBar$lambda$14 != null) {
                MessageInputBar$lambda$14.dismiss();
            }
            MutableState<EmojiPopup> mutableState = this.$emojiPopup$delegate;
            MessageInputBar$lambda$11 = MessagingComponentsKt.MessageInputBar$lambda$11(this.$emojiEditText$delegate);
            mutableState.setValue(MessageInputBar$lambda$11 != null ? EmojiPopup.Builder.fromRootView(this.$rootView).build(MessageInputBar$lambda$11) : null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
