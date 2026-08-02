package B2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.NonNull;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: B2.a$a, reason: collision with other inner class name */
    private static class C0052a {
        static void a(@NonNull EditorInfo editorInfo, CharSequence charSequence) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
        }
    }

    public static void a(@NonNull EditorInfo editorInfo, String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    public static void b(@NonNull EditorInfo editorInfo, @NonNull CharSequence charSequence) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            C0052a.a(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i11 >= 30) {
            C0052a.a(editorInfo, charSequence);
            return;
        }
        int i12 = editorInfo.initialSelStart;
        int i13 = editorInfo.initialSelEnd;
        int i14 = i12 > i13 ? i13 : i12;
        if (i12 <= i13) {
            i12 = i13;
        }
        int length = charSequence.length();
        if (i14 < 0 || i12 > length) {
            c(editorInfo, null, 0, 0);
            return;
        }
        int i15 = editorInfo.inputType & 4095;
        if (i15 == 129 || i15 == 225 || i15 == 18) {
            c(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            c(editorInfo, charSequence, i14, i12);
            return;
        }
        int i16 = i12 - i14;
        int i17 = i16 > 1024 ? 0 : i16;
        int i18 = 2048 - i17;
        int min = Math.min(charSequence.length() - i12, i18 - Math.min(i14, (int) (i18 * 0.8d)));
        int min2 = Math.min(i14, i18 - min);
        int i19 = i14 - min2;
        if (Character.isLowSurrogate(charSequence.charAt(i19))) {
            i19++;
            min2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i12 + min) - 1))) {
            min--;
        }
        int i21 = min2 + i17;
        c(editorInfo, i17 != i16 ? TextUtils.concat(charSequence.subSequence(i19, i19 + min2), charSequence.subSequence(i12, min + i12)) : charSequence.subSequence(i19, i21 + min + i19), min2, i21);
    }

    private static void c(EditorInfo editorInfo, CharSequence charSequence, int i11, int i12) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i11);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i12);
    }
}
