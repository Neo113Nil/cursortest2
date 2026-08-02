package F5;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class B extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ B5.g f8985d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f8986e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f8987f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(B5.g gVar, Context context, String str, kotlin.coroutines.d<? super B> dVar) {
        super(2, dVar);
        this.f8985d = gVar;
        this.f8986e = context;
        this.f8987f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new B(this.f8985d, this.f8986e, this.f8987f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((B) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        String str;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        for (B5.s sVar : ((HashMap) this.f8985d.j()).values()) {
            Intrinsics.f(sVar);
            if (sVar.a() == null) {
                String b11 = sVar.b();
                Intrinsics.f(b11);
                if (kotlin.text.h.e0(b11, "data:", false) && kotlin.text.h.J(b11, "base64,", 0, false, 6) > 0) {
                    try {
                        String substring = b11.substring(kotlin.text.h.I(',', 0, 6, b11) + 1);
                        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                        byte[] decode = Base64.decode(substring, 0);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        sVar.f(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                    } catch (IllegalArgumentException e11) {
                        O5.c.d("data URL did not have correct base64 format.", e11);
                    }
                }
            }
            Context context = this.f8986e;
            if (sVar.a() == null && (str = this.f8987f) != null) {
                String b12 = sVar.b();
                try {
                    InputStream open = context.getAssets().open(str + b12);
                    Intrinsics.f(open);
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        sVar.f(O5.g.f(sVar.e(), sVar.c(), BitmapFactory.decodeStream(open, null, options2)));
                    } catch (IllegalArgumentException e12) {
                        O5.c.d("Unable to decode image.", e12);
                    }
                } catch (IOException e13) {
                    O5.c.d("Unable to open asset.", e13);
                }
            }
        }
        return Unit.f71690a;
    }
}
