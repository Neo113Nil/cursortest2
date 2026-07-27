package l;

import android.content.Context;
import android.view.View;
import com.chicken.jump.road.pump.R;
import k.AbstractC1071l;
import k.C1073n;
import k.MenuC1069j;
import k.SubMenuC1079t;

/* renamed from: l.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1087f extends C1073n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9774l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1090i f9775m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1087f(C1090i c1090i, Context context, MenuC1069j menuC1069j, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC1069j, true);
        this.f9775m = c1090i;
        this.f = 8388613;
        io.flutter.plugin.editing.k kVar = c1090i.f9820v;
        this.f9633h = kVar;
        AbstractC1071l abstractC1071l = this.f9634i;
        if (abstractC1071l != null) {
            abstractC1071l.h(kVar);
        }
    }

    @Override // k.C1073n
    public final void c() {
        switch (this.f9774l) {
            case 0:
                C1090i c1090i = this.f9775m;
                c1090i.f9817s = null;
                c1090i.getClass();
                super.c();
                break;
            default:
                C1090i c1090i2 = this.f9775m;
                MenuC1069j menuC1069j = c1090i2.f9802c;
                if (menuC1069j != null) {
                    menuC1069j.c(true);
                }
                c1090i2.f9816r = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1087f(C1090i c1090i, Context context, SubMenuC1079t subMenuC1079t, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC1079t, false);
        this.f9775m = c1090i;
        if ((subMenuC1079t.f9656x.f9623x & 32) != 32) {
            View view2 = c1090i.f9806h;
            this.f9631e = view2 == null ? c1090i.f9805g : view2;
        }
        io.flutter.plugin.editing.k kVar = c1090i.f9820v;
        this.f9633h = kVar;
        AbstractC1071l abstractC1071l = this.f9634i;
        if (abstractC1071l != null) {
            abstractC1071l.h(kVar);
        }
    }
}
