package androidx.fragment.app;

import B0.A0;
import a3.C4929c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class LayoutInflaterFactory2C5403y implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    final G f43178a;

    /* renamed from: androidx.fragment.app.y$a */
    final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O f43179a;

        a(O o11) {
            this.f43179a = o11;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            O o11 = this.f43179a;
            ComponentCallbacksC5392m k11 = o11.k();
            o11.l();
            f0.s((ViewGroup) k11.mView.getParent(), LayoutInflaterFactory2C5403y.this.f43178a).o();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    LayoutInflaterFactory2C5403y(G g10) {
        this.f43178a = g10;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        O v11;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        G g10 = this.f43178a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, g10);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Z2.a.f35340a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null && C5400v.b(context.getClassLoader(), attributeValue)) {
                int id2 = view != null ? view.getId() : 0;
                if (id2 == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                ComponentCallbacksC5392m f02 = resourceId != -1 ? g10.f0(resourceId) : null;
                if (f02 == null && string != null) {
                    f02 = g10.g0(string);
                }
                if (f02 == null && id2 != -1) {
                    f02 = g10.f0(id2);
                }
                if (f02 == null) {
                    f02 = g10.p0().a(context.getClassLoader(), attributeValue);
                    f02.mFromLayout = true;
                    f02.mFragmentId = resourceId != 0 ? resourceId : id2;
                    f02.mContainerId = id2;
                    f02.mTag = string;
                    f02.mInLayout = true;
                    f02.mFragmentManager = g10;
                    f02.mHost = g10.s0();
                    f02.onInflate(g10.s0().e(), attributeSet, f02.mSavedFragmentState);
                    v11 = g10.i(f02);
                    if (G.D0(2)) {
                        Log.v("FragmentManager", "Fragment " + f02 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (f02.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                    }
                    f02.mInLayout = true;
                    f02.mFragmentManager = g10;
                    f02.mHost = g10.s0();
                    f02.onInflate(g10.s0().e(), attributeSet, f02.mSavedFragmentState);
                    v11 = g10.v(f02);
                    if (G.D0(2)) {
                        Log.v("FragmentManager", "Retained Fragment " + f02 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C4929c.e(f02, viewGroup);
                f02.mContainer = viewGroup;
                v11.l();
                v11.j();
                View view2 = f02.mView;
                if (view2 == null) {
                    throw new IllegalStateException(A0.b("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (f02.mView.getTag() == null) {
                    f02.mView.setTag(string);
                }
                f02.mView.addOnAttachStateChangeListener(new a(v11));
                return f02.mView;
            }
        }
        return null;
    }
}
