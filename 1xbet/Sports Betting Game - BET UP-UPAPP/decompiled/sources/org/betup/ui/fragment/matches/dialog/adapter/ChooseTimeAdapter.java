package org.betup.ui.fragment.matches.dialog.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.util.ArrayList;
import org.betup.R;

/* loaded from: classes4.dex */
public class ChooseTimeAdapter extends BaseAdapter {
    private ArrayList<String> items;
    private Context mContext;

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder target;

        public ViewHolder_ViewBinding(ViewHolder target, View source) {
            this.target = target;
            target.text = (TextView) Utils.findRequiredViewAsType(source, R.id.name, "field 'text'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.target;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            viewHolder.text = null;
        }
    }

    public ChooseTimeAdapter(Context mContext, ArrayList<String> items) {
        this.mContext = mContext;
        this.items = items;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.items.size();
    }

    @Override // android.widget.Adapter
    public String getItem(int position) {
        return this.items.get(position);
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return this.items.get(position).hashCode();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        View inflate = ((Activity) this.mContext).getLayoutInflater().inflate(R.layout.item_time, parent, false);
        String item = getItem(position);
        ViewHolder viewHolder = new ViewHolder(inflate);
        viewHolder.text.setTextColor(-1);
        viewHolder.text.setText(item);
        return inflate;
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {
        View inflate = ((Activity) this.mContext).getLayoutInflater().inflate(R.layout.item_time, parent, false);
        new ViewHolder(inflate).text.setText(getItem(position));
        return inflate;
    }

    class ViewHolder {

        @BindView(R.id.name)
        TextView text;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
