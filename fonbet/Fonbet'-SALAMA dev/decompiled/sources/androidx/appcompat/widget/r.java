package androidx.appcompat.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;

/* loaded from: classes.dex */
public final class r extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityChooserView f8736a;

    public r(ActivityChooserView activityChooserView) {
        this.f8736a = activityChooserView;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        throw null;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        throw null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i7) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        ActivityChooserView activityChooserView = this.f8736a;
        if (view == null || view.getId() != R.id.list_item) {
            view = LayoutInflater.from(activityChooserView.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
        }
        activityChooserView.getContext().getPackageManager();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 3;
    }
}
