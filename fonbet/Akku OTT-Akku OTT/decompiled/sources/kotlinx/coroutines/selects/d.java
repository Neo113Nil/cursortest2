package kotlinx.coroutines.selects;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.C1117w;

/* loaded from: classes5.dex */
public final class d<Q> implements c<Q> {
    public final Function3<Object, f<?>, Object, Unit> a;
    public final Function3<Object, Object, Object, Object> b;

    public d(C1117w c1117w, Function3 function3, Function3 function32) {
        this.a = function3;
        this.b = function32;
    }
}
