package androidx.browser.browseractions;

@java.lang.Deprecated
/* loaded from: classes5.dex */
class BrowserActionsFallbackMenuAdapter extends android.widget.BaseAdapter {
    private final java.util.List<androidx.browser.browseractions.BrowserActionItem> Camera2StreamConfigurationMap;
    private final android.content.Context getHighSpeedVideoSizes;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    BrowserActionsFallbackMenuAdapter(java.util.List<androidx.browser.browseractions.BrowserActionItem> list, android.content.Context context) {
        this.Camera2StreamConfigurationMap = list;
        this.getHighSpeedVideoSizes = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.Camera2StreamConfigurationMap.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i) {
        return this.Camera2StreamConfigurationMap.get(i);
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        final androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter.ViewHolderItem viewHolderItem;
        androidx.browser.browseractions.BrowserActionItem browserActionItem = this.Camera2StreamConfigurationMap.get(i);
        if (view == null) {
            view = android.view.LayoutInflater.from(this.getHighSpeedVideoSizes).inflate(androidx.browser.R.layout.browser_actions_context_menu_row, (android.view.ViewGroup) null);
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(androidx.browser.R.id.browser_actions_menu_item_icon);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(androidx.browser.R.id.browser_actions_menu_item_text);
            if (imageView == null || textView == null) {
                throw new java.lang.IllegalStateException("Browser Actions fallback UI does not contain necessary Views.");
            }
            viewHolderItem = new androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter.ViewHolderItem(imageView, textView);
            view.setTag(viewHolderItem);
        } else {
            viewHolderItem = (androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter.ViewHolderItem) view.getTag();
        }
        final java.lang.String title = browserActionItem.getTitle();
        viewHolderItem.getHighSpeedVideoSizes.setText(title);
        if (browserActionItem.getIconId() != 0) {
            viewHolderItem.Camera2StreamConfigurationMap.setImageDrawable(androidx.core.content.res.ResourcesCompat.getDrawable(this.getHighSpeedVideoSizes.getResources(), browserActionItem.getIconId(), null));
            return view;
        }
        if (browserActionItem.getIconUri() != null) {
            final com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> loadBitmap = androidx.browser.browseractions.BrowserServiceFileProvider.loadBitmap(this.getHighSpeedVideoSizes.getContentResolver(), browserActionItem.getIconUri());
            loadBitmap.addListener(new java.lang.Runnable() { // from class: androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    android.graphics.Bitmap bitmap;
                    if (android.text.TextUtils.equals(title, viewHolderItem.getHighSpeedVideoSizes.getText())) {
                        try {
                            bitmap = (android.graphics.Bitmap) loadBitmap.get();
                        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
                            bitmap = null;
                        }
                        if (bitmap != null) {
                            viewHolderItem.Camera2StreamConfigurationMap.setVisibility(0);
                            viewHolderItem.Camera2StreamConfigurationMap.setImageBitmap(bitmap);
                        } else {
                            viewHolderItem.Camera2StreamConfigurationMap.setVisibility(4);
                            viewHolderItem.Camera2StreamConfigurationMap.setImageBitmap(null);
                        }
                    }
                }
            }, new java.util.concurrent.Executor() { // from class: androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter.2
                @Override // java.util.concurrent.Executor
                public void execute(java.lang.Runnable runnable) {
                    runnable.run();
                }
            });
            return view;
        }
        viewHolderItem.Camera2StreamConfigurationMap.setImageBitmap(null);
        viewHolderItem.Camera2StreamConfigurationMap.setVisibility(4);
        return view;
    }

    static class ViewHolderItem {
        final android.widget.ImageView Camera2StreamConfigurationMap;
        final android.widget.TextView getHighSpeedVideoSizes;

        ViewHolderItem(android.widget.ImageView imageView, android.widget.TextView textView) {
            this.Camera2StreamConfigurationMap = imageView;
            this.getHighSpeedVideoSizes = textView;
        }
    }
}
