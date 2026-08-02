package com.facebook.appevents.codeless;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.RestrictTo;
import androidx.media3.ui.z;
import com.facebook.appevents.codeless.c;
import com.facebook.internal.E;
import com.facebook.w;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class a {
    public static final a a = new a();

    /* renamed from: com.facebook.appevents.codeless.a$a, reason: collision with other inner class name */
    public static final class ViewOnClickListenerC0073a implements View.OnClickListener {
        public final com.facebook.appevents.codeless.internal.a a;
        public final WeakReference<View> b;
        public final WeakReference<View> c;
        public final View.OnClickListener d;
        public final boolean e;

        public ViewOnClickListenerC0073a(com.facebook.appevents.codeless.internal.a mapping, View rootView, View hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.a = mapping;
            this.b = new WeakReference<>(hostView);
            this.c = new WeakReference<>(rootView);
            this.d = com.facebook.appevents.codeless.internal.e.f(hostView);
            this.e = true;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(view, "view");
                    View.OnClickListener onClickListener = this.d;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    View view2 = this.c.get();
                    View view3 = this.b.get();
                    if (view2 == null || view3 == null) {
                        return;
                    }
                    a.a(this.a, view2, view3);
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, this);
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.a.a(th2, this);
            }
        }
    }

    public static final class b implements AdapterView.OnItemClickListener {
        public final com.facebook.appevents.codeless.internal.a a;
        public final WeakReference<AdapterView<?>> b;
        public final WeakReference<View> c;
        public final AdapterView.OnItemClickListener d;
        public final boolean e;

        public b(com.facebook.appevents.codeless.internal.a mapping, View rootView, AdapterView<?> hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.a = mapping;
            this.b = new WeakReference<>(hostView);
            this.c = new WeakReference<>(rootView);
            this.d = hostView.getOnItemClickListener();
            this.e = true;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.d;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            View view2 = this.c.get();
            AdapterView<?> adapterView2 = this.b.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            a.a(this.a, view2, adapterView2);
        }
    }

    @JvmStatic
    public static final void a(com.facebook.appevents.codeless.internal.a mapping, View rootView, View hostView) {
        if (com.facebook.internal.instrument.crashshield.a.b(a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            String str = mapping.a;
            c.Companion.getClass();
            Bundle b2 = c.a.b(mapping, rootView, hostView);
            a.b(b2);
            w.c().execute(new z(1, str, b2));
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, a.class);
        }
    }

    public final void b(Bundle parameters) {
        Locale locale;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            String string = parameters.getString("_valueToSum");
            if (string != null) {
                int i = com.facebook.appevents.internal.g.a;
                double d = 0.0d;
                try {
                    Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                    if (matcher.find()) {
                        String group = matcher.group(0);
                        E e = E.a;
                        try {
                            locale = w.a().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                        }
                        d = NumberFormat.getNumberInstance(locale).parse(group).doubleValue();
                    }
                } catch (ParseException unused2) {
                }
                parameters.putDouble("_valueToSum", d);
            }
            parameters.putString("_is_fb_codeless", "1");
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
