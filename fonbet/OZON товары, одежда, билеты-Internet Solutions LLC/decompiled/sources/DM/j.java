package DM;

import qc.InterfaceC9019a;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;

/* loaded from: classes10.dex */
public final /* synthetic */ class j implements InterfaceC9019a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AviaSearchResultViewModel f6259a;

    public /* synthetic */ j(AviaSearchResultViewModel aviaSearchResultViewModel) {
        this.f6259a = aviaSearchResultViewModel;
    }

    @Override // qc.InterfaceC9019a
    public final void run() {
        AviaSearchResultViewModel.pollFlights$lambda$14(this.f6259a);
    }
}
