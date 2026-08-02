package D3;

import android.os.Parcel;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.squareup.moshi.E;
import com.squareup.moshi.Moshi;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ru.ozon.android.inAppUpdate.internal.ui.blocking.OzonInAppUpdateSdkBlockingActivity;
import ru.ozon.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes8.dex */
public final /* synthetic */ class g implements w3.k, io.sentry.transport.e, D {
    public static IObjectWrapper b(Parcel parcel) {
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return asInterface;
    }

    public static Object c(Class cls, Moshi moshi, com.squareup.moshi.n nVar) {
        return E.a(moshi, N.l(cls)).fromJson(nVar);
    }

    public static String d(StringBuilder sb2, Boolean bool, String str) {
        sb2.append(bool);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder e(String str, Boolean bool, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(bool);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static StringBuilder f(String str, TextDTO textDTO, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(textDTO);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static StringBuilder g(String str, TextDTO textDTO, String str2, TextDTO textDTO2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(textDTO);
        sb2.append(str2);
        sb2.append(textDTO2);
        sb2.append(str3);
        return sb2;
    }

    public static Pair h(int i11, String str) {
        return new Pair(str, new StyleParser.ColorPalette.Color.Themed(i11));
    }

    public static void i(String str, String str2, StringBuilder sb2, TextDTO textDTO, TextDTO textDTO2) {
        sb2.append(str);
        sb2.append(textDTO);
        sb2.append(str2);
        sb2.append(textDTO2);
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        int i11 = OzonInAppUpdateSdkBlockingActivity.f83828j;
        androidx.core.graphics.d a11 = Ql.c.a(view, "v", c5353y0, "insets", 7);
        Intrinsics.checkNotNullExpressionValue(a11, "getInsets(...)");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), a11.f42129d);
        return c5353y0;
    }
}
