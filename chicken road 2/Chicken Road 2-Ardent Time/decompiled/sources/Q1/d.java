package Q1;

/* loaded from: classes.dex */
public abstract class d {
    public static java.lang.String A(java.lang.Throwable th) {
        kotlin.jvm.internal.i.e(th, "<this>");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        java.lang.String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.i.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static final java.lang.Object B(E1.t tVar, E1.t tVar2, s1.p pVar) {
        java.lang.Object c1061n;
        java.lang.Object K2;
        try {
            kotlin.jvm.internal.s.a(2, pVar);
            c1061n = pVar.invoke(tVar2, tVar);
        } catch (java.lang.Throwable th) {
            c1061n = new z1.C1061n(th, false);
        }
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        if (c1061n == enumC0927a || (K2 = tVar.K(c1061n)) == z1.AbstractC1068v.f8596d) {
            return enumC0927a;
        }
        if (K2 instanceof z1.C1061n) {
            throw ((z1.C1061n) K2).f8581a;
        }
        return z1.AbstractC1068v.l(K2);
    }

    public static java.util.ArrayList C(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
        return arrayList;
    }

    public static final void a(L1.a aVar, L1.c cVar, java.lang.String str) {
        L1.d.f998i.fine(cVar.f992b + ' ' + java.lang.String.format("%-22s", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1)) + ": " + aVar.f985a);
    }

    public static void b(java.lang.Throwable th, java.lang.Throwable exception) {
        kotlin.jvm.internal.i.e(th, "<this>");
        kotlin.jvm.internal.i.e(exception, "exception");
        if (th != exception) {
            java.lang.Integer num = o1.AbstractC0943a.f8202a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            java.lang.reflect.Method method = n1.AbstractC0940a.f8096a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    public static void c(java.lang.StringBuilder sb, java.lang.Object obj, s1.l lVar) {
        if (lVar != null) {
            sb.append((java.lang.CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof java.lang.CharSequence) {
            sb.append((java.lang.CharSequence) obj);
        } else if (obj instanceof java.lang.Character) {
            sb.append(((java.lang.Character) obj).charValue());
        } else {
            sb.append((java.lang.CharSequence) obj.toString());
        }
    }

    public static final void g(java.io.Closeable closeable, java.lang.Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (java.lang.Throwable th2) {
                b(th, th2);
            }
        }
    }

    public static int h(java.lang.String str, int i2, int i3, boolean z2) {
        while (i2 < i3) {
            int i4 = i2 + 1;
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt <= '9' && '0' <= charAt) || ((charAt <= 'z' && 'a' <= charAt) || ((charAt <= 'Z' && 'A' <= charAt) || charAt == ':'))) == (!z2)) {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(android.app.Activity activity, androidx.lifecycle.d event) {
        androidx.lifecycle.l b2;
        kotlin.jvm.internal.i.e(activity, "activity");
        kotlin.jvm.internal.i.e(event, "event");
        if (!(activity instanceof androidx.lifecycle.j) || (b2 = ((androidx.lifecycle.j) activity).b()) == null) {
            return;
        }
        b2.d(event);
    }

    public static final java.lang.String j(long j2) {
        java.lang.String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / 1000000000) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / 1000000000) + " s ";
        }
        return java.lang.String.format("%6s", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
    }

    public static I1.t k(java.lang.String str) {
        if (str.equals("http/1.0")) {
            return I1.t.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return I1.t.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return I1.t.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return I1.t.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return I1.t.SPDY_3;
        }
        if (str.equals("quic")) {
            return I1.t.QUIC;
        }
        throw new java.io.IOException(kotlin.jvm.internal.i.h(str, "Unexpected protocol: "));
    }

    public static int l(android.content.Context context, int i2, int i3) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? i2 : i3;
    }

    public static float m(android.widget.EdgeEffect edgeEffect) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return C.e.b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final java.lang.Class n(w1.c cVar) {
        kotlin.jvm.internal.i.e(cVar, "<this>");
        java.lang.Class a2 = ((kotlin.jvm.internal.c) cVar).a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        java.lang.String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return a2;
    }

