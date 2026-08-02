package Ve;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.view.maps.ui.MapsAdapter;
import ru.ozon.app.android.account.orders.view.maps.ui.MapsViewHolder;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.MainDrawMajorScreenBg;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDayView;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarWeekLayout;
import ru.ozon.app.android.uploadPhotos.adapter.viewHolder.PhotoItemVH;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolder;

/* renamed from: Ve.n7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC4465n7 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31643b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31644c;

    public /* synthetic */ ViewOnClickListenerC4465n7(int i11, Object obj, Object obj2) {
        this.f31642a = i11;
        this.f31643b = obj;
        this.f31644c = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f31642a) {
            case 0:
                AbstractC4724w7 this$0 = (AbstractC4724w7) this.f31643b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ?? r32 = this$0.f32346a;
                if (r32 != 0) {
                    Object item = this.f31644c;
                    Intrinsics.checkNotNullExpressionValue(item, "item");
                    r32.invoke(item);
                    return;
                }
                return;
            case 1:
                CellHolder.lambda$6$lambda$0((CellHolder) this.f31643b, (CellView) this.f31644c, view);
                return;
            case 2:
                CalendarWeekLayout.setUpClickListener$lambda$9((CalendarDayView) this.f31643b, (CalendarWeekLayout) this.f31644c, view);
                return;
            case 3:
                MainDrawMajorScreenBg.bind$lambda$0((MainDrawMajorScreenVO.ProgressBlock) this.f31643b, (Function1) this.f31644c, view);
                return;
            case 4:
                MapsAdapter.onCreateViewHolder$lambda$1((MapsAdapter) this.f31643b, (MapsViewHolder) this.f31644c, view);
                return;
            case 5:
                ru.ozon.android.messenger.framework.navigation.controller.b bVar = ((ru.ozon.android.messenger.blocks.disclaimer.modal.c) this.f31643b).f85061a;
                if (bVar != null) {
                    bVar.q((ru.ozon.android.messenger.framework.navigation.action.a) this.f31644c);
                    return;
                } else {
                    Intrinsics.n("controller");
                    throw null;
                }
            default:
                PhotoItemVH.lambda$4$lambda$3$lambda$2((Function1) this.f31643b, (PhotoItemVH) this.f31644c, view);
                return;
        }
    }
}
