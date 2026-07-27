package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface V7<T> {

    public static class a<ListenerType> implements V7<ListenerType> {

        /* renamed from: a, reason: collision with root package name */
        private ListenerType f7965a;

        /* renamed from: com.ironsource.V7$a$a, reason: collision with other inner class name */
        public static final class C0317a extends com.ironsource.environment.thread.a {
            final /* synthetic */ Runnable b;

            C0317a(Runnable runnable) {
                this.b = runnable;
            }

            @Override // com.ironsource.environment.thread.a
            public void a() {
                this.b.run();
            }
        }

        public final ListenerType a() {
            return this.f7965a;
        }

        public final void b(ListenerType listenertype) {
            this.f7965a = listenertype;
        }

        public static /* synthetic */ void a(a aVar, Runnable runnable, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            aVar.a(runnable, z);
        }

        public final void a(Runnable runnable, boolean z) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (z) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new C0317a(runnable), 0L, 2, null);
            }
        }

        public final void a(String instanceId, String message) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(message, "message");
            IronLog.CALLBACK.info(message + " instanceId=" + instanceId);
        }

        @Override // com.ironsource.V7
        public void a(ListenerType listenertype) {
            this.f7965a = listenertype;
        }
    }

    void a(T t);
}
