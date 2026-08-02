package io.sentry.android.replay.util;

import A1.W;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import t6.h;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SystemProperties {
    public static final int $stable = 0;
    public static final SystemProperties INSTANCE = new SystemProperties();

    public enum Property {
        SOC_MODEL,
        SOC_MANUFACTURER
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Property.values().length];
            try {
                iArr[Property.SOC_MODEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Property.SOC_MANUFACTURER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SystemProperties() {
    }

    public static /* synthetic */ String get$default(SystemProperties systemProperties, Property property, String str, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = "";
        }
        return systemProperties.get(property, str);
    }

    public final String get(Property property, String str) {
        String str2;
        h.e(property, "key");
        h.e(str, "defaultValue");
        if (Build.VERSION.SDK_INT >= 31) {
            int i7 = WhenMappings.$EnumSwitchMapping$0[property.ordinal()];
            if (i7 == 1) {
                str2 = Build.SOC_MODEL;
            } else {
                if (i7 != 2) {
                    throw new W();
                }
                str2 = Build.SOC_MANUFACTURER;
            }
            str = str2;
            h.d(str, "{\n      when (key) {\n   …ANUFACTURER\n      }\n    }");
        }
        return str;
    }
}
