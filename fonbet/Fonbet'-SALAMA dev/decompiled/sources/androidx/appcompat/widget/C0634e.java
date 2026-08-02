package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import m.SubMenuC1416D;

/* renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0634e extends m.v {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8615l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0644j f8616m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0634e(C0644j c0644j, Context context, m.k kVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, kVar, true);
        this.f8616m = c0644j;
        this.f15196f = 8388613;
        R4.c cVar = c0644j.f8650N;
        this.f15198h = cVar;
        m.s sVar = this.f15199i;
        if (sVar != null) {
            sVar.e(cVar);
        }
    }

    @Override // m.v
    public final void c() {
        switch (this.f8615l) {
            case 0:
                C0644j c0644j = this.f8616m;
                c0644j.f8647K = null;
                c0644j.getClass();
                super.c();
                break;
            default:
                C0644j c0644j2 = this.f8616m;
                m.k kVar = c0644j2.f8653c;
                if (kVar != null) {
                    kVar.c(true);
                }
                c0644j2.f8646J = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0634e(C0644j c0644j, Context context, SubMenuC1416D subMenuC1416D, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC1416D, false);
        this.f8616m = c0644j;
        if (!subMenuC1416D.f15060S.f()) {
            View view2 = c0644j.f8659z;
            this.f15195e = view2 == null ? (View) c0644j.f8658y : view2;
        }
        R4.c cVar = c0644j.f8650N;
        this.f15198h = cVar;
        m.s sVar = this.f15199i;
        if (sVar != null) {
            sVar.e(cVar);
        }
    }
}
