package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.internal.G;

/* loaded from: classes5.dex */
public final class j implements Iterator<String>, KMappedMarker {
    public int a;
    public final /* synthetic */ G b;

    public j(G g) {
        this.b = g;
        this.a = g.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a > 0;
    }

    @Override // java.util.Iterator
    public final String next() {
        G g = this.b;
        int i = g.c;
        int i2 = this.a;
        this.a = i2 - 1;
        return g.e[i - i2];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
