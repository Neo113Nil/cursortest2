package com.ironsource;

/* loaded from: classes5.dex */
public final class T6 {
    public static final com.ironsource.S6.a a(android.os.Handler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "<this>");
        return new com.ironsource.T6.a(handler);
    }

    public static final class a implements com.ironsource.S6.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.os.Handler f5980a;

        a(android.os.Handler handler) {
            this.f5980a = handler;
        }

        @Override // com.ironsource.S6.a
        public com.ironsource.S6.a.InterfaceC0127a a(final java.lang.Runnable runnable, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f5980a.postDelayed(runnable, j);
            final android.os.Handler handler = this.f5980a;
            return new com.ironsource.S6.a.InterfaceC0127a() { // from class: com.ironsource.T6$a$$ExternalSyntheticLambda0
                @Override // com.ironsource.S6.a.InterfaceC0127a
                public final void cancel() {
                    com.ironsource.T6.a.a(handler, runnable);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(android.os.Handler this_asScheduler, java.lang.Runnable runnable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_asScheduler, "$this_asScheduler");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "$runnable");
            this_asScheduler.removeCallbacks(runnable);
        }
    }

    public static final <T> com.ironsource.Ef.b a(T t, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        return com.ironsource.Ef.b.b.a(t, block);
    }
}
