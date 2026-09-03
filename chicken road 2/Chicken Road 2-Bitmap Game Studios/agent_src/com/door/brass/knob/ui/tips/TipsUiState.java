package com.door.brass.knob.ui.tips;

import defpackage.j8;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/ui/tips/TipsUiState;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TipsUiState {
    public final String hRNgd2zGCE5kj;
    public final Long ra306ClFT3HT;
    public final List yzPsTade5rL7D3;

    public TipsUiState(List list, String str, Long l) {
        list.getClass();
        this.yzPsTade5rL7D3 = list;
        this.hRNgd2zGCE5kj = str;
        this.ra306ClFT3HT = l;
    }

    public static TipsUiState yzPsTade5rL7D3(TipsUiState tipsUiState, List list, String str, Long l, int i) {
        if ((i & 1) != 0) {
            list = tipsUiState.yzPsTade5rL7D3;
        }
        if ((i & 2) != 0) {
            str = tipsUiState.hRNgd2zGCE5kj;
        }
        if ((i & 4) != 0) {
            l = tipsUiState.ra306ClFT3HT;
        }
        tipsUiState.getClass();
        tipsUiState.getClass();
        tipsUiState.getClass();
        list.getClass();
        str.getClass();
        return new TipsUiState(list, str, l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TipsUiState)) {
            return false;
        }
        TipsUiState tipsUiState = (TipsUiState) obj;
        return Intrinsics.yzPsTade5rL7D3(this.yzPsTade5rL7D3, tipsUiState.yzPsTade5rL7D3) && this.hRNgd2zGCE5kj.equals(tipsUiState.hRNgd2zGCE5kj) && Intrinsics.yzPsTade5rL7D3(this.ra306ClFT3HT, tipsUiState.ra306ClFT3HT);
    }

    public final int hashCode() {
        int hRNgd2zGCE5kj = j8.hRNgd2zGCE5kj(this.hRNgd2zGCE5kj, this.yzPsTade5rL7D3.hashCode() * 31, 31);
        Long l = this.ra306ClFT3HT;
        return j8.yzPsTade5rL7D3((hRNgd2zGCE5kj + (l == null ? 0 : l.hashCode())) * 31, 31, false);
    }

    public final String toString() {
        return "TipsUiState(tips=" + this.yzPsTade5rL7D3 + ", searchQuery=" + this.hRNgd2zGCE5kj + ", selectedTipId=" + this.ra306ClFT3HT + ", isLoading=false, error=null)";
    }
}
