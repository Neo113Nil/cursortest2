package com.door.brass.knob.ui.tips;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class TipsScreenKt$TipsScreen$1$1$1$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        Object value;
        TipsUiState yzPsTade5rL7D3;
        String str = (String) obj;
        str.getClass();
        TipsViewModel tipsViewModel = (TipsViewModel) this.b41X89IqSbKt;
        tipsViewModel.getClass();
        MutableStateFlow mutableStateFlow = tipsViewModel.ra306ClFT3HT;
        do {
            value = mutableStateFlow.getValue();
            yzPsTade5rL7D3 = TipsUiState.yzPsTade5rL7D3((TipsUiState) value, null, str, null, 29);
        } while (!mutableStateFlow.i7xAcZoXXiIt(value, TipsUiState.yzPsTade5rL7D3(yzPsTade5rL7D3, TipsViewModel.gmXBnHsR2YSm(yzPsTade5rL7D3, tipsViewModel.b41X89IqSbKt), null, null, 30)));
        return Unit.yzPsTade5rL7D3;
    }
}
