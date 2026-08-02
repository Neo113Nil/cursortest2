package IK;

import U7.d;
import Ve.C4437m8;
import Ve.C4449mk;
import Ve.C4817zg;
import Ve.Mq;
import Ve.Z4;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.core.content.FileProvider;
import cd0.m;
import java.io.File;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.unsorted.widgets.iconButtons.presentation.IconButtonsVO;
import ru.ozon.app.android.fresh.unsorted.widgets.iconButtons.presentation.IconButtonsViewHolder;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.presentation.NpsRatingVO;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.presentation.NpsRatingViewHolder;
import ru.ozon.fintech.ui.input.InputInfoActionIconView;
import ru.ozon.fintech.ui.input.InputView;
import ru.ozon.id.nativeauth.data.models.b;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12098c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f12096a = i11;
        this.f12097b = obj;
        this.f12098c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f12096a) {
            case 0:
                NpsRatingViewHolder.bindButton$lambda$9$lambda$8((NpsRatingViewHolder) this.f12097b, (NpsRatingVO) this.f12098c, view);
                break;
            case 1:
                C4817zg this$0 = (C4817zg) this.f12097b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Z4 this_with = (Z4) this.f12098c;
                Intrinsics.checkNotNullParameter(this_with, "$this_with");
                ((C4449mk) this$0.u()).e0(new C4437m8(String.valueOf(this_with.f30562c.getText())));
                break;
            case 2:
                Mq this$02 = (Mq) this.f12097b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Dialog this_apply = (Dialog) this.f12098c;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this$02.getClass();
                Context context = this$02.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext()");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter("SDK_logs", "directory");
                File[] externalFilesDirs = androidx.core.content.a.getExternalFilesDirs(context, null);
                Intrinsics.checkNotNullExpressionValue(externalFilesDirs, "getExternalFilesDirs(context, null)");
                File file = new File((File) C7705l.F(externalFilesDirs), "SDK_logs");
                if (!file.exists()) {
                    file.mkdir();
                }
                File file2 = new File(file, "");
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.STREAM", FileProvider.d(this$02.requireContext(), d.e(this$02.requireContext().getApplicationContext().getPackageName(), ".fileprovider"), file2));
                this$02.startActivity(intent);
                this_apply.dismiss();
                break;
            case 3:
                m.t((m) this.f12097b, (b.c) this.f12098c);
                break;
            case 4:
                ru.ozon.android.inAppUpdate.internal.ui.a.u((ButtonV3View) this.f12097b, (ru.ozon.android.inAppUpdate.internal.ui.a) this.f12098c);
                break;
            case 5:
                InputView.infoIconView$lambda$22$lambda$21((InputInfoActionIconView) this.f12097b, (InputView) this.f12098c, view);
                break;
            default:
                IconButtonsViewHolder.addIconButton$lambda$3((IconButtonsViewHolder) this.f12097b, (IconButtonsVO.IconButton) this.f12098c, view);
                break;
        }
    }
}
