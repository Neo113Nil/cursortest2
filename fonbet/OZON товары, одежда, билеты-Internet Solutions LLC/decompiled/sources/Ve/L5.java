package Ve;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class L5 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f29388a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f29389b;

    public L5(Object obj) {
        this.f29388a = obj;
    }

    public final void a(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this.f29389b) {
            return;
        }
        this.f29389b = true;
        block.invoke(this.f29388a);
    }

    public final String toString() {
        return "Event(content=" + this.f29388a + ", hasBeenHandled=" + this.f29389b + ")";
    }
}
