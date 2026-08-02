package kotlinx.coroutines;

@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@kotlin.Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\n·\u0001¸\u0001¹\u0001º\u0001»\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0004J\u001f\u0010\u001f\u001a\u00020 2\u0014\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u001b0\"H\u0082\bJ\u001c\u0010'\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0002J \u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u001c\u001a\u00020(2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0-H\u0002J\u001e\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0-H\u0002J\u001a\u00100\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u00103\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020+H\u0002J\u0010\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u00020+H\u0002J\u0016\u00109\u001a\u00020\u001b*\u0002062\b\u00107\u001a\u0004\u0018\u00010+H\u0002J/\u0010:\u001a\u00020\u001b2\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010+2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00050\"H\u0082\bJ\u0006\u0010=\u001a\u00020\u0005J\u0012\u0010>\u001a\u00020?2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010@\u001a\u00020\u001bH\u0014J\u000f\u0010A\u001a\u00060Bj\u0002`C¢\u0006\u0002\u0010DJ!\u0010E\u001a\u00060Bj\u0002`C*\u00020+2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010GH\u0004¢\u0006\u0002\u0010HJ/\u0010N\u001a\u00020O2'\u0010P\u001a#\u0012\u0015\u0012\u0013\u0018\u00010+¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u001b0\"j\u0002`SJ?\u0010N\u001a\u00020O2\u0006\u0010T\u001a\u00020\u00052\u0006\u0010U\u001a\u00020\u00052'\u0010P\u001a#\u0012\u0015\u0012\u0013\u0018\u00010+¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u001b0\"j\u0002`SJ\u001d\u0010V\u001a\u00020O2\u0006\u0010U\u001a\u00020\u00052\u0006\u0010W\u001a\u00020<H\u0000¢\u0006\u0002\bXJ+\u0010Y\u001a\u00020\u00052\u0006\u0010W\u001a\u00020<2\u0018\u0010Z\u001a\u0014\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00050[H\u0082\bJ\u0010\u0010\\\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020]H\u0002J\u0010\u0010^\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020<H\u0002J\u000e\u0010_\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010`J\b\u0010a\u001a\u00020\u0005H\u0002J\u000e\u0010b\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010`J\u001e\u0010i\u001a\u00020\u001b2\n\u0010j\u001a\u0006\u0012\u0002\b\u00030k2\b\u0010l\u001a\u0004\u0018\u00010\u000eH\u0002J\u0015\u0010m\u001a\u00020\u001b2\u0006\u0010W\u001a\u00020<H\u0000¢\u0006\u0002\bnJ\u001d\u0010q\u001a\u00020\u001b2\u000e\u00107\u001a\n\u0018\u00010Bj\u0004\u0018\u0001`CH\u0016¢\u0006\u0002\u0010rJ\b\u0010s\u001a\u00020GH\u0014J\u0012\u0010q\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010+H\u0017J\u0010\u0010t\u001a\u00020\u001b2\u0006\u00107\u001a\u00020+H\u0016J\u000e\u0010u\u001a\u00020\u001b2\u0006\u0010v\u001a\u00020\u0003J\u0010\u0010w\u001a\u00020\u00052\u0006\u00107\u001a\u00020+H\u0016J\u0010\u0010x\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010+J\u0017\u0010y\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0002\bzJ\u0014\u0010{\u001a\u0004\u0018\u00010\u000e2\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0002J&\u0010|\u001a\u00020}2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\n\b\u0002\u00107\u001a\u0004\u0018\u00010+H\u0080\b¢\u0006\u0002\b~J\u0011\u0010\u007f\u001a\u00060Bj\u0002`CH\u0016¢\u0006\u0002\u0010DJ\u0013\u0010\u0080\u0001\u001a\u00020+2\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0002J\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000e2\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0002J\u0013\u0010\u0082\u0001\u001a\u0004\u0018\u0001062\u0006\u0010\u001c\u001a\u000201H\u0002J\u0019\u0010\u0083\u0001\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u0002012\u0006\u0010/\u001a\u00020+H\u0002J\u0019\u0010\u0084\u0001\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0003\b\u0085\u0001J\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0003\b\u0087\u0001J\u001f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0002J\u001d\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u0002012\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0002J&\u0010\u008d\u0001\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020(2\b\u0010\u008e\u0001\u001a\u00030\u008f\u00012\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0082\u0010J%\u0010\u0090\u0001\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020(2\b\u0010\u0091\u0001\u001a\u00030\u008f\u00012\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0002J\u0011\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u0001*\u00030\u0093\u0001H\u0002J\u0010\u0010\u0098\u0001\u001a\u00020\u00102\u0007\u0010\u008e\u0001\u001a\u00020\u0002J\u0018\u0010\u0099\u0001\u001a\u00020\u001b2\u0007\u0010\u009a\u0001\u001a\u00020+H\u0010¢\u0006\u0003\b\u009b\u0001J\u0012\u0010T\u001a\u00020\u001b2\b\u00107\u001a\u0004\u0018\u00010+H\u0014J\u0012\u0010\u009f\u0001\u001a\u00020\u00052\u0007\u0010\u009a\u0001\u001a\u00020+H\u0014J\u0013\u0010 \u0001\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0014J\u0013\u0010¡\u0001\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0014J\t\u0010¢\u0001\u001a\u00020GH\u0016J\t\u0010£\u0001\u001a\u00020GH\u0007J\u000f\u0010¤\u0001\u001a\u00020GH\u0010¢\u0006\u0003\b¥\u0001J\u0013\u0010¦\u0001\u001a\u00020G2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0002J\t\u0010ª\u0001\u001a\u0004\u0018\u00010+J\u0011\u0010«\u0001\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0003\b¬\u0001J\u0011\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u000eH\u0084@¢\u0006\u0002\u0010`J\u0011\u0010®\u0001\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0002\u0010`J\u001f\u0010´\u0001\u001a\u00020\u001b2\n\u0010j\u001a\u0006\u0012\u0002\b\u00030k2\b\u0010l\u001a\u0004\u0018\u00010\u000eH\u0002J \u0010µ\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010l\u001a\u0004\u0018\u00010\u000e2\t\u0010¶\u0001\u001a\u0004\u0018\u00010\u000eH\u0002R\u0015\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u0004R\u0011\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rX\u0082\u0004R(\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0011\u0010&\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0016\u0010I\u001a\u0004\u0018\u00010+8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bM\u0010$R\u0017\u0010c\u001a\u00020d8F¢\u0006\f\u0012\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0014\u0010o\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bp\u0010$R\u001f\u0010\u008a\u0001\u001a\u0004\u0018\u00010+*\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001b\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010\u0095\u00018F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0016\u0010\u009c\u0001\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010$R\u0016\u0010\u009d\u0001\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010$R\u001b\u0010§\u0001\u001a\u00020\u0005*\u0002018BX\u0082\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0013\u0010©\u0001\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b©\u0001\u0010$R#\u0010¯\u0001\u001a\u0007\u0012\u0002\b\u00030°\u00018DX\u0084\u0004¢\u0006\u000f\u0012\u0005\b±\u0001\u0010f\u001a\u0006\b²\u0001\u0010³\u0001¨\u0006¼\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/ParentJob;", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.ACTIVE, "", "<init>", "(Z)V", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "_state", "Lkotlinx/atomicfu/AtomicRef;", "", "_parentHandle", "Lkotlinx/coroutines/ChildHandle;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "parentHandle", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "parent", "getParent", "()Lkotlinx/coroutines/Job;", "initParentJob", "", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "loopOnState", "", "block", "Lkotlin/Function1;", "isActive", "()Z", "isCompleted", "isCancelled", "finalizeFinishingState", "Lkotlinx/coroutines/JobSupport$Finishing;", "proposedUpdate", "getFinalRootCause", "", "exceptions", "", "addSuppressedExceptions", "rootCause", "tryFinalizeSimpleState", "Lkotlinx/coroutines/Incomplete;", "update", "completeStateFinalization", "notifyCancelling", "list", "Lkotlinx/coroutines/NodeList;", "cause", "cancelParent", "notifyCompletion", "notifyHandlers", "predicate", "Lkotlinx/coroutines/JobNode;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "startInternal", "", "onStart", "getCancellationException", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "()Ljava/util/concurrent/CancellationException;", "toCancellationException", "message", "", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "completionCause", "getCompletionCause", "()Ljava/lang/Throwable;", "completionCauseHandled", "getCompletionCauseHandled", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "handler", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "onCancelling", "invokeImmediately", "invokeOnCompletionInternal", "node", "invokeOnCompletionInternal$kotlinx_coroutines_core", "tryPutNodeIntoList", "tryAdd", "Lkotlin/Function2;", "promoteEmptyToNodeList", "Lkotlinx/coroutines/Empty;", "promoteSingleToNodeList", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinInternal", "joinSuspend", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin$annotations", "()V", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "registerSelectForOnJoin", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "ignoredParam", "removeNode", "removeNode$kotlinx_coroutines_core", "onCancelComplete", "getOnCancelComplete$kotlinx_coroutines_core", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Ljava/util/concurrent/CancellationException;)V", "cancellationExceptionMessage", "cancelInternal", "parentCancelled", "parentJob", "childCancelled", "cancelCoroutine", "cancelImpl", "cancelImpl$kotlinx_coroutines_core", "cancelMakeCompleting", "defaultCancellationException", "Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException$kotlinx_coroutines_core", "getChildJobCancellationCause", "createCauseException", "makeCancelling", "getOrPromoteCancellingList", "tryMakeCancelling", "makeCompleting", "makeCompleting$kotlinx_coroutines_core", "makeCompletingOnce", "makeCompletingOnce$kotlinx_coroutines_core", "tryMakeCompleting", "tryMakeCompletingSlowPath", "exceptionOrNull", "getExceptionOrNull", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "tryWaitForChild", "child", "Lkotlinx/coroutines/ChildHandleNode;", "continueCompleting", "lastChild", "nextChild", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "attachChild", "handleOnCompletionException", "exception", "handleOnCompletionException$kotlinx_coroutines_core", "isScopedCoroutine", "handlesException", "getHandlesException$kotlinx_coroutines_core", "handleJobException", "onCompletionInternal", "afterCompletion", "toString", "toDebugString", "nameString", "nameString$kotlinx_coroutines_core", "stateString", "isCancelling", "(Lkotlinx/coroutines/Incomplete;)Z", "isCompletedExceptionally", "getCompletionExceptionOrNull", "getCompletedInternal", "getCompletedInternal$kotlinx_coroutines_core", "awaitInternal", "awaitSuspend", "onAwaitInternal", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwaitInternal$annotations", "getOnAwaitInternal", "()Lkotlinx/coroutines/selects/SelectClause1;", "onAwaitInternalRegFunc", "onAwaitInternalProcessResFunc", "result", "SelectOnJoinCompletionHandler", "Finishing", "ChildCompletion", "AwaitContinuation", "SelectOnAwaitCompletionHandler", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class JobSupport implements kotlinx.coroutines.Job, kotlinx.coroutines.ChildJob, kotlinx.coroutines.ParentJob {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.JobSupport.class, java.lang.Object.class, "_state$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoFpsRangesFor = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.JobSupport.class, java.lang.Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    protected static /* synthetic */ void getOnAwaitInternal$annotations() {
    }

    public static /* synthetic */ void getOnJoin$annotations() {
    }

    protected void afterCompletion(java.lang.Object state) {
    }

    /* renamed from: getHandlesException$kotlinx_coroutines_core */
    public boolean getHandlesException() {
        return true;
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return false;
    }

    protected boolean handleJobException(java.lang.Throwable exception) {
        return false;
    }

    protected boolean isScopedCoroutine() {
        return false;
    }

    protected void onCancelling(java.lang.Throwable cause) {
    }

    protected void onCompletionInternal(java.lang.Object state) {
    }

    protected void onStart() {
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        cancel((java.util.concurrent.CancellationException) null);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
        return (R) kotlinx.coroutines.Job.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        return (E) kotlinx.coroutines.Job.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        return kotlinx.coroutines.Job.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.Job.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public kotlinx.coroutines.Job plus(kotlinx.coroutines.Job job) {
        return kotlinx.coroutines.Job.DefaultImpls.plus((kotlinx.coroutines.Job) this, job);
    }

    public JobSupport(boolean z) {
        this._state$volatile = z ? kotlinx.coroutines.JobSupportKt.getHighResolutionOutputSizeshNQ4ISI : kotlinx.coroutines.JobSupportKt.getHighSpeedVideoSizes;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.CoroutineContext.Key<?> getKey() {
        return kotlinx.coroutines.Job.INSTANCE;
    }

    @Override // kotlinx.coroutines.Job
    public kotlinx.coroutines.Job getParent() {
        kotlinx.coroutines.ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            return parentHandle$kotlinx_coroutines_core.getParent();
        }
        return null;
    }

    protected final void initParentJob(kotlinx.coroutines.Job parent) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && getParentHandle$kotlinx_coroutines_core() != null) {
            throw new java.lang.AssertionError();
        }
        if (parent == null) {
            setParentHandle$kotlinx_coroutines_core(kotlinx.coroutines.NonDisposableHandle.INSTANCE);
            return;
        }
        parent.start();
        kotlinx.coroutines.ChildHandle attachChild = parent.attachChild(this);
        setParentHandle$kotlinx_coroutines_core(attachChild);
        if (isCompleted()) {
            attachChild.dispose();
            setParentHandle$kotlinx_coroutines_core(kotlinx.coroutines.NonDisposableHandle.INSTANCE);
        }
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) && ((kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core).getGetHighSpeedVideoSizes();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof kotlinx.coroutines.Incomplete);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
            return true;
        }
        return (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) && ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getHighSpeedVideoSizes();
    }

    private final java.lang.Object getHighSpeedVideoFpsRanges(kotlinx.coroutines.JobSupport.Finishing finishing, java.lang.Object obj) {
        boolean highSpeedVideoSizes;
        java.lang.Throwable highSpeedVideoFpsRangesFor;
        kotlinx.coroutines.internal.Symbol symbol;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && getState$kotlinx_coroutines_core() != finishing) {
            throw new java.lang.AssertionError();
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            java.lang.Object highSpeedVideoFpsRangesFor2 = finishing.getHighSpeedVideoFpsRangesFor();
            symbol = kotlinx.coroutines.JobSupportKt.getHighSpeedVideoFpsRangesFor;
            if (highSpeedVideoFpsRangesFor2 == symbol) {
                throw new java.lang.AssertionError();
            }
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !finishing.getHighResolutionOutputSizeshNQ4ISI()) {
            throw new java.lang.AssertionError();
        }
        kotlinx.coroutines.CompletedExceptionally completedExceptionally = obj instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) obj : null;
        java.lang.Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
        synchronized (finishing) {
            highSpeedVideoSizes = finishing.getHighSpeedVideoSizes();
            java.util.List<java.lang.Throwable> Camera2StreamConfigurationMap = finishing.Camera2StreamConfigurationMap(th);
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(finishing, Camera2StreamConfigurationMap);
            if (highSpeedVideoFpsRangesFor != null) {
                getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor, Camera2StreamConfigurationMap);
            }
        }
        if (highSpeedVideoFpsRangesFor != null && highSpeedVideoFpsRangesFor != th) {
            obj = new kotlinx.coroutines.CompletedExceptionally(highSpeedVideoFpsRangesFor, false, 2, null);
        }
        if (highSpeedVideoFpsRangesFor != null && (getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor) || handleJobException(highSpeedVideoFpsRangesFor))) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            ((kotlinx.coroutines.CompletedExceptionally) obj).makeHandled();
        }
        if (!highSpeedVideoSizes) {
            onCancelling(highSpeedVideoFpsRangesFor);
        }
        onCompletionInternal(obj);
        boolean m = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighResolutionOutputSizeshNQ4ISI, this, finishing, kotlinx.coroutines.JobSupportKt.boxIncomplete(obj));
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !m) {
            throw new java.lang.AssertionError();
        }
        getHighSpeedVideoSizes(finishing, obj);
        return obj;
    }

    private final java.lang.Throwable getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.JobSupport.Finishing finishing, java.util.List<? extends java.lang.Throwable> list) {
        java.lang.Object obj;
        java.lang.Object obj2 = null;
        if (list.isEmpty()) {
            if (finishing.getHighSpeedVideoSizes()) {
                return new kotlinx.coroutines.JobCancellationException(cancellationExceptionMessage(), null, this);
            }
            return null;
        }
        java.util.List<? extends java.lang.Throwable> list2 = list;
        java.util.Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((java.lang.Throwable) obj) instanceof java.util.concurrent.CancellationException)) {
                break;
            }
        }
        java.lang.Throwable th = (java.lang.Throwable) obj;
        if (th != null) {
            return th;
        }
        java.lang.Throwable th2 = list.get(0);
        if (th2 instanceof kotlinx.coroutines.TimeoutCancellationException) {
            java.util.Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next = it2.next();
                java.lang.Throwable th3 = (java.lang.Throwable) next;
                if (th3 != th2 && (th3 instanceof kotlinx.coroutines.TimeoutCancellationException)) {
                    obj2 = next;
                    break;
                }
            }
            java.lang.Throwable th4 = (java.lang.Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.Throwable th, java.util.List<? extends java.lang.Throwable> list) {
        if (list.size() > 1) {
            java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap(list.size()));
            java.lang.Throwable unwrapImpl = !kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() ? th : kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(th);
            for (java.lang.Throwable th2 : list) {
                if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
                    th2 = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(th2);
                }
                if (th2 != th && th2 != unwrapImpl && !(th2 instanceof java.util.concurrent.CancellationException) && newSetFromMap.add(th2)) {
                    kotlin.ExceptionsKt.addSuppressed(th, th2);
                }
            }
        }
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.Incomplete incomplete, java.lang.Object obj) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(incomplete instanceof kotlinx.coroutines.Empty) && !(incomplete instanceof kotlinx.coroutines.JobNode)) {
            throw new java.lang.AssertionError();
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && (obj instanceof kotlinx.coroutines.CompletedExceptionally)) {
            throw new java.lang.AssertionError();
        }
        if (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighResolutionOutputSizeshNQ4ISI, this, incomplete, kotlinx.coroutines.JobSupportKt.boxIncomplete(obj))) {
            return false;
        }
        onCancelling(null);
        onCompletionInternal(obj);
        getHighSpeedVideoSizes(incomplete, obj);
        return true;
    }

    private final void getHighSpeedVideoSizes(kotlinx.coroutines.Incomplete incomplete, java.lang.Object obj) {
        kotlinx.coroutines.ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            parentHandle$kotlinx_coroutines_core.dispose();
            setParentHandle$kotlinx_coroutines_core(kotlinx.coroutines.NonDisposableHandle.INSTANCE);
        }
        kotlinx.coroutines.CompletedExceptionally completedExceptionally = obj instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) obj : null;
        java.lang.Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
        if (incomplete instanceof kotlinx.coroutines.JobNode) {
            try {
                ((kotlinx.coroutines.JobNode) incomplete).invoke(th);
                return;
            } catch (java.lang.Throwable th2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception in completion handler ");
                sb.append(incomplete);
                sb.append(" for ");
                sb.append(this);
                handleOnCompletionException$kotlinx_coroutines_core(new kotlinx.coroutines.CompletionHandlerException(sb.toString(), th2));
                return;
            }
        }
        kotlinx.coroutines.NodeList camera2StreamConfigurationMap = incomplete.getCamera2StreamConfigurationMap();
        if (camera2StreamConfigurationMap != null) {
            getHighResolutionOutputSizeshNQ4ISI(camera2StreamConfigurationMap, th);
        }
    }

    private final void getHighSpeedVideoFpsRanges(kotlinx.coroutines.NodeList nodeList, java.lang.Throwable th) {
        onCancelling(th);
        nodeList.close(4);
        kotlinx.coroutines.NodeList nodeList2 = nodeList;
        java.lang.Object next = nodeList2.getNext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(next, "");
        kotlinx.coroutines.CompletionHandlerException completionHandlerException = null;
        for (kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(lockFreeLinkedListNode, nodeList2); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
            if ((lockFreeLinkedListNode instanceof kotlinx.coroutines.JobNode) && ((kotlinx.coroutines.JobNode) lockFreeLinkedListNode).getOnCancelling()) {
                try {
                    ((kotlinx.coroutines.JobNode) lockFreeLinkedListNode).invoke(th);
                } catch (java.lang.Throwable th2) {
                    kotlinx.coroutines.CompletionHandlerException completionHandlerException2 = completionHandlerException;
                    if (completionHandlerException2 != null) {
                        kotlin.ExceptionsKt.addSuppressed(completionHandlerException2, th2);
                        if (completionHandlerException2 != null) {
                        }
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception in completion handler ");
                    sb.append(lockFreeLinkedListNode);
                    sb.append(" for ");
                    sb.append(this);
                    completionHandlerException = new kotlinx.coroutines.CompletionHandlerException(sb.toString(), th2);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        }
        kotlinx.coroutines.CompletionHandlerException completionHandlerException3 = completionHandlerException;
        if (completionHandlerException3 != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException3);
        }
        getHighSpeedVideoFpsRangesFor(th);
    }

    private final boolean getHighSpeedVideoFpsRangesFor(java.lang.Throwable th) {
        if (isScopedCoroutine()) {
            return true;
        }
        boolean z = th instanceof java.util.concurrent.CancellationException;
        kotlinx.coroutines.ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        return (parentHandle$kotlinx_coroutines_core == null || parentHandle$kotlinx_coroutines_core == kotlinx.coroutines.NonDisposableHandle.INSTANCE) ? z : parentHandle$kotlinx_coroutines_core.childCancelled(th) || z;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.NodeList nodeList, java.lang.Throwable th) {
        nodeList.close(1);
        kotlinx.coroutines.NodeList nodeList2 = nodeList;
        java.lang.Object next = nodeList2.getNext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(next, "");
        kotlinx.coroutines.CompletionHandlerException completionHandlerException = null;
        for (kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(lockFreeLinkedListNode, nodeList2); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
            if (lockFreeLinkedListNode instanceof kotlinx.coroutines.JobNode) {
                try {
                    ((kotlinx.coroutines.JobNode) lockFreeLinkedListNode).invoke(th);
                } catch (java.lang.Throwable th2) {
                    kotlinx.coroutines.CompletionHandlerException completionHandlerException2 = completionHandlerException;
                    if (completionHandlerException2 != null) {
                        kotlin.ExceptionsKt.addSuppressed(completionHandlerException2, th2);
                        if (completionHandlerException2 != null) {
                        }
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception in completion handler ");
                    sb.append(lockFreeLinkedListNode);
                    sb.append(" for ");
                    sb.append(this);
                    completionHandlerException = new kotlinx.coroutines.CompletionHandlerException(sb.toString(), th2);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        }
        kotlinx.coroutines.CompletionHandlerException completionHandlerException3 = completionHandlerException;
        if (completionHandlerException3 != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException3);
        }
    }

    private final int getHighSpeedVideoSizes(java.lang.Object obj) {
        kotlinx.coroutines.Empty empty;
        if (obj instanceof kotlinx.coroutines.Empty) {
            if (((kotlinx.coroutines.Empty) obj).getGetHighSpeedVideoSizes()) {
                return 0;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighResolutionOutputSizeshNQ4ISI;
            empty = kotlinx.coroutines.JobSupportKt.getHighResolutionOutputSizeshNQ4ISI;
            if (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj, empty)) {
                return -1;
            }
            onStart();
            return 1;
        }
        if (!(obj instanceof kotlinx.coroutines.InactiveNodeList)) {
            return 0;
        }
        if (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighResolutionOutputSizeshNQ4ISI, this, obj, ((kotlinx.coroutines.InactiveNodeList) obj).getCamera2StreamConfigurationMap())) {
            return -1;
        }
        onStart();
        return 1;
    }

    @Override // kotlinx.coroutines.Job
    public final java.util.concurrent.CancellationException getCancellationException() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) {
            java.lang.Throwable highSpeedVideoFpsRanges = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getHighSpeedVideoFpsRanges();
            if (highSpeedVideoFpsRanges != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this));
                sb.append(" is cancelling");
                java.util.concurrent.CancellationException cancellationException = toCancellationException(highSpeedVideoFpsRanges, sb.toString());
                if (cancellationException != null) {
                    return cancellationException;
                }
            }
            throw new java.lang.IllegalStateException("Job is still new or active: ".concat(java.lang.String.valueOf(this)).toString());
        }
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) {
            throw new java.lang.IllegalStateException("Job is still new or active: ".concat(java.lang.String.valueOf(this)).toString());
        }
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
            return toCancellationException$default(this, ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause, null, 1, null);
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this));
        sb2.append(" has completed normally");
        return new kotlinx.coroutines.JobCancellationException(sb2.toString(), null, this);
    }

    public static /* synthetic */ java.util.concurrent.CancellationException toCancellationException$default(kotlinx.coroutines.JobSupport jobSupport, java.lang.Throwable th, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return jobSupport.toCancellationException(th, str);
    }

    protected final java.util.concurrent.CancellationException toCancellationException(java.lang.Throwable th, java.lang.String str) {
        java.util.concurrent.CancellationException cancellationException = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (str == null) {
            str = cancellationExceptionMessage();
        }
        return new kotlinx.coroutines.JobCancellationException(str, th, this);
    }

    protected final java.lang.Throwable getCompletionCause() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) {
            java.lang.Throwable highSpeedVideoFpsRanges = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getHighSpeedVideoFpsRanges();
            if (highSpeedVideoFpsRanges != null) {
                return highSpeedVideoFpsRanges;
            }
            throw new java.lang.IllegalStateException("Job is still new or active: ".concat(java.lang.String.valueOf(this)).toString());
        }
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) {
            throw new java.lang.IllegalStateException("Job is still new or active: ".concat(java.lang.String.valueOf(this)).toString());
        }
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
            return ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        }
        return null;
    }

    protected final boolean getCompletionCauseHandled() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) && ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).getHandled();
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        return invokeOnCompletionInternal$kotlinx_coroutines_core(true, new kotlinx.coroutines.InvokeOnCompletion(handler));
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        kotlinx.coroutines.InvokeOnCompletion invokeOnCompletion;
        if (onCancelling) {
            invokeOnCompletion = new kotlinx.coroutines.InvokeOnCancelling(handler);
        } else {
            invokeOnCompletion = new kotlinx.coroutines.InvokeOnCompletion(handler);
        }
        return invokeOnCompletionInternal$kotlinx_coroutines_core(invokeImmediately, invokeOnCompletion);
    }

    public final kotlinx.coroutines.DisposableHandle invokeOnCompletionInternal$kotlinx_coroutines_core(boolean invokeImmediately, kotlinx.coroutines.JobNode node) {
        boolean addLast;
        node.setJob(this);
        while (true) {
            java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Empty) {
                kotlinx.coroutines.Empty empty = (kotlinx.coroutines.Empty) state$kotlinx_coroutines_core;
                if (empty.getGetHighSpeedVideoSizes()) {
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighResolutionOutputSizeshNQ4ISI, this, state$kotlinx_coroutines_core, node)) {
                        break;
                    }
                } else {
                    getHighSpeedVideoSizes(empty);
                }
            } else {
                if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                    if (invokeImmediately) {
                        java.lang.Object state$kotlinx_coroutines_core2 = getState$kotlinx_coroutines_core();
                        kotlinx.coroutines.CompletedExceptionally completedExceptionally = state$kotlinx_coroutines_core2 instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core2 : null;
                        node.invoke(completedExceptionally != null ? completedExceptionally.cause : null);
                    }
                    return kotlinx.coroutines.NonDisposableHandle.INSTANCE;
                }
                kotlinx.coroutines.Incomplete incomplete = (kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core;
                kotlinx.coroutines.NodeList camera2StreamConfigurationMap = incomplete.getCamera2StreamConfigurationMap();
                if (camera2StreamConfigurationMap != null) {
                    if (node.getOnCancelling()) {
                        kotlinx.coroutines.JobSupport.Finishing finishing = incomplete instanceof kotlinx.coroutines.JobSupport.Finishing ? (kotlinx.coroutines.JobSupport.Finishing) incomplete : null;
                        java.lang.Throwable highSpeedVideoFpsRanges = finishing != null ? finishing.getHighSpeedVideoFpsRanges() : null;
                        if (highSpeedVideoFpsRanges == null) {
                            addLast = camera2StreamConfigurationMap.addLast(node, 5);
                        } else {
                            if (invokeImmediately) {
                                node.invoke(highSpeedVideoFpsRanges);
                            }
                            return kotlinx.coroutines.NonDisposableHandle.INSTANCE;
                        }
                    } else {
                        addLast = camera2StreamConfigurationMap.addLast(node, 1);
                    }
                    if (addLast) {
                        break;
                    }
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(state$kotlinx_coroutines_core, "");
                    getHighSpeedVideoSizes((kotlinx.coroutines.JobNode) state$kotlinx_coroutines_core);
                }
            }
        }
        return node;
    }

    private final void getHighSpeedVideoSizes(kotlinx.coroutines.Empty empty) {
        kotlinx.coroutines.NodeList nodeList = new kotlinx.coroutines.NodeList();
        androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighResolutionOutputSizeshNQ4ISI, this, empty, empty.getGetHighSpeedVideoSizes() ? nodeList : new kotlinx.coroutines.InactiveNodeList(nodeList));
    }

    private final void getHighSpeedVideoSizes(kotlinx.coroutines.JobNode jobNode) {
        jobNode.addOneIfEmpty(new kotlinx.coroutines.NodeList());
        androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighResolutionOutputSizeshNQ4ISI, this, jobNode, jobNode.getNextNode());
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.selects.SelectClause0 getOnJoin() {
        kotlinx.coroutines.JobSupport$onJoin$1 jobSupport$onJoin$1 = kotlinx.coroutines.JobSupport$onJoin$1.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(jobSupport$onJoin$1, "");
        return new kotlinx.coroutines.selects.SelectClause0Impl(this, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onJoin$1, 3), null, 4, null);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/coroutines/JobSupport$SelectOnJoinCompletionHandler;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/selects/SelectInstance;", "p0", "<init>", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/selects/SelectInstance;)V", "", "", "invoke", "(Ljava/lang/Throwable;)V", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/selects/SelectInstance;", "", "getOnCancelling", "()Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class SelectOnJoinCompletionHandler extends kotlinx.coroutines.JobNode {
        private final kotlinx.coroutines.selects.SelectInstance<?> Camera2StreamConfigurationMap;

        @Override // kotlinx.coroutines.JobNode
        public final boolean getOnCancelling() {
            return false;
        }

        public SelectOnJoinCompletionHandler(kotlinx.coroutines.selects.SelectInstance<?> selectInstance) {
            this.Camera2StreamConfigurationMap = selectInstance;
        }

        @Override // kotlinx.coroutines.JobNode
        public final void invoke(java.lang.Throwable p0) {
            this.Camera2StreamConfigurationMap.trySelect(kotlinx.coroutines.JobSupport.this, kotlin.Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public java.lang.String cancellationExceptionMessage() {
        return "Job was cancelled";
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(java.lang.Throwable cause) {
        kotlinx.coroutines.JobCancellationException jobCancellationException;
        if (cause == null || (jobCancellationException = toCancellationException$default(this, cause, null, 1, null)) == null) {
            jobCancellationException = new kotlinx.coroutines.JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(jobCancellationException);
        return true;
    }

    public void cancelInternal(java.lang.Throwable cause) {
        cancelImpl$kotlinx_coroutines_core(cause);
    }

    @Override // kotlinx.coroutines.ChildJob
    public final void parentCancelled(kotlinx.coroutines.ParentJob parentJob) {
        cancelImpl$kotlinx_coroutines_core(parentJob);
    }

    public boolean childCancelled(java.lang.Throwable cause) {
        if (cause instanceof java.util.concurrent.CancellationException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(cause) && getHandlesException();
    }

    public final boolean cancelCoroutine(java.lang.Throwable cause) {
        return cancelImpl$kotlinx_coroutines_core(cause);
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(java.lang.Object cause) {
        java.lang.Object obj;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        obj = kotlinx.coroutines.JobSupportKt.Camera2StreamConfigurationMap;
        if (getOnCancelComplete$kotlinx_coroutines_core() && (obj = getHighResolutionOutputSizeshNQ4ISI(cause)) == kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return true;
        }
        symbol = kotlinx.coroutines.JobSupportKt.Camera2StreamConfigurationMap;
        if (obj == symbol) {
            obj = getHighSpeedVideoFpsRangesFor(cause);
        }
        symbol2 = kotlinx.coroutines.JobSupportKt.Camera2StreamConfigurationMap;
        if (obj == symbol2 || obj == kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return true;
        }
        symbol3 = kotlinx.coroutines.JobSupportKt.getOutputMinFrameDuration;
        if (obj == symbol3) {
            return false;
        }
        afterCompletion(obj);
        return true;
    }

    public static /* synthetic */ kotlinx.coroutines.JobCancellationException defaultCancellationException$kotlinx_coroutines_core$default(kotlinx.coroutines.JobSupport jobSupport, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if (str == null) {
            str = jobSupport.cancellationExceptionMessage();
        }
        return new kotlinx.coroutines.JobCancellationException(str, th, jobSupport);
    }

    public final kotlinx.coroutines.JobCancellationException defaultCancellationException$kotlinx_coroutines_core(java.lang.String message, java.lang.Throwable cause) {
        if (message == null) {
            message = cancellationExceptionMessage();
        }
        return new kotlinx.coroutines.JobCancellationException(message, cause, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // kotlinx.coroutines.ParentJob
    public java.util.concurrent.CancellationException getChildJobCancellationCause() {
        java.util.concurrent.CancellationException cancellationException;
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) {
            cancellationException = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getHighSpeedVideoFpsRanges();
        } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
            cancellationException = ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        } else {
            if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) {
                throw new java.lang.IllegalStateException("Cannot be cancelling child in this state: ".concat(java.lang.String.valueOf(state$kotlinx_coroutines_core)).toString());
            }
            cancellationException = null;
        }
        java.util.concurrent.CancellationException cancellationException2 = cancellationException instanceof java.util.concurrent.CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Parent job is ");
        sb.append(getHighSpeedVideoFpsRanges(state$kotlinx_coroutines_core));
        return new kotlinx.coroutines.JobCancellationException(sb.toString(), cancellationException, this);
    }

    private final java.lang.Throwable Camera2StreamConfigurationMap(java.lang.Object obj) {
        if (obj == null || (obj instanceof java.lang.Throwable)) {
            java.lang.Throwable th = (java.lang.Throwable) obj;
            return th == null ? new kotlinx.coroutines.JobCancellationException(cancellationExceptionMessage(), null, this) : th;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return ((kotlinx.coroutines.ParentJob) obj).getChildJobCancellationCause();
    }

    private final kotlinx.coroutines.NodeList getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.Incomplete incomplete) {
        kotlinx.coroutines.NodeList camera2StreamConfigurationMap = incomplete.getCamera2StreamConfigurationMap();
        if (camera2StreamConfigurationMap != null) {
            return camera2StreamConfigurationMap;
        }
        if (incomplete instanceof kotlinx.coroutines.Empty) {
            return new kotlinx.coroutines.NodeList();
        }
        if (incomplete instanceof kotlinx.coroutines.JobNode) {
            getHighSpeedVideoSizes((kotlinx.coroutines.JobNode) incomplete);
            return null;
        }
        throw new java.lang.IllegalStateException("State should have list: ".concat(java.lang.String.valueOf(incomplete)).toString());
    }

    private final boolean Camera2StreamConfigurationMap(kotlinx.coroutines.Incomplete incomplete, java.lang.Throwable th) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && (incomplete instanceof kotlinx.coroutines.JobSupport.Finishing)) {
            throw new java.lang.AssertionError();
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !incomplete.getGetHighSpeedVideoSizes()) {
            throw new java.lang.AssertionError();
        }
        kotlinx.coroutines.NodeList highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(incomplete);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            return false;
        }
        if (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighResolutionOutputSizeshNQ4ISI, this, incomplete, new kotlinx.coroutines.JobSupport.Finishing(highResolutionOutputSizeshNQ4ISI, th))) {
            return false;
        }
        getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI, th);
        return true;
    }

    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, java.lang.Object obj2) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        if (!(obj instanceof kotlinx.coroutines.Incomplete)) {
            symbol2 = kotlinx.coroutines.JobSupportKt.Camera2StreamConfigurationMap;
            return symbol2;
        }
        if (((obj instanceof kotlinx.coroutines.Empty) || (obj instanceof kotlinx.coroutines.JobNode)) && !(obj instanceof kotlinx.coroutines.ChildHandleNode) && !(obj2 instanceof kotlinx.coroutines.CompletedExceptionally)) {
            if (getHighResolutionOutputSizeshNQ4ISI((kotlinx.coroutines.Incomplete) obj, obj2)) {
                return obj2;
            }
            symbol = kotlinx.coroutines.JobSupportKt.getHighSpeedVideoFpsRanges;
            return symbol;
        }
        return getHighSpeedVideoFpsRanges((kotlinx.coroutines.Incomplete) obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final java.lang.Object getHighSpeedVideoFpsRanges(kotlinx.coroutines.Incomplete incomplete, java.lang.Object obj) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.NodeList highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(incomplete);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            symbol4 = kotlinx.coroutines.JobSupportKt.getHighSpeedVideoFpsRanges;
            return symbol4;
        }
        kotlinx.coroutines.JobSupport.Finishing finishing = incomplete instanceof kotlinx.coroutines.JobSupport.Finishing ? (kotlinx.coroutines.JobSupport.Finishing) incomplete : null;
        if (finishing == null) {
            finishing = new kotlinx.coroutines.JobSupport.Finishing(highResolutionOutputSizeshNQ4ISI, null);
        }
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        synchronized (finishing) {
            if (finishing.getHighResolutionOutputSizeshNQ4ISI()) {
                symbol3 = kotlinx.coroutines.JobSupportKt.Camera2StreamConfigurationMap;
                return symbol3;
            }
            finishing.Camera2StreamConfigurationMap();
            if (finishing != incomplete && !androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighResolutionOutputSizeshNQ4ISI, this, incomplete, finishing)) {
                symbol2 = kotlinx.coroutines.JobSupportKt.getHighSpeedVideoFpsRanges;
                return symbol2;
            }
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                java.lang.Object highSpeedVideoFpsRangesFor = finishing.getHighSpeedVideoFpsRangesFor();
                symbol = kotlinx.coroutines.JobSupportKt.getHighSpeedVideoFpsRangesFor;
                if (highSpeedVideoFpsRangesFor == symbol) {
                    throw new java.lang.AssertionError();
                }
            }
            boolean highSpeedVideoSizes = finishing.getHighSpeedVideoSizes();
            kotlinx.coroutines.CompletedExceptionally completedExceptionally = obj instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) obj : null;
            if (completedExceptionally != null) {
                finishing.getHighSpeedVideoFpsRanges(completedExceptionally.cause);
            }
            objectRef.element = highSpeedVideoSizes ^ true ? finishing.getHighSpeedVideoFpsRanges() : 0;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            java.lang.Throwable th = (java.lang.Throwable) objectRef.element;
            if (th != null) {
                getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI, th);
            }
            kotlinx.coroutines.NodeList nodeList = highResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.ChildHandleNode Camera2StreamConfigurationMap = Camera2StreamConfigurationMap((kotlinx.coroutines.internal.LockFreeLinkedListNode) nodeList);
            if (Camera2StreamConfigurationMap != null && getHighResolutionOutputSizeshNQ4ISI(finishing, Camera2StreamConfigurationMap, obj)) {
                return kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN;
            }
            highResolutionOutputSizeshNQ4ISI.close(2);
            kotlinx.coroutines.ChildHandleNode Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap((kotlinx.coroutines.internal.LockFreeLinkedListNode) nodeList);
            if (Camera2StreamConfigurationMap2 != null && getHighResolutionOutputSizeshNQ4ISI(finishing, Camera2StreamConfigurationMap2, obj)) {
                return kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN;
            }
            return getHighSpeedVideoFpsRanges(finishing, obj);
        }
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.JobSupport.Finishing finishing, kotlinx.coroutines.ChildHandleNode childHandleNode, java.lang.Object obj) {
        while (kotlinx.coroutines.JobKt.invokeOnCompletion(childHandleNode.getHighSpeedVideoSizes, false, new kotlinx.coroutines.JobSupport.ChildCompletion(this, finishing, childHandleNode, obj)) == kotlinx.coroutines.NonDisposableHandle.INSTANCE) {
            childHandleNode = Camera2StreamConfigurationMap((kotlinx.coroutines.internal.LockFreeLinkedListNode) childHandleNode);
            if (childHandleNode == null) {
                return false;
            }
        }
        return true;
    }

    private static kotlinx.coroutines.ChildHandleNode Camera2StreamConfigurationMap(kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.isRemoved()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getPrevNode();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (!lockFreeLinkedListNode.isRemoved()) {
                if (lockFreeLinkedListNode instanceof kotlinx.coroutines.ChildHandleNode) {
                    return (kotlinx.coroutines.ChildHandleNode) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof kotlinx.coroutines.NodeList) {
                    return null;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.Job
    public final kotlin.sequences.Sequence<kotlinx.coroutines.Job> getChildren() {
        return kotlin.sequences.SequencesKt.sequence(new kotlinx.coroutines.JobSupport$children$1(this, null));
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.ChildHandle attachChild(kotlinx.coroutines.ChildJob child) {
        kotlinx.coroutines.ChildHandleNode childHandleNode = new kotlinx.coroutines.ChildHandleNode(child);
        childHandleNode.setJob(this);
        while (true) {
            java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Empty) {
                kotlinx.coroutines.Empty empty = (kotlinx.coroutines.Empty) state$kotlinx_coroutines_core;
                if (empty.getGetHighSpeedVideoSizes()) {
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighResolutionOutputSizeshNQ4ISI, this, state$kotlinx_coroutines_core, childHandleNode)) {
                        break;
                    }
                } else {
                    getHighSpeedVideoSizes(empty);
                }
            } else {
                if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                    java.lang.Object state$kotlinx_coroutines_core2 = getState$kotlinx_coroutines_core();
                    kotlinx.coroutines.CompletedExceptionally completedExceptionally = state$kotlinx_coroutines_core2 instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core2 : null;
                    childHandleNode.invoke(completedExceptionally != null ? completedExceptionally.cause : null);
                    return kotlinx.coroutines.NonDisposableHandle.INSTANCE;
                }
                kotlinx.coroutines.NodeList camera2StreamConfigurationMap = ((kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core).getCamera2StreamConfigurationMap();
                if (camera2StreamConfigurationMap != null) {
                    kotlinx.coroutines.ChildHandleNode childHandleNode2 = childHandleNode;
                    if (!camera2StreamConfigurationMap.addLast(childHandleNode2, 7)) {
                        boolean addLast = camera2StreamConfigurationMap.addLast(childHandleNode2, 3);
                        java.lang.Object state$kotlinx_coroutines_core3 = getState$kotlinx_coroutines_core();
                        if (state$kotlinx_coroutines_core3 instanceof kotlinx.coroutines.JobSupport.Finishing) {
                            r2 = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core3).getHighSpeedVideoFpsRanges();
                        } else {
                            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && (state$kotlinx_coroutines_core3 instanceof kotlinx.coroutines.Incomplete)) {
                                throw new java.lang.AssertionError();
                            }
                            kotlinx.coroutines.CompletedExceptionally completedExceptionally2 = state$kotlinx_coroutines_core3 instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core3 : null;
                            if (completedExceptionally2 != null) {
                                r2 = completedExceptionally2.cause;
                            }
                        }
                        childHandleNode.invoke(r2);
                        if (addLast) {
                            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && r2 == null) {
                                throw new java.lang.AssertionError();
                            }
                        } else {
                            return kotlinx.coroutines.NonDisposableHandle.INSTANCE;
                        }
                    }
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(state$kotlinx_coroutines_core, "");
                    getHighSpeedVideoSizes((kotlinx.coroutines.JobNode) state$kotlinx_coroutines_core);
                }
            }
        }
        return childHandleNode;
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(java.lang.Throwable exception) {
        throw exception;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(toDebugString());
        sb.append('@');
        sb.append(kotlinx.coroutines.DebugStringsKt.getHexAddress(this));
        return sb.toString();
    }

    public final java.lang.String toDebugString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(nameString$kotlinx_coroutines_core());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
        sb.append(getHighSpeedVideoFpsRanges(getState$kotlinx_coroutines_core()));
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public java.lang.String nameString$kotlinx_coroutines_core() {
        return kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this);
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.Object obj) {
        if (!(obj instanceof kotlinx.coroutines.JobSupport.Finishing)) {
            return obj instanceof kotlinx.coroutines.Incomplete ? ((kotlinx.coroutines.Incomplete) obj).getGetHighSpeedVideoSizes() ? "Active" : "New" : obj instanceof kotlinx.coroutines.CompletedExceptionally ? "Cancelled" : com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE;
        }
        kotlinx.coroutines.JobSupport.Finishing finishing = (kotlinx.coroutines.JobSupport.Finishing) obj;
        return finishing.getHighSpeedVideoSizes() ? "Cancelling" : finishing.getHighResolutionOutputSizeshNQ4ISI() ? "Completing" : "Active";
    }

    @kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0$2\b\u0010%\u001a\u0004\u0018\u00010\tJ\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\tJ\u0018\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\t0*j\b\u0012\u0004\u0012\u00020\t`+H\u0002J\b\u0010,\u001a\u00020-H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\t\u0010\u000e\u001a\u00020\u000fX\u0082\u0004R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0015X\u0082\u0004R(\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015X\u0082\u0004R(\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b \u0010\u0011R\u0011\u0010!\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\u0011R\u0014\u0010\"\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011¨\u0006."}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;", "list", "Lkotlinx/coroutines/NodeList;", "isCompleting", "", "rootCause", "", "<init>", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "getList", "()Lkotlinx/coroutines/NodeList;", "_isCompleting", "Lkotlinx/atomicfu/AtomicBoolean;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "()Z", "setCompleting", "(Z)V", "_rootCause", "Lkotlinx/atomicfu/AtomicRef;", "getRootCause", "()Ljava/lang/Throwable;", "setRootCause", "(Ljava/lang/Throwable;)V", "_exceptionsHolder", "exceptionsHolder", "getExceptionsHolder", "()Ljava/lang/Object;", "setExceptionsHolder", "(Ljava/lang/Object;)V", "isSealed", "isCancelling", "isActive", "sealLocked", "", "proposedException", "addExceptionLocked", "", "exception", "allocateList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Finishing implements kotlinx.coroutines.Incomplete {
        private final kotlinx.coroutines.NodeList Camera2StreamConfigurationMap;
        private volatile /* synthetic */ java.lang.Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile = 0;
        private volatile /* synthetic */ java.lang.Object _rootCause$volatile;
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighSpeedVideoFpsRangesFor = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.JobSupport.Finishing.class, "_isCompleting$volatile");
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.JobSupport.Finishing.class, java.lang.Object.class, "_rootCause$volatile");
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.JobSupport.Finishing.class, java.lang.Object.class, "_exceptionsHolder$volatile");

        @Override // kotlinx.coroutines.Incomplete
        /* renamed from: getList, reason: from getter */
        public final kotlinx.coroutines.NodeList getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        public Finishing(kotlinx.coroutines.NodeList nodeList, java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap = nodeList;
            this._rootCause$volatile = th;
        }

        public final boolean getHighSpeedVideoSizes() {
            return getHighSpeedVideoFpsRanges() != null;
        }

        @Override // kotlinx.coroutines.Incomplete
        /* renamed from: isActive */
        public final boolean getGetHighSpeedVideoSizes() {
            return getHighSpeedVideoFpsRanges() == null;
        }

        public final java.util.List<java.lang.Throwable> Camera2StreamConfigurationMap(java.lang.Throwable th) {
            java.util.AbstractList abstractList;
            kotlinx.coroutines.internal.Symbol symbol;
            java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            if (highSpeedVideoFpsRangesFor == null) {
                abstractList = getInputFormats();
            } else if (highSpeedVideoFpsRangesFor instanceof java.lang.Throwable) {
                java.util.AbstractList inputFormats = getInputFormats();
                inputFormats.add(highSpeedVideoFpsRangesFor);
                abstractList = inputFormats;
            } else {
                if (!(highSpeedVideoFpsRangesFor instanceof java.util.ArrayList)) {
                    throw new java.lang.IllegalStateException("State is ".concat(java.lang.String.valueOf(highSpeedVideoFpsRangesFor)).toString());
                }
                abstractList = (java.util.ArrayList) highSpeedVideoFpsRangesFor;
            }
            java.lang.Throwable highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            if (highSpeedVideoFpsRanges != null) {
                abstractList.add(0, highSpeedVideoFpsRanges);
            }
            if (th != null && !kotlin.jvm.internal.Intrinsics.areEqual(th, highSpeedVideoFpsRanges)) {
                abstractList.add(th);
            }
            symbol = kotlinx.coroutines.JobSupportKt.getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges(symbol);
            return abstractList;
        }

        public final void getHighSpeedVideoFpsRanges(java.lang.Throwable th) {
            java.lang.Throwable highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            if (highSpeedVideoFpsRanges == null) {
                getHighResolutionOutputSizeshNQ4ISI(th);
                return;
            }
            if (th != highSpeedVideoFpsRanges) {
                java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
                if (highSpeedVideoFpsRangesFor == null) {
                    getHighSpeedVideoFpsRanges((java.lang.Object) th);
                    return;
                }
                if (!(highSpeedVideoFpsRangesFor instanceof java.lang.Throwable)) {
                    if (!(highSpeedVideoFpsRangesFor instanceof java.util.ArrayList)) {
                        throw new java.lang.IllegalStateException("State is ".concat(java.lang.String.valueOf(highSpeedVideoFpsRangesFor)).toString());
                    }
                    ((java.util.ArrayList) highSpeedVideoFpsRangesFor).add(th);
                } else {
                    if (th == highSpeedVideoFpsRangesFor) {
                        return;
                    }
                    java.util.AbstractCollection inputFormats = getInputFormats();
                    inputFormats.add(highSpeedVideoFpsRangesFor);
                    inputFormats.add(th);
                    getHighSpeedVideoFpsRanges(inputFormats);
                }
            }
        }

        private static java.util.ArrayList<java.lang.Throwable> getInputFormats() {
            return new java.util.ArrayList<>(4);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Finishing[cancelling=");
            sb.append(getHighSpeedVideoSizes());
            sb.append(", completing=");
            sb.append(getHighResolutionOutputSizeshNQ4ISI());
            sb.append(", rootCause=");
            sb.append(getHighSpeedVideoFpsRanges());
            sb.append(", exceptions=");
            sb.append(getHighSpeedVideoFpsRangesFor());
            sb.append(", list=");
            sb.append(getCamera2StreamConfigurationMap());
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            return sb.toString();
        }

        final java.lang.Object getHighSpeedVideoFpsRangesFor() {
            return getHighSpeedVideoFpsRanges.get(this);
        }

        private final void getHighSpeedVideoFpsRanges(java.lang.Object obj) {
            getHighSpeedVideoFpsRanges.set(this, obj);
        }

        public final java.lang.Throwable getHighSpeedVideoFpsRanges() {
            return (java.lang.Throwable) getHighResolutionOutputSizeshNQ4ISI.get(this);
        }

        public final boolean getHighResolutionOutputSizeshNQ4ISI() {
            return getHighSpeedVideoFpsRangesFor.get(this) == 1;
        }

        public final void Camera2StreamConfigurationMap() {
            getHighSpeedVideoFpsRangesFor.set(this, 1);
        }

        private void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
            getHighResolutionOutputSizeshNQ4ISI.set(this, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/JobSupport;", "p0", "Lkotlinx/coroutines/JobSupport$Finishing;", "p1", "Lkotlinx/coroutines/ChildHandleNode;", "p2", "", "p3", "<init>", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "", "", "invoke", "(Ljava/lang/Throwable;)V", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/JobSupport;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/JobSupport$Finishing;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/ChildHandleNode;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "", "getOnCancelling", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class ChildCompletion extends kotlinx.coroutines.JobNode {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final kotlinx.coroutines.JobSupport.Finishing getHighSpeedVideoSizes;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final kotlinx.coroutines.ChildHandleNode getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final kotlinx.coroutines.JobSupport Camera2StreamConfigurationMap;

        @Override // kotlinx.coroutines.JobNode
        public final boolean getOnCancelling() {
            return false;
        }

        public ChildCompletion(kotlinx.coroutines.JobSupport jobSupport, kotlinx.coroutines.JobSupport.Finishing finishing, kotlinx.coroutines.ChildHandleNode childHandleNode, java.lang.Object obj) {
            this.Camera2StreamConfigurationMap = jobSupport;
            this.getHighSpeedVideoSizes = finishing;
            this.getHighSpeedVideoFpsRanges = childHandleNode;
            this.getHighResolutionOutputSizeshNQ4ISI = obj;
        }

        @Override // kotlinx.coroutines.JobNode
        public final void invoke(java.lang.Throwable p0) {
            kotlinx.coroutines.JobSupport.access$continueCompleting(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlinx/coroutines/JobSupport$AwaitContinuation;", "T", "Lkotlinx/coroutines/CancellableContinuationImpl;", "Lkotlin/coroutines/Continuation;", "p0", "Lkotlinx/coroutines/JobSupport;", "p1", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V", "Lkotlinx/coroutines/Job;", "", "getContinuationCancellationCause", "(Lkotlinx/coroutines/Job;)Ljava/lang/Throwable;", "", "nameString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/JobSupport;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class AwaitContinuation<T> extends kotlinx.coroutines.CancellableContinuationImpl<T> {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final kotlinx.coroutines.JobSupport getHighSpeedVideoFpsRanges;

        public AwaitContinuation(kotlin.coroutines.Continuation<? super T> continuation, kotlinx.coroutines.JobSupport jobSupport) {
            super(continuation, 1);
            this.getHighSpeedVideoFpsRanges = jobSupport;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public final java.lang.Throwable getContinuationCancellationCause(kotlinx.coroutines.Job p0) {
            java.lang.Throwable highSpeedVideoFpsRanges;
            java.lang.Object state$kotlinx_coroutines_core = this.getHighSpeedVideoFpsRanges.getState$kotlinx_coroutines_core();
            return (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) || (highSpeedVideoFpsRanges = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getHighSpeedVideoFpsRanges()) == null) ? state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally ? ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause : p0.getCancellationException() : highSpeedVideoFpsRanges;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        protected final java.lang.String nameString() {
            return "AwaitContinuation";
        }
    }

    public final boolean isCompletedExceptionally() {
        return getState$kotlinx_coroutines_core() instanceof kotlinx.coroutines.CompletedExceptionally;
    }

    public final java.lang.Throwable getCompletionExceptionOrNull() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) {
            throw new java.lang.IllegalStateException("This job has not completed yet".toString());
        }
        kotlinx.coroutines.CompletedExceptionally completedExceptionally = state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core : null;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    public final java.lang.Object getCompletedInternal$kotlinx_coroutines_core() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) {
            throw new java.lang.IllegalStateException("This job has not completed yet".toString());
        }
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
            throw ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        }
        return kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core);
    }

    protected final java.lang.Object awaitInternal(kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        java.lang.Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
                    java.lang.Throwable th = ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause;
                    if (!kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
                        throw th;
                    }
                    if (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
                        throw kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(th, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
                    }
                    throw th;
                }
                return kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core);
            }
        } while (getHighSpeedVideoSizes(state$kotlinx_coroutines_core) < 0);
        return getHighSpeedVideoSizes(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        kotlinx.coroutines.JobSupport.AwaitContinuation awaitContinuation = new kotlinx.coroutines.JobSupport.AwaitContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), this);
        awaitContinuation.initCancellability();
        kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(awaitContinuation, kotlinx.coroutines.JobKt__JobKt.invokeOnCompletion$default(this, false, new kotlinx.coroutines.ResumeAwaitOnCompletion(awaitContinuation), 1, null));
        java.lang.Object result = awaitContinuation.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    protected final kotlinx.coroutines.selects.SelectClause1<?> getOnAwaitInternal() {
        kotlinx.coroutines.JobSupport$onAwaitInternal$1 jobSupport$onAwaitInternal$1 = kotlinx.coroutines.JobSupport$onAwaitInternal$1.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(jobSupport$onAwaitInternal$1, "");
        kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onAwaitInternal$1, 3);
        kotlinx.coroutines.JobSupport$onAwaitInternal$2 jobSupport$onAwaitInternal$2 = kotlinx.coroutines.JobSupport$onAwaitInternal$2.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(jobSupport$onAwaitInternal$2, "");
        return new kotlinx.coroutines.selects.SelectClause1Impl(this, function3, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onAwaitInternal$2, 3), null, 8, null);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/coroutines/JobSupport$SelectOnAwaitCompletionHandler;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/selects/SelectInstance;", "p0", "<init>", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/selects/SelectInstance;)V", "", "", "invoke", "(Ljava/lang/Throwable;)V", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/selects/SelectInstance;", "getHighResolutionOutputSizeshNQ4ISI", "", "getOnCancelling", "()Z", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class SelectOnAwaitCompletionHandler extends kotlinx.coroutines.JobNode {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final kotlinx.coroutines.selects.SelectInstance<?> getHighResolutionOutputSizeshNQ4ISI;

        @Override // kotlinx.coroutines.JobNode
        public final boolean getOnCancelling() {
            return false;
        }

        public SelectOnAwaitCompletionHandler(kotlinx.coroutines.selects.SelectInstance<?> selectInstance) {
            this.getHighResolutionOutputSizeshNQ4ISI = selectInstance;
        }

        @Override // kotlinx.coroutines.JobNode
        public final void invoke(java.lang.Throwable p0) {
            java.lang.Object state$kotlinx_coroutines_core = kotlinx.coroutines.JobSupport.this.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally)) {
                state$kotlinx_coroutines_core = kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.trySelect(kotlinx.coroutines.JobSupport.this, state$kotlinx_coroutines_core);
        }
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int highSpeedVideoSizes;
        do {
            highSpeedVideoSizes = getHighSpeedVideoSizes(getState$kotlinx_coroutines_core());
            if (highSpeedVideoSizes == 0) {
                return false;
            }
        } while (highSpeedVideoSizes != 1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl2, kotlinx.coroutines.JobKt__JobKt.invokeOnCompletion$default(this, false, new kotlinx.coroutines.ResumeOnCompletion(cancellableContinuationImpl2), 1, null));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    public final void removeNode$kotlinx_coroutines_core(kotlinx.coroutines.JobNode node) {
        java.lang.Object state$kotlinx_coroutines_core;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        kotlinx.coroutines.Empty empty;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobNode)) {
                if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) || ((kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core).getCamera2StreamConfigurationMap() == null) {
                    return;
                }
                node.mo24119remove();
                return;
            }
            if (state$kotlinx_coroutines_core != node) {
                return;
            }
            atomicReferenceFieldUpdater = getHighResolutionOutputSizeshNQ4ISI;
            empty = kotlinx.coroutines.JobSupportKt.getHighResolutionOutputSizeshNQ4ISI;
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, state$kotlinx_coroutines_core, empty));
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(java.util.concurrent.CancellationException cause) {
        if (cause == null) {
            cause = new kotlinx.coroutines.JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cause);
    }

    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
        kotlinx.coroutines.internal.Symbol symbol;
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        kotlinx.coroutines.internal.Symbol symbol2;
        do {
            java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) || ((state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) && ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getHighResolutionOutputSizeshNQ4ISI())) {
                symbol = kotlinx.coroutines.JobSupportKt.Camera2StreamConfigurationMap;
                return symbol;
            }
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(state$kotlinx_coroutines_core, new kotlinx.coroutines.CompletedExceptionally(Camera2StreamConfigurationMap(obj), false, 2, null));
            symbol2 = kotlinx.coroutines.JobSupportKt.getHighSpeedVideoFpsRanges;
        } while (highResolutionOutputSizeshNQ4ISI == symbol2);
        return highResolutionOutputSizeshNQ4ISI;
    }

    private final java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.internal.Symbol symbol6;
        kotlinx.coroutines.internal.Symbol symbol7;
        java.lang.Throwable th = null;
        while (true) {
            java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing)) {
                if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                    symbol4 = kotlinx.coroutines.JobSupportKt.getOutputMinFrameDuration;
                    return symbol4;
                }
                if (th == null) {
                    th = Camera2StreamConfigurationMap(obj);
                }
                kotlinx.coroutines.Incomplete incomplete = (kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core;
                if (incomplete.getGetHighSpeedVideoSizes()) {
                    if (Camera2StreamConfigurationMap(incomplete, th)) {
                        symbol5 = kotlinx.coroutines.JobSupportKt.Camera2StreamConfigurationMap;
                        return symbol5;
                    }
                } else {
                    java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(state$kotlinx_coroutines_core, new kotlinx.coroutines.CompletedExceptionally(th, false, 2, null));
                    symbol6 = kotlinx.coroutines.JobSupportKt.Camera2StreamConfigurationMap;
                    if (highResolutionOutputSizeshNQ4ISI != symbol6) {
                        symbol7 = kotlinx.coroutines.JobSupportKt.getHighSpeedVideoFpsRanges;
                        if (highResolutionOutputSizeshNQ4ISI != symbol7) {
                            return highResolutionOutputSizeshNQ4ISI;
                        }
                    } else {
                        throw new java.lang.IllegalStateException("Cannot happen in ".concat(java.lang.String.valueOf(state$kotlinx_coroutines_core)).toString());
                    }
                }
            } else {
                synchronized (state$kotlinx_coroutines_core) {
                    java.lang.Object highSpeedVideoFpsRangesFor = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getHighSpeedVideoFpsRangesFor();
                    symbol = kotlinx.coroutines.JobSupportKt.getHighSpeedVideoFpsRangesFor;
                    if (highSpeedVideoFpsRangesFor == symbol) {
                        symbol3 = kotlinx.coroutines.JobSupportKt.getOutputMinFrameDuration;
                        return symbol3;
                    }
                    boolean highSpeedVideoSizes = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getHighSpeedVideoSizes();
                    if (obj != null || !highSpeedVideoSizes) {
                        if (th == null) {
                            th = Camera2StreamConfigurationMap(obj);
                        }
                        ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getHighSpeedVideoFpsRanges(th);
                    }
                    java.lang.Throwable highSpeedVideoFpsRanges = highSpeedVideoSizes ? null : ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getHighSpeedVideoFpsRanges();
                    if (highSpeedVideoFpsRanges != null) {
                        getHighSpeedVideoFpsRanges(((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getCamera2StreamConfigurationMap(), highSpeedVideoFpsRanges);
                    }
                    symbol2 = kotlinx.coroutines.JobSupportKt.Camera2StreamConfigurationMap;
                    return symbol2;
                }
            }
        }
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(java.lang.Object proposedUpdate) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        do {
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(getState$kotlinx_coroutines_core(), proposedUpdate);
            symbol = kotlinx.coroutines.JobSupportKt.Camera2StreamConfigurationMap;
            if (highResolutionOutputSizeshNQ4ISI == symbol) {
                return false;
            }
            if (highResolutionOutputSizeshNQ4ISI == kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN) {
                return true;
            }
            symbol2 = kotlinx.coroutines.JobSupportKt.getHighSpeedVideoFpsRanges;
        } while (highResolutionOutputSizeshNQ4ISI == symbol2);
        afterCompletion(highResolutionOutputSizeshNQ4ISI);
        return true;
    }

    public final java.lang.Object makeCompletingOnce$kotlinx_coroutines_core(java.lang.Object proposedUpdate) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        do {
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(getState$kotlinx_coroutines_core(), proposedUpdate);
            symbol = kotlinx.coroutines.JobSupportKt.Camera2StreamConfigurationMap;
            if (highResolutionOutputSizeshNQ4ISI != symbol) {
                symbol2 = kotlinx.coroutines.JobSupportKt.getHighSpeedVideoFpsRanges;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Job ");
                sb.append(this);
                sb.append(" is already complete or completing, but is being completed with ");
                sb.append(proposedUpdate);
                java.lang.String obj = sb.toString();
                kotlinx.coroutines.CompletedExceptionally completedExceptionally = proposedUpdate instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) proposedUpdate : null;
                throw new java.lang.IllegalStateException(obj, completedExceptionally != null ? completedExceptionally.cause : null);
            }
        } while (highResolutionOutputSizeshNQ4ISI == symbol2);
        return highResolutionOutputSizeshNQ4ISI;
    }

    public static final /* synthetic */ void access$continueCompleting(kotlinx.coroutines.JobSupport jobSupport, kotlinx.coroutines.JobSupport.Finishing finishing, kotlinx.coroutines.ChildHandleNode childHandleNode, java.lang.Object obj) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && jobSupport.getState$kotlinx_coroutines_core() != finishing) {
            throw new java.lang.AssertionError();
        }
        kotlinx.coroutines.ChildHandleNode childHandleNode2 = childHandleNode;
        kotlinx.coroutines.ChildHandleNode Camera2StreamConfigurationMap = Camera2StreamConfigurationMap((kotlinx.coroutines.internal.LockFreeLinkedListNode) childHandleNode2);
        if (Camera2StreamConfigurationMap == null || !jobSupport.getHighResolutionOutputSizeshNQ4ISI(finishing, Camera2StreamConfigurationMap, obj)) {
            finishing.getCamera2StreamConfigurationMap().close(2);
            kotlinx.coroutines.ChildHandleNode Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap((kotlinx.coroutines.internal.LockFreeLinkedListNode) childHandleNode2);
            if (Camera2StreamConfigurationMap2 == null || !jobSupport.getHighResolutionOutputSizeshNQ4ISI(finishing, Camera2StreamConfigurationMap2, obj)) {
                jobSupport.afterCompletion(jobSupport.getHighSpeedVideoFpsRanges(finishing, obj));
            }
        }
    }

    public static final /* synthetic */ java.lang.Object access$onAwaitInternalProcessResFunc(kotlinx.coroutines.JobSupport jobSupport, java.lang.Object obj, java.lang.Object obj2) {
        if (obj2 instanceof kotlinx.coroutines.CompletedExceptionally) {
            throw ((kotlinx.coroutines.CompletedExceptionally) obj2).cause;
        }
        return obj2;
    }

    public static final /* synthetic */ void access$onAwaitInternalRegFunc(kotlinx.coroutines.JobSupport jobSupport, kotlinx.coroutines.selects.SelectInstance selectInstance, java.lang.Object obj) {
        java.lang.Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = jobSupport.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally)) {
                    state$kotlinx_coroutines_core = kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core);
                }
                selectInstance.selectInRegistrationPhase(state$kotlinx_coroutines_core);
                return;
            }
        } while (jobSupport.getHighSpeedVideoSizes(state$kotlinx_coroutines_core) < 0);
        selectInstance.disposeOnCompletion(kotlinx.coroutines.JobKt__JobKt.invokeOnCompletion$default(jobSupport, false, jobSupport.new SelectOnAwaitCompletionHandler(selectInstance), 1, null));
    }

    public static final /* synthetic */ void access$registerSelectForOnJoin(kotlinx.coroutines.JobSupport jobSupport, kotlinx.coroutines.selects.SelectInstance selectInstance, java.lang.Object obj) {
        java.lang.Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = jobSupport.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                selectInstance.selectInRegistrationPhase(kotlin.Unit.INSTANCE);
                return;
            }
        } while (jobSupport.getHighSpeedVideoSizes(state$kotlinx_coroutines_core) < 0);
        selectInstance.disposeOnCompletion(kotlinx.coroutines.JobKt__JobKt.invokeOnCompletion$default(jobSupport, false, jobSupport.new SelectOnJoinCompletionHandler(selectInstance), 1, null));
    }

    public final kotlinx.coroutines.ChildHandle getParentHandle$kotlinx_coroutines_core() {
        return (kotlinx.coroutines.ChildHandle) getHighSpeedVideoFpsRangesFor.get(this);
    }

    public final java.lang.Object getState$kotlinx_coroutines_core() {
        return getHighResolutionOutputSizeshNQ4ISI.get(this);
    }

    @Override // kotlinx.coroutines.Job
    public final java.lang.Object join(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                kotlinx.coroutines.JobKt.ensureActive(continuation.getGetInputFormats());
                return kotlin.Unit.INSTANCE;
            }
        } while (getHighSpeedVideoSizes(state$kotlinx_coroutines_core) < 0);
        java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(continuation);
        return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
    }

    public final void setParentHandle$kotlinx_coroutines_core(kotlinx.coroutines.ChildHandle childHandle) {
        getHighSpeedVideoFpsRangesFor.set(this, childHandle);
    }
}
