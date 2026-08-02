package androidx.camera.core.impl;

import B90.C2618u;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.W;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.camera.core.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5082a0 {
    public static void a(@NonNull List<W> list) {
        Iterator<W> it = list.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public static void b(@NonNull List<W> list) throws W.a {
        if (list.isEmpty()) {
            return;
        }
        int i11 = 0;
        do {
            try {
                list.get(i11).l();
                i11++;
            } catch (W.a e11) {
                for (int i12 = i11 - 1; i12 >= 0; i12--) {
                    list.get(i12).e();
                }
                throw e11;
            }
        } while (i11 < list.size());
    }

    @NonNull
    public static com.google.common.util.concurrent.m c(@NonNull List list, @NonNull final Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(I.k.i(((W) it.next()).j()));
        }
        final com.google.common.util.concurrent.m a11 = androidx.concurrent.futures.b.a(new I.h(I.k.l(arrayList), scheduledExecutorService, 5000L));
        final List list2 = list;
        return androidx.concurrent.futures.b.a(new b.c(executor, list2) { // from class: androidx.camera.core.impl.X

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Executor f38235b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ List f38236c;

            {
                this.f38236c = list2;
            }

            @Override // androidx.concurrent.futures.b.c
            public final Object c(b.a aVar) {
                com.google.common.util.concurrent.m mVar = com.google.common.util.concurrent.m.this;
                Y y11 = new Y(mVar, 0);
                Executor executor2 = this.f38235b;
                aVar.a(y11, executor2);
                I.k.b(mVar, new Z(aVar), executor2);
                return C2618u.h(new StringBuilder("surfaceList["), this.f38236c, "]");
            }
        });
    }
}
