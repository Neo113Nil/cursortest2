package Xb;

import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<TextView> f34267a;

    public l(@NonNull TextView textView) {
        this.f34267a = new WeakReference<>(textView);
    }

    public static void a(@NonNull Spannable spannable, @NonNull TextView textView) {
        l[] lVarArr = (l[]) spannable.getSpans(0, spannable.length(), l.class);
        if (lVarArr != null) {
            for (l lVar : lVarArr) {
                spannable.removeSpan(lVar);
            }
        }
        spannable.setSpan(new l(textView), 0, spannable.length(), 18);
    }

    public static TextView b(@NonNull Spanned spanned) {
        l[] lVarArr = (l[]) spanned.getSpans(0, spanned.length(), l.class);
        if (lVarArr == null || lVarArr.length <= 0) {
            return null;
        }
        return lVarArr[0].f34267a.get();
    }
}
