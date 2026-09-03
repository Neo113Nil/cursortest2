package com.door.brass.knob.ui.challenge;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.door.brass.knob.data.db.entity.ChallengeEntity;
import com.door.brass.knob.data.repository.ChallengeRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/ui/challenge/ChallengeViewModel;", "Landroidx/lifecycle/ViewModel;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChallengeViewModel extends ViewModel {
    public final ChallengeRepository hRNgd2zGCE5kj;
    public final StateFlow oyjLVtGms9eZwJ0;
    public final MutableStateFlow ra306ClFT3HT;

    public ChallengeViewModel(ChallengeRepository challengeRepository) {
        challengeRepository.getClass();
        this.hRNgd2zGCE5kj = challengeRepository;
        EmptyList emptyList = EmptyList.oyjLVtGms9eZwJ0;
        MutableStateFlow yzPsTade5rL7D3 = StateFlowKt.yzPsTade5rL7D3(new ChallengeUiState(emptyList, emptyList, "All", null, null, false));
        this.ra306ClFT3HT = yzPsTade5rL7D3;
        this.oyjLVtGms9eZwJ0 = FlowKt.ra306ClFT3HT(yzPsTade5rL7D3);
        BuildersKt.ra306ClFT3HT(ViewModelKt.yzPsTade5rL7D3(this), null, null, new ChallengeViewModel$loadChallenges$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List gmXBnHsR2YSm(ChallengeUiState challengeUiState, List list) {
        ArrayList arrayList;
        String str;
        String str2 = challengeUiState.ra306ClFT3HT;
        if (!str2.equals("In Progress")) {
            if (str2.equals("Completed")) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((ChallengeEntity) obj).i7xAcZoXXiIt) {
                        arrayList.add(obj);
                    }
                }
            }
            str = challengeUiState.oyjLVtGms9eZwJ0;
            if (str != null) {
                return list;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (Intrinsics.yzPsTade5rL7D3(((ChallengeEntity) obj2).oyjLVtGms9eZwJ0, str)) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }
        arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (!((ChallengeEntity) obj3).i7xAcZoXXiIt) {
                arrayList.add(obj3);
            }
        }
        list = arrayList;
        str = challengeUiState.oyjLVtGms9eZwJ0;
        if (str != null) {
        }
    }
}
