package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class Yd implements InterfaceC4718wg {

    /* renamed from: a, reason: collision with root package name */
    private final Ab f8029a;

    static final class a extends Lambda implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8030a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4635s5.f8523a.d("Load task config is null");
        }
    }

    public Yd(Ab ab) {
        this.f8029a = ab;
    }

    @Override // com.ironsource.InterfaceC4718wg
    public void a() {
        a(this.f8029a != null, a.f8030a);
    }
}
