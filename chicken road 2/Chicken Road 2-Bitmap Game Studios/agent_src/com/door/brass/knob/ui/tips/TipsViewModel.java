package com.door.brass.knob.ui.tips;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.door.brass.knob.data.db.entity.TipEntity;
import com.door.brass.knob.data.repository.TipRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/ui/tips/TipsViewModel;", "Landroidx/lifecycle/ViewModel;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TipsViewModel extends ViewModel {
    public List b41X89IqSbKt;
    public final TipRepository hRNgd2zGCE5kj;
    public final StateFlow oyjLVtGms9eZwJ0;
    public final MutableStateFlow ra306ClFT3HT;

    public TipsViewModel(TipRepository tipRepository) {
        tipRepository.getClass();
        this.hRNgd2zGCE5kj = tipRepository;
        EmptyList emptyList = EmptyList.oyjLVtGms9eZwJ0;
        MutableStateFlow yzPsTade5rL7D3 = StateFlowKt.yzPsTade5rL7D3(new TipsUiState(emptyList, "", null));
        this.ra306ClFT3HT = yzPsTade5rL7D3;
        this.oyjLVtGms9eZwJ0 = FlowKt.ra306ClFT3HT(yzPsTade5rL7D3);
        this.b41X89IqSbKt = emptyList;
        BuildersKt.ra306ClFT3HT(ViewModelKt.yzPsTade5rL7D3(this), null, null, new TipsViewModel$loadTips$1(this, null), 3);
    }

    public static List gmXBnHsR2YSm(TipsUiState tipsUiState, List list) {
        String obj = StringsKt.vAthhQhzH5WQr3(tipsUiState.hRNgd2zGCE5kj).toString();
        if (obj.length() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            TipEntity tipEntity = (TipEntity) obj2;
            if (StringsKt.i7xAcZoXXiIt(tipEntity.hRNgd2zGCE5kj, obj, true) || StringsKt.i7xAcZoXXiIt(tipEntity.ra306ClFT3HT, obj, true)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
