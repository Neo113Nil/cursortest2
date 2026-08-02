package Hj0;

import android.content.Context;
import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.tracker.db.TrackerDataBase;

/* renamed from: Hj0.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3153j implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11178a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f11179b;

    public /* synthetic */ C3153j(Object obj, int i11) {
        this.f11178a = i11;
        this.f11179b = obj;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f11178a) {
            case 0:
                TrackerDataBase dataBase = (TrackerDataBase) ((Pc.a) this.f11179b).get();
                Intrinsics.checkNotNullParameter(dataBase, "dataBase");
                li0.m c11 = dataBase.c();
                Jb.j.d(c11);
                return c11;
            case 1:
                return new Oi.c((Context) ((Pc.a) this.f11179b).get(), new Mi.a());
            default:
                ((fZ.b) this.f11179b).getClass();
                Moshi moshi = new Moshi(new Moshi.a());
                Intrinsics.checkNotNullExpressionValue(moshi, "build(...)");
                return moshi;
        }
    }

    public C3153j(Pc.a aVar, Mi.b bVar) {
        this.f11178a = 1;
        this.f11179b = aVar;
    }
}
