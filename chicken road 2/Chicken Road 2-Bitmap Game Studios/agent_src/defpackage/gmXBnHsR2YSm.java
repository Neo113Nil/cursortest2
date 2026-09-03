package defpackage;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class gmXBnHsR2YSm implements Function1 {
    public final /* synthetic */ Collection b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ gmXBnHsR2YSm(int i, Collection collection) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        boolean contains;
        int i = this.oyjLVtGms9eZwJ0;
        Collection<?> collection = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                contains = collection.contains(obj);
                break;
            case 1:
                int i2 = PersistentVectorBuilder.kSPEzfraxudm4i;
                contains = collection.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
