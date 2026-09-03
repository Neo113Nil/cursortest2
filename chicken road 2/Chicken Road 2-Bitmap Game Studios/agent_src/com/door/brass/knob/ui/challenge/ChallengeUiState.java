package com.door.brass.knob.ui.challenge;

import defpackage.j8;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/ui/challenge/ChallengeUiState;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ChallengeUiState {
    public final Long b41X89IqSbKt;
    public final boolean gmXBnHsR2YSm;
    public final List hRNgd2zGCE5kj;
    public final String oyjLVtGms9eZwJ0;
    public final String ra306ClFT3HT;
    public final List yzPsTade5rL7D3;

    public ChallengeUiState(List list, List list2, String str, String str2, Long l, boolean z) {
        list.getClass();
        list2.getClass();
        this.yzPsTade5rL7D3 = list;
        this.hRNgd2zGCE5kj = list2;
        this.ra306ClFT3HT = str;
        this.oyjLVtGms9eZwJ0 = str2;
        this.b41X89IqSbKt = l;
        this.gmXBnHsR2YSm = z;
    }

    public static ChallengeUiState yzPsTade5rL7D3(ChallengeUiState challengeUiState, List list, List list2, String str, String str2, Long l, boolean z, int i) {
        if ((i & 1) != 0) {
            list = challengeUiState.yzPsTade5rL7D3;
        }
        List list3 = list;
        if ((i & 2) != 0) {
            list2 = challengeUiState.hRNgd2zGCE5kj;
        }
        List list4 = list2;
        if ((i & 4) != 0) {
            str = challengeUiState.ra306ClFT3HT;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = challengeUiState.oyjLVtGms9eZwJ0;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            l = challengeUiState.b41X89IqSbKt;
        }
        Long l2 = l;
        if ((i & 32) != 0) {
            z = challengeUiState.gmXBnHsR2YSm;
        }
        challengeUiState.getClass();
        challengeUiState.getClass();
        challengeUiState.getClass();
        list3.getClass();
        list4.getClass();
        str3.getClass();
        return new ChallengeUiState(list3, list4, str3, str4, l2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeUiState)) {
            return false;
        }
        ChallengeUiState challengeUiState = (ChallengeUiState) obj;
        return Intrinsics.yzPsTade5rL7D3(this.yzPsTade5rL7D3, challengeUiState.yzPsTade5rL7D3) && Intrinsics.yzPsTade5rL7D3(this.hRNgd2zGCE5kj, challengeUiState.hRNgd2zGCE5kj) && this.ra306ClFT3HT.equals(challengeUiState.ra306ClFT3HT) && Intrinsics.yzPsTade5rL7D3(this.oyjLVtGms9eZwJ0, challengeUiState.oyjLVtGms9eZwJ0) && Intrinsics.yzPsTade5rL7D3(this.b41X89IqSbKt, challengeUiState.b41X89IqSbKt) && this.gmXBnHsR2YSm == challengeUiState.gmXBnHsR2YSm;
    }

    public final int hashCode() {
        int hRNgd2zGCE5kj = j8.hRNgd2zGCE5kj(this.ra306ClFT3HT, (this.hRNgd2zGCE5kj.hashCode() + (this.yzPsTade5rL7D3.hashCode() * 31)) * 31, 31);
        String str = this.oyjLVtGms9eZwJ0;
        int hashCode = (hRNgd2zGCE5kj + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.b41X89IqSbKt;
        return j8.yzPsTade5rL7D3(j8.yzPsTade5rL7D3((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.gmXBnHsR2YSm), 31, false);
    }

    public final String toString() {
        return "ChallengeUiState(challenges=" + this.yzPsTade5rL7D3 + ", filteredChallenges=" + this.hRNgd2zGCE5kj + ", selectedStatus=" + this.ra306ClFT3HT + ", selectedCategory=" + this.oyjLVtGms9eZwJ0 + ", selectedChallengeId=" + this.b41X89IqSbKt + ", isChallengeActionInProgress=" + this.gmXBnHsR2YSm + ", isLoading=false, error=null)";
    }
}
