package com.door.brass.knob.ui.menu;

import defpackage.j8;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/ui/menu/MenuUiState;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MenuUiState {
    public final String b41X89IqSbKt;
    public final boolean gmXBnHsR2YSm;
    public final List hRNgd2zGCE5kj;
    public final String oyjLVtGms9eZwJ0;
    public final String ra306ClFT3HT;
    public final List yzPsTade5rL7D3;

    public MenuUiState(String str, String str2, String str3, List list, List list2, boolean z) {
        list.getClass();
        list2.getClass();
        this.yzPsTade5rL7D3 = list;
        this.hRNgd2zGCE5kj = list2;
        this.ra306ClFT3HT = str;
        this.oyjLVtGms9eZwJ0 = str2;
        this.b41X89IqSbKt = str3;
        this.gmXBnHsR2YSm = z;
    }

    public static MenuUiState yzPsTade5rL7D3(MenuUiState menuUiState, List list, List list2, String str, String str2, String str3, boolean z, int i) {
        if ((i & 1) != 0) {
            list = menuUiState.yzPsTade5rL7D3;
        }
        List list3 = list;
        if ((i & 2) != 0) {
            list2 = menuUiState.hRNgd2zGCE5kj;
        }
        List list4 = list2;
        if ((i & 4) != 0) {
            str = menuUiState.ra306ClFT3HT;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = menuUiState.oyjLVtGms9eZwJ0;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = menuUiState.b41X89IqSbKt;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            z = menuUiState.gmXBnHsR2YSm;
        }
        menuUiState.getClass();
        menuUiState.getClass();
        menuUiState.getClass();
        list3.getClass();
        list4.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        return new MenuUiState(str4, str5, str6, list3, list4, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuUiState)) {
            return false;
        }
        MenuUiState menuUiState = (MenuUiState) obj;
        return Intrinsics.yzPsTade5rL7D3(this.yzPsTade5rL7D3, menuUiState.yzPsTade5rL7D3) && Intrinsics.yzPsTade5rL7D3(this.hRNgd2zGCE5kj, menuUiState.hRNgd2zGCE5kj) && this.ra306ClFT3HT.equals(menuUiState.ra306ClFT3HT) && this.oyjLVtGms9eZwJ0.equals(menuUiState.oyjLVtGms9eZwJ0) && this.b41X89IqSbKt.equals(menuUiState.b41X89IqSbKt) && this.gmXBnHsR2YSm == menuUiState.gmXBnHsR2YSm;
    }

    public final int hashCode() {
        return j8.yzPsTade5rL7D3(j8.yzPsTade5rL7D3(j8.hRNgd2zGCE5kj(this.b41X89IqSbKt, j8.hRNgd2zGCE5kj(this.oyjLVtGms9eZwJ0, j8.hRNgd2zGCE5kj(this.ra306ClFT3HT, (this.hRNgd2zGCE5kj.hashCode() + (this.yzPsTade5rL7D3.hashCode() * 31)) * 31, 31), 31), 31), 31, this.gmXBnHsR2YSm), 31, false);
    }

    public final String toString() {
        return "MenuUiState(items=" + this.yzPsTade5rL7D3 + ", filteredItems=" + this.hRNgd2zGCE5kj + ", searchQuery=" + this.ra306ClFT3HT + ", selectedCategory=" + this.oyjLVtGms9eZwJ0 + ", selectedSort=" + this.b41X89IqSbKt + ", isSortSheetVisible=" + this.gmXBnHsR2YSm + ", isLoading=false, error=null)";
    }
}
