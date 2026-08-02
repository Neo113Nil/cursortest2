package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aC\u0010\u0007\u001a\u00020\u0005*\u00020\u00002-\u0010\u0006\u001a)\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0003\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00050\u0001H\u0080\b¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/foundation/lazy/layout/CacheWindowScope;", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "", "", "action", "forEachVisibleItem", "(Landroidx/compose/foundation/lazy/layout/CacheWindowScope;Lkotlin/jvm/functions/Function3;)V", "InvalidIndex", com.visa.cbp.getEncExpo.warmup}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CacheWindowLogicKt {
    public static final int InvalidIndex = -1;

    public static final void forEachVisibleItem(androidx.compose.foundation.lazy.layout.CacheWindowScope cacheWindowScope, kotlin.jvm.functions.Function3<? super java.lang.Integer, java.lang.Object, ? super java.lang.Integer, kotlin.Unit> function3) {
        int visibleLineCount = cacheWindowScope.getVisibleLineCount();
        for (int i = 0; i < visibleLineCount; i++) {
            function3.invoke(java.lang.Integer.valueOf(cacheWindowScope.getVisibleItemLine(i)), cacheWindowScope.getVisibleLineKey(i), java.lang.Integer.valueOf(cacheWindowScope.getVisibleItemSize(i)));
        }
    }
}
