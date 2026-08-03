package com.inmobi.media;

/* renamed from: com.inmobi.media.x9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2877x9 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f5546a = new java.util.concurrent.CopyOnWriteArrayList();
    public static final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);
    public static final com.inmobi.media.C2825v9 c = new com.inmobi.media.C2825v9();

    public static void a(com.inmobi.media.Rb finishListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finishListener, "finishListener");
        if (!b.getAndSet(true)) {
            com.inmobi.media.AbstractC2939zl.a(new com.inmobi.media.C2851w9(null));
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f5546a;
        copyOnWriteArrayList.add(new java.lang.ref.WeakReference(finishListener));
        try {
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                if (weakReference.get() == null) {
                    f5546a.remove(weakReference);
                }
            }
        } catch (java.lang.Exception e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
        }
    }
}
