package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.km, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0780km implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Ee f8638a = new Ee();

    /* renamed from: b, reason: collision with root package name */
    public final C0820ma f8639b = new C0820ma();

    /* renamed from: c, reason: collision with root package name */
    public final Lm f8640c = new Lm();

    /* renamed from: d, reason: collision with root package name */
    public final C0839n3 f8641d = new C0839n3();

    /* renamed from: e, reason: collision with root package name */
    public final C1045v2 f8642e = new C1045v2();

    /* renamed from: f, reason: collision with root package name */
    public final D6 f8643f = new D6();

    /* renamed from: g, reason: collision with root package name */
    public final Hm f8644g = new Hm();

    /* renamed from: h, reason: collision with root package name */
    public final C1082wd f8645h = new C1082wd();

    /* renamed from: i, reason: collision with root package name */
    public final J9 f8646i = new J9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Am fromModel(C0858nm c0858nm) {
        Am am = new Am();
        am.f6565s = c0858nm.f8894u;
        am.f6566t = c0858nm.f8895v;
        String str = c0858nm.f8874a;
        if (str != null) {
            am.f6547a = str;
        }
        List list = c0858nm.f8879f;
        if (list != null) {
            am.f6552f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c0858nm.f8880g;
        if (list2 != null) {
            am.f6553g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c0858nm.f8875b;
        if (list3 != null) {
            am.f6549c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c0858nm.f8881h;
        if (list4 != null) {
            am.f6561o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c0858nm.f8882i;
        if (map != null) {
            am.f6554h = this.f8643f.fromModel(map);
        }
        De de = c0858nm.f8892s;
        if (de != null) {
            am.f6568v = this.f8638a.fromModel(de);
        }
        String str2 = c0858nm.f8883j;
        if (str2 != null) {
            am.f6556j = str2;
        }
        String str3 = c0858nm.f8876c;
        if (str3 != null) {
            am.f6550d = str3;
        }
        String str4 = c0858nm.f8877d;
        if (str4 != null) {
            am.f6551e = str4;
        }
        String str5 = c0858nm.f8878e;
        if (str5 != null) {
            am.f6564r = str5;
        }
        am.f6555i = this.f8639b.fromModel(c0858nm.f8886m);
        String str6 = c0858nm.f8884k;
        if (str6 != null) {
            am.f6557k = str6;
        }
        String str7 = c0858nm.f8885l;
        if (str7 != null) {
            am.f6558l = str7;
        }
        am.f6559m = c0858nm.f8889p;
        am.f6548b = c0858nm.f8887n;
        am.f6563q = c0858nm.f8888o;
        RetryPolicyConfig retryPolicyConfig = c0858nm.f8893t;
        am.f6569w = retryPolicyConfig.maxIntervalSeconds;
        am.f6570x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c0858nm.f8890q;
        if (str8 != null) {
            am.f6560n = str8;
        }
        Km km = c0858nm.f8891r;
        if (km != null) {
            this.f8640c.getClass();
            C1167zm c1167zm = new C1167zm();
            c1167zm.f9676a = km.f7051a;
            am.f6562p = c1167zm;
        }
        am.f6567u = c0858nm.f8896w;
        C0787l3 c0787l3 = c0858nm.f8897x;
        if (c0787l3 != null) {
            this.f8641d.getClass();
            C0987sm c0987sm = new C0987sm();
            c0987sm.f9267a = c0787l3.f8653a;
            am.f6571y = c0987sm;
        }
        C1019u2 c1019u2 = c0858nm.f8898y;
        if (c1019u2 != null) {
            am.z = this.f8642e.fromModel(c1019u2);
        }
        am.f6544A = this.f8644g.fromModel(c0858nm.z);
        am.f6545B = this.f8645h.fromModel(c0858nm.f8872A);
        am.f6546C = this.f8646i.fromModel(c0858nm.f8873B);
        return am;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0858nm toModel(Am am) {
        C0832mm c0832mm = new C0832mm(this.f8639b.toModel(am.f6555i));
        c0832mm.f8801a = am.f6547a;
        c0832mm.f8810j = am.f6556j;
        c0832mm.f8803c = am.f6550d;
        c0832mm.f8802b = Arrays.asList(am.f6549c);
        c0832mm.f8807g = Arrays.asList(am.f6553g);
        c0832mm.f8806f = Arrays.asList(am.f6552f);
        c0832mm.f8804d = am.f6551e;
        c0832mm.f8805e = am.f6564r;
        c0832mm.f8808h = Arrays.asList(am.f6561o);
        c0832mm.f8811k = am.f6557k;
        c0832mm.f8812l = am.f6558l;
        c0832mm.f8817q = am.f6559m;
        c0832mm.f8815o = am.f6548b;
        c0832mm.f8816p = am.f6563q;
        c0832mm.f8820t = am.f6565s;
        c0832mm.f8821u = am.f6566t;
        c0832mm.f8818r = am.f6560n;
        c0832mm.f8822v = am.f6567u;
        c0832mm.f8823w = new RetryPolicyConfig(am.f6569w, am.f6570x);
        c0832mm.f8809i = this.f8643f.toModel(am.f6554h);
        C1117xm c1117xm = am.f6568v;
        if (c1117xm != null) {
            this.f8638a.getClass();
            c0832mm.f8814n = new De(c1117xm.f9581a, c1117xm.f9582b);
        }
        C1167zm c1167zm = am.f6562p;
        if (c1167zm != null) {
            this.f8640c.getClass();
            c0832mm.f8819s = new Km(c1167zm.f9676a);
        }
        C0987sm c0987sm = am.f6571y;
        if (c0987sm != null) {
            this.f8641d.getClass();
            c0832mm.f8824x = new C0787l3(c0987sm.f9267a);
        }
        C0961rm c0961rm = am.z;
        if (c0961rm != null) {
            c0832mm.f8825y = this.f8642e.toModel(c0961rm);
        }
        C1142ym c1142ym = am.f6544A;
        if (c1142ym != null) {
            this.f8644g.getClass();
            c0832mm.z = new Gm(c1142ym.f9604a);
        }
        c0832mm.f8799A = this.f8645h.toModel(am.f6545B);
        C1039um c1039um = am.f6546C;
        if (c1039um != null) {
            this.f8646i.getClass();
            c0832mm.f8800B = new I9(c1039um.f9419a);
        }
        return new C0858nm(c0832mm);
    }
}
