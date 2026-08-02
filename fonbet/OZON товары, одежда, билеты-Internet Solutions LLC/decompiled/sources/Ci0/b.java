package Ci0;

import Td0.d;
import android.content.Intent;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class b extends d.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f5112a = "ozonTrackerDebugMenu";

    /* renamed from: b, reason: collision with root package name */
    private final String f5113b = "Tracker";

    /* renamed from: c, reason: collision with root package name */
    private final Function1<Td0.c, Intent> f5114c;

    b(f fVar, Rd0.a aVar) {
        this.f5114c = new a(fVar, aVar);
    }

    @Override // Td0.d.a
    public final String a() {
        return this.f5112a;
    }

    @Override // Td0.d.a
    public final Function1<Td0.c, Intent> b() {
        return this.f5114c;
    }

    @Override // Td0.d.a
    public final String c() {
        return this.f5113b;
    }
}
