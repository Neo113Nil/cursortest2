package game.betting133.sports1xbet.aqua_viewmodels;

import a4.c;
import c4.AbstractC0542c;
import c4.InterfaceC0544e;

@InterfaceC0544e(c = "game.betting133.sports1xbet.aqua_viewmodels.AquaFixtureScheduleViewModel", f = "AquaFixtureScheduleViewModel.kt", l = {47}, m = "loadFixturemeansWindowFrame")
/* loaded from: classes.dex */
public final class AquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1 extends AbstractC0542c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AquaFixtureScheduleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1(AquaFixtureScheduleViewModel aquaFixtureScheduleViewModel, c<? super AquaFixtureScheduleViewModel$loadFixturemeansWindowFrame$1> cVar) {
        super(cVar);
        this.this$0 = aquaFixtureScheduleViewModel;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        Object loadFixturemeansWindowFrame;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadFixturemeansWindowFrame = this.this$0.loadFixturemeansWindowFrame(0, this);
        return loadFixturemeansWindowFrame;
    }
}
