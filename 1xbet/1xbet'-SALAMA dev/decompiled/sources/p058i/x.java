package p058i;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class x implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f13804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f13806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f13807d;

    public x(View view, String str) {
        this.f13804a = view;
        this.f13805b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f13806c != null) {
            break;
        }
        View view2 = this.f13804a;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f13805b;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                StringBuilder sbK = k.k("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbK.append(view2.getClass());
                sbK.append(str);
                throw new IllegalStateException(sbK.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f13806c = method;
                    this.f13807d = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f13806c.invoke(this.f13807d, view);
        } catch (IllegalAccessException e7) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e7);
        } catch (InvocationTargetException e8) {
            throw new IllegalStateException("Could not execute method for android:onClick", e8);
        }
    }
}
