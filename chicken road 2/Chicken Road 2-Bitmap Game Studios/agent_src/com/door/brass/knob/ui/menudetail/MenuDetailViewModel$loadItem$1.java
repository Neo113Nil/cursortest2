package com.door.brass.knob.ui.menudetail;

import com.door.brass.knob.data.db.entity.MenuItemEntity;
import com.door.brass.knob.data.repository.ChallengeProgressTracker;
import com.door.brass.knob.data.repository.MenuRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.ui.menudetail.MenuDetailViewModel$loadItem$1", f = "MenuDetailViewModel.kt", l = {42, 44}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MenuDetailViewModel$loadItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int FsuUJlzzWhYnMlD;
    public final /* synthetic */ MenuDetailViewModel UEutaskTsxaI;
    public MenuItemEntity Uo5pffGf8LUU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuDetailViewModel$loadItem$1(MenuDetailViewModel menuDetailViewModel, Continuation continuation) {
        super(2, continuation);
        this.UEutaskTsxaI = menuDetailViewModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        if (r12 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        MenuItemEntity menuItemEntity;
        MenuItemEntity menuItemEntity2;
        MutableStateFlow mutableStateFlow;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
        int i = this.FsuUJlzzWhYnMlD;
        MenuDetailViewModel menuDetailViewModel = this.UEutaskTsxaI;
        if (i == 0) {
            ResultKt.hRNgd2zGCE5kj(obj);
            MenuRepository menuRepository = menuDetailViewModel.hRNgd2zGCE5kj;
            long j = menuDetailViewModel.b41X89IqSbKt;
            this.FsuUJlzzWhYnMlD = 1;
            obj = menuRepository.yzPsTade5rL7D3.ra306ClFT3HT(j, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    defpackage.yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                menuItemEntity2 = this.Uo5pffGf8LUU;
                ResultKt.hRNgd2zGCE5kj(obj);
                menuItemEntity = menuItemEntity2;
                mutableStateFlow = menuDetailViewModel.gmXBnHsR2YSm;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.i7xAcZoXXiIt(value, MenuDetailUiState.yzPsTade5rL7D3((MenuDetailUiState) value, menuItemEntity, null, null, null, 254)));
                return Unit.yzPsTade5rL7D3;
            }
            ResultKt.hRNgd2zGCE5kj(obj);
        }
        MenuItemEntity menuItemEntity3 = (MenuItemEntity) obj;
        if (menuItemEntity3 == null) {
            menuItemEntity = menuItemEntity3;
            mutableStateFlow = menuDetailViewModel.gmXBnHsR2YSm;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.i7xAcZoXXiIt(value, MenuDetailUiState.yzPsTade5rL7D3((MenuDetailUiState) value, menuItemEntity, null, null, null, 254)));
            return Unit.yzPsTade5rL7D3;
        }
        ChallengeProgressTracker challengeProgressTracker = menuDetailViewModel.oyjLVtGms9eZwJ0;
        this.Uo5pffGf8LUU = menuItemEntity3;
        this.FsuUJlzzWhYnMlD = 2;
        if (challengeProgressTracker.yzPsTade5rL7D3(menuItemEntity3, this) != coroutineSingletons) {
            menuItemEntity2 = menuItemEntity3;
            menuItemEntity = menuItemEntity2;
            mutableStateFlow = menuDetailViewModel.gmXBnHsR2YSm;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.i7xAcZoXXiIt(value, MenuDetailUiState.yzPsTade5rL7D3((MenuDetailUiState) value, menuItemEntity, null, null, null, 254)));
            return Unit.yzPsTade5rL7D3;
        }
        return coroutineSingletons;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation FTJ2XS7ULgY8(Object obj, Continuation continuation) {
        return new MenuDetailViewModel$loadItem$1(this.UEutaskTsxaI, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        return ((MenuDetailViewModel$loadItem$1) FTJ2XS7ULgY8((CoroutineScope) obj, (Continuation) obj2)).AGl7HBCQ8xrHABq(Unit.yzPsTade5rL7D3);
    }
}
