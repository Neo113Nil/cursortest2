package com.facebook.appevents.suggestedevents;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.RestrictTo;
import com.facebook.appevents.ml.d;
import com.facebook.appevents.p;
import com.facebook.appevents.suggestedevents.i;
import com.facebook.internal.E;
import com.facebook.w;
import com.facebook.z;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class i implements View.OnClickListener {
    public static final a Companion = new a();
    public static final HashSet e = new HashSet();
    public final View.OnClickListener a;
    public final WeakReference<View> b;
    public final WeakReference<View> c;
    public final String d;

    public static final class a {
        public static final boolean a(a aVar, String pathID, final String str) {
            aVar.getClass();
            b bVar = b.a;
            final String str2 = null;
            if (!com.facebook.internal.instrument.crashshield.a.b(b.class)) {
                try {
                    Intrinsics.checkNotNullParameter(pathID, "pathID");
                    LinkedHashMap linkedHashMap = b.b;
                    if (linkedHashMap.containsKey(pathID)) {
                        str2 = (String) linkedHashMap.get(pathID);
                    }
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, b.class);
                }
            }
            if (str2 == null) {
                return false;
            }
            if (!Intrinsics.areEqual(str2, "other")) {
                Runnable runnable = new Runnable() { // from class: com.facebook.appevents.suggestedevents.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        String queriedEvent = str2;
                        Intrinsics.checkNotNullParameter(queriedEvent, "$queriedEvent");
                        String buttonText = str;
                        Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
                        i.Companion.getClass();
                        i.a.c(queriedEvent, buttonText, new float[0]);
                    }
                };
                E e = E.a;
                try {
                    w.c().execute(runnable);
                } catch (Exception unused) {
                }
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0032  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void b(View view, View rootView, String activityName) {
            HashSet hashSet;
            Field field;
            Field field2;
            Object obj;
            Intrinsics.checkNotNullParameter(view, "hostView");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            int hashCode = view.hashCode();
            a aVar = i.Companion;
            HashSet hashSet2 = null;
            if (!com.facebook.internal.instrument.crashshield.a.b(i.class)) {
                try {
                    hashSet = i.e;
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, i.class);
                }
                if (hashSet.contains(Integer.valueOf(hashCode))) {
                    i iVar = new i(view, rootView, activityName);
                    if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.codeless.internal.e.class)) {
                        try {
                            Intrinsics.checkNotNullParameter(view, "view");
                            try {
                                try {
                                    field = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                                } catch (ClassNotFoundException | NoSuchFieldException unused) {
                                    field = null;
                                }
                                try {
                                    field2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                                } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                                    field2 = null;
                                    if (field != null) {
                                    }
                                    view.setOnClickListener(iVar);
                                    if (!com.facebook.internal.instrument.crashshield.a.b(i.class)) {
                                    }
                                    hashSet2.add(Integer.valueOf(hashCode));
                                    return;
                                }
                                if (field != null || field2 == null) {
                                    view.setOnClickListener(iVar);
                                } else {
                                    field.setAccessible(true);
                                    field2.setAccessible(true);
                                    try {
                                        field.setAccessible(true);
                                        obj = field.get(view);
                                    } catch (IllegalAccessException unused3) {
                                        obj = null;
                                    }
                                    if (obj == null) {
                                        view.setOnClickListener(iVar);
                                    } else {
                                        field2.set(obj, iVar);
                                    }
                                }
                            } catch (Exception unused4) {
                            }
                        } catch (Throwable th2) {
                            com.facebook.internal.instrument.crashshield.a.a(th2, com.facebook.appevents.codeless.internal.e.class);
                        }
                    }
                    if (!com.facebook.internal.instrument.crashshield.a.b(i.class)) {
                        try {
                            hashSet2 = i.e;
                        } catch (Throwable th3) {
                            com.facebook.internal.instrument.crashshield.a.a(th3, i.class);
                        }
                    }
                    hashSet2.add(Integer.valueOf(hashCode));
                    return;
                }
                return;
            }
            hashSet = null;
            if (hashSet.contains(Integer.valueOf(hashCode))) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void c(String event, String str, float[] fArr) {
            boolean contains;
            boolean contains2;
            e eVar = e.a;
            if (!com.facebook.internal.instrument.crashshield.a.b(e.class)) {
                try {
                    Intrinsics.checkNotNullParameter(event, "event");
                    contains = e.c.contains(event);
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, e.class);
                }
                if (!contains) {
                    p loggerImpl = new p(w.a(), (String) null);
                    Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
                    if (com.facebook.internal.instrument.crashshield.a.b(loggerImpl)) {
                        return;
                    }
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("_is_suggested_event", "1");
                        bundle.putString("_button_text", str);
                        loggerImpl.e(event, bundle);
                        return;
                    } catch (Throwable th2) {
                        com.facebook.internal.instrument.crashshield.a.a(th2, loggerImpl);
                        return;
                    }
                }
                if (!com.facebook.internal.instrument.crashshield.a.b(e.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(event, "event");
                        contains2 = e.d.contains(event);
                    } catch (Throwable th3) {
                        com.facebook.internal.instrument.crashshield.a.a(th3, e.class);
                    }
                    if (contains2) {
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    try {
                        bundle2.putString("event_name", event);
                        JSONObject jSONObject = new JSONObject();
                        StringBuilder sb = new StringBuilder();
                        for (float f : fArr) {
                            sb.append(f);
                            sb.append(",");
                        }
                        jSONObject.put("dense", sb.toString());
                        jSONObject.put("button_text", str);
                        bundle2.putString("metadata", jSONObject.toString());
                        z.c cVar = z.Companion;
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{w.b()}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
                        cVar.getClass();
                        z h = z.c.h(null, format, null, null);
                        Intrinsics.checkNotNullParameter(bundle2, "<set-?>");
                        h.d = bundle2;
                        h.c();
                        return;
                    } catch (JSONException unused) {
                        return;
                    }
                }
                contains2 = false;
                if (contains2) {
                }
            }
            contains = false;
            if (!contains) {
            }
        }
    }

    public i(View view, View view2, String str) {
        String replace$default;
        this.a = com.facebook.appevents.codeless.internal.e.f(view);
        this.b = new WeakReference<>(view2);
        this.c = new WeakReference<>(view);
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        replace$default = StringsKt__StringsJVMKt.replace$default(lowerCase, "activity", "", false, 4, (Object) null);
        this.d = replace$default;
    }

    public final void a() {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            View view = this.b.get();
            View view2 = this.c.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                final String d = c.d(view2);
                final String b = b.b(view2, d);
                if (b != null && !a.a(Companion, b, d)) {
                    final JSONObject jSONObject = new JSONObject();
                    jSONObject.put("view", c.b(view, view2));
                    jSONObject.put("screenname", this.d);
                    if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                        return;
                    }
                    try {
                        Runnable runnable = new Runnable() { // from class: com.facebook.appevents.suggestedevents.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                String[] f;
                                JSONObject viewData = jSONObject;
                                String buttonText = d;
                                i this$0 = this;
                                String pathID = b;
                                if (com.facebook.internal.instrument.crashshield.a.b(i.class)) {
                                    return;
                                }
                                try {
                                    Intrinsics.checkNotNullParameter(viewData, "$viewData");
                                    Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(pathID, "$pathID");
                                    try {
                                        String lowerCase = E.l(w.a()).toLowerCase();
                                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                                        float[] a2 = a.a(lowerCase, viewData);
                                        String c = a.c(buttonText, this$0.d, lowerCase);
                                        if (a2 != null && (f = com.facebook.appevents.ml.d.f(d.a.b, new float[][]{a2}, new String[]{c})) != null) {
                                            String str = f[0];
                                            b.a(pathID, str);
                                            if (Intrinsics.areEqual(str, "other")) {
                                                return;
                                            }
                                            i.Companion.getClass();
                                            i.a.c(str, buttonText, a2);
                                        }
                                    } catch (Exception unused) {
                                    }
                                } catch (Throwable th) {
                                    com.facebook.internal.instrument.crashshield.a.a(th, i.class);
                                }
                            }
                        };
                        E e2 = E.a;
                        w.c().execute(runnable);
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, this);
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
        }
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
                View.OnClickListener onClickListener = this.a;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                a();
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
        }
    }
}
