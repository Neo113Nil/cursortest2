package m;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.util.ArrayList;

/* renamed from: m.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1422f extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f15107a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1423g f15108b;

    public C1422f(C1423g c1423g) {
        this.f15108b = c1423g;
        a();
    }

    public final void a() {
        k kVar = this.f15108b.f15111c;
        m mVar = kVar.f15135N;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f15122A;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((m) arrayList.get(i7)) == mVar) {
                    this.f15107a = i7;
                    return;
                }
            }
        }
        this.f15107a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i7) {
        C1423g c1423g = this.f15108b;
        k kVar = c1423g.f15111c;
        kVar.i();
        ArrayList arrayList = kVar.f15122A;
        c1423g.getClass();
        int i8 = this.f15107a;
        if (i8 >= 0 && i7 >= i8) {
            i7++;
        }
        return (m) arrayList.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C1423g c1423g = this.f15108b;
        k kVar = c1423g.f15111c;
        kVar.i();
        int size = kVar.f15122A.size();
        c1423g.getClass();
        return this.f15107a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f15108b.f15110b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((y) view).a(getItem(i7));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
