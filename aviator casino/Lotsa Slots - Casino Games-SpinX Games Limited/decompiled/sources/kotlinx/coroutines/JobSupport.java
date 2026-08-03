package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@kotlin.Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\n·\u0001¸\u0001¹\u0001º\u0001»\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0004J\u001f\u0010\u001f\u001a\u00020 2\u0014\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u001b0\"H\u0082\bJ\u001c\u0010'\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0002J \u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u001c\u001a\u00020(2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0-H\u0002J\u001e\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0-H\u0002J\u001a\u00100\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u00103\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020+H\u0002J\u0010\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u00020+H\u0002J\u0016\u00109\u001a\u00020\u001b*\u0002062\b\u00107\u001a\u0004\u0018\u00010+H\u0002J/\u0010:\u001a\u00020\u001b2\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010+2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00050\"H\u0082\bJ\u0006\u0010=\u001a\u00020\u0005J\u0012\u0010>\u001a\u00020?2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010@\u001a\u00020\u001bH\u0014J\u000f\u0010A\u001a\u00060Bj\u0002`C¢\u0006\u0002\u0010DJ!\u0010E\u001a\u00060Bj\u0002`C*\u00020+2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010GH\u0004¢\u0006\u0002\u0010HJ/\u0010N\u001a\u00020O2'\u0010P\u001a#\u0012\u0015\u0012\u0013\u0018\u00010+¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u001b0\"j\u0002`SJ?\u0010N\u001a\u00020O2\u0006\u0010T\u001a\u00020\u00052\u0006\u0010U\u001a\u00020\u00052'\u0010P\u001a#\u0012\u0015\u0012\u0013\u0018\u00010+¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u001b0\"j\u0002`SJ\u001d\u0010V\u001a\u00020O2\u0006\u0010U\u001a\u00020\u00052\u0006\u0010W\u001a\u00020<H\u0000¢\u0006\u0002\bXJ+\u0010Y\u001a\u00020\u00052\u0006\u0010W\u001a\u00020<2\u0018\u0010Z\u001a\u0014\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00050[H\u0082\bJ\u0010\u0010\\\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020]H\u0002J\u0010\u0010^\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020<H\u0002J\u000e\u0010_\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010`J\b\u0010a\u001a\u00020\u0005H\u0002J\u000e\u0010b\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010`J\u001e\u0010i\u001a\u00020\u001b2\n\u0010j\u001a\u0006\u0012\u0002\b\u00030k2\b\u0010l\u001a\u0004\u0018\u00010\u000eH\u0002J\u0015\u0010m\u001a\u00020\u001b2\u0006\u0010W\u001a\u00020<H\u0000¢\u0006\u0002\bnJ\u001d\u0010q\u001a\u00020\u001b2\u000e\u00107\u001a\n\u0018\u00010Bj\u0004\u0018\u0001`CH\u0016¢\u0006\u0002\u0010rJ\b\u0010s\u001a\u00020GH\u0014J\u0012\u0010q\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010+H\u0017J\u0010\u0010t\u001a\u00020\u001b2\u0006\u00107\u001a\u00020+H\u0016J\u000e\u0010u\u001a\u00020\u001b2\u0006\u0010v\u001a\u00020\u0003J\u0010\u0010w\u001a\u00020\u00052\u0006\u00107\u001a\u00020+H\u0016J\u0010\u0010x\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010+J\u0017\u0010y\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0002\bzJ\u0014\u0010{\u001a\u0004\u0018\u00010\u000e2\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0002J&\u0010|\u001a\u00020}2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\n\b\u0002\u00107\u001a\u0004\u0018\u00010+H\u0080\b¢\u0006\u0002\b~J\u0011\u0010\u007f\u001a\u00060Bj\u0002`CH\u0016¢\u0006\u0002\u0010DJ\u0013\u0010\u0080\u0001\u001a\u00020+2\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0002J\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000e2\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0002J\u0013\u0010\u0082\u0001\u001a\u0004\u0018\u0001062\u0006\u0010\u001c\u001a\u000201H\u0002J\u0019\u0010\u0083\u0001\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u0002012\u0006\u0010/\u001a\u00020+H\u0002J\u0019\u0010\u0084\u0001\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0003\b\u0085\u0001J\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0003\b\u0087\u0001J\u001f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0002J\u001d\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u0002012\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0002J&\u0010\u008d\u0001\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020(2\b\u0010\u008e\u0001\u001a\u00030\u008f\u00012\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0082\u0010J%\u0010\u0090\u0001\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020(2\b\u0010\u0091\u0001\u001a\u00030\u008f\u00012\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0002J\u0011\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u0001*\u00030\u0093\u0001H\u0002J\u0010\u0010\u0098\u0001\u001a\u00020\u00102\u0007\u0010\u008e\u0001\u001a\u00020\u0002J\u0018\u0010\u0099\u0001\u001a\u00020\u001b2\u0007\u0010\u009a\u0001\u001a\u00020+H\u0010¢\u0006\u0003\b\u009b\u0001J\u0012\u0010T\u001a\u00020\u001b2\b\u00107\u001a\u0004\u0018\u00010+H\u0014J\u0012\u0010\u009f\u0001\u001a\u00020\u00052\u0007\u0010\u009a\u0001\u001a\u00020+H\u0014J\u0013\u0010 \u0001\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0014J\u0013\u0010¡\u0001\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0014J\t\u0010¢\u0001\u001a\u00020GH\u0016J\t\u0010£\u0001\u001a\u00020GH\u0007J\u000f\u0010¤\u0001\u001a\u00020GH\u0010¢\u0006\u0003\b¥\u0001J\u0013\u0010¦\u0001\u001a\u00020G2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0002J\t\u0010ª\u0001\u001a\u0004\u0018\u00010+J\u0011\u0010«\u0001\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0003\b¬\u0001J\u0011\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u000eH\u0084@¢\u0006\u0002\u0010`J\u0011\u0010®\u0001\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0002\u0010`J\u001f\u0010´\u0001\u001a\u00020\u001b2\n\u0010j\u001a\u0006\u0012\u0002\b\u00030k2\b\u0010l\u001a\u0004\u0018\u00010\u000eH\u0002J \u0010µ\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010l\u001a\u0004\u0018\u00010\u000e2\t\u0010¶\u0001\u001a\u0004\u0018\u00010\u000eH\u0002R\u0015\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u0004R\u0011\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rX\u0082\u0004R(\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0011\u0010&\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0016\u0010I\u001a\u0004\u0018\u00010+8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bM\u0010$R\u0017\u0010c\u001a\u00020d8F¢\u0006\f\u0012\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0014\u0010o\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bp\u0010$R\u001f\u0010\u008a\u0001\u001a\u0004\u0018\u00010+*\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001b\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010\u0095\u00018F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0016\u0010\u009c\u0001\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010$R\u0016\u0010\u009d\u0001\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010$R\u001b\u0010§\u0001\u001a\u00020\u0005*\u0002018BX\u0082\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0013\u0010©\u0001\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b©\u0001\u0010$R#\u0010¯\u0001\u001a\u0007\u0012\u0002\b\u00030°\u00018DX\u0084\u0004¢\u0006\u000f\u0012\u0005\b±\u0001\u0010f\u001a\u0006\b²\u0001\u0010³\u0001¨\u0006¼\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/ParentJob;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "<init>", "(Z)V", com.ironsource.X3.i.W, "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "_state", "Lkotlinx/atomicfu/AtomicRef;", "", "_parentHandle", "Lkotlinx/coroutines/ChildHandle;", "value", "parentHandle", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "parent", "getParent", "()Lkotlinx/coroutines/Job;", "initParentJob", "", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "loopOnState", "", "block", "Lkotlin/Function1;", "isActive", "()Z", "isCompleted", "isCancelled", "finalizeFinishingState", "Lkotlinx/coroutines/JobSupport$Finishing;", "proposedUpdate", "getFinalRootCause", "", "exceptions", "", "addSuppressedExceptions", "rootCause", "tryFinalizeSimpleState", "Lkotlinx/coroutines/Incomplete;", "update", "completeStateFinalization", "notifyCancelling", "list", "Lkotlinx/coroutines/NodeList;", "cause", "cancelParent", "notifyCompletion", "notifyHandlers", "predicate", "Lkotlinx/coroutines/JobNode;", "start", "startInternal", "", "onStart", "getCancellationException", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "()Ljava/util/concurrent/CancellationException;", "toCancellationException", "message", "", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "completionCause", "getCompletionCause", "()Ljava/lang/Throwable;", "completionCauseHandled", "getCompletionCauseHandled", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "handler", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "onCancelling", "invokeImmediately", "invokeOnCompletionInternal", "node", "invokeOnCompletionInternal$kotlinx_coroutines_core", "tryPutNodeIntoList", "tryAdd", "Lkotlin/Function2;", "promoteEmptyToNodeList", "Lkotlinx/coroutines/Empty;", "promoteSingleToNodeList", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinInternal", "joinSuspend", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin$annotations", "()V", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "registerSelectForOnJoin", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "ignoredParam", "removeNode", "removeNode$kotlinx_coroutines_core", "onCancelComplete", "getOnCancelComplete$kotlinx_coroutines_core", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "cancellationExceptionMessage", "cancelInternal", "parentCancelled", "parentJob", "childCancelled", "cancelCoroutine", "cancelImpl", "cancelImpl$kotlinx_coroutines_core", "cancelMakeCompleting", "defaultCancellationException", "Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException$kotlinx_coroutines_core", "getChildJobCancellationCause", "createCauseException", "makeCancelling", "getOrPromoteCancellingList", "tryMakeCancelling", "makeCompleting", "makeCompleting$kotlinx_coroutines_core", "makeCompletingOnce", "makeCompletingOnce$kotlinx_coroutines_core", "tryMakeCompleting", "tryMakeCompletingSlowPath", "exceptionOrNull", "getExceptionOrNull", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "tryWaitForChild", "child", "Lkotlinx/coroutines/ChildHandleNode;", "continueCompleting", "lastChild", "nextChild", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", com.helpshift.proactive.InAppViewConstants.CHILDREN, "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "attachChild", "handleOnCompletionException", "exception", "handleOnCompletionException$kotlinx_coroutines_core", "isScopedCoroutine", "handlesException", "getHandlesException$kotlinx_coroutines_core", "handleJobException", "onCompletionInternal", "afterCompletion", "toString", "toDebugString", "nameString", "nameString$kotlinx_coroutines_core", "stateString", "isCancelling", "(Lkotlinx/coroutines/Incomplete;)Z", "isCompletedExceptionally", "getCompletionExceptionOrNull", "getCompletedInternal", "getCompletedInternal$kotlinx_coroutines_core", "awaitInternal", "awaitSuspend", "onAwaitInternal", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwaitInternal$annotations", "getOnAwaitInternal", "()Lkotlinx/coroutines/selects/SelectClause1;", "onAwaitInternalRegFunc", "onAwaitInternalProcessResFunc", "result", "SelectOnJoinCompletionHandler", "Finishing", "ChildCompletion", "AwaitContinuation", "SelectOnAwaitCompletionHandler", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class JobSupport implements kotlinx.coroutines.Job, kotlinx.coroutines.ChildJob, kotlinx.coroutines.ParentJob {
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$volatile$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.JobSupport.class, java.lang.Object.class, "_state$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _parentHandle$volatile$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.JobSupport.class, java.lang.Object.class, "_parentHandle$volatile");

    protected static /* synthetic */ void getOnAwaitInternal$annotations() {
    }

    public static /* synthetic */ void getOnJoin$annotations() {
    }

    private final /* synthetic */ java.lang.Object get_parentHandle$volatile() {
        return this._parentHandle$volatile;
    }

    private final /* synthetic */ java.lang.Object get_state$volatile() {
        return this._state$volatile;
    }

    private final /* synthetic */ void set_parentHandle$volatile(java.lang.Object obj) {
        this._parentHandle$volatile = obj;
    }

    private final /* synthetic */ void set_state$volatile(java.lang.Object obj) {
        this._state$volatile = obj;
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
        this._state$volatile = z ? kotlinx.coroutines.JobSupportKt.EMPTY_ACTIVE : kotlinx.coroutines.JobSupportKt.EMPTY_NEW;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.CoroutineContext.Key<?> getKey() {
        return kotlinx.coroutines.Job.INSTANCE;
    }

    public final kotlinx.coroutines.ChildHandle getParentHandle$kotlinx_coroutines_core() {
        return (kotlinx.coroutines.ChildHandle) _parentHandle$volatile$FU.get(this);
    }

    public final void setParentHandle$kotlinx_coroutines_core(kotlinx.coroutines.ChildHandle childHandle) {
        _parentHandle$volatile$FU.set(this, childHandle);
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

    public final java.lang.Object getState$kotlinx_coroutines_core() {
        return _state$volatile$FU.get(this);
    }

    private final java.lang.Void loopOnState(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> block) {
        while (true) {
            block.invoke(getState$kotlinx_coroutines_core());
        }
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) && ((kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core).getIsActive();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof kotlinx.coroutines.Incomplete);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) || ((state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) && ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).isCancelling());
    }

    private final java.lang.Object finalizeFinishingState(kotlinx.coroutines.JobSupport.Finishing state, java.lang.Object proposedUpdate) {
        boolean isCancelling;
        java.lang.Throwable finalRootCause;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && getState$kotlinx_coroutines_core() != state) {
            throw new java.lang.AssertionError();
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(!state.isSealed())) {
            throw new java.lang.AssertionError();
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !state.isCompleting()) {
            throw new java.lang.AssertionError();
        }
        kotlinx.coroutines.CompletedExceptionally completedExceptionally = proposedUpdate instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) proposedUpdate : null;
        java.lang.Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
        synchronized (state) {
            isCancelling = state.isCancelling();
            java.util.List<java.lang.Throwable> sealLocked = state.sealLocked(th);
            finalRootCause = getFinalRootCause(state, sealLocked);
            if (finalRootCause != null) {
                addSuppressedExceptions(finalRootCause, sealLocked);
            }
        }
        if (finalRootCause != null && finalRootCause != th) {
            proposedUpdate = new kotlinx.coroutines.CompletedExceptionally(finalRootCause, false, 2, null);
        }
        if (finalRootCause != null && (cancelParent(finalRootCause) || handleJobException(finalRootCause))) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(proposedUpdate, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((kotlinx.coroutines.CompletedExceptionally) proposedUpdate).makeHandled();
        }
        if (!isCancelling) {
            onCancelling(finalRootCause);
        }
        onCompletionInternal(proposedUpdate);
        boolean m = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, state, kotlinx.coroutines.JobSupportKt.boxIncomplete(proposedUpdate));
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !m) {
            throw new java.lang.AssertionError();
        }
        completeStateFinalization(state, proposedUpdate);
        return proposedUpdate;
    }

    private final java.lang.Throwable getFinalRootCause(kotlinx.coroutines.JobSupport.Finishing state, java.util.List<? extends java.lang.Throwable> exceptions) {
        java.lang.Object obj;
        java.lang.Object obj2 = null;
        if (exceptions.isEmpty()) {
            if (state.isCancelling()) {
                return new kotlinx.coroutines.JobCancellationException(cancellationExceptionMessage(), null, this);
            }
            return null;
        }
        java.util.List<? extends java.lang.Throwable> list = exceptions;
        java.util.Iterator<T> it = list.iterator();
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
        java.lang.Throwable th2 = exceptions.get(0);
        if (th2 instanceof kotlinx.coroutines.TimeoutCancellationException) {
            java.util.Iterator<T> it2 = list.iterator();
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

    private final void addSuppressedExceptions(java.lang.Throwable rootCause, java.util.List<? extends java.lang.Throwable> exceptions) {
        if (exceptions.size() <= 1) {
            return;
        }
        java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap(exceptions.size()));
        java.lang.Throwable unwrapImpl = !kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() ? rootCause : kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(rootCause);
        for (java.lang.Throwable th : exceptions) {
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
                th = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(th);
            }
            if (th != rootCause && th != unwrapImpl && !(th instanceof java.util.concurrent.CancellationException) && newSetFromMap.add(th)) {
                kotlin.ExceptionsKt.addSuppressed(rootCause, th);
            }
        }
    }

    private final boolean tryFinalizeSimpleState(kotlinx.coroutines.Incomplete state, java.lang.Object update) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(state instanceof kotlinx.coroutines.Empty) && !(state instanceof kotlinx.coroutines.JobNode)) {
            throw new java.lang.AssertionError();
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(!(update instanceof kotlinx.coroutines.CompletedExceptionally))) {
            throw new java.lang.AssertionError();
        }
        if (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, state, kotlinx.coroutines.JobSupportKt.boxIncomplete(update))) {
            return false;
        }
        onCancelling(null);
        onCompletionInternal(update);
        completeStateFinalization(state, update);
        return true;
    }

    private final void completeStateFinalization(kotlinx.coroutines.Incomplete state, java.lang.Object update) {
        kotlinx.coroutines.ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            parentHandle$kotlinx_coroutines_core.dispose();
            setParentHandle$kotlinx_coroutines_core(kotlinx.coroutines.NonDisposableHandle.INSTANCE);
        }
        kotlinx.coroutines.CompletedExceptionally completedExceptionally = update instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) update : null;
        java.lang.Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
        if (state instanceof kotlinx.coroutines.JobNode) {
            try {
                ((kotlinx.coroutines.JobNode) state).invoke(th);
                return;
            } catch (java.lang.Throwable th2) {
                handleOnCompletionException$kotlinx_coroutines_core(new kotlinx.coroutines.CompletionHandlerException("Exception in completion handler " + state + " for " + this, th2));
                return;
            }
        }
        kotlinx.coroutines.NodeList list = state.getList();
        if (list != null) {
            notifyCompletion(list, th);
        }
    }

    private final void notifyCancelling(kotlinx.coroutines.NodeList list, java.lang.Throwable cause) {
        onCancelling(cause);
        list.close(4);
        kotlinx.coroutines.NodeList nodeList = list;
        java.lang.Object next = nodeList.getNext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        kotlinx.coroutines.CompletionHandlerException completionHandlerException = null;
        for (kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(lockFreeLinkedListNode, nodeList); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
            if ((lockFreeLinkedListNode instanceof kotlinx.coroutines.JobNode) && ((kotlinx.coroutines.JobNode) lockFreeLinkedListNode).getOnCancelling()) {
                try {
                    ((kotlinx.coroutines.JobNode) lockFreeLinkedListNode).invoke(cause);
                } catch (java.lang.Throwable th) {
                    kotlinx.coroutines.CompletionHandlerException completionHandlerException2 = completionHandlerException;
                    if (completionHandlerException2 != null) {
                        kotlin.ExceptionsKt.addSuppressed(completionHandlerException2, th);
                        if (completionHandlerException2 != null) {
                        }
                    }
                    completionHandlerException = new kotlinx.coroutines.CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNode + " for " + this, th);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        }
        kotlinx.coroutines.CompletionHandlerException completionHandlerException3 = completionHandlerException;
        if (completionHandlerException3 != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException3);
        }
        cancelParent(cause);
    }

    private final boolean cancelParent(java.lang.Throwable cause) {
        if (isScopedCoroutine()) {
            return true;
        }
        boolean z = cause instanceof java.util.concurrent.CancellationException;
        kotlinx.coroutines.ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        return (parentHandle$kotlinx_coroutines_core == null || parentHandle$kotlinx_coroutines_core == kotlinx.coroutines.NonDisposableHandle.INSTANCE) ? z : parentHandle$kotlinx_coroutines_core.childCancelled(cause) || z;
    }

    private final void notifyCompletion(kotlinx.coroutines.NodeList nodeList, java.lang.Throwable th) {
        nodeList.close(1);
        kotlinx.coroutines.NodeList nodeList2 = nodeList;
        java.lang.Object next = nodeList2.getNext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
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
                    completionHandlerException = new kotlinx.coroutines.CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNode + " for " + this, th2);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        }
        kotlinx.coroutines.CompletionHandlerException completionHandlerException3 = completionHandlerException;
        if (completionHandlerException3 != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException3);
        }
    }

    private final void notifyHandlers(kotlinx.coroutines.NodeList list, java.lang.Throwable cause, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.JobNode, java.lang.Boolean> predicate) {
        kotlinx.coroutines.NodeList nodeList = list;
        java.lang.Object next = nodeList.getNext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        kotlinx.coroutines.CompletionHandlerException completionHandlerException = null;
        for (kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(lockFreeLinkedListNode, nodeList); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
            if ((lockFreeLinkedListNode instanceof kotlinx.coroutines.JobNode) && predicate.invoke(lockFreeLinkedListNode).booleanValue()) {
                try {
                    ((kotlinx.coroutines.JobNode) lockFreeLinkedListNode).invoke(cause);
                } catch (java.lang.Throwable th) {
                    kotlinx.coroutines.CompletionHandlerException completionHandlerException2 = completionHandlerException;
                    if (completionHandlerException2 != null) {
                        kotlin.ExceptionsKt.addSuppressed(completionHandlerException2, th);
                        if (completionHandlerException2 != null) {
                        }
                    }
                    completionHandlerException = new kotlinx.coroutines.CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNode + " for " + this, th);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        }
        kotlinx.coroutines.CompletionHandlerException completionHandlerException3 = completionHandlerException;
        if (completionHandlerException3 != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException3);
        }
    }

    private final int startInternal(java.lang.Object state) {
        kotlinx.coroutines.Empty empty;
        if (state instanceof kotlinx.coroutines.Empty) {
            if (((kotlinx.coroutines.Empty) state).getIsActive()) {
                return 0;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
            empty = kotlinx.coroutines.JobSupportKt.EMPTY_ACTIVE;
            if (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, state, empty)) {
                return -1;
            }
            onStart();
            return 1;
        }
        if (!(state instanceof kotlinx.coroutines.InactiveNodeList)) {
            return 0;
        }
        if (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, state, ((kotlinx.coroutines.InactiveNodeList) state).getList())) {
            return -1;
        }
        onStart();
        return 1;
    }

    @Override // kotlinx.coroutines.Job
    public final java.util.concurrent.CancellationException getCancellationException() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) {
            java.lang.Throwable rootCause = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getRootCause();
            if (rootCause != null) {
                java.util.concurrent.CancellationException cancellationException = toCancellationException(rootCause, kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this) + " is cancelling");
                if (cancellationException != null) {
                    return cancellationException;
                }
            }
            throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) {
            throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
            return toCancellationException$default(this, ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause, null, 1, null);
        }
        return new kotlinx.coroutines.JobCancellationException(kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this) + " has completed normally", null, this);
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
            java.lang.Throwable rootCause = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getRootCause();
            if (rootCause != null) {
                return rootCause;
            }
            throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) {
            throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
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
                if (empty.getIsActive()) {
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, state$kotlinx_coroutines_core, node)) {
                        break;
                    }
                } else {
                    promoteEmptyToNodeList(empty);
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
                kotlinx.coroutines.NodeList list = incomplete.getList();
                if (list != null) {
                    if (node.getOnCancelling()) {
                        kotlinx.coroutines.JobSupport.Finishing finishing = incomplete instanceof kotlinx.coroutines.JobSupport.Finishing ? (kotlinx.coroutines.JobSupport.Finishing) incomplete : null;
                        java.lang.Throwable rootCause = finishing != null ? finishing.getRootCause() : null;
                        if (rootCause == null) {
                            addLast = list.addLast(node, 5);
                        } else {
                            if (invokeImmediately) {
                                node.invoke(rootCause);
                            }
                            return kotlinx.coroutines.NonDisposableHandle.INSTANCE;
                        }
                    } else {
                        addLast = list.addLast(node, 1);
                    }
                    if (addLast) {
                        break;
                    }
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(state$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    promoteSingleToNodeList((kotlinx.coroutines.JobNode) state$kotlinx_coroutines_core);
                }
            }
        }
        return node;
    }

    private final void promoteEmptyToNodeList(kotlinx.coroutines.Empty state) {
        kotlinx.coroutines.NodeList nodeList = new kotlinx.coroutines.NodeList();
        androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, state, state.getIsActive() ? nodeList : new kotlinx.coroutines.InactiveNodeList(nodeList));
    }

    private final void promoteSingleToNodeList(kotlinx.coroutines.JobNode state) {
        state.addOneIfEmpty(new kotlinx.coroutines.NodeList());
        androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, state, state.getNextNode());
    }

    @Override // kotlinx.coroutines.Job
    public final java.lang.Object join(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!joinInternal()) {
            kotlinx.coroutines.JobKt.ensureActive(continuation.getContext());
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object joinSuspend = joinSuspend(continuation);
        return joinSuspend == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? joinSuspend : kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.selects.SelectClause0 getOnJoin() {
        kotlinx.coroutines.JobSupport$onJoin$1 jobSupport$onJoin$1 = kotlinx.coroutines.JobSupport$onJoin$1.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(jobSupport$onJoin$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new kotlinx.coroutines.selects.SelectClause0Impl(this, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onJoin$1, 3), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForOnJoin(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object ignoredParam) {
        if (!joinInternal()) {
            select.selectInRegistrationPhase(kotlin.Unit.INSTANCE);
        } else {
            select.disposeOnCompletion(kotlinx.coroutines.JobKt__JobKt.invokeOnCompletion$default(this, false, new kotlinx.coroutines.JobSupport.SelectOnJoinCompletionHandler(select), 1, null));
        }
    }

    /* compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/JobSupport$SelectOnJoinCompletionHandler;", "Lkotlinx/coroutines/JobNode;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "<init>", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/selects/SelectInstance;)V", "onCancelling", "", "getOnCancelling", "()Z", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class SelectOnJoinCompletionHandler extends kotlinx.coroutines.JobNode {
        private final kotlinx.coroutines.selects.SelectInstance<?> select;

        @Override // kotlinx.coroutines.JobNode
        public boolean getOnCancelling() {
            return false;
        }

        public SelectOnJoinCompletionHandler(kotlinx.coroutines.selects.SelectInstance<?> selectInstance) {
            this.select = selectInstance;
        }

        @Override // kotlinx.coroutines.JobNode
        public void invoke(java.lang.Throwable cause) {
            this.select.trySelect(kotlinx.coroutines.JobSupport.this, kotlin.Unit.INSTANCE);
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
        obj = kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY;
        if (getOnCancelComplete$kotlinx_coroutines_core() && (obj = cancelMakeCompleting(cause)) == kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return true;
        }
        symbol = kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY;
        if (obj == symbol) {
            obj = makeCancelling(cause);
        }
        symbol2 = kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY;
        if (obj == symbol2 || obj == kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return true;
        }
        symbol3 = kotlinx.coroutines.JobSupportKt.TOO_LATE_TO_CANCEL;
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
            cancellationException = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getRootCause();
        } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
            cancellationException = ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        } else {
            if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) {
                throw new java.lang.IllegalStateException(("Cannot be cancelling child in this state: " + state$kotlinx_coroutines_core).toString());
            }
            cancellationException = null;
        }
        java.util.concurrent.CancellationException cancellationException2 = cancellationException instanceof java.util.concurrent.CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new kotlinx.coroutines.JobCancellationException("Parent job is " + stateString(state$kotlinx_coroutines_core), cancellationException, this);
    }

    private final java.lang.Throwable createCauseException(java.lang.Object cause) {
        if (cause == null || (cause instanceof java.lang.Throwable)) {
            java.lang.Throwable th = (java.lang.Throwable) cause;
            return th == null ? new kotlinx.coroutines.JobCancellationException(cancellationExceptionMessage(), null, this) : th;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(cause, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((kotlinx.coroutines.ParentJob) cause).getChildJobCancellationCause();
    }

    private final kotlinx.coroutines.NodeList getOrPromoteCancellingList(kotlinx.coroutines.Incomplete state) {
        kotlinx.coroutines.NodeList list = state.getList();
        if (list != null) {
            return list;
        }
        if (state instanceof kotlinx.coroutines.Empty) {
            return new kotlinx.coroutines.NodeList();
        }
        if (state instanceof kotlinx.coroutines.JobNode) {
            promoteSingleToNodeList((kotlinx.coroutines.JobNode) state);
            return null;
        }
        throw new java.lang.IllegalStateException(("State should have list: " + state).toString());
    }

    private final boolean tryMakeCancelling(kotlinx.coroutines.Incomplete state, java.lang.Throwable rootCause) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(!(state instanceof kotlinx.coroutines.JobSupport.Finishing))) {
            throw new java.lang.AssertionError();
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !state.getIsActive()) {
            throw new java.lang.AssertionError();
        }
        kotlinx.coroutines.NodeList orPromoteCancellingList = getOrPromoteCancellingList(state);
        if (orPromoteCancellingList == null) {
            return false;
        }
        if (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, state, new kotlinx.coroutines.JobSupport.Finishing(orPromoteCancellingList, false, rootCause))) {
            return false;
        }
        notifyCancelling(orPromoteCancellingList, rootCause);
        return true;
    }

    private final java.lang.Object tryMakeCompleting(java.lang.Object state, java.lang.Object proposedUpdate) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        if (!(state instanceof kotlinx.coroutines.Incomplete)) {
            symbol2 = kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY;
            return symbol2;
        }
        if (((state instanceof kotlinx.coroutines.Empty) || (state instanceof kotlinx.coroutines.JobNode)) && !(state instanceof kotlinx.coroutines.ChildHandleNode) && !(proposedUpdate instanceof kotlinx.coroutines.CompletedExceptionally)) {
            if (tryFinalizeSimpleState((kotlinx.coroutines.Incomplete) state, proposedUpdate)) {
                return proposedUpdate;
            }
            symbol = kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY;
            return symbol;
        }
        return tryMakeCompletingSlowPath((kotlinx.coroutines.Incomplete) state, proposedUpdate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final java.lang.Object tryMakeCompletingSlowPath(kotlinx.coroutines.Incomplete state, java.lang.Object proposedUpdate) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.NodeList orPromoteCancellingList = getOrPromoteCancellingList(state);
        if (orPromoteCancellingList == null) {
            symbol3 = kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY;
            return symbol3;
        }
        kotlinx.coroutines.JobSupport.Finishing finishing = state instanceof kotlinx.coroutines.JobSupport.Finishing ? (kotlinx.coroutines.JobSupport.Finishing) state : null;
        if (finishing == null) {
            finishing = new kotlinx.coroutines.JobSupport.Finishing(orPromoteCancellingList, false, null);
        }
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        synchronized (finishing) {
            if (finishing.isCompleting()) {
                symbol2 = kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY;
                return symbol2;
            }
            finishing.setCompleting(true);
            if (finishing != state && !androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, state, finishing)) {
                symbol = kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY;
                return symbol;
            }
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(!finishing.isSealed())) {
                throw new java.lang.AssertionError();
            }
            boolean isCancelling = finishing.isCancelling();
            kotlinx.coroutines.CompletedExceptionally completedExceptionally = proposedUpdate instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) proposedUpdate : null;
            if (completedExceptionally != null) {
                finishing.addExceptionLocked(completedExceptionally.cause);
            }
            java.lang.Throwable rootCause = finishing.getRootCause();
            boolean z = !isCancelling;
            java.lang.Boolean.valueOf(z).getClass();
            objectRef.element = z ? rootCause : 0;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            java.lang.Throwable th = (java.lang.Throwable) objectRef.element;
            if (th != null) {
                notifyCancelling(orPromoteCancellingList, th);
            }
            kotlinx.coroutines.NodeList nodeList = orPromoteCancellingList;
            kotlinx.coroutines.ChildHandleNode nextChild = nextChild(nodeList);
            if (nextChild != null && tryWaitForChild(finishing, nextChild, proposedUpdate)) {
                return kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN;
            }
            orPromoteCancellingList.close(2);
            kotlinx.coroutines.ChildHandleNode nextChild2 = nextChild(nodeList);
            if (nextChild2 != null && tryWaitForChild(finishing, nextChild2, proposedUpdate)) {
                return kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN;
            }
            return finalizeFinishingState(finishing, proposedUpdate);
        }
    }

    private final java.lang.Throwable getExceptionOrNull(java.lang.Object obj) {
        kotlinx.coroutines.CompletedExceptionally completedExceptionally = obj instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    private final boolean tryWaitForChild(kotlinx.coroutines.JobSupport.Finishing state, kotlinx.coroutines.ChildHandleNode child, java.lang.Object proposedUpdate) {
        while (kotlinx.coroutines.JobKt.invokeOnCompletion(child.childJob, false, new kotlinx.coroutines.JobSupport.ChildCompletion(this, state, child, proposedUpdate)) == kotlinx.coroutines.NonDisposableHandle.INSTANCE) {
            child = nextChild(child);
            if (child == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void continueCompleting(kotlinx.coroutines.JobSupport.Finishing state, kotlinx.coroutines.ChildHandleNode lastChild, java.lang.Object proposedUpdate) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && getState$kotlinx_coroutines_core() != state) {
            throw new java.lang.AssertionError();
        }
        kotlinx.coroutines.ChildHandleNode childHandleNode = lastChild;
        kotlinx.coroutines.ChildHandleNode nextChild = nextChild(childHandleNode);
        if (nextChild == null || !tryWaitForChild(state, nextChild, proposedUpdate)) {
            state.getList().close(2);
            kotlinx.coroutines.ChildHandleNode nextChild2 = nextChild(childHandleNode);
            if (nextChild2 == null || !tryWaitForChild(state, nextChild2, proposedUpdate)) {
                afterCompletion(finalizeFinishingState(state, proposedUpdate));
            }
        }
    }

    private final kotlinx.coroutines.ChildHandleNode nextChild(kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode) {
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
                if (empty.getIsActive()) {
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, state$kotlinx_coroutines_core, childHandleNode)) {
                        break;
                    }
                } else {
                    promoteEmptyToNodeList(empty);
                }
            } else {
                if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                    java.lang.Object state$kotlinx_coroutines_core2 = getState$kotlinx_coroutines_core();
                    kotlinx.coroutines.CompletedExceptionally completedExceptionally = state$kotlinx_coroutines_core2 instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core2 : null;
                    childHandleNode.invoke(completedExceptionally != null ? completedExceptionally.cause : null);
                    return kotlinx.coroutines.NonDisposableHandle.INSTANCE;
                }
                kotlinx.coroutines.NodeList list = ((kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core).getList();
                if (list != null) {
                    kotlinx.coroutines.ChildHandleNode childHandleNode2 = childHandleNode;
                    if (!list.addLast(childHandleNode2, 7)) {
                        boolean addLast = list.addLast(childHandleNode2, 3);
                        java.lang.Object state$kotlinx_coroutines_core3 = getState$kotlinx_coroutines_core();
                        if (state$kotlinx_coroutines_core3 instanceof kotlinx.coroutines.JobSupport.Finishing) {
                            r2 = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core3).getRootCause();
                        } else {
                            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(!(state$kotlinx_coroutines_core3 instanceof kotlinx.coroutines.Incomplete))) {
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
                    kotlin.jvm.internal.Intrinsics.checkNotNull(state$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    promoteSingleToNodeList((kotlinx.coroutines.JobNode) state$kotlinx_coroutines_core);
                }
            }
        }
        return childHandleNode;
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(java.lang.Throwable exception) {
        throw exception;
    }

    public java.lang.String toString() {
        return toDebugString() + '@' + kotlinx.coroutines.DebugStringsKt.getHexAddress(this);
    }

    public final java.lang.String toDebugString() {
        return nameString$kotlinx_coroutines_core() + kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ + stateString(getState$kotlinx_coroutines_core()) + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ;
    }

    public java.lang.String nameString$kotlinx_coroutines_core() {
        return kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this);
    }

    private final java.lang.String stateString(java.lang.Object state) {
        if (!(state instanceof kotlinx.coroutines.JobSupport.Finishing)) {
            return state instanceof kotlinx.coroutines.Incomplete ? ((kotlinx.coroutines.Incomplete) state).getIsActive() ? "Active" : "New" : state instanceof kotlinx.coroutines.CompletedExceptionally ? com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED : com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED;
        }
        kotlinx.coroutines.JobSupport.Finishing finishing = (kotlinx.coroutines.JobSupport.Finishing) state;
        return finishing.isCancelling() ? "Cancelling" : finishing.isCompleting() ? "Completing" : "Active";
    }

    /* compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0$2\b\u0010%\u001a\u0004\u0018\u00010\tJ\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\tJ\u0018\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\t0*j\b\u0012\u0004\u0012\u00020\t`+H\u0002J\b\u0010,\u001a\u00020-H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\t\u0010\u000e\u001a\u00020\u000fX\u0082\u0004R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0015X\u0082\u0004R(\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015X\u0082\u0004R(\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b \u0010\u0011R\u0011\u0010!\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\u0011R\u0014\u0010\"\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011¨\u0006."}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;", "list", "Lkotlinx/coroutines/NodeList;", "isCompleting", "", "rootCause", "", "<init>", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "getList", "()Lkotlinx/coroutines/NodeList;", "_isCompleting", "Lkotlinx/atomicfu/AtomicBoolean;", "value", "()Z", "setCompleting", "(Z)V", "_rootCause", "Lkotlinx/atomicfu/AtomicRef;", "getRootCause", "()Ljava/lang/Throwable;", "setRootCause", "(Ljava/lang/Throwable;)V", "_exceptionsHolder", "exceptionsHolder", "getExceptionsHolder", "()Ljava/lang/Object;", "setExceptionsHolder", "(Ljava/lang/Object;)V", "isSealed", "isCancelling", "isActive", "sealLocked", "", "proposedException", "addExceptionLocked", "", "exception", "allocateList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Finishing implements kotlinx.coroutines.Incomplete {
        private volatile /* synthetic */ java.lang.Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ java.lang.Object _rootCause$volatile;
        private final kotlinx.coroutines.NodeList list;
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _isCompleting$volatile$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.JobSupport.Finishing.class, "_isCompleting$volatile");
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _rootCause$volatile$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.JobSupport.Finishing.class, java.lang.Object.class, "_rootCause$volatile");
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _exceptionsHolder$volatile$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.JobSupport.Finishing.class, java.lang.Object.class, "_exceptionsHolder$volatile");

        private final /* synthetic */ java.lang.Object get_exceptionsHolder$volatile() {
            return this._exceptionsHolder$volatile;
        }

        private final /* synthetic */ int get_isCompleting$volatile() {
            return this._isCompleting$volatile;
        }

        private final /* synthetic */ java.lang.Object get_rootCause$volatile() {
            return this._rootCause$volatile;
        }

        private final /* synthetic */ void set_exceptionsHolder$volatile(java.lang.Object obj) {
            this._exceptionsHolder$volatile = obj;
        }

        private final /* synthetic */ void set_isCompleting$volatile(int i) {
            this._isCompleting$volatile = i;
        }

        private final /* synthetic */ void set_rootCause$volatile(java.lang.Object obj) {
            this._rootCause$volatile = obj;
        }

        @Override // kotlinx.coroutines.Incomplete
        public kotlinx.coroutines.NodeList getList() {
            return this.list;
        }

        public Finishing(kotlinx.coroutines.NodeList nodeList, boolean z, java.lang.Throwable th) {
            this.list = nodeList;
            this._isCompleting$volatile = z ? 1 : 0;
            this._rootCause$volatile = th;
        }

        public final boolean isCompleting() {
            return _isCompleting$volatile$FU.get(this) == 1;
        }

        public final void setCompleting(boolean z) {
            _isCompleting$volatile$FU.set(this, z ? 1 : 0);
        }

        public final java.lang.Throwable getRootCause() {
            return (java.lang.Throwable) _rootCause$volatile$FU.get(this);
        }

        public final void setRootCause(java.lang.Throwable th) {
            _rootCause$volatile$FU.set(this, th);
        }

        private final java.lang.Object getExceptionsHolder() {
            return _exceptionsHolder$volatile$FU.get(this);
        }

        private final void setExceptionsHolder(java.lang.Object obj) {
            _exceptionsHolder$volatile$FU.set(this, obj);
        }

        public final boolean isSealed() {
            kotlinx.coroutines.internal.Symbol symbol;
            java.lang.Object exceptionsHolder = getExceptionsHolder();
            symbol = kotlinx.coroutines.JobSupportKt.SEALED;
            return exceptionsHolder == symbol;
        }

        public final boolean isCancelling() {
            return getRootCause() != null;
        }

        @Override // kotlinx.coroutines.Incomplete
        /* renamed from: isActive */
        public boolean getIsActive() {
            return getRootCause() == null;
        }

        public final java.util.List<java.lang.Throwable> sealLocked(java.lang.Throwable proposedException) {
            java.util.ArrayList<java.lang.Throwable> arrayList;
            kotlinx.coroutines.internal.Symbol symbol;
            java.lang.Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                arrayList = allocateList();
            } else if (exceptionsHolder instanceof java.lang.Throwable) {
                java.util.ArrayList<java.lang.Throwable> allocateList = allocateList();
                allocateList.add(exceptionsHolder);
                arrayList = allocateList;
            } else {
                if (!(exceptionsHolder instanceof java.util.ArrayList)) {
                    throw new java.lang.IllegalStateException(("State is " + exceptionsHolder).toString());
                }
                arrayList = (java.util.ArrayList) exceptionsHolder;
            }
            java.lang.Throwable rootCause = getRootCause();
            if (rootCause != null) {
                arrayList.add(0, rootCause);
            }
            if (proposedException != null && !kotlin.jvm.internal.Intrinsics.areEqual(proposedException, rootCause)) {
                arrayList.add(proposedException);
            }
            symbol = kotlinx.coroutines.JobSupportKt.SEALED;
            setExceptionsHolder(symbol);
            return arrayList;
        }

        public final void addExceptionLocked(java.lang.Throwable exception) {
            java.lang.Throwable rootCause = getRootCause();
            if (rootCause == null) {
                setRootCause(exception);
                return;
            }
            if (exception == rootCause) {
                return;
            }
            java.lang.Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                setExceptionsHolder(exception);
                return;
            }
            if (!(exceptionsHolder instanceof java.lang.Throwable)) {
                if (exceptionsHolder instanceof java.util.ArrayList) {
                    ((java.util.ArrayList) exceptionsHolder).add(exception);
                    return;
                } else {
                    throw new java.lang.IllegalStateException(("State is " + exceptionsHolder).toString());
                }
            }
            if (exception == exceptionsHolder) {
                return;
            }
            java.util.ArrayList<java.lang.Throwable> allocateList = allocateList();
            allocateList.add(exceptionsHolder);
            allocateList.add(exception);
            setExceptionsHolder(allocateList);
        }

        private final java.util.ArrayList<java.lang.Throwable> allocateList() {
            return new java.util.ArrayList<>(4);
        }

        public java.lang.String toString() {
            return "Finishing[cancelling=" + isCancelling() + ", completing=" + isCompleting() + ", rootCause=" + getRootCause() + ", exceptions=" + getExceptionsHolder() + ", list=" + getList() + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST;
        }
    }

    private final boolean isCancelling(kotlinx.coroutines.Incomplete incomplete) {
        return (incomplete instanceof kotlinx.coroutines.JobSupport.Finishing) && ((kotlinx.coroutines.JobSupport.Finishing) incomplete).isCancelling();
    }

    /* compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "parent", "Lkotlinx/coroutines/JobSupport;", "state", "Lkotlinx/coroutines/JobSupport$Finishing;", "child", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "", "<init>", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "onCancelling", "", "getOnCancelling", "()Z", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class ChildCompletion extends kotlinx.coroutines.JobNode {
        private final kotlinx.coroutines.ChildHandleNode child;
        private final kotlinx.coroutines.JobSupport parent;
        private final java.lang.Object proposedUpdate;
        private final kotlinx.coroutines.JobSupport.Finishing state;

        @Override // kotlinx.coroutines.JobNode
        public boolean getOnCancelling() {
            return false;
        }

        public ChildCompletion(kotlinx.coroutines.JobSupport jobSupport, kotlinx.coroutines.JobSupport.Finishing finishing, kotlinx.coroutines.ChildHandleNode childHandleNode, java.lang.Object obj) {
            this.parent = jobSupport;
            this.state = finishing;
            this.child = childHandleNode;
            this.proposedUpdate = obj;
        }

        @Override // kotlinx.coroutines.JobNode
        public void invoke(java.lang.Throwable cause) {
            this.parent.continueCompleting(this.state, this.child, this.proposedUpdate);
        }
    }

    /* compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/JobSupport$AwaitContinuation;", "T", "Lkotlinx/coroutines/CancellableContinuationImpl;", "delegate", "Lkotlin/coroutines/Continuation;", "job", "Lkotlinx/coroutines/JobSupport;", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V", "getContinuationCancellationCause", "", "parent", "Lkotlinx/coroutines/Job;", "nameString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class AwaitContinuation<T> extends kotlinx.coroutines.CancellableContinuationImpl<T> {
        private final kotlinx.coroutines.JobSupport job;

        public AwaitContinuation(kotlin.coroutines.Continuation<? super T> continuation, kotlinx.coroutines.JobSupport jobSupport) {
            super(continuation, 1);
            this.job = jobSupport;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public java.lang.Throwable getContinuationCancellationCause(kotlinx.coroutines.Job parent) {
            java.lang.Throwable rootCause;
            java.lang.Object state$kotlinx_coroutines_core = this.job.getState$kotlinx_coroutines_core();
            return (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) || (rootCause = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getRootCause()) == null) ? state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally ? ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause : parent.getCancellationException() : rootCause;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        protected java.lang.String nameString() {
            return "AwaitContinuation";
        }
    }

    public final boolean isCompletedExceptionally() {
        return getState$kotlinx_coroutines_core() instanceof kotlinx.coroutines.CompletedExceptionally;
    }

    public final java.lang.Throwable getCompletionExceptionOrNull() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete))) {
            throw new java.lang.IllegalStateException("This job has not completed yet".toString());
        }
        return getExceptionOrNull(state$kotlinx_coroutines_core);
    }

    public final java.lang.Object getCompletedInternal$kotlinx_coroutines_core() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete))) {
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
                        throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(th, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
                    }
                    throw th;
                }
                return kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core);
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        return awaitSuspend(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object awaitSuspend(kotlin.coroutines.Continuation<java.lang.Object> continuation) {
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
        kotlinx.coroutines.JobSupport$onAwaitInternal$1 jobSupport$onAwaitInternal$1 = kotlinx.coroutines.JobSupport$onAwaitInternal$1.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(jobSupport$onAwaitInternal$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onAwaitInternal$1, 3);
        kotlinx.coroutines.JobSupport$onAwaitInternal$2 jobSupport$onAwaitInternal$2 = kotlinx.coroutines.JobSupport$onAwaitInternal$2.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(jobSupport$onAwaitInternal$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kotlinx.coroutines.selects.SelectClause1Impl(this, function3, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onAwaitInternal$2, 3), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAwaitInternalRegFunc(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object ignoredParam) {
        java.lang.Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally)) {
                    state$kotlinx_coroutines_core = kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core);
                }
                select.selectInRegistrationPhase(state$kotlinx_coroutines_core);
                return;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        select.disposeOnCompletion(kotlinx.coroutines.JobKt__JobKt.invokeOnCompletion$default(this, false, new kotlinx.coroutines.JobSupport.SelectOnAwaitCompletionHandler(select), 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object onAwaitInternalProcessResFunc(java.lang.Object ignoredParam, java.lang.Object result) {
        if (result instanceof kotlinx.coroutines.CompletedExceptionally) {
            throw ((kotlinx.coroutines.CompletedExceptionally) result).cause;
        }
        return result;
    }

    /* compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/JobSupport$SelectOnAwaitCompletionHandler;", "Lkotlinx/coroutines/JobNode;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "<init>", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/selects/SelectInstance;)V", "onCancelling", "", "getOnCancelling", "()Z", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class SelectOnAwaitCompletionHandler extends kotlinx.coroutines.JobNode {
        private final kotlinx.coroutines.selects.SelectInstance<?> select;

        @Override // kotlinx.coroutines.JobNode
        public boolean getOnCancelling() {
            return false;
        }

        public SelectOnAwaitCompletionHandler(kotlinx.coroutines.selects.SelectInstance<?> selectInstance) {
            this.select = selectInstance;
        }

        @Override // kotlinx.coroutines.JobNode
        public void invoke(java.lang.Throwable cause) {
            java.lang.Object state$kotlinx_coroutines_core = kotlinx.coroutines.JobSupport.this.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally)) {
                state$kotlinx_coroutines_core = kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core);
            }
            this.select.trySelect(kotlinx.coroutines.JobSupport.this, state$kotlinx_coroutines_core);
        }
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int startInternal;
        do {
            startInternal = startInternal(getState$kotlinx_coroutines_core());
            if (startInternal == 0) {
                return false;
            }
        } while (startInternal != 1);
        return true;
    }

    private final boolean tryPutNodeIntoList(kotlinx.coroutines.JobNode node, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.Incomplete, ? super kotlinx.coroutines.NodeList, java.lang.Boolean> tryAdd) {
        while (true) {
            java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Empty) {
                kotlinx.coroutines.Empty empty = (kotlinx.coroutines.Empty) state$kotlinx_coroutines_core;
                if (empty.getIsActive()) {
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, state$kotlinx_coroutines_core, node)) {
                        return true;
                    }
                } else {
                    promoteEmptyToNodeList(empty);
                }
            } else {
                if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                    return false;
                }
                kotlinx.coroutines.NodeList list = ((kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core).getList();
                if (list == null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(state$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    promoteSingleToNodeList((kotlinx.coroutines.JobNode) state$kotlinx_coroutines_core);
                } else if (tryAdd.invoke(state$kotlinx_coroutines_core, list).booleanValue()) {
                    return true;
                }
            }
        }
    }

    private final boolean joinInternal() {
        java.lang.Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                return false;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object joinSuspend(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
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
                if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) || ((kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core).getList() == null) {
                    return;
                }
                node.mo12369remove();
                return;
            }
            if (state$kotlinx_coroutines_core != node) {
                return;
            }
            atomicReferenceFieldUpdater = _state$volatile$FU;
            empty = kotlinx.coroutines.JobSupportKt.EMPTY_ACTIVE;
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, state$kotlinx_coroutines_core, empty));
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(java.util.concurrent.CancellationException cause) {
        if (cause == null) {
            cause = new kotlinx.coroutines.JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cause);
    }

    private final java.lang.Object cancelMakeCompleting(java.lang.Object cause) {
        kotlinx.coroutines.internal.Symbol symbol;
        java.lang.Object tryMakeCompleting;
        kotlinx.coroutines.internal.Symbol symbol2;
        do {
            java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) || ((state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) && ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).isCompleting())) {
                symbol = kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY;
                return symbol;
            }
            tryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new kotlinx.coroutines.CompletedExceptionally(createCauseException(cause), false, 2, null));
            symbol2 = kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY;
        } while (tryMakeCompleting == symbol2);
        return tryMakeCompleting;
    }

    private final java.lang.Object makeCancelling(java.lang.Object cause) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.internal.Symbol symbol6;
        java.lang.Throwable th = null;
        while (true) {
            java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing)) {
                if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                    symbol3 = kotlinx.coroutines.JobSupportKt.TOO_LATE_TO_CANCEL;
                    return symbol3;
                }
                if (th == null) {
                    th = createCauseException(cause);
                }
                kotlinx.coroutines.Incomplete incomplete = (kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core;
                if (incomplete.getIsActive()) {
                    if (tryMakeCancelling(incomplete, th)) {
                        symbol4 = kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY;
                        return symbol4;
                    }
                } else {
                    java.lang.Object tryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new kotlinx.coroutines.CompletedExceptionally(th, false, 2, null));
                    symbol5 = kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY;
                    if (tryMakeCompleting != symbol5) {
                        symbol6 = kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY;
                        if (tryMakeCompleting != symbol6) {
                            return tryMakeCompleting;
                        }
                    } else {
                        throw new java.lang.IllegalStateException(("Cannot happen in " + state$kotlinx_coroutines_core).toString());
                    }
                }
            } else {
                synchronized (state$kotlinx_coroutines_core) {
                    if (((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).isSealed()) {
                        symbol2 = kotlinx.coroutines.JobSupportKt.TOO_LATE_TO_CANCEL;
                        return symbol2;
                    }
                    boolean isCancelling = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).isCancelling();
                    if (cause != null || !isCancelling) {
                        if (th == null) {
                            th = createCauseException(cause);
                        }
                        ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).addExceptionLocked(th);
                    }
                    java.lang.Throwable rootCause = isCancelling ^ true ? ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getRootCause() : null;
                    if (rootCause != null) {
                        notifyCancelling(((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getList(), rootCause);
                    }
                    symbol = kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY;
                    return symbol;
                }
            }
        }
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(java.lang.Object proposedUpdate) {
        java.lang.Object tryMakeCompleting;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        do {
            tryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), proposedUpdate);
            symbol = kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY;
            if (tryMakeCompleting == symbol) {
                return false;
            }
            if (tryMakeCompleting == kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN) {
                return true;
            }
            symbol2 = kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY;
        } while (tryMakeCompleting == symbol2);
        afterCompletion(tryMakeCompleting);
        return true;
    }

    public final java.lang.Object makeCompletingOnce$kotlinx_coroutines_core(java.lang.Object proposedUpdate) {
        java.lang.Object tryMakeCompleting;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        do {
            tryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), proposedUpdate);
            symbol = kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY;
            if (tryMakeCompleting != symbol) {
                symbol2 = kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY;
            } else {
                throw new java.lang.IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + proposedUpdate, getExceptionOrNull(proposedUpdate));
            }
        } while (tryMakeCompleting == symbol2);
        return tryMakeCompleting;
    }
}
