package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class N5 {
    public static java.lang.String c;
    public static org.json.JSONObject f;
    public static java.lang.Integer g;
    public static java.lang.Float h;
    public static final boolean i;

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.P5 f4847a = new com.inmobi.media.P5(0, 0, 2.0f);
    public static final com.inmobi.media.M5 b = new com.inmobi.media.M5(0, 0);
    public static float d = -1.0f;
    public static boolean e = true;

    static {
        com.inmobi.media.B5.f4614a.getClass();
        i = com.inmobi.media.B5.w();
    }

    public static java.lang.String a() {
        android.view.Display a2;
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null || (a2 = a(context)) == null) {
            return "0x0";
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        a2.getMetrics(displayMetrics);
        return displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
    }

    public static float b() {
        android.view.Display a2;
        if (d == -1.0f) {
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context == null || (a2 = a(context)) == null) {
                return 2.0f;
            }
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            a2.getMetrics(displayMetrics);
            float f2 = displayMetrics.density;
            if (f2 == 0.0f) {
                return 2.0f;
            }
            d = f2;
        }
        return d;
    }

    public static java.util.HashMap c() {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put("d-device-screen-density", java.lang.String.valueOf(b()));
            hashMap.put("d-device-screen-size", e());
            hashMap.put("d-density-dependent-screen-size", a());
            hashMap.put("d-orientation", java.lang.String.valueOf((int) g()));
            java.lang.Float f2 = h;
            hashMap.put("d-textsize", java.lang.String.valueOf(f2 != null ? f2.floatValue() : 37.0f));
            return hashMap;
        } catch (java.lang.Exception e2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("N5", "TAG");
            e2.getMessage();
            return hashMap;
        }
    }

    public static com.inmobi.media.P5 d() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return f4847a;
        }
        android.view.Display a2 = a(context);
        if (a2 == null) {
            return f4847a;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        a2.getMetrics(displayMetrics);
        float f2 = displayMetrics.density;
        return new com.inmobi.media.P5((int) (displayMetrics.widthPixels / f2), (int) (displayMetrics.heightPixels / f2), f2);
    }

    public static java.lang.String e() {
        com.inmobi.media.P5 d2 = d();
        return d2.f4888a + "X" + d2.b;
    }

    public static java.lang.Integer f() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return null;
        }
        int i2 = android.provider.Settings.Secure.getInt(context.getContentResolver(), "navigation_mode", -1);
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return i2 != 2 ? null : 1;
    }

    public static byte g() {
        android.view.Display a2;
        int rotation;
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null || (a2 = a(context)) == null || (rotation = a2.getRotation()) == 0) {
            return (byte) 1;
        }
        if (rotation == 1) {
            return (byte) 3;
        }
        if (rotation == 2) {
            return (byte) 2;
        }
        if (rotation == 3) {
            return (byte) 4;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("N5", "TAG");
        return (byte) 1;
    }

    public static com.inmobi.media.P5 h() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return f4847a;
        }
        android.view.Display a2 = a(context);
        if (a2 == null) {
            return f4847a;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        a2.getRealMetrics(displayMetrics);
        float f2 = displayMetrics.density;
        return new com.inmobi.media.P5((int) (displayMetrics.widthPixels / f2), (int) (displayMetrics.heightPixels / f2), f2);
    }

    public static void i() {
        if (i) {
            if (f() != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("N5", "TAG");
                return;
            }
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context == null) {
                return;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
            com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "display_info_store");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("nav_bar_type", com.ironsource.X3.i.W);
            int i2 = a2.f4815a.getInt("nav_bar_type", -1);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i2);
            g = valueOf;
            if (i2 == -1) {
                valueOf = null;
            }
            g = valueOf;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("N5", "TAG");
            java.util.Objects.toString(g);
        }
    }

    public static void j() {
        android.content.Context context;
        if (i && (context = com.inmobi.media.Xi.f5051a) != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
            com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "display_info_store");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("safe_area", com.ironsource.X3.i.W);
            org.json.JSONObject jSONObject = null;
            java.lang.String string = a2.f4815a.getString("safe_area", null);
            if (string != null) {
                try {
                    jSONObject = new org.json.JSONObject(string);
                } catch (org.json.JSONException unused) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("N5", "TAG");
                }
            }
            f = jSONObject;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("N5", "TAG");
            java.util.Objects.toString(f);
        }
    }

    public static void a(final java.lang.Integer num) {
        final android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.N5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.N5.a(num, context);
            }
        };
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
    }

    public static final void b(android.view.WindowInsets windowInsets, android.content.Context context) {
        try {
            java.lang.String insets = windowInsets.getSystemGestureInsets().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insets, "toString(...)");
            java.lang.String[] strArr = (java.lang.String[]) new kotlin.text.Regex("Insets").split(insets, 0).toArray(new java.lang.String[0]);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            if (strArr.length > 1) {
                java.lang.String[] strArr2 = (java.lang.String[]) new kotlin.text.Regex(",").split(new kotlin.text.Regex("[^0-9,=a-zA-Z]*").replace(strArr[1], ""), 0).toArray(new java.lang.String[0]);
                stringBuffer.append("{");
                int length = strArr2.length;
                for (int i2 = 0; i2 < length; i2++) {
                    java.lang.String[] strArr3 = (java.lang.String[]) new kotlin.text.Regex(com.ironsource.X3.j.b).split(strArr2[i2], 0).toArray(new java.lang.String[0]);
                    if (strArr3.length == 2) {
                        stringBuffer.append("\"" + strArr3[0] + "\"");
                        stringBuffer.append(":");
                        stringBuffer.append(com.inmobi.media.J3.b(((float) java.lang.Integer.parseInt(strArr3[1])) / b()));
                        if (i2 < strArr2.length - 1) {
                            stringBuffer.append(", ");
                        }
                    }
                }
                stringBuffer.append("}");
            }
            if (stringBuffer.length() > 0) {
                c = stringBuffer.toString();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                kotlin.jvm.internal.Intrinsics.checkNotNull(context);
                com.inmobi.media.Ka.a(context, "display_info_store").a("gesture_margin", stringBuffer.toString(), false);
            }
        } catch (java.lang.Exception unused) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("N5", "TAG");
        }
    }

    public static final void c(android.content.Context context) {
        android.view.Window window;
        android.view.WindowInsets rootWindowInsets;
        if (e || !(context instanceof android.app.Activity) || (window = ((android.app.Activity) context).getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
            return;
        }
        a(rootWindowInsets, context);
    }

    public static void a(final java.util.LinkedHashMap value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        final android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.N5$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.N5.a(value, context);
            }
        };
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
    }

    public static void a(final android.view.WindowInsets insets, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insets, "insets");
        if (e) {
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.N5$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.N5.b(insets, context);
            }
        };
        android.content.Context context2 = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
    }

    public static android.view.Display a(android.content.Context context) {
        com.inmobi.media.B5.f4614a.getClass();
        java.lang.Object systemService = context.getSystemService("display");
        android.hardware.display.DisplayManager displayManager = systemService instanceof android.hardware.display.DisplayManager ? (android.hardware.display.DisplayManager) systemService : null;
        if (displayManager != null) {
            return displayManager.getDisplay(0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r3.bottom == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r3.bottom == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r3.right == 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(android.view.WindowInsets insets) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insets, "insets");
        com.inmobi.media.B5.f4614a.getClass();
        if (com.inmobi.media.B5.t()) {
            com.inmobi.media.Lf a2 = com.inmobi.media.Mf.a(g());
            android.graphics.Insets insets2 = insets.getInsets(androidx.core.view.WindowInsetsCompat.Type.systemGestures());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
            int ordinal = a2.ordinal();
            i2 = 1;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        if (insets2.right == 0) {
                        }
                    }
                } else if (insets2.left == 0) {
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("N5", "TAG");
                return i2;
            }
            if (insets2.left == 0) {
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("N5", "TAG");
            return i2;
        }
        i2 = 0;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("N5", "TAG");
        return i2;
    }

    public static final void a(java.util.Map map, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("N5", "TAG");
        java.util.Objects.toString(map);
        if (f == null) {
            f = new org.json.JSONObject();
        }
        java.util.Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            org.json.JSONObject jSONObject = f;
            if (jSONObject != null) {
                jSONObject.put(java.lang.String.valueOf(intValue), map.get(java.lang.Integer.valueOf(intValue)));
            }
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
        com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "display_info_store");
        org.json.JSONObject jSONObject2 = f;
        a2.a("safe_area", jSONObject2 != null ? jSONObject2.toString() : null, false);
    }

    public static final void a(java.lang.Integer num, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("N5", "TAG");
        java.util.Objects.toString(num);
        g = num;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
        com.inmobi.media.Ka.a(context, "display_info_store").a("nav_bar_type", num != null ? num.intValue() : -1, false);
    }

    public static com.inmobi.media.M5 b(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.Display a2 = a(context);
        if (a2 == null) {
            return b;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        a2.getRealMetrics(displayMetrics);
        return new com.inmobi.media.M5(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
