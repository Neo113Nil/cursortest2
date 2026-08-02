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
import w1.L;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f692a = false;

    /* renamed from: b, reason: collision with root package name */
    public String f693b;

    /* renamed from: c, reason: collision with root package name */
    public int f694c;

    /* renamed from: d, reason: collision with root package name */
    public int f695d;

    /* renamed from: e, reason: collision with root package name */
    public float f696e;

    /* renamed from: f, reason: collision with root package name */
    public String f697f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f698g;

    /* renamed from: h, reason: collision with root package name */
    public int f699h;

    public a(a aVar, Object obj) {
        this.f693b = aVar.f693b;
        this.f694c = aVar.f694c;
        f(obj);
    }

    public static void d(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f937h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i7 = 0;
        boolean z4 = false;
        Object obj = null;
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = obtainStyledAttributes.getIndex(i8);
            int i9 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z4 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i7 = 6;
            } else {
                int i10 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i10 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i10 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i7 = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i9 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
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
        if (str != null && obj != null) {
            a aVar = new a();
            aVar.f693b = str;
            aVar.f694c = i7;
            aVar.f692a = z4;
            aVar.f(obj);
            hashMap.put(str, aVar);
        }
        obtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            a aVar = (a) hashMap.get(str);
            String i7 = !aVar.f692a ? L.i("set", str) : str;
            try {
                switch (t.e.e(aVar.f694c)) {
                    case 0:
                        cls.getMethod(i7, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f695d));
                        break;
                    case 1:
                        cls.getMethod(i7, Float.TYPE).invoke(view, Float.valueOf(aVar.f696e));
                        break;
                    case 2:
                        cls.getMethod(i7, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f699h));
                        break;
                    case 3:
                        Method method = cls.getMethod(i7, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f699h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(i7, CharSequence.class).invoke(view, aVar.f697f);
                        break;
                    case 5:
                        cls.getMethod(i7, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f698g));
                        break;
                    case 6:
                        cls.getMethod(i7, Float.TYPE).invoke(view, Float.valueOf(aVar.f696e));
                        break;
                    case 7:
                        cls.getMethod(i7, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f695d));
                        break;
                }
            } catch (IllegalAccessException e7) {
                StringBuilder k7 = e1.k.k(" Custom Attribute \"", str, "\" not found on ");
                k7.append(cls.getName());
                Log.e("TransitionLayout", k7.toString());
                e7.printStackTrace();
            } catch (NoSuchMethodException e8) {
                Log.e("TransitionLayout", e8.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                Log.e("TransitionLayout", cls.getName() + " must have a method " + i7);
            } catch (InvocationTargetException e9) {
                StringBuilder k8 = e1.k.k(" Custom Attribute \"", str, "\" not found on ");
                k8.append(cls.getName());
                Log.e("TransitionLayout", k8.toString());
                e9.printStackTrace();
            }
        }
    }

    public final float a() {
        switch (t.e.e(this.f694c)) {
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
        switch (t.e.e(this.f694c)) {
            case 0:
                fArr[0] = this.f695d;
                return;
            case 1:
                fArr[0] = this.f696e;
                return;
            case 2:
            case 3:
                int i7 = (this.f699h >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i7 / 255.0f;
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
        int e7 = t.e.e(this.f694c);
        return (e7 == 2 || e7 == 3) ? 4 : 1;
    }

    public final void f(Object obj) {
        switch (t.e.e(this.f694c)) {
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
