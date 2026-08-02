package F5;

import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class A extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ B5.g f8981d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f8982e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f8983f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f8984g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(B5.g gVar, Context context, String str, String str2, kotlin.coroutines.d<? super A> dVar) {
        super(2, dVar);
        this.f8981d = gVar;
        this.f8982e = context;
        this.f8983f = str;
        this.f8984g = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new A(this.f8981d, this.f8982e, this.f8983f, this.f8984g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((A) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        for (H5.c cVar : ((HashMap) this.f8981d.g()).values()) {
            Context context = this.f8982e;
            Intrinsics.f(cVar);
            try {
                Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), this.f8983f + cVar.a() + this.f8984g);
                try {
                    Intrinsics.f(createFromAsset);
                    String c11 = cVar.c();
                    Intrinsics.checkNotNullExpressionValue(c11, "getStyle(...)");
                    int i11 = 0;
                    boolean t2 = kotlin.text.h.t(c11, "Italic", false);
                    boolean t11 = kotlin.text.h.t(c11, "Bold", false);
                    if (t2 && t11) {
                        i11 = 3;
                    } else if (t2) {
                        i11 = 2;
                    } else if (t11) {
                        i11 = 1;
                    }
                    if (createFromAsset.getStyle() != i11) {
                        createFromAsset = Typeface.create(createFromAsset, i11);
                    }
                    cVar.e(createFromAsset);
                } catch (Exception unused) {
                    O5.c.b();
                }
            } catch (Exception unused2) {
                O5.c.b();
            }
        }
        return Unit.f71690a;
    }
}
