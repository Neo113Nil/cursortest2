package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private static final int f36987a = Color.argb(230, 255, 255, 255);

    /* renamed from: b, reason: collision with root package name */
    private static final int f36988b = Color.argb(UserVerificationMethods.USER_VERIFY_PATTERN, 27, 27, 27);

    public static void a(ActivityC5043j activityC5043j) {
        N detectDarkMode = N.f36943b;
        Intrinsics.checkNotNullParameter(detectDarkMode, "detectDarkMode");
        O statusBarStyle = new O(0, 0, detectDarkMode);
        Intrinsics.checkNotNullParameter(detectDarkMode, "detectDarkMode");
        O navigationBarStyle = new O(f36987a, f36988b, detectDarkMode);
        Intrinsics.checkNotNullParameter(activityC5043j, "<this>");
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        View decorView = activityC5043j.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        Function1<Resources, Boolean> a11 = statusBarStyle.a();
        Resources resources = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "view.resources");
        boolean booleanValue = a11.invoke(resources).booleanValue();
        Function1<Resources, Boolean> a12 = navigationBarStyle.a();
        Resources resources2 = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "view.resources");
        boolean booleanValue2 = a12.invoke(resources2).booleanValue();
        int i11 = Build.VERSION.SDK_INT;
        u a13 = i11 >= 30 ? new A() : i11 >= 29 ? new y() : i11 >= 28 ? new w() : new u();
        Window window = activityC5043j.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        a13.b(statusBarStyle, navigationBarStyle, window, decorView, booleanValue, booleanValue2);
        Window window2 = activityC5043j.getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "window");
        a13.a(window2);
    }
}
