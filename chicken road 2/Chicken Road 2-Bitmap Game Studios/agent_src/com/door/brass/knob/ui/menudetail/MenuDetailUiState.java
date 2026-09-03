package com.door.brass.knob.ui.menudetail;

import com.door.brass.knob.data.db.entity.MenuItemEntity;
import defpackage.j8;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/ui/menudetail/MenuDetailUiState;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MenuDetailUiState {
    public final Long b41X89IqSbKt;
    public final List hRNgd2zGCE5kj;
    public final boolean oyjLVtGms9eZwJ0;
    public final String ra306ClFT3HT;
    public final MenuItemEntity yzPsTade5rL7D3;

    public MenuDetailUiState(MenuItemEntity menuItemEntity, List list, String str, boolean z, Long l) {
        list.getClass();
        this.yzPsTade5rL7D3 = menuItemEntity;
        this.hRNgd2zGCE5kj = list;
        this.ra306ClFT3HT = str;
        this.oyjLVtGms9eZwJ0 = z;
        this.b41X89IqSbKt = l;
    }

    public static MenuDetailUiState yzPsTade5rL7D3(MenuDetailUiState menuDetailUiState, MenuItemEntity menuItemEntity, List list, String str, Long l, int i) {
        if ((i & 1) != 0) {
            menuItemEntity = menuDetailUiState.yzPsTade5rL7D3;
        }
        MenuItemEntity menuItemEntity2 = menuItemEntity;
        if ((i & 2) != 0) {
            list = menuDetailUiState.hRNgd2zGCE5kj;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str = menuDetailUiState.ra306ClFT3HT;
        }
        String str2 = str;
        menuDetailUiState.getClass();
        menuDetailUiState.getClass();
        menuDetailUiState.getClass();
        boolean z = (i & 64) != 0 ? menuDetailUiState.oyjLVtGms9eZwJ0 : false;
        if ((i & 128) != 0) {
            l = menuDetailUiState.b41X89IqSbKt;
        }
        menuDetailUiState.getClass();
        list2.getClass();
        return new MenuDetailUiState(menuItemEntity2, list2, str2, z, l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuDetailUiState)) {
            return false;
        }
        MenuDetailUiState menuDetailUiState = (MenuDetailUiState) obj;
        return Intrinsics.yzPsTade5rL7D3(this.yzPsTade5rL7D3, menuDetailUiState.yzPsTade5rL7D3) && Intrinsics.yzPsTade5rL7D3(this.hRNgd2zGCE5kj, menuDetailUiState.hRNgd2zGCE5kj) && Intrinsics.yzPsTade5rL7D3(this.ra306ClFT3HT, menuDetailUiState.ra306ClFT3HT) && this.oyjLVtGms9eZwJ0 == menuDetailUiState.oyjLVtGms9eZwJ0 && Intrinsics.yzPsTade5rL7D3(this.b41X89IqSbKt, menuDetailUiState.b41X89IqSbKt);
    }

    public final int hashCode() {
        MenuItemEntity menuItemEntity = this.yzPsTade5rL7D3;
        int hashCode = (this.hRNgd2zGCE5kj.hashCode() + ((menuItemEntity == null ? 0 : menuItemEntity.hashCode()) * 31)) * 31;
        String str = this.ra306ClFT3HT;
        int yzPsTade5rL7D3 = j8.yzPsTade5rL7D3(j8.yzPsTade5rL7D3(j8.yzPsTade5rL7D3((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, false), 961, false), 31, this.oyjLVtGms9eZwJ0);
        Long l = this.b41X89IqSbKt;
        return yzPsTade5rL7D3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "MenuDetailUiState(menuItem=" + this.yzPsTade5rL7D3 + ", tasteMarks=" + this.hRNgd2zGCE5kj + ", selectedTasteMark=" + this.ra306ClFT3HT + ", isDescriptionExpanded=false, isLoading=false, error=null, shouldNavigateBack=" + this.oyjLVtGms9eZwJ0 + ", navigateToShuffleId=" + this.b41X89IqSbKt + ")";
    }
}
