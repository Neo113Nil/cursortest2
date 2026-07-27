package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.gh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0672gh extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final Ce f8278b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtobufStateStorage f8279c;

    /* renamed from: d, reason: collision with root package name */
    public final G2 f8280d;

    /* renamed from: e, reason: collision with root package name */
    public final C0786l2 f8281e;

    /* renamed from: f, reason: collision with root package name */
    public final C1147z2 f8282f;

    public C0672gh(C0608e5 c0608e5, Ce ce) {
        this(c0608e5, ce, ((Vm) Tm.a(C0554c2.class)).create(c0608e5.getContext()), new G2(c0608e5.getContext()), new C0786l2(), new C1147z2(c0608e5.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        C0608e5 c0608e5 = this.f7670a;
        c0608e5.f8086b.toString();
        if (!c0608e5.f8104t.c() || !c0608e5.x()) {
            return false;
        }
        C0554c2 c0554c2 = (C0554c2) this.f8279c.read();
        List list = c0554c2.f7968a;
        F2 f22 = c0554c2.f7969b;
        G2 g22 = this.f8280d;
        g22.getClass();
        C0554c2 c0554c22 = null;
        F2 a6 = AndroidUtils.isApiAchieved(28) ? C2.a(g22.f6820a, g22.f6821b) : null;
        List list2 = c0554c2.f7970c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f8282f.f9616a, "getting available providers", "location manager", Collections.emptyList(), new C1122y2());
        Ce ce = this.f8278b;
        Context context = this.f7670a.f8085a;
        ce.getClass();
        ArrayList a7 = new Ui(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(a7, list)) {
            a7 = null;
        }
        if (a7 != null || !AbstractC0860no.a(f22, a6) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (a7 != null) {
                list = a7;
            }
            c0554c22 = new C0554c2(list, a6, list3);
        }
        if (c0554c22 != null) {
            C0948r9 c0948r9 = c0608e5.f8098n;
            W5 a8 = W5.a(w5, c0554c22.f7968a, c0554c22.f7969b, this.f8281e, c0554c22.f7970c);
            c0948r9.a(a8, Wk.a(c0948r9.f9150c.b(a8), a8.f7656i));
            long currentTimeSeconds = c0948r9.f9157j.currentTimeSeconds();
            c0948r9.f9159l = currentTimeSeconds;
            c0948r9.f9148a.a(currentTimeSeconds).b();
            this.f8279c.save(c0554c22);
            return false;
        }
        if (!c0608e5.A()) {
            return false;
        }
        C0948r9 c0948r92 = c0608e5.f8098n;
        W5 a9 = W5.a(w5, c0554c2.f7968a, c0554c2.f7969b, this.f8281e, c0554c2.f7970c);
        c0948r92.a(a9, Wk.a(c0948r92.f9150c.b(a9), a9.f7656i));
        long currentTimeSeconds2 = c0948r92.f9157j.currentTimeSeconds();
        c0948r92.f9159l = currentTimeSeconds2;
        c0948r92.f9148a.a(currentTimeSeconds2).b();
        return false;
    }

    public C0672gh(C0608e5 c0608e5, Ce ce, ProtobufStateStorage protobufStateStorage, G2 g22, C0786l2 c0786l2, C1147z2 c1147z2) {
        super(c0608e5);
        this.f8278b = ce;
        this.f8279c = protobufStateStorage;
        this.f8280d = g22;
        this.f8281e = c0786l2;
        this.f8282f = c1147z2;
    }
}
