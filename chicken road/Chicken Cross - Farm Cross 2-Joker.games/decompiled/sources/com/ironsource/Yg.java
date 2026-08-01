package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface Yg {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0318a f8033a = new C0318a(null);

        /* renamed from: com.ironsource.Yg$a$a, reason: collision with other inner class name */
        public static final class C0318a {
            public /* synthetic */ C0318a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Yg a(boolean z, Rg waterfallOperations) {
                Intrinsics.checkNotNullParameter(waterfallOperations, "waterfallOperations");
                return z ? new Wg(waterfallOperations) : new Vg(waterfallOperations);
            }

            private C0318a() {
            }
        }
    }

    void a();

    void a(B b);

    Md b();

    default B c() {
        return null;
    }
}
