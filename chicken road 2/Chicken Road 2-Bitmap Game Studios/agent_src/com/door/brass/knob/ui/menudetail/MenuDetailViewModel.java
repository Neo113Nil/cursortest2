package com.door.brass.knob.ui.menudetail;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.door.brass.knob.data.repository.ChallengeProgressTracker;
import com.door.brass.knob.data.repository.MenuRepository;
import com.door.brass.knob.data.repository.TasteMarkRepository;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/ui/menudetail/MenuDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MenuDetailViewModel extends ViewModel {
    public final long b41X89IqSbKt;
    public final MutableStateFlow gmXBnHsR2YSm;
    public final MenuRepository hRNgd2zGCE5kj;
    public final StateFlow i7xAcZoXXiIt;
    public final ChallengeProgressTracker oyjLVtGms9eZwJ0;
    public final TasteMarkRepository ra306ClFT3HT;

    public MenuDetailViewModel(MenuRepository menuRepository, TasteMarkRepository tasteMarkRepository, ChallengeProgressTracker challengeProgressTracker, SavedStateHandle savedStateHandle) {
        menuRepository.getClass();
        tasteMarkRepository.getClass();
        challengeProgressTracker.getClass();
        savedStateHandle.getClass();
        this.hRNgd2zGCE5kj = menuRepository;
        this.ra306ClFT3HT = tasteMarkRepository;
        this.oyjLVtGms9eZwJ0 = challengeProgressTracker;
        Object yzPsTade5rL7D3 = savedStateHandle.yzPsTade5rL7D3("id");
        if (yzPsTade5rL7D3 == null) {
            defpackage.yzPsTade5rL7D3.yRx9jbDCTnXb3("Menu item id is required");
            throw null;
        }
        this.b41X89IqSbKt = ((Number) yzPsTade5rL7D3).longValue();
        MutableStateFlow yzPsTade5rL7D32 = StateFlowKt.yzPsTade5rL7D3(new MenuDetailUiState(null, EmptyList.oyjLVtGms9eZwJ0, null, false, null));
        this.gmXBnHsR2YSm = yzPsTade5rL7D32;
        this.i7xAcZoXXiIt = FlowKt.ra306ClFT3HT(yzPsTade5rL7D32);
        CloseableCoroutineScope yzPsTade5rL7D33 = ViewModelKt.yzPsTade5rL7D3(this);
        DefaultScheduler defaultScheduler = Dispatchers.yzPsTade5rL7D3;
        BuildersKt.ra306ClFT3HT(yzPsTade5rL7D33, DefaultIoScheduler.gmXBnHsR2YSm, null, new MenuDetailViewModel$loadItem$1(this, null), 2);
        BuildersKt.ra306ClFT3HT(ViewModelKt.yzPsTade5rL7D3(this), null, null, new MenuDetailViewModel$loadTasteMarks$1(this, null), 3);
    }
}
