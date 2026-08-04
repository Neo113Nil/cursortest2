package androidx.appcompat.widget;

import L5.ViewOnLayoutChangeListenerC0324c;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.customview.view.AbsSavedState;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements p078l.c {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final android.support.v4.media.session.t f8415x0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final SearchAutoComplete f8416G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final View f8417H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final View f8418I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final View f8419J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final ImageView f8420K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final ImageView f8421L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final ImageView f8422M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final ImageView f8423N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final View f8424O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public S0 f8425P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final Rect f8426Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final Rect f8427R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final int[] f8428S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final int[] f8429T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final ImageView f8430U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final Drawable f8431V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final int f8432W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f8433a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Intent f8434b0;
    public final Intent c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final CharSequence f8435d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public View.OnFocusChangeListener f8436e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public View.OnClickListener f8437f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f8438g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f8439h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Y.c f8440i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f8441j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public CharSequence f8442k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f8443l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f8444m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f8445n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f8446o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CharSequence f8447p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f8448q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f8449r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public SearchableInfo f8450s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Bundle f8451t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final H0 f8452u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final H0 f8453v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final WeakHashMap f8454w0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Q0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f8455c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8455c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f8455c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeValue(Boolean.valueOf(this.f8455c));
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SearchView f8457f;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f8458x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final R0 f8459y;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i7 = configuration.screenWidthDp;
            int i8 = configuration.screenHeightDp;
            if (i7 >= 960 && i8 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i7 < 600) {
                return (i7 < 640 || i8 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                M0.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            android.support.v4.media.session.t tVar = SearchView.f8415x0;
            tVar.getClass();
            android.support.v4.media.session.t.s0();
            Method method = (Method) tVar.f8078d;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f8456e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f8458x) {
                R0 r7 = this.f8459y;
                removeCallbacks(r7);
                post(r7);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z4, int i7, Rect rect) {
            super.onFocusChanged(z4, i7, rect);
            SearchView searchView = this.f8457f;
            searchView.x(searchView.f8439h0);
            searchView.post(searchView.f8452u0);
            if (searchView.f8416G.hasFocus()) {
                searchView.m();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
            if (i7 == 4) {
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
                        this.f8457f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i7, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z4) {
            super.onWindowFocusChanged(z4);
            if (z4 && this.f8457f.hasFocus() && getVisibility() == 0) {
                this.f8458x = true;
                Context context = getContext();
                android.support.v4.media.session.t tVar = SearchView.f8415x0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z4) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            R0 r7 = this.f8459y;
            if (!z4) {
                this.f8458x = false;
                removeCallbacks(r7);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f8458x = true;
                    return;
                }
                this.f8458x = false;
                removeCallbacks(r7);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f8457f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i7) {
            super.setThreshold(i7);
            this.f8456e = i7;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i7) {
            super(context, attributeSet, i7);
            this.f8459y = new R0(this);
            this.f8456e = getThreshold();
        }
    }

    static {
        android.support.v4.media.session.t tVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            android.support.v4.media.session.t tVar2 = new android.support.v4.media.session.t(16, false);
            tVar2.f8076b = null;
            tVar2.f8077c = null;
            tVar2.f8078d = null;
            android.support.v4.media.session.t.s0();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                tVar2.f8076b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                tVar2.f8077c = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                tVar2.f8078d = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            tVar = tVar2;
        }
        f8415x0 = tVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f8416G;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // p078l.c
    public final void c() {
        if (this.f8448q0) {
            return;
        }
        this.f8448q0 = true;
        SearchAutoComplete searchAutoComplete = this.f8416G;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f8449r0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f8444m0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f8416G;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f8444m0 = false;
    }

    @Override // p078l.c
    public final void d() {
        SearchAutoComplete searchAutoComplete = this.f8416G;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f8447p0 = "";
        clearFocus();
        x(true);
        searchAutoComplete.setImeOptions(this.f8449r0);
        this.f8448q0 = false;
    }

    public int getImeOptions() {
        return this.f8416G.getImeOptions();
    }

    public int getInputType() {
        return this.f8416G.getInputType();
    }

    public int getMaxWidth() {
        return this.f8445n0;
    }

    public CharSequence getQuery() {
        return this.f8416G.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f8442k0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f8450s0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f8435d0 : getContext().getText(this.f8450s0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f8433a0;
    }

    public int getSuggestionRowLayout() {
        return this.f8432W;
    }

    public Y.c getSuggestionsAdapter() {
        return this.f8440i0;
    }

    public final Intent k(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f8447p0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f8451t0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f8450s0.getSearchActivity());
        return intent;
    }

    public final Intent l(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f8451t0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
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

    public final void m() {
        int i7 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f8416G;
        if (i7 >= 29) {
            M0.a(searchAutoComplete);
            return;
        }
        android.support.v4.media.session.t tVar = f8415x0;
        tVar.getClass();
        android.support.v4.media.session.t.s0();
        Method method = (Method) tVar.f8076b;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        tVar.getClass();
        android.support.v4.media.session.t.s0();
        Method method2 = (Method) tVar.f8077c;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void n() {
        SearchAutoComplete searchAutoComplete = this.f8416G;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f8438g0) {
            clearFocus();
            x(true);
        }
    }

    public final void o(int i7) {
        int position;
        String strH;
        Cursor cursor = this.f8440i0.f7640c;
        if (cursor != null && cursor.moveToPosition(i7)) {
            Intent intentK = null;
            try {
                int i8 = U0.f8556O;
                String strH2 = U0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strH2 == null) {
                    strH2 = this.f8450s0.getSuggestIntentAction();
                }
                if (strH2 == null) {
                    strH2 = "android.intent.action.SEARCH";
                }
                String strH3 = U0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strH3 == null) {
                    strH3 = this.f8450s0.getSuggestIntentData();
                }
                if (strH3 != null && (strH = U0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strH3 = strH3 + "/" + Uri.encode(strH);
                }
                intentK = k(strH3 == null ? null : Uri.parse(strH3), strH2, U0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), U0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e7) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e7);
            }
            if (intentK != null) {
                try {
                    getContext().startActivity(intentK);
                } catch (RuntimeException e8) {
                    Log.e("SearchView", "Failed launch activity: " + intentK, e8);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f8416G;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f8452u0);
        post(this.f8453v0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        super.onLayout(z4, i7, i8, i9, i10);
        if (z4) {
            int[] iArr = this.f8428S;
            SearchAutoComplete searchAutoComplete = this.f8416G;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f8429T;
            getLocationInWindow(iArr2);
            int i11 = iArr[1] - iArr2[1];
            int i12 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i12;
            int height = searchAutoComplete.getHeight() + i11;
            Rect rect = this.f8426Q;
            rect.set(i12, i11, width, height);
            int i13 = rect.left;
            int i14 = rect.right;
            int i15 = i10 - i8;
            Rect rect2 = this.f8427R;
            rect2.set(i13, 0, i14, i15);
            S0 s7 = this.f8425P;
            if (s7 == null) {
                S0 s8 = new S0(rect2, rect, searchAutoComplete);
                this.f8425P = s8;
                setTouchDelegate(s8);
            } else {
                s7.f8410b.set(rect2);
                Rect rect3 = s7.f8412d;
                rect3.set(rect2);
                int i16 = -s7.f8413e;
                rect3.inset(i16, i16);
                s7.f8411c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        if (this.f8439h0) {
            super.onMeasure(i7, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode == Integer.MIN_VALUE) {
            int i10 = this.f8445n0;
            size = i10 > 0 ? Math.min(i10, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f8445n0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i9 = this.f8445n0) > 0) {
            size = Math.min(i9, size);
        }
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f9102a);
        x(savedState.f8455c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f8455c = this.f8439h0;
        return savedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        post(this.f8452u0);
    }

    public final void p(int i7) {
        Editable text = this.f8416G.getText();
        Cursor cursor = this.f8440i0.f7640c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i7)) {
            setQuery(text);
            return;
        }
        String strC = this.f8440i0.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    public final void q(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void r() {
        SearchAutoComplete searchAutoComplete = this.f8416G;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f8450s0 != null) {
            getContext().startActivity(k(null, "android.intent.action.SEARCH", null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i7, Rect rect) {
        if (this.f8444m0 || !isFocusable()) {
            return false;
        }
        if (this.f8439h0) {
            return super.requestFocus(i7, rect);
        }
        boolean zRequestFocus = this.f8416G.requestFocus(i7, rect);
        if (zRequestFocus) {
            x(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f8416G.getText());
        int i7 = (!zIsEmpty || (this.f8438g0 && !this.f8448q0)) ? 0 : 8;
        ImageView imageView = this.f8422M;
        imageView.setVisibility(i7);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f8451t0 = bundle;
    }

    public void setIconified(boolean z4) {
        if (z4) {
            n();
            return;
        }
        x(false);
        SearchAutoComplete searchAutoComplete = this.f8416G;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f8437f0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z4) {
        if (this.f8438g0 == z4) {
            return;
        }
        this.f8438g0 = z4;
        x(z4);
        u();
    }

    public void setImeOptions(int i7) {
        this.f8416G.setImeOptions(i7);
    }

    public void setInputType(int i7) {
        this.f8416G.setInputType(i7);
    }

    public void setMaxWidth(int i7) {
        this.f8445n0 = i7;
        requestLayout();
    }

    public void setOnCloseListener(N0 n2) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f8436e0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(O0 o7) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f8437f0 = onClickListener;
    }

    public void setOnSuggestionListener(P0 p5) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f8442k0 = charSequence;
        u();
    }

    public void setQueryRefinementEnabled(boolean z4) {
        this.f8443l0 = z4;
        Y.c cVar = this.f8440i0;
        if (cVar instanceof U0) {
            ((U0) cVar).f8563G = z4 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f8450s0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f8416G;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f8450s0.getImeOptions());
            int inputType = this.f8450s0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f8450s0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            Y.c cVar = this.f8440i0;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.f8450s0.getSuggestAuthority() != null) {
                U0 u4 = new U0(getContext(), this, this.f8450s0, this.f8454w0);
                this.f8440i0 = u4;
                searchAutoComplete.setAdapter(u4);
                ((U0) this.f8440i0).f8563G = this.f8443l0 ? 2 : 1;
            }
            u();
        }
        SearchableInfo searchableInfo2 = this.f8450s0;
        boolean z4 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f8450s0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f8434b0;
            } else if (this.f8450s0.getVoiceSearchLaunchRecognizer()) {
                intent = this.c0;
            }
            if (intent != null) {
                z4 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f8446o0 = z4;
        if (z4) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        x(this.f8439h0);
    }

    public void setSubmitButtonEnabled(boolean z4) {
        this.f8441j0 = z4;
        x(this.f8439h0);
    }

    public void setSuggestionsAdapter(Y.c cVar) {
        this.f8440i0 = cVar;
        this.f8416G.setAdapter(cVar);
    }

    public final void t() {
        int[] iArr = this.f8416G.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f8418I.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f8419J.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void u() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z4 = this.f8438g0;
        SearchAutoComplete searchAutoComplete = this.f8416G;
        CharSequence charSequence2 = charSequence;
        if (z4 && (drawable = this.f8431V) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    public final void v() {
        this.f8419J.setVisibility(((this.f8441j0 || this.f8446o0) && !this.f8439h0 && (this.f8421L.getVisibility() == 0 || this.f8423N.getVisibility() == 0)) ? 0 : 8);
    }

    public final void w(boolean z4) {
        boolean z7 = this.f8441j0;
        this.f8421L.setVisibility((!z7 || !(z7 || this.f8446o0) || this.f8439h0 || !hasFocus() || (!z4 && this.f8446o0)) ? 8 : 0);
    }

    public final void x(boolean z4) {
        this.f8439h0 = z4;
        int i7 = 8;
        int i8 = z4 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f8416G.getText());
        this.f8420K.setVisibility(i8);
        w(!zIsEmpty);
        this.f8417H.setVisibility(z4 ? 8 : 0);
        ImageView imageView = this.f8430U;
        imageView.setVisibility((imageView.getDrawable() == null || this.f8438g0) ? 8 : 0);
        s();
        if (this.f8446o0 && !this.f8439h0 && zIsEmpty) {
            this.f8421L.setVisibility(8);
            i7 = 0;
        }
        this.f8423N.setVisibility(i7);
        v();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8426Q = new Rect();
        this.f8427R = new Rect();
        this.f8428S = new int[2];
        this.f8429T = new int[2];
        this.f8452u0 = new H0(this, 0);
        this.f8453v0 = new H0(this, 1);
        this.f8454w0 = new WeakHashMap();
        J0 j3 = new J0(this);
        K0 k7 = new K0(this);
        L0 l7 = new L0(this);
        G g3 = new G(this, 1);
        C0638q0 c0638q0 = new C0638q0(this, 1);
        G0 g7 = new G0(this);
        int[] iArr = p051h.a.f13349v;
        C1017n0 c1017n0F = C1017n0.F(context, attributeSet, iArr, i7);
        P.U.g(this, context, iArr, attributeSet, (TypedArray) c1017n0F.f17812c, i7);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArray = (TypedArray) c1017n0F.f17812c;
        layoutInflaterFrom.inflate(typedArray.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f8416G = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f8417H = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f8418I = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f8419J = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f8420K = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f8421L = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f8422M = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f8423N = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f8430U = imageView5;
        viewFindViewById.setBackground(c1017n0F.u(10));
        viewFindViewById2.setBackground(c1017n0F.u(14));
        imageView.setImageDrawable(c1017n0F.u(13));
        imageView2.setImageDrawable(c1017n0F.u(7));
        imageView3.setImageDrawable(c1017n0F.u(4));
        imageView4.setImageDrawable(c1017n0F.u(16));
        imageView5.setImageDrawable(c1017n0F.u(13));
        this.f8431V = c1017n0F.u(12);
        P6.b.I(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f8432W = typedArray.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f8433a0 = typedArray.getResourceId(5, 0);
        imageView.setOnClickListener(j3);
        imageView3.setOnClickListener(j3);
        imageView2.setOnClickListener(j3);
        imageView4.setOnClickListener(j3);
        searchAutoComplete.setOnClickListener(j3);
        searchAutoComplete.addTextChangedListener(g7);
        searchAutoComplete.setOnEditorActionListener(l7);
        searchAutoComplete.setOnItemClickListener(g3);
        searchAutoComplete.setOnItemSelectedListener(c0638q0);
        searchAutoComplete.setOnKeyListener(k7);
        searchAutoComplete.setOnFocusChangeListener(new I0(this));
        setIconifiedByDefault(typedArray.getBoolean(8, true));
        int dimensionPixelSize = typedArray.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f8435d0 = typedArray.getText(6);
        this.f8442k0 = typedArray.getText(11);
        int i8 = typedArray.getInt(3, -1);
        if (i8 != -1) {
            setImeOptions(i8);
        }
        int i9 = typedArray.getInt(2, -1);
        if (i9 != -1) {
            setInputType(i9);
        }
        setFocusable(typedArray.getBoolean(0, true));
        c1017n0F.H();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f8434b0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.c0 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f8424O = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0324c(this, 1));
        }
        x(this.f8438g0);
        u();
    }
}
