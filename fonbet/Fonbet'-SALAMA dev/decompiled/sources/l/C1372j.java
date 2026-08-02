package l;

import P.AbstractC0347c;
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
import androidx.appcompat.widget.AbstractC0637f0;
import h.AbstractC1174a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: l.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1372j extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f14845e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f14846f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f14847a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f14848b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f14849c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14850d;

    static {
        Class[] clsArr = {Context.class};
        f14845e = clsArr;
        f14846f = clsArr;
    }

    public C1372j(Context context) {
        super(context);
        this.f14849c = context;
        Object[] objArr = {context};
        this.f14847a = objArr;
        this.f14848b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r42;
        int i7;
        boolean z4;
        ColorStateList colorStateList;
        int resourceId;
        C1371i c1371i = new C1371i(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r42 = 1;
            i7 = 2;
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
        boolean z7 = false;
        boolean z8 = false;
        String str = null;
        while (!z7) {
            if (eventType == r42) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i7) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z8 && name2.equals(str)) {
                        z4 = r42;
                        z8 = false;
                        str = null;
                        eventType = xmlResourceParser.next();
                        r42 = z4;
                        i7 = 2;
                        z8 = z8;
                    } else if (name2.equals("group")) {
                        c1371i.f14821b = 0;
                        c1371i.f14822c = 0;
                        c1371i.f14823d = 0;
                        c1371i.f14824e = 0;
                        c1371i.f14825f = r42;
                        c1371i.f14826g = r42;
                    } else if (name2.equals("item")) {
                        if (!c1371i.f14827h) {
                            AbstractC0347c abstractC0347c = c1371i.f14844z;
                            if (abstractC0347c == null || !((m.n) abstractC0347c).f15179b.hasSubMenu()) {
                                c1371i.f14827h = r42;
                                c1371i.b(c1371i.f14820a.add(c1371i.f14821b, c1371i.f14828i, c1371i.j, c1371i.f14829k));
                            } else {
                                c1371i.f14827h = r42;
                                c1371i.b(c1371i.f14820a.addSubMenu(c1371i.f14821b, c1371i.f14828i, c1371i.j, c1371i.f14829k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z4 = r42;
                        z7 = z4;
                    }
                }
                z4 = r42;
            } else {
                if (!z8) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C1372j c1372j = c1371i.f14819E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c1372j.f14849c.obtainStyledAttributes(attributeSet, AbstractC1174a.f13338q);
                        c1371i.f14821b = obtainStyledAttributes.getResourceId(r42, 0);
                        c1371i.f14822c = obtainStyledAttributes.getInt(3, 0);
                        c1371i.f14823d = obtainStyledAttributes.getInt(4, 0);
                        c1371i.f14824e = obtainStyledAttributes.getInt(5, 0);
                        c1371i.f14825f = obtainStyledAttributes.getBoolean(2, r42);
                        c1371i.f14826g = obtainStyledAttributes.getBoolean(0, r42);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c1372j.f14849c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1174a.f13339r);
                            c1371i.f14828i = obtainStyledAttributes2.getResourceId(2, 0);
                            c1371i.j = (obtainStyledAttributes2.getInt(5, c1371i.f14822c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c1371i.f14823d) & 65535);
                            c1371i.f14829k = obtainStyledAttributes2.getText(7);
                            c1371i.f14830l = obtainStyledAttributes2.getText(8);
                            c1371i.f14831m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c1371i.f14832n = string == null ? (char) 0 : string.charAt(0);
                            c1371i.f14833o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c1371i.f14834p = string2 == null ? (char) 0 : string2.charAt(0);
                            c1371i.f14835q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c1371i.f14836r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c1371i.f14836r = c1371i.f14824e;
                            }
                            c1371i.f14837s = obtainStyledAttributes2.getBoolean(3, false);
                            c1371i.f14838t = obtainStyledAttributes2.getBoolean(4, c1371i.f14825f);
                            c1371i.f14839u = obtainStyledAttributes2.getBoolean(1, c1371i.f14826g);
                            c1371i.f14840v = obtainStyledAttributes2.getInt(21, -1);
                            c1371i.f14843y = obtainStyledAttributes2.getString(12);
                            c1371i.f14841w = obtainStyledAttributes2.getResourceId(13, 0);
                            c1371i.f14842x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z9 = string3 != null;
                            if (z9 && c1371i.f14841w == 0 && c1371i.f14842x == null) {
                                c1371i.f14844z = (AbstractC0347c) c1371i.a(string3, f14846f, c1372j.f14848b);
                            } else {
                                if (z9) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c1371i.f14844z = null;
                            }
                            c1371i.f14815A = obtainStyledAttributes2.getText(17);
                            c1371i.f14816B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c1371i.f14818D = AbstractC0637f0.c(obtainStyledAttributes2.getInt(19, -1), c1371i.f14818D);
                            } else {
                                c1371i.f14818D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = G.h.getColorStateList(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                c1371i.f14817C = colorStateList;
                            } else {
                                c1371i.f14817C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c1371i.f14827h = false;
                            z4 = true;
                        } else if (name3.equals("menu")) {
                            z4 = true;
                            c1371i.f14827h = true;
                            SubMenu addSubMenu = c1371i.f14820a.addSubMenu(c1371i.f14821b, c1371i.f14828i, c1371i.j, c1371i.f14829k);
                            c1371i.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            z4 = true;
                            str = name3;
                            z8 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r42 = z4;
                        i7 = 2;
                        z8 = z8;
                    }
                }
                z4 = r42;
            }
            eventType = xmlResourceParser.next();
            r42 = z4;
            i7 = 2;
            z8 = z8;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i7, Menu menu) {
        if (!(menu instanceof m.k)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f14849c.getResources().getLayout(i7);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e7) {
                    throw new InflateException("Error inflating menu XML", e7);
                }
            } catch (XmlPullParserException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
