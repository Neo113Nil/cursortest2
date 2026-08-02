package E0;

import android.os.Build;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: E0.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2951v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static Function1<? super View, ? extends InterfaceC2945s> f7309a = a.f7310b;

    /* renamed from: E0.v$a */
    static final class a extends AbstractC7737t implements Function1<View, InterfaceC2945s> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f7310b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC2945s invoke(View view) {
            View view2 = view;
            return Build.VERSION.SDK_INT >= 34 ? new C2949u(view2) : new C2947t(view2);
        }
    }

    @NotNull
    public static final InterfaceC2945s a(@NotNull View view) {
        return (InterfaceC2945s) ((a) f7309a).invoke(view);
    }
}
