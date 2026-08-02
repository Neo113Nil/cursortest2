package Sf0;

import S0.B1;
import androidx.lifecycle.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final B1 f26230a = new B1(a.f26231b);

    static final class a extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f26231b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            throw new IllegalStateException("LocalViewModelFactory should be provided");
        }
    }

    @NotNull
    public static final B1 a() {
        return f26230a;
    }
}
