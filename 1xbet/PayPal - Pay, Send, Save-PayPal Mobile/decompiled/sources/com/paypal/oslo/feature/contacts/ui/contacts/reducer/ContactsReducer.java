package com.paypal.oslo.feature.contacts.ui.contacts.reducer;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0016\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u0016\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/reducer/ContactsReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsState;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/effect/ContactsEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsState;Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;)Larrow/core/Either;", "p0", "p1", "Lcom/paypal/oslo/feature/contacts/ui/contacts/model/SearchQueryType;", "p2", "Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch$UnilateralItem;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/ui/contacts/model/SearchQueryType;)Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch$UnilateralItem;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch$ContactItem;", "(Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;)Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch$ContactItem;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactsReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState, com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent, com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.contacts.ui.contacts.reducer.ContactsReducer INSTANCE = new com.paypal.oslo.feature.contacts.ui.contacts.reducer.ContactsReducer();

    private ContactsReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ContactsReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState, com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect>> reduce(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState state, com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent event) {
        com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contact;
        com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.ShowingRecents content;
        com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.ShowingRecents content2;
        com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.LoadingRecents content3;
        com.paypal.oslo.feature.contacts.ui.contacts.state.PhoneInputState copy;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.contacts.ui.contacts.state.PhoneInputState copy2;
        com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi countryUi;
        com.paypal.oslo.feature.contacts.ui.contacts.state.PhoneInputState copy3;
        java.lang.Object obj;
        com.paypal.oslo.feature.contacts.ui.contacts.state.PhoneInputState copy4;
        com.paypal.oslo.feature.contacts.ui.contacts.state.PhoneInputState copy5;
        com.paypal.oslo.feature.contacts.ui.contacts.state.PhoneInputState copy6;
        com.paypal.oslo.feature.contacts.ui.contacts.state.PhoneInputState copy7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.OnContactClicked)) {
            if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchQueryChanged)) {
                if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.ShowCountryPickerChanged)) {
                    if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CountrySelected)) {
                        if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateFormattingResult)) {
                            if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateRecentCountries)) {
                                if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchTriggered)) {
                                    if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchStarted)) {
                                        if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchLoadingMore)) {
                                            if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchCompleted)) {
                                                if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchFailed)) {
                                                    if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchCleared)) {
                                                        if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.LoadRecentSearches)) {
                                                            if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesSuccess)) {
                                                                if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesError)) {
                                                                    if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.OnRecentSearchClicked)) {
                                                                        if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearches)) {
                                                                            if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearchesError)) {
                                                                                if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearchesSuccess)) {
                                                                                    if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearch)) {
                                                                                        if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearchError)) {
                                                                                            if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearchSuccess)) {
                                                                                                if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateContactRecentSearch) && !(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateStringRecentSearch) && !(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateRecentSearchError) && !(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateRecentSearchSuccess)) {
                                                                                                    if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentContactSearchAdded)) {
                                                                                                        throw new kotlin.NoWhenBranchMatchedException();
                                                                                                    }
                                                                                                    com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentContactSearchAdded recentContactSearchAdded = (com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentContactSearchAdded) event;
                                                                                                    java.util.List<com.paypal.oslo.feature.contacts.api.RecentSearch> recentSearches = state.getRecentSearches();
                                                                                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                                                                    for (java.lang.Object obj2 : recentSearches) {
                                                                                                        com.paypal.oslo.feature.contacts.api.RecentSearch recentSearch = (com.paypal.oslo.feature.contacts.api.RecentSearch) obj2;
                                                                                                        com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem contactItem = recentSearch instanceof com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem ? (com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem) recentSearch : null;
                                                                                                        if (!kotlin.jvm.internal.Intrinsics.areEqual((contactItem == null || (contact = contactItem.getContact()) == null) ? null : contact.getId(), recentContactSearchAdded.getContact().getId())) {
                                                                                                            arrayList2.add(obj2);
                                                                                                        }
                                                                                                    }
                                                                                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState.copy$default(state, null, kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.contacts.api.RecentSearch.ContactItem(recentContactSearchAdded.getContact().getId(), recentContactSearchAdded.getContact())), (java.lang.Iterable) arrayList2), null, null, 13, null), null, 2, null);
                                                                                                }
                                                                                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
                                                                                            }
                                                                                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
                                                                                        }
                                                                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
                                                                                    }
                                                                                    com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearch deleteARecentSearch = (com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearch) event;
                                                                                    java.util.List<com.paypal.oslo.feature.contacts.api.RecentSearch> recentSearches2 = state.getRecentSearches();
                                                                                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                                                                    for (java.lang.Object obj3 : recentSearches2) {
                                                                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactSearchExtensionsKt.id((com.paypal.oslo.feature.contacts.api.RecentSearch) obj3), deleteARecentSearch.getId())) {
                                                                                            arrayList3.add(obj3);
                                                                                        }
                                                                                    }
                                                                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState.copy$default(state, null, arrayList3, null, null, 13, null), null, 2, null);
                                                                                }
                                                                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
                                                                            }
                                                                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
                                                                        }
                                                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState.copy$default(state, null, kotlin.collections.CollectionsKt.emptyList(), null, null, 13, null), null, 2, null);
                                                                    }
                                                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, new com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.RecentSearchSelected(((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.OnRecentSearchClicked) event).getRecentSearch()));
                                                                }
                                                                if (state.getContent() instanceof com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.LoadingRecents) {
                                                                    content = com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.ShowingRecents.INSTANCE;
                                                                } else {
                                                                    content = state.getContent();
                                                                }
                                                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState.copy$default(state, content, null, null, null, 14, null), null, 2, null);
                                                            }
                                                            com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesSuccess recentSearchesSuccess = (com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesSuccess) event;
                                                            if (state.getContent() instanceof com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.LoadingRecents) {
                                                                content2 = com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.ShowingRecents.INSTANCE;
                                                            } else {
                                                                content2 = state.getContent();
                                                            }
                                                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState.copy$default(state, content2, recentSearchesSuccess.getRecentSearches(), null, null, 12, null), null, 2, null);
                                                        }
                                                        com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent content4 = state.getContent();
                                                        if ((content4 instanceof com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.Searching) || (content4 instanceof com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.SearchResults)) {
                                                            content3 = state.getContent();
                                                        } else {
                                                            content3 = com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.LoadingRecents.INSTANCE;
                                                        }
                                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState.copy$default(state, content3, null, null, null, 14, null), null, 2, null);
                                                    }
                                                    com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.ShowingRecents showingRecents = com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.ShowingRecents.INSTANCE;
                                                    copy = r9.copy((r18 & 1) != 0 ? r9.searchQuery : "", (r18 & 2) != 0 ? r9.unFormattedPhone : "", (r18 & 4) != 0 ? r9.searchQueryType : com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType.OTHER, (r18 & 8) != 0 ? r9.showCountryPicker : false, (r18 & 16) != 0 ? r9.selectedCountry : null, (r18 & 32) != 0 ? r9.recentCountries : null, (r18 & 64) != 0 ? r9.allCountries : null, (r18 & 128) != 0 ? state.getPhoneInput().userCountryCode : null);
                                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState.copy$default(state, showingRecents, null, null, copy, 6, null), null, 2, null);
                                                }
                                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState.copy$default(state, new com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.SearchError(((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchFailed) event).getError()), null, null, null, 14, null), null, 2, null);
                                            }
                                            java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> contacts = ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchCompleted) event).getContacts();
                                            java.util.List<com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType> ctaTypes = state.getCtaTypes();
                                            com.paypal.oslo.feature.contacts.ui.contacts.state.PhoneInputState phoneInput = state.getPhoneInput();
                                            androidx.compose.runtime.snapshots.SnapshotStateList mutableStateListOf = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
                                            java.lang.String unFormattedPhone = phoneInput.getUnFormattedPhone();
                                            java.lang.String searchQuery = phoneInput.getSearchQuery();
                                            com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType searchQueryType = phoneInput.getSearchQueryType();
                                            boolean z = searchQueryType == com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType.EMAIL || searchQueryType == com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType.PHONE;
                                            if (!contacts.isEmpty()) {
                                                if (contacts.size() == 1) {
                                                    com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem = (com.paypal.oslo.feature.contacts.api.ContactSearchContactItem) kotlin.collections.CollectionsKt.first((java.util.List) contacts);
                                                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                                    arrayList4.add(Camera2StreamConfigurationMap(contactSearchContactItem));
                                                    if (contactSearchContactItem.isExternalWallet()) {
                                                        if (!kotlin.text.StringsKt.isBlank(searchQuery) && z && ctaTypes.contains(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.UNILATERAL.INSTANCE)) {
                                                            arrayList4.add(Camera2StreamConfigurationMap(unFormattedPhone, searchQuery, searchQueryType));
                                                        }
                                                        if (ctaTypes.contains(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.LINK.INSTANCE)) {
                                                            arrayList4.add(new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.CustomActionItem(com.paypal.oslo.feature.contacts.api.CustomActionType.PaymentLink));
                                                        }
                                                    }
                                                    arrayList = arrayList4;
                                                } else {
                                                    java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> list = contacts;
                                                    java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                                                    java.util.Iterator<T> it = list.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList5.add(Camera2StreamConfigurationMap((com.paypal.oslo.feature.contacts.api.ContactSearchContactItem) it.next()));
                                                    }
                                                    arrayList = arrayList5;
                                                }
                                            } else {
                                                arrayList = new java.util.ArrayList();
                                                if (ctaTypes.contains(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.SYNC.INSTANCE)) {
                                                    arrayList.add(new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.CustomActionItem(com.paypal.oslo.feature.contacts.api.CustomActionType.ReadContacts));
                                                }
                                                if (z && ctaTypes.contains(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.UNILATERAL.INSTANCE)) {
                                                    arrayList.add(Camera2StreamConfigurationMap(unFormattedPhone, searchQuery, searchQueryType));
                                                }
                                                if (ctaTypes.contains(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.LINK.INSTANCE)) {
                                                    arrayList.add(new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.CustomActionItem(com.paypal.oslo.feature.contacts.api.CustomActionType.PaymentLink));
                                                }
                                            }
                                            mutableStateListOf.addAll(arrayList);
                                            boolean isEmpty = contacts.isEmpty();
                                            com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext.ThresholdExceeded thresholdExceeded = com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext.ThresholdExceeded.INSTANCE;
                                            if (!ctaTypes.contains(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.LINK.INSTANCE) || contacts.size() <= 10) {
                                                thresholdExceeded = null;
                                            }
                                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState.copy$default(state, new com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.SearchResults(mutableStateListOf, thresholdExceeded, isEmpty), null, null, null, 14, null), null, 2, null);
                                        }
                                        androidx.compose.runtime.snapshots.SnapshotStateList mutableStateListOf2 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
                                        java.util.List<com.paypal.oslo.feature.contacts.api.ContactSearchContactItem> partialContacts = ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchLoadingMore) event).getPartialContacts();
                                        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(partialContacts, 10));
                                        java.util.Iterator<T> it2 = partialContacts.iterator();
                                        while (it2.hasNext()) {
                                            arrayList6.add(Camera2StreamConfigurationMap((com.paypal.oslo.feature.contacts.api.ContactSearchContactItem) it2.next()));
                                        }
                                        mutableStateListOf2.addAll(arrayList6);
                                        mutableStateListOf2.add(com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactShimmer.INSTANCE);
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState.copy$default(state, new com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.SearchResults(mutableStateListOf2, null, false, 6, null), null, null, null, 14, null), null, 2, null);
                                    }
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState.copy$default(state, com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.Searching.INSTANCE, null, null, null, 14, null), null, 2, null);
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState.copy$default(state, com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.Searching.INSTANCE, null, null, null, 14, null), null, 2, null);
                            }
                            copy2 = r9.copy((r18 & 1) != 0 ? r9.searchQuery : null, (r18 & 2) != 0 ? r9.unFormattedPhone : null, (r18 & 4) != 0 ? r9.searchQueryType : null, (r18 & 8) != 0 ? r9.showCountryPicker : false, (r18 & 16) != 0 ? r9.selectedCountry : null, (r18 & 32) != 0 ? r9.recentCountries : ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateRecentCountries) event).getRecentCountries(), (r18 & 64) != 0 ? r9.allCountries : null, (r18 & 128) != 0 ? state.getPhoneInput().userCountryCode : null);
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState.copy$default(state, null, null, null, copy2, 7, null), null, 2, null);
                        }
                        com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateFormattingResult updateFormattingResult = (com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateFormattingResult) event;
                        java.lang.String countryCode = updateFormattingResult.getCountryCode();
                        if (countryCode != null) {
                            java.util.Iterator<T> it3 = state.getPhoneInput().getAllCountries().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it3.next();
                                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi) obj).getId(), countryCode)) {
                                    break;
                                }
                            }
                            countryUi = (com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi) obj;
                        } else {
                            countryUi = null;
                        }
                        com.paypal.oslo.feature.contacts.ui.contacts.state.PhoneInputState phoneInput2 = state.getPhoneInput();
                        java.lang.String displayText = updateFormattingResult.getDisplayText();
                        if (displayText == null) {
                            displayText = updateFormattingResult.getNormalizedQuery();
                        }
                        copy3 = phoneInput2.copy((r18 & 1) != 0 ? phoneInput2.searchQuery : displayText, (r18 & 2) != 0 ? phoneInput2.unFormattedPhone : updateFormattingResult.getNormalizedQuery(), (r18 & 4) != 0 ? phoneInput2.searchQueryType : updateFormattingResult.getSearchQueryType(), (r18 & 8) != 0 ? phoneInput2.showCountryPicker : false, (r18 & 16) != 0 ? phoneInput2.selectedCountry : countryUi, (r18 & 32) != 0 ? phoneInput2.recentCountries : null, (r18 & 64) != 0 ? phoneInput2.allCountries : null, (r18 & 128) != 0 ? phoneInput2.userCountryCode : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState.copy$default(state, null, null, null, copy3, 7, null), null, 2, null);
                    }
                    copy4 = r9.copy((r18 & 1) != 0 ? r9.searchQuery : null, (r18 & 2) != 0 ? r9.unFormattedPhone : null, (r18 & 4) != 0 ? r9.searchQueryType : null, (r18 & 8) != 0 ? r9.showCountryPicker : false, (r18 & 16) != 0 ? r9.selectedCountry : null, (r18 & 32) != 0 ? r9.recentCountries : null, (r18 & 64) != 0 ? r9.allCountries : null, (r18 & 128) != 0 ? state.getPhoneInput().userCountryCode : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState.copy$default(state, null, null, null, copy4, 7, null), null, 2, null);
                }
                copy5 = r9.copy((r18 & 1) != 0 ? r9.searchQuery : null, (r18 & 2) != 0 ? r9.unFormattedPhone : null, (r18 & 4) != 0 ? r9.searchQueryType : null, (r18 & 8) != 0 ? r9.showCountryPicker : ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.ShowCountryPickerChanged) event).getShow(), (r18 & 16) != 0 ? r9.selectedCountry : null, (r18 & 32) != 0 ? r9.recentCountries : null, (r18 & 64) != 0 ? r9.allCountries : null, (r18 & 128) != 0 ? state.getPhoneInput().userCountryCode : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState.copy$default(state, null, null, null, copy5, 7, null), null, 2, null);
            }
            com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchQueryChanged searchQueryChanged = (com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchQueryChanged) event;
            if (kotlin.jvm.internal.Intrinsics.areEqual(searchQueryChanged.getQuery(), state.getPhoneInput().getSearchQuery())) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
            }
            if (kotlin.text.StringsKt.isBlank(searchQueryChanged.getQuery())) {
                com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.ShowingRecents showingRecents2 = com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.ShowingRecents.INSTANCE;
                copy7 = r9.copy((r18 & 1) != 0 ? r9.searchQuery : searchQueryChanged.getQuery(), (r18 & 2) != 0 ? r9.unFormattedPhone : null, (r18 & 4) != 0 ? r9.searchQueryType : null, (r18 & 8) != 0 ? r9.showCountryPicker : false, (r18 & 16) != 0 ? r9.selectedCountry : null, (r18 & 32) != 0 ? r9.recentCountries : null, (r18 & 64) != 0 ? r9.allCountries : null, (r18 & 128) != 0 ? state.getPhoneInput().userCountryCode : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState.copy$default(state, showingRecents2, null, null, copy7, 6, null), null, 2, null);
            }
            com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.Searching searching = com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsContent.Searching.INSTANCE;
            copy6 = r9.copy((r18 & 1) != 0 ? r9.searchQuery : searchQueryChanged.getQuery(), (r18 & 2) != 0 ? r9.unFormattedPhone : null, (r18 & 4) != 0 ? r9.searchQueryType : null, (r18 & 8) != 0 ? r9.showCountryPicker : false, (r18 & 16) != 0 ? r9.selectedCountry : null, (r18 & 32) != 0 ? r9.recentCountries : null, (r18 & 64) != 0 ? r9.allCountries : null, (r18 & 128) != 0 ? state.getPhoneInput().userCountryCode : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState.copy$default(state, searching, null, null, copy6, 6, null), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, new com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect.ContactSelected(((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.OnContactClicked) event).getContact()));
    }

    private static com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.UnilateralItem Camera2StreamConfigurationMap(java.lang.String p0, java.lang.String p1, com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType p2) {
        if (p2 == com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType.EMAIL) {
            return new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.UnilateralItem(com.paypal.oslo.feature.contacts.api.UnilateralType.Email, p1);
        }
        com.paypal.oslo.feature.contacts.api.UnilateralType unilateralType = com.paypal.oslo.feature.contacts.api.UnilateralType.Phone;
        java.lang.String str = p1;
        if (!kotlin.text.StringsKt.isBlank(str)) {
            p0 = str;
        }
        return new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.UnilateralItem(unilateralType, p0);
    }

    private static com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactItem Camera2StreamConfigurationMap(com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem) {
        return new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactItem(contactSearchContactItem.getId(), contactSearchContactItem.getFirstName(), contactSearchContactItem.getLastName(), contactSearchContactItem.getType(), contactSearchContactItem.getPhoneNumber(), contactSearchContactItem.getEmail(), contactSearchContactItem.getAvatarUrl(), contactSearchContactItem.isExternalWallet(), contactSearchContactItem.getExternalWalletName(), contactSearchContactItem.getExternalWalletLogoUrl(), contactSearchContactItem.getActionType(), contactSearchContactItem.getHandle(), contactSearchContactItem.getLocation(), contactSearchContactItem.isBlocked(), contactSearchContactItem.isFavorite(), contactSearchContactItem.isMobile(), contactSearchContactItem.getTotalCompletedPayments(), contactSearchContactItem.getContactNameType(), contactSearchContactItem.getAccountId());
    }
}
