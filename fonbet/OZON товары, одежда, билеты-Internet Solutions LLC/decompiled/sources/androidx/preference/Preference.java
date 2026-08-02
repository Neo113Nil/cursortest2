package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.core.content.res.k;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.preference.c;
import androidx.preference.g;
import g.C6594f;
import j.C7232a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import ru.ozon.app.android.R;
import y2.q;

/* loaded from: classes8.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: A, reason: collision with root package name */
    private boolean f44479A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f44480B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f44481C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f44482D;

    /* renamed from: E, reason: collision with root package name */
    private int f44483E;

    /* renamed from: F, reason: collision with root package name */
    private int f44484F;

    /* renamed from: G, reason: collision with root package name */
    private androidx.preference.d f44485G;

    /* renamed from: H, reason: collision with root package name */
    private ArrayList f44486H;

    /* renamed from: I, reason: collision with root package name */
    private PreferenceGroup f44487I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f44488J;

    /* renamed from: K, reason: collision with root package name */
    private e f44489K;

    /* renamed from: L, reason: collision with root package name */
    private f f44490L;

    /* renamed from: M, reason: collision with root package name */
    private final View.OnClickListener f44491M;

    /* renamed from: a, reason: collision with root package name */
    private Context f44492a;

    /* renamed from: b, reason: collision with root package name */
    private g f44493b;

    /* renamed from: c, reason: collision with root package name */
    private long f44494c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f44495d;

    /* renamed from: e, reason: collision with root package name */
    private c f44496e;

    /* renamed from: f, reason: collision with root package name */
    private d f44497f;

    /* renamed from: g, reason: collision with root package name */
    private int f44498g;

    /* renamed from: h, reason: collision with root package name */
    private CharSequence f44499h;

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f44500i;

    /* renamed from: j, reason: collision with root package name */
    private int f44501j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f44502k;

    /* renamed from: l, reason: collision with root package name */
    private String f44503l;

    /* renamed from: m, reason: collision with root package name */
    private Intent f44504m;

    /* renamed from: n, reason: collision with root package name */
    private String f44505n;

    /* renamed from: o, reason: collision with root package name */
    private Bundle f44506o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f44507p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f44508q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f44509r;

    /* renamed from: s, reason: collision with root package name */
    private String f44510s;

    /* renamed from: t, reason: collision with root package name */
    private Object f44511t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f44512u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f44513v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f44514w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f44515x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f44516y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f44517z;

    final class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Preference.this.R(view);
        }
    }

    public static class b extends AbsSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        static class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(Parcel parcel) {
            super(parcel);
        }
    }

    public interface c {
        void b(Preference preference, Serializable serializable);
    }

    public interface d {
        boolean d(Preference preference);
    }

    private static class e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final Preference f44519a;

        e(Preference preference) {
            this.f44519a = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            Preference preference = this.f44519a;
            CharSequence s11 = preference.s();
            if (!preference.x() || TextUtils.isEmpty(s11)) {
                return;
            }
            contextMenu.setHeaderTitle(s11);
            contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Preference preference = this.f44519a;
            ClipboardManager clipboardManager = (ClipboardManager) preference.e().getSystemService("clipboard");
            CharSequence s11 = preference.s();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", s11));
            Toast.makeText(preference.e(), preference.e().getString(R.string.preference_copied, s11), 0).show();
            return true;
        }
    }

    public interface f<T extends Preference> {
        CharSequence a(T t2);
    }

    public Preference(Context context, AttributeSet attributeSet, int i11) {
        this.f44498g = Integer.MAX_VALUE;
        this.f44507p = true;
        this.f44508q = true;
        this.f44509r = true;
        this.f44512u = true;
        this.f44513v = true;
        this.f44514w = true;
        this.f44515x = true;
        this.f44516y = true;
        this.f44479A = true;
        this.f44482D = true;
        this.f44483E = R.layout.preference;
        this.f44491M = new a();
        this.f44492a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G4.f.f9706g, i11, 0);
        this.f44501j = obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.f44503l = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f44499h = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f44500i = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f44498g = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = obtainStyledAttributes.getString(22);
        this.f44505n = string2 == null ? obtainStyledAttributes.getString(13) : string2;
        this.f44483E = obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.f44484F = obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        this.f44507p = obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z11 = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        this.f44508q = z11;
        this.f44509r = obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        String string3 = obtainStyledAttributes.getString(19);
        this.f44510s = string3 == null ? obtainStyledAttributes.getString(10) : string3;
        this.f44515x = obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z11));
        this.f44516y = obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z11));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f44511t = L(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f44511t = L(obtainStyledAttributes, 11);
        }
        this.f44482D = obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.f44517z = hasValue;
        if (hasValue) {
            this.f44479A = obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        this.f44480B = obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        this.f44514w = obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        this.f44481C = obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    private static void X(View view, boolean z11) {
        view.setEnabled(z11);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                X(viewGroup.getChildAt(childCount), z11);
            }
        }
    }

    public final boolean A() {
        return this.f44509r;
    }

    public final boolean B() {
        return this.f44514w;
    }

    protected void C() {
        androidx.preference.d dVar = this.f44485G;
        if (dVar != null) {
            dVar.j(this);
        }
    }

    public void D(boolean z11) {
        ArrayList arrayList = this.f44486H;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Preference preference = (Preference) arrayList.get(i11);
            if (preference.f44512u == z11) {
                preference.f44512u = !z11;
                preference.D(preference.i0());
                preference.C();
            }
        }
    }

    protected final void E() {
        androidx.preference.d dVar = this.f44485G;
        if (dVar != null) {
            dVar.k();
        }
    }

    public void F() {
        String str = this.f44510s;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        g gVar = this.f44493b;
        Preference a11 = gVar == null ? null : gVar.a(str);
        if (a11 == null) {
            StringBuilder b11 = C6594f.b("Dependency \"", str, "\" not found for preference \"");
            b11.append(this.f44503l);
            b11.append("\" (title: \"");
            b11.append((Object) this.f44499h);
            b11.append("\"");
            throw new IllegalStateException(b11.toString());
        }
        if (a11.f44486H == null) {
            a11.f44486H = new ArrayList();
        }
        a11.f44486H.add(this);
        boolean i02 = a11.i0();
        if (this.f44512u == i02) {
            this.f44512u = !i02;
            D(i0());
            C();
        }
    }

    protected final void G(g gVar) {
        this.f44493b = gVar;
        if (!this.f44495d) {
            this.f44494c = gVar.d();
        }
        if (j0()) {
            g gVar2 = this.f44493b;
            if ((gVar2 != null ? gVar2.h() : null).contains(this.f44503l)) {
                Q(null);
                return;
            }
        }
        Object obj = this.f44511t;
        if (obj != null) {
            Q(obj);
        }
    }

    protected final void H(g gVar, long j11) {
        this.f44494c = j11;
        this.f44495d = true;
        try {
            G(gVar);
        } finally {
            this.f44495d = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void I(h hVar) {
        Integer num;
        TextView textView;
        ImageView imageView;
        View e11;
        boolean z11;
        View view = hVar.itemView;
        view.setOnClickListener(this.f44491M);
        view.setId(0);
        TextView textView2 = (TextView) hVar.e(android.R.id.summary);
        if (textView2 != null) {
            CharSequence s11 = s();
            if (!TextUtils.isEmpty(s11)) {
                textView2.setText(s11);
                textView2.setVisibility(0);
                num = Integer.valueOf(textView2.getCurrentTextColor());
                textView = (TextView) hVar.e(android.R.id.title);
                boolean z12 = this.f44508q;
                if (textView != null) {
                    CharSequence charSequence = this.f44499h;
                    if (TextUtils.isEmpty(charSequence)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(charSequence);
                        textView.setVisibility(0);
                        if (this.f44517z) {
                            textView.setSingleLine(this.f44479A);
                        }
                        if (!z12 && z() && num != null) {
                            textView.setTextColor(num.intValue());
                        }
                    }
                }
                imageView = (ImageView) hVar.e(android.R.id.icon);
                boolean z13 = this.f44480B;
                if (imageView != null) {
                    int i11 = this.f44501j;
                    if (i11 != 0 || this.f44502k != null) {
                        if (this.f44502k == null) {
                            this.f44502k = C7232a.a(this.f44492a, i11);
                        }
                        Drawable drawable = this.f44502k;
                        if (drawable != null) {
                            imageView.setImageDrawable(drawable);
                        }
                    }
                    if (this.f44502k != null) {
                        imageView.setVisibility(0);
                    } else {
                        imageView.setVisibility(z13 ? 4 : 8);
                    }
                }
                e11 = hVar.e(R.id.icon_frame);
                if (e11 == null) {
                    e11 = hVar.e(android.R.id.icon_frame);
                }
                if (e11 != null) {
                    if (this.f44502k != null) {
                        e11.setVisibility(0);
                    } else {
                        e11.setVisibility(z13 ? 4 : 8);
                    }
                }
                if (this.f44482D) {
                    X(view, true);
                } else {
                    X(view, z());
                }
                view.setFocusable(z12);
                view.setClickable(z12);
                hVar.h(this.f44515x);
                hVar.i(this.f44516y);
                z11 = this.f44481C;
                if (z11 && this.f44489K == null) {
                    this.f44489K = new e(this);
                }
                view.setOnCreateContextMenuListener(!z11 ? this.f44489K : null);
                view.setLongClickable(z11);
                if (z11 || z12) {
                }
                int i12 = Y.f42258g;
                view.setBackground(null);
                return;
            }
            textView2.setVisibility(8);
        }
        num = null;
        textView = (TextView) hVar.e(android.R.id.title);
        boolean z122 = this.f44508q;
        if (textView != null) {
        }
        imageView = (ImageView) hVar.e(android.R.id.icon);
        boolean z132 = this.f44480B;
        if (imageView != null) {
        }
        e11 = hVar.e(R.id.icon_frame);
        if (e11 == null) {
        }
        if (e11 != null) {
        }
        if (this.f44482D) {
        }
        view.setFocusable(z122);
        view.setClickable(z122);
        hVar.h(this.f44515x);
        hVar.i(this.f44516y);
        z11 = this.f44481C;
        if (z11) {
            this.f44489K = new e(this);
        }
        view.setOnCreateContextMenuListener(!z11 ? this.f44489K : null);
        view.setLongClickable(z11);
        if (z11) {
        }
    }

    protected void J() {
    }

    public void K() {
        ArrayList arrayList;
        String str = this.f44510s;
        if (str != null) {
            g gVar = this.f44493b;
            Preference a11 = gVar == null ? null : gVar.a(str);
            if (a11 == null || (arrayList = a11.f44486H) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    protected Object L(TypedArray typedArray, int i11) {
        return null;
    }

    @Deprecated
    public void M(q qVar) {
    }

    public final void N(boolean z11) {
        if (this.f44513v == z11) {
            this.f44513v = !z11;
            D(i0());
            C();
        }
    }

    protected void O(Parcelable parcelable) {
        this.f44488J = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    protected Parcelable P() {
        this.f44488J = true;
        return AbsSavedState.EMPTY_STATE;
    }

    protected void Q(Object obj) {
    }

    protected void R(View view) {
        g.b f7;
        if (z() && this.f44508q) {
            J();
            d dVar = this.f44497f;
            if (dVar == null || !dVar.d(this)) {
                g gVar = this.f44493b;
                if (gVar != null && (f7 = gVar.f()) != null) {
                    ComponentCallbacksC5392m componentCallbacksC5392m = (androidx.preference.c) f7;
                    boolean z11 = false;
                    if (this.f44505n != null) {
                        if (!(componentCallbacksC5392m.getActivity() instanceof c.e ? ((c.e) componentCallbacksC5392m.getActivity()).a() : false)) {
                            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                            G supportFragmentManager = componentCallbacksC5392m.requireActivity().getSupportFragmentManager();
                            Bundle f11 = f();
                            ComponentCallbacksC5392m a11 = supportFragmentManager.p0().a(componentCallbacksC5392m.requireActivity().getClassLoader(), this.f44505n);
                            a11.setArguments(f11);
                            a11.setTargetFragment(componentCallbacksC5392m, 0);
                            Q p11 = supportFragmentManager.p();
                            p11.r(((View) componentCallbacksC5392m.getView().getParent()).getId(), a11, null);
                            p11.g(null);
                            p11.i();
                        }
                        z11 = true;
                    }
                    if (z11) {
                        return;
                    }
                }
                Intent intent = this.f44504m;
                if (intent != null) {
                    this.f44492a.startActivity(intent);
                }
            }
        }
    }

    protected final void S(boolean z11) {
        if (j0() && z11 != n(!z11)) {
            SharedPreferences.Editor c11 = this.f44493b.c();
            c11.putBoolean(this.f44503l, z11);
            if (this.f44493b.o()) {
                c11.apply();
            }
        }
    }

    protected final void T(int i11) {
        if (j0() && i11 != o(~i11)) {
            SharedPreferences.Editor c11 = this.f44493b.c();
            c11.putInt(this.f44503l, i11);
            if (this.f44493b.o()) {
                c11.apply();
            }
        }
    }

    protected final void U(String str) {
        if (j0() && !TextUtils.equals(str, p(null))) {
            SharedPreferences.Editor c11 = this.f44493b.c();
            c11.putString(this.f44503l, str);
            if (this.f44493b.o()) {
                c11.apply();
            }
        }
    }

    public final void V(Set set) {
        if (j0() && !set.equals(q(null))) {
            SharedPreferences.Editor c11 = this.f44493b.c();
            c11.putStringSet(this.f44503l, set);
            if (this.f44493b.o()) {
                c11.apply();
            }
        }
    }

    public final void W(boolean z11) {
        if (this.f44507p != z11) {
            this.f44507p = z11;
            D(i0());
            C();
        }
    }

    public final void Y(int i11) {
        Drawable a11 = C7232a.a(this.f44492a, i11);
        if (this.f44502k != a11) {
            this.f44502k = a11;
            this.f44501j = 0;
            C();
        }
        this.f44501j = i11;
    }

    public final void Z(Intent intent) {
        this.f44504m = intent;
    }

    final void a(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.f44487I != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.f44487I = preferenceGroup;
    }

    public final void a0() {
        this.f44483E = R.layout.expand_button;
    }

    public final boolean b(Serializable serializable) {
        c cVar = this.f44496e;
        if (cVar == null) {
            return true;
        }
        cVar.b(this, serializable);
        return true;
    }

    final void b0(androidx.preference.d dVar) {
        this.f44485G = dVar;
    }

    void c(Bundle bundle) {
        Parcelable parcelable;
        if (!w() || (parcelable = bundle.getParcelable(this.f44503l)) == null) {
            return;
        }
        this.f44488J = false;
        O(parcelable);
        if (!this.f44488J) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public final void c0(c cVar) {
        this.f44496e = cVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull Preference preference) {
        Preference preference2 = preference;
        int i11 = this.f44498g;
        int i12 = preference2.f44498g;
        if (i11 != i12) {
            return i11 - i12;
        }
        CharSequence charSequence = this.f44499h;
        CharSequence charSequence2 = preference2.f44499h;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.f44499h.toString());
    }

    void d(Bundle bundle) {
        if (w()) {
            this.f44488J = false;
            Parcelable P11 = P();
            if (!this.f44488J) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (P11 != null) {
                bundle.putParcelable(this.f44503l, P11);
            }
        }
    }

    public final void d0(d dVar) {
        this.f44497f = dVar;
    }

    public final Context e() {
        return this.f44492a;
    }

    public final void e0(int i11) {
        if (i11 != this.f44498g) {
            this.f44498g = i11;
            E();
        }
    }

    public final Bundle f() {
        if (this.f44506o == null) {
            this.f44506o = new Bundle();
        }
        return this.f44506o;
    }

    public void f0(CharSequence charSequence) {
        if (this.f44490L != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f44500i, charSequence)) {
            return;
        }
        this.f44500i = charSequence;
        C();
    }

    public final String g() {
        return this.f44505n;
    }

    public final void g0(f fVar) {
        this.f44490L = fVar;
        C();
    }

    long h() {
        return this.f44494c;
    }

    public final void h0() {
        String string = this.f44492a.getString(R.string.expand_button_title);
        if ((string != null || this.f44499h == null) && (string == null || string.equals(this.f44499h))) {
            return;
        }
        this.f44499h = string;
        C();
    }

    public final Intent i() {
        return this.f44504m;
    }

    public boolean i0() {
        return !z();
    }

    public final String j() {
        return this.f44503l;
    }

    protected final boolean j0() {
        return this.f44493b != null && this.f44509r && w();
    }

    public final int k() {
        return this.f44483E;
    }

    public final int l() {
        return this.f44498g;
    }

    public final PreferenceGroup m() {
        return this.f44487I;
    }

    protected final boolean n(boolean z11) {
        return !j0() ? z11 : this.f44493b.h().getBoolean(this.f44503l, z11);
    }

    protected final int o(int i11) {
        return !j0() ? i11 : this.f44493b.h().getInt(this.f44503l, i11);
    }

    protected final String p(String str) {
        return !j0() ? str : this.f44493b.h().getString(this.f44503l, str);
    }

    public final Set<String> q(Set<String> set) {
        return !j0() ? set : this.f44493b.h().getStringSet(this.f44503l, set);
    }

    public final g r() {
        return this.f44493b;
    }

    public CharSequence s() {
        f fVar = this.f44490L;
        return fVar != null ? fVar.a(this) : this.f44500i;
    }

    public final f t() {
        return this.f44490L;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequence = this.f44499h;
        if (!TextUtils.isEmpty(charSequence)) {
            sb2.append(charSequence);
            sb2.append(' ');
        }
        CharSequence s11 = s();
        if (!TextUtils.isEmpty(s11)) {
            sb2.append(s11);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public final CharSequence u() {
        return this.f44499h;
    }

    public final int v() {
        return this.f44484F;
    }

    public final boolean w() {
        return !TextUtils.isEmpty(this.f44503l);
    }

    public final boolean x() {
        return this.f44481C;
    }

    public boolean z() {
        return this.f44507p && this.f44512u && this.f44513v;
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(R.attr.preferenceStyle, android.R.attr.preferenceStyle, context));
    }
}
