package l;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class T implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f9752a;

    public T(SearchView searchView) {
        this.f9752a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        SearchView searchView = this.f9752a;
        Editable text = searchView.f2009p.getText();
        searchView.f2002V = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.t(!isEmpty);
        int i6 = 8;
        if (searchView.f2001U && !searchView.f1994N && isEmpty) {
            searchView.f2014u.setVisibility(8);
            i6 = 0;
        }
        searchView.f2016w.setVisibility(i6);
        searchView.p();
        searchView.s();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
    }
}
