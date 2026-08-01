package com.ironsource;

import com.ironsource.Ff;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface Df {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Ff.a f7602a;
        private boolean b;

        public a(Ff.a onCancel) {
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            this.f7602a = onCancel;
        }

        public final void a() {
            this.f7602a.cancel();
            this.b = true;
        }

        public final boolean b() {
            return this.b;
        }
    }

    default <T> a a(T owner, long j, Function1<? super T, Unit> block) {
        Runnable b;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(block, "block");
        b = Ef.b(owner, block);
        return b(b, j);
    }

    a a(Runnable runnable, long j);

    a b(Runnable runnable, long j);
}
