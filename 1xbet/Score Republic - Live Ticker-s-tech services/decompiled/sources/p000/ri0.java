package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import live.football.scorerepublic.R;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ri0 extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public int f6842a = -1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ si0 f6843b;

    public ri0(si0 si0Var) {
        this.f6843b = si0Var;
        m4351a();
    }

    /* JADX INFO: renamed from: a */
    public final void m4351a() {
        on0 on0Var = this.f6843b.f7121l;
        rn0 rn0Var = on0Var.f5796E;
        if (rn0Var != null) {
            on0Var.m3710i();
            ArrayList arrayList = on0Var.f5808s;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((rn0) arrayList.get(i)) == rn0Var) {
                    this.f6842a = i;
                    return;
                }
            }
        }
        this.f6842a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final rn0 getItem(int i) {
        si0 si0Var = this.f6843b;
        on0 on0Var = si0Var.f7121l;
        on0Var.m3710i();
        ArrayList arrayList = on0Var.f5808s;
        si0Var.getClass();
        int i2 = this.f6842a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (rn0) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        si0 si0Var = this.f6843b;
        on0 on0Var = si0Var.f7121l;
        on0Var.m3710i();
        int size = on0Var.f5808s.size();
        si0Var.getClass();
        return this.f6842a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f6843b.f7120k.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((fo0) view).mo329a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m4351a();
        super.notifyDataSetChanged();
    }
}
