package Ci0;

import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Application;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f extends Zd0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f5122a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f5123b;

    static final class a extends AbstractC7737t implements Function0<d> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final d invoke() {
            return new d(f.this);
        }
    }

    public f(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f5122a = application;
        this.f5123b = k.b(new a());
    }

    @Override // Sd0.d
    @NotNull
    public final Sd0.g getSharedOutput() {
        return (Sd0.g) this.f5123b.getValue();
    }
}
