package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cf1 implements Executor {

    /* JADX INFO: renamed from: j */
    public static final cf1 f1245j;

    /* JADX INFO: renamed from: k */
    public static final Handler f1246k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ cf1[] f1247l;

    static {
        cf1 cf1Var = new cf1("INSTANCE", 0);
        f1245j = cf1Var;
        f1247l = new cf1[]{cf1Var};
        f1246k = new Handler(Looper.getMainLooper());
    }

    public static cf1 valueOf(String str) {
        return (cf1) Enum.valueOf(cf1.class, str);
    }

    public static cf1[] values() {
        return (cf1[]) f1247l.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f1246k.post(runnable);
    }
}
