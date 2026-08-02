package Of;

import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.function.Supplier;

/* loaded from: classes10.dex */
public final /* synthetic */ class d implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        return new SoftReference(new ArrayDeque());
    }
}
