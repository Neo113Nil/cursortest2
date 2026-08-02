package Bl0;

import Sc.InterfaceC4008j;
import Sc.r;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Bl0.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2651l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3985a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4008j f3986b;

    /* renamed from: Bl0.l$a */
    public static final class a extends AbstractC7737t implements Function0<C2648i> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C2648i invoke() {
            Object a11;
            PackageInfo getPackageInfo;
            String value;
            PackageManager.PackageInfoFlags of2;
            C2651l c2651l = C2651l.this;
            try {
                r.Companion companion = Sc.r.INSTANCE;
                PackageManager packageManager = c2651l.f3985a.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
                String packageName = c2651l.f3985a.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
                if (Build.VERSION.SDK_INT >= 33) {
                    of2 = PackageManager.PackageInfoFlags.of(0L);
                    getPackageInfo = packageManager.getPackageInfo(packageName, of2);
                    Intrinsics.checkNotNullExpressionValue(getPackageInfo, "{\n        getPackageInfo…ageInfoFlags.of(0))\n    }");
                } else {
                    getPackageInfo = packageManager.getPackageInfo(packageName, 0);
                    Intrinsics.checkNotNullExpressionValue(getPackageInfo, "getPackageInfo");
                }
                value = getPackageInfo.versionName;
            } catch (Throwable th2) {
                r.Companion companion2 = Sc.r.INSTANCE;
                a11 = Sc.s.a(th2);
            }
            if (value == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Intrinsics.checkNotNullExpressionValue(value, "requireNotNull(context.p…packageName).versionName)");
            Intrinsics.checkNotNullParameter(value, "value");
            a11 = new C2648i(value);
            if (a11 instanceof r.b) {
                a11 = null;
            }
            C2648i c2648i = (C2648i) a11;
            String str = c2648i != null ? c2648i.f3977a : null;
            if (str != null) {
                return new C2648i(str);
            }
            return null;
        }
    }

    public C2651l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f3985a = context;
        this.f3986b = Sc.k.b(new a());
    }
}
