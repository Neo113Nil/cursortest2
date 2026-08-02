package Pa0;

import j40.C7278a;
import java.util.Map;
import k5.C7525i1;

/* loaded from: classes3.dex */
public final class j implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22136a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.e f22137b;

    public /* synthetic */ j(Jb.e eVar, int i11) {
        this.f22136a = i11;
        this.f22137b = eVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f22136a) {
            case 0:
                return new i(Jb.d.a((Jb.f) this.f22137b));
            case 1:
                return new C7278a((M90.a) ((Jb.f) this.f22137b).get());
            default:
                return new C7525i1((Map) ((Jb.h) this.f22137b).get());
        }
    }
}
