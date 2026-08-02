package org.betup.ui.drawer.compose;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.model.remote.entity.user.ShortUserProfileModel;
import org.betup.services.push.PushStorageProvider;
import org.betup.services.user.UserService;

/* compiled from: DrawerContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.drawer.compose.DrawerContentKt$DrawerContent$2$1", f = "DrawerContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class DrawerContentKt$DrawerContent$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PushStorageProvider $pushStorageProvider;
    final /* synthetic */ UserService $userService;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DrawerContentKt$DrawerContent$2$1(PushStorageProvider pushStorageProvider, UserService userService, Continuation<? super DrawerContentKt$DrawerContent$2$1> continuation) {
        super(2, continuation);
        this.$pushStorageProvider = pushStorageProvider;
        this.$userService = userService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DrawerContentKt$DrawerContent$2$1(this.$pushStorageProvider, this.$userService, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DrawerContentKt$DrawerContent$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PushStorageProvider pushStorageProvider = this.$pushStorageProvider;
        if (pushStorageProvider != null) {
            ShortUserProfileModel shortProfile = this.$userService.getShortProfile();
            BaseUserModel userModel = shortProfile != null ? shortProfile.getUserModel() : null;
            if (userModel != null) {
                pushStorageProvider.refreshEventCount(userModel.getId());
            }
        }
        return Unit.INSTANCE;
    }
}
