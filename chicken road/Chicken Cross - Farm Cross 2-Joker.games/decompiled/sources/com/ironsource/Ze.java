package com.ironsource;

import com.ironsource.I8;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ze implements I8, I8.a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Integer> f8051a = new HashMap();
    private final Map<String, Integer> b = new HashMap();

    @Override // com.ironsource.I8.a
    public void a(List<? extends I8.b> smashes) {
        Intrinsics.checkNotNullParameter(smashes, "smashes");
        for (I8.b bVar : smashes) {
            this.f8051a.put(bVar.c(), 0);
            this.b.put(bVar.c(), Integer.valueOf(bVar.b()));
        }
    }

    @Override // com.ironsource.I8
    public boolean b(I8.b smash) {
        boolean z;
        Intrinsics.checkNotNullParameter(smash, "smash");
        synchronized (this) {
            String c = smash.c();
            if (this.f8051a.containsKey(c)) {
                Integer num = this.f8051a.get(c);
                Intrinsics.checkNotNull(num);
                z = num.intValue() >= smash.b();
            }
        }
        return z;
    }

    @Override // com.ironsource.I8.a
    public void a(I8.b smash) {
        Intrinsics.checkNotNullParameter(smash, "smash");
        synchronized (this) {
            String c = smash.c();
            if (this.f8051a.containsKey(c)) {
                Map<String, Integer> map = this.f8051a;
                Integer num = map.get(c);
                Intrinsics.checkNotNull(num);
                map.put(c, Integer.valueOf(num.intValue() + 1));
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ironsource.I8
    public boolean a() {
        for (String str : this.b.keySet()) {
            Integer num = this.f8051a.get(str);
            Intrinsics.checkNotNull(num);
            int intValue = num.intValue();
            Integer num2 = this.b.get(str);
            Intrinsics.checkNotNull(num2);
            if (intValue < num2.intValue()) {
                return false;
            }
        }
        return true;
    }
}
