package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class b implements android.view.View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f2163a;

    public b(androidx.appcompat.widget.SearchView searchView) {
        this.f2163a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i2, android.view.KeyEvent keyEvent) {
        androidx.appcompat.widget.SearchView searchView = this.f2163a;
        if (searchView.f0 == null) {
            return false;
        }
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = searchView.f2071p;
        if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
            if (android.text.TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.h("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
        if (searchView.f0 == null || searchView.f2058S == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        }
        if (i2 == 66 || i2 == 84 || i2 == 61) {
            searchView.l(searchAutoComplete.getListSelection());
        } else {
            if (i2 != 21 && i2 != 22) {
                if (i2 != 19) {
                    return false;
                }
                searchAutoComplete.getListSelection();
                return false;
            }
            searchAutoComplete.setSelection(i2 == 21 ? 0 : searchAutoComplete.length());
            searchAutoComplete.setListSelection(0);
            searchAutoComplete.clearListSelection();
            java.lang.reflect.Method method = androidx.appcompat.widget.SearchView.k0.f1702c;
            if (method != null) {
                try {
                    method.invoke(searchAutoComplete, java.lang.Boolean.TRUE);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        return true;
    }
}
