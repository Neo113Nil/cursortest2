package androidx.compose.ui.platform;

import K1.C3422b;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5258k {
    public static final C3422b a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new C3422b(6, charSequence.toString(), null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i11 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int I11 = C7705l.I(annotationArr);
        if (I11 >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i11];
                if (Intrinsics.d(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new C3422b.C0288b(spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation), new M0(annotation.getValue()).a()));
                }
                if (i11 == I11) {
                    break;
                }
                i11++;
            }
        }
        return new C3422b(4, charSequence.toString(), arrayList);
    }

    @NotNull
    public static final CharSequence b(@NotNull C3422b c3422b) {
        if (c3422b.e().isEmpty()) {
            return c3422b.h();
        }
        SpannableString spannableString = new SpannableString(c3422b.h());
        V0 v02 = new V0();
        List<C3422b.C0288b<K1.D>> e11 = c3422b.e();
        int size = e11.size();
        for (int i11 = 0; i11 < size; i11++) {
            C3422b.C0288b<K1.D> c0288b = e11.get(i11);
            K1.D a11 = c0288b.a();
            int b11 = c0288b.b();
            int c11 = c0288b.c();
            v02.f();
            v02.c(a11);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", v02.e()), b11, c11, 33);
        }
        return spannableString;
    }
}
