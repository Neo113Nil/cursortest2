package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.AbstractC1418b;
import m.InterfaceC1414B;

/* renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0640h extends AbstractViewOnTouchListenerC0655o0 {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f8625A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ View f8626B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0640h(View view, View view2, int i7) {
        super(view2);
        this.f8625A = i7;
        this.f8626B = view;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0655o0
    public final InterfaceC1414B b() {
        C0634e c0634e;
        switch (this.f8625A) {
            case 0:
                C0634e c0634e2 = ((C0642i) this.f8626B).f8633d.f8646J;
                if (c0634e2 == null) {
                    return null;
                }
                return c0634e2.a();
            case 1:
                return ((ActivityChooserView) this.f8626B).getListPopupWindow();
            default:
                AbstractC1418b abstractC1418b = ((ActionMenuItemView) this.f8626B).f8147D;
                if (abstractC1418b == null || (c0634e = ((C0636f) abstractC1418b).f8619a.f8647K) == null) {
                    return null;
                }
                return c0634e.a();
        }
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0655o0
    public final boolean c() {
        InterfaceC1414B b7;
        switch (this.f8625A) {
            case 0:
                ((C0642i) this.f8626B).f8633d.l();
                return true;
            case 1:
                ActivityChooserView activityChooserView = (ActivityChooserView) this.f8626B;
                if (activityChooserView.b() || !activityChooserView.f8248B) {
                    return true;
                }
                activityChooserView.f8249a.getClass();
                throw new IllegalStateException("No data model. Did you call #setDataModel?");
            default:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f8626B;
                m.j jVar = actionMenuItemView.f8145B;
                return jVar != null && jVar.b(actionMenuItemView.f8153y) && (b7 = b()) != null && b7.b();
        }
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0655o0
    public boolean d() {
        switch (this.f8625A) {
            case 0:
                C0644j c0644j = ((C0642i) this.f8626B).f8633d;
                if (c0644j.f8648L != null) {
                    return false;
                }
                c0644j.h();
                return true;
            case 1:
                ((ActivityChooserView) this.f8626B).a();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0640h(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f8625A = 2;
        this.f8626B = actionMenuItemView;
    }
}
