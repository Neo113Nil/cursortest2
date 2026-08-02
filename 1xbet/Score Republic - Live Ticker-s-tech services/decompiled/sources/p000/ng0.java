package p000;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ng0 implements InterfaceC0707sw {

    /* JADX INFO: renamed from: f */
    public static final lg0 f5423f;

    /* JADX INFO: renamed from: g */
    public static final lg0 f5424g;

    /* JADX INFO: renamed from: a */
    public final HashMap f5426a;

    /* JADX INFO: renamed from: b */
    public final HashMap f5427b;

    /* JADX INFO: renamed from: c */
    public final kg0 f5428c;

    /* JADX INFO: renamed from: d */
    public boolean f5429d;

    /* JADX INFO: renamed from: e */
    public static final kg0 f5422e = new kg0(0);

    /* JADX INFO: renamed from: h */
    public static final mg0 f5425h = new mg0();

    /* JADX WARN: Type inference failed for: r0v1, types: [lg0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [lg0] */
    static {
        final int i = 0;
        f5423f = new eh1() { // from class: lg0
            @Override // p000.InterfaceC0633qw
            /* JADX INFO: renamed from: a */
            public final void mo103a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((fh1) obj2).mo1791b((String) obj);
                        break;
                    default:
                        ((fh1) obj2).mo1792c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        f5424g = new eh1() { // from class: lg0
            @Override // p000.InterfaceC0633qw
            /* JADX INFO: renamed from: a */
            public final void mo103a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((fh1) obj2).mo1791b((String) obj);
                        break;
                    default:
                        ((fh1) obj2).mo1792c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public ng0() {
        HashMap map = new HashMap();
        this.f5426a = map;
        HashMap map2 = new HashMap();
        this.f5427b = map2;
        this.f5428c = f5422e;
        this.f5429d = false;
        map2.put(String.class, f5423f);
        map.remove(String.class);
        map2.put(Boolean.class, f5424g);
        map.remove(Boolean.class);
        map2.put(Date.class, f5425h);
        map.remove(Date.class);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0707sw m3537a(Class cls, ss0 ss0Var) {
        this.f5426a.put(cls, ss0Var);
        this.f5427b.remove(cls);
        return this;
    }
}
