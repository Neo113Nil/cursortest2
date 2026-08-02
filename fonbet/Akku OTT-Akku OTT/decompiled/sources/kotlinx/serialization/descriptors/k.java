package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.internal.G;

@SourceDebugExtension({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 SerialDescriptor.kt\nkotlinx/serialization/descriptors/SerialDescriptorKt\n*L\n1#1,17:1\n309#2,8:18\n*E\n"})
/* loaded from: classes5.dex */
public final class k implements Iterable<String>, KMappedMarker {
    public final /* synthetic */ G a;

    public k(G g) {
        this.a = g;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new j(this.a);
    }
}
