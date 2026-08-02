package p000;

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
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vb1 extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class[] f8161e;

    /* JADX INFO: renamed from: f */
    public static final Class[] f8162f;

    /* JADX INFO: renamed from: a */
    public final Object[] f8163a;

    /* JADX INFO: renamed from: b */
    public final Object[] f8164b;

    /* JADX INFO: renamed from: c */
    public final Context f8165c;

    /* JADX INFO: renamed from: d */
    public Object f8166d;

    static {
        Class[] clsArr = {Context.class};
        f8161e = clsArr;
        f8162f = clsArr;
    }

    public vb1(Context context) {
        super(context);
        this.f8165c = context;
        Object[] objArr = {context};
        this.f8163a = objArr;
        this.f8164b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public static Object m5143a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m5143a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX INFO: renamed from: b */
    public final void m5144b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        ub1 ub1Var = new ub1(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = ub1Var.f7761a;
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.f8165c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mz0.f5202p);
                        ub1Var.f7762b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        ub1Var.f7763c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        ub1Var.f7764d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        ub1Var.f7765e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        ub1Var.f7766f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        ub1Var.f7767g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, mz0.f5203q);
                        ub1Var.f7769i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        ub1Var.f7770j = (typedArrayObtainStyledAttributes2.getInt(5, ub1Var.f7763c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, ub1Var.f7764d) & 65535);
                        ub1Var.f7771k = typedArrayObtainStyledAttributes2.getText(7);
                        ub1Var.f7772l = typedArrayObtainStyledAttributes2.getText(8);
                        ub1Var.f7773m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        ub1Var.f7774n = string == null ? (char) 0 : string.charAt(0);
                        ub1Var.f7775o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        ub1Var.f7776p = string2 == null ? (char) 0 : string2.charAt(0);
                        ub1Var.f7777q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            ub1Var.f7778r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            ub1Var.f7778r = ub1Var.f7765e;
                        }
                        ub1Var.f7779s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        ub1Var.f7780t = typedArrayObtainStyledAttributes2.getBoolean(4, ub1Var.f7766f);
                        ub1Var.f7781u = typedArrayObtainStyledAttributes2.getBoolean(1, ub1Var.f7767g);
                        ub1Var.f7782v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        ub1Var.f7785y = typedArrayObtainStyledAttributes2.getString(12);
                        ub1Var.f7783w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        ub1Var.f7784x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && ub1Var.f7783w == 0 && ub1Var.f7784x == null) {
                            ub1Var.f7786z = (sn0) ub1Var.m4902a(string3, f8162f, this.f8164b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            ub1Var.f7786z = null;
                        }
                        ub1Var.f7756A = typedArrayObtainStyledAttributes2.getText(17);
                        ub1Var.f7757B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            ub1Var.f7759D = AbstractC0890xu.m5689b(typedArrayObtainStyledAttributes2.getInt(19, -1), ub1Var.f7759D);
                        } else {
                            ub1Var.f7759D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = j22.m2806o(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            ub1Var.f7758C = colorStateList;
                        } else {
                            ub1Var.f7758C = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        ub1Var.f7768h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        ub1Var.f7768h = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(ub1Var.f7762b, ub1Var.f7769i, ub1Var.f7770j, ub1Var.f7771k);
                        ub1Var.m4903b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        m5144b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        ub1Var.f7762b = 0;
                        ub1Var.f7763c = 0;
                        ub1Var.f7764d = 0;
                        ub1Var.f7765e = 0;
                        ub1Var.f7766f = true;
                        ub1Var.f7767g = true;
                    } else if (name3.equals("item")) {
                        if (!ub1Var.f7768h) {
                            sn0 sn0Var = ub1Var.f7786z;
                            if (sn0Var == null || !sn0Var.f7155b.hasSubMenu()) {
                                ub1Var.f7768h = true;
                                ub1Var.m4903b(menu2.add(ub1Var.f7762b, ub1Var.f7769i, ub1Var.f7770j, ub1Var.f7771k));
                            } else {
                                ub1Var.f7768h = true;
                                ub1Var.m4903b(menu2.addSubMenu(ub1Var.f7762b, ub1Var.f7769i, ub1Var.f7770j, ub1Var.f7771k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof on0)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f8165c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof on0) {
                    on0 on0Var = (on0) menu;
                    if (!on0Var.f5814y) {
                        on0Var.m3719w();
                        z = true;
                    }
                }
                m5144b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((on0) menu).m3718v();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((on0) menu).m3718v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
