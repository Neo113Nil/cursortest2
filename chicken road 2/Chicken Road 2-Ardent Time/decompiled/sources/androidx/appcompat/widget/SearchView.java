package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class SearchView extends h.AbstractC0135D implements f.InterfaceC0110a {
    public static final R1.i k0;

    /* renamed from: A, reason: collision with root package name */
    public final android.graphics.Rect f2045A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f2046B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f2047C;

    /* renamed from: D, reason: collision with root package name */
    public final android.widget.ImageView f2048D;

    /* renamed from: E, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f2049E;

    /* renamed from: F, reason: collision with root package name */
    public final int f2050F;
    public final int G;

    /* renamed from: H, reason: collision with root package name */
    public final android.content.Intent f2051H;

    /* renamed from: I, reason: collision with root package name */
    public final android.content.Intent f2052I;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.CharSequence f2053J;

    /* renamed from: K, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f2054K;

    /* renamed from: L, reason: collision with root package name */
    public android.view.View.OnClickListener f2055L;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2056Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2057R;

    /* renamed from: S, reason: collision with root package name */
    public D.c f2058S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f2059T;

    /* renamed from: U, reason: collision with root package name */
    public java.lang.CharSequence f2060U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f2061V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2062W;

    /* renamed from: a0, reason: collision with root package name */
    public int f2063a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f2064b0;

    /* renamed from: c0, reason: collision with root package name */
    public java.lang.CharSequence f2065c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f2066d0;
    public int e0;
    public android.app.SearchableInfo f0;

    /* renamed from: g0, reason: collision with root package name */
    public android.os.Bundle f2067g0;

    /* renamed from: h0, reason: collision with root package name */
    public final h.S f2068h0;

    /* renamed from: i0, reason: collision with root package name */
    public final h.S f2069i0;

    /* renamed from: j0, reason: collision with root package name */
    public final java.util.WeakHashMap f2070j0;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.appcompat.widget.SearchView.SearchAutoComplete f2071p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f2072q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f2073r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f2074s;
    public final android.widget.ImageView t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.ImageView f2075u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.ImageView f2076v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.ImageView f2077w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f2078x;

    /* renamed from: y, reason: collision with root package name */
    public h.b0 f2079y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.Rect f2080z;

    public static class SearchAutoComplete extends h.AbstractC0155m {

        /* renamed from: d, reason: collision with root package name */
        public int f2081d;

        /* renamed from: e, reason: collision with root package name */
        public androidx.appcompat.widget.SearchView f2082e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f2083f;

        /* renamed from: g, reason: collision with root package name */
        public final androidx.appcompat.widget.c f2084g;

        public SearchAutoComplete(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2084g = new androidx.appcompat.widget.c(this);
            this.f2081d = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            android.content.res.Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f2081d <= 0 || super.enoughToFilter();
        }

        @Override // h.AbstractC0155m, android.widget.TextView, android.view.View
        public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
            android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2083f) {
                androidx.appcompat.widget.c cVar = this.f2084g;
                removeCallbacks(cVar);
                post(cVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) android.util.TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z2, int i2, android.graphics.Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            androidx.appcompat.widget.SearchView searchView = this.f2082e;
            searchView.u(searchView.f2057R);
            searchView.post(searchView.f2068h0);
            if (searchView.f2071p.hasFocus()) {
                searchView.j();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i2, android.view.KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    android.view.KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2082e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z2) {
            java.lang.reflect.Method method;
            super.onWindowFocusChanged(z2);
            if (z2 && this.f2082e.hasFocus() && getVisibility() == 0) {
                this.f2083f = true;
                android.content.Context context = getContext();
                R1.i iVar = androidx.appcompat.widget.SearchView.k0;
                if (context.getResources().getConfiguration().orientation != 2 || (method = androidx.appcompat.widget.SearchView.k0.f1702c) == null) {
                    return;
                }
                try {
                    method.invoke(this, java.lang.Boolean.TRUE);
                } catch (java.lang.Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(java.lang.CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
            androidx.appcompat.widget.c cVar = this.f2084g;
            if (!z2) {
                this.f2083f = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f2083f = true;
                    return;
                }
                this.f2083f = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(androidx.appcompat.widget.SearchView searchView) {
            this.f2082e = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f2081d = i2;
        }
    }

    static {
        R1.i iVar = new R1.i();
        try {
            java.lang.reflect.Method declaredMethod = android.widget.AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
            iVar.f1700a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (java.lang.NoSuchMethodException unused) {
        }
        try {
            java.lang.reflect.Method declaredMethod2 = android.widget.AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
            iVar.f1701b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (java.lang.NoSuchMethodException unused2) {
        }
        try {
            java.lang.reflect.Method method = android.widget.AutoCompleteTextView.class.getMethod("ensureImeVisible", java.lang.Boolean.TYPE);
            iVar.f1702c = method;
            method.setAccessible(true);
        } catch (java.lang.NoSuchMethodException unused3) {
        }
        k0 = iVar;
    }

    public SearchView(android.content.Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(com.watchfacestudio.huasi_urx110.R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(com.watchfacestudio.huasi_urx110.R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(java.lang.CharSequence charSequence) {
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f2071p;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(android.text.TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f2062W = true;
        super.clearFocus();
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f2071p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f2062W = false;
    }

    public int getImeOptions() {
        return this.f2071p.getImeOptions();
    }

    public int getInputType() {
        return this.f2071p.getInputType();
    }

    public int getMaxWidth() {
        return this.f2063a0;
    }

    public java.lang.CharSequence getQuery() {
        return this.f2071p.getText();
    }

    public java.lang.CharSequence getQueryHint() {
        java.lang.CharSequence charSequence = this.f2060U;
        if (charSequence != null) {
            return charSequence;
        }
        android.app.SearchableInfo searchableInfo = this.f0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f2053J : getContext().getText(this.f0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.f2050F;
    }

    public D.c getSuggestionsAdapter() {
        return this.f2058S;
    }

    public final android.content.Intent h(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.lang.String str3) {
        android.content.Intent intent = new android.content.Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f2065c0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        android.os.Bundle bundle = this.f2067g0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f0.getSearchActivity());
        return intent;
    }

    public final android.content.Intent i(android.content.Intent intent, android.app.SearchableInfo searchableInfo) {
        android.content.ComponentName searchActivity = searchableInfo.getSearchActivity();
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        android.os.Bundle bundle = new android.os.Bundle();
        android.os.Bundle bundle2 = this.f2067g0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        android.content.Intent intent3 = new android.content.Intent(intent);
        android.content.res.Resources resources = getResources();
        java.lang.String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        java.lang.String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        java.lang.String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void j() {
        int i2 = android.os.Build.VERSION.SDK_INT;
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f2071p;
        if (i2 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        R1.i iVar = k0;
        java.lang.reflect.Method method = iVar.f1700a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (java.lang.Exception unused) {
            }
        }
        java.lang.reflect.Method method2 = iVar.f1701b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    public final void k() {
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f2071p;
        if (!android.text.TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f2056Q) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i2) {
        int i3;
        java.lang.String h2;
        android.database.Cursor cursor = this.f2058S.f187c;
        if (cursor != null && cursor.moveToPosition(i2)) {
            android.content.Intent intent = null;
            try {
                int i4 = h.d0.f3133y;
                java.lang.String h3 = h.d0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h3 == null) {
                    h3 = this.f0.getSuggestIntentAction();
                }
                if (h3 == null) {
                    h3 = "android.intent.action.SEARCH";
                }
                java.lang.String h4 = h.d0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h4 == null) {
                    h4 = this.f0.getSuggestIntentData();
                }
                if (h4 != null && (h2 = h.d0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h4 = h4 + "/" + android.net.Uri.encode(h2);
                }
                intent = h(h3, h4 == null ? null : android.net.Uri.parse(h4), h.d0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), h.d0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (java.lang.RuntimeException e2) {
                try {
                    i3 = cursor.getPosition();
                } catch (java.lang.RuntimeException unused) {
                    i3 = -1;
                }
                android.util.Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (java.lang.RuntimeException e3) {
                    android.util.Log.e("SearchView", "Failed launch activity: " + intent, e3);
                }
            }
        }
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f2071p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i2) {
        android.text.Editable text = this.f2071p.getText();
        android.database.Cursor cursor = this.f2058S.f187c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        java.lang.String c2 = this.f2058S.c(cursor);
        if (c2 != null) {
            setQuery(c2);
        } else {
            setQuery(text);
        }
    }

    public final void n(java.lang.CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f2071p;
        android.text.Editable text = searchAutoComplete.getText();
        if (text == null || android.text.TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f0 != null) {
            getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f2068h0);
        post(this.f2069i0);
        super.onDetachedFromWindow();
    }

    @Override // h.AbstractC0135D, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            int[] iArr = this.f2046B;
            androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f2071p;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f2047C;
            getLocationInWindow(iArr2);
            int i6 = iArr[1] - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i7;
            int height = searchAutoComplete.getHeight() + i6;
            android.graphics.Rect rect = this.f2080z;
            rect.set(i7, i6, width, height);
            int i8 = rect.left;
            int i9 = rect.right;
            int i10 = i5 - i3;
            android.graphics.Rect rect2 = this.f2045A;
            rect2.set(i8, 0, i9, i10);
            h.b0 b0Var = this.f2079y;
            if (b0Var == null) {
                h.b0 b0Var2 = new h.b0(rect2, rect, searchAutoComplete);
                this.f2079y = b0Var2;
                setTouchDelegate(b0Var2);
            } else {
                b0Var.f3121b.set(rect2);
                android.graphics.Rect rect3 = b0Var.f3123d;
                rect3.set(rect2);
                int i11 = -b0Var.f3124e;
                rect3.inset(i11, i11);
                b0Var.f3122c.set(rect);
            }
        }
    }

    @Override // h.AbstractC0135D, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f2057R) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.f2063a0;
            size = i5 > 0 ? java.lang.Math.min(i5, size) : java.lang.Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f2063a0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.f2063a0) > 0) {
            size = java.lang.Math.min(i4, size);
        }
        int mode2 = android.view.View.MeasureSpec.getMode(i3);
        int size2 = android.view.View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = java.lang.Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof h.a0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h.a0 a0Var = (h.a0) parcelable;
        super.onRestoreInstanceState(a0Var.f258a);
        u(a0Var.f3118c);
        requestLayout();
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        h.a0 a0Var = new h.a0(super.onSaveInstanceState());
        a0Var.f3118c = this.f2057R;
        return a0Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.f2068h0);
    }

    public final void p() {
        boolean isEmpty = android.text.TextUtils.isEmpty(this.f2071p.getText());
        int i2 = (!isEmpty || (this.f2056Q && !this.f2066d0)) ? 0 : 8;
        android.widget.ImageView imageView = this.f2076v;
        imageView.setVisibility(i2);
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? android.view.ViewGroup.ENABLED_STATE_SET : android.view.ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.f2071p.hasFocus() ? android.view.ViewGroup.FOCUSED_STATE_SET : android.view.ViewGroup.EMPTY_STATE_SET;
        android.graphics.drawable.Drawable background = this.f2073r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        android.graphics.drawable.Drawable background2 = this.f2074s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void r() {
        android.graphics.drawable.Drawable drawable;
        java.lang.CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z2 = this.f2056Q;
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f2071p;
        if (z2 && (drawable = this.f2049E) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new android.text.style.ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, android.graphics.Rect rect) {
        if (this.f2062W || !isFocusable()) {
            return false;
        }
        if (this.f2057R) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.f2071p.requestFocus(i2, rect);
        if (requestFocus) {
            u(false);
        }
        return requestFocus;
    }

    public final void s() {
        this.f2074s.setVisibility(((this.f2059T || this.f2064b0) && !this.f2057R && (this.f2075u.getVisibility() == 0 || this.f2077w.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(android.os.Bundle bundle) {
        this.f2067g0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            k();
            return;
        }
        u(false);
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f2071p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        android.view.View.OnClickListener onClickListener = this.f2055L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.f2056Q == z2) {
            return;
        }
        this.f2056Q = z2;
        u(z2);
        r();
    }

    public void setImeOptions(int i2) {
        this.f2071p.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f2071p.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f2063a0 = i2;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f2054K = onFocusChangeListener;
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener onClickListener) {
        this.f2055L = onClickListener;
    }

    public void setQueryHint(java.lang.CharSequence charSequence) {
        this.f2060U = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.f2061V = z2;
        D.c cVar = this.f2058S;
        if (cVar instanceof h.d0) {
            ((h.d0) cVar).f3142q = z2 ? 2 : 1;
        }
    }

    public void setSearchableInfo(android.app.SearchableInfo searchableInfo) {
        this.f0 = searchableInfo;
        android.content.Intent intent = null;
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f2071p;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f0.getImeOptions());
            int inputType = this.f0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            D.c cVar = this.f2058S;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.f0.getSuggestAuthority() != null) {
                h.d0 d0Var = new h.d0(getContext(), this, this.f0, this.f2070j0);
                this.f2058S = d0Var;
                searchAutoComplete.setAdapter(d0Var);
                ((h.d0) this.f2058S).f3142q = this.f2061V ? 2 : 1;
            }
            r();
        }
        android.app.SearchableInfo searchableInfo2 = this.f0;
        boolean z2 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f2051H;
            } else if (this.f0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f2052I;
            }
            if (intent != null) {
                z2 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f2064b0 = z2;
        if (z2) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.f2057R);
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.f2059T = z2;
        u(this.f2057R);
    }

    public void setSuggestionsAdapter(D.c cVar) {
        this.f2058S = cVar;
        this.f2071p.setAdapter(cVar);
    }

    public final void t(boolean z2) {
        boolean z3 = this.f2059T;
        this.f2075u.setVisibility((!z3 || !(z3 || this.f2064b0) || this.f2057R || !hasFocus() || (!z2 && this.f2064b0)) ? 8 : 0);
    }

    public final void u(boolean z2) {
        this.f2057R = z2;
        int i2 = 8;
        int i3 = z2 ? 0 : 8;
        boolean isEmpty = android.text.TextUtils.isEmpty(this.f2071p.getText());
        this.t.setVisibility(i3);
        t(!isEmpty);
        this.f2072q.setVisibility(z2 ? 8 : 0);
        android.widget.ImageView imageView = this.f2048D;
        imageView.setVisibility((imageView.getDrawable() == null || this.f2056Q) ? 8 : 0);
        p();
        if (this.f2064b0 && !this.f2057R && isEmpty) {
            this.f2075u.setVisibility(8);
            i2 = 0;
        }
        this.f2077w.setVisibility(i2);
        s();
    }

    public SearchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.watchfacestudio.huasi_urx110.R.attr.searchViewStyle);
    }

    public SearchView(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f2080z = new android.graphics.Rect();
        this.f2045A = new android.graphics.Rect();
        this.f2046B = new int[2];
        this.f2047C = new int[2];
        this.f2068h0 = new h.S(this, 0);
        this.f2069i0 = new h.S(this, 1);
        this.f2070j0 = new java.util.WeakHashMap();
        androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(this);
        androidx.appcompat.widget.b bVar = new androidx.appcompat.widget.b(this);
        h.V v2 = new h.V(this);
        h.W w2 = new h.W(this);
        h.C0136E c0136e = new h.C0136E(1, this);
        h.Q q2 = new h.Q(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.AbstractC0095a.f2548q, i2, 0);
        I0.b bVar2 = new I0.b(context, obtainStyledAttributes);
        android.view.LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, com.watchfacestudio.huasi_urx110.R.layout.abc_search_view), (android.view.ViewGroup) this, true);
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = (androidx.appcompat.widget.SearchView.SearchAutoComplete) findViewById(com.watchfacestudio.huasi_urx110.R.id.search_src_text);
        this.f2071p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f2072q = findViewById(com.watchfacestudio.huasi_urx110.R.id.search_edit_frame);
        android.view.View findViewById = findViewById(com.watchfacestudio.huasi_urx110.R.id.search_plate);
        this.f2073r = findViewById;
        android.view.View findViewById2 = findViewById(com.watchfacestudio.huasi_urx110.R.id.submit_area);
        this.f2074s = findViewById2;
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.watchfacestudio.huasi_urx110.R.id.search_button);
        this.t = imageView;
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.watchfacestudio.huasi_urx110.R.id.search_go_btn);
        this.f2075u = imageView2;
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById(com.watchfacestudio.huasi_urx110.R.id.search_close_btn);
        this.f2076v = imageView3;
        android.widget.ImageView imageView4 = (android.widget.ImageView) findViewById(com.watchfacestudio.huasi_urx110.R.id.search_voice_btn);
        this.f2077w = imageView4;
        android.widget.ImageView imageView5 = (android.widget.ImageView) findViewById(com.watchfacestudio.huasi_urx110.R.id.search_mag_icon);
        this.f2048D = imageView5;
        android.graphics.drawable.Drawable A2 = bVar2.A(10);
        java.lang.reflect.Field field = y.x.f8478a;
        findViewById.setBackground(A2);
        findViewById2.setBackground(bVar2.A(14));
        imageView.setImageDrawable(bVar2.A(13));
        imageView2.setImageDrawable(bVar2.A(7));
        imageView3.setImageDrawable(bVar2.A(4));
        imageView4.setImageDrawable(bVar2.A(16));
        imageView5.setImageDrawable(bVar2.A(13));
        this.f2049E = bVar2.A(12);
        u0.AbstractC0995a.z(imageView, getResources().getString(com.watchfacestudio.huasi_urx110.R.string.abc_searchview_description_search));
        this.f2050F = obtainStyledAttributes.getResourceId(15, com.watchfacestudio.huasi_urx110.R.layout.abc_search_dropdown_item_icons_2line);
        this.G = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(q2);
        searchAutoComplete.setOnEditorActionListener(v2);
        searchAutoComplete.setOnItemClickListener(w2);
        searchAutoComplete.setOnItemSelectedListener(c0136e);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new h.T(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f2053J = obtainStyledAttributes.getText(6);
        this.f2060U = obtainStyledAttributes.getText(11);
        int i3 = obtainStyledAttributes.getInt(3, -1);
        if (i3 != -1) {
            setImeOptions(i3);
        }
        int i4 = obtainStyledAttributes.getInt(2, -1);
        if (i4 != -1) {
            setInputType(i4);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        bVar2.K();
        android.content.Intent intent = new android.content.Intent("android.speech.action.WEB_SEARCH");
        this.f2051H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        android.content.Intent intent2 = new android.content.Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f2052I = intent2;
        intent2.addFlags(268435456);
        android.view.View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f2078x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new h.U(this));
        }
        u(this.f2056Q);
        r();
    }

    public void setOnCloseListener(h.X x2) {
    }

    public void setOnQueryTextListener(h.Y y2) {
    }

    public void setOnSuggestionListener(h.Z z2) {
    }
}
