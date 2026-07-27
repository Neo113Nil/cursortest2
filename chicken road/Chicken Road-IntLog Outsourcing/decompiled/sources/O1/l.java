package O1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final l f2264a;

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f2265b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l[] f2266c;

    static {
        l lVar = new l("INSTANCE", 0);
        f2264a = lVar;
        f2266c = new l[]{lVar};
        f2265b = new Handler(Looper.getMainLooper());
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f2266c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f2265b.post(runnable);
    }
}
