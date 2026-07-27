package l1;

import j1.InterfaceC1056d;
import j1.InterfaceC1058f;
import j1.InterfaceC1059g;
import java.util.Date;
import java.util.HashMap;
import k1.InterfaceC1081a;

/* loaded from: classes.dex */
public final class d implements InterfaceC1081a {
    public static final b f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f9921g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9923a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9924b;

    /* renamed from: c, reason: collision with root package name */
    public final C1107a f9925c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9926d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1107a f9920e = new C1107a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f9922h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [l1.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l1.b] */
    static {
        final int i3 = 0;
        f = new InterfaceC1058f() { // from class: l1.b
            @Override // j1.InterfaceC1053a
            public final void a(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        ((InterfaceC1059g) obj2).b((String) obj);
                        break;
                    default:
                        ((InterfaceC1059g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i4 = 1;
        f9921g = new InterfaceC1058f() { // from class: l1.b
            @Override // j1.InterfaceC1053a
            public final void a(Object obj, Object obj2) {
                switch (i4) {
                    case 0:
                        ((InterfaceC1059g) obj2).b((String) obj);
                        break;
                    default:
                        ((InterfaceC1059g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f9923a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f9924b = hashMap2;
        this.f9925c = f9920e;
        this.f9926d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f9921g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f9922h);
        hashMap.remove(Date.class);
    }

    public final InterfaceC1081a a(Class cls, InterfaceC1056d interfaceC1056d) {
        this.f9923a.put(cls, interfaceC1056d);
        this.f9924b.remove(cls);
        return this;
    }
}
