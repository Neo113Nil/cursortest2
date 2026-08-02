package org.betup.utils;

import android.text.InputFilter;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TextUtilClass.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\n*\u00020\u0002\u001a\u0012\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0001\"\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006¨\u0006\u0010"}, d2 = {"editTextToInt", "", "Landroid/widget/EditText;", "containsInt", "", "getContainsInt", "(Landroid/widget/EditText;)Z", "editTextToDouble", "", "editTextToLong", "", "containsLong", "getContainsLong", "setMaxLength", "", "maxBetAmount", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextUtilClassKt {
    public static final int editTextToInt(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        return Integer.parseInt(editText.getText().toString());
    }

    public static final boolean getContainsInt(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        return StringsKt.toIntOrNull(editText.getText().toString()) != null;
    }

    public static final double editTextToDouble(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        return Double.parseDouble(editText.getText().toString());
    }

    public static final long editTextToLong(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        return Long.parseLong(editText.getText().toString());
    }

    public static final boolean getContainsLong(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        return StringsKt.toLongOrNull(editText.getText().toString()) != null;
    }

    public static final void setMaxLength(EditText editText, int i) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(IntUtilKt.countDigits(i))});
    }
}
