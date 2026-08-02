package W1;

import G1.C0142m;
import O3.l;
import Q1.j;
import U1.e;
import android.os.Bundle;
import androidx.lifecycle.EnumC0487p;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final e f6025a;

    /* renamed from: b, reason: collision with root package name */
    public final l f6026b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6029e;
    public Bundle f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6030g;

    /* renamed from: c, reason: collision with root package name */
    public final j f6027c = new j(9);

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f6028d = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f6031h = true;

    public a(e eVar, l lVar) {
        this.f6025a = eVar;
        this.f6026b = lVar;
    }

    public final void a() {
        e eVar = this.f6025a;
        if (eVar.g().h() != EnumC0487p.f7059l) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f6029e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f6026b.invoke();
        eVar.g().a(new C0142m(1, this));
        this.f6029e = true;
    }
}
