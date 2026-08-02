package androidx.appcompat.widget;

import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public abstract class M0 {
    public static void a(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    public static void b(SearchView.SearchAutoComplete searchAutoComplete, int i7) {
        searchAutoComplete.setInputMethodMode(i7);
    }
}
