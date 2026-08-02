package com.paypal.oslo.feature.p2p.ui.contacts;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/contacts/SearchContactsEventHandler;", "", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/ContactSearchItemToP2PContactItemMapper;", "contactMapper", "Lcom/paypal/oslo/feature/p2p/domain/contacts/ReceiverTypeResolver;", "receiverTypeResolver", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/review/mappers/ContactSearchItemToP2PContactItemMapper;Lcom/paypal/oslo/feature/p2p/domain/contacts/ReceiverTypeResolver;)V", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent;", "event", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ContactSectionViewModel;", "viewModel", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchNetworkType;", "contactSearchNetworkType", "", "handle$p2p_prodRelease", "(Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ContactSectionViewModel;Lcom/paypal/oslo/feature/contacts/api/ContactSearchNetworkType;)V", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "p0", "Lcom/paypal/oslo/feature/p2p/domain/contacts/ReceiverInfo;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;)Lcom/paypal/oslo/feature/p2p/domain/contacts/ReceiverInfo;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/ContactSearchItemToP2PContactItemMapper;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/p2p/domain/contacts/ReceiverTypeResolver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchContactsEventHandler {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.contacts.ReceiverTypeResolver getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.ui.review.mappers.ContactSearchItemToP2PContactItemMapper getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SearchContactsEventHandler(com.paypal.oslo.feature.p2p.ui.review.mappers.ContactSearchItemToP2PContactItemMapper contactSearchItemToP2PContactItemMapper, com.paypal.oslo.feature.p2p.domain.contacts.ReceiverTypeResolver receiverTypeResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchItemToP2PContactItemMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiverTypeResolver, "");
        this.getHighResolutionOutputSizeshNQ4ISI = contactSearchItemToP2PContactItemMapper;
        this.getHighSpeedVideoFpsRangesFor = receiverTypeResolver;
    }

    public final void handle$p2p_prodRelease(com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent event, final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel viewModel, com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType contactSearchNetworkType) {
        kotlin.Triple triple;
        com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType publicProfileFlowType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchNetworkType, "");
        if (event instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.CardClicked) {
            com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType type = ((com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.CardClicked) event).getType();
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.LINK.INSTANCE)) {
                viewModel.processEvent(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.PaymentLinkOptionSelected.INSTANCE);
                return;
            } else {
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.SCAN.INSTANCE)) {
                    navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler.$r8$lambda$5HMr9l3ix34kGVu3QUB5Al7356Q((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                        }
                    });
                    return;
                }
                return;
            }
        }
        if (event instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.InfoIconClicked) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.InfoIconClicked) event).getType(), com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.LINK.INSTANCE)) {
                navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler.$r8$lambda$wLqLgIwXqDbOh2fKykAwTriAGqw((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
                return;
            }
            return;
        }
        if (event instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ContactClicked) {
            com.paypal.oslo.feature.contacts.api.ContactSearchContactItem item = ((com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ContactClicked) event).getItem();
            com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem map = this.getHighResolutionOutputSizeshNQ4ISI.map(item);
            com.paypal.oslo.feature.p2p.domain.contacts.ReceiverInfo highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(item);
            if (highSpeedVideoFpsRanges != null) {
                viewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContactSelected(map, highSpeedVideoFpsRanges.getContactId(), highSpeedVideoFpsRanges.getReceiverType()));
                navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler.$r8$lambda$NOJhvl38oQ3M__Hw5GxakbMxLaA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
                return;
            }
            return;
        }
        if (event instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ActionClicked) {
            com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contact = ((com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ActionClicked) event).getContact();
            final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem map2 = this.getHighResolutionOutputSizeshNQ4ISI.map(contact);
            final com.paypal.oslo.feature.p2p.domain.contacts.ReceiverInfo highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(contact);
            if (highSpeedVideoFpsRanges2 != null) {
                if (contactSearchNetworkType == com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType.SEND) {
                    publicProfileFlowType = com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType.SEND;
                } else {
                    publicProfileFlowType = com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType.REQUEST;
                }
                final com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType publicProfileFlowType2 = publicProfileFlowType;
                navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler.$r8$lambda$3ktnWQxxiAjDIqJUdM3UQfFxQ6E(com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem.this, publicProfileFlowType2, navigator, this, viewModel, highSpeedVideoFpsRanges2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
                return;
            }
            return;
        }
        if (event instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent.InfoIconClicked) {
            navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler.m17274$r8$lambda$4cdn7UhFbbvYtnTOk9x9lAWwx0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return;
        }
        if (event instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent.CardClicked) {
            com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem item2 = ((com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent.CardClicked) event).getItem();
            int i = com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler.WhenMappings.$EnumSwitchMapping$0[item2.getType().ordinal()];
            if (i == 1) {
                triple = new kotlin.Triple(item2.getValue(), null, com.paypal.oslo.feature.p2p.domain.model.ReceiverType.PHONE_NUMBER);
            } else {
                if (i != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                triple = new kotlin.Triple(null, item2.getValue(), com.paypal.oslo.feature.p2p.domain.model.ReceiverType.EMAIL_ADDRESS);
            }
            java.lang.String str = (java.lang.String) triple.component1();
            java.lang.String str2 = (java.lang.String) triple.component2();
            viewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContactSelected(new com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem(item2.getId(), "", "", str, str2, null, false, null, null, null, null, null, null, null, false, false, false, 0, null, 524256, null), item2.getValue(), (com.paypal.oslo.feature.p2p.domain.model.ReceiverType) triple.component3()));
            navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler.$r8$lambda$3FxWuIS_szlQbee_eVhlM8TUL2s((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return;
        }
        if (event instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.BackPressed) {
            navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler.$r8$lambda$EkoFIVCf5w6u3gTTr0j66Zdmsl8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
    }

    private final com.paypal.oslo.feature.p2p.domain.contacts.ReceiverInfo getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem p0) {
        try {
            return this.getHighSpeedVideoFpsRangesFor.resolveFromContact(p0);
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            logger.e(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.PAYMENT_RECEIVER_UPDATE_FAILED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", message)), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, p0.getId())), e);
            return null;
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3FxWuIS_szlQbee_eVhlM8TUL2s(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3ktnWQxxiAjDIqJUdM3UQfFxQ6E(final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem, com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileFlowType publicProfileFlowType, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler searchContactsEventHandler, final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, final com.paypal.oslo.feature.p2p.domain.contacts.ReceiverInfo receiverInfo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        java.lang.String id = p2PContactItem.getId();
        java.lang.String accountId = p2PContactItem.getAccountId();
        navigationScope.push(new com.paypal.oslo.feature.publicprofile.api.navigation.PublicProfileDestination(id, accountId != null ? accountId : "", publicProfileFlowType, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler.m17275$r8$lambda$TfO9Q8DxOVV3HZL47Y4C83_5Qs(com.paypal.oslo.core.navigation.AppNavigator.this, searchContactsEventHandler, contactSectionViewModel, p2PContactItem, receiverInfo);
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$4cdn7UhFbbvYtnTOk9x9lAWwx-0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17274$r8$lambda$4cdn7UhFbbvYtnTOk9x9lAWwx0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.contacts.api.navigation.UnilateralContactInfoDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5HMr9l3ix34kGVu3QUB5Al7356Q(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.qrc.api.navigation.QrcPayFlowDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EkoFIVCf5w6u3gTTr0j66Zdmsl8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H5_y8_p5RKK2A4zktHXZPFyg6eM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NOJhvl38oQ3M__Hw5GxakbMxLaA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$THbvbluaqBhVYrPqfnK_czSx3pg(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TfO9Q8DxOVV3HZL47Y4C83_5Q-s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17275$r8$lambda$TfO9Q8DxOVV3HZL47Y4C83_5Qs(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler searchContactsEventHandler, com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem, com.paypal.oslo.feature.p2p.domain.contacts.ReceiverInfo receiverInfo) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler.$r8$lambda$THbvbluaqBhVYrPqfnK_czSx3pg((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        contactSectionViewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContactSelected(p2PContactItem, receiverInfo.getContactId(), receiverInfo.getReceiverType()));
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler.$r8$lambda$H5_y8_p5RKK2A4zktHXZPFyg6eM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wLqLgIwXqDbOh2fKykAwTriAGqw(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.p2p.api.navigation.PaymentLinkDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.contacts.api.UnilateralType.values().length];
            try {
                iArr[com.paypal.oslo.feature.contacts.api.UnilateralType.Phone.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.contacts.api.UnilateralType.Email.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
