package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.datepicker.C0943a;
import com.google.android.material.internal.CheckableImageButton;
import com.haryanvi.netstream.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class s<S> extends DialogFragment {
    public CheckableImageButton A;

    @Nullable
    public com.google.android.material.shape.g B;
    public Button C;
    public boolean D;

    @Nullable
    public CharSequence E;

    @Nullable
    public CharSequence F;
    public final LinkedHashSet<u<? super S>> a = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> b = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> c = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> d = new LinkedHashSet<>();

    @StyleRes
    public int e;

    @Nullable
    public InterfaceC0946d<S> f;
    public B<S> i;

    @Nullable
    public C0943a j;

    @Nullable
    public AbstractC0948f k;
    public j<S> l;

    @StringRes
    public int m;
    public CharSequence n;
    public boolean o;
    public int p;

    @StringRes
    public int q;
    public CharSequence r;

    @StringRes
    public int s;
    public CharSequence t;

    @StringRes
    public int u;
    public CharSequence v;

    @StringRes
    public int w;
    public CharSequence x;
    public TextView y;
    public TextView z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            s sVar = s.this;
            Iterator<u<? super S>> it = sVar.a.iterator();
            while (it.hasNext()) {
                u<? super S> next = it.next();
                sVar.e().k();
                next.onPositiveButtonClick();
            }
            sVar.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            s sVar = s.this;
            Iterator<View.OnClickListener> it = sVar.b.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            sVar.dismiss();
        }
    }

    public class c extends A<S> {
        public c() {
        }

        @Override // com.google.android.material.datepicker.A
        public final void a(S s) {
            s sVar = s.this;
            InterfaceC0946d<S> e = sVar.e();
            sVar.getContext();
            String f = e.f();
            TextView textView = sVar.z;
            InterfaceC0946d<S> e2 = sVar.e();
            sVar.requireContext();
            textView.setContentDescription(e2.d());
            sVar.z.setText(f);
            sVar.C.setEnabled(sVar.e().i());
        }
    }

    public static int f(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar d = E.d();
        d.set(5, 1);
        Calendar c2 = E.c(d);
        c2.get(2);
        c2.get(1);
        int maximum = c2.getMaximum(7);
        c2.getActualMaximum(5);
        c2.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean g(@NonNull Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.resources.b.c(context, R.attr.materialCalendarStyle, j.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public final InterfaceC0946d<S> e() {
        if (this.f == null) {
            this.f = (InterfaceC0946d) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.fragment.app.Fragment, com.google.android.material.datepicker.v] */
    public final void h() {
        requireContext();
        int i = this.e;
        if (i == 0) {
            i = e().b();
        }
        InterfaceC0946d<S> e = e();
        C0943a c0943a = this.j;
        AbstractC0948f abstractC0948f = this.k;
        j<S> jVar = new j<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", e);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0943a);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", abstractC0948f);
        bundle.putParcelable("CURRENT_MONTH_KEY", c0943a.d);
        jVar.setArguments(bundle);
        this.l = jVar;
        if (this.p == 1) {
            InterfaceC0946d<S> e2 = e();
            C0943a c0943a2 = this.j;
            ?? vVar = new v();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", e2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0943a2);
            vVar.setArguments(bundle2);
            jVar = vVar;
        }
        this.i = jVar;
        this.y.setText((this.p == 1 && getResources().getConfiguration().orientation == 2) ? this.F : this.E);
        InterfaceC0946d<S> e3 = e();
        getContext();
        String f = e3.f();
        TextView textView = this.z;
        InterfaceC0946d<S> e4 = e();
        requireContext();
        textView.setContentDescription(e4.d());
        this.z.setText(f);
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.mtrl_calendar_frame, this.i);
        beginTransaction.commitNow();
        this.i.e(new c());
    }

    public final void i(@NonNull CheckableImageButton checkableImageButton) {
        this.A.setContentDescription(this.p == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.e = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f = (InterfaceC0946d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.j = (C0943a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.k = (AbstractC0948f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.m = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.n = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.p = bundle.getInt("INPUT_MODE_KEY");
        this.q = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.r = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.s = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.t = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.u = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.v = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.w = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.x = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.n;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.m);
        }
        this.E = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.F = charSequence;
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        int i = this.e;
        if (i == 0) {
            i = e().b();
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        this.o = g(context, android.R.attr.windowFullscreen);
        this.B = new com.google.android.material.shape.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, com.google.android.material.a.m, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.B.j(context);
        this.B.l(ColorStateList.valueOf(color));
        this.B.k(ViewCompat.getElevation(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(this.o ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.o) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(f(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(f(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.z = textView;
        ViewCompat.setAccessibilityLiveRegion(textView, 1);
        this.A = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.y = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.A.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AppCompatResources.getDrawable(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AppCompatResources.getDrawable(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.A.setChecked(this.p != 0);
        ViewCompat.setAccessibilityDelegate(this.A, null);
        i(this.A);
        this.A.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s sVar = s.this;
                sVar.C.setEnabled(sVar.e().i());
                sVar.A.toggle();
                sVar.p = sVar.p == 1 ? 0 : 1;
                sVar.i(sVar.A);
                sVar.h();
            }
        });
        this.C = (Button) inflate.findViewById(R.id.confirm_button);
        if (e().i()) {
            this.C.setEnabled(true);
        } else {
            this.C.setEnabled(false);
        }
        this.C.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.r;
        if (charSequence != null) {
            this.C.setText(charSequence);
        } else {
            int i = this.q;
            if (i != 0) {
                this.C.setText(i);
            }
        }
        CharSequence charSequence2 = this.t;
        if (charSequence2 != null) {
            this.C.setContentDescription(charSequence2);
        } else if (this.s != 0) {
            this.C.setContentDescription(getContext().getResources().getText(this.s));
        }
        this.C.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.v;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.u;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        CharSequence charSequence4 = this.x;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.w != 0) {
            button.setContentDescription(getContext().getResources().getText(this.w));
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f);
        C0943a c0943a = this.j;
        C0943a.b bVar = new C0943a.b();
        int i = C0943a.b.c;
        int i2 = C0943a.b.c;
        bVar.b = new C0947e(Long.MIN_VALUE);
        long j = c0943a.a.f;
        long j2 = c0943a.b.f;
        bVar.a = Long.valueOf(c0943a.d.f);
        int i3 = c0943a.e;
        C0943a.c cVar = c0943a.c;
        bVar.b = cVar;
        j<S> jVar = this.l;
        w wVar = jVar == null ? null : jVar.f;
        if (wVar != null) {
            bVar.a = Long.valueOf(wVar.f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", cVar);
        w l = w.l(j);
        w l2 = w.l(j2);
        C0943a.c cVar2 = (C0943a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l3 = bVar.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C0943a(l, l2, cVar2, l3 == null ? null : w.l(l3.longValue()), i3));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.k);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.m);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.n);
        bundle.putInt("INPUT_MODE_KEY", this.p);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.q);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.r);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.s);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.t);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.u);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.v);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.w);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.x);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.o) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.B);
            if (!this.D) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList a2 = com.google.android.material.drawable.a.a(findViewById.getBackground());
                Integer valueOf = a2 != null ? Integer.valueOf(a2.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z = false;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                int a3 = com.google.android.material.color.a.a(window.getContext(), android.R.attr.colorBackground, ViewCompat.MEASURED_STATE_MASK);
                if (z2) {
                    valueOf = Integer.valueOf(a3);
                }
                WindowCompat.setDecorFitsSystemWindows(window, false);
                window.getContext();
                int alphaComponent = i < 27 ? ColorUtils.setAlphaComponent(com.google.android.material.color.a.a(window.getContext(), android.R.attr.navigationBarColor, ViewCompat.MEASURED_STATE_MASK), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(alphaComponent);
                int intValue = valueOf.intValue();
                WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightStatusBars(intValue != 0 && ColorUtils.calculateLuminance(intValue) > 0.5d);
                boolean z3 = a3 != 0 && ColorUtils.calculateLuminance(a3) > 0.5d;
                if ((alphaComponent != 0 && ColorUtils.calculateLuminance(alphaComponent) > 0.5d) || (alphaComponent == 0 && z3)) {
                    z = true;
                }
                WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightNavigationBars(z);
                ViewCompat.setOnApplyWindowInsetsListener(findViewById, new t(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop()));
                this.D = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.B, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new com.google.android.material.dialog.a(requireDialog(), rect));
        }
        h();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.i.a.clear();
        super.onStop();
    }
}
