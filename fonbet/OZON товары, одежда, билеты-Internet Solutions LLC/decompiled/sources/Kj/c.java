package Kj;

import Jj.b;
import Sc.o;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonuikitcore.OzonGradient;
import ru.ozon.android.uikit.common.StyleParser;
import ru.ozon.android.uikit.extensions.ThemeExtKt;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f15995a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f15996b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f15997c = 0;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15998a;

        static {
            int[] iArr = new int[Fj.a.values().length];
            try {
                iArr[Fj.a.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Fj.a.TR_BL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Fj.a.RIGHT_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Fj.a.BR_TL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Fj.a.BOTTOM_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Fj.a.BL_TR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Fj.a.LEFT_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Fj.a.TL_BR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f15998a = iArr;
            int[] iArr2 = new int[GradientDrawable.Orientation.values().length];
            try {
                iArr2[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[GradientDrawable.Orientation.TR_BL.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[GradientDrawable.Orientation.RIGHT_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[GradientDrawable.Orientation.BR_TL.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[GradientDrawable.Orientation.BL_TR.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[GradientDrawable.Orientation.TL_BR.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    static {
        Xc.a<Fj.e> a11 = Fj.e.a();
        int h11 = U.h(C7714v.z(a11, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (Object obj : a11) {
            linkedHashMap.put(((Fj.e) obj).d(), obj);
        }
        f15995a = linkedHashMap;
        Xc.a<Fj.d> a12 = Fj.d.a();
        int h12 = U.h(C7714v.z(a12, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h12 >= 16 ? h12 : 16);
        for (Object obj2 : a12) {
            linkedHashMap2.put(((Fj.d) obj2).d(), obj2);
        }
        f15996b = linkedHashMap2;
    }

    public static final OzonGradient a(@NotNull String gradientToken) {
        Intrinsics.checkNotNullParameter(gradientToken, "gradientToken");
        Fj.e eVar = (Fj.e) f15995a.get(gradientToken);
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @NotNull
    public static final b.a b(@NotNull OzonGradient ozonGradient, @NotNull Context context) {
        List<String> lightValues;
        GradientDrawable.Orientation orientation;
        int intValue;
        Intrinsics.checkNotNullParameter(ozonGradient, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 29) {
            lightValues = ThemeExtKt.isDarkThemeActive(context) ? ozonGradient.getDarkColorTokens() : ozonGradient.getLightColorTokens();
        } else if (ThemeExtKt.isDarkThemeActive(context)) {
            lightValues = ozonGradient.getDarkValues();
            List<String> list = lightValues;
            if (list == null || list.isEmpty()) {
                lightValues = null;
            }
            if (lightValues == null) {
                lightValues = ozonGradient.getLightValues();
            }
        } else {
            lightValues = ozonGradient.getLightValues();
        }
        List<String> list2 = lightValues;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (String str : list2) {
            Fj.d dVar = (Fj.d) f15996b.get(str);
            Integer valueOf = dVar != null ? Integer.valueOf(dVar.b()) : null;
            if (valueOf != null) {
                int intValue2 = valueOf.intValue();
                Intrinsics.checkNotNullParameter(context, "context");
                intValue = androidx.core.content.a.getColor(context, intValue2);
            } else {
                Integer parseColor = StyleParser.INSTANCE.parseColor(context, str);
                intValue = parseColor != null ? parseColor.intValue() : 0;
            }
            arrayList.add(Integer.valueOf(intValue));
        }
        int[] T02 = C7714v.T0(arrayList);
        Fj.a gradientDirection = ozonGradient.getGradientDirection();
        if (gradientDirection == null) {
            gradientDirection = Fj.a.TOP_BOTTOM;
        }
        Intrinsics.checkNotNullParameter(gradientDirection, "<this>");
        switch (a.f15998a[gradientDirection.ordinal()]) {
            case 1:
                orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                break;
            case 2:
                orientation = GradientDrawable.Orientation.TR_BL;
                break;
            case 3:
                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                break;
            case 4:
                orientation = GradientDrawable.Orientation.BR_TL;
                break;
            case 5:
                orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                break;
            case 6:
                orientation = GradientDrawable.Orientation.BL_TR;
                break;
            case 7:
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                break;
            case 8:
                orientation = GradientDrawable.Orientation.TL_BR;
                break;
            default:
                throw new o();
        }
        return new b.a(T02, orientation, C7714v.R0(ozonGradient.getPositions()));
    }
}
