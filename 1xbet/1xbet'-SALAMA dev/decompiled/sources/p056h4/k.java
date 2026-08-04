package p056h4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f13568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Handler f13569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k[] f13570c;

    static {
        k kVar = new k("INSTANCE", 0);
        f13568a = kVar;
        f13570c = new k[]{kVar};
        f13569b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f13570c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f13569b.post(runnable);
    }
}
