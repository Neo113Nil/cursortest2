package androidx.room.guava;

/* loaded from: classes.dex */
public final /* synthetic */ class GuavaRoom$$ExternalSyntheticLambda3 implements java.lang.Runnable {
    public final /* synthetic */ java.util.concurrent.Callable f$0;
    public final /* synthetic */ androidx.concurrent.futures.ResolvableFuture f$1;

    public /* synthetic */ GuavaRoom$$ExternalSyntheticLambda3(java.util.concurrent.Callable callable, androidx.concurrent.futures.ResolvableFuture resolvableFuture) {
        this.f$0 = callable;
        this.f$1 = resolvableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.room.guava.GuavaRoom.m9282$r8$lambda$RmXzU2X6adGcyZRl_mFo_FWFYo(this.f$0, this.f$1);
    }
}
