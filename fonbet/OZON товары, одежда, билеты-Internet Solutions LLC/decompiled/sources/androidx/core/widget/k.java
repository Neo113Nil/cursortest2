package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.text.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class k {

    static class a {
        static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        static void e(TextView textView, int i11) {
            textView.setBreakStrategy(i11);
        }

        static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        static void h(TextView textView, int i11) {
            textView.setHyphenationFrequency(i11);
        }
    }

    /* loaded from: classes8.dex */
    static class b {
        static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* loaded from: classes8.dex */
    static class c {
        static int a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        static int b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        static int c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static int[] d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        static int e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        static void f(TextView textView, int i11, int i12, int i13, int i14) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i11, i12, i13, i14);
        }

        static void g(TextView textView, int[] iArr, int i11) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i11);
        }

        static void h(TextView textView, int i11) {
            textView.setAutoSizeTextTypeWithDefaults(i11);
        }
    }

    /* loaded from: classes8.dex */
    static class d {
        static CharSequence a(PrecomputedText precomputedText) {
            return precomputedText;
        }

        static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        static PrecomputedText.Params c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        static void d(TextView textView, int i11) {
            textView.setFirstBaselineToTopHeight(i11);
        }
    }

    static class e {
        public static void a(@NonNull TextView textView, int i11, float f7) {
            textView.setLineHeight(i11, f7);
        }
    }

    /* loaded from: classes8.dex */
    private static class f implements ActionMode.Callback {

        /* renamed from: a, reason: collision with root package name */
        private final ActionMode.Callback f42430a;

        /* renamed from: b, reason: collision with root package name */
        private final TextView f42431b;

        /* renamed from: c, reason: collision with root package name */
        private Class<?> f42432c;

        /* renamed from: d, reason: collision with root package name */
        private Method f42433d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f42434e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f42435f = false;

        f(ActionMode.Callback callback, TextView textView) {
            this.f42430a = callback;
            this.f42431b = textView;
        }

        @NonNull
        final ActionMode.Callback a() {
            return this.f42430a;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f42430a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f42430a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f42430a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            TextView textView = this.f42431b;
            Context context = textView.getContext();
            PackageManager packageManager = context.getPackageManager();
            boolean z11 = this.f42435f;
            Class cls = Integer.TYPE;
            if (!z11) {
                this.f42435f = true;
                try {
                    Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f42432c = cls2;
                    this.f42433d = cls2.getDeclaredMethod("removeItemAt", cls);
                    this.f42434e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f42432c = null;
                    this.f42433d = null;
                    this.f42434e = false;
                }
            }
            try {
                Method declaredMethod = (this.f42434e && this.f42432c.isInstance(menu)) ? this.f42433d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (context instanceof Activity) {
                    for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                        if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            if (activityInfo.exported) {
                                String str = activityInfo.permission;
                                if (str != null && context.checkSelfPermission(str) != 0) {
                                }
                            }
                        }
                        arrayList.add(resolveInfo);
                    }
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i11);
                    MenuItem add = menu.add(0, 0, i11 + 100, resolveInfo2.loadLabel(packageManager));
                    Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                    ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                    add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            return this.f42430a.onPrepareActionMode(actionMode, menu);
        }
    }

    @NonNull
    public static g.b a(@NonNull TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            return new g.b(d.c(textView));
        }
        g.b.a aVar = new g.b.a(new TextPaint(textView.getPaint()));
        aVar.b(a.a(textView));
        aVar.c(a.d(textView));
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i11 < 28 || (textView.getInputType() & 15) != 3) {
                boolean z11 = textView.getLayoutDirection() == 1;
                switch (textView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (!z11) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                }
            } else {
                byte directionality = Character.getDirectionality(d.b(b.a(textView.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        aVar.d(textDirectionHeuristic);
        return aVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(@NonNull TextView textView, int i11, int i12, int i13) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            c.f(textView, i11, i12, 1, i13);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeUniformWithConfiguration(i11, i12, 1, i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            c.h(textView, 0);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeWithDefaults(0);
        }
    }

    public static void d(@NonNull TextView textView, ColorStateList colorStateList) {
        textView.getClass();
        a.f(textView, colorStateList);
    }

    public static void e(@NonNull TextView textView, PorterDuff.Mode mode) {
        textView.getClass();
        a.g(textView, mode);
    }

    public static void f(@NonNull TextView textView, int i11) {
        x2.i.d(i11);
        if (Build.VERSION.SDK_INT >= 28) {
            d.d(textView, i11);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i12 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i11 > Math.abs(i12)) {
            textView.setPadding(textView.getPaddingLeft(), i11 + i12, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void g(@NonNull TextView textView, int i11) {
        x2.i.d(i11);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i12 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i11 > Math.abs(i12)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i11 - i12);
        }
    }

    public static void h(@NonNull TextView textView, int i11) {
        x2.i.d(i11);
        if (i11 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i11 - r0, 1.0f);
        }
    }

    public static void i(@NonNull TextView textView, int i11, float f7) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.a(textView, i11, f7);
        } else {
            h(textView, Math.round(TypedValue.applyDimension(i11, f7, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void j(@NonNull AppCompatTextView appCompatTextView, @NonNull androidx.core.text.g gVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            appCompatTextView.setText(d.a(gVar.c()));
        } else {
            if (!a(appCompatTextView).a(gVar.b())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            appCompatTextView.setText(gVar);
        }
    }

    public static void k(@NonNull AppCompatTextView appCompatTextView, @NonNull g.b bVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic d11 = bVar.d();
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i11 = 1;
        if (d11 != textDirectionHeuristic2 && d11 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (d11 == TextDirectionHeuristics.ANYRTL_LTR) {
                i11 = 2;
            } else if (d11 == TextDirectionHeuristics.LTR) {
                i11 = 3;
            } else if (d11 == TextDirectionHeuristics.RTL) {
                i11 = 4;
            } else if (d11 == TextDirectionHeuristics.LOCALE) {
                i11 = 5;
            } else if (d11 == textDirectionHeuristic) {
                i11 = 6;
            } else if (d11 == textDirectionHeuristic2) {
                i11 = 7;
            }
        }
        appCompatTextView.setTextDirection(i11);
        appCompatTextView.getPaint().set(bVar.e());
        a.e(appCompatTextView, bVar.b());
        a.h(appCompatTextView, bVar.c());
    }

    public static ActionMode.Callback l(ActionMode.Callback callback) {
        return callback instanceof f ? ((f) callback).a() : callback;
    }

    public static ActionMode.Callback m(ActionMode.Callback callback, @NonNull TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof f) || callback == null) ? callback : new f(callback, textView);
    }
}
