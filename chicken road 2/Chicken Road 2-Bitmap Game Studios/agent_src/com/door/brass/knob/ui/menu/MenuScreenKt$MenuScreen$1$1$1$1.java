package com.door.brass.knob.ui.menu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class MenuScreenKt$MenuScreen$1$1$1$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        Object value;
        MenuUiState menuUiState;
        MenuUiState yzPsTade5rL7D3;
        String str = (String) obj;
        str.getClass();
        MenuViewModel menuViewModel = (MenuViewModel) this.b41X89IqSbKt;
        menuViewModel.getClass();
        MutableStateFlow mutableStateFlow = menuViewModel.ra306ClFT3HT;
        do {
            value = mutableStateFlow.getValue();
            menuUiState = (MenuUiState) value;
            yzPsTade5rL7D3 = MenuUiState.yzPsTade5rL7D3(menuUiState, null, null, str, null, null, false, 251);
        } while (!mutableStateFlow.i7xAcZoXXiIt(value, MenuUiState.yzPsTade5rL7D3(yzPsTade5rL7D3, null, menuViewModel.gmXBnHsR2YSm(yzPsTade5rL7D3, menuUiState.yzPsTade5rL7D3), null, null, null, false, 253)));
        return Unit.yzPsTade5rL7D3;
    }
}
