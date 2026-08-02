package Tf;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private final String f27156b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27157c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f27158d;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f27155a = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    private final boolean f27159e = true;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f27160a = true;

        /* renamed from: b, reason: collision with root package name */
        private boolean f27161b = true;

        /* renamed from: c, reason: collision with root package name */
        private String[] f27162c;

        public a(@NonNull Context context) {
            new WeakReference(context);
        }

        @NonNull
        public final b a() {
            String[] strArr = this.f27162c;
            if (strArr == null) {
                throw new IllegalStateException("Using builder without providing attribution data");
            }
            StringBuilder sb2 = new StringBuilder();
            for (String str : strArr) {
                if (!str.isEmpty()) {
                    sb2.append(str);
                }
            }
            b bVar = new b(sb2.toString(), this.f27160a, this.f27161b);
            bVar.b();
            return bVar;
        }

        @NonNull
        public final void b(String... strArr) {
            this.f27162c = strArr;
        }

        @NonNull
        public final void c(boolean z11) {
            this.f27161b = z11;
        }

        @NonNull
        public final void d(boolean z11) {
            this.f27160a = z11;
        }
    }

    b(String str, boolean z11, boolean z12) {
        this.f27156b = str;
        this.f27157c = z11;
        this.f27158d = z12;
    }

    @NonNull
    public final LinkedHashSet a() {
        return this.f27155a;
    }

    protected final void b() {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) Html.fromHtml(this.f27156b, 0);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
            String url = uRLSpan.getURL();
            if ((this.f27157c || !Tf.a.f27152c.contains(url)) && (this.f27159e || !url.equals("https://www.mapbox.com/about/maps/"))) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                char[] cArr = new char[spanEnd - spanStart];
                spannableStringBuilder.getChars(spanStart, spanEnd, cArr, 0);
                String valueOf = String.valueOf(cArr);
                if (!this.f27158d && valueOf.startsWith("© ")) {
                    valueOf = valueOf.substring(2, valueOf.length());
                }
                this.f27155a.add(new Tf.a(valueOf, url));
            }
        }
    }
}
