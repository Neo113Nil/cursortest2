package androidx.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.recyclerview.widget.LinearLayoutManager;
import l3.C7855a;
import l3.InterfaceC7859e;

/* loaded from: classes8.dex */
final class x {
    public static void a(C7855a.C1210a c1210a) {
        c1210a.b();
        if (c1210a.e() instanceof Spanned) {
            if (!(c1210a.e() instanceof Spannable)) {
                c1210a.o(SpannableString.valueOf(c1210a.e()));
            }
            CharSequence e11 = c1210a.e();
            e11.getClass();
            Spannable spannable = (Spannable) e11;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if (!(obj instanceof InterfaceC7859e)) {
                    spannable.removeSpan(obj);
                }
            }
        }
        b(c1210a);
    }

    public static void b(C7855a.C1210a c1210a) {
        c1210a.q(-3.4028235E38f, LinearLayoutManager.INVALID_OFFSET);
        if (c1210a.e() instanceof Spanned) {
            if (!(c1210a.e() instanceof Spannable)) {
                c1210a.o(SpannableString.valueOf(c1210a.e()));
            }
            CharSequence e11 = c1210a.e();
            e11.getClass();
            Spannable spannable = (Spannable) e11;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }
}
