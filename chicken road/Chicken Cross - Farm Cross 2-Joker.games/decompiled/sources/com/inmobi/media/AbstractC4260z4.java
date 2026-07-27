package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.z4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4260z4 {

    /* renamed from: a, reason: collision with root package name */
    public static final J4 f7518a = new J4(new L4(), new K4(AbstractC3904ma.d));

    public static void a(String type, T4 listener) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(listener, "listener");
        J4 j4 = f7518a;
        j4.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(listener, "listener");
        LinkedHashMap linkedHashMap = j4.f6641a.c;
        Object obj = linkedHashMap.get(type);
        if (obj == null) {
            obj = new ConcurrentLinkedQueue();
            linkedHashMap.put(type, obj);
        }
        ((ConcurrentLinkedQueue) obj).add(new WeakReference(listener));
    }
}
