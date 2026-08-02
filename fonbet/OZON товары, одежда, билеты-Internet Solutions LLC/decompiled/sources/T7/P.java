package T7;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.z;
import io.sentry.android.core.util.a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes.dex */
public final /* synthetic */ class P implements z.a, AbstractC5887f.a, a.InterfaceC1104a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26753a;

    public /* synthetic */ P(int i11) {
        this.f26753a = i11;
    }

    public static int c(OzonSpannableString ozonSpannableString, int i11, int i12) {
        return (ozonSpannableString.hashCode() + i11) * i12;
    }

    public static RecyclerView.C e(RecyclerView recyclerView, String str, RecyclerView.A a11, String str2, View view) {
        Intrinsics.checkNotNullParameter(recyclerView, str);
        Intrinsics.checkNotNullParameter(a11, str2);
        return recyclerView.getChildViewHolder(view);
    }

    public static String f(StringBuilder sb2, Map map, String str) {
        sb2.append(map);
        sb2.append(str);
        return sb2.toString();
    }

    @Override // io.sentry.android.core.util.a.InterfaceC1104a
    public Object a(Context context) {
        PackageManager.PackageInfoFlags of2;
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            of2 = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = packageManager.getPackageInfo(packageName, of2);
            return packageInfo;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.google.crypto.tink.internal.z.a
    public com.google.crypto.tink.internal.G b(S7.q qVar) {
        switch (this.f26753a) {
            case 0:
                return S.c((O) qVar);
            default:
                return U7.g.a((r) qVar);
        }
    }

    @Override // com.google.crypto.tink.internal.AbstractC5887f.a
    public He.g d(com.google.crypto.tink.internal.F f7, S7.r rVar) {
        return Z7.a.a(f7, rVar);
    }
}
