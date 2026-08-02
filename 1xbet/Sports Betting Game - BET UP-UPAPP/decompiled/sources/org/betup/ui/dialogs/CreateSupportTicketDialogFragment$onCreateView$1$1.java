package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateSupportTicketDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CreateSupportTicketDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ CreateSupportTicketDialogFragment this$0;

    CreateSupportTicketDialogFragment$onCreateView$1$1(CreateSupportTicketDialogFragment createSupportTicketDialogFragment) {
        this.this$0 = createSupportTicketDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        List list;
        List list2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1141740905, i, -1, "org.betup.ui.dialogs.CreateSupportTicketDialogFragment.onCreateView.<anonymous>.<anonymous> (CreateSupportTicketDialogFragment.kt:62)");
        }
        list = this.this$0.categories;
        List list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Pair) it.next()).getFirst());
        }
        ArrayList arrayList2 = arrayList;
        list2 = this.this$0.categories;
        List list4 = list2;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList3.add((String) ((Pair) it2.next()).getSecond());
        }
        ArrayList arrayList4 = arrayList3;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final CreateSupportTicketDialogFragment createSupportTicketDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.CreateSupportTicketDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = CreateSupportTicketDialogFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(CreateSupportTicketDialogFragment.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final CreateSupportTicketDialogFragment createSupportTicketDialogFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function2() { // from class: org.betup.ui.dialogs.CreateSupportTicketDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = CreateSupportTicketDialogFragment$onCreateView$1$1.invoke$lambda$5$lambda$4(CreateSupportTicketDialogFragment.this, (String) obj, (String) obj2);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        CreateSupportTicketDialogFragmentKt.CreateSupportTicketContent(arrayList2, arrayList4, function0, (Function2) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(CreateSupportTicketDialogFragment createSupportTicketDialogFragment) {
        createSupportTicketDialogFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(CreateSupportTicketDialogFragment createSupportTicketDialogFragment, String details, String categoryId) {
        Function2 function2;
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        function2 = createSupportTicketDialogFragment.onCreateTicket;
        if (function2 != null) {
            function2.invoke(details, categoryId);
        }
        createSupportTicketDialogFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
