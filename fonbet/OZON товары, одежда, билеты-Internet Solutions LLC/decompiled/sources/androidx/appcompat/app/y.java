package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C5059d;
import androidx.appcompat.widget.C5061f;
import androidx.appcompat.widget.C5069n;
import androidx.appcompat.widget.C5072q;
import androidx.appcompat.widget.C5074t;
import androidx.appcompat.widget.C5077w;
import androidx.collection.Z;
import androidx.core.view.Y;
import g.C6594f;
import i.C6977a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f37235b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f37236c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f37237d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f37238e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f37239f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f37240g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    private static final Z<String, Constructor<? extends View>> f37241h = new Z<>();

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f37242a = new Object[2];

    /* loaded from: classes8.dex */
    private static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final View f37243a;

        /* renamed from: b, reason: collision with root package name */
        private final String f37244b;

        /* renamed from: c, reason: collision with root package name */
        private Method f37245c;

        /* renamed from: d, reason: collision with root package name */
        private Context f37246d;

        public a(@NonNull View view, @NonNull String str) {
            this.f37243a = view;
            this.f37244b = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@NonNull View view) {
            String str;
            Method method;
            if (this.f37245c == null) {
                View view2 = this.f37243a;
                Context context = view2.getContext();
                while (true) {
                    String str2 = this.f37244b;
                    if (context == null) {
                        int id2 = view2.getId();
                        if (id2 == -1) {
                            str = "";
                        } else {
                            str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                        }
                        StringBuilder b11 = C6594f.b("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                        b11.append(view2.getClass());
                        b11.append(str);
                        throw new IllegalStateException(b11.toString());
                    }
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f37245c = method;
                            this.f37246d = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
            }
            try {
                this.f37245c.invoke(this.f37246d, view);
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException("Could not execute method for android:onClick", e12);
            }
        }
    }

    private View g(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String concat;
        Z<String, Constructor<? extends View>> z11 = f37241h;
        Constructor<? extends View> constructor = z11.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f37235b);
            z11.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f37242a);
    }

    @NonNull
    protected C5059d a(Context context, AttributeSet attributeSet) {
        return new C5059d(context, attributeSet);
    }

    @NonNull
    protected AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    @NonNull
    protected AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    @NonNull
    protected C5072q d(Context context, AttributeSet attributeSet) {
        return new C5072q(context, attributeSet);
    }

    @NonNull
    protected AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00b4, code lost:
    
        if (r10.equals("ImageButton") == false) goto L15;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View f(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View rVar;
        char c11 = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6977a.f65672z, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        Context dVar = (resourceId == 0 || ((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).b() == resourceId)) ? context : new androidx.appcompat.view.d(context, resourceId);
        str.getClass();
        View view2 = null;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c11 = '\r';
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
                rVar = new androidx.appcompat.widget.r(dVar, attributeSet);
                break;
            case 1:
                rVar = new C5061f(dVar, attributeSet);
                break;
            case 2:
                rVar = new C5069n(dVar, attributeSet);
                break;
            case 3:
                rVar = e(dVar, attributeSet);
                break;
            case 4:
                rVar = new AppCompatImageButton(dVar, attributeSet);
                break;
            case 5:
                rVar = new C5074t(dVar, attributeSet);
                break;
            case 6:
                rVar = new C5077w(dVar, attributeSet);
                break;
            case 7:
                rVar = d(dVar, attributeSet);
                break;
            case '\b':
                rVar = new androidx.appcompat.widget.D(dVar, attributeSet);
                break;
            case '\t':
                rVar = new AppCompatImageView(dVar, attributeSet);
                break;
            case '\n':
                rVar = a(dVar, attributeSet);
                break;
            case 11:
                rVar = c(dVar, attributeSet);
                break;
            case '\f':
                rVar = new AppCompatEditText(dVar, attributeSet);
                break;
            case '\r':
                rVar = b(dVar, attributeSet);
                break;
            default:
                rVar = null;
                break;
        }
        if (rVar == null && context != dVar) {
            Object[] objArr = this.f37242a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = dVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i11 = 0;
                    while (true) {
                        String[] strArr = f37240g;
                        if (i11 < 3) {
                            View g10 = g(dVar, str, strArr[i11]);
                            if (g10 != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = g10;
                            } else {
                                i11++;
                            }
                        }
                    }
                } else {
                    View g11 = g(dVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = g11;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            rVar = view2;
        }
        if (rVar != null) {
            Context context2 = rVar.getContext();
            if ((context2 instanceof ContextWrapper) && rVar.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, f37236c);
                String string = obtainStyledAttributes2.getString(0);
                if (string != null) {
                    rVar.setOnClickListener(new a(rVar, string));
                }
                obtainStyledAttributes2.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes3 = dVar.obtainStyledAttributes(attributeSet, f37237d);
                if (obtainStyledAttributes3.hasValue(0)) {
                    Y.D(rVar, obtainStyledAttributes3.getBoolean(0, false));
                }
                obtainStyledAttributes3.recycle();
                TypedArray obtainStyledAttributes4 = dVar.obtainStyledAttributes(attributeSet, f37238e);
                if (obtainStyledAttributes4.hasValue(0)) {
                    Y.E(rVar, obtainStyledAttributes4.getString(0));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = dVar.obtainStyledAttributes(attributeSet, f37239f);
                if (obtainStyledAttributes5.hasValue(0)) {
                    Y.L(rVar, obtainStyledAttributes5.getBoolean(0, false));
                }
                obtainStyledAttributes5.recycle();
            }
        }
        return rVar;
    }
}
