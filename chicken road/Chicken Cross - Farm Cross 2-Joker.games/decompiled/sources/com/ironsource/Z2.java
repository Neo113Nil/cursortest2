package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class Z2 implements InterfaceC4718wg {

    /* renamed from: a, reason: collision with root package name */
    private final Ab f8038a;
    private final AdSize b;

    static final class a extends Lambda implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8039a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4635s5.f8523a.a("Load task config is null");
        }
    }

    static final class b extends Lambda implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f8040a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4635s5.f8523a.l();
        }
    }

    public Z2(Ab ab, AdSize adSize) {
        this.f8038a = ab;
        this.b = adSize;
    }

    @Override // com.ironsource.InterfaceC4718wg
    public void a() {
        a(this.f8038a != null, a.f8039a);
        a(this.b != null, b.f8040a);
    }
}
