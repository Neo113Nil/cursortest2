package androidx.room;

/* compiled from: MultiInstanceInvalidationClient.kt */
@kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/MultiInstanceInvalidationClient$callback$1", "Landroidx/room/IMultiInstanceInvalidationCallback$Stub;", "onInvalidation", "", "tables", "", "", "([Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationClient$callback$1 extends androidx.room.IMultiInstanceInvalidationCallback.Stub {
    final /* synthetic */ androidx.room.MultiInstanceInvalidationClient this$0;

    MultiInstanceInvalidationClient$callback$1(androidx.room.MultiInstanceInvalidationClient multiInstanceInvalidationClient) {
        this.this$0 = multiInstanceInvalidationClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onInvalidation$lambda$0(androidx.room.MultiInstanceInvalidationClient this$0, java.lang.String[] tables) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tables, "$tables");
        this$0.getInvalidationTracker().notifyObserversByTableNames((java.lang.String[]) java.util.Arrays.copyOf(tables, tables.length));
    }

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public void onInvalidation(final java.lang.String[] tables) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tables, "tables");
        java.util.concurrent.Executor executor = this.this$0.getExecutor();
        final androidx.room.MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.this$0;
        executor.execute(new java.lang.Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient$callback$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.MultiInstanceInvalidationClient$callback$1.onInvalidation$lambda$0(androidx.room.MultiInstanceInvalidationClient.this, tables);
            }
        });
    }
}
