package a00;

import Sc.InterfaceC4008j;
import androidx.lifecycle.A0;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class j {

    static final class a extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B0 f36139b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B0 b02) {
            super(0);
            this.f36139b = b02;
        }

        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return this.f36139b.getViewModelStore();
        }
    }

    @NotNull
    public static final <VM extends w0> InterfaceC4008j<VM> a(@NotNull B0 b02, @NotNull kotlin.reflect.d<VM> clazz, @NotNull Function0<? extends VM> provider) {
        Intrinsics.checkNotNullParameter(b02, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new g(clazz, new a(b02), provider);
    }
}
