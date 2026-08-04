package p103o1;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f15550d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellationException f15552b;

    static {
        if (i.f15569d) {
            f15550d = null;
            f15549c = null;
        } else {
            f15550d = new a(false, null);
            f15549c = new a(true, null);
        }
    }

    public a(boolean z4, CancellationException cancellationException) {
        this.f15551a = z4;
        this.f15552b = cancellationException;
    }
}
