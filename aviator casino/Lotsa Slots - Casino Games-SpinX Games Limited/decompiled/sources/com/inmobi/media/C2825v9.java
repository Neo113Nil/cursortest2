package com.inmobi.media;

/* renamed from: com.inmobi.media.v9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2825v9 {
    public static void a() {
        android.content.Context context;
        try {
            java.util.Iterator it = com.inmobi.media.AbstractC2877x9.f5546a.iterator();
            while (it.hasNext()) {
                com.inmobi.media.Rb rb = (com.inmobi.media.Rb) ((java.lang.ref.WeakReference) it.next()).get();
                if (rb != null && (context = (android.content.Context) rb.f.get()) != null) {
                    kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2273ac.f5097a;
                    com.inmobi.media.Zb.a(new com.inmobi.media.Qb(rb, context, null));
                }
            }
        } catch (java.lang.Exception e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
        }
    }
}
