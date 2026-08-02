package G4;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.C5305a;
import androidx.preference.Preference;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.RecyclerView;
import y2.q;

@Deprecated
/* loaded from: classes8.dex */
public final class e extends A {

    /* renamed from: c, reason: collision with root package name */
    final RecyclerView f9696c;

    /* renamed from: d, reason: collision with root package name */
    final A.a f9697d;

    /* renamed from: e, reason: collision with root package name */
    final C5305a f9698e;

    final class a extends C5305a {
        a() {
        }

        @Override // androidx.core.view.C5305a
        public final void onInitializeAccessibilityNodeInfo(View view, q qVar) {
            Preference h11;
            e eVar = e.this;
            eVar.f9697d.onInitializeAccessibilityNodeInfo(view, qVar);
            RecyclerView recyclerView = eVar.f9696c;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            RecyclerView.g adapter = recyclerView.getAdapter();
            if ((adapter instanceof androidx.preference.d) && (h11 = ((androidx.preference.d) adapter).h(childAdapterPosition)) != null) {
                h11.M(qVar);
            }
        }

        @Override // androidx.core.view.C5305a
        public final boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            return e.this.f9697d.performAccessibilityAction(view, i11, bundle);
        }
    }

    public e(RecyclerView recyclerView) {
        super(recyclerView);
        this.f9697d = (A.a) super.a();
        this.f9698e = new a();
        this.f9696c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.A
    @NonNull
    public final C5305a a() {
        return this.f9698e;
    }
}
