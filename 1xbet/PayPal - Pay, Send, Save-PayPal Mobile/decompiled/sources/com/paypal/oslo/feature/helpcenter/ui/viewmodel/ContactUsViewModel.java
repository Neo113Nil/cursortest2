package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$R)\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0#0&8\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R&\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\r0#0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R,\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\r0#0&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\r0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010$R&\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\r0&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010*R\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\"\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*R \u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0#0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010$R&\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0#0&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010*R\u0018\u0010\u001c\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00109R\u0018\u0010\u0019\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u00109"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/viewmodel/ContactUsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchContactUsTopicsUseCase;", "fetchContactUsTopicsUseCase", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchRecommendedArticlesUseCase;", "fetchRecommendedArticlesUseCase", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchArticleUseCase;", "fetchArticleUseCase", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchContactUsTopicsUseCase;Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchRecommendedArticlesUseCase;Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchArticleUseCase;)V", "", "fetchTopics", "()V", "", "Lcom/paypal/oslo/feature/helpcenter/domain/models/ContactTopic;", "allTopics", "getCurrentTopics", "(Ljava/util/List;)Ljava/util/List;", "topic", "onTopicSelected", "(Lcom/paypal/oslo/feature/helpcenter/domain/models/ContactTopic;)V", "onLeafTopicSelected", "", "onNavigateBack", "()Z", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchContactUsTopicsUseCase;", "Camera2StreamConfigurationMap", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchRecommendedArticlesUseCase;", "getHighSpeedVideoFpsRangesFor", "getOutputFormats", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchArticleUseCase;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "topicsState", "Lkotlinx/coroutines/flow/StateFlow;", "getTopicsState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/RecommendedArticleData;", "getHighResolutionOutputSizeshNQ4ISI", "recommendedState", "getRecommendedState", "", "navigationStack", "getNavigationStack", "getInputFormats", "selectedLeafTopic", "getSelectedLeafTopic", "getHighSpeedVideoSizesFor", "articleTitleState", "getArticleTitleState", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactUsViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.RecommendedArticleData>>> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.lang.String>> articleTitleState;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.lang.String>> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic>>> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic> getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.helpcenter.domain.usecase.FetchContactUsTopicsUseCase Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> navigationStack;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.RecommendedArticleData>>> recommendedState;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic> selectedLeafTopic;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic>>> topicsState;

    @javax.inject.Inject
    public ContactUsViewModel(com.paypal.oslo.feature.helpcenter.domain.usecase.FetchContactUsTopicsUseCase fetchContactUsTopicsUseCase, com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase fetchRecommendedArticlesUseCase, com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase fetchArticleUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchContactUsTopicsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchRecommendedArticlesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchArticleUseCase, "");
        this.Camera2StreamConfigurationMap = fetchContactUsTopicsUseCase;
        this.getHighSpeedVideoFpsRangesFor = fetchRecommendedArticlesUseCase;
        this.getHighSpeedVideoFpsRanges = fetchArticleUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic>>> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.topicsState = MutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.RecommendedArticleData>>> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow2;
        this.recommendedState = MutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.emptyList());
        this.getOutputFormats = MutableStateFlow3;
        this.navigationStack = MutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic> MutableStateFlow4 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getInputFormats = MutableStateFlow4;
        this.selectedLeafTopic = MutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.lang.String>> MutableStateFlow5 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
        this.getHighSpeedVideoSizesFor = MutableStateFlow5;
        this.articleTitleState = MutableStateFlow5;
        fetchTopics();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel$fetchRecommendedArticles$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic>>> getTopicsState() {
        return this.topicsState;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.RecommendedArticleData>>> getRecommendedState() {
        return this.recommendedState;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> getNavigationStack() {
        return this.navigationStack;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic> getSelectedLeafTopic() {
        return this.selectedLeafTopic;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<java.lang.String>> getArticleTitleState() {
        return this.articleTitleState;
    }

    public final void fetchTopics() {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = this.getOutputMinFrameDuration;
        if (job != null) {
            if (!job.isActive()) {
                job = null;
            }
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
        }
        kotlinx.coroutines.Job job2 = this.getInputSizeshNQ4ISI;
        if (job2 != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
        this.getOutputFormats.setValue(kotlin.collections.CollectionsKt.emptyList());
        this.getInputFormats.setValue(null);
        this.getHighSpeedVideoSizesFor.setValue(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel$fetchTopics$2(this, null), 3, null);
        this.getOutputMinFrameDuration = launch$default;
    }

    public final java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic> getCurrentTopics(java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic> allTopics) {
        java.lang.Object obj;
        java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic> subtopics;
        java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic> subtopics2;
        java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic> subtopics3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allTopics, "");
        if (this.getOutputFormats.getValue().isEmpty()) {
            return allTopics;
        }
        java.lang.Object obj2 = null;
        if (this.getOutputFormats.getValue().size() == 1) {
            java.lang.String str = this.getOutputFormats.getValue().get(0);
            java.util.Iterator<T> it = allTopics.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic) next).getId(), str)) {
                    obj2 = next;
                    break;
                }
            }
            com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic contactTopic = (com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic) obj2;
            return (contactTopic == null || (subtopics3 = contactTopic.getSubtopics()) == null) ? kotlin.collections.CollectionsKt.emptyList() : subtopics3;
        }
        java.lang.String str2 = this.getOutputFormats.getValue().get(0);
        java.lang.String str3 = this.getOutputFormats.getValue().get(1);
        java.util.Iterator<T> it2 = allTopics.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic) obj).getId(), str2)) {
                break;
            }
        }
        com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic contactTopic2 = (com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic) obj;
        if (contactTopic2 != null && (subtopics = contactTopic2.getSubtopics()) != null) {
            java.util.Iterator<T> it3 = subtopics.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it3.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic) next2).getId(), str3)) {
                    obj2 = next2;
                    break;
                }
            }
            com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic contactTopic3 = (com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic) obj2;
            if (contactTopic3 != null && (subtopics2 = contactTopic3.getSubtopics()) != null) {
                return subtopics2;
            }
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public final void onTopicSelected(com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic topic) {
        java.util.List<java.lang.String> value;
        java.util.List<java.lang.String> list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topic, "");
        if (topic.isLeaf()) {
            return;
        }
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> mutableStateFlow = this.getOutputFormats;
        do {
            value = mutableStateFlow.getValue();
            list = value;
            if (list.size() < 2) {
                list = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.String>) list, topic.getId());
            }
        } while (!mutableStateFlow.compareAndSet(value, list));
    }

    public final void onLeafTopicSelected(com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic topic) {
        java.lang.String articleId;
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topic, "");
        kotlinx.coroutines.Job job = this.getInputSizeshNQ4ISI;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getInputFormats.setValue(topic);
        com.paypal.oslo.feature.helpcenter.domain.models.ContactTopicResource resource = topic.getResource();
        if (resource == null || (articleId = resource.getArticleId()) == null) {
            return;
        }
        this.getHighSpeedVideoSizesFor.setValue(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel$onLeafTopicSelected$1(this, articleId, null), 3, null);
        this.getInputSizeshNQ4ISI = launch$default;
    }

    public final boolean onNavigateBack() {
        java.util.List<java.lang.String> value;
        if (this.getInputFormats.getValue() != null) {
            kotlinx.coroutines.Job job = this.getInputSizeshNQ4ISI;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            this.getInputFormats.setValue(null);
            return true;
        }
        boolean isEmpty = this.getOutputFormats.getValue().isEmpty();
        if (!isEmpty) {
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> mutableStateFlow = this.getOutputFormats;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.CollectionsKt.dropLast(value, 1)));
        }
        return !isEmpty;
    }
}
