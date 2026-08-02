package com.paypal.oslo.feature.contacts.api;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JI\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH'¢\u0006\u0002\u0010\u0010JC\u0010\u0011\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH'¢\u0006\u0002\u0010\u0015J-\u0010\u0016\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH'¢\u0006\u0002\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/ContactsApi;", "", "PreSearchContactView", "", "config", "Lcom/paypal/oslo/feature/contacts/api/configs/PreSearchContactViewConfig;", "contacts", "", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent;", "payloadConfig", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsPayloadConfig;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/contacts/api/configs/PreSearchContactViewConfig;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/contacts/api/configs/ContactsPayloadConfig;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "ContactSearchScreen", "searchStrategy", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchStrategy;", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactSearchScreenConfig;", "(Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchStrategy;Lcom/paypal/oslo/feature/contacts/api/configs/ContactSearchScreenConfig;Lcom/paypal/oslo/feature/contacts/api/configs/ContactsPayloadConfig;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "SearchContactsButton", "onClickListener", "Lkotlin/Function0;", "placeholderText", "", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "contacts-api_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ContactsApi {
    void ContactSearchScreen(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent, kotlin.Unit> function1, com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy contactsSearchStrategy, com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig contactSearchScreenConfig, com.paypal.oslo.feature.contacts.api.configs.ContactsPayloadConfig contactsPayloadConfig, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i);

    void PreSearchContactView(com.paypal.oslo.feature.contacts.api.configs.PreSearchContactViewConfig preSearchContactViewConfig, java.util.List<? extends com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> list, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent, kotlin.Unit> function1, com.paypal.oslo.feature.contacts.api.configs.ContactsPayloadConfig contactsPayloadConfig, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i);

    void SearchContactsButton(kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class ComposeDefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void PreSearchContactView$default(final com.paypal.oslo.feature.contacts.api.configs.PreSearchContactViewConfig preSearchContactViewConfig, final java.util.List<? extends com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent, kotlin.Unit> function1, final com.paypal.oslo.feature.contacts.api.configs.ContactsPayloadConfig contactsPayloadConfig, androidx.compose.ui.Modifier modifier, final com.paypal.oslo.feature.contacts.api.ContactsApi contactsApi, androidx.compose.runtime.Composer composer, final int i, final int i2) {
            int i3;
            androidx.compose.ui.Modifier modifier2;
            final androidx.compose.ui.Modifier modifier3;
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preSearchContactViewConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsPayloadConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsApi, "");
            androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-49955870);
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(preSearchContactViewConfig) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(list) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(contactsPayloadConfig) ? 2048 : 1024;
            }
            int i4 = i2 & 16;
            if (i4 != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    i3 |= (262144 & i) == 0 ? startRestartGroup.changed(contactsApi) : startRestartGroup.changedInstance(contactsApi) ? 131072 : 65536;
                }
                if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-49955870, i3, -1, "com.paypal.oslo.feature.contacts.api.ContactsApi.ComposeDefaultImpls.PreSearchContactView$default (ContactsApi.kt:-1)");
                    }
                    contactsApi.PreSearchContactView(preSearchContactViewConfig, list, function1, contactsPayloadConfig, modifier4, startRestartGroup, i3 & 524286);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApi$ComposeDefaultImpls$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.contacts.api.ContactsApi.ComposeDefaultImpls.$r8$lambda$7eJeNTVnlYYVZr4GOv9RVKqi6O0(com.paypal.oslo.feature.contacts.api.configs.PreSearchContactViewConfig.this, list, function1, contactsPayloadConfig, modifier3, contactsApi, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((196608 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void ContactSearchScreen$default(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent, kotlin.Unit> function1, final com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy contactsSearchStrategy, final com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig contactSearchScreenConfig, final com.paypal.oslo.feature.contacts.api.configs.ContactsPayloadConfig contactsPayloadConfig, androidx.compose.ui.Modifier modifier, final com.paypal.oslo.feature.contacts.api.ContactsApi contactsApi, androidx.compose.runtime.Composer composer, final int i, final int i2) {
            int i3;
            androidx.compose.ui.Modifier modifier2;
            final androidx.compose.ui.Modifier modifier3;
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsSearchStrategy, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchScreenConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsPayloadConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsApi, "");
            androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1144705690);
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= (i & 64) == 0 ? startRestartGroup.changed(contactsSearchStrategy) : startRestartGroup.changedInstance(contactsSearchStrategy) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(contactSearchScreenConfig) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(contactsPayloadConfig) ? 2048 : 1024;
            }
            int i4 = i2 & 16;
            if (i4 != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    i3 |= (262144 & i) == 0 ? startRestartGroup.changed(contactsApi) : startRestartGroup.changedInstance(contactsApi) ? 131072 : 65536;
                }
                if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1144705690, i3, -1, "com.paypal.oslo.feature.contacts.api.ContactsApi.ComposeDefaultImpls.ContactSearchScreen$default (ContactsApi.kt:-1)");
                    }
                    contactsApi.ContactSearchScreen(function1, contactsSearchStrategy, contactSearchScreenConfig, contactsPayloadConfig, modifier4, startRestartGroup, i3 & 524286);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApi$ComposeDefaultImpls$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.contacts.api.ContactsApi.ComposeDefaultImpls.$r8$lambda$uTq6RQrts1WmCAWOAqX__ZmxeO8(kotlin.jvm.functions.Function1.this, contactsSearchStrategy, contactSearchScreenConfig, contactsPayloadConfig, modifier3, contactsApi, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((196608 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }

        public static final void SearchContactsButton$default(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final java.lang.String str, androidx.compose.ui.Modifier modifier, final com.paypal.oslo.feature.contacts.api.ContactsApi contactsApi, androidx.compose.runtime.Composer composer, final int i, final int i2) {
            int i3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsApi, "");
            androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1396733612);
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(str) ? 32 : 16;
            }
            int i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= (i & 4096) == 0 ? startRestartGroup.changed(contactsApi) : startRestartGroup.changedInstance(contactsApi) ? 2048 : 1024;
            }
            if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                if (i4 != 0) {
                    modifier = androidx.compose.ui.Modifier.INSTANCE;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1396733612, i3, -1, "com.paypal.oslo.feature.contacts.api.ContactsApi.ComposeDefaultImpls.SearchContactsButton$default (ContactsApi.kt:-1)");
                }
                contactsApi.SearchContactsButton(function0, str, modifier, startRestartGroup, i3 & 8190);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            final androidx.compose.ui.Modifier modifier2 = modifier;
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.contacts.api.ContactsApi$ComposeDefaultImpls$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.contacts.api.ContactsApi.ComposeDefaultImpls.m13637$r8$lambda$ZnjDx_gQuBu3XHMyM8ehOmKspM(kotlin.jvm.functions.Function0.this, str, modifier2, contactsApi, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
            }
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$7eJeNTVnlYYVZr4GOv9RVKqi6O0(com.paypal.oslo.feature.contacts.api.configs.PreSearchContactViewConfig preSearchContactViewConfig, java.util.List list, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.contacts.api.configs.ContactsPayloadConfig contactsPayloadConfig, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.contacts.api.ContactsApi contactsApi, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
            PreSearchContactView$default(preSearchContactViewConfig, list, function1, contactsPayloadConfig, modifier, contactsApi, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: $r8$lambda$Znj-Dx_gQuBu3XHMyM8ehOmKspM, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m13637$r8$lambda$ZnjDx_gQuBu3XHMyM8ehOmKspM(kotlin.jvm.functions.Function0 function0, java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.contacts.api.ContactsApi contactsApi, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
            SearchContactsButton$default(function0, str, modifier, contactsApi, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$uTq6RQrts1WmCAWOAqX__ZmxeO8(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy contactsSearchStrategy, com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig contactSearchScreenConfig, com.paypal.oslo.feature.contacts.api.configs.ContactsPayloadConfig contactsPayloadConfig, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.contacts.api.ContactsApi contactsApi, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
            ContactSearchScreen$default(function1, contactsSearchStrategy, contactSearchScreenConfig, contactsPayloadConfig, modifier, contactsApi, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            return kotlin.Unit.INSTANCE;
        }
    }
}
