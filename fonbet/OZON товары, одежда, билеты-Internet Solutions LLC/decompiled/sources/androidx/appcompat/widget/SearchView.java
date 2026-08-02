package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.g0;
import i.C6977a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.c {

    /* renamed from: H, reason: collision with root package name */
    static final m f37710H;

    /* renamed from: A, reason: collision with root package name */
    private boolean f37711A;

    /* renamed from: B, reason: collision with root package name */
    private int f37712B;

    /* renamed from: C, reason: collision with root package name */
    private String f37713C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f37714D;

    /* renamed from: E, reason: collision with root package name */
    private int f37715E;

    /* renamed from: F, reason: collision with root package name */
    private final Runnable f37716F;

    /* renamed from: G, reason: collision with root package name */
    private Runnable f37717G;

    /* renamed from: e, reason: collision with root package name */
    final SearchAutoComplete f37718e;

    /* renamed from: f, reason: collision with root package name */
    private final View f37719f;

    /* renamed from: g, reason: collision with root package name */
    private final View f37720g;

    /* renamed from: h, reason: collision with root package name */
    private final View f37721h;

    /* renamed from: i, reason: collision with root package name */
    final ImageView f37722i;

    /* renamed from: j, reason: collision with root package name */
    final ImageView f37723j;

    /* renamed from: k, reason: collision with root package name */
    final ImageView f37724k;

    /* renamed from: l, reason: collision with root package name */
    final ImageView f37725l;

    /* renamed from: m, reason: collision with root package name */
    private final View f37726m;

    /* renamed from: n, reason: collision with root package name */
    private o f37727n;

    /* renamed from: o, reason: collision with root package name */
    private Rect f37728o;

    /* renamed from: p, reason: collision with root package name */
    private Rect f37729p;

    /* renamed from: q, reason: collision with root package name */
    private int[] f37730q;

    /* renamed from: r, reason: collision with root package name */
    private int[] f37731r;

    /* renamed from: s, reason: collision with root package name */
    private final ImageView f37732s;

    /* renamed from: t, reason: collision with root package name */
    private final Drawable f37733t;

    /* renamed from: u, reason: collision with root package name */
    private final CharSequence f37734u;

    /* renamed from: v, reason: collision with root package name */
    private l f37735v;

    /* renamed from: w, reason: collision with root package name */
    View.OnFocusChangeListener f37736w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f37737x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f37738y;

    /* renamed from: z, reason: collision with root package name */
    private CharSequence f37739z;

    public static class SearchAutoComplete extends C5059d {

        /* renamed from: e, reason: collision with root package name */
        private int f37740e;

        /* renamed from: f, reason: collision with root package name */
        private SearchView f37741f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f37742g;

        /* renamed from: h, reason: collision with root package name */
        final Runnable f37743h;

        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
            this.f37743h = new a();
            this.f37740e = getThreshold();
        }

        final void a(boolean z11) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            Runnable runnable = this.f37743h;
            if (!z11) {
                this.f37742g = false;
                removeCallbacks(runnable);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f37742g = true;
                    return;
                }
                this.f37742g = false;
                removeCallbacks(runnable);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        final void b(SearchView searchView) {
            this.f37741f = searchView;
        }

        final void c() {
            if (this.f37742g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f37742g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f37740e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C5059d, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f37742g) {
                Runnable runnable = this.f37743h;
                removeCallbacks(runnable);
                post(runnable);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected final void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i11 = configuration.screenWidthDp;
            int i12 = configuration.screenHeightDp;
            setMinWidth((int) TypedValue.applyDimension(1, (i11 < 960 || i12 < 720 || configuration.orientation != 2) ? (i11 >= 600 || (i11 >= 640 && i12 >= 480)) ? 192 : 160 : 256, displayMetrics));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected final void onFocusChanged(boolean z11, int i11, Rect rect) {
            super.onFocusChanged(z11, i11, rect);
            this.f37741f.m();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i11, KeyEvent keyEvent) {
            if (i11 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f37741f.clearFocus();
                        a(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i11, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z11) {
            super.onWindowFocusChanged(z11);
            if (z11 && this.f37741f.hasFocus() && getVisibility() == 0) {
                this.f37742g = true;
                Context context = getContext();
                m mVar = SearchView.f37710H;
                if (context.getResources().getConfiguration().orientation == 2) {
                    if (Build.VERSION.SDK_INT < 29) {
                        SearchView.f37710H.c(this);
                        return;
                    }
                    k.b(this, 1);
                    if (enoughToFilter()) {
                        showDropDown();
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected final void replaceText(CharSequence charSequence) {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void setThreshold(int i11) {
            super.setThreshold(i11);
            this.f37740e = i11;
        }
    }

    final class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            SearchView.this.l(charSequence);
        }
    }

    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.s();
        }
    }

    final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.getClass();
        }
    }

    final class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z11) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f37736w;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z11);
            }
        }
    }

    final class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            SearchView.this.h();
        }
    }

    final class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SearchAutoComplete searchAutoComplete;
            SearchView searchView = SearchView.this;
            if (view == searchView.f37722i) {
                searchView.j();
                return;
            }
            if (view == searchView.f37724k) {
                searchView.i();
                return;
            }
            if (view == searchView.f37723j) {
                searchView.k();
                return;
            }
            if (view != searchView.f37725l && view == (searchAutoComplete = searchView.f37718e)) {
                if (Build.VERSION.SDK_INT >= 29) {
                    k.a(searchAutoComplete);
                    return;
                }
                m mVar = SearchView.f37710H;
                mVar.b(searchAutoComplete);
                mVar.a(searchAutoComplete);
            }
        }
    }

    final class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
            SearchView.this.getClass();
            return false;
        }
    }

    final class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
            SearchView.this.k();
            return true;
        }
    }

    final class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
            SearchView.this.getClass();
            throw null;
        }
    }

    final class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j11) {
            SearchView.this.f37718e.getText();
            throw null;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i11) {
            searchAutoComplete.setInputMethodMode(i11);
        }
    }

    public interface l {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    private static class m {

        /* renamed from: a, reason: collision with root package name */
        private Method f37755a;

        /* renamed from: b, reason: collision with root package name */
        private Method f37756b;

        /* renamed from: c, reason: collision with root package name */
        private Method f37757c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        m() {
            this.f37755a = null;
            this.f37756b = null;
            this.f37757c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f37755a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f37756b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f37757c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        final void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f37756b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        final void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f37755a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        final void c(SearchAutoComplete searchAutoComplete) {
            d();
            Method method = this.f37757c;
            if (method != null) {
                try {
                    method.invoke(searchAutoComplete, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class n extends O2.a {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        boolean f37758c;

        final class a implements Parcelable.ClassLoaderCreator<n> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i11) {
                return new n[i11];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new n(parcel, null);
            }
        }

        n(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" isIconified=");
            return Pk0.a.a("}", sb2, this.f37758c);
        }

        @Override // O2.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeValue(Boolean.valueOf(this.f37758c));
        }

        public n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f37758c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    private static class o extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f37759a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f37760b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f37761c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f37762d;

        /* renamed from: e, reason: collision with root package name */
        private final int f37763e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f37764f;

        public o(View view, Rect rect, Rect rect2) {
            super(rect, view);
            this.f37763e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f37760b = new Rect();
            this.f37762d = new Rect();
            this.f37761c = new Rect();
            a(rect, rect2);
            this.f37759a = view;
        }

        public final void a(Rect rect, Rect rect2) {
            this.f37760b.set(rect);
            Rect rect3 = this.f37762d;
            rect3.set(rect);
            int i11 = this.f37763e;
            rect3.inset(-i11, -i11);
            this.f37761c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z11;
            boolean z12;
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z13 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z12 = this.f37764f;
                    if (z12 && !this.f37762d.contains(x11, y11)) {
                        z13 = z12;
                        z11 = false;
                    }
                } else {
                    if (action == 3) {
                        z12 = this.f37764f;
                        this.f37764f = false;
                    }
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                z11 = true;
            } else {
                if (this.f37760b.contains(x11, y11)) {
                    this.f37764f = true;
                    z11 = true;
                }
                z11 = true;
                z13 = false;
            }
            if (!z13) {
                return false;
            }
            Rect rect = this.f37761c;
            View view = this.f37759a;
            if (!z11 || rect.contains(x11, y11)) {
                motionEvent.setLocation(x11 - rect.left, y11 - rect.top);
            } else {
                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            }
            return view.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f37710H = Build.VERSION.SDK_INT < 29 ? new m() : null;
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.searchViewStyle);
        this.f37728o = new Rect();
        this.f37729p = new Rect();
        this.f37730q = new int[2];
        this.f37731r = new int[2];
        this.f37716F = new b();
        this.f37717G = new c();
        new WeakHashMap();
        f fVar = new f();
        g gVar = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        a aVar = new a();
        int[] iArr = C6977a.f65667u;
        b0 v11 = b0.v(context, attributeSet, iArr, R.attr.searchViewStyle, 0);
        androidx.core.view.Y.B(this, context, iArr, attributeSet, v11.r(), R.attr.searchViewStyle);
        LayoutInflater.from(context).inflate(v11.n(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f37718e = searchAutoComplete;
        searchAutoComplete.b(this);
        this.f37719f = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f37720g = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f37721h = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f37722i = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f37723j = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f37724k = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f37725l = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f37732s = imageView5;
        findViewById.setBackground(v11.g(10));
        findViewById2.setBackground(v11.g(14));
        imageView.setImageDrawable(v11.g(13));
        imageView2.setImageDrawable(v11.g(7));
        imageView3.setImageDrawable(v11.g(4));
        imageView4.setImageDrawable(v11.g(16));
        imageView5.setImageDrawable(v11.g(13));
        this.f37733t = v11.g(12);
        g0.a.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        v11.n(15, R.layout.abc_search_dropdown_item_icons_2line);
        v11.n(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(aVar);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(gVar);
        searchAutoComplete.setOnFocusChangeListener(new d());
        boolean a11 = v11.a(8, true);
        if (this.f37737x != a11) {
            this.f37737x = a11;
            u(a11);
            t();
        }
        int f7 = v11.f(1, -1);
        if (f7 != -1) {
            this.f37712B = f7;
            requestLayout();
        }
        this.f37734u = v11.p(6);
        this.f37739z = v11.p(11);
        int k11 = v11.k(3, -1);
        if (k11 != -1) {
            searchAutoComplete.setImeOptions(k11);
        }
        int k12 = v11.k(2, -1);
        if (k12 != -1) {
            searchAutoComplete.setInputType(k12);
        }
        setFocusable(v11.a(0, true));
        v11.x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        new Intent("android.speech.action.RECOGNIZE_SPEECH").addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f37726m = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        u(this.f37737x);
        t();
    }

    private void r() {
        boolean isEmpty = TextUtils.isEmpty(this.f37718e.getText());
        int i11 = (!isEmpty || (this.f37737x && !this.f37714D)) ? 0 : 8;
        ImageView imageView = this.f37724k;
        imageView.setVisibility(i11);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void t() {
        Drawable drawable;
        CharSequence charSequence = this.f37739z;
        if (charSequence == null) {
            charSequence = this.f37734u;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z11 = this.f37737x;
        SearchAutoComplete searchAutoComplete = this.f37718e;
        if (z11 && (drawable = this.f37733t) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence = spannableStringBuilder;
        }
        searchAutoComplete.setHint(charSequence);
    }

    private void u(boolean z11) {
        this.f37738y = z11;
        int i11 = z11 ? 0 : 8;
        TextUtils.isEmpty(this.f37718e.getText());
        this.f37722i.setVisibility(i11);
        this.f37723j.setVisibility(8);
        this.f37719f.setVisibility(z11 ? 8 : 0);
        ImageView imageView = this.f37732s;
        imageView.setVisibility((imageView.getDrawable() == null || this.f37737x) ? 8 : 0);
        r();
        this.f37725l.setVisibility(8);
        this.f37721h.setVisibility(8);
    }

    @Override // androidx.appcompat.view.c
    public final void b() {
        p("", false);
        clearFocus();
        u(true);
        this.f37718e.setImeOptions(this.f37715E);
        this.f37714D = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f37711A = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f37718e;
        searchAutoComplete.clearFocus();
        searchAutoComplete.a(false);
        this.f37711A = false;
    }

    @Override // androidx.appcompat.view.c
    public final void d() {
        if (this.f37714D) {
            return;
        }
        this.f37714D = true;
        SearchAutoComplete searchAutoComplete = this.f37718e;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f37715E = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        j();
    }

    final void h() {
        View view = this.f37726m;
        if (view.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f37720g.getPaddingLeft();
            Rect rect = new Rect();
            int i11 = i0.f37951d;
            boolean z11 = getLayoutDirection() == 1;
            int dimensionPixelSize = this.f37737x ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
            SearchAutoComplete searchAutoComplete = this.f37718e;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            searchAutoComplete.setDropDownHorizontalOffset(z11 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    final void i() {
        SearchAutoComplete searchAutoComplete = this.f37718e;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.a(true);
        } else if (this.f37737x) {
            clearFocus();
            u(true);
        }
    }

    final void j() {
        u(false);
        SearchAutoComplete searchAutoComplete = this.f37718e;
        searchAutoComplete.requestFocus();
        searchAutoComplete.a(true);
    }

    final void k() {
        SearchAutoComplete searchAutoComplete = this.f37718e;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.f37735v;
        if (lVar == null || !lVar.onQueryTextSubmit(text.toString())) {
            searchAutoComplete.a(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    final void l(CharSequence charSequence) {
        TextUtils.isEmpty(this.f37718e.getText());
        this.f37723j.setVisibility(8);
        this.f37725l.setVisibility(8);
        r();
        this.f37721h.setVisibility(8);
        if (this.f37735v != null && !TextUtils.equals(charSequence, this.f37713C)) {
            this.f37735v.onQueryTextChange(charSequence.toString());
        }
        this.f37713C = charSequence.toString();
    }

    final void m() {
        u(this.f37738y);
        post(this.f37716F);
        SearchAutoComplete searchAutoComplete = this.f37718e;
        if (searchAutoComplete.hasFocus()) {
            if (Build.VERSION.SDK_INT >= 29) {
                k.a(searchAutoComplete);
                return;
            }
            m mVar = f37710H;
            mVar.b(searchAutoComplete);
            mVar.a(searchAutoComplete);
        }
    }

    public final void n(View.OnFocusChangeListener onFocusChangeListener) {
        this.f37736w = onFocusChangeListener;
    }

    public final void o(l lVar) {
        this.f37735v = lVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.f37716F);
        post(this.f37717G);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            int[] iArr = this.f37730q;
            SearchAutoComplete searchAutoComplete = this.f37718e;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f37731r;
            getLocationInWindow(iArr2);
            int i15 = iArr[1] - iArr2[1];
            int i16 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i16;
            int height = searchAutoComplete.getHeight() + i15;
            Rect rect = this.f37728o;
            rect.set(i16, i15, width, height);
            int i17 = rect.left;
            int i18 = rect.right;
            int i19 = i14 - i12;
            Rect rect2 = this.f37729p;
            rect2.set(i17, 0, i18, i19);
            o oVar = this.f37727n;
            if (oVar != null) {
                oVar.a(rect2, rect);
                return;
            }
            o oVar2 = new o(searchAutoComplete, rect2, rect);
            this.f37727n = oVar2;
            setTouchDelegate(oVar2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected final void onMeasure(int i11, int i12) {
        int i13;
        if (this.f37738y) {
            super.onMeasure(i11, i12);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            int i14 = this.f37712B;
            size = i14 > 0 ? Math.min(i14, size) : Math.min(getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width), size);
        } else if (mode == 0) {
            size = this.f37712B;
            if (size <= 0) {
                size = getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
            }
        } else if (mode == 1073741824 && (i13 = this.f37712B) > 0) {
            size = Math.min(i13, size);
        }
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height), size2);
        } else if (mode2 == 0) {
            size2 = getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.a());
        u(nVar.f37758c);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.f37758c = this.f37738y;
        return nVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z11) {
        super.onWindowFocusChanged(z11);
        post(this.f37716F);
    }

    public final void p(CharSequence charSequence, boolean z11) {
        SearchAutoComplete searchAutoComplete = this.f37718e;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
        }
        if (!z11 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        k();
    }

    public final void q(String str) {
        this.f37739z = str;
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i11, Rect rect) {
        if (this.f37711A || !isFocusable()) {
            return false;
        }
        if (this.f37738y) {
            return super.requestFocus(i11, rect);
        }
        boolean requestFocus = this.f37718e.requestFocus(i11, rect);
        if (requestFocus) {
            u(false);
        }
        return requestFocus;
    }

    final void s() {
        int[] iArr = this.f37718e.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f37720g.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f37721h.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }
}
