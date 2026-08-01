package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.core.content.ContextCompat;
import com.moloco.sdk.common_adapter_internal.ScreenData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11578a;

    public r(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11578a = context;
    }

    public final DisplayMetrics a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public final DisplayMetrics b(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.density = this.f11578a.getResources().getDisplayMetrics().density;
        displayMetrics.densityDpi = this.f11578a.getResources().getDisplayMetrics().densityDpi;
        displayMetrics.widthPixels = windowManager.getCurrentWindowMetrics().getBounds().width();
        displayMetrics.heightPixels = windowManager.getCurrentWindowMetrics().getBounds().height();
        return displayMetrics;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public ScreenData invoke() {
        WindowManager windowManager = (WindowManager) ContextCompat.getSystemService(this.f11578a, WindowManager.class);
        if (windowManager == null) {
            return new ScreenData(0, 0, 0.0f, 0.0f, 0, 0.0f);
        }
        DisplayMetrics b = Build.VERSION.SDK_INT >= 30 ? b(windowManager) : a(windowManager);
        int i = b.widthPixels;
        return new ScreenData(i, b.heightPixels, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C.b(i, b.density), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C.b(b.heightPixels, b.density), b.densityDpi, b.density);
    }
}
