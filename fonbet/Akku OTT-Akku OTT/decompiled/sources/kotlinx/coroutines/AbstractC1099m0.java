package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.ExperimentalStdlibApi;
import kotlin.coroutines.AbstractCoroutineContextKey;

/* renamed from: kotlinx.coroutines.m0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1099m0 extends I implements Closeable, AutoCloseable {

    @ExperimentalStdlibApi
    /* renamed from: kotlinx.coroutines.m0$a */
    public static final class a extends AbstractCoroutineContextKey<I, AbstractC1099m0> {
    }

    static {
        new a(I.INSTANCE, new androidx.compose.runtime.snapshots.a(1));
    }

    public abstract Executor W();
}
