package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class x implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f13798a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13799b;

    /* renamed from: c, reason: collision with root package name */
    public Method f13800c;

    /* renamed from: d, reason: collision with root package name */
    public Context f13801d;

    public x(View view, String str) {
        this.f13798a = view;
        this.f13799b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f13800c == null) {
            View view2 = this.f13798a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f13799b;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder k7 = e1.k.k("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    k7.append(view2.getClass());
                    k7.append(str);
                    throw new IllegalStateException(k7.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f13800c = method;
                        this.f13801d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f13800c.invoke(this.f13801d, view);
        } catch (IllegalAccessException e7) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e7);
        } catch (InvocationTargetException e8) {
            throw new IllegalStateException("Could not execute method for android:onClick", e8);
        }
    }
}
