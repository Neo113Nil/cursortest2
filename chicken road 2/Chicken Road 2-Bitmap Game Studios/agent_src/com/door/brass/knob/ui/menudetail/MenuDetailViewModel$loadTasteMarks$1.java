package com.door.brass.knob.ui.menudetail;

import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import com.door.brass.knob.data.repository.TasteMarkRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.ui.menudetail.MenuDetailViewModel$loadTasteMarks$1", f = "MenuDetailViewModel.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MenuDetailViewModel$loadTasteMarks$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MenuDetailViewModel FsuUJlzzWhYnMlD;
    public int Uo5pffGf8LUU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuDetailViewModel$loadTasteMarks$1(MenuDetailViewModel menuDetailViewModel, Continuation continuation) {
        super(2, continuation);
        this.FsuUJlzzWhYnMlD = menuDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
        int i = this.Uo5pffGf8LUU;
        if (i == 0) {
            ResultKt.hRNgd2zGCE5kj(obj);
            final MenuDetailViewModel menuDetailViewModel = this.FsuUJlzzWhYnMlD;
            TasteMarkRepository tasteMarkRepository = menuDetailViewModel.ra306ClFT3HT;
            FlowUtil$createFlow$$inlined$map$1 yzPsTade5rL7D3 = tasteMarkRepository.yzPsTade5rL7D3.yzPsTade5rL7D3(menuDetailViewModel.b41X89IqSbKt);
            FlowCollector flowCollector = new FlowCollector() { // from class: com.door.brass.knob.ui.menudetail.MenuDetailViewModel$loadTasteMarks$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object ra306ClFT3HT(Object obj2, Continuation continuation) {
                    Object value;
                    List list = (List) obj2;
                    MutableStateFlow mutableStateFlow = MenuDetailViewModel.this.gmXBnHsR2YSm;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.i7xAcZoXXiIt(value, MenuDetailUiState.yzPsTade5rL7D3((MenuDetailUiState) value, null, list, null, null, 253)));
                    return Unit.yzPsTade5rL7D3;
                }
            };
            this.Uo5pffGf8LUU = 1;
            if (yzPsTade5rL7D3.yzPsTade5rL7D3(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                defpackage.yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.hRNgd2zGCE5kj(obj);
        }
        return Unit.yzPsTade5rL7D3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation FTJ2XS7ULgY8(Object obj, Continuation continuation) {
        return new MenuDetailViewModel$loadTasteMarks$1(this.FsuUJlzzWhYnMlD, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        return ((MenuDetailViewModel$loadTasteMarks$1) FTJ2XS7ULgY8((CoroutineScope) obj, (Continuation) obj2)).AGl7HBCQ8xrHABq(Unit.yzPsTade5rL7D3);
    }
}
