package com.ironsource;

/* loaded from: classes5.dex */
public interface X7<T> {

    public static class a<ListenerType> implements com.ironsource.X7<ListenerType> {

        /* renamed from: a, reason: collision with root package name */
        private ListenerType f6073a;

        /* renamed from: com.ironsource.X7$a$a, reason: collision with other inner class name */
        public static final class C0131a extends com.ironsource.AbstractRunnableC3136ke {
            final /* synthetic */ java.lang.Runnable b;

            C0131a(java.lang.Runnable runnable) {
                this.b = runnable;
            }

            @Override // com.ironsource.AbstractRunnableC3136ke
            public void a() {
                this.b.run();
            }
        }

        public final ListenerType a() {
            return this.f6073a;
        }

        public final void b(ListenerType listenertype) {
            this.f6073a = listenertype;
        }

        public static /* synthetic */ void a(com.ironsource.X7.a aVar, java.lang.Runnable runnable, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            aVar.a(runnable, z);
        }

        public final void a(java.lang.Runnable runnable, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (z) {
                com.ironsource.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE, new com.ironsource.X7.a.C0131a(runnable), 0L, 2, null);
            }
        }

        public final void a(java.lang.String instanceId, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info(message + " instanceId=" + instanceId);
        }

        @Override // com.ironsource.X7
        public void a(ListenerType listenertype) {
            this.f6073a = listenertype;
        }
    }

    void a(T t);
}
