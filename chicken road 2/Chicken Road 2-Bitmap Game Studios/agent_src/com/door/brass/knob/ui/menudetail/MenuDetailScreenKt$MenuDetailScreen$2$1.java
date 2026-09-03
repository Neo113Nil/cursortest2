package com.door.brass.knob.ui.menudetail;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.ui.menudetail.MenuDetailScreenKt$MenuDetailScreen$2$1", f = "MenuDetailScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MenuDetailScreenKt$MenuDetailScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Function1 FsuUJlzzWhYnMlD;
    public final /* synthetic */ MenuDetailViewModel UEutaskTsxaI;
    public final /* synthetic */ MutableState Uo5pffGf8LUU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuDetailScreenKt$MenuDetailScreen$2$1(MutableState mutableState, Function1 function1, MenuDetailViewModel menuDetailViewModel, Continuation continuation) {
        super(2, continuation);
        this.Uo5pffGf8LUU = mutableState;
        this.FsuUJlzzWhYnMlD = function1;
        this.UEutaskTsxaI = menuDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
        ResultKt.hRNgd2zGCE5kj(obj);
        Long l = ((MenuDetailUiState) this.Uo5pffGf8LUU.getOyjLVtGms9eZwJ0()).b41X89IqSbKt;
        if (l != null) {
            this.FsuUJlzzWhYnMlD.uypNJrpDByoB(new Long(l.longValue()));
            MutableStateFlow mutableStateFlow = this.UEutaskTsxaI.gmXBnHsR2YSm;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.i7xAcZoXXiIt(value, MenuDetailUiState.yzPsTade5rL7D3((MenuDetailUiState) value, null, null, null, null, 127)));
        }
        return Unit.yzPsTade5rL7D3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation FTJ2XS7ULgY8(Object obj, Continuation continuation) {
        return new MenuDetailScreenKt$MenuDetailScreen$2$1(this.Uo5pffGf8LUU, this.FsuUJlzzWhYnMlD, this.UEutaskTsxaI, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        MenuDetailScreenKt$MenuDetailScreen$2$1 menuDetailScreenKt$MenuDetailScreen$2$1 = (MenuDetailScreenKt$MenuDetailScreen$2$1) FTJ2XS7ULgY8((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.yzPsTade5rL7D3;
        menuDetailScreenKt$MenuDetailScreen$2$1.AGl7HBCQ8xrHABq(unit);
        return unit;
    }
}
