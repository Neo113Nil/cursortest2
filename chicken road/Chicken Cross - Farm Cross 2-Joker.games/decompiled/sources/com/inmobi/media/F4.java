package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class F4 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J4 f6548a;

    public F4(J4 j4) {
        this.f6548a = j4;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Config config = (Config) obj;
        this.f6548a.f6641a.b.put(config.getType(), config);
        J4 j4 = this.f6548a;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) j4.f6641a.c.get(config.getType());
        if (concurrentLinkedQueue != null) {
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                T4 t4 = (T4) ((WeakReference) it.next()).get();
                if (t4 != null) {
                    t4.a(config);
                }
            }
        }
        j4.f6641a.c.remove(config.getType());
        return Unit.INSTANCE;
    }
}
