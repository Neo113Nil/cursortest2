package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import g.AbstractC0444a;
import h.AbstractC0477a;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.IOException;
import k.i;
import l.AbstractC1250w;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: j.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1197d extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f10434e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f10435f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f10436a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f10437b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f10438c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10439d;

    static {
        Class[] clsArr = {Context.class};
        f10434e = clsArr;
        f10435f = clsArr;
    }

    public C1197d(Context context) {
        super(context);
        this.f10438c = context;
        Object[] objArr = {context};
        this.f10436a = objArr;
        this.f10437b = objArr;
    }

    public static Object a(Context context) {
        return context instanceof Activity ? context : context instanceof ContextWrapper ? a(((ContextWrapper) context).getBaseContext()) : context;
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
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r5;
        int i2;
        boolean z;
        ColorStateList colorStateList;
        int resourceId;
        C1196c c1196c = new C1196c(this, menu);
        Menu menu2 = c1196c.f10409a;
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r5 = 1;
            i2 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z5 = false;
        boolean z6 = false;
        String str = null;
        while (!z5) {
            if (eventType == r5) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i2) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z6 && name2.equals(str)) {
                        z = r5;
                        z6 = false;
                        str = null;
                        eventType = xmlResourceParser.next();
                        r5 = z;
                        i2 = 2;
                        z6 = z6;
                    } else if (name2.equals("group")) {
                        c1196c.f10410b = 0;
                        c1196c.f10411c = 0;
                        c1196c.f10412d = 0;
                        c1196c.f10413e = 0;
                        c1196c.f10414f = r5;
                        c1196c.f10415g = r5;
                    } else if (name2.equals("item")) {
                        if (!c1196c.f10416h) {
                            c1196c.f10416h = r5;
                            c1196c.b(menu2.add(c1196c.f10410b, c1196c.f10417i, c1196c.f10418j, c1196c.f10419k));
                        }
                    } else if (name2.equals("menu")) {
                        z = r5;
                        z5 = z;
                    }
                }
                z = r5;
            } else {
                if (!z6) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C1197d c1197d = c1196c.f10408D;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c1197d.f10438c.obtainStyledAttributes(attributeSet, AbstractC0444a.f5704l);
                        c1196c.f10410b = obtainStyledAttributes.getResourceId(r5, 0);
                        c1196c.f10411c = obtainStyledAttributes.getInt(3, 0);
                        c1196c.f10412d = obtainStyledAttributes.getInt(4, 0);
                        c1196c.f10413e = obtainStyledAttributes.getInt(5, 0);
                        c1196c.f10414f = obtainStyledAttributes.getBoolean(2, r5);
                        c1196c.f10415g = obtainStyledAttributes.getBoolean(0, r5);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c1197d.f10438c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0444a.f5705m);
                            c1196c.f10417i = obtainStyledAttributes2.getResourceId(2, 0);
                            c1196c.f10418j = (obtainStyledAttributes2.getInt(5, c1196c.f10411c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c1196c.f10412d) & 65535);
                            c1196c.f10419k = obtainStyledAttributes2.getText(7);
                            c1196c.f10420l = obtainStyledAttributes2.getText(8);
                            c1196c.f10421m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c1196c.f10422n = string == null ? (char) 0 : string.charAt(0);
                            c1196c.f10423o = obtainStyledAttributes2.getInt(16, Base64Utils.IO_BUFFER_SIZE);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c1196c.f10424p = string2 == null ? (char) 0 : string2.charAt(0);
                            c1196c.f10425q = obtainStyledAttributes2.getInt(20, Base64Utils.IO_BUFFER_SIZE);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c1196c.f10426r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c1196c.f10426r = c1196c.f10413e;
                            }
                            c1196c.f10427s = obtainStyledAttributes2.getBoolean(3, false);
                            c1196c.f10428t = obtainStyledAttributes2.getBoolean(4, c1196c.f10414f);
                            c1196c.f10429u = obtainStyledAttributes2.getBoolean(1, c1196c.f10415g);
                            c1196c.f10430v = obtainStyledAttributes2.getInt(21, -1);
                            c1196c.f10433y = obtainStyledAttributes2.getString(12);
                            c1196c.f10431w = obtainStyledAttributes2.getResourceId(13, 0);
                            c1196c.f10432x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z7 = string3 != null;
                            if (z7 && c1196c.f10431w == 0 && c1196c.f10432x == null) {
                                if (c1196c.a(string3, f10435f, c1197d.f10437b) != null) {
                                    throw new ClassCastException();
                                }
                            } else if (z7) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c1196c.z = obtainStyledAttributes2.getText(17);
                            c1196c.f10405A = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c1196c.f10407C = AbstractC1250w.c(obtainStyledAttributes2.getInt(19, -1), c1196c.f10407C);
                            } else {
                                c1196c.f10407C = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (obtainStyledAttributes2.hasValue(18) && (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) != 0) {
                                    Object obj = AbstractC0477a.f5759a;
                                    colorStateList = context.getColorStateList(resourceId);
                                }
                                colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                c1196c.f10406B = colorStateList;
                            } else {
                                c1196c.f10406B = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c1196c.f10416h = false;
                            z = true;
                        } else if (name3.equals("menu")) {
                            z = true;
                            c1196c.f10416h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(c1196c.f10410b, c1196c.f10417i, c1196c.f10418j, c1196c.f10419k);
                            c1196c.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            z = true;
                            str = name3;
                            z6 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r5 = z;
                        i2 = 2;
                        z6 = z6;
                    }
                }
                z = r5;
            }
            eventType = xmlResourceParser.next();
            r5 = z;
            i2 = 2;
            z6 = z6;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof i)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f10438c.getResources().getLayout(i2);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e3) {
                    throw new InflateException("Error inflating menu XML", e3);
                }
            } catch (XmlPullParserException e6) {
                throw new InflateException("Error inflating menu XML", e6);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
