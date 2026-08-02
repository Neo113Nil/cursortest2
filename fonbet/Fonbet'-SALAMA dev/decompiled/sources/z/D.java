package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public int f18239a;

    /* renamed from: e, reason: collision with root package name */
    public int f18243e;

    /* renamed from: f, reason: collision with root package name */
    public final g f18244f;

    /* renamed from: g, reason: collision with root package name */
    public final B.h f18245g;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public String f18248k;

    /* renamed from: o, reason: collision with root package name */
    public final Context f18252o;

    /* renamed from: b, reason: collision with root package name */
    public int f18240b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18241c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f18242d = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f18246h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f18247i = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f18249l = 0;

    /* renamed from: m, reason: collision with root package name */
    public String f18250m = null;

    /* renamed from: n, reason: collision with root package name */
    public int f18251n = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f18253p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f18254q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f18255r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f18256s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f18257t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f18258u = -1;

    public D(Context context, XmlResourceParser xmlResourceParser) {
        char c3;
        this.f18252o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 366511058:
                            if (name.equals("CustomMethod")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    if (c3 == 0) {
                        b(context, xmlResourceParser);
                    } else if (c3 == 1) {
                        this.f18244f = new g(context, xmlResourceParser);
                    } else if (c3 == 2) {
                        this.f18245g = B.m.d(context, xmlResourceParser);
                    } else if (c3 == 3 || c3 == 4) {
                        B.a.d(context, xmlResourceParser, this.f18245g.f803g);
                    } else {
                        Log.e("ViewTransition", p6.c.c() + " unknown tag " + name);
                        StringBuilder sb = new StringBuilder();
                        sb.append(".xml:");
                        sb.append(xmlResourceParser.getLineNumber());
                        Log.e("ViewTransition", sb.toString());
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("ViewTransition".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }

    public final boolean a(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if (this.j == -1 && this.f18248k == null) {
            return false;
        }
        int i7 = this.f18255r;
        boolean z4 = i7 == -1 || view.getTag(i7) != null;
        int i8 = this.f18256s;
        boolean z7 = i8 == -1 || view.getTag(i8) == null;
        if (z4 && z7) {
            if (view.getId() == this.j) {
                return true;
            }
            if (this.f18248k != null && (view.getLayoutParams() instanceof B.c) && (str = ((B.c) view.getLayoutParams()).f725Y) != null && str.matches(this.f18248k)) {
                return true;
            }
        }
        return false;
    }

    public final void b(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), B.q.f928C);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == 0) {
                this.f18239a = obtainStyledAttributes.getResourceId(index, this.f18239a);
            } else if (index == 8) {
                if (MotionLayout.f8824Y0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.f18248k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f18248k = obtainStyledAttributes.getString(index);
                } else {
                    this.j = obtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == 9) {
                this.f18240b = obtainStyledAttributes.getInt(index, this.f18240b);
            } else if (index == 12) {
                this.f18241c = obtainStyledAttributes.getBoolean(index, this.f18241c);
            } else if (index == 10) {
                this.f18242d = obtainStyledAttributes.getInt(index, this.f18242d);
            } else if (index == 4) {
                this.f18246h = obtainStyledAttributes.getInt(index, this.f18246h);
            } else if (index == 13) {
                this.f18247i = obtainStyledAttributes.getInt(index, this.f18247i);
            } else if (index == 14) {
                this.f18243e = obtainStyledAttributes.getInt(index, this.f18243e);
            } else if (index == 7) {
                int i8 = obtainStyledAttributes.peekValue(index).type;
                if (i8 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f18251n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f18249l = -2;
                    }
                } else if (i8 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f18250m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f18249l = -1;
                    } else {
                        this.f18251n = obtainStyledAttributes.getResourceId(index, -1);
                        this.f18249l = -2;
                    }
                } else {
                    this.f18249l = obtainStyledAttributes.getInteger(index, this.f18249l);
                }
            } else if (index == 11) {
                this.f18253p = obtainStyledAttributes.getResourceId(index, this.f18253p);
            } else if (index == 3) {
                this.f18254q = obtainStyledAttributes.getResourceId(index, this.f18254q);
            } else if (index == 6) {
                this.f18255r = obtainStyledAttributes.getResourceId(index, this.f18255r);
            } else if (index == 5) {
                this.f18256s = obtainStyledAttributes.getResourceId(index, this.f18256s);
            } else if (index == 2) {
                this.f18258u = obtainStyledAttributes.getResourceId(index, this.f18258u);
            } else if (index == 1) {
                this.f18257t = obtainStyledAttributes.getInteger(index, this.f18257t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + p6.c.f(this.f18239a, this.f18252o) + ")";
    }
}
