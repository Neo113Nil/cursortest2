package com.door.brass.knob.ui.menu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class MenuScreenKt$MenuScreen$1$1$2$3$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        Object value;
        MutableStateFlow mutableStateFlow = ((MenuViewModel) this.b41X89IqSbKt).ra306ClFT3HT;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.i7xAcZoXXiIt(value, MenuUiState.yzPsTade5rL7D3((MenuUiState) value, null, null, null, null, null, true, 223)));
        return Unit.yzPsTade5rL7D3;
    }
}
