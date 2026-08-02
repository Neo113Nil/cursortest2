package org.betup.ui.fragment.support;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.ui.dialogs.CreateSupportTicketDialogFragment;
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.fragment.support.controller.SupportController;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: SupportFragmentK.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J$\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/fragment/support/SupportFragmentK;", "Lorg/betup/ui/fragment/BaseFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/fragment/support/controller/SupportController;", "getController", "()Lorg/betup/ui/fragment/support/controller/SupportController;", "setController", "(Lorg/betup/ui/fragment/support/controller/SupportController;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "showCreateTicketDialog", "categoryIds", "", "", "categoryNames", VastTagName.COMPANION, "app_release", "uiState", "Lorg/betup/ui/fragment/support/compose/SupportUiState;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SupportFragmentK extends BaseFragment {
    private static final String ARG_CHAT_ID = "arg_chat_id";
    private static final String ARG_PREFILLED_MESSAGE = "prefilledMessage";
    private static final String ARG_PRESELECTED_TYPE_INDEX = "preselectedTypeIndex";
    private static final String ARG_TAB_INDEX = "tabIndex";

    @Inject
    public SupportController controller;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final SupportController getController() {
        SupportController supportController = this.controller;
        if (supportController != null) {
            return supportController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public final void setController(SupportController supportController) {
        Intrinsics.checkNotNullParameter(supportController, "<set-?>");
        this.controller = supportController;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Application application = requireActivity().getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) application).getComponent().inject(this);
        Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt(ARG_TAB_INDEX) : 0;
        Bundle arguments2 = getArguments();
        Integer valueOf = arguments2 != null ? Integer.valueOf(arguments2.getInt(ARG_PRESELECTED_TYPE_INDEX)) : null;
        Bundle arguments3 = getArguments();
        String string = arguments3 != null ? arguments3.getString(ARG_PREFILLED_MESSAGE) : null;
        Bundle arguments4 = getArguments();
        String string2 = arguments4 != null ? arguments4.getString(ARG_CHAT_ID) : null;
        SupportController controller = getController();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        controller.initialize(requireContext, valueOf, string);
        getController().setSelectedTab(i);
        if (string2 == null || string2.length() <= 0) {
            return;
        }
        getController().openTicket(string2);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-2022078659, true, new SupportFragmentK$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getController().destroy();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCreateTicketDialog(List<String> categoryIds, List<String> categoryNames) {
        if (categoryIds.isEmpty()) {
            return;
        }
        CreateSupportTicketDialogFragment newInstance = CreateSupportTicketDialogFragment.INSTANCE.newInstance(categoryIds, categoryNames);
        newInstance.setOnCreateTicket(new Function2() { // from class: org.betup.ui.fragment.support.SupportFragmentK$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit showCreateTicketDialog$lambda$2;
                showCreateTicketDialog$lambda$2 = SupportFragmentK.showCreateTicketDialog$lambda$2(SupportFragmentK.this, (String) obj, (String) obj2);
                return showCreateTicketDialog$lambda$2;
            }
        });
        newInstance.show(getChildFragmentManager(), "create_support_ticket");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCreateTicketDialog$lambda$2(SupportFragmentK supportFragmentK, String details, String categoryId) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        supportFragmentK.getController().createTicket(details, categoryId);
        return Unit.INSTANCE;
    }

    /* compiled from: SupportFragmentK.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/fragment/support/SupportFragmentK$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_TAB_INDEX", "", "ARG_PRESELECTED_TYPE_INDEX", "ARG_PREFILLED_MESSAGE", "ARG_CHAT_ID", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Landroidx/fragment/app/Fragment;", SupportFragmentK.ARG_TAB_INDEX, "", SupportFragmentK.ARG_PRESELECTED_TYPE_INDEX, SupportFragmentK.ARG_PREFILLED_MESSAGE, "chatId", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/Fragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ Fragment newInstance$default(Companion companion, int i, Integer num, String str, String str2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                num = null;
            }
            if ((i2 & 4) != 0) {
                str = null;
            }
            if ((i2 & 8) != 0) {
                str2 = null;
            }
            return companion.newInstance(i, num, str, str2);
        }

        public final Fragment newInstance(int tabIndex, Integer preselectedTypeIndex, String prefilledMessage, String chatId) {
            SupportFragmentK supportFragmentK = new SupportFragmentK();
            Bundle bundle = new Bundle();
            bundle.putInt(SupportFragmentK.ARG_TAB_INDEX, tabIndex);
            if (preselectedTypeIndex != null) {
                bundle.putInt(SupportFragmentK.ARG_PRESELECTED_TYPE_INDEX, preselectedTypeIndex.intValue());
            }
            if (prefilledMessage != null) {
                bundle.putString(SupportFragmentK.ARG_PREFILLED_MESSAGE, prefilledMessage);
            }
            if (chatId != null) {
                bundle.putString(SupportFragmentK.ARG_CHAT_ID, chatId);
            }
            supportFragmentK.setArguments(bundle);
            return supportFragmentK;
        }
    }
}
