package p086m;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15113a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f15114b;

    public f(g gVar) {
        this.f15114b = gVar;
        a();
    }

    public final void a() {
        k kVar = this.f15114b.f15117c;
        m mVar = kVar.f15141N;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f15128A;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((m) arrayList.get(i7)) == mVar) {
                    this.f15113a = i7;
                    return;
                }
            }
        }
        this.f15113a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i7) {
        g gVar = this.f15114b;
        k kVar = gVar.f15117c;
        kVar.i();
        ArrayList arrayList = kVar.f15128A;
        gVar.getClass();
        int i8 = this.f15113a;
        if (i8 >= 0 && i7 >= i8) {
            i7++;
        }
        return (m) arrayList.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        g gVar = this.f15114b;
        k kVar = gVar.f15117c;
        kVar.i();
        int size = kVar.f15128A.size();
        gVar.getClass();
        return this.f15113a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f15114b.f15116b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
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
