package E0;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import org.jetbrains.annotations.NotNull;

/* renamed from: E0.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2925h0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static Function1<? super View, Object> f7248a = a.f7250a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f7249b = 0;

    /* renamed from: E0.h0$a */
    /* synthetic */ class a extends C7735q implements Function1<View, C2913b0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7250a = new a(1, C2913b0.class, "<init>", "<init>(Landroid/view/View;)V", 0);

        @Override // kotlin.jvm.functions.Function1
        public final C2913b0 invoke(View view) {
            return new C2913b0(view);
        }
    }

    @NotNull
    public static final Function1<View, Object> a() {
        return f7248a;
    }
}
