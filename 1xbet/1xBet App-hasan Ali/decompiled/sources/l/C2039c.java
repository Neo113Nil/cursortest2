package l;

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
import h.AbstractC1986a;
import java.io.IOException;
import m.MenuC2070h;
import n.AbstractC2119M;
import org.xmlpull.v1.XmlPullParserException;
import r0.AbstractC2346c;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2039c extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f17657e;
    public static final Class[] f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f17658a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f17659b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f17660c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17661d;

    static {
        Class[] clsArr = {Context.class};
        f17657e = clsArr;
        f = clsArr;
    }

    public C2039c(Context context) {
        super(context);
        this.f17660c = context;
        Object[] objArr = {context};
        this.f17658a = objArr;
        this.f17659b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v58 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r42;
        int i;
        XmlResourceParser xmlResourceParser2;
        boolean z3;
        ColorStateList colorStateList;
        int resourceId;
        C2038b c2038b = new C2038b(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r42 = 1;
            i = 2;
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
            if (eventType == r42) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z6 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        z3 = r42;
                        z6 = false;
                        str = null;
                        eventType = xmlResourceParser2.next();
                        r42 = z3;
                        i = 2;
                        z6 = z6;
                    } else if (name2.equals("group")) {
                        c2038b.f17634b = 0;
                        c2038b.f17635c = 0;
                        c2038b.f17636d = 0;
                        c2038b.f17637e = 0;
                        c2038b.f = r42;
                        c2038b.f17638g = r42;
                    } else if (name2.equals("item")) {
                        if (!c2038b.f17639h) {
                            c2038b.f17639h = r42;
                            c2038b.b(c2038b.f17633a.add(c2038b.f17634b, c2038b.i, c2038b.f17640j, c2038b.f17641k));
                        }
                    } else if (name2.equals("menu")) {
                        xmlResourceParser2 = xmlResourceParser;
                        z3 = r42;
                        z5 = z3;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z3 = r42;
            } else {
                if (!z6) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C2039c c2039c = c2038b.f17632D;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c2039c.f17660c.obtainStyledAttributes(attributeSet, AbstractC1986a.f17178l);
                        c2038b.f17634b = obtainStyledAttributes.getResourceId(r42, 0);
                        c2038b.f17635c = obtainStyledAttributes.getInt(3, 0);
                        c2038b.f17636d = obtainStyledAttributes.getInt(4, 0);
                        c2038b.f17637e = obtainStyledAttributes.getInt(5, 0);
                        c2038b.f = obtainStyledAttributes.getBoolean(2, r42);
                        c2038b.f17638g = obtainStyledAttributes.getBoolean(0, r42);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c2039c.f17660c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1986a.f17179m);
                            c2038b.i = obtainStyledAttributes2.getResourceId(2, 0);
                            c2038b.f17640j = (obtainStyledAttributes2.getInt(5, c2038b.f17635c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c2038b.f17636d) & 65535);
                            c2038b.f17641k = obtainStyledAttributes2.getText(7);
                            c2038b.f17642l = obtainStyledAttributes2.getText(8);
                            c2038b.f17643m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c2038b.f17644n = string == null ? (char) 0 : string.charAt(0);
                            c2038b.f17645o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c2038b.f17646p = string2 == null ? (char) 0 : string2.charAt(0);
                            c2038b.f17647q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c2038b.f17648r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c2038b.f17648r = c2038b.f17637e;
                            }
                            c2038b.f17649s = obtainStyledAttributes2.getBoolean(3, false);
                            c2038b.f17650t = obtainStyledAttributes2.getBoolean(4, c2038b.f);
                            c2038b.f17651u = obtainStyledAttributes2.getBoolean(1, c2038b.f17638g);
                            c2038b.f17652v = obtainStyledAttributes2.getInt(21, -1);
                            c2038b.f17655y = obtainStyledAttributes2.getString(12);
                            c2038b.f17653w = obtainStyledAttributes2.getResourceId(13, 0);
                            c2038b.f17654x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z7 = string3 != null;
                            if (z7 && c2038b.f17653w == 0 && c2038b.f17654x == null) {
                                if (c2038b.a(string3, f, c2039c.f17659b) != null) {
                                    throw new ClassCastException();
                                }
                            } else if (z7) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c2038b.f17656z = obtainStyledAttributes2.getText(17);
                            c2038b.f17629A = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c2038b.f17631C = AbstractC2119M.b(obtainStyledAttributes2.getInt(19, -1), c2038b.f17631C);
                            } else {
                                c2038b.f17631C = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC2346c.o(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                c2038b.f17630B = colorStateList;
                            } else {
                                c2038b.f17630B = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c2038b.f17639h = false;
                            xmlResourceParser2 = xmlResourceParser;
                            z3 = true;
                        } else if (name3.equals("menu")) {
                            z3 = true;
                            c2038b.f17639h = true;
                            SubMenu addSubMenu = c2038b.f17633a.addSubMenu(c2038b.f17634b, c2038b.i, c2038b.f17640j, c2038b.f17641k);
                            c2038b.b(addSubMenu.getItem());
                            xmlResourceParser2 = xmlResourceParser;
                            b(xmlResourceParser2, attributeSet, addSubMenu);
                        } else {
                            xmlResourceParser2 = xmlResourceParser;
                            z3 = true;
                            str = name3;
                            z6 = true;
                        }
                        eventType = xmlResourceParser2.next();
                        r42 = z3;
                        i = 2;
                        z6 = z6;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z3 = r42;
            }
            eventType = xmlResourceParser2.next();
            r42 = z3;
            i = 2;
            z6 = z6;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC2070h)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z3 = false;
        try {
            try {
                xmlResourceParser = this.f17660c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof MenuC2070h) {
                    MenuC2070h menuC2070h = (MenuC2070h) menu;
                    if (!menuC2070h.f17916n) {
                        menuC2070h.s();
                        z3 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z3) {
                    ((MenuC2070h) menu).r();
                }
                xmlResourceParser.close();
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            } catch (XmlPullParserException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            }
        } catch (Throwable th) {
            if (z3) {
                ((MenuC2070h) menu).r();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
