package com.amplitude.android.internal.locators;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import androidx.core.view.ViewCompat;
import com.amplitude.android.internal.c;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;

@SourceDebugExtension({"SMAP\nAndroidViewTargetLocator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewTargetLocator.kt\ncom/amplitude/android/internal/locators/AndroidViewTargetLocator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,107:1\n1#2:108\n254#3:109\n*S KotlinDebug\n*F\n+ 1 AndroidViewTargetLocator.kt\ncom/amplitude/android/internal/locators/AndroidViewTargetLocator\n*L\n94#1:109\n*E\n"})
/* loaded from: classes3.dex */
public final class a implements b {
    public static final C0036a Companion = new C0036a();
    public final int[] a = new int[2];

    /* renamed from: com.amplitude.android.internal.locators.a$a, reason: collision with other inner class name */
    public static final class C0036a {
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0199  */
    @Override // com.amplitude.android.internal.locators.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.amplitude.android.internal.c a(View view, Pair targetPosition) {
        Object m1716constructorimpl;
        String joinToString$default;
        String str;
        boolean booleanValue;
        CharSequence text;
        c.a targetType = c.a.a;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(targetPosition, "targetPosition");
        Intrinsics.checkNotNullParameter(targetType, "targetType");
        View view2 = view != null ? view : null;
        if (view2 != null) {
            float floatValue = ((Number) targetPosition.component1()).floatValue();
            float floatValue2 = ((Number) targetPosition.component2()).floatValue();
            int[] iArr = this.a;
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            boolean z = true;
            int i2 = iArr[1];
            int width = view.getWidth();
            int height = view.getHeight();
            if (floatValue < i || floatValue > i + width || floatValue2 < i2 || floatValue2 > i2 + height || !view.isClickable() || view.getVisibility() != 0) {
                view2 = null;
            }
            if (view2 != null) {
                String canonicalName = view.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = view.getClass().getSimpleName();
                }
                String str2 = canonicalName;
                Intrinsics.checkNotNullParameter(view, "<this>");
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Intrinsics.checkNotNullParameter(view, "<this>");
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m1716constructorimpl = Result.m1716constructorimpl(ResultKt.createFailure(th));
                }
                if (view.getId() == -1 || ((view.getId() & ViewCompat.MEASURED_STATE_MASK) == 0 && (view.getId() & ViewCompat.MEASURED_SIZE_MASK) != 0)) {
                    throw new Resources.NotFoundException();
                }
                Resources resources = view.getContext().getResources();
                String resourceEntryName = resources != null ? resources.getResourceEntryName(view.getId()) : null;
                if (resourceEntryName == null) {
                    resourceEntryName = "";
                }
                m1716constructorimpl = Result.m1716constructorimpl(resourceEntryName);
                if (Result.m1719exceptionOrNullimpl(m1716constructorimpl) != null) {
                    if (view.getId() == -1) {
                        m1716constructorimpl = null;
                    } else {
                        StringBuilder sb = new StringBuilder("0x");
                        String num = Integer.toString(view.getId(), CharsKt.checkRadix(16));
                        Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                        sb.append(num);
                        m1716constructorimpl = sb.toString();
                    }
                }
                String str3 = (String) m1716constructorimpl;
                ArrayList arrayList = new ArrayList();
                View view3 = view;
                while (view3 != null) {
                    String simpleName = view3.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                    arrayList.add(simpleName);
                    Object parent = view3.getParent();
                    view3 = parent instanceof View ? (View) parent : null;
                }
                joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, " → ", null, null, 0, null, null, 62, null);
                Object tag = view.getTag();
                if (tag != null) {
                    if (!(tag instanceof String) && !(tag instanceof Number) && !(tag instanceof Boolean) && !(tag instanceof Character)) {
                        tag = null;
                    }
                    if (tag != null) {
                        str = tag.toString();
                        Button button = !(view instanceof Button) ? (Button) view : null;
                        String obj = (button != null || (text = button.getText()) == null) ? null : text.toString();
                        Object tag2 = view.getTag(-1989905945);
                        Boolean bool = !(tag2 instanceof Boolean) ? (Boolean) tag2 : null;
                        boolean booleanValue2 = bool == null ? bool.booleanValue() : false;
                        Object tag3 = view.getTag(-633031234);
                        Boolean bool2 = !(tag3 instanceof Boolean) ? (Boolean) tag3 : null;
                        booleanValue = bool2 == null ? bool2.booleanValue() : false;
                        Object tag4 = view.getTag(457577948);
                        Boolean bool3 = tag4 instanceof Boolean ? (Boolean) tag4 : null;
                        boolean booleanValue3 = bool3 == null ? bool3.booleanValue() : false;
                        boolean z2 = !booleanValue2 || booleanValue3;
                        if (!booleanValue && !booleanValue3) {
                            z = false;
                        }
                        return new com.amplitude.android.internal.c(view, str2, str3, str, obj, "android_view", joinToString$default, z2, z);
                    }
                }
                str = null;
                if (!(view instanceof Button)) {
                }
                if (button != null) {
                }
                Object tag22 = view.getTag(-1989905945);
                if (!(tag22 instanceof Boolean)) {
                }
                if (bool == null) {
                }
                Object tag32 = view.getTag(-633031234);
                if (!(tag32 instanceof Boolean)) {
                }
                if (bool2 == null) {
                }
                Object tag42 = view.getTag(457577948);
                if (tag42 instanceof Boolean) {
                }
                if (bool3 == null) {
                }
                if (booleanValue2) {
                }
                if (!booleanValue) {
                    z = false;
                }
                return new com.amplitude.android.internal.c(view, str2, str3, str, obj, "android_view", joinToString$default, z2, z);
            }
        }
        return null;
    }
}
