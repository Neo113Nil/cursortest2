package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import com.salamadev.nabilalawadi.kisaskoran.R;

/* JADX INFO: renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0613e extends p086m.v {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8615l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0623j f8616m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0613e(C0623j c0623j, Context context, p086m.k kVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, kVar, true);
        this.f8616m = c0623j;
        this.f15202f = 8388613;
        R4.c cVar = c0623j.f8650N;
        this.f15204h = cVar;
        p086m.s sVar = this.f15205i;
        if (sVar != null) {
            sVar.e(cVar);
        }
    }

    @Override // p086m.v
    public final void c() {
        switch (this.f8615l) {
            case 0:
                C0623j c0623j = this.f8616m;
                c0623j.f8647K = null;
                c0623j.getClass();
                super.c();
                break;
            default:
                C0623j c0623j2 = this.f8616m;
                p086m.k kVar = c0623j2.f8653c;
                if (kVar != null) {
                    kVar.c(true);
                }
                c0623j2.f8646J = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0613e(C0623j c0623j, Context context, p086m.D d7, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, d7, false);
        this.f8616m = c0623j;
        if (!d7.f15066S.f()) {
            View view2 = c0623j.f8659z;
            this.f15201e = view2 == null ? (View) c0623j.f8658y : view2;
        }
        R4.c cVar = c0623j.f8650N;
        this.f15204h = cVar;
        p086m.s sVar = this.f15205i;
        if (sVar != null) {
            sVar.e(cVar);
        }
    }
}
