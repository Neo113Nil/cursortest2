package I;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o implements ActionMode.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final ActionMode.Callback f1241a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f1242b;

    /* renamed from: c, reason: collision with root package name */
    public Class f1243c;

    /* renamed from: d, reason: collision with root package name */
    public Method f1244d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1245e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1246f = false;

    public o(ActionMode.Callback callback, TextView textView) {
        this.f1241a = callback;
        this.f1242b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f1241a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f1241a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f1241a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        TextView textView = this.f1242b;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.f1246f) {
            this.f1246f = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f1243c = cls;
                this.f1244d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.f1245e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f1243c = null;
                this.f1244d = null;
                this.f1245e = false;
            }
        }
        try {
            Method declaredMethod = (this.f1245e && this.f1243c.isInstance(menu)) ? this.f1244d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null && context.checkSelfPermission(str) != 0) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i2);
                MenuItem add = menu.add(0, 0, i2 + 100, resolveInfo2.loadLabel(packageManager));
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f1241a.onPrepareActionMode(actionMode, menu);
    }
}
