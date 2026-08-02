package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: n7 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0497n7 implements View.OnClickListener {

    /* JADX INFO: renamed from: j */
    public final View f5312j;

    /* JADX INFO: renamed from: k */
    public final String f5313k;

    /* JADX INFO: renamed from: l */
    public Method f5314l;

    /* JADX INFO: renamed from: m */
    public Context f5315m;

    public ViewOnClickListenerC0497n7(View view, String str) {
        this.f5312j = view;
        this.f5313k = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f5314l != null) {
            break;
        }
        View view2 = this.f5312j;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f5313k;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f5314l = method;
                    this.f5315m = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f5314l.invoke(this.f5315m, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
