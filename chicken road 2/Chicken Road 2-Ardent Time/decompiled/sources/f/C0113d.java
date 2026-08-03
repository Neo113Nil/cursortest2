package f;

/* renamed from: f.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113d extends android.view.MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Class[] f2776e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Class[] f2777f;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object[] f2778a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f2779b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f2780c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f2781d;

    static {
        java.lang.Class[] clsArr = {android.content.Context.class};
        f2776e = clsArr;
        f2777f = clsArr;
    }

    public C0113d(android.content.Context context) {
        super(context);
        this.f2780c = context;
        java.lang.Object[] objArr = {context};
        this.f2778a = objArr;
        this.f2779b = objArr;
    }

    public static java.lang.Object a(android.content.Context context) {
        return context instanceof android.app.Activity ? context : context instanceof android.content.ContextWrapper ? a(((android.content.ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0211, code lost:
    
        if (r4 != null) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(android.content.res.XmlResourceParser xmlResourceParser, android.util.AttributeSet attributeSet, android.view.Menu menu) {
        ?? r5;
        int i2;
        boolean z2;
        android.content.res.ColorStateList colorStateList;
        int resourceId;
        f.C0112c c0112c = new f.C0112c(this, menu);
        android.view.Menu menu2 = c0112c.f2751a;
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r5 = 1;
            i2 = 2;
            if (eventType == 2) {
                java.lang.String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new java.lang.RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        java.lang.String str = null;
        while (!z3) {
            if (eventType == r5) {
                throw new java.lang.RuntimeException("Unexpected end of document");
            }
            if (eventType != i2) {
                if (eventType == 3) {
                    java.lang.String name2 = xmlResourceParser.getName();
                    if (z4 && name2.equals(str)) {
                        z2 = r5;
                        z4 = false;
                        str = null;
                        eventType = xmlResourceParser.next();
                        r5 = z2;
                        i2 = 2;
                        z4 = z4;
                    } else if (name2.equals("group")) {
                        c0112c.f2752b = 0;
                        c0112c.f2753c = 0;
                        c0112c.f2754d = 0;
                        c0112c.f2755e = 0;
                        c0112c.f2756f = r5;
                        c0112c.f2757g = r5;
                    } else if (name2.equals("item")) {
                        if (!c0112c.f2758h) {
                            c0112c.f2758h = r5;
                            c0112c.b(menu2.add(c0112c.f2752b, c0112c.f2759i, c0112c.f2760j, c0112c.f2761k));
                        }
                    } else if (name2.equals("menu")) {
                        z2 = r5;
                        z3 = z2;
                    }
                }
                z2 = r5;
            } else {
                if (!z4) {
                    java.lang.String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    f.C0113d c0113d = c0112c.f2750D;
                    if (equals) {
                        android.content.res.TypedArray obtainStyledAttributes = c0113d.f2780c.obtainStyledAttributes(attributeSet, c.AbstractC0095a.f2543l);
                        c0112c.f2752b = obtainStyledAttributes.getResourceId(r5, 0);
                        c0112c.f2753c = obtainStyledAttributes.getInt(3, 0);
                        c0112c.f2754d = obtainStyledAttributes.getInt(4, 0);
                        c0112c.f2755e = obtainStyledAttributes.getInt(5, 0);
                        c0112c.f2756f = obtainStyledAttributes.getBoolean(2, r5);
                        c0112c.f2757g = obtainStyledAttributes.getBoolean(0, r5);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            android.content.Context context = c0113d.f2780c;
                            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, c.AbstractC0095a.f2544m);
                            c0112c.f2759i = obtainStyledAttributes2.getResourceId(2, 0);
                            c0112c.f2760j = (obtainStyledAttributes2.getInt(5, c0112c.f2753c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c0112c.f2754d) & 65535);
                            c0112c.f2761k = obtainStyledAttributes2.getText(7);
                            c0112c.f2762l = obtainStyledAttributes2.getText(8);
                            c0112c.f2763m = obtainStyledAttributes2.getResourceId(0, 0);
                            java.lang.String string = obtainStyledAttributes2.getString(9);
                            c0112c.f2764n = string == null ? (char) 0 : string.charAt(0);
                            c0112c.f2765o = obtainStyledAttributes2.getInt(16, io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE);
                            java.lang.String string2 = obtainStyledAttributes2.getString(10);
                            c0112c.f2766p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0112c.f2767q = obtainStyledAttributes2.getInt(20, io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c0112c.f2768r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0112c.f2768r = c0112c.f2755e;
                            }
                            c0112c.f2769s = obtainStyledAttributes2.getBoolean(3, false);
                            c0112c.t = obtainStyledAttributes2.getBoolean(4, c0112c.f2756f);
                            c0112c.f2770u = obtainStyledAttributes2.getBoolean(1, c0112c.f2757g);
                            c0112c.f2771v = obtainStyledAttributes2.getInt(21, -1);
                            c0112c.f2774y = obtainStyledAttributes2.getString(12);
                            c0112c.f2772w = obtainStyledAttributes2.getResourceId(13, 0);
                            c0112c.f2773x = obtainStyledAttributes2.getString(15);
                            java.lang.String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && c0112c.f2772w == 0 && c0112c.f2773x == null) {
                                if (c0112c.a(string3, f2777f, c0113d.f2779b) != null) {
                                    throw new java.lang.ClassCastException();
                                }
                            } else if (z5) {
                                android.util.Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c0112c.f2775z = obtainStyledAttributes2.getText(17);
                            c0112c.f2747A = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c0112c.f2749C = h.AbstractC0165x.c(obtainStyledAttributes2.getInt(19, -1), c0112c.f2749C);
                            } else {
                                c0112c.f2749C = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (obtainStyledAttributes2.hasValue(18) && (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) != 0) {
                                    java.lang.Object obj = d.AbstractC0106a.f2737a;
                                    colorStateList = context.getColorStateList(resourceId);
                                }
                                colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                c0112c.f2748B = colorStateList;
                            } else {
                                c0112c.f2748B = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c0112c.f2758h = false;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            c0112c.f2758h = true;
                            android.view.SubMenu addSubMenu = menu2.addSubMenu(c0112c.f2752b, c0112c.f2759i, c0112c.f2760j, c0112c.f2761k);
                            c0112c.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            z2 = true;
                            str = name3;
                            z4 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r5 = z2;
                        i2 = 2;
                        z4 = z4;
                    }
                }
                z2 = r5;
            }
            eventType = xmlResourceParser.next();
            r5 = z2;
            i2 = 2;
            z4 = z4;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, android.view.Menu menu) {
        if (!(menu instanceof g.j)) {
            super.inflate(i2, menu);
            return;
        }
        android.content.res.XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f2780c.getResources().getLayout(i2);
                    b(xmlResourceParser, android.util.Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (java.io.IOException e2) {
                    throw new android.view.InflateException("Error inflating menu XML", e2);
                }
            } catch (org.xmlpull.v1.XmlPullParserException e3) {
                throw new android.view.InflateException("Error inflating menu XML", e3);
            }
        } catch (java.lang.Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
