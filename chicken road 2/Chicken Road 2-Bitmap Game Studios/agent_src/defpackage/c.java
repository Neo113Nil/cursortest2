package defpackage;

import androidx.compose.material3.carousel.CarouselPagerState;
import androidx.compose.material3.carousel.CarouselState;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KType;
import kotlinx.serialization.SerializersCacheKt;
import kotlinx.serialization.internal.SerializerCache;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ List b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ c(int i, List list) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int i = this.oyjLVtGms9eZwJ0;
        List list = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                int i2 = CarouselPagerState.elPM8kURv8Fp;
                Object obj = list.get(2);
                obj.getClass();
                break;
            case 1:
                int i3 = CarouselState.hRNgd2zGCE5kj;
                Object obj2 = list.get(2);
                obj2.getClass();
                break;
            case 2:
                break;
            case 3:
                SerializerCache serializerCache = SerializersCacheKt.yzPsTade5rL7D3;
                break;
            default:
                SerializerCache serializerCache2 = SerializersCacheKt.yzPsTade5rL7D3;
                break;
        }
        return ((KType) list.get(0)).Uo5pffGf8LUU();
    }
}
