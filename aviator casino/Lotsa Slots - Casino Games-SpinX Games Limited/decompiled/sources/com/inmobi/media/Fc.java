package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Fc {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f4704a = new java.util.concurrent.ConcurrentHashMap();
    public final java.util.concurrent.ExecutorService b;

    public Fc() {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("MultiEventBus", "name");
        this.b = java.util.concurrent.Executors.newSingleThreadExecutor(new com.inmobi.media.I9("MultiEventBus", false));
    }

    public static final void a(com.inmobi.media.J2 j2, com.inmobi.media.Fc fc) {
        int i = j2.f4774a;
        fc.a(j2);
    }

    public final void b(final com.inmobi.media.J2 event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        try {
            this.b.execute(new java.lang.Runnable() { // from class: com.inmobi.media.Fc$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.Fc.a(com.inmobi.media.J2.this, this);
                }
            });
        } catch (java.lang.InternalError unused) {
            int i = event.f4774a;
            a(event);
        }
    }

    public static final boolean a(int[] iArr, com.inmobi.media.J2 event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        return kotlin.collections.ArraysKt.contains(iArr, event.f4774a);
    }

    public final void a(final int[] eventIds, kotlin.jvm.functions.Function1 subscriber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventIds, "eventIds");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        this.f4704a.put(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Fc$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(com.inmobi.media.Fc.a(eventIds, (com.inmobi.media.J2) obj));
            }
        }, new java.lang.ref.WeakReference(subscriber));
    }

    public final void a(kotlin.jvm.functions.Function1 subscriber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        java.util.Iterator it = this.f4704a.entrySet().iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.ref.WeakReference) ((java.util.Map.Entry) it.next()).getValue()).get(), subscriber)) {
                it.remove();
            }
        }
    }

    public final void a(com.inmobi.media.J2 j2) {
        kotlin.jvm.functions.Function1 function1;
        java.util.Set<java.util.Map.Entry> entrySet = this.f4704a.entrySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : entrySet) {
            if (((java.lang.ref.WeakReference) entry.getValue()).get() == null) {
                this.f4704a.remove(entry.getKey());
            }
        }
        java.util.Set<java.util.Map.Entry> entrySet2 = this.f4704a.entrySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entrySet2, "<get-entries>(...)");
        for (java.util.Map.Entry entry2 : entrySet2) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(entry2);
            java.lang.Object key = entry2.getKey();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) key;
            java.lang.Object value = entry2.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) value;
            try {
                if (((java.lang.Boolean) function12.invoke(j2)).booleanValue() && (function1 = (kotlin.jvm.functions.Function1) weakReference.get()) != null) {
                    function1.invoke(j2);
                }
            } catch (java.lang.Exception e) {
                kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
                com.inmobi.media.AbstractC2665p9.a(e);
            }
        }
    }
}
