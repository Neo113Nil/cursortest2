package p169z;

import B.a;
import B.h;
import B.m;
import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p115p6.c;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18245a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f18250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f18251g;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f18254k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f18258o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18246b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18247c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18248d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18252h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18253i = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18255l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f18256m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18257n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f18259p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18260q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18261r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f18262s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18263t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18264u = -1;

    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public D(Context context, XmlResourceParser xmlResourceParser) {
        byte b7;
        this.f18258o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                b7 = -1;
                            } else {
                                b7 = 2;
                            }
                            break;
                        case -1239391468:
                            if (!name.equals("KeyFrameSet")) {
                                b7 = -1;
                            } else {
                                b7 = 1;
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                b7 = -1;
                            } else {
                                b7 = 0;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                b7 = -1;
                            } else {
                                b7 = 4;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                b7 = -1;
                            } else {
                                b7 = 3;
                            }
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    if (b7 == 0) {
                        b(context, xmlResourceParser);
                    } else if (b7 == 1) {
                        this.f18250f = new g(context, xmlResourceParser);
                    } else if (b7 == 2) {
                        this.f18251g = m.d(context, xmlResourceParser);
                    } else if (b7 == 3 || b7 == 4) {
                        a.d(context, xmlResourceParser, this.f18251g.f803g);
                    } else {
                        Log.e("ViewTransition", c.c() + " unknown tag " + name);
                        StringBuilder sb = new StringBuilder();
                        sb.append(".xml:");
                        sb.append(xmlResourceParser.getLineNumber());
                        Log.e("ViewTransition", sb.toString());
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlResourceParser.getName())) {
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
        if (this.j == -1 && this.f18254k == null) {
            return false;
        }
        int i7 = this.f18261r;
        boolean z4 = i7 == -1 || view.getTag(i7) != null;
        int i8 = this.f18262s;
        boolean z7 = i8 == -1 || view.getTag(i8) == null;
        if (z4 && z7) {
            if (view.getId() == this.j) {
                return true;
            }
            if (this.f18254k != null && (view.getLayoutParams() instanceof B.c) && (str = ((B.c) view.getLayoutParams()).f725Y) != null && str.matches(this.f18254k)) {
                return true;
            }
        }
        return false;
    }

    public final void b(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f928C);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == 0) {
                this.f18245a = typedArrayObtainStyledAttributes.getResourceId(index, this.f18245a);
            } else if (index == 8) {
                if (MotionLayout.f8824Y0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.f18254k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f18254k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.j = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == 9) {
                this.f18246b = typedArrayObtainStyledAttributes.getInt(index, this.f18246b);
            } else if (index == 12) {
                this.f18247c = typedArrayObtainStyledAttributes.getBoolean(index, this.f18247c);
            } else if (index == 10) {
                this.f18248d = typedArrayObtainStyledAttributes.getInt(index, this.f18248d);
            } else if (index == 4) {
                this.f18252h = typedArrayObtainStyledAttributes.getInt(index, this.f18252h);
            } else if (index == 13) {
                this.f18253i = typedArrayObtainStyledAttributes.getInt(index, this.f18253i);
            } else if (index == 14) {
                this.f18249e = typedArrayObtainStyledAttributes.getInt(index, this.f18249e);
            } else if (index == 7) {
                int i8 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i8 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f18257n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f18255l = -2;
                    }
                } else if (i8 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f18256m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f18255l = -1;
                    } else {
                        this.f18257n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f18255l = -2;
                    }
                } else {
                    this.f18255l = typedArrayObtainStyledAttributes.getInteger(index, this.f18255l);
                }
            } else if (index == 11) {
                this.f18259p = typedArrayObtainStyledAttributes.getResourceId(index, this.f18259p);
            } else if (index == 3) {
                this.f18260q = typedArrayObtainStyledAttributes.getResourceId(index, this.f18260q);
            } else if (index == 6) {
                this.f18261r = typedArrayObtainStyledAttributes.getResourceId(index, this.f18261r);
            } else if (index == 5) {
                this.f18262s = typedArrayObtainStyledAttributes.getResourceId(index, this.f18262s);
            } else if (index == 2) {
                this.f18264u = typedArrayObtainStyledAttributes.getResourceId(index, this.f18264u);
            } else if (index == 1) {
                this.f18263t = typedArrayObtainStyledAttributes.getInteger(index, this.f18263t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + c.f(this.f18245a, this.f18258o) + ")";
    }
}
