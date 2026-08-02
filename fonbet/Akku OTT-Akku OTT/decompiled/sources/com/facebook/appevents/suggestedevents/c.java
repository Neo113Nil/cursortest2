package com.facebook.appevents.suggestedevents;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {
    public static final c a = new c();
    public static final List<Class<? extends View>> b = CollectionsKt.listOf((Object[]) new Class[]{Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class});

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r5.isClickable() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r1.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        r5 = com.facebook.appevents.codeless.internal.e.b(r5).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r5.hasNext() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        r1.addAll(a((android.view.View) r5.next()));
     */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList a(View view) {
        if (com.facebook.internal.instrument.crashshield.a.b(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            Iterator<Class<? extends View>> it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().isInstance(view)) {
                    break;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, c.class);
            return null;
        }
    }

    @JvmStatic
    public static final JSONObject b(View view, View clickedView) {
        if (com.facebook.internal.instrument.crashshield.a.b(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(clickedView, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == clickedView) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = com.facebook.appevents.codeless.internal.e.b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b((View) it.next(), clickedView));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, c.class);
            return null;
        }
    }

    @JvmStatic
    public static final String d(View hostView) {
        if (com.facebook.internal.instrument.crashshield.a.b(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            String j = com.facebook.appevents.codeless.internal.e.j(hostView);
            if (j.length() > 0) {
                return j;
            }
            String join = TextUtils.join(" ", a.c(hostView));
            Intrinsics.checkNotNullExpressionValue(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, c.class);
            return null;
        }
    }

    @JvmStatic
    public static final void e(View view, JSONObject json) {
        if (com.facebook.internal.instrument.crashshield.a.b(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String j = com.facebook.appevents.codeless.internal.e.j(view);
                String h = com.facebook.appevents.codeless.internal.e.h(view);
                json.put("classname", view.getClass().getSimpleName());
                json.put("classtypebitmask", com.facebook.appevents.codeless.internal.e.c(view));
                if (j.length() > 0) {
                    json.put("text", j);
                }
                if (h.length() > 0) {
                    json.put("hint", h);
                }
                if (view instanceof EditText) {
                    json.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, c.class);
        }
    }

    public final ArrayList c(View view) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = com.facebook.appevents.codeless.internal.e.b(view).iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                String j = com.facebook.appevents.codeless.internal.e.j(view2);
                if (j.length() > 0) {
                    arrayList.add(j);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }
}
