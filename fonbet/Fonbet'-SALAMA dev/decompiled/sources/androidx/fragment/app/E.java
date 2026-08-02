package androidx.fragment.app;

import W5.AbstractC0486a1;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.protocol.Request;
import j0.AbstractC1299a;
import k0.AbstractC1326d;
import k0.C1325c;
import k0.C1327e;

/* loaded from: classes.dex */
public final class E implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final Q f9323a;

    public E(Q q7) {
        this.f9323a = q7;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z4;
        V g3;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        Q q7 = this.f9323a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, q7);
        }
        if (!Request.JsonKeys.FRAGMENT.equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1299a.f14543a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z4 = AbstractComponentCallbacksC0722v.class.isAssignableFrom(J.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z4 = false;
            }
            if (z4) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC0722v C3 = resourceId != -1 ? q7.C(resourceId) : null;
                if (C3 == null && string != null) {
                    C3 = q7.D(string);
                }
                if (C3 == null && id != -1) {
                    C3 = q7.C(id);
                }
                if (C3 == null) {
                    J H7 = q7.H();
                    context.getClassLoader();
                    C3 = H7.a(attributeValue);
                    C3.f9508E = true;
                    C3.f9517N = resourceId != 0 ? resourceId : id;
                    C3.f9518O = id;
                    C3.f9519P = string;
                    C3.f9509F = true;
                    C3.f9513J = q7;
                    C0726z c0726z = q7.f9403v;
                    C3.f9514K = c0726z;
                    A a2 = c0726z.f9552b;
                    C3.f9524U = true;
                    if ((c0726z != null ? c0726z.f9551a : null) != null) {
                        C3.f9524U = true;
                    }
                    g3 = q7.a(C3);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + C3 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (C3.f9509F) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    C3.f9509F = true;
                    C3.f9513J = q7;
                    C0726z c0726z2 = q7.f9403v;
                    C3.f9514K = c0726z2;
                    A a4 = c0726z2.f9552b;
                    C3.f9524U = true;
                    if ((c0726z2 != null ? c0726z2.f9551a : null) != null) {
                        C3.f9524U = true;
                    }
                    g3 = q7.g(C3);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + C3 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C1325c c1325c = AbstractC1326d.f14656a;
                AbstractC1326d.b(new C1327e(C3, viewGroup, 0));
                AbstractC1326d.a(C3).getClass();
                C3.f9525V = viewGroup;
                g3.j();
                g3.i();
                throw new IllegalStateException(AbstractC0486a1.h("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }
}
