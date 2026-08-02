package a30;

import a30.C4933a;
import android.content.Context;
import c30.i;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a30.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4937e implements Jb.e<i> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f36248a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<K80.b> f36249b;

    public C4937e(Pc.a<Context> aVar, Pc.a<K80.b> aVar2) {
        this.f36248a = aVar;
        this.f36249b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) ((C4933a.C0687a.c) this.f36248a).get();
        K80.b locationManager = (K80.b) ((C4933a.C0687a.d) this.f36249b).get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        return new i(context, locationManager);
    }
}
