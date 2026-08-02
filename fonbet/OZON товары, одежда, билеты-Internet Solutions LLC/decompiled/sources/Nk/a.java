package Nk;

import H8.g;
import S0.InterfaceC3967k;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements g.a {
    public static Context a(ViewGroup viewGroup, String str, String str2) {
        Intrinsics.checkNotNullParameter(viewGroup, str);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, str2);
        return context;
    }

    public static String b(String str, String str2) {
        return str + str2;
    }

    public static void d(Function2 function2, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        interfaceC3967k.x(Integer.valueOf(i11));
        interfaceC3967k.c(Integer.valueOf(i12), function2);
    }

    @Override // H8.g.a
    public String c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }
}
