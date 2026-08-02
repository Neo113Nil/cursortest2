package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0028a;
import androidx.fragment.app.FragmentContainerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class i50 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: j */
    public final t50 f3437j;

    public i50(t50 t50Var) {
        this.f3437j = t50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0, types: [t50] */
    /* JADX WARN: Type inference failed for: r6v11, types: [c50] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v17, types: [c50] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [c50, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [c50, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        ?? M4698C;
        View view2;
        C0028a c0028aM4727g;
        ?? r6;
        c50 c50VarM4698C;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        ?? r5 = this.f3437j;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, r5);
        }
        View view3 = null;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kz0.f4611a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = c50.class.isAssignableFrom(n50.m3482b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    if (resourceId != -1) {
                        c50VarM4698C = r5.m4698C(resourceId);
                    } else {
                        M4698C = 0;
                    }
                    if (M4698C == 0 && string != null) {
                        f71 f71Var = r5.f7299c;
                        ArrayList arrayList = (ArrayList) f71Var.f2334k;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                view2 = view3;
                                Iterator it = ((HashMap) f71Var.f2335l).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        M4698C = view2;
                                        break;
                                    }
                                    C0028a c0028a = (C0028a) it.next();
                                    if (c0028a != null) {
                                        M4698C = c0028a.f537c;
                                        if (string.equals(M4698C.f1105I)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                c50 c50Var = (c50) arrayList.get(size);
                                view2 = view3;
                                if (c50Var != null && string.equals(c50Var.f1105I)) {
                                    M4698C = c50Var;
                                    break;
                                }
                                size--;
                                view3 = view2;
                            }
                        }
                    } else {
                        M4698C = c50VarM4698C;
                        view2 = null;
                    }
                    if (M4698C == 0 && id != -1) {
                        M4698C = r5.m4698C(id);
                    }
                    if (M4698C == 0) {
                        n50 n50VarM4701G = r5.m4701G();
                        context.getClassLoader();
                        c50 c50VarM3484a = n50VarM4701G.m3484a(attributeValue);
                        c50VarM3484a.f1140w = true;
                        c50VarM3484a.f1103G = resourceId != 0 ? resourceId : id;
                        c50VarM3484a.f1104H = id;
                        c50VarM3484a.f1105I = string;
                        c50VarM3484a.f1141x = true;
                        c50VarM3484a.f1099C = r5;
                        e50 e50Var = r5.f7319w;
                        c50VarM3484a.f1100D = e50Var;
                        AbstractActivityC0790v4 abstractActivityC0790v4 = e50Var.f1952o;
                        c50VarM3484a.f1110N = true;
                        if ((e50Var == null ? view2 : e50Var.f1951n) != null) {
                            c50VarM3484a.f1110N = true;
                        }
                        c0028aM4727g = r5.m4717a(c50VarM3484a);
                        r6 = c50VarM3484a;
                        if (t50.m4691J(2)) {
                            Log.v("FragmentManager", "Fragment " + c50VarM3484a + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                            r6 = c50VarM3484a;
                        }
                    } else {
                        if (M4698C.f1141x) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        M4698C.f1141x = true;
                        M4698C.f1099C = r5;
                        e50 e50Var2 = r5.f7319w;
                        M4698C.f1100D = e50Var2;
                        AbstractActivityC0790v4 abstractActivityC0790v5 = e50Var2.f1952o;
                        M4698C.f1110N = true;
                        if ((e50Var2 == null ? view2 : e50Var2.f1951n) != null) {
                            M4698C.f1110N = true;
                        }
                        c0028aM4727g = r5.m4727g(M4698C);
                        r6 = M4698C;
                        if (t50.m4691J(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + M4698C + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                            r6 = M4698C;
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    z50 z50Var = a60.f42a;
                    a60.m32b(new x50(r6, "Attempting to use <fragment> tag to add fragment " + r6 + " to container " + viewGroup));
                    a60.m31a(r6).getClass();
                    r6.f1111O = viewGroup;
                    c0028aM4727g.m427k();
                    c0028aM4727g.m426j();
                    View view4 = r6.f1112P;
                    if (view4 == null) {
                        C0270h1.m2191g(AbstractC0024an.m284g("Fragment ", attributeValue, " did not create a view."));
                        return view2;
                    }
                    if (resourceId != 0) {
                        view4.setId(resourceId);
                    }
                    if (r6.f1112P.getTag() == null) {
                        r6.f1112P.setTag(string);
                    }
                    r6.f1112P.addOnAttachStateChangeListener(new h50(this, c0028aM4727g));
                    return r6.f1112P;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
