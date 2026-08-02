package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.annotation.NonNull;

@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class b {

    static class a {
        static Spanned a(String str, int i11) {
            return Html.fromHtml(str, i11);
        }

        static Spanned b(String str, int i11, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i11, imageGetter, tagHandler);
        }

        static String c(Spanned spanned, int i11) {
            return Html.toHtml(spanned, i11);
        }
    }

    @NonNull
    public static Spanned a(@NonNull String str, int i11) {
        return a.a(str, i11);
    }

    @NonNull
    public static Spanned b(@NonNull String str, int i11, Html.TagHandler tagHandler) {
        return a.b(str, i11, null, tagHandler);
    }

    @NonNull
    public static String c(@NonNull SpannableString spannableString) {
        return a.c(spannableString, 0);
    }
}
