package T1;

import U1.f;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements R1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2782a;

    @Override // R1.a
    public final void a(Object obj, Object obj2) {
        switch (this.f2782a) {
            case 0:
                throw new R1.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                R1.e eVar = (R1.e) obj2;
                eVar.a(f.f3157g, entry.getKey());
                eVar.a(f.f3158h, entry.getValue());
                return;
            default:
                throw new R1.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
