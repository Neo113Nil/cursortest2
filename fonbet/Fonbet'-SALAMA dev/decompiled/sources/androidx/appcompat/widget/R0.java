package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class R0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f8407a;

    public R0(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f8407a = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f8407a;
        if (searchAutoComplete.f8458x) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f8458x = false;
        }
    }
}
