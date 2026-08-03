package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView.SearchAutoComplete f2164a;

    public c(androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete) {
        this.f2164a = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f2164a;
        if (searchAutoComplete.f2083f) {
            ((android.view.inputmethod.InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f2083f = false;
        }
    }
}
