package L5;

import W5.AbstractC0486a1;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.q1;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.util.HashMap;
import w1.C1759x1;

/* renamed from: L5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnLayoutChangeListenerC0324c implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4457b;

    public /* synthetic */ ViewOnLayoutChangeListenerC0324c(Object obj, int i7) {
        this.f4456a = i7;
        this.f4457b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        switch (this.f4456a) {
            case 0:
                int measuredHeight = view.getMeasuredHeight();
                C0325d c0325d = (C0325d) this.f4457b;
                if (measuredHeight != c0325d.f4459i) {
                    C1759x1 c1759x1 = c0325d.f4487b;
                    c1759x1.getClass();
                    HashMap hashMap = new HashMap();
                    AbstractC0486a1.m(c0325d.f4481a, hashMap, "adId", "eventName", "onFluidAdHeightChanged");
                    hashMap.put("height", Integer.valueOf(measuredHeight));
                    c1759x1.Q(hashMap);
                }
                c0325d.f4459i = measuredHeight;
                break;
            default:
                SearchView searchView = (SearchView) this.f4457b;
                View view2 = searchView.f8424O;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f8418I.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a2 = q1.a(searchView);
                    int dimensionPixelSize = searchView.f8438g0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f8416G;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(a2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    break;
                }
                break;
        }
    }
}
