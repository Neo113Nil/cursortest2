package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* loaded from: classes.dex */
public final class G0 implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f8351a;

    public G0(SearchView searchView) {
        this.f8351a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        SearchView searchView = this.f8351a;
        Editable text = searchView.f8416G.getText();
        searchView.f8447p0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.w(!isEmpty);
        int i10 = 8;
        if (searchView.f8446o0 && !searchView.f8439h0 && isEmpty) {
            searchView.f8421L.setVisibility(8);
            i10 = 0;
        }
        searchView.f8423N.setVisibility(i10);
        searchView.s();
        searchView.v();
        charSequence.toString();
    }
}
