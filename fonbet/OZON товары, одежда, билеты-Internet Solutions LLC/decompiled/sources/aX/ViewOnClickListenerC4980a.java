package aX;

import android.view.View;
import android.view.ViewGroup;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.domain.RoleInvitationCreatorContentVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.RoleInvitationCreatorViewModel;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.content.RoleInvitationCreatorContentView;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.views.UgcCountersImageBlockView;
import ru.ozon.uni.atoms.af.AtomAction;

/* renamed from: aX.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC4980a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f36509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36510c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f36511d;

    public /* synthetic */ ViewOnClickListenerC4980a(ViewGroup viewGroup, Object obj, Object obj2, int i11) {
        this.f36508a = i11;
        this.f36509b = viewGroup;
        this.f36510c = obj;
        this.f36511d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36508a) {
            case 0:
                UgcCountersImageBlockView.bind$lambda$3$lambda$2((UgcCountersImageBlockView) this.f36509b, (AtomAction) this.f36510c, (UgcCountersVO.Block.Images) this.f36511d, view);
                break;
            default:
                ((RoleInvitationCreatorContentView) this.f36509b).addInputRow((RoleInvitationCreatorContentVO) this.f36510c, (RoleInvitationCreatorViewModel) this.f36511d);
                break;
        }
    }
}
