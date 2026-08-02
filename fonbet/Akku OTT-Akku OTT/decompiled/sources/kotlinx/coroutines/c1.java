package kotlinx.coroutines;

import kotlin.PublishedApi;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;

@PublishedApi
/* loaded from: classes5.dex */
public final class c1 extends AbstractCoroutineContextElement {
    public static final a b = new a();

    @JvmField
    public boolean a;

    public static final class a implements CoroutineContext.Key<c1> {
    }

    public c1() {
        super(b);
    }
}
