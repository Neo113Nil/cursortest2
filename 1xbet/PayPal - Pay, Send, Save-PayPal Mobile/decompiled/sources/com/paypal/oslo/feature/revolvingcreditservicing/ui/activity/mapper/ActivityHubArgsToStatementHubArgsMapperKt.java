package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "toStatementHubArgs", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActivityHubArgsToStatementHubArgsMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs toStatementHubArgs(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHubArgs, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs(activityHubArgs.getCpi(), activityHubArgs.getCreditAccountId(), (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
