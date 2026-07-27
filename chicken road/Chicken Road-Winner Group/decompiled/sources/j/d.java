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
import g.AbstractC0301a;
import h.AbstractC0323a;
import java.io.IOException;
import k.MenuC1069j;
import l.AbstractC1105y;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f9501e;
    public static final Class[] f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f9502a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f9503b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f9504c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9505d;

    static {
        Class[] clsArr = {Context.class};
        f9501e = clsArr;
        f = clsArr;
    }

    public d(Context context) {
        super(context);
        this.f9504c = context;
        Object[] objArr = {context};
        this.f9502a = objArr;
        this.f9503b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
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
        int i3;
        XmlResourceParser xmlResourceParser2;
        boolean z3;
        ColorStateList colorStateList;
        int resourceId;
        C1052c c1052c = new C1052c(this, menu);
        Menu menu2 = c1052c.f9477a;
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r5 = 1;
            i3 = 2;
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
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        while (!z4) {
            if (eventType == r5) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i3) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z5 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        z3 = r5;
                        z5 = false;
                        str = null;
                        eventType = xmlResourceParser2.next();
                        r5 = z3;
                        i3 = 2;
                        z5 = z5;
                    } else if (name2.equals("group")) {
                        c1052c.f9478b = 0;
                        c1052c.f9479c = 0;
                        c1052c.f9480d = 0;
                        c1052c.f9481e = 0;
                        c1052c.f = r5;
                        c1052c.f9482g = r5;
                    } else if (name2.equals("item")) {
                        if (!c1052c.f9483h) {
                            c1052c.f9483h = r5;
                            c1052c.b(menu2.add(c1052c.f9478b, c1052c.f9484i, c1052c.f9485j, c1052c.f9486k));
                        }
                    } else if (name2.equals("menu")) {
                        xmlResourceParser2 = xmlResourceParser;
                        z3 = r5;
                        z4 = z3;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z3 = r5;
            } else {
                if (!z5) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    d dVar = c1052c.f9476D;
                    if (equals) {
                        TypedArray obtainStyledAttributes = dVar.f9504c.obtainStyledAttributes(attributeSet, AbstractC0301a.f4936l);
                        c1052c.f9478b = obtainStyledAttributes.getResourceId(r5, 0);
                        c1052c.f9479c = obtainStyledAttributes.getInt(3, 0);
                        c1052c.f9480d = obtainStyledAttributes.getInt(4, 0);
                        c1052c.f9481e = obtainStyledAttributes.getInt(5, 0);
                        c1052c.f = obtainStyledAttributes.getBoolean(2, r5);
                        c1052c.f9482g = obtainStyledAttributes.getBoolean(0, r5);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = dVar.f9504c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0301a.f4937m);
                            c1052c.f9484i = obtainStyledAttributes2.getResourceId(2, 0);
                            c1052c.f9485j = (obtainStyledAttributes2.getInt(5, c1052c.f9479c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c1052c.f9480d) & 65535);
                            c1052c.f9486k = obtainStyledAttributes2.getText(7);
                            c1052c.f9487l = obtainStyledAttributes2.getText(8);
                            c1052c.f9488m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c1052c.f9489n = string == null ? (char) 0 : string.charAt(0);
                            c1052c.f9490o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c1052c.f9491p = string2 == null ? (char) 0 : string2.charAt(0);
                            c1052c.f9492q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c1052c.f9493r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c1052c.f9493r = c1052c.f9481e;
                            }
                            c1052c.f9494s = obtainStyledAttributes2.getBoolean(3, false);
                            c1052c.f9495t = obtainStyledAttributes2.getBoolean(4, c1052c.f);
                            c1052c.f9496u = obtainStyledAttributes2.getBoolean(1, c1052c.f9482g);
                            c1052c.f9497v = obtainStyledAttributes2.getInt(21, -1);
                            c1052c.y = obtainStyledAttributes2.getString(12);
                            c1052c.f9498w = obtainStyledAttributes2.getResourceId(13, 0);
                            c1052c.f9499x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z6 = string3 != null;
                            if (z6 && c1052c.f9498w == 0 && c1052c.f9499x == null) {
                                if (c1052c.a(string3, f, dVar.f9503b) != null) {
                                    throw new ClassCastException();
                                }
                            } else if (z6) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c1052c.f9500z = obtainStyledAttributes2.getText(17);
                            c1052c.f9473A = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c1052c.f9475C = AbstractC1105y.c(obtainStyledAttributes2.getInt(19, -1), c1052c.f9475C);
                            } else {
                                c1052c.f9475C = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (obtainStyledAttributes2.hasValue(18) && (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) != 0) {
                                    Object obj = AbstractC0323a.f4982a;
                                    colorStateList = context.getColorStateList(resourceId);
                                }
                                colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                c1052c.f9474B = colorStateList;
                            } else {
                                c1052c.f9474B = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c1052c.f9483h = false;
                            xmlResourceParser2 = xmlResourceParser;
                            z3 = true;
                        } else if (name3.equals("menu")) {
                            z3 = true;
                            c1052c.f9483h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(c1052c.f9478b, c1052c.f9484i, c1052c.f9485j, c1052c.f9486k);
                            c1052c.b(addSubMenu.getItem());
                            xmlResourceParser2 = xmlResourceParser;
                            b(xmlResourceParser2, attributeSet, addSubMenu);
                        } else {
                            xmlResourceParser2 = xmlResourceParser;
                            z3 = true;
                            str = name3;
                            z5 = true;
                        }
                        eventType = xmlResourceParser2.next();
                        r5 = z3;
                        i3 = 2;
                        z5 = z5;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z3 = r5;
            }
            eventType = xmlResourceParser2.next();
            r5 = z3;
            i3 = 2;
            z5 = z5;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i3, Menu menu) {
        if (!(menu instanceof MenuC1069j)) {
            super.inflate(i3, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f9504c.getResources().getLayout(i3);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e3) {
                    throw new InflateException("Error inflating menu XML", e3);
                }
            } catch (XmlPullParserException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
