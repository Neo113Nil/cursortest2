package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ironsource.y9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4747y9 implements InterfaceC4718wg {

    /* renamed from: a, reason: collision with root package name */
    private final Ab f8777a;

    /* renamed from: com.ironsource.y9$a */
    static final class a extends Lambda implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8778a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4635s5.f8523a.b("Load task config is null");
        }
    }

    public C4747y9(Ab ab) {
        this.f8777a = ab;
    }

    @Override // com.ironsource.InterfaceC4718wg
    public void a() {
        a(this.f8777a != null, a.f8778a);
    }
}
