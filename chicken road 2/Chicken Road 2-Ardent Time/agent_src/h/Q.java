package h;

/* loaded from: classes.dex */
public final class Q implements android.text.TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f3110a;

    public Q(androidx.appcompat.widget.SearchView searchView) {
        this.f3110a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i2, int i3, int i4) {
        androidx.appcompat.widget.SearchView searchView = this.f3110a;
        android.text.Editable text = searchView.f2071p.getText();
        searchView.f2065c0 = text;
        boolean isEmpty = android.text.TextUtils.isEmpty(text);
        searchView.t(!isEmpty);
        int i5 = 8;
        if (searchView.f2064b0 && !searchView.f2057R && isEmpty) {
            searchView.f2075u.setVisibility(8);
            i5 = 0;
        }
        searchView.f2077w.setVisibility(i5);
        searchView.p();
        searchView.s();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i2, int i3, int i4) {
    }
}
