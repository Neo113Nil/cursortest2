package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ca, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3621ca {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f7044a = new CopyOnWriteArrayList();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final C3564aa c = new C3564aa();

    public static void a(Jc finishListener) {
        Intrinsics.checkNotNullParameter(finishListener, "finishListener");
        if (!b.getAndSet(true)) {
            AbstractC4143un.a(new C3592ba(null));
        }
        CopyOnWriteArrayList copyOnWriteArrayList = f7044a;
        copyOnWriteArrayList.add(new WeakReference(finishListener));
        try {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    f7044a.remove(weakReference);
                }
            }
        } catch (Exception e) {
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
    }
}
