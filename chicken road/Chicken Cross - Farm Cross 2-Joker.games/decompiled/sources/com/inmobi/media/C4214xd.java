package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.xd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4214xd {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f7477a = new ConcurrentHashMap();
    public final ExecutorService b;

    public C4214xd() {
        Intrinsics.checkNotNullParameter("MultiEventBus", "name");
        this.b = Executors.newSingleThreadExecutor(new ThreadFactoryC3932na("MultiEventBus", false));
    }

    public static final void a(C3698f3 c3698f3, C4214xd c4214xd) {
        String str = "publish " + c3698f3.f7098a;
        c4214xd.a(c3698f3);
    }

    public final void b(final C3698f3 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            this.b.execute(new Runnable() { // from class: com.inmobi.media.xd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C4214xd.a(C3698f3.this, this);
                }
            });
        } catch (InternalError unused) {
            String str = "publish " + event.f7098a;
            a(event);
        }
    }

    public static final boolean a(int[] iArr, C3698f3 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return ArraysKt.contains(iArr, event.f7098a);
    }

    public final void a(final int[] eventIds, Function1 subscriber) {
        Intrinsics.checkNotNullParameter(eventIds, "eventIds");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        this.f7477a.put(new Function1() { // from class: com.inmobi.media.xd$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C4214xd.a(eventIds, (C3698f3) obj));
            }
        }, new WeakReference(subscriber));
    }

    public final void a(Function1 subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        Iterator it = this.f7477a.entrySet().iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((WeakReference) ((Map.Entry) it.next()).getValue()).get(), subscriber)) {
                it.remove();
            }
        }
    }

    public final void a(C3698f3 c3698f3) {
        Function1 function1;
        Set<Map.Entry> entrySet = this.f7477a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
        for (Map.Entry entry : entrySet) {
            if (((WeakReference) entry.getValue()).get() == null) {
                this.f7477a.remove(entry.getKey());
            }
        }
        Set<Map.Entry> entrySet2 = this.f7477a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet2, "<get-entries>(...)");
        for (Map.Entry entry2 : entrySet2) {
            Intrinsics.checkNotNull(entry2);
            Object key = entry2.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
            Function1 function12 = (Function1) key;
            Object value = entry2.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
            WeakReference weakReference = (WeakReference) value;
            try {
                if (((Boolean) function12.invoke(c3698f3)).booleanValue() && (function1 = (Function1) weakReference.get()) != null) {
                    function1.invoke(c3698f3);
                }
            } catch (Exception e) {
                Lazy lazy = Ba.f6473a;
                U9.a(e);
            }
        }
    }
}
