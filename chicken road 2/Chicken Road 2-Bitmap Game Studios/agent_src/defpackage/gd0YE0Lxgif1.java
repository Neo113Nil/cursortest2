package defpackage;

import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.CacheWindowScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class gd0YE0Lxgif1 implements Function2 {
    public final /* synthetic */ CacheWindowLogic b41X89IqSbKt;
    public final /* synthetic */ CacheWindowScope gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ gd0YE0Lxgif1(CacheWindowLogic cacheWindowLogic, CacheWindowScope cacheWindowScope, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = cacheWindowLogic;
        this.gmXBnHsR2YSm = cacheWindowScope;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        CacheWindowScope cacheWindowScope = this.gmXBnHsR2YSm;
        CacheWindowLogic cacheWindowLogic = this.b41X89IqSbKt;
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                cacheWindowLogic.hRNgd2zGCE5kj(cacheWindowScope, intValue, intValue2);
                break;
            default:
                cacheWindowLogic.hRNgd2zGCE5kj(cacheWindowScope, intValue, intValue2);
                break;
        }
        return unit;
    }
}
