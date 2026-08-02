package Fh0;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.internal.status.data.repository.database.PushDataBase_Impl;

/* loaded from: classes7.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final PushDataBase_Impl f9483a;

    public i(@NotNull PushDataBase_Impl database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f9483a = database;
    }

    public void a(@NotNull ArrayList entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        PushDataBase_Impl pushDataBase_Impl = this.f9483a;
        a h11 = pushDataBase_Impl.h();
        ArrayList arrayList = new ArrayList(C7714v.z(entities, 10));
        Iterator it = entities.iterator();
        while (it.hasNext()) {
            arrayList.add(((Gh0.b) it.next()).e());
        }
        ((c) h11).a(arrayList);
        ((h) pushDataBase_Impl.a()).b(entities);
    }

    @NotNull
    public abstract ArrayList b();

    public void c(@NotNull Ih0.c event) {
        Kh0.a d11;
        Intrinsics.checkNotNullParameter(event, "event");
        Ih0.a k11 = event.k();
        Ih0.a aVar = Ih0.a.DELIVERY;
        PushDataBase_Impl pushDataBase_Impl = this.f9483a;
        Long l11 = null;
        if (k11 == aVar && (d11 = event.d()) != null) {
            l11 = Long.valueOf(((c) pushDataBase_Impl.h()).b(Ch0.c.d(d11)));
        }
        ((h) pushDataBase_Impl.a()).c(Ch0.c.b(event, l11));
    }
}
