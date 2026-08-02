package org.betup.ui.fragment.search;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.services.search.RecentSearchesService;
import org.betup.ui.fragment.search.compose.NewSearchContentKt;

/* compiled from: NewSearchFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NewSearchFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ NewSearchFragment this$0;

    NewSearchFragment$onCreateView$1$1(NewSearchFragment newSearchFragment) {
        this.this$0 = newSearchFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1820560382, i, -1, "org.betup.ui.fragment.search.NewSearchFragment.onCreateView.<anonymous>.<anonymous> (NewSearchFragment.kt:33)");
        }
        org.betup.ui.fragment.search.controller.SearchController searchController = this.this$0.getSearchController();
        RecentSearchesService recentSearchesService = this.this$0.getRecentSearchesService();
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final NewSearchFragment newSearchFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.search.NewSearchFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = NewSearchFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(NewSearchFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        NewSearchContentKt.NewSearchContent(searchController, recentSearchesService, (Function0) rememberedValue, false, null, composer, 0, 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(NewSearchFragment newSearchFragment) {
        newSearchFragment.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }
}
