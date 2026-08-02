package androidx.webkit;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        WebStorageCompat.lambda$deleteBrowsingDataForSite$1(runnable);
    }
}
