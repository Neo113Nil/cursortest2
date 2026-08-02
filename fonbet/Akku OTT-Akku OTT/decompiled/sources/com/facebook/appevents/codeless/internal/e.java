package com.facebook.appevents.codeless.internal;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.annotation.RestrictTo;
import androidx.core.view.NestedScrollingChild;
import com.facebook.internal.E;
import com.facebook.w;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class e {
    public static final e a = new e();
    public static WeakReference<View> b = new WeakReference<>(null);
    public static Method c;

    @JvmStatic
    public static final View a(View view) {
        if (!com.facebook.internal.instrument.crashshield.a.b(e.class)) {
            while (view != null) {
                try {
                    e eVar = a;
                    eVar.getClass();
                    boolean z = false;
                    if (!com.facebook.internal.instrument.crashshield.a.b(eVar)) {
                        try {
                            z = Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.ReactRootView");
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, eVar);
                        }
                    }
                    if (!z) {
                        Object parent = view.getParent();
                        if (!(parent instanceof View)) {
                            break;
                        }
                        view = (View) parent;
                    } else {
                        return view;
                    }
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.a.a(th2, e.class);
                }
            }
        }
        return null;
    }

    @JvmStatic
    public static final ArrayList b(View view) {
        if (com.facebook.internal.instrument.crashshield.a.b(e.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, e.class);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0068, code lost:
    
        if (r7.isInstance(r3) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094 A[Catch: all -> 0x008e, TryCatch #2 {all -> 0x008e, blocks: (B:6:0x000a, B:9:0x0017, B:11:0x001d, B:12:0x001f, B:15:0x0070, B:17:0x0074, B:19:0x007a, B:21:0x0080, B:22:0x0090, B:24:0x0094, B:27:0x0083, B:29:0x0087, B:31:0x0097, B:33:0x009b, B:36:0x00a0, B:38:0x00a4, B:40:0x00a8, B:42:0x00ac, B:44:0x00af, B:46:0x00b3, B:82:0x006d, B:55:0x0028, B:59:0x0031, B:64:0x004b, B:67:0x0054, B:71:0x0064, B:33:0x005f, B:79:0x0045, B:75:0x003f), top: B:5:0x000a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0064 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:55:0x0028, B:59:0x0031, B:64:0x004b, B:67:0x0054, B:71:0x0064, B:33:0x005f, B:79:0x0045, B:75:0x003f), top: B:54:0x0028, outer: #2, inners: #1, #4 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int c(View view) {
        Class<?> cls;
        Class cls2;
        int i;
        if (com.facebook.internal.instrument.crashshield.a.b(e.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            int i2 = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i2 |= 32;
            }
            boolean b2 = com.facebook.internal.instrument.crashshield.a.b(e.class);
            e eVar = a;
            if (!b2) {
                try {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof AdapterView)) {
                        eVar.getClass();
                        if (!com.facebook.internal.instrument.crashshield.a.b(eVar)) {
                            try {
                                cls = Class.forName("android.support.v4.view.NestedScrollingChild");
                            } catch (ClassNotFoundException unused) {
                            } catch (Throwable th) {
                                com.facebook.internal.instrument.crashshield.a.a(th, eVar);
                            }
                            if (cls != null || !cls.isInstance(parent)) {
                                cls2 = com.facebook.internal.instrument.crashshield.a.b(eVar) ? null : NestedScrollingChild.class;
                                if (cls2 != null) {
                                }
                            }
                        }
                        cls = null;
                        if (cls != null) {
                        }
                        if (com.facebook.internal.instrument.crashshield.a.b(eVar)) {
                        }
                        if (cls2 != null) {
                        }
                    }
                    i2 |= 512;
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.a.a(th2, e.class);
                }
            }
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                    return view instanceof RatingBar ? i2 | 65536 : view instanceof RadioGroup ? i2 | 16384 : ((view instanceof ViewGroup) && eVar.m(view, b.get())) ? i2 | 64 : i2;
                }
                return i2 | 4096;
            }
            int i3 = i2 | 1025;
            if (view instanceof Button) {
                i3 = i2 | 1029;
                if (view instanceof Switch) {
                    i = i2 | 9221;
                } else if (view instanceof CheckBox) {
                    i = i2 | 33797;
                }
                return !(view instanceof EditText) ? i | 2048 : i;
            }
            i = i3;
            if (!(view instanceof EditText)) {
            }
        } catch (Throwable th3) {
            com.facebook.internal.instrument.crashshield.a.a(th3, e.class);
            return 0;
        }
    }

    @JvmStatic
    public static final JSONObject d(View view) {
        if (com.facebook.internal.instrument.crashshield.a.b(e.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                b = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                n(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList b2 = b(view);
                int size = b2.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(d((View) b2.get(i)));
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, e.class);
            return null;
        }
    }

    @JvmStatic
    public static final View.OnClickListener f(View view) {
        if (com.facebook.internal.instrument.crashshield.a.b(e.class)) {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.view.View.OnClickListener");
            return (View.OnClickListener) obj2;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, e.class);
            return null;
        }
    }

    @JvmStatic
    public static final View.OnTouchListener g(View view) {
        try {
            if (!com.facebook.internal.instrument.crashshield.a.b(e.class)) {
                try {
                    Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(view);
                    if (obj != null) {
                        Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(obj);
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.view.View.OnTouchListener");
                        return (View.OnTouchListener) obj2;
                    }
                } catch (ClassNotFoundException unused) {
                    E e = E.a;
                    w wVar = w.a;
                } catch (IllegalAccessException unused2) {
                    E e2 = E.a;
                    w wVar2 = w.a;
                } catch (NoSuchFieldException unused3) {
                    E e3 = E.a;
                    w wVar3 = w.a;
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, e.class);
            return null;
        }
    }

    @JvmStatic
    public static final String h(View view) {
        if (com.facebook.internal.instrument.crashshield.a.b(e.class)) {
            return null;
        }
        try {
            CharSequence hint = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getHint() : null;
            if (hint == null) {
                return "";
            }
            String obj = hint.toString();
            return obj == null ? "" : obj;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, e.class);
            return null;
        }
    }

    @JvmStatic
    public static final ViewGroup i(View view) {
        if (!com.facebook.internal.instrument.crashshield.a.b(e.class)) {
            try {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    return (ViewGroup) parent;
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, e.class);
                return null;
            }
        }
        return null;
    }

    @JvmStatic
    public static final String j(View view) {
        CharSequence valueOf;
        Object selectedItem;
        if (com.facebook.internal.instrument.crashshield.a.b(e.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                valueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    valueOf = ((Switch) view).isChecked() ? "1" : SessionDescription.SUPPORTED_SDP_VERSION;
                }
            } else if (view instanceof Spinner) {
                if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    valueOf = selectedItem.toString();
                }
                valueOf = null;
            } else if (view instanceof DatePicker) {
                int year = ((DatePicker) view).getYear();
                int month = ((DatePicker) view).getMonth();
                int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                valueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                Intrinsics.checkNotNullExpressionValue(valueOf, "format(format, *args)");
            } else if (view instanceof TimePicker) {
                Integer currentHour = ((TimePicker) view).getCurrentHour();
                Intrinsics.checkNotNullExpressionValue(currentHour, "view.currentHour");
                int intValue = currentHour.intValue();
                Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                Intrinsics.checkNotNullExpressionValue(currentMinute, "view.currentMinute");
                int intValue2 = currentMinute.intValue();
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                valueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, 2));
                Intrinsics.checkNotNullExpressionValue(valueOf, "format(format, *args)");
            } else if (view instanceof RadioGroup) {
                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                int childCount = ((RadioGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = ((RadioGroup) view).getChildAt(i);
                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                        valueOf = ((RadioButton) childAt).getText();
                        break;
                    }
                }
                valueOf = null;
            } else {
                if (view instanceof RatingBar) {
                    valueOf = String.valueOf(((RatingBar) view).getRating());
                }
                valueOf = null;
            }
            if (valueOf == null) {
                return "";
            }
            String obj = valueOf.toString();
            return obj == null ? "" : obj;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, e.class);
            return null;
        }
    }

    @JvmStatic
    public static final void n(View view, JSONObject json) {
        if (com.facebook.internal.instrument.crashshield.a.b(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String j = j(view);
                String h = h(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                json.put("classname", view.getClass().getCanonicalName());
                json.put("classtypebitmask", c(view));
                json.put("id", view.getId());
                if (d.a(view)) {
                    json.put("text", "");
                    json.put("is_user_input", true);
                } else {
                    json.put("text", E.d(E.J(j)));
                }
                json.put("hint", E.d(E.J(h)));
                if (tag != null) {
                    json.put("tag", E.d(E.J(tag.toString())));
                }
                if (contentDescription != null) {
                    json.put("description", E.d(E.J(contentDescription.toString())));
                }
                json.put("dimension", a.e(view));
            } catch (JSONException unused) {
                E e = E.a;
                w wVar = w.a;
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, e.class);
        }
    }

    public final JSONObject e(View view) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            } catch (JSONException unused) {
                return jSONObject;
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }

    public final View k(View view, float[] fArr) {
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                l();
                Method method = c;
                if (method != null && view != null) {
                    try {
                        Object invoke = method.invoke(null, fArr, view);
                        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type android.view.View");
                        View view2 = (View) invoke;
                        if (view2.getId() > 0) {
                            Object parent = view2.getParent();
                            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
                            return (View) parent;
                        }
                    } catch (IllegalAccessException unused) {
                        E e = E.a;
                        w wVar = w.a;
                    } catch (InvocationTargetException unused2) {
                        E e2 = E.a;
                        w wVar2 = w.a;
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        }
        return null;
    }

    public final void l() {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            if (c != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                c = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException unused) {
                E e = E.a;
                w wVar = w.a;
            } catch (NoSuchMethodException unused2) {
                E e2 = E.a;
                w wVar2 = w.a;
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    public final boolean m(View view, View view2) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (!Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            float[] fArr = null;
            if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                try {
                    view.getLocationOnScreen(new int[2]);
                    fArr = new float[]{r4[0], r4[1]};
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, this);
                }
            }
            View k = k(view2, fArr);
            if (k != null) {
                return k.getId() == view.getId();
            }
            return false;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
            return false;
        }
    }
}
