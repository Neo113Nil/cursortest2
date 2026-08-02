package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* JADX INFO: renamed from: ql */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0622ql {

    /* JADX INFO: renamed from: a */
    public boolean f6522a = false;

    /* JADX INFO: renamed from: b */
    public int f6523b;

    /* JADX INFO: renamed from: c */
    public int f6524c;

    /* JADX INFO: renamed from: d */
    public float f6525d;

    /* JADX INFO: renamed from: e */
    public String f6526e;

    /* JADX INFO: renamed from: f */
    public boolean f6527f;

    /* JADX INFO: renamed from: g */
    public int f6528g;

    public C0622ql(C0622ql c0622ql, Object obj) {
        c0622ql.getClass();
        this.f6523b = c0622ql.f6523b;
        m4111b(obj);
    }

    /* JADX INFO: renamed from: a */
    public static void m4110a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), iz0.f3753d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i = 0;
        boolean z = false;
        Object objValueOf = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i4 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i4 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i4 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i3 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i3;
                            }
                        }
                        i = 7;
                    }
                }
                i = i4;
            }
        }
        if (string != null && objValueOf != null) {
            C0622ql c0622ql = new C0622ql();
            c0622ql.f6523b = i;
            c0622ql.f6522a = z;
            c0622ql.m4111b(objValueOf);
            map.put(string, c0622ql);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m4111b(Object obj) {
        switch (AbstractC0024an.m292o(this.f6523b)) {
            case 0:
            case 7:
                this.f6524c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f6525d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f6528g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f6526e = (String) obj;
                break;
            case 5:
                this.f6527f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f6525d = ((Float) obj).floatValue();
                break;
        }
    }
}
