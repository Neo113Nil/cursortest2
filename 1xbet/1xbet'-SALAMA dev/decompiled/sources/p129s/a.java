package p129s;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f16067d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellationException f16069b;

    static {
        if (g.f16083d) {
            f16067d = null;
            f16066c = null;
        } else {
            f16067d = new a(false, null);
            f16066c = new a(true, null);
        }
    }

    public a(boolean z4, CancellationException cancellationException) {
        this.f16068a = z4;
        this.f16069b = cancellationException;
    }
}
