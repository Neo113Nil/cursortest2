package kotlinx.coroutines.scheduling;

import androidx.compose.runtime.t;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.O;

/* loaded from: classes5.dex */
public final class h extends g {

    @JvmField
    public final Runnable c;

    public h(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(O.a(runnable));
        sb.append(", ");
        sb.append(this.a);
        sb.append(", ");
        return t.b(']', this.b ? "Blocking" : "Non-blocking", sb);
    }
}
