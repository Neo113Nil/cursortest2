package h;

/* loaded from: classes.dex */
public final class U implements android.view.View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f3114a;

    public U(androidx.appcompat.widget.SearchView searchView) {
        this.f3114a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        androidx.appcompat.widget.SearchView searchView = this.f3114a;
        android.view.View view2 = searchView.f2078x;
        if (view2.getWidth() > 1) {
            android.content.res.Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f2073r.getPaddingLeft();
            android.graphics.Rect rect = new android.graphics.Rect();
            boolean a2 = h.t0.a(searchView);
            int dimensionPixelSize = searchView.f2056Q ? resources.getDimensionPixelSize(com.watchfacestudio.huasi_urx110.R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(com.watchfacestudio.huasi_urx110.R.dimen.abc_dropdownitem_icon_width) : 0;
            androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = searchView.f2071p;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            searchAutoComplete.setDropDownHorizontalOffset(a2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
