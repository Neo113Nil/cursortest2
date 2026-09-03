package com.door.brass.knob.ui.menu;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.door.brass.knob.data.db.entity.MenuItemEntity;
import com.door.brass.knob.data.repository.MenuRepository;
import defpackage.l3;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/ui/menu/MenuViewModel;", "Landroidx/lifecycle/ViewModel;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MenuViewModel extends ViewModel {
    public final MenuRepository hRNgd2zGCE5kj;
    public final StateFlow oyjLVtGms9eZwJ0;
    public final MutableStateFlow ra306ClFT3HT;

    public MenuViewModel(MenuRepository menuRepository) {
        menuRepository.getClass();
        this.hRNgd2zGCE5kj = menuRepository;
        EmptyList emptyList = EmptyList.oyjLVtGms9eZwJ0;
        MutableStateFlow yzPsTade5rL7D3 = StateFlowKt.yzPsTade5rL7D3(new MenuUiState("", "All", "Alphabetical", emptyList, emptyList, false));
        this.ra306ClFT3HT = yzPsTade5rL7D3;
        this.oyjLVtGms9eZwJ0 = FlowKt.ra306ClFT3HT(yzPsTade5rL7D3);
        BuildersKt.ra306ClFT3HT(ViewModelKt.yzPsTade5rL7D3(this), null, null, new MenuViewModel$loadItems$1(this, null), 3);
    }

    public final List gmXBnHsR2YSm(MenuUiState menuUiState, List list) {
        if (!menuUiState.oyjLVtGms9eZwJ0.equals("All")) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.yzPsTade5rL7D3(((MenuItemEntity) obj).ra306ClFT3HT, menuUiState.oyjLVtGms9eZwJ0)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        String obj2 = StringsKt.vAthhQhzH5WQr3(menuUiState.ra306ClFT3HT).toString();
        if (obj2.length() > 0) {
            String lowerCase = obj2.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list) {
                MenuItemEntity menuItemEntity = (MenuItemEntity) obj3;
                String str = menuItemEntity.hRNgd2zGCE5kj;
                Locale locale = Locale.ROOT;
                String lowerCase2 = str.toLowerCase(locale);
                lowerCase2.getClass();
                if (!StringsKt.i7xAcZoXXiIt(lowerCase2, lowerCase, false)) {
                    String lowerCase3 = menuItemEntity.oyjLVtGms9eZwJ0.toLowerCase(locale);
                    lowerCase3.getClass();
                    if (!StringsKt.i7xAcZoXXiIt(lowerCase3, lowerCase, false)) {
                        String str2 = menuItemEntity.b41X89IqSbKt;
                        if (str2 != null) {
                            String lowerCase4 = str2.toLowerCase(locale);
                            lowerCase4.getClass();
                            if (StringsKt.i7xAcZoXXiIt(lowerCase4, lowerCase, false)) {
                            }
                        }
                    }
                }
                arrayList2.add(obj3);
            }
            list = arrayList2;
        }
        String str3 = menuUiState.b41X89IqSbKt;
        int hashCode = str3.hashCode();
        if (hashCode != -759946050) {
            if (hashCode != 438544978) {
                if (hashCode == 803668952 && str3.equals("Alphabetical")) {
                    return CollectionsKt.AwgywP6bDNsW(list, new MenuViewModel$applyFilters$$inlined$sortedBy$1());
                }
            } else if (str3.equals("By Texture")) {
                return CollectionsKt.AwgywP6bDNsW(list, ComparisonsKt.yzPsTade5rL7D3(new l3(this, 8), new l3(9)));
            }
        } else if (str3.equals("By Sweetness")) {
            return CollectionsKt.AwgywP6bDNsW(list, ComparisonsKt.yzPsTade5rL7D3(new l3(this, 6), new l3(7)));
        }
        return CollectionsKt.AwgywP6bDNsW(list, new MenuViewModel$applyFilters$$inlined$sortedBy$2());
    }
}
