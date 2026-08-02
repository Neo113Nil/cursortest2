package org.betup.ui.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.List;
import org.betup.R;

/* loaded from: classes4.dex */
public class CustomPopupMenu<T> {
    private Activity activity;
    private List<MenuItem<T>> items;
    private MenuItemSelectedListener<T> listener;
    private int maxWidth;
    private MenuAdapter menuAdapter;
    private ListPopupWindow popupWindow;

    public interface MenuItemSelectedListener<T> {
        void onMenuSelected(MenuItem<T> item);
    }

    public CustomPopupMenu(Activity activity, List<MenuItem<T>> items, MenuItemSelectedListener<T> listener) {
        this.activity = activity;
        this.items = items;
        this.listener = listener;
        this.menuAdapter = new MenuAdapter(activity, items);
        FrameLayout frameLayout = new FrameLayout(activity);
        for (int i = 0; i < items.size(); i++) {
            View view = this.menuAdapter.getView(i, null, frameLayout);
            view.measure(0, 0);
            int measuredWidth = view.getMeasuredWidth();
            Log.d("POPUPTEST", "MEASURED WIDTH = " + measuredWidth);
            if (this.maxWidth < measuredWidth) {
                this.maxWidth = measuredWidth;
            }
        }
    }

    public void show(View view) {
        if (isShowing()) {
            hide();
        }
        ListPopupWindow listPopupWindow = new ListPopupWindow(this.activity);
        this.popupWindow = listPopupWindow;
        listPopupWindow.setAdapter(this.menuAdapter);
        this.popupWindow.setAnchorView(view);
        this.popupWindow.setWidth(this.maxWidth);
        adjustGravity();
        this.popupWindow.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this.activity, R.color.colorPrimary)));
        this.popupWindow.setModal(true);
        this.popupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: org.betup.ui.views.CustomPopupMenu.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> parent, View view2, int position, long id) {
                if (CustomPopupMenu.this.isShowing()) {
                    CustomPopupMenu.this.popupWindow.dismiss();
                }
                MenuItem<T> menuItem = (MenuItem) CustomPopupMenu.this.items.get(position);
                if (CustomPopupMenu.this.listener != null) {
                    CustomPopupMenu.this.listener.onMenuSelected(menuItem);
                }
            }
        });
        this.popupWindow.show();
    }

    private void adjustGravity() {
        this.popupWindow.setDropDownGravity(48);
    }

    public boolean isShowing() {
        ListPopupWindow listPopupWindow = this.popupWindow;
        return listPopupWindow != null && listPopupWindow.isShowing();
    }

    public void hide() {
        ListPopupWindow listPopupWindow = this.popupWindow;
        if (listPopupWindow != null) {
            listPopupWindow.dismiss();
        }
        this.popupWindow = null;
    }

    public static class Builder<T> {
        private Activity activity;
        private List<MenuItem<T>> items = new ArrayList();
        private MenuItemSelectedListener<T> listener;

        public Builder(Activity activity) {
            this.activity = activity;
        }

        public Builder<T> addItem(MenuItem<T> menuItem) {
            this.items.add(menuItem);
            return this;
        }

        public Builder<T> addItem(int icon, int strRes, T tag) {
            this.items.add(new MenuItem<>(icon, strRes, tag));
            return this;
        }

        public Builder<T> setListener(MenuItemSelectedListener<T> listener) {
            this.listener = listener;
            return this;
        }

        public CustomPopupMenu<T> build() {
            return new CustomPopupMenu<>(this.activity, this.items, this.listener);
        }
    }

    public static class MenuItem<T> {
        private int icon;
        private int strRes;
        private T tag;

        public MenuItem(int icon, int strRes, T tag) {
            this.icon = icon;
            this.strRes = strRes;
            this.tag = tag;
        }

        public int getIcon() {
            return this.icon;
        }

        public int getStrRes() {
            return this.strRes;
        }

        public T getTag() {
            return this.tag;
        }
    }

    public static class MenuAdapter<T> extends BaseAdapter {
        private Context context;
        private List<MenuItem<T>> items;
        private LayoutInflater layoutInflater;

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        public MenuAdapter(Context context, List<MenuItem<T>> items) {
            this.context = context;
            this.items = items;
            this.layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.items.size();
        }

        @Override // android.widget.Adapter
        public MenuItem getItem(int position) {
            return this.items.get(position);
        }

        @Override // android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = this.layoutInflater.inflate(R.layout.popup_menu_item, parent, false);
            }
            MenuItem item = getItem(position);
            TextView textView = (TextView) convertView.findViewById(R.id.title);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.icon);
            textView.setText(this.context.getString(item.getStrRes()).toUpperCase());
            imageView.setImageResource(item.getIcon());
            return convertView;
        }
    }
}
