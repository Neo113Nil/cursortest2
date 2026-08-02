package kotlinx.coroutines.scheduling;

import kotlin.jvm.JvmField;

/* loaded from: classes5.dex */
public abstract class g implements Runnable {

    @JvmField
    public long a;

    @JvmField
    public boolean b;

    public g(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public g() {
        this(0L, false);
    }
}
