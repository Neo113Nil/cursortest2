package com.inmobi.media;

/* renamed from: com.inmobi.media.c4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2318c4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.C2580m4 f5134a = new com.inmobi.media.C2580m4(new com.inmobi.media.C2634o4(), new com.inmobi.media.C2606n4(com.inmobi.media.H9.c));

    public static void a(java.lang.String type, com.inmobi.media.InterfaceC2846w4 listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        com.inmobi.media.C2580m4 c2580m4 = f5134a;
        c2580m4.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        java.util.LinkedHashMap linkedHashMap = c2580m4.f5327a.c;
        java.lang.Object obj = linkedHashMap.get(type);
        if (obj == null) {
            obj = new java.util.concurrent.ConcurrentLinkedQueue();
            linkedHashMap.put(type, obj);
        }
        ((java.util.concurrent.ConcurrentLinkedQueue) obj).add(new java.lang.ref.WeakReference(listener));
    }
}
