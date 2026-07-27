package l;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.chickyneer.roadway.R;

/* loaded from: classes.dex */
public final class T implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f10817a;

    public T(SearchView searchView) {
        this.f10817a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i6, int i7, int i8, int i9, int i10, int i11) {
        SearchView searchView = this.f10817a;
        View view2 = searchView.f4211x;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f4205r.getPaddingLeft();
            Rect rect = new Rect();
            boolean a6 = t0.a(searchView);
            int dimensionPixelSize = searchView.f4187T ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f4203p;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            searchAutoComplete.setDropDownHorizontalOffset(a6 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
