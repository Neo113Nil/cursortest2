package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ironsource.qg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4611qg implements InterfaceC4575og {

    /* renamed from: a, reason: collision with root package name */
    public static final C4611qg f8495a = new C4611qg();
    private static final Lazy b = LazyKt.lazy(a.f8496a);

    /* renamed from: com.ironsource.qg$a */
    static final class a extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8496a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            try {
                Object invoke = Class.forName(C4593pg.f8482a).getMethod(C4593pg.b, null).invoke(null, null);
                if (invoke instanceof String) {
                    return (String) invoke;
                }
                return null;
            } catch (Throwable th) {
                C4491k4.d().a(th);
                IronLog.INTERNAL.warning(th.getMessage());
                return null;
            }
        }
    }

    private C4611qg() {
    }

    @Override // com.ironsource.InterfaceC4575og
    public String a() {
        return (String) b.getValue();
    }
}
