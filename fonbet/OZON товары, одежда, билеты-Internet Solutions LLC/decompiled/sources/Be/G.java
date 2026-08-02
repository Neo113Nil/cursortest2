package Be;

import Ae.C0;
import Ae.M0;

/* loaded from: classes.dex */
final class G extends C0<Integer> implements M0<Integer> {
    public final void A(int i11) {
        synchronized (this) {
            tryEmit(Integer.valueOf(s().intValue() + i11));
        }
    }

    @Override // Ae.M0
    public final Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(s().intValue());
        }
        return valueOf;
    }
}
