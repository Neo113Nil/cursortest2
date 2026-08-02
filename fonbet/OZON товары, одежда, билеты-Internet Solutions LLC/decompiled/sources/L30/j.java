package L30;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static int f16505a;

    /* renamed from: b, reason: collision with root package name */
    private static int f16506b;

    /* renamed from: c, reason: collision with root package name */
    private static int f16507c;

    private static String a() {
        return f16505a + ProductContainerDTO.RATIO_DELIMITER + f16506b + ProductContainerDTO.RATIO_DELIMITER + f16507c;
    }

    @NotNull
    public static String b(Context context, @NotNull O30.b fintechLibType) {
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        if (context == null) {
            return "";
        }
        String string = W30.a.a(context, fintechLibType).getString("INSETS_SP_KEY", a());
        return string == null ? a() : string;
    }

    public static int c() {
        return f16507c;
    }

    public static int d() {
        return f16505a;
    }

    public static void e(@NotNull l80.f context, @NotNull O30.b fintechLibType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        SharedPreferences.Editor edit = W30.a.a(context, fintechLibType).edit();
        edit.putString("INSETS_SP_KEY", f16505a + ProductContainerDTO.RATIO_DELIMITER + f16506b + ProductContainerDTO.RATIO_DELIMITER + f16507c);
        edit.apply();
    }

    public static void f(int i11) {
        f16507c = i11;
    }

    public static void g(int i11) {
        f16505a = i11;
    }

    public static void h(int i11) {
        f16506b = i11;
    }
}
