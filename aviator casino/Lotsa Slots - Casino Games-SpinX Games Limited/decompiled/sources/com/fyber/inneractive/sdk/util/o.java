package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static android.app.Application f4302a;

    public static void a() {
    }

    public static boolean a(java.lang.String str) {
        try {
            return f4302a.checkCallingOrSelfPermission(str) == 0;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static int b(int i) {
        return (int) (((com.fyber.inneractive.sdk.config.IAConfigManager.N.u.a().getResources().getConfiguration().densityDpi / 160.0f) * i) + 0.5f);
    }

    public static int c() {
        android.app.Application application = f4302a;
        int i = (application == null || application.getResources() == null || application.getResources().getConfiguration() == null) ? 1 : application.getResources().getConfiguration().orientation;
        try {
            if (android.provider.Settings.System.getInt(application.getContentResolver(), "accelerometer_rotation", 0) != 1) {
                i = 1;
            }
        } catch (java.lang.Throwable th) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed getOrientation. returning portrait orientation", th, new java.lang.Object[0]);
        }
        com.fyber.inneractive.sdk.util.IAlog.a("The device orientation: %s", i == 1 ? "portrait" : "landscape");
        return i;
    }

    public static int d() {
        int i;
        android.view.WindowManager windowManager;
        android.view.Display defaultDisplay;
        if (f4302a == null || (windowManager = (android.view.WindowManager) com.fyber.inneractive.sdk.config.IAConfigManager.N.u.a().getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            i = -1;
        } else {
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getSize(point);
            i = point.y;
        }
        if (i != -1) {
            return i;
        }
        try {
            android.util.DisplayMetrics displayMetrics = android.content.res.Resources.getSystem().getDisplayMetrics();
            if (displayMetrics != null) {
                i = displayMetrics.heightPixels;
            }
        } catch (java.lang.Throwable unused) {
        }
        if (i == -1) {
            return 480;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e() {
        int i;
        android.view.WindowManager windowManager;
        android.view.Display defaultDisplay;
        if (f4302a != null && (windowManager = (android.view.WindowManager) com.fyber.inneractive.sdk.config.IAConfigManager.N.u.a().getSystemService("window")) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getSize(point);
            i = point.x;
            if (i == -1) {
                return i;
            }
            try {
                android.util.DisplayMetrics displayMetrics = android.content.res.Resources.getSystem().getDisplayMetrics();
                if (displayMetrics != null) {
                    i = displayMetrics.widthPixels;
                }
            } catch (java.lang.Throwable unused) {
            }
            return i == -1 ? com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE : i;
        }
        i = -1;
        if (i == -1) {
        }
    }

    public static void f() {
    }

    public static void g() {
    }

    public static java.lang.String h() {
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager;
        int i = 0;
        while (true) {
            iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
            if (!iAConfigManager.x.f4312a.get() || iAConfigManager.x.d.compareAndSet(true, true) || i >= 25) {
                break;
            }
            com.fyber.inneractive.sdk.util.IAlog.a("UserAgentProvider | waiting on user agent", new java.lang.Object[0]);
            try {
                java.lang.Thread.sleep(100L);
            } catch (java.lang.InterruptedException unused) {
            }
            i++;
        }
        return iAConfigManager.x.a();
    }

    public static void a(android.view.View view, android.graphics.drawable.Drawable drawable) {
        view.setBackground(drawable);
    }

    public static int b() {
        return ((android.view.WindowManager) com.fyber.inneractive.sdk.config.IAConfigManager.N.u.a().getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static int a(int i) {
        return java.lang.Math.round(((com.fyber.inneractive.sdk.config.IAConfigManager.N.u.a().getResources().getConfiguration().densityDpi / 160.0f) * i) + 0.5f);
    }

    public static java.lang.String b(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) com.fyber.inneractive.sdk.util.n.f4300a.get(str);
        if (android.text.TextUtils.isEmpty(str2)) {
            com.fyber.inneractive.sdk.util.IAlog.a("Assets cache: reading file: %s", str);
            try {
                java.io.InputStream open = f4302a.getAssets().open(str, 3);
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                byte[] bArr = new byte[4096];
                for (int i = 0; i != -1; i = open.read(bArr)) {
                    stringBuffer.append(new java.lang.String(bArr, 0, i));
                }
                open.close();
                str2 = stringBuffer.toString();
                com.fyber.inneractive.sdk.util.IAlog.a("Assets cache: success - %s", str);
            } catch (java.io.IOException e) {
                com.fyber.inneractive.sdk.util.IAlog.a("Assets cache: Could not read response from file", new java.lang.Object[0]);
                com.fyber.inneractive.sdk.util.IAlog.e(com.fyber.inneractive.sdk.util.v.b(e), new java.lang.Object[0]);
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                com.fyber.inneractive.sdk.util.n.f4300a.put(str, str2);
            }
        } else {
            com.fyber.inneractive.sdk.util.IAlog.a("Assets cache: returning cached assets for %s", str);
        }
        return str2;
    }

    public static int a(float f) {
        return (int) (android.util.TypedValue.applyDimension(1, f, com.fyber.inneractive.sdk.config.IAConfigManager.N.u.a().getResources().getDisplayMetrics()) + 0.5f);
    }

    public static java.lang.String a(java.util.ArrayList arrayList) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return kotlin.UByte$$ExternalSyntheticBackport0.m((java.lang.CharSequence) ",", (java.lang.Iterable) arrayList);
        }
        return android.text.TextUtils.join(",", arrayList);
    }

    public static int c(int i) {
        try {
            return (int) ((i / (com.fyber.inneractive.sdk.config.IAConfigManager.N.u.a().getResources().getConfiguration().densityDpi / 160.0f)) + 0.5f);
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    public static void a(android.content.Context context, byte[] bArr) {
        java.io.FileOutputStream fileOutputStream;
        try {
            fileOutputStream = context.openFileOutput("session_details.json", 0);
        } catch (java.lang.Throwable unused) {
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
        } catch (java.lang.Throwable unused2) {
            try {
                com.fyber.inneractive.sdk.util.IAlog.a("writeFileWithContext failed writing %s", "session_details.json");
            } finally {
                com.fyber.inneractive.sdk.util.v.a(fileOutputStream);
            }
        }
    }

    public static android.graphics.drawable.Drawable d(int i) {
        return com.fyber.inneractive.sdk.config.IAConfigManager.N.u.a().getDrawable(i);
    }

    public static java.lang.String a(android.content.Context context) {
        if (context != null) {
            try {
                android.content.pm.Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                if (signatureArr.length > 0) {
                    android.content.pm.Signature signature = signatureArr[0];
                    java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
                    messageDigest.update(signature.toByteArray());
                    byte[] digest = messageDigest.digest();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    for (byte b : digest) {
                        java.lang.String hexString = java.lang.Integer.toHexString(b & 255);
                        if (hexString.length() == 1) {
                            sb.append("0");
                        }
                        sb.append(hexString);
                    }
                    return sb.toString();
                }
                return "";
            } catch (java.lang.Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static void a(android.view.View view, int i) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
            ((android.widget.FrameLayout.LayoutParams) layoutParams).gravity = i;
        } else if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
            ((android.widget.LinearLayout.LayoutParams) layoutParams).gravity = i;
        } else if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            if (i == 17) {
                layoutParams2.addRule(13);
            } else {
                int i2 = i & 7;
                if (i2 == 1) {
                    layoutParams2.addRule(14);
                } else if (i2 == 3) {
                    layoutParams2.addRule(9);
                } else if (i2 == 5) {
                    layoutParams2.addRule(11);
                }
                int i3 = i & 112;
                if (i3 == 16) {
                    layoutParams2.addRule(15);
                } else if (i3 == 48) {
                    layoutParams2.addRule(10);
                } else if (i3 == 80) {
                    layoutParams2.addRule(12);
                }
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public static android.content.Context a(android.view.View view) {
        if (view != null) {
            return view.getContext();
        }
        return f4302a;
    }
}