    public static java.lang.String o(android.content.res.TypedArray typedArray, int i2, int i3) {
        java.lang.String string = typedArray.getString(i2);
        return string == null ? typedArray.getString(i3) : string;
    }

    public static final boolean p(java.lang.AssertionError assertionError) {
        java.util.logging.Logger logger = V1.n.f1779a;
        if (assertionError.getCause() == null) {
            return false;
        }
        java.lang.String message = assertionError.getMessage();
        return message != null ? y1.g.M(message, "getsockname failed") : false;
    }

    public static boolean q(android.content.Context context) {
        android.os.Bundle bundle;
        android.content.Context applicationContext = context.getApplicationContext();
        try {
            bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            android.util.Log.e("ContentSizingFlag", "Could not get metadata", e2);
            bundle = null;
        }
        if (bundle != null) {
            return bundle.getBoolean("io.flutter.embedding.android.EnableContentSizing", false);
        }
        return false;
    }

    public static boolean r() {
        return Q1.e.f1620d;
    }

    public static M1.e s(android.content.Context context) {
        java.lang.String string;
        java.lang.String string2;
        int i2;
        try {
            android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            android.os.Bundle bundle = applicationInfo.metaData;
            java.lang.String str = Q0.d.f1586a.f1584b;
            java.lang.String str2 = Q0.d.f1587b.f1584b;
            java.lang.String str3 = null;
            if (bundle == null) {
                string = null;
            } else {
                string = bundle.getString(str, null);
                if (string == null) {
                    string = bundle.getString(str2);
                }
            }
            android.os.Bundle bundle2 = applicationInfo.metaData;
            java.lang.String str4 = Q0.d.f1591f.f1584b;
            if (bundle2 != null) {
                bundle2.getString(str4, null);
            }
            android.os.Bundle bundle3 = applicationInfo.metaData;
            java.lang.String str5 = Q0.d.f1592g.f1584b;
            if (bundle3 != null) {
                bundle3.getString(str5, null);
            }
            android.os.Bundle bundle4 = applicationInfo.metaData;
            java.lang.String str6 = Q0.d.f1588c.f1584b;
            java.lang.String str7 = Q0.d.f1589d.f1584b;
            if (bundle4 == null) {
                string2 = null;
            } else {
                string2 = bundle4.getString(str6, null);
                if (string2 == null) {
                    string2 = bundle4.getString(str7);
                }
            }
            android.os.Bundle bundle5 = applicationInfo.metaData;
            if (bundle5 != null && (i2 = bundle5.getInt("io.flutter.network-policy", 0)) > 0) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                try {
                    android.content.res.XmlResourceParser xml = context.getResources().getXml(i2);
                    xml.next();
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            if (xml.getName().equals("domain-config")) {
                                u(xml, jSONArray, false);
                            }
                        }
                    }
                    str3 = jSONArray.toString();
                } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
                }
            }
            java.lang.String str8 = applicationInfo.nativeLibraryDir;
            android.os.Bundle bundle6 = applicationInfo.metaData;
            return new M1.e(string, string2, str3, str8, bundle6 == null ? true : bundle6.getBoolean("io.flutter.automatically-register-plugins", true));
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public static float t(android.widget.EdgeEffect edgeEffect, float f2, float f3) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return C.e.c(edgeEffect, f2, f3);
        }
        C.d.a(edgeEffect, f2, f3);
        return f2;
    }

    public static void u(android.content.res.XmlResourceParser xmlResourceParser, org.json.JSONArray jSONArray, boolean z2) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z2);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 4) {
                        throw new java.lang.IllegalStateException("Expected text");
                    }
                    java.lang.String trim = xmlResourceParser.getText().trim();
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    jSONArray2.put(trim);
                    jSONArray2.put(attributeBooleanValue2);
                    jSONArray2.put(attributeBooleanValue);
                    jSONArray.put(jSONArray2);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 3) {
                        throw new java.lang.IllegalStateException("Expected end of domain tag");
                    }
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    u(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    java.lang.String name = xmlResourceParser.getName();
                    int eventType = xmlResourceParser.getEventType();
                    while (true) {
                        if (eventType != 3 || xmlResourceParser.getName() != name) {
                            eventType = xmlResourceParser.next();
                        }
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    public static long v(int i2, java.lang.String str) {
        int h2 = h(str, 0, i2, false);
        java.util.regex.Matcher matcher = I1.j.f736m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (h2 < i2) {
            int h3 = h(str, h2 + 1, i2, true);
            matcher.region(h2, h3);
            if (i4 == -1 && matcher.usePattern(I1.j.f736m).matches()) {
                java.lang.String group = matcher.group(1);
                kotlin.jvm.internal.i.d(group, "matcher.group(1)");
                i4 = java.lang.Integer.parseInt(group);
                java.lang.String group2 = matcher.group(2);
                kotlin.jvm.internal.i.d(group2, "matcher.group(2)");
                i7 = java.lang.Integer.parseInt(group2);
                java.lang.String group3 = matcher.group(3);
                kotlin.jvm.internal.i.d(group3, "matcher.group(3)");
                i8 = java.lang.Integer.parseInt(group3);
            } else if (i5 == -1 && matcher.usePattern(I1.j.f735l).matches()) {
                java.lang.String group4 = matcher.group(1);
                kotlin.jvm.internal.i.d(group4, "matcher.group(1)");
                i5 = java.lang.Integer.parseInt(group4);
            } else {
                if (i6 == -1) {
                    java.util.regex.Pattern pattern = I1.j.f734k;
                    if (matcher.usePattern(pattern).matches()) {
                        java.lang.String group5 = matcher.group(1);
                        kotlin.jvm.internal.i.d(group5, "matcher.group(1)");
                        java.util.Locale US = java.util.Locale.US;
                        kotlin.jvm.internal.i.d(US, "US");
                        java.lang.String lowerCase = group5.toLowerCase(US);
                        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        java.lang.String pattern2 = pattern.pattern();
                        kotlin.jvm.internal.i.d(pattern2, "MONTH_PATTERN.pattern()");
                        i6 = y1.g.R(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(I1.j.f733j).matches()) {
                    java.lang.String group6 = matcher.group(1);
                    kotlin.jvm.internal.i.d(group6, "matcher.group(1)");
                    i3 = java.lang.Integer.parseInt(group6);
                }
            }
            h2 = h(str, h3 + 1, i2, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        if (i6 == -1) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        if (1 > i5 || i5 >= 32) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        if (i4 < 0 || i4 >= 24) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        if (i7 < 0 || i7 >= 60) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        if (i8 < 0 || i8 >= 60) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(J1.b.f935d);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final V1.c y(java.net.Socket socket) {
        java.util.logging.Logger logger = V1.n.f1779a;
        V1.v vVar = new V1.v(socket);
        java.io.OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.i.d(outputStream, "getOutputStream()");
        return new V1.c(vVar, new V1.c(outputStream, vVar));
    }

    public static final V1.d z(java.net.Socket socket) {
        java.util.logging.Logger logger = V1.n.f1779a;
        V1.v vVar = new V1.v(socket);
        java.io.InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.i.d(inputStream, "getInputStream()");
        return new V1.d(0, vVar, new V1.d(1, inputStream, vVar));
    }

    public abstract void D(byte[] bArr, int i2, int i3);

    public abstract boolean d(m.g gVar, m.c cVar);

    public abstract boolean e(m.g gVar, java.lang.Object obj, java.lang.Object obj2);

    public abstract boolean f(m.g gVar, m.f fVar, m.f fVar2);

    public abstract void w(m.f fVar, m.f fVar2);

    public abstract void x(m.f fVar, java.lang.Thread thread);
}
