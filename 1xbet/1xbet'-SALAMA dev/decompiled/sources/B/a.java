package B;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f692a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f699h;

    public a(a aVar, Object obj) {
        this.f693b = aVar.f693b;
        this.f694c = aVar.f694c;
        f(obj);
    }

    public static void d(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f937h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i7 = 0;
        boolean z4 = false;
        Object objValueOf = null;
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i8);
            int i9 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z4 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i7 = 6;
            } else {
                int i10 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i10 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i10 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i7 = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i9 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i7 = i9;
                            }
                        }
                        i7 = 7;
                    }
                }
                i7 = i10;
            }
        }
        if (string != null && objValueOf != null) {
            a aVar = new a();
            aVar.f693b = string;
            aVar.f694c = i7;
            aVar.f692a = z4;
            aVar.f(objValueOf);
            map.put(string, aVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = (a) map.get(str);
            String strI = !aVar.f692a ? L.i("set", str) : str;
            try {
                switch (p136t.e.e(aVar.f694c)) {
                    case 0:
                        cls.getMethod(strI, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f695d));
                        break;
                    case 1:
                        cls.getMethod(strI, Float.TYPE).invoke(view, Float.valueOf(aVar.f696e));
                        break;
                    case 2:
                        cls.getMethod(strI, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f699h));
                        break;
                    case 3:
                        Method method = cls.getMethod(strI, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f699h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(strI, CharSequence.class).invoke(view, aVar.f697f);
                        break;
                    case 5:
                        cls.getMethod(strI, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f698g));
                        break;
                    case 6:
                        cls.getMethod(strI, Float.TYPE).invoke(view, Float.valueOf(aVar.f696e));
                        break;
                    case 7:
                        cls.getMethod(strI, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f695d));
                        break;
                }
            } catch (IllegalAccessException e7) {
                StringBuilder sbK = p031e1.k.k(" Custom Attribute \"", str, "\" not found on ");
                sbK.append(cls.getName());
                Log.e("TransitionLayout", sbK.toString());
                e7.printStackTrace();
            } catch (NoSuchMethodException e8) {
                Log.e("TransitionLayout", e8.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                Log.e("TransitionLayout", cls.getName() + " must have a method " + strI);
            } catch (InvocationTargetException e9) {
                StringBuilder sbK2 = p031e1.k.k(" Custom Attribute \"", str, "\" not found on ");
                sbK2.append(cls.getName());
                Log.e("TransitionLayout", sbK2.toString());
                e9.printStackTrace();
            }
        }
    }

    public final float a() {
        switch (p136t.e.e(this.f694c)) {
            case 0:
                return this.f695d;
            case 1:
                return this.f696e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.f698g ? 1.0f : 0.0f;
            case 6:
                return this.f696e;
            default:
                return Float.NaN;
        }
    }

    public final void b(float[] fArr) {
        switch (p136t.e.e(this.f694c)) {
            case 0:
                fArr[0] = this.f695d;
                return;
            case 1:
                fArr[0] = this.f696e;
                return;
            case 2:
            case 3:
                int i7 = this.f699h;
                int i8 = (i7 >> 24) & 255;
                float fPow = (float) Math.pow(((i7 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i7 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i7 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i8 / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.f698g ? 1.0f : 0.0f;
                return;
            case 6:
                fArr[0] = this.f696e;
                return;
            default:
                return;
        }
    }

    public final int c() {
        int iE = p136t.e.e(this.f694c);
        return (iE == 2 || iE == 3) ? 4 : 1;
    }

    public final void f(Object obj) {
        switch (p136t.e.e(this.f694c)) {
            case 0:
            case 7:
                this.f695d = ((Integer) obj).intValue();
                break;
            case 1:
                this.f696e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f699h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f697f = (String) obj;
                break;
            case 5:
                this.f698g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f696e = ((Float) obj).floatValue();
                break;
        }
    }
}
