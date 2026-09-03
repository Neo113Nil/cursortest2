package com.door.brass.knob.ui.splash;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.door.brass.knob.data.repository.SplashRepository;
import com.door.brass.knob.ui.splash.SplashUiState;
import kotlin.Metadata;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/ui/splash/SplashViewModel;", "Landroidx/lifecycle/ViewModel;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SplashViewModel extends ViewModel {
    public Job b41X89IqSbKt;
    public final SplashRepository hRNgd2zGCE5kj;
    public final StateFlow oyjLVtGms9eZwJ0;
    public final MutableStateFlow ra306ClFT3HT;

    public SplashViewModel(SplashRepository splashRepository) {
        splashRepository.getClass();
        this.hRNgd2zGCE5kj = splashRepository;
        MutableStateFlow yzPsTade5rL7D3 = StateFlowKt.yzPsTade5rL7D3(SplashUiState.Loading.yzPsTade5rL7D3);
        this.ra306ClFT3HT = yzPsTade5rL7D3;
        this.oyjLVtGms9eZwJ0 = FlowKt.ra306ClFT3HT(yzPsTade5rL7D3);
        gmXBnHsR2YSm(true);
    }

    public final void gmXBnHsR2YSm(boolean z) {
        Job job = this.b41X89IqSbKt;
        if (job == null || !((AbstractCoroutine) job).hRNgd2zGCE5kj()) {
            this.b41X89IqSbKt = BuildersKt.ra306ClFT3HT(ViewModelKt.yzPsTade5rL7D3(this), null, null, new SplashViewModel$prepare$1(this, z, null), 3);
        }
    }
}
