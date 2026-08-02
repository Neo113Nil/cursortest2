package Fb0;

import android.os.ConditionVariable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f9252a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final ConditionVariable f9253b = new ConditionVariable(false);

    public static boolean a() {
        return f9252a;
    }

    public static void b() {
        f9252a = true;
        f9253b.open();
    }

    public static void c() {
        if (f9252a) {
            return;
        }
        f9253b.block();
    }
}
