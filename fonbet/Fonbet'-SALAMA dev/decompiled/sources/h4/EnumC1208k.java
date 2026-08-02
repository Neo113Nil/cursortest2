package h4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h4.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1208k implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1208k f13562a;

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f13563b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC1208k[] f13564c;

    static {
        EnumC1208k enumC1208k = new EnumC1208k("INSTANCE", 0);
        f13562a = enumC1208k;
        f13564c = new EnumC1208k[]{enumC1208k};
        f13563b = new Handler(Looper.getMainLooper());
    }

    public static EnumC1208k valueOf(String str) {
        return (EnumC1208k) Enum.valueOf(EnumC1208k.class, str);
    }

    public static EnumC1208k[] values() {
        return (EnumC1208k[]) f13564c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f13563b.post(runnable);
    }
}
