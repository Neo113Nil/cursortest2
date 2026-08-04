package p078l;

import G.h;
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
import androidx.appcompat.widget.AbstractC0616f0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p051h.a;
import p086m.k;
import p086m.n;

/* JADX INFO: loaded from: classes.dex */
public final class j extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f14851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f14852f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f14853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f14854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f14855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14856d;

    static {
        Class[] clsArr = {Context.class};
        f14851e = clsArr;
        f14852f = clsArr;
    }

    public j(Context context) {
        super(context);
        this.f14855c = context;
        Object[] objArr = {context};
        this.f14853a = objArr;
        this.f14854b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [l.j] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r7;
        int i7;
        ?? r8;
        ColorStateList colorStateList;
        int resourceId;
        i iVar = new i(this, menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            r7 = 1;
            i7 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z4 = false;
        boolean z7 = false;
        String str = null;
        while (!z4) {
            if (eventType == r7) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i7) {
                if (!z7) {
                    String name2 = xmlResourceParser.getName();
                    boolean zEquals = name2.equals("group");
                    j jVar = iVar.f14825E;
                    if (zEquals) {
                        ?? ObtainStyledAttributes = jVar.f14855c.obtainStyledAttributes(attributeSet, a.f13344q);
                        iVar.f14827b = ObtainStyledAttributes.getResourceId(r7, 0);
                        iVar.f14828c = ObtainStyledAttributes.getInt(3, 0);
                        iVar.f14829d = ObtainStyledAttributes.getInt(4, 0);
                        iVar.f14830e = ObtainStyledAttributes.getInt(5, 0);
                        iVar.f14831f = ObtainStyledAttributes.getBoolean(2, r7);
                        iVar.f14832g = ObtainStyledAttributes.getBoolean(0, r7);
                        ObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        Context context = jVar.f14855c;
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f13345r);
                        iVar.f14834i = typedArrayObtainStyledAttributes.getResourceId(2, 0);
                        iVar.j = (typedArrayObtainStyledAttributes.getInt(5, iVar.f14828c) & (-65536)) | (typedArrayObtainStyledAttributes.getInt(6, iVar.f14829d) & 65535);
                        iVar.f14835k = typedArrayObtainStyledAttributes.getText(7);
                        iVar.f14836l = typedArrayObtainStyledAttributes.getText(8);
                        iVar.f14837m = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes.getString(9);
                        iVar.f14838n = string == null ? (char) 0 : string.charAt(0);
                        iVar.f14839o = typedArrayObtainStyledAttributes.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes.getString(10);
                        iVar.f14840p = string2 == null ? (char) 0 : string2.charAt(0);
                        iVar.f14841q = typedArrayObtainStyledAttributes.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes.hasValue(11)) {
                            iVar.f14842r = typedArrayObtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
                        } else {
                            iVar.f14842r = iVar.f14830e;
                        }
                        iVar.f14843s = typedArrayObtainStyledAttributes.getBoolean(3, false);
                        iVar.f14844t = typedArrayObtainStyledAttributes.getBoolean(4, iVar.f14831f);
                        iVar.f14845u = typedArrayObtainStyledAttributes.getBoolean(1, iVar.f14832g);
                        iVar.f14846v = typedArrayObtainStyledAttributes.getInt(21, -1);
                        iVar.f14849y = typedArrayObtainStyledAttributes.getString(12);
                        iVar.f14847w = typedArrayObtainStyledAttributes.getResourceId(13, 0);
                        iVar.f14848x = typedArrayObtainStyledAttributes.getString(15);
                        String string3 = typedArrayObtainStyledAttributes.getString(14);
                        boolean z8 = string3 != null;
                        if (z8 && iVar.f14847w == 0 && iVar.f14848x == null) {
                            iVar.f14850z = (AbstractC0347c) iVar.a(string3, f14852f, jVar.f14854b);
                        } else {
                            if (z8) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            iVar.f14850z = null;
                        }
                        iVar.f14821A = typedArrayObtainStyledAttributes.getText(17);
                        iVar.f14822B = typedArrayObtainStyledAttributes.getText(22);
                        if (typedArrayObtainStyledAttributes.hasValue(19)) {
                            iVar.f14824D = AbstractC0616f0.c(typedArrayObtainStyledAttributes.getInt(19, -1), iVar.f14824D);
                        } else {
                            iVar.f14824D = null;
                        }
                        if (typedArrayObtainStyledAttributes.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(18, 0)) == 0 || (colorStateList = h.getColorStateList(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(18);
                            }
                            iVar.f14823C = colorStateList;
                        } else {
                            iVar.f14823C = null;
                        }
                        typedArrayObtainStyledAttributes.recycle();
                        iVar.f14833h = false;
                        r8 = 1;
                    } else if (name2.equals("menu")) {
                        r8 = 1;
                        iVar.f14833h = true;
                        SubMenu subMenuAddSubMenu = iVar.f14826a.addSubMenu(iVar.f14827b, iVar.f14834i, iVar.j, iVar.f14835k);
                        iVar.b(subMenuAddSubMenu.getItem());
                        b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        r8 = 1;
                        str = name2;
                        z7 = true;
                    }
                }
                r8 = r7;
                z4 = z4;
            } else if (eventType != 3) {
                r8 = r7;
                z4 = z4;
            } else {
                String name3 = xmlResourceParser.getName();
                if (z7 && name3.equals(str)) {
                    r8 = r7;
                    z7 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        iVar.f14827b = 0;
                        iVar.f14828c = 0;
                        iVar.f14829d = 0;
                        iVar.f14830e = 0;
                        iVar.f14831f = r7;
                        iVar.f14832g = r7;
                    } else if (name3.equals("item")) {
                        if (!iVar.f14833h) {
                            AbstractC0347c abstractC0347c = iVar.f14850z;
                            if (abstractC0347c == null || !((n) abstractC0347c).f15185b.hasSubMenu()) {
                                iVar.f14833h = r7;
                                iVar.b(iVar.f14826a.add(iVar.f14827b, iVar.f14834i, iVar.j, iVar.f14835k));
                            } else {
                                iVar.f14833h = r7;
                                iVar.b(iVar.f14826a.addSubMenu(iVar.f14827b, iVar.f14834i, iVar.j, iVar.f14835k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        ?? r9 = r7;
                        z4 = r9 == true ? 1 : 0;
                        r8 = r9;
                    }
                    r8 = r7;
                    z4 = z4;
                }
            }
            eventType = xmlResourceParser.next();
            r7 = r8;
            i7 = 2;
            z4 = z4;
            z7 = z7;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i7, Menu menu) {
        if (!(menu instanceof k)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f14855c.getResources().getLayout(i7);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e7) {
                    throw new InflateException("Error inflating menu XML", e7);
                }
            } catch (XmlPullParserException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
