package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.view.C5305a;
import androidx.core.view.Y;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class A extends C5305a {

    /* renamed from: a, reason: collision with root package name */
    final RecyclerView f44658a;

    /* renamed from: b, reason: collision with root package name */
    private final a f44659b;

    public static class a extends C5305a {

        /* renamed from: a, reason: collision with root package name */
        final A f44660a;

        /* renamed from: b, reason: collision with root package name */
        private WeakHashMap f44661b = new WeakHashMap();

        public a(@NonNull A a11) {
            this.f44660a = a11;
        }

        final C5305a a(View view) {
            return (C5305a) this.f44661b.remove(view);
        }

        final void b(View view) {
            C5305a e11 = Y.e(view);
            if (e11 == null || e11 == this) {
                return;
            }
            this.f44661b.put(view, e11);
        }

        @Override // androidx.core.view.C5305a
        public final boolean dispatchPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C5305a c5305a = (C5305a) this.f44661b.get(view);
            return c5305a != null ? c5305a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C5305a
        public final y2.r getAccessibilityNodeProvider(@NonNull View view) {
            C5305a c5305a = (C5305a) this.f44661b.get(view);
            return c5305a != null ? c5305a.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // androidx.core.view.C5305a
        public final void onInitializeAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C5305a c5305a = (C5305a) this.f44661b.get(view);
            if (c5305a != null) {
                c5305a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C5305a
        public final void onInitializeAccessibilityNodeInfo(View view, y2.q qVar) {
            A a11 = this.f44660a;
            if (!a11.f44658a.hasPendingAdapterUpdates()) {
                RecyclerView recyclerView = a11.f44658a;
                if (recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, qVar);
                    C5305a c5305a = (C5305a) this.f44661b.get(view);
                    if (c5305a != null) {
                        c5305a.onInitializeAccessibilityNodeInfo(view, qVar);
                        return;
                    } else {
                        super.onInitializeAccessibilityNodeInfo(view, qVar);
                        return;
                    }
                }
            }
            super.onInitializeAccessibilityNodeInfo(view, qVar);
        }

        @Override // androidx.core.view.C5305a
        public final void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C5305a c5305a = (C5305a) this.f44661b.get(view);
            if (c5305a != null) {
                c5305a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C5305a
        public final boolean onRequestSendAccessibilityEvent(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C5305a c5305a = (C5305a) this.f44661b.get(viewGroup);
            return c5305a != null ? c5305a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C5305a
        public final boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            A a11 = this.f44660a;
            if (!a11.f44658a.hasPendingAdapterUpdates()) {
                RecyclerView recyclerView = a11.f44658a;
                if (recyclerView.getLayoutManager() != null) {
                    C5305a c5305a = (C5305a) this.f44661b.get(view);
                    if (c5305a != null) {
                        if (c5305a.performAccessibilityAction(view, i11, bundle)) {
                            return true;
                        }
                    } else if (super.performAccessibilityAction(view, i11, bundle)) {
                        return true;
                    }
                    return recyclerView.getLayoutManager().performAccessibilityActionForItem(view, i11, bundle);
                }
            }
            return super.performAccessibilityAction(view, i11, bundle);
        }

        @Override // androidx.core.view.C5305a
        public final void sendAccessibilityEvent(@NonNull View view, int i11) {
            C5305a c5305a = (C5305a) this.f44661b.get(view);
            if (c5305a != null) {
                c5305a.sendAccessibilityEvent(view, i11);
            } else {
                super.sendAccessibilityEvent(view, i11);
            }
        }

        @Override // androidx.core.view.C5305a
        public final void sendAccessibilityEventUnchecked(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C5305a c5305a = (C5305a) this.f44661b.get(view);
            if (c5305a != null) {
                c5305a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public A(@NonNull RecyclerView recyclerView) {
        this.f44658a = recyclerView;
        C5305a a11 = a();
        if (a11 == null || !(a11 instanceof a)) {
            this.f44659b = new a(this);
        } else {
            this.f44659b = (a) a11;
        }
    }

    @NonNull
    public C5305a a() {
        return this.f44659b;
    }

    @Override // androidx.core.view.C5305a
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f44658a.hasPendingAdapterUpdates()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C5305a
    public final void onInitializeAccessibilityNodeInfo(View view, y2.q qVar) {
        super.onInitializeAccessibilityNodeInfo(view, qVar);
        RecyclerView recyclerView = this.f44658a;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(qVar);
    }

    @Override // androidx.core.view.C5305a
    public final boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
        if (super.performAccessibilityAction(view, i11, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f44658a;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().performAccessibilityAction(i11, bundle);
    }
}
