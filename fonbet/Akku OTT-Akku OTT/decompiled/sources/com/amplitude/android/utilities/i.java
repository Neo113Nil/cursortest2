package com.amplitude.android.utilities;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Deprecated(message = "This class is deprecated and will be removed in future releases.")
@SourceDebugExtension({"SMAP\nDefaultEventUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultEventUtils.kt\ncom/amplitude/android/utilities/DefaultEventUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,486:1\n1#2:487\n*E\n"})
/* loaded from: classes3.dex */
public final class i {
    public static final a Companion = new a();
    public final com.amplitude.android.a a;
    public final Lazy b;

    public static final class a {
        public static String a(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "<this>");
            try {
                ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128);
                Intrinsics.checkNotNullExpressionValue(activityInfo, "getActivityInfo(...)");
                CharSequence title = activity.getTitle();
                Intrinsics.checkNotNullExpressionValue(title, "getTitle(...)");
                if (!StringsKt.isBlank(title)) {
                    return activity.getTitle().toString();
                }
                int i = activityInfo.labelRes;
                if (i != 0) {
                    String string = activity.getString(i);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    return string;
                }
                CharSequence nonLocalizedLabel = activityInfo.nonLocalizedLabel;
                Intrinsics.checkNotNullExpressionValue(nonLocalizedLabel, "nonLocalizedLabel");
                if (!StringsKt.isBlank(nonLocalizedLabel)) {
                    return activityInfo.nonLocalizedLabel.toString();
                }
                String name = activityInfo.name;
                Intrinsics.checkNotNullExpressionValue(name, "name");
                if (StringsKt.isBlank(name)) {
                    String localClassName = activity.getLocalClassName();
                    Intrinsics.checkNotNullExpressionValue(localClassName, "getLocalClassName(...)");
                    return localClassName;
                }
                String name2 = activityInfo.name;
                Intrinsics.checkNotNullExpressionValue(name2, "name");
                return name2;
            } catch (Exception unused) {
                return activity.getApplicationInfo().loadLabel(activity.getPackageManager()).toString();
            }
        }
    }

    public static final class b extends Lambda implements Function0<Boolean> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(n.a("androidx.fragment.app.FragmentActivity", i.this.a.i()));
        }
    }

    public i(com.amplitude.android.a amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        this.a = amplitude;
        this.b = LazyKt.lazy(new b());
    }

    public final void a(PackageInfo packageInfo, boolean z) {
        Object valueOf;
        long longVersionCode;
        Intrinsics.checkNotNullParameter(packageInfo, "packageInfo");
        String str = packageInfo.versionName;
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = Long.valueOf(longVersionCode);
        } else {
            valueOf = Integer.valueOf(packageInfo.versionCode);
        }
        com.amplitude.core.b.m(this.a, "[Amplitude] Application Opened", MapsKt.mapOf(TuplesKt.to("[Amplitude] From Background", Boolean.valueOf(z)), TuplesKt.to("[Amplitude] Version", str), TuplesKt.to("[Amplitude] Build", valueOf.toString())), 4);
    }

    public final void b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = activity.getIntent();
        if (intent != null) {
            Uri referrer = activity.getReferrer();
            String uri = referrer != null ? referrer.toString() : null;
            Uri data = intent.getData();
            if (data != null) {
                String uri2 = data.toString();
                Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                com.amplitude.core.b.m(this.a, "[Amplitude] Deep Link Opened", MapsKt.mapOf(TuplesKt.to("[Amplitude] Link URL", uri2), TuplesKt.to("[Amplitude] Link Referrer", uri)), 4);
            }
        }
    }
}
