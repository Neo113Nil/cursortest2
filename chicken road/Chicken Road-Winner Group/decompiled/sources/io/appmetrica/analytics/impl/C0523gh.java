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
public final class C0523gh extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final Ce f7378b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtobufStateStorage f7379c;

    /* renamed from: d, reason: collision with root package name */
    public final G2 f7380d;

    /* renamed from: e, reason: collision with root package name */
    public final C0637l2 f7381e;
    public final C0998z2 f;

    public C0523gh(C0459e5 c0459e5, Ce ce) {
        this(c0459e5, ce, ((Vm) Tm.a(C0405c2.class)).create(c0459e5.getContext()), new G2(c0459e5.getContext()), new C0637l2(), new C0998z2(c0459e5.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        C0459e5 c0459e5 = this.f6796a;
        c0459e5.f7194b.toString();
        if (!c0459e5.f7211t.c() || !c0459e5.x()) {
            return false;
        }
        C0405c2 c0405c2 = (C0405c2) this.f7379c.read();
        List list = c0405c2.f7081a;
        F2 f22 = c0405c2.f7082b;
        G2 g22 = this.f7380d;
        g22.getClass();
        C0405c2 c0405c22 = null;
        F2 a3 = AndroidUtils.isApiAchieved(28) ? C2.a(g22.f5975a, g22.f5976b) : null;
        List list2 = c0405c2.f7083c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f.f8656a, "getting available providers", "location manager", Collections.EMPTY_LIST, new C0973y2());
        Ce ce = this.f7378b;
        Context context = this.f6796a.f7193a;
        ce.getClass();
        ArrayList a4 = new Ui(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(a4, list)) {
            a4 = null;
        }
        if (a4 != null || !AbstractC0711no.a(f22, a3) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (a4 != null) {
                list = a4;
            }
            c0405c22 = new C0405c2(list, a3, list3);
        }
        if (c0405c22 != null) {
            C0799r9 c0799r9 = c0459e5.f7205n;
            W5 a5 = W5.a(w5, c0405c22.f7081a, c0405c22.f7082b, this.f7381e, c0405c22.f7083c);
            c0799r9.a(a5, Wk.a(c0799r9.f8207c.b(a5), a5.f6782i));
            long currentTimeSeconds = c0799r9.f8213j.currentTimeSeconds();
            c0799r9.f8215l = currentTimeSeconds;
            c0799r9.f8205a.a(currentTimeSeconds).b();
            this.f7379c.save(c0405c22);
            return false;
        }
        if (!c0459e5.A()) {
            return false;
        }
        C0799r9 c0799r92 = c0459e5.f7205n;
        W5 a6 = W5.a(w5, c0405c2.f7081a, c0405c2.f7082b, this.f7381e, c0405c2.f7083c);
        c0799r92.a(a6, Wk.a(c0799r92.f8207c.b(a6), a6.f6782i));
        long currentTimeSeconds2 = c0799r92.f8213j.currentTimeSeconds();
        c0799r92.f8215l = currentTimeSeconds2;
        c0799r92.f8205a.a(currentTimeSeconds2).b();
        return false;
    }

    public C0523gh(C0459e5 c0459e5, Ce ce, ProtobufStateStorage protobufStateStorage, G2 g22, C0637l2 c0637l2, C0998z2 c0998z2) {
        super(c0459e5);
        this.f7378b = ce;
        this.f7379c = protobufStateStorage;
        this.f7380d = g22;
        this.f7381e = c0637l2;
        this.f = c0998z2;
    }
}
