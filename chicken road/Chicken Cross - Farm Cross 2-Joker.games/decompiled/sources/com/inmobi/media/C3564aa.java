package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Lazy;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.aa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3564aa {
    public static void a() {
        Context context;
        try {
            Iterator it = AbstractC3621ca.f7044a.iterator();
            while (it.hasNext()) {
                Jc jc = (Jc) ((WeakReference) it.next()).get();
                if (jc != null && (context = (Context) jc.f.get()) != null) {
                    CoroutineScope coroutineScope = Sc.f6848a;
                    Rc.a(new Ic(jc, context, null));
                }
            }
        } catch (Exception e) {
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
    }
}
