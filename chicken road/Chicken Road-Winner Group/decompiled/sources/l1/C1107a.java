package l1;

import j1.C1054b;
import j1.InterfaceC1056d;
import j1.InterfaceC1057e;
import java.util.Map;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1107a implements InterfaceC1056d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9917a;

    @Override // j1.InterfaceC1053a
    public final void a(Object obj, Object obj2) {
        switch (this.f9917a) {
            case 0:
                throw new C1054b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC1057e interfaceC1057e = (InterfaceC1057e) obj2;
                interfaceC1057e.a(m1.e.f10100g, entry.getKey());
                interfaceC1057e.a(m1.e.f10101h, entry.getValue());
                return;
            default:
                throw new C1054b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
