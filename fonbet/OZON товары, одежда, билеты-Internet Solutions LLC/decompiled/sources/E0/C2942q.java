package E0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: E0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2942q {
    public static RecyclerView.g a(RecyclerView recyclerView, String str, RecyclerView.A a11, String str2) {
        Intrinsics.checkNotNullParameter(recyclerView, str);
        Intrinsics.checkNotNullParameter(a11, str2);
        return recyclerView.getAdapter();
    }

    public static String b(float f7, String str, String str2) {
        return str + f7 + str2;
    }

    public static String c(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, str2);
        return sb3;
    }

    public static StringBuilder d(long j11, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(j11);
        return sb2;
    }

    public static StringBuilder e(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static void f(StringBuilder sb2, String str, long j11, String str2) {
        sb2.append(str);
        sb2.append(j11);
        sb2.append(str2);
    }
}
