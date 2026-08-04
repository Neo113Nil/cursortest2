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

/* JADX INFO: loaded from: classes.dex */
public final class E implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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
        boolean zIsAssignableFrom;
        V vG;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        Q q7 = this.f9323a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, q7);
        }
        if (!Request.JsonKeys.FRAGMENT.equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p066j0.a.f14549a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = AbstractComponentCallbacksC0701v.class.isAssignableFrom(J.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701vC = resourceId != -1 ? q7.C(resourceId) : null;
                if (abstractComponentCallbacksC0701vC == null && string != null) {
                    abstractComponentCallbacksC0701vC = q7.D(string);
                }
                if (abstractComponentCallbacksC0701vC == null && id != -1) {
                    abstractComponentCallbacksC0701vC = q7.C(id);
                }
                if (abstractComponentCallbacksC0701vC == null) {
                    J jH = q7.H();
                    context.getClassLoader();
                    abstractComponentCallbacksC0701vC = jH.a(attributeValue);
                    abstractComponentCallbacksC0701vC.f9508E = true;
                    abstractComponentCallbacksC0701vC.f9517N = resourceId != 0 ? resourceId : id;
                    abstractComponentCallbacksC0701vC.f9518O = id;
                    abstractComponentCallbacksC0701vC.f9519P = string;
                    abstractComponentCallbacksC0701vC.f9509F = true;
                    abstractComponentCallbacksC0701vC.f9513J = q7;
                    C0705z c0705z = q7.f9403v;
                    abstractComponentCallbacksC0701vC.f9514K = c0705z;
                    A a2 = c0705z.f9552b;
                    abstractComponentCallbacksC0701vC.f9524U = true;
                    if ((c0705z != null ? c0705z.f9551a : null) != null) {
                        abstractComponentCallbacksC0701vC.f9524U = true;
                    }
                    vG = q7.a(abstractComponentCallbacksC0701vC);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0701vC + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (abstractComponentCallbacksC0701vC.f9509F) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    abstractComponentCallbacksC0701vC.f9509F = true;
                    abstractComponentCallbacksC0701vC.f9513J = q7;
                    C0705z c0705z2 = q7.f9403v;
                    abstractComponentCallbacksC0701vC.f9514K = c0705z2;
                    A a4 = c0705z2.f9552b;
                    abstractComponentCallbacksC0701vC.f9524U = true;
                    if ((c0705z2 != null ? c0705z2.f9551a : null) != null) {
                        abstractComponentCallbacksC0701vC.f9524U = true;
                    }
                    vG = q7.g(abstractComponentCallbacksC0701vC);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC0701vC + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                p071k0.c cVar = p071k0.d.f14662a;
                p071k0.d.b(new p071k0.e(abstractComponentCallbacksC0701vC, viewGroup, 0));
                p071k0.d.a(abstractComponentCallbacksC0701vC).getClass();
                abstractComponentCallbacksC0701vC.f9525V = viewGroup;
                vG.j();
                vG.i();
                throw new IllegalStateException(AbstractC0486a1.h("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }
}
