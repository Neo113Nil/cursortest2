package com.vungle.ads.internal;

import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleError;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class t2 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v2 f12132a;
    public final /* synthetic */ VungleError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(v2 v2Var, VungleError vungleError) {
        super(0);
        this.f12132a = v2Var;
        this.b = vungleError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.b("VungleInitializer", "onError");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12132a.c;
        VungleError vungleError = this.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((InitializationListener) it.next()).onError(vungleError);
        }
        this.f12132a.c.clear();
        return Unit.INSTANCE;
    }
}
