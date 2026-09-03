package com.door.brass.knob.ui.menu;

import com.door.brass.knob.data.db.entity.MenuItemEntity;
import java.util.Comparator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MenuViewModel$applyFilters$$inlined$sortedBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = ((MenuItemEntity) obj).hRNgd2zGCE5kj;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((MenuItemEntity) obj2).hRNgd2zGCE5kj.toLowerCase(locale);
        lowerCase2.getClass();
        return ComparisonsKt.hRNgd2zGCE5kj(lowerCase, lowerCase2);
    }
}
