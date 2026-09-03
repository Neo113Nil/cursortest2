package com.door.brass.knob.ui.menudetail;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.ui.menudetail.MenuDetailScreenKt$MenuDetailScreen$1$1", f = "MenuDetailScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MenuDetailScreenKt$MenuDetailScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Function0 FsuUJlzzWhYnMlD;
    public final /* synthetic */ MutableState UEutaskTsxaI;
    public final /* synthetic */ MenuDetailViewModel Uo5pffGf8LUU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuDetailScreenKt$MenuDetailScreen$1$1(MenuDetailViewModel menuDetailViewModel, Function0 function0, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.Uo5pffGf8LUU = menuDetailViewModel;
        this.FsuUJlzzWhYnMlD = function0;
        this.UEutaskTsxaI = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
        ResultKt.hRNgd2zGCE5kj(obj);
        if (((MenuDetailUiState) this.UEutaskTsxaI.getOyjLVtGms9eZwJ0()).oyjLVtGms9eZwJ0) {
            MutableStateFlow mutableStateFlow = this.Uo5pffGf8LUU.gmXBnHsR2YSm;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.i7xAcZoXXiIt(value, MenuDetailUiState.yzPsTade5rL7D3((MenuDetailUiState) value, null, null, null, null, 191)));
            this.FsuUJlzzWhYnMlD.hRNgd2zGCE5kj();
        }
        return Unit.yzPsTade5rL7D3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation FTJ2XS7ULgY8(Object obj, Continuation continuation) {
        return new MenuDetailScreenKt$MenuDetailScreen$1$1(this.Uo5pffGf8LUU, this.FsuUJlzzWhYnMlD, this.UEutaskTsxaI, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        MenuDetailScreenKt$MenuDetailScreen$1$1 menuDetailScreenKt$MenuDetailScreen$1$1 = (MenuDetailScreenKt$MenuDetailScreen$1$1) FTJ2XS7ULgY8((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.yzPsTade5rL7D3;
        menuDetailScreenKt$MenuDetailScreen$1$1.AGl7HBCQ8xrHABq(unit);
        return unit;
    }
}
