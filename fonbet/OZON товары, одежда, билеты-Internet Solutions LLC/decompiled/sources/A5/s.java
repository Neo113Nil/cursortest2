package A5;

import android.content.Context;
import java.io.File;
import o5.C8648f;
import o5.InterfaceC8643a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f442a = new s();

    /* renamed from: b, reason: collision with root package name */
    private static C8648f f443b;

    @NotNull
    public final synchronized InterfaceC8643a a(@NotNull Context context) {
        C8648f c8648f;
        try {
            c8648f = f443b;
            if (c8648f == null) {
                InterfaceC8643a.C1314a c1314a = new InterfaceC8643a.C1314a();
                int i11 = k.f430d;
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    throw new IllegalStateException("cacheDir == null");
                }
                cacheDir.mkdirs();
                c1314a.b(bd.h.m(cacheDir, "image_cache"));
                c8648f = c1314a.a();
                f443b = c8648f;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c8648f;
    }
}
