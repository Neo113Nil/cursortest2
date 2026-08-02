package org.betup.utils;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.model.domain.RemoteConfigConstants;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: GoogleSignInDeviceHelper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lorg/betup/utils/GoogleSignInDeviceHelper;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "DEFAULT_LEGACY_MANUFACTURERS", "", "shouldUseLegacyGoogleSignIn", "", "context", "Landroid/content/Context;", "getLegacyManufacturersFromRemoteConfig", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GoogleSignInDeviceHelper {
    private static final String TAG = "GoogleSignInDevice";
    public static final GoogleSignInDeviceHelper INSTANCE = new GoogleSignInDeviceHelper();
    private static final Set<String> DEFAULT_LEGACY_MANUFACTURERS = SetsKt.setOf((Object[]) new String[]{"xiaomi", "redmi", "poco", "realme", "oppo"});
    public static final int $stable = 8;

    private GoogleSignInDeviceHelper() {
    }

    @JvmStatic
    public static final boolean shouldUseLegacyGoogleSignIn(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = Build.MANUFACTURER;
        if (str == null) {
            str = "";
        }
        String obj = StringsKt.trim((CharSequence) str).toString();
        String str2 = Build.BRAND;
        String obj2 = StringsKt.trim((CharSequence) (str2 != null ? str2 : "")).toString();
        Set<String> legacyManufacturersFromRemoteConfig = INSTANCE.getLegacyManufacturersFromRemoteConfig(context);
        boolean z = false;
        if (!(legacyManufacturersFromRemoteConfig instanceof Collection) || !legacyManufacturersFromRemoteConfig.isEmpty()) {
            for (String str3 : legacyManufacturersFromRemoteConfig) {
                if (StringsKt.equals(obj, str3, true) || StringsKt.equals(obj2, str3, true)) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            Log.d(TAG, "Device " + obj + "/" + obj2 + " in legacy list - using Legacy Google Sign-In");
        }
        return z;
    }

    private final Set<String> getLegacyManufacturersFromRemoteConfig(Context context) {
        try {
            FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
            Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "getInstance(...)");
            String string = firebaseRemoteConfig.getString(RemoteConfigConstants.GOOGLE_SIGN_IN_LEGACY_MANUFACTURERS);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            if (StringsKt.isBlank(string)) {
                return DEFAULT_LEGACY_MANUFACTURERS;
            }
            List split$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
            Iterator it = split$default.iterator();
            while (it.hasNext()) {
                String lowerCase = StringsKt.trim((CharSequence) it.next()).toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                arrayList.add(lowerCase);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            return CollectionsKt.toSet(arrayList2);
        } catch (Exception e) {
            Log.w(TAG, "Failed to read Remote Config, using default legacy list", e);
            return DEFAULT_LEGACY_MANUFACTURERS;
        }
    }
}
