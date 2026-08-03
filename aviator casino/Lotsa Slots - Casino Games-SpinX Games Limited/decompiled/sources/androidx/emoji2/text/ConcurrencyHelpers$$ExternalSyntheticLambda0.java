package androidx.emoji2.text;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ConcurrencyHelpers$$ExternalSyntheticLambda0 implements java.util.concurrent.Executor {
    public final /* synthetic */ android.os.Handler f$0;

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f$0.post(runnable);
    }
}
