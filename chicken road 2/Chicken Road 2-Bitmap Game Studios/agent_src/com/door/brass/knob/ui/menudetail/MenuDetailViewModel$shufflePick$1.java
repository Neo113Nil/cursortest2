package com.door.brass.knob.ui.menudetail;

import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import com.door.brass.knob.data.db.entity.MenuItemEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.random.AbstractPlatformRandom;
import kotlin.random.Random;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.ui.menudetail.MenuDetailViewModel$shufflePick$1", f = "MenuDetailViewModel.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MenuDetailViewModel$shufflePick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MenuDetailViewModel FsuUJlzzWhYnMlD;
    public int Uo5pffGf8LUU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuDetailViewModel$shufflePick$1(MenuDetailViewModel menuDetailViewModel, Continuation continuation) {
        super(2, continuation);
        this.FsuUJlzzWhYnMlD = menuDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
        int i = this.Uo5pffGf8LUU;
        MenuDetailViewModel menuDetailViewModel = this.FsuUJlzzWhYnMlD;
        if (i == 0) {
            ResultKt.hRNgd2zGCE5kj(obj);
            FlowUtil$createFlow$$inlined$map$1 all = menuDetailViewModel.hRNgd2zGCE5kj.yzPsTade5rL7D3.getAll();
            this.Uo5pffGf8LUU = 1;
            obj = FlowKt.MRfxZSx8l5UG62U(all, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                defpackage.yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.hRNgd2zGCE5kj(obj);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((MenuItemEntity) obj2).yzPsTade5rL7D3 != menuDetailViewModel.b41X89IqSbKt) {
                arrayList.add(obj2);
            }
        }
        AbstractPlatformRandom abstractPlatformRandom = Random.oyjLVtGms9eZwJ0;
        MenuItemEntity menuItemEntity = (MenuItemEntity) CollectionsKt.vAthhQhzH5WQr3(arrayList);
        if (menuItemEntity == null) {
            menuItemEntity = (MenuItemEntity) CollectionsKt.vAthhQhzH5WQr3(list);
        }
        if (menuItemEntity != null) {
            MutableStateFlow mutableStateFlow = menuDetailViewModel.gmXBnHsR2YSm;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.i7xAcZoXXiIt(value, MenuDetailUiState.yzPsTade5rL7D3((MenuDetailUiState) value, null, null, null, new Long(menuItemEntity.yzPsTade5rL7D3), 127)));
        }
        return Unit.yzPsTade5rL7D3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation FTJ2XS7ULgY8(Object obj, Continuation continuation) {
        return new MenuDetailViewModel$shufflePick$1(this.FsuUJlzzWhYnMlD, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        return ((MenuDetailViewModel$shufflePick$1) FTJ2XS7ULgY8((CoroutineScope) obj, (Continuation) obj2)).AGl7HBCQ8xrHABq(Unit.yzPsTade5rL7D3);
    }
}
