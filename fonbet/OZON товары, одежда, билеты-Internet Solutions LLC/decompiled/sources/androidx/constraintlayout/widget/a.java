package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import g.C6594f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f41673a = false;

    /* renamed from: b, reason: collision with root package name */
    String f41674b;

    /* renamed from: c, reason: collision with root package name */
    private b f41675c;

    /* renamed from: d, reason: collision with root package name */
    private int f41676d;

    /* renamed from: e, reason: collision with root package name */
    private float f41677e;

    /* renamed from: f, reason: collision with root package name */
    private String f41678f;

    /* renamed from: g, reason: collision with root package name */
    boolean f41679g;

    /* renamed from: h, reason: collision with root package name */
    private int f41680h;

    /* renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    static /* synthetic */ class C0757a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41681a;

        static {
            int[] iArr = new int[b.values().length];
            f41681a = iArr;
            try {
                iArr[b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41681a[b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41681a[b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41681a[b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41681a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41681a[b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41681a[b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41681a[b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes8.dex */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BOOLEAN_TYPE;
        public static final b COLOR_DRAWABLE_TYPE;
        public static final b COLOR_TYPE;
        public static final b DIMENSION_TYPE;
        public static final b FLOAT_TYPE;
        public static final b INT_TYPE;
        public static final b REFERENCE_TYPE;
        public static final b STRING_TYPE;

        static {
            b bVar = new b("INT_TYPE", 0);
            INT_TYPE = bVar;
            b bVar2 = new b("FLOAT_TYPE", 1);
            FLOAT_TYPE = bVar2;
            b bVar3 = new b("COLOR_TYPE", 2);
            COLOR_TYPE = bVar3;
            b bVar4 = new b("COLOR_DRAWABLE_TYPE", 3);
            COLOR_DRAWABLE_TYPE = bVar4;
            b bVar5 = new b("STRING_TYPE", 4);
            STRING_TYPE = bVar5;
            b bVar6 = new b("BOOLEAN_TYPE", 5);
            BOOLEAN_TYPE = bVar6;
            b bVar7 = new b("DIMENSION_TYPE", 6);
            DIMENSION_TYPE = bVar7;
            b bVar8 = new b("REFERENCE_TYPE", 7);
            REFERENCE_TYPE = bVar8;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public a(a aVar, Object obj) {
        this.f41674b = aVar.f41674b;
        this.f41675c = aVar.f41675c;
        j(obj);
    }

    public static void h(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        b bVar;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), i.f41848e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        b bVar2 = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z11 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    bVar = b.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    bVar = b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    bVar = b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    bVar = b.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    bVar = b.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == 9) {
                    bVar = b.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == 8) {
                    bVar = b.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                bVar2 = bVar;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            a aVar = new a();
            aVar.f41674b = str;
            aVar.f41675c = bVar2;
            aVar.f41673a = z11;
            aVar.j(obj);
            hashMap.put(str, aVar);
        }
        obtainStyledAttributes.recycle();
    }

    public static void i(View view, HashMap<String, a> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            a aVar = hashMap.get(str);
            String b11 = !aVar.f41673a ? Nk.a.b("set", str) : str;
            try {
                int i11 = C0757a.f41681a[aVar.f41675c.ordinal()];
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (i11) {
                    case 1:
                        cls.getMethod(b11, cls3).invoke(view, Integer.valueOf(aVar.f41676d));
                        break;
                    case 2:
                        cls.getMethod(b11, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f41679g));
                        break;
                    case 3:
                        cls.getMethod(b11, CharSequence.class).invoke(view, aVar.f41678f);
                        break;
                    case 4:
                        cls.getMethod(b11, cls3).invoke(view, Integer.valueOf(aVar.f41680h));
                        break;
                    case 5:
                        Method method = cls.getMethod(b11, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f41680h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(b11, cls3).invoke(view, Integer.valueOf(aVar.f41676d));
                        break;
                    case 7:
                        cls.getMethod(b11, cls2).invoke(view, Float.valueOf(aVar.f41677e));
                        break;
                    case 8:
                        cls.getMethod(b11, cls2).invoke(view, Float.valueOf(aVar.f41677e));
                        break;
                }
            } catch (IllegalAccessException e11) {
                StringBuilder b12 = C6594f.b(" Custom Attribute \"", str, "\" not found on ");
                b12.append(cls.getName());
                Log.e("TransitionLayout", b12.toString());
                e11.printStackTrace();
            } catch (NoSuchMethodException e12) {
                Log.e("TransitionLayout", e12.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                Log.e("TransitionLayout", cls.getName() + " must have a method " + b11);
            } catch (InvocationTargetException e13) {
                StringBuilder b13 = C6594f.b(" Custom Attribute \"", str, "\" not found on ");
                b13.append(cls.getName());
                Log.e("TransitionLayout", b13.toString());
                e13.printStackTrace();
            }
        }
    }

    public final void a(View view) {
        Class<?> cls = view.getClass();
        boolean z11 = this.f41673a;
        String str = this.f41674b;
        String b11 = !z11 ? Nk.a.b("set", str) : str;
        try {
            int i11 = C0757a.f41681a[this.f41675c.ordinal()];
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            switch (i11) {
                case 1:
                case 6:
                    cls.getMethod(b11, cls2).invoke(view, Integer.valueOf(this.f41676d));
                    break;
                case 2:
                    cls.getMethod(b11, Boolean.TYPE).invoke(view, Boolean.valueOf(this.f41679g));
                    break;
                case 3:
                    cls.getMethod(b11, CharSequence.class).invoke(view, this.f41678f);
                    break;
                case 4:
                    cls.getMethod(b11, cls2).invoke(view, Integer.valueOf(this.f41680h));
                    break;
                case 5:
                    Method method = cls.getMethod(b11, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f41680h);
                    method.invoke(view, colorDrawable);
                    break;
                case 7:
                    cls.getMethod(b11, cls3).invoke(view, Float.valueOf(this.f41677e));
                    break;
                case 8:
                    cls.getMethod(b11, cls3).invoke(view, Float.valueOf(this.f41677e));
                    break;
            }
        } catch (IllegalAccessException e11) {
            StringBuilder b12 = C6594f.b(" Custom Attribute \"", str, "\" not found on ");
            b12.append(cls.getName());
            Log.e("TransitionLayout", b12.toString());
            e11.printStackTrace();
        } catch (NoSuchMethodException e12) {
            Log.e("TransitionLayout", e12.getMessage());
            Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
            Log.e("TransitionLayout", cls.getName() + " must have a method " + b11);
        } catch (InvocationTargetException e13) {
            StringBuilder b13 = C6594f.b(" Custom Attribute \"", str, "\" not found on ");
            b13.append(cls.getName());
            Log.e("TransitionLayout", b13.toString());
            e13.printStackTrace();
        }
    }

    public final String b() {
        return this.f41674b;
    }

    public final b c() {
        return this.f41675c;
    }

    public final float d() {
        switch (C0757a.f41681a[this.f41675c.ordinal()]) {
            case 2:
                return this.f41679g ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f41676d;
            case 7:
                return this.f41677e;
            case 8:
                return this.f41677e;
            default:
                return Float.NaN;
        }
    }

    public final void e(float[] fArr) {
        switch (C0757a.f41681a[this.f41675c.ordinal()]) {
            case 2:
                fArr[0] = this.f41679g ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i11 = (this.f41680h >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i11 / 255.0f;
                return;
            case 6:
                fArr[0] = this.f41676d;
                return;
            case 7:
                fArr[0] = this.f41677e;
                return;
            case 8:
                fArr[0] = this.f41677e;
                return;
            default:
                return;
        }
    }

    public final boolean f() {
        int i11 = C0757a.f41681a[this.f41675c.ordinal()];
        return (i11 == 1 || i11 == 2 || i11 == 3) ? false : true;
    }

    public final int g() {
        int i11 = C0757a.f41681a[this.f41675c.ordinal()];
        return (i11 == 4 || i11 == 5) ? 4 : 1;
    }

    public final void j(Object obj) {
        switch (C0757a.f41681a[this.f41675c.ordinal()]) {
            case 1:
            case 6:
                this.f41676d = ((Integer) obj).intValue();
                break;
            case 2:
                this.f41679g = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f41678f = (String) obj;
                break;
            case 4:
            case 5:
                this.f41680h = ((Integer) obj).intValue();
                break;
            case 7:
                this.f41677e = ((Float) obj).floatValue();
                break;
            case 8:
                this.f41677e = ((Float) obj).floatValue();
                break;
        }
    }
}
