package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p086m.AbstractC0925b;

/* JADX INFO: renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0619h extends AbstractViewOnTouchListenerC0634o0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f8625A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ View f8626B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0619h(View view, View view2, int i7) {
        super(view2);
        this.f8625A = i7;
        this.f8626B = view;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0634o0
    public final p086m.B b() {
        C0613e c0613e;
        switch (this.f8625A) {
            case 0:
                C0613e c0613e2 = ((C0621i) this.f8626B).f8633d.f8646J;
                if (c0613e2 == null) {
                    return null;
                }
                return c0613e2.a();
            case 1:
                return ((ActivityChooserView) this.f8626B).getListPopupWindow();
            default:
                AbstractC0925b abstractC0925b = ((ActionMenuItemView) this.f8626B).f8147D;
                if (abstractC0925b == null || (c0613e = ((C0615f) abstractC0925b).f8619a.f8647K) == null) {
                    return null;
                }
                return c0613e.a();
        }
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0634o0
    public final boolean c() {
        p086m.B b7;
        switch (this.f8625A) {
            case 0:
                ((C0621i) this.f8626B).f8633d.l();
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
                p086m.j jVar = actionMenuItemView.f8145B;
                return jVar != null && jVar.b(actionMenuItemView.f8153y) && (b7 = b()) != null && b7.b();
        }
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0634o0
    public boolean d() {
        switch (this.f8625A) {
            case 0:
                C0623j c0623j = ((C0621i) this.f8626B).f8633d;
                if (c0623j.f8648L != null) {
                    return false;
                }
                c0623j.h();
                return true;
            case 1:
                ((ActivityChooserView) this.f8626B).a();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0619h(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f8625A = 2;
        this.f8626B = actionMenuItemView;
    }
}
