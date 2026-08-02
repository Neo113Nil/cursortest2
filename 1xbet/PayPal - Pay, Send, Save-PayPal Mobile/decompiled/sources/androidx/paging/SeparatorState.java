package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\u00020\u0001BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00128\u0010\t\u001a4\b\u0001\u0012\u000b\u0012\t\u0018\u00018\u0001¢\u0006\u0002\b\u0007\u0012\u000b\u0012\t\u0018\u00018\u0001¢\u0006\u0002\b\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u00020\u0010\"\b\b\u0002\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u00020\u0010\"\b\b\u0002\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0012J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u000fH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H\u0086@¢\u0006\u0004\b\u0013\u0010\u0017J-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0018\"\b\b\u0002\u0010\u0003*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0018H\u0002¢\u0006\u0004\b\u0014\u0010\u0019R\u0011\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bRC\u0010\u0011\u001a4\b\u0001\u0012\u000b\u0012\t\u0018\u00018\u0001¢\u0006\u0002\b\u0007\u0012\u000b\u0012\t\u0018\u00018\u0001¢\u0006\u0002\b\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00180\u001e8\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u00108\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0016\u0010\r\u001a\u00020\u00108\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b#\u0010!R\u0011\u0010%\u001a\u00020$8\u0006¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\u001c\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0016\u0010#\u001a\u00020)8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u001f\u001a\u00020)8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\"\u0010+R\u0016\u0010*\u001a\u00020\u00108\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\r\u0010!R\u0016\u0010,\u001a\u00020\u00108\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0013\u0010!"}, d2 = {"Landroidx/paging/SeparatorState;", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Landroidx/paging/TerminalSeparatorType;", "p0", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "p1", "<init>", "(Landroidx/paging/TerminalSeparatorType;Lkotlin/jvm/functions/Function3;)V", "Landroidx/paging/PageEvent;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/paging/PageEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PageEvent$Insert;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/paging/PageEvent$Insert;Landroidx/paging/TerminalSeparatorType;)Z", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "(Landroidx/paging/PageEvent$Insert;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PageEvent$StaticList;", "(Landroidx/paging/PageEvent$StaticList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/TransformablePage;", "(Landroidx/paging/TransformablePage;)Landroidx/paging/TransformablePage;", "getOutputMinFrameDurationlomOqCM", "Landroidx/paging/TerminalSeparatorType;", "getOutputMinFrameDuration", "Lkotlin/jvm/functions/Function3;", "", "getOutputFormats", "Ljava/util/List;", "Z", "getHighSpeedVideoFpsRanges", "getInputFormats", "Landroidx/paging/MutableLoadStateCollection;", "getInputSizeshNQ4ISI", "Landroidx/paging/MutableLoadStateCollection;", "Landroidx/paging/LoadStates;", "Landroidx/paging/LoadStates;", "", "getHighSpeedVideoSizesFor", com.visa.cbp.getEncExpo.warmup, "getOutputStallDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SeparatorState<R, T extends R> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    public boolean getOutputStallDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    public boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    public int getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    public boolean getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    public androidx.paging.LoadStates getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    public int getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    public boolean getHighSpeedVideoFpsRangesFor;
    private final androidx.paging.MutableLoadStateCollection getInputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final java.util.List<androidx.paging.TransformablePage<T>> Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.paging.TerminalSeparatorType getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public SeparatorState(androidx.paging.TerminalSeparatorType terminalSeparatorType, kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terminalSeparatorType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        this.getHighSpeedVideoSizes = terminalSeparatorType;
        this.getHighResolutionOutputSizeshNQ4ISI = function3;
        this.Camera2StreamConfigurationMap = new java.util.ArrayList();
        this.getInputSizeshNQ4ISI = new androidx.paging.MutableLoadStateCollection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0051, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0184, code lost:
    
        if (r8 != r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0195, code lost:
    
        if (r8 == r1) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(androidx.paging.PageEvent<T> pageEvent, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>> continuation) {
        androidx.paging.SeparatorState$onEvent$1 separatorState$onEvent$1;
        int i;
        androidx.paging.PageEvent.LoadStateUpdate highSpeedVideoSizes;
        androidx.paging.PageEvent.Drop drop;
        if (continuation instanceof androidx.paging.SeparatorState$onEvent$1) {
            separatorState$onEvent$1 = (androidx.paging.SeparatorState$onEvent$1) continuation;
            if ((separatorState$onEvent$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                separatorState$onEvent$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = separatorState$onEvent$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = separatorState$onEvent$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (pageEvent instanceof androidx.paging.PageEvent.Insert) {
                        separatorState$onEvent$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = getHighSpeedVideoSizes((androidx.paging.PageEvent.Insert) pageEvent, separatorState$onEvent$1);
                    } else if (!(pageEvent instanceof androidx.paging.PageEvent.Drop)) {
                        if (!(pageEvent instanceof androidx.paging.PageEvent.LoadStateUpdate)) {
                            if (!(pageEvent instanceof androidx.paging.PageEvent.StaticList)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            separatorState$onEvent$1.getHighSpeedVideoFpsRangesFor = 3;
                            obj = Camera2StreamConfigurationMap((androidx.paging.PageEvent.StaticList) pageEvent, separatorState$onEvent$1);
                        } else {
                            androidx.paging.PageEvent.LoadStateUpdate loadStateUpdate = (androidx.paging.PageEvent.LoadStateUpdate) pageEvent;
                            separatorState$onEvent$1.getHighSpeedVideoFpsRangesFor = 2;
                            androidx.paging.LoadStates loadStates = this.getOutputMinFrameDuration;
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(this.getInputSizeshNQ4ISI.snapshot(), loadStateUpdate.getSource()) || !kotlin.jvm.internal.Intrinsics.areEqual(loadStates, loadStateUpdate.getMediator())) {
                                this.getInputSizeshNQ4ISI.set(loadStateUpdate.getSource());
                                this.getOutputMinFrameDuration = loadStateUpdate.getMediator();
                                if (loadStateUpdate.getMediator() != null && loadStateUpdate.getMediator().getPrepend().getEndOfPaginationReached()) {
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(loadStates != null ? loadStates.getPrepend() : null, loadStateUpdate.getMediator().getPrepend())) {
                                        highSpeedVideoSizes = getHighSpeedVideoSizes(androidx.paging.PageEvent.Insert.INSTANCE.Prepend(kotlin.collections.CollectionsKt.emptyList(), this.getInputFormats, loadStateUpdate.getSource(), loadStateUpdate.getMediator()), separatorState$onEvent$1);
                                        obj = highSpeedVideoSizes;
                                    }
                                }
                                if (loadStateUpdate.getMediator() != null && loadStateUpdate.getMediator().getAppend().getEndOfPaginationReached()) {
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(loadStates != null ? loadStates.getAppend() : null, loadStateUpdate.getMediator().getAppend())) {
                                        highSpeedVideoSizes = getHighSpeedVideoSizes(androidx.paging.PageEvent.Insert.INSTANCE.Append(kotlin.collections.CollectionsKt.emptyList(), this.getOutputFormats, loadStateUpdate.getSource(), loadStateUpdate.getMediator()), separatorState$onEvent$1);
                                        obj = highSpeedVideoSizes;
                                    }
                                }
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNull(loadStateUpdate, "");
                            highSpeedVideoSizes = loadStateUpdate;
                            obj = highSpeedVideoSizes;
                        }
                    } else {
                        androidx.paging.PageEvent.Drop drop2 = (androidx.paging.PageEvent.Drop) pageEvent;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drop2, "");
                        this.getInputSizeshNQ4ISI.set(drop2.getLoadType(), androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common());
                        if (drop2.getLoadType() == androidx.paging.LoadType.PREPEND) {
                            this.getInputFormats = drop2.getPlaceholdersRemaining();
                            this.getOutputStallDuration = false;
                        } else if (drop2.getLoadType() == androidx.paging.LoadType.APPEND) {
                            this.getOutputFormats = drop2.getPlaceholdersRemaining();
                            this.getHighSpeedVideoSizesFor = false;
                        }
                        if (this.Camera2StreamConfigurationMap.isEmpty()) {
                            if (drop2.getLoadType() == androidx.paging.LoadType.PREPEND) {
                                this.getHighSpeedVideoFpsRangesFor = false;
                            } else {
                                this.getHighSpeedVideoFpsRanges = false;
                            }
                        }
                        final kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(drop2.getMinPageOffset(), drop2.getMaxPageOffset());
                        kotlin.collections.CollectionsKt.removeAll((java.util.List) this.Camera2StreamConfigurationMap, new kotlin.jvm.functions.Function1() { // from class: androidx.paging.SeparatorState$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return java.lang.Boolean.valueOf(androidx.paging.SeparatorState.getHighResolutionOutputSizeshNQ4ISI(kotlin.ranges.IntRange.this, (androidx.paging.TransformablePage) obj2));
                            }
                        });
                        drop = drop2;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    drop = (androidx.paging.PageEvent) obj;
                } else if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    drop = (androidx.paging.PageEvent) obj;
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    drop = (androidx.paging.PageEvent) obj;
                }
                if (!this.getHighSpeedVideoFpsRanges && !this.Camera2StreamConfigurationMap.isEmpty()) {
                    throw new java.lang.IllegalStateException("deferred endTerm, page stash should be empty".toString());
                }
                if (this.getHighSpeedVideoFpsRangesFor || this.Camera2StreamConfigurationMap.isEmpty()) {
                    return drop;
                }
                throw new java.lang.IllegalStateException("deferred startTerm, page stash should be empty".toString());
            }
        }
        separatorState$onEvent$1 = new androidx.paging.SeparatorState$onEvent$1(this, continuation);
        java.lang.Object obj2 = separatorState$onEvent$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = separatorState$onEvent$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        if (!this.getHighSpeedVideoFpsRanges) {
        }
        if (this.getHighSpeedVideoFpsRangesFor) {
        }
        return drop;
    }

    private <T> boolean getHighResolutionOutputSizeshNQ4ISI(androidx.paging.PageEvent.Insert<T> insert, androidx.paging.TerminalSeparatorType terminalSeparatorType) {
        androidx.paging.LoadState prepend;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insert, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terminalSeparatorType, "");
        if (insert.getLoadType() == androidx.paging.LoadType.APPEND) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        int i = androidx.paging.SeparatorState.WhenMappings.$EnumSwitchMapping$0[terminalSeparatorType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return insert.getSourceLoadStates().getPrepend().getEndOfPaginationReached();
        }
        if (!insert.getSourceLoadStates().getPrepend().getEndOfPaginationReached()) {
            return false;
        }
        androidx.paging.LoadStates mediatorLoadStates = insert.getMediatorLoadStates();
        return mediatorLoadStates == null || (prepend = mediatorLoadStates.getPrepend()) == null || prepend.getEndOfPaginationReached();
    }

    private <T> boolean Camera2StreamConfigurationMap(androidx.paging.PageEvent.Insert<T> insert, androidx.paging.TerminalSeparatorType terminalSeparatorType) {
        androidx.paging.LoadState append;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insert, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terminalSeparatorType, "");
        if (insert.getLoadType() == androidx.paging.LoadType.PREPEND) {
            return this.getHighSpeedVideoFpsRanges;
        }
        int i = androidx.paging.SeparatorState.WhenMappings.$EnumSwitchMapping$0[terminalSeparatorType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return insert.getSourceLoadStates().getAppend().getEndOfPaginationReached();
        }
        if (!insert.getSourceLoadStates().getAppend().getEndOfPaginationReached()) {
            return false;
        }
        androidx.paging.LoadStates mediatorLoadStates = insert.getMediatorLoadStates();
        return mediatorLoadStates == null || (append = mediatorLoadStates.getAppend()) == null || append.getEndOfPaginationReached();
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x06a3, code lost:
    
        if (r2 == r4) goto L226;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0100  */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x0441 -> B:115:0x0447). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x071f -> B:24:0x0720). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0639 -> B:54:0x00c5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(androidx.paging.PageEvent.Insert<T> insert, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent.Insert<R>> continuation) {
        androidx.paging.SeparatorState$onInsert$1 separatorState$onInsert$1;
        boolean Camera2StreamConfigurationMap;
        int i;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        androidx.paging.TransformablePage<T> transformablePage;
        java.lang.Integer num;
        androidx.paging.TransformablePage<T> transformablePage2;
        java.lang.Integer num2;
        androidx.paging.PageEvent.Insert<T> insert2;
        androidx.paging.TransformablePage<T> transformablePage3;
        androidx.paging.TransformablePage<T> transformablePage4;
        int i2;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        java.lang.Object obj;
        java.lang.Integer num3;
        androidx.paging.TransformablePage<T> transformablePage5;
        androidx.paging.TransformablePage<T> transformablePage6;
        boolean z;
        java.util.ArrayList arrayList5;
        java.lang.Integer num4;
        boolean z2;
        boolean z3;
        int i3;
        int intValue;
        boolean z4;
        androidx.paging.TransformablePage<T> transformablePage7;
        int i4;
        java.lang.Integer num5;
        java.lang.Integer num6;
        int i5;
        java.util.ArrayList arrayList6;
        androidx.paging.PageEvent.Insert<T> insert3;
        java.lang.Integer num7;
        java.util.ArrayList arrayList7;
        java.lang.Integer num8;
        java.lang.Object obj2;
        java.util.ArrayList arrayList8;
        androidx.paging.PageEvent.Insert<T> insert4;
        androidx.paging.TransformablePage transformablePage8;
        java.lang.Integer num9;
        boolean z5;
        java.util.ArrayList arrayList9;
        androidx.paging.TransformablePage<T> transformablePage9;
        androidx.paging.TransformablePage<T> transformablePage10;
        java.util.ArrayList arrayList10;
        java.util.ArrayList arrayList11;
        java.util.ArrayList arrayList12;
        java.util.Iterator it;
        java.lang.Object next;
        java.lang.Integer num10;
        androidx.paging.TransformablePage<T> transformablePage11;
        java.util.Iterator it2;
        androidx.paging.TransformablePage<T> transformablePage12;
        java.util.ArrayList arrayList13;
        java.util.ArrayList arrayList14;
        androidx.paging.PageEvent.Insert<T> insert5;
        androidx.paging.TransformablePage transformablePage13;
        androidx.paging.TransformablePage transformablePage14;
        java.util.Iterator it3;
        java.lang.Integer num11;
        java.lang.Object obj3;
        boolean z6;
        java.util.ArrayList arrayList15;
        androidx.paging.TransformablePage<T> transformablePage15;
        java.lang.Integer num12;
        java.util.Iterator it4;
        androidx.paging.TransformablePage transformablePage16;
        androidx.paging.TransformablePage transformablePage17;
        androidx.paging.PageEvent.Insert<T> insert6;
        java.util.ArrayList arrayList16;
        java.util.ArrayList arrayList17;
        int hintOriginalPageOffset;
        int i6;
        int intValue2;
        androidx.paging.TransformablePage transformablePage18;
        androidx.paging.SeparatorState$onInsert$1 separatorState$onInsert$12;
        boolean z7;
        java.util.ArrayList arrayList18;
        java.util.ArrayList arrayList19;
        androidx.paging.PageEvent.Insert<T> insert7;
        androidx.paging.TransformablePage<T> transformablePage19;
        int intValue3;
        int lastIndex;
        int i7;
        java.util.ArrayList arrayList20;
        androidx.paging.PageEvent.Insert<T> insert8;
        int i8;
        int i9;
        java.util.ArrayList arrayList21;
        androidx.paging.TransformablePage<T> transformablePage20;
        java.lang.Object invoke;
        java.lang.Object obj4;
        androidx.paging.TransformablePage<T> transformablePage21;
        java.util.ArrayList arrayList22;
        java.util.ArrayList arrayList23;
        androidx.paging.PageEvent.Insert<T> insert9 = insert;
        if (continuation instanceof androidx.paging.SeparatorState$onInsert$1) {
            separatorState$onInsert$1 = (androidx.paging.SeparatorState$onInsert$1) continuation;
            if ((separatorState$onInsert$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                separatorState$onInsert$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj5 = separatorState$onInsert$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (separatorState$onInsert$1.getOutputStallDurationlomOqCM) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj5);
                        boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(insert9, this.getHighSpeedVideoSizes);
                        Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(insert9, this.getHighSpeedVideoSizes);
                        java.util.List<androidx.paging.TransformablePage<T>> pages = insert.getPages();
                        if (!(pages instanceof java.util.Collection) || !pages.isEmpty()) {
                            java.util.Iterator it5 = pages.iterator();
                            while (it5.hasNext()) {
                                if (!((androidx.paging.TransformablePage) it5.next()).getData().isEmpty()) {
                                    i = 0;
                                    if (!this.getOutputStallDuration && insert.getLoadType() == androidx.paging.LoadType.PREPEND && i == 0) {
                                        throw new java.lang.IllegalArgumentException("Additional prepend event after prepend state is done".toString());
                                    }
                                    if (!this.getHighSpeedVideoSizesFor && insert.getLoadType() == androidx.paging.LoadType.APPEND && i == 0) {
                                        throw new java.lang.IllegalArgumentException("Additional append event after append state is done".toString());
                                    }
                                    this.getInputSizeshNQ4ISI.set(insert.getSourceLoadStates());
                                    this.getOutputMinFrameDuration = insert.getMediatorLoadStates();
                                    if (insert.getLoadType() != androidx.paging.LoadType.APPEND) {
                                        this.getInputFormats = insert.getPlaceholdersBefore();
                                    }
                                    if (insert.getLoadType() != androidx.paging.LoadType.PREPEND) {
                                        this.getOutputFormats = insert.getPlaceholdersAfter();
                                    }
                                    if (i != 0) {
                                        if (highResolutionOutputSizeshNQ4ISI || Camera2StreamConfigurationMap) {
                                            if (!this.getOutputStallDuration || !this.getHighSpeedVideoSizesFor) {
                                                if (this.Camera2StreamConfigurationMap.isEmpty()) {
                                                    if (highResolutionOutputSizeshNQ4ISI && Camera2StreamConfigurationMap && !this.getOutputStallDuration && !this.getHighSpeedVideoSizesFor) {
                                                        kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function3 = this.getHighResolutionOutputSizeshNQ4ISI;
                                                        separatorState$onInsert$1.getHighSpeedVideoFpsRanges = insert9;
                                                        z3 = true;
                                                        separatorState$onInsert$1.getOutputStallDurationlomOqCM = 1;
                                                        obj5 = function3.invoke(null, null, separatorState$onInsert$1);
                                                        if (obj5 != coroutine_suspended) {
                                                            i3 = 0;
                                                            this.getHighSpeedVideoFpsRanges = i3;
                                                            this.getHighSpeedVideoFpsRangesFor = i3;
                                                            this.getOutputStallDuration = z3;
                                                            this.getHighSpeedVideoSizesFor = z3;
                                                            if (obj5 == null) {
                                                                androidx.paging.LoadType loadType = insert9.getLoadType();
                                                                insert9.getPages();
                                                                return new androidx.paging.PageEvent.Insert(loadType, kotlin.collections.CollectionsKt.listOf(androidx.paging.SeparatorsKt.separatorPage(obj5, new int[]{i3}, i3, i3)), insert9.getPlaceholdersBefore(), insert9.getPlaceholdersAfter(), insert9.getSourceLoadStates(), insert9.getMediatorLoadStates(), null);
                                                            }
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insert9, "");
                                                            return insert9;
                                                        }
                                                        return coroutine_suspended;
                                                    }
                                                    if (!Camera2StreamConfigurationMap || this.getHighSpeedVideoSizesFor) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = true;
                                                        this.getHighSpeedVideoFpsRanges = true;
                                                    }
                                                    if (highResolutionOutputSizeshNQ4ISI && !this.getOutputStallDuration) {
                                                        this.getHighSpeedVideoFpsRangesFor = z2;
                                                    }
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insert9, "");
                                                    return insert9;
                                                }
                                            } else {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insert9, "");
                                                return insert9;
                                            }
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insert9, "");
                                            return insert9;
                                        }
                                    }
                                    arrayList = new java.util.ArrayList(insert.getPages().size());
                                    arrayList2 = new java.util.ArrayList(insert.getPages().size());
                                    if (i != 0) {
                                        int i10 = 0;
                                        while (i10 < kotlin.collections.CollectionsKt.getLastIndex(insert.getPages()) && insert.getPages().get(i10).getData().isEmpty()) {
                                            i10++;
                                        }
                                        num = kotlin.coroutines.jvm.internal.Boxing.boxInt(i10);
                                        transformablePage = insert.getPages().get(i10);
                                        int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(insert.getPages());
                                        while (lastIndex2 > 0 && insert.getPages().get(lastIndex2).getData().isEmpty()) {
                                            lastIndex2--;
                                        }
                                        num2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(lastIndex2);
                                        transformablePage2 = insert.getPages().get(lastIndex2);
                                    } else {
                                        transformablePage = null;
                                        num = null;
                                        transformablePage2 = null;
                                        num2 = null;
                                    }
                                    if (!highResolutionOutputSizeshNQ4ISI && !this.getOutputStallDuration) {
                                        this.getOutputStallDuration = true;
                                        if (i != 0) {
                                            transformablePage3 = (androidx.paging.TransformablePage) kotlin.collections.CollectionsKt.first((java.util.List) this.Camera2StreamConfigurationMap);
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(transformablePage);
                                            transformablePage3 = transformablePage;
                                        }
                                        java.util.ArrayList arrayList24 = arrayList;
                                        kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function32 = this.getHighResolutionOutputSizeshNQ4ISI;
                                        java.lang.Object first = kotlin.collections.CollectionsKt.first((java.util.List<? extends java.lang.Object>) transformablePage3.getData());
                                        separatorState$onInsert$1.getHighSpeedVideoFpsRanges = insert9;
                                        separatorState$onInsert$1.Camera2StreamConfigurationMap = arrayList;
                                        separatorState$onInsert$1.getInputFormats = arrayList2;
                                        separatorState$onInsert$1.getOutputFormats = transformablePage;
                                        separatorState$onInsert$1.getOutputMinFrameDuration = num;
                                        separatorState$onInsert$1.getHighSpeedVideoSizesFor = transformablePage2;
                                        separatorState$onInsert$1.getInputSizeshNQ4ISI = num2;
                                        separatorState$onInsert$1.getOutputStallDuration = transformablePage3;
                                        separatorState$onInsert$1.getOutputMinFrameDurationlomOqCM = arrayList24;
                                        separatorState$onInsert$1.getOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
                                        separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI = i;
                                        separatorState$onInsert$1.getOutputStallDurationlomOqCM = 2;
                                        java.lang.Object invoke2 = function32.invoke(null, first, separatorState$onInsert$1);
                                        if (invoke2 != coroutine_suspended) {
                                            transformablePage4 = transformablePage;
                                            i2 = i;
                                            arrayList3 = arrayList2;
                                            arrayList4 = arrayList;
                                            obj = invoke2;
                                            insert2 = insert;
                                            num3 = num;
                                            transformablePage5 = transformablePage2;
                                            transformablePage6 = transformablePage3;
                                            z = Camera2StreamConfigurationMap;
                                            arrayList5 = arrayList24;
                                            num4 = num2;
                                            int hintOriginalPageOffset2 = transformablePage6.getHintOriginalPageOffset();
                                            java.util.List<java.lang.Integer> hintOriginalIndices = transformablePage6.getHintOriginalIndices();
                                            androidx.paging.SeparatorsKt.addSeparatorPage(arrayList5, obj, null, transformablePage6, hintOriginalPageOffset2, hintOriginalIndices == null ? ((java.lang.Number) kotlin.collections.CollectionsKt.first((java.util.List) hintOriginalIndices)).intValue() : 0);
                                            i = i2;
                                            Camera2StreamConfigurationMap = z;
                                            num2 = num4;
                                            transformablePage2 = transformablePage5;
                                            num = num3;
                                            transformablePage = transformablePage4;
                                            arrayList2 = arrayList3;
                                            arrayList = arrayList4;
                                            if (i == 0) {
                                            }
                                            separatorState$onInsert$12 = separatorState$onInsert$1;
                                            z7 = Camera2StreamConfigurationMap;
                                            arrayList18 = arrayList2;
                                            arrayList19 = arrayList;
                                            insert7 = insert2;
                                            transformablePage19 = transformablePage2;
                                            if (z7) {
                                            }
                                            this.getHighSpeedVideoFpsRanges = false;
                                            this.getHighSpeedVideoFpsRangesFor = false;
                                            if (insert7.getLoadType() == androidx.paging.LoadType.APPEND) {
                                            }
                                            androidx.paging.LoadType loadType2 = insert7.getLoadType();
                                            insert7.getPages();
                                            return new androidx.paging.PageEvent.Insert(loadType2, arrayList19, insert7.getPlaceholdersBefore(), insert7.getPlaceholdersAfter(), insert7.getSourceLoadStates(), insert7.getMediatorLoadStates(), null);
                                        }
                                        return coroutine_suspended;
                                    }
                                    insert2 = insert;
                                    if (i == 0) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                                        intValue = num.intValue();
                                        z4 = Camera2StreamConfigurationMap;
                                        transformablePage7 = transformablePage;
                                        i4 = 0;
                                        java.lang.Integer num13 = num2;
                                        num5 = num;
                                        num6 = num13;
                                        if (i4 < intValue) {
                                            androidx.paging.TransformablePage<T> transformablePage22 = insert2.getPages().get(i4);
                                            kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function33 = this.getHighResolutionOutputSizeshNQ4ISI;
                                            separatorState$onInsert$1.getHighSpeedVideoFpsRanges = insert2;
                                            separatorState$onInsert$1.Camera2StreamConfigurationMap = arrayList;
                                            separatorState$onInsert$1.getInputFormats = arrayList2;
                                            separatorState$onInsert$1.getOutputFormats = transformablePage7;
                                            separatorState$onInsert$1.getOutputMinFrameDuration = num5;
                                            separatorState$onInsert$1.getHighSpeedVideoSizesFor = transformablePage2;
                                            separatorState$onInsert$1.getInputSizeshNQ4ISI = num6;
                                            separatorState$onInsert$1.getOutputStallDuration = arrayList;
                                            num9 = num6;
                                            separatorState$onInsert$1.getOutputMinFrameDurationlomOqCM = null;
                                            separatorState$onInsert$1.getOutputSizeshNQ4ISI = z4;
                                            separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI = i;
                                            separatorState$onInsert$1.getHighSpeedVideoSizes = i4;
                                            separatorState$onInsert$1.getHighSpeedVideoFpsRangesFor = intValue;
                                            separatorState$onInsert$1.getOutputStallDurationlomOqCM = 3;
                                            java.lang.Object insertInternalSeparators = androidx.paging.SeparatorsKt.insertInternalSeparators(transformablePage22, function33, separatorState$onInsert$1);
                                            if (insertInternalSeparators != coroutine_suspended) {
                                                z5 = z4;
                                                obj5 = insertInternalSeparators;
                                                arrayList9 = arrayList;
                                                transformablePage9 = transformablePage7;
                                                transformablePage10 = transformablePage2;
                                                arrayList10 = arrayList9;
                                                arrayList10.add(obj5);
                                                i4++;
                                                z4 = z5;
                                                transformablePage2 = transformablePage10;
                                                transformablePage7 = transformablePage9;
                                                arrayList = arrayList9;
                                                num6 = num9;
                                                if (i4 < intValue) {
                                                    java.lang.Integer num14 = num6;
                                                    if (insert2.getLoadType() == androidx.paging.LoadType.APPEND && !this.Camera2StreamConfigurationMap.isEmpty()) {
                                                        androidx.paging.TransformablePage transformablePage23 = (androidx.paging.TransformablePage) kotlin.collections.CollectionsKt.last((java.util.List) this.Camera2StreamConfigurationMap);
                                                        kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function34 = this.getHighResolutionOutputSizeshNQ4ISI;
                                                        java.lang.Object last = kotlin.collections.CollectionsKt.last((java.util.List<? extends java.lang.Object>) transformablePage23.getData());
                                                        kotlin.jvm.internal.Intrinsics.checkNotNull(transformablePage7);
                                                        java.lang.Object first2 = kotlin.collections.CollectionsKt.first((java.util.List<? extends java.lang.Object>) transformablePage7.getData());
                                                        separatorState$onInsert$1.getHighSpeedVideoFpsRanges = insert2;
                                                        separatorState$onInsert$1.Camera2StreamConfigurationMap = arrayList;
                                                        separatorState$onInsert$1.getInputFormats = arrayList2;
                                                        separatorState$onInsert$1.getOutputFormats = transformablePage7;
                                                        separatorState$onInsert$1.getOutputMinFrameDuration = num5;
                                                        separatorState$onInsert$1.getHighSpeedVideoSizesFor = transformablePage2;
                                                        num8 = num14;
                                                        separatorState$onInsert$1.getInputSizeshNQ4ISI = num8;
                                                        separatorState$onInsert$1.getOutputStallDuration = transformablePage23;
                                                        separatorState$onInsert$1.getOutputMinFrameDurationlomOqCM = null;
                                                        separatorState$onInsert$1.getOutputSizeshNQ4ISI = z4;
                                                        separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI = i;
                                                        separatorState$onInsert$1.getOutputStallDurationlomOqCM = 4;
                                                        java.lang.Object invoke3 = function34.invoke(last, first2, separatorState$onInsert$1);
                                                        if (invoke3 != coroutine_suspended) {
                                                            obj2 = invoke3;
                                                            i5 = i;
                                                            arrayList8 = arrayList;
                                                            insert4 = insert2;
                                                            transformablePage8 = transformablePage23;
                                                            androidx.paging.TransformablePage<T> transformablePage24 = transformablePage7;
                                                            arrayList7 = arrayList2;
                                                            androidx.paging.TransformablePage<T> transformablePage25 = transformablePage2;
                                                            java.lang.Integer num15 = num5;
                                                            java.util.ArrayList arrayList25 = arrayList8;
                                                            int hintOriginalPageOffset3 = transformablePage24.getHintOriginalPageOffset();
                                                            java.util.List<java.lang.Integer> hintOriginalIndices2 = transformablePage24.getHintOriginalIndices();
                                                            androidx.paging.SeparatorsKt.addSeparatorPage(arrayList25, obj2, transformablePage8, transformablePage24, hintOriginalPageOffset3, hintOriginalIndices2 == null ? ((java.lang.Number) kotlin.collections.CollectionsKt.first((java.util.List) hintOriginalIndices2)).intValue() : 0);
                                                            Camera2StreamConfigurationMap = z4;
                                                            transformablePage2 = transformablePage25;
                                                            num5 = num15;
                                                            transformablePage7 = transformablePage24;
                                                            num7 = num8;
                                                            arrayList6 = arrayList8;
                                                            insert3 = insert4;
                                                            kotlin.jvm.internal.Intrinsics.checkNotNull(transformablePage7);
                                                            arrayList7.add(getHighSpeedVideoSizes(transformablePage7));
                                                            kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function35 = this.getHighResolutionOutputSizeshNQ4ISI;
                                                            separatorState$onInsert$1.getHighSpeedVideoFpsRanges = insert3;
                                                            separatorState$onInsert$1.Camera2StreamConfigurationMap = arrayList6;
                                                            separatorState$onInsert$1.getInputFormats = arrayList7;
                                                            separatorState$onInsert$1.getOutputFormats = num5;
                                                            separatorState$onInsert$1.getOutputMinFrameDuration = transformablePage2;
                                                            separatorState$onInsert$1.getHighSpeedVideoSizesFor = num7;
                                                            separatorState$onInsert$1.getInputSizeshNQ4ISI = arrayList6;
                                                            separatorState$onInsert$1.getOutputStallDuration = null;
                                                            separatorState$onInsert$1.getOutputMinFrameDurationlomOqCM = null;
                                                            separatorState$onInsert$1.getOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
                                                            separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                                                            separatorState$onInsert$1.getOutputStallDurationlomOqCM = 5;
                                                            obj5 = androidx.paging.SeparatorsKt.insertInternalSeparators(transformablePage7, function35, separatorState$onInsert$1);
                                                            if (obj5 != coroutine_suspended) {
                                                            }
                                                        }
                                                    } else {
                                                        Camera2StreamConfigurationMap = z4;
                                                        i5 = i;
                                                        arrayList6 = arrayList;
                                                        insert3 = insert2;
                                                        num7 = num14;
                                                        arrayList7 = arrayList2;
                                                        kotlin.jvm.internal.Intrinsics.checkNotNull(transformablePage7);
                                                        arrayList7.add(getHighSpeedVideoSizes(transformablePage7));
                                                        kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function352 = this.getHighResolutionOutputSizeshNQ4ISI;
                                                        separatorState$onInsert$1.getHighSpeedVideoFpsRanges = insert3;
                                                        separatorState$onInsert$1.Camera2StreamConfigurationMap = arrayList6;
                                                        separatorState$onInsert$1.getInputFormats = arrayList7;
                                                        separatorState$onInsert$1.getOutputFormats = num5;
                                                        separatorState$onInsert$1.getOutputMinFrameDuration = transformablePage2;
                                                        separatorState$onInsert$1.getHighSpeedVideoSizesFor = num7;
                                                        separatorState$onInsert$1.getInputSizeshNQ4ISI = arrayList6;
                                                        separatorState$onInsert$1.getOutputStallDuration = null;
                                                        separatorState$onInsert$1.getOutputMinFrameDurationlomOqCM = null;
                                                        separatorState$onInsert$1.getOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
                                                        separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                                                        separatorState$onInsert$1.getOutputStallDurationlomOqCM = 5;
                                                        obj5 = androidx.paging.SeparatorsKt.insertInternalSeparators(transformablePage7, function352, separatorState$onInsert$1);
                                                        if (obj5 != coroutine_suspended) {
                                                            arrayList11 = arrayList6;
                                                            arrayList12 = arrayList7;
                                                            arrayList6.add(obj5);
                                                            java.util.List<androidx.paging.TransformablePage<T>> pages2 = insert3.getPages();
                                                            int intValue4 = num5.intValue();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNull(num7);
                                                            it = pages2.subList(intValue4, num7.intValue() + 1).iterator();
                                                            if (it.hasNext()) {
                                                                throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
                                                            }
                                                            next = it.next();
                                                            num10 = num7;
                                                            insert2 = insert3;
                                                            arrayList = arrayList11;
                                                            arrayList2 = arrayList12;
                                                            transformablePage11 = transformablePage2;
                                                            it2 = it;
                                                            if (it2.hasNext()) {
                                                                androidx.paging.TransformablePage transformablePage26 = (androidx.paging.TransformablePage) it2.next();
                                                                androidx.paging.TransformablePage transformablePage27 = (androidx.paging.TransformablePage) next;
                                                                if (!transformablePage26.getData().isEmpty()) {
                                                                    kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function36 = this.getHighResolutionOutputSizeshNQ4ISI;
                                                                    java.lang.Object last2 = kotlin.collections.CollectionsKt.last((java.util.List<? extends java.lang.Object>) transformablePage27.getData());
                                                                    java.lang.Object first3 = kotlin.collections.CollectionsKt.first((java.util.List<? extends java.lang.Object>) transformablePage26.getData());
                                                                    separatorState$onInsert$1.getHighSpeedVideoFpsRanges = insert2;
                                                                    separatorState$onInsert$1.Camera2StreamConfigurationMap = arrayList;
                                                                    separatorState$onInsert$1.getInputFormats = arrayList2;
                                                                    separatorState$onInsert$1.getOutputFormats = transformablePage11;
                                                                    separatorState$onInsert$1.getOutputMinFrameDuration = num10;
                                                                    separatorState$onInsert$1.getHighSpeedVideoSizesFor = it2;
                                                                    separatorState$onInsert$1.getInputSizeshNQ4ISI = transformablePage26;
                                                                    separatorState$onInsert$1.getOutputStallDuration = transformablePage27;
                                                                    separatorState$onInsert$1.getOutputMinFrameDurationlomOqCM = null;
                                                                    separatorState$onInsert$1.getOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
                                                                    separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                                                                    separatorState$onInsert$1.getOutputStallDurationlomOqCM = 6;
                                                                    java.lang.Object invoke4 = function36.invoke(last2, first3, separatorState$onInsert$1);
                                                                    if (invoke4 != coroutine_suspended) {
                                                                        obj3 = invoke4;
                                                                        z6 = Camera2StreamConfigurationMap;
                                                                        transformablePage12 = transformablePage11;
                                                                        arrayList13 = arrayList2;
                                                                        arrayList14 = arrayList;
                                                                        insert5 = insert2;
                                                                        transformablePage13 = transformablePage27;
                                                                        transformablePage14 = transformablePage26;
                                                                        it3 = it2;
                                                                        num11 = num10;
                                                                        java.util.ArrayList arrayList26 = arrayList14;
                                                                        if (insert5.getLoadType() != androidx.paging.LoadType.PREPEND) {
                                                                            hintOriginalPageOffset = transformablePage13.getHintOriginalPageOffset();
                                                                        } else {
                                                                            hintOriginalPageOffset = transformablePage14.getHintOriginalPageOffset();
                                                                        }
                                                                        int i11 = hintOriginalPageOffset;
                                                                        if (insert5.getLoadType() == androidx.paging.LoadType.PREPEND) {
                                                                            java.util.List<java.lang.Integer> hintOriginalIndices3 = transformablePage13.getHintOriginalIndices();
                                                                            intValue2 = hintOriginalIndices3 != null ? ((java.lang.Number) kotlin.collections.CollectionsKt.last((java.util.List) hintOriginalIndices3)).intValue() : kotlin.collections.CollectionsKt.getLastIndex(transformablePage13.getData());
                                                                        } else {
                                                                            java.util.List<java.lang.Integer> hintOriginalIndices4 = transformablePage14.getHintOriginalIndices();
                                                                            if (hintOriginalIndices4 != null) {
                                                                                intValue2 = ((java.lang.Number) kotlin.collections.CollectionsKt.first((java.util.List) hintOriginalIndices4)).intValue();
                                                                            } else {
                                                                                i6 = 0;
                                                                                androidx.paging.SeparatorsKt.addSeparatorPage(arrayList26, obj3, transformablePage13, transformablePage14, i11, i6);
                                                                                Camera2StreamConfigurationMap = z6;
                                                                                transformablePage17 = transformablePage13;
                                                                                transformablePage16 = transformablePage14;
                                                                                it4 = it3;
                                                                                num12 = num11;
                                                                                transformablePage15 = transformablePage12;
                                                                                arrayList15 = arrayList13;
                                                                                arrayList16 = arrayList14;
                                                                                insert6 = insert5;
                                                                                if (!transformablePage16.getData().isEmpty()) {
                                                                                    arrayList15.add(getHighSpeedVideoSizes(transformablePage16));
                                                                                }
                                                                                kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function37 = this.getHighResolutionOutputSizeshNQ4ISI;
                                                                                separatorState$onInsert$1.getHighSpeedVideoFpsRanges = insert6;
                                                                                separatorState$onInsert$1.Camera2StreamConfigurationMap = arrayList16;
                                                                                separatorState$onInsert$1.getInputFormats = arrayList15;
                                                                                separatorState$onInsert$1.getOutputFormats = transformablePage15;
                                                                                separatorState$onInsert$1.getOutputMinFrameDuration = num12;
                                                                                separatorState$onInsert$1.getHighSpeedVideoSizesFor = it4;
                                                                                separatorState$onInsert$1.getInputSizeshNQ4ISI = transformablePage16;
                                                                                separatorState$onInsert$1.getOutputStallDuration = transformablePage17;
                                                                                separatorState$onInsert$1.getOutputMinFrameDurationlomOqCM = arrayList16;
                                                                                separatorState$onInsert$1.getOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
                                                                                separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                                                                                separatorState$onInsert$1.getOutputStallDurationlomOqCM = 7;
                                                                                obj5 = androidx.paging.SeparatorsKt.insertInternalSeparators(transformablePage16, function37, separatorState$onInsert$1);
                                                                                if (obj5 != coroutine_suspended) {
                                                                                    arrayList17 = arrayList16;
                                                                                    androidx.paging.PageEvent.Insert<T> insert10 = insert6;
                                                                                    it2 = it4;
                                                                                    arrayList2 = arrayList15;
                                                                                    arrayList16.add(obj5);
                                                                                    next = transformablePage16.getData().isEmpty() ? transformablePage16 : transformablePage17;
                                                                                    num10 = num12;
                                                                                    transformablePage11 = transformablePage15;
                                                                                    insert2 = insert10;
                                                                                    arrayList = arrayList17;
                                                                                    if (it2.hasNext()) {
                                                                                        if (insert2.getLoadType() == androidx.paging.LoadType.PREPEND && !this.Camera2StreamConfigurationMap.isEmpty()) {
                                                                                            transformablePage18 = (androidx.paging.TransformablePage) kotlin.collections.CollectionsKt.first((java.util.List) this.Camera2StreamConfigurationMap);
                                                                                            kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function38 = this.getHighResolutionOutputSizeshNQ4ISI;
                                                                                            kotlin.jvm.internal.Intrinsics.checkNotNull(transformablePage11);
                                                                                            java.lang.Object last3 = kotlin.collections.CollectionsKt.last((java.util.List<? extends java.lang.Object>) transformablePage11.getData());
                                                                                            java.lang.Object first4 = kotlin.collections.CollectionsKt.first((java.util.List<? extends java.lang.Object>) transformablePage18.getData());
                                                                                            separatorState$onInsert$1.getHighSpeedVideoFpsRanges = insert2;
                                                                                            separatorState$onInsert$1.Camera2StreamConfigurationMap = arrayList;
                                                                                            separatorState$onInsert$1.getInputFormats = arrayList2;
                                                                                            separatorState$onInsert$1.getOutputFormats = transformablePage11;
                                                                                            separatorState$onInsert$1.getOutputMinFrameDuration = num10;
                                                                                            separatorState$onInsert$1.getHighSpeedVideoSizesFor = transformablePage18;
                                                                                            separatorState$onInsert$1.getInputSizeshNQ4ISI = null;
                                                                                            separatorState$onInsert$1.getOutputStallDuration = null;
                                                                                            separatorState$onInsert$1.getOutputMinFrameDurationlomOqCM = null;
                                                                                            separatorState$onInsert$1.getOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
                                                                                            separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                                                                                            separatorState$onInsert$1.getOutputStallDurationlomOqCM = 8;
                                                                                            obj5 = function38.invoke(last3, first4, separatorState$onInsert$1);
                                                                                            break;
                                                                                        } else {
                                                                                            i = i5;
                                                                                            transformablePage2 = transformablePage11;
                                                                                            intValue3 = num10.intValue() + 1;
                                                                                            lastIndex = kotlin.collections.CollectionsKt.getLastIndex(insert2.getPages());
                                                                                            if (intValue3 <= lastIndex) {
                                                                                                z7 = Camera2StreamConfigurationMap;
                                                                                                i7 = i;
                                                                                                arrayList20 = arrayList;
                                                                                                insert8 = insert2;
                                                                                                i8 = intValue3;
                                                                                                i9 = lastIndex;
                                                                                                arrayList21 = arrayList2;
                                                                                                transformablePage19 = transformablePage2;
                                                                                                androidx.paging.TransformablePage<T> transformablePage28 = insert8.getPages().get(i8);
                                                                                                kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function39 = this.getHighResolutionOutputSizeshNQ4ISI;
                                                                                                separatorState$onInsert$1.getHighSpeedVideoFpsRanges = insert8;
                                                                                                separatorState$onInsert$1.Camera2StreamConfigurationMap = arrayList20;
                                                                                                separatorState$onInsert$1.getInputFormats = arrayList21;
                                                                                                separatorState$onInsert$1.getOutputFormats = transformablePage19;
                                                                                                separatorState$onInsert$1.getOutputMinFrameDuration = arrayList20;
                                                                                                separatorState$onInsert$1.getHighSpeedVideoSizesFor = null;
                                                                                                separatorState$onInsert$1.getInputSizeshNQ4ISI = null;
                                                                                                separatorState$onInsert$1.getOutputStallDuration = null;
                                                                                                separatorState$onInsert$1.getOutputMinFrameDurationlomOqCM = null;
                                                                                                separatorState$onInsert$1.getOutputSizeshNQ4ISI = z7;
                                                                                                separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI = i7;
                                                                                                separatorState$onInsert$1.getHighSpeedVideoSizes = i8;
                                                                                                separatorState$onInsert$1.getHighSpeedVideoFpsRangesFor = i9;
                                                                                                separatorState$onInsert$1.getOutputStallDurationlomOqCM = 9;
                                                                                                obj5 = androidx.paging.SeparatorsKt.insertInternalSeparators(transformablePage28, function39, separatorState$onInsert$1);
                                                                                                if (obj5 != coroutine_suspended) {
                                                                                                    arrayList23 = arrayList20;
                                                                                                    arrayList20.add(obj5);
                                                                                                    if (i8 == i9) {
                                                                                                        i8++;
                                                                                                        arrayList20 = arrayList23;
                                                                                                        androidx.paging.TransformablePage<T> transformablePage282 = insert8.getPages().get(i8);
                                                                                                        kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function392 = this.getHighResolutionOutputSizeshNQ4ISI;
                                                                                                        separatorState$onInsert$1.getHighSpeedVideoFpsRanges = insert8;
                                                                                                        separatorState$onInsert$1.Camera2StreamConfigurationMap = arrayList20;
                                                                                                        separatorState$onInsert$1.getInputFormats = arrayList21;
                                                                                                        separatorState$onInsert$1.getOutputFormats = transformablePage19;
                                                                                                        separatorState$onInsert$1.getOutputMinFrameDuration = arrayList20;
                                                                                                        separatorState$onInsert$1.getHighSpeedVideoSizesFor = null;
                                                                                                        separatorState$onInsert$1.getInputSizeshNQ4ISI = null;
                                                                                                        separatorState$onInsert$1.getOutputStallDuration = null;
                                                                                                        separatorState$onInsert$1.getOutputMinFrameDurationlomOqCM = null;
                                                                                                        separatorState$onInsert$1.getOutputSizeshNQ4ISI = z7;
                                                                                                        separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI = i7;
                                                                                                        separatorState$onInsert$1.getHighSpeedVideoSizes = i8;
                                                                                                        separatorState$onInsert$1.getHighSpeedVideoFpsRangesFor = i9;
                                                                                                        separatorState$onInsert$1.getOutputStallDurationlomOqCM = 9;
                                                                                                        obj5 = androidx.paging.SeparatorsKt.insertInternalSeparators(transformablePage282, function392, separatorState$onInsert$1);
                                                                                                        if (obj5 != coroutine_suspended) {
                                                                                                        }
                                                                                                    } else {
                                                                                                        separatorState$onInsert$12 = separatorState$onInsert$1;
                                                                                                        i = i7;
                                                                                                        arrayList18 = arrayList21;
                                                                                                        arrayList19 = arrayList23;
                                                                                                        insert7 = insert8;
                                                                                                        if (z7 && !this.getHighSpeedVideoSizesFor) {
                                                                                                            this.getHighSpeedVideoSizesFor = true;
                                                                                                            if (i == 0) {
                                                                                                                transformablePage20 = (androidx.paging.TransformablePage) kotlin.collections.CollectionsKt.last((java.util.List) this.Camera2StreamConfigurationMap);
                                                                                                            } else {
                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNull(transformablePage19);
                                                                                                                transformablePage20 = transformablePage19;
                                                                                                            }
                                                                                                            java.util.ArrayList arrayList27 = arrayList19;
                                                                                                            kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function310 = this.getHighResolutionOutputSizeshNQ4ISI;
                                                                                                            java.lang.Object last4 = kotlin.collections.CollectionsKt.last((java.util.List<? extends java.lang.Object>) transformablePage20.getData());
                                                                                                            separatorState$onInsert$12.getHighSpeedVideoFpsRanges = insert7;
                                                                                                            separatorState$onInsert$12.Camera2StreamConfigurationMap = arrayList19;
                                                                                                            separatorState$onInsert$12.getInputFormats = arrayList18;
                                                                                                            separatorState$onInsert$12.getOutputFormats = transformablePage20;
                                                                                                            separatorState$onInsert$12.getOutputMinFrameDuration = arrayList27;
                                                                                                            separatorState$onInsert$12.getHighSpeedVideoSizesFor = null;
                                                                                                            separatorState$onInsert$12.getInputSizeshNQ4ISI = null;
                                                                                                            separatorState$onInsert$12.getOutputStallDuration = null;
                                                                                                            separatorState$onInsert$12.getOutputMinFrameDurationlomOqCM = null;
                                                                                                            separatorState$onInsert$12.getOutputStallDurationlomOqCM = 10;
                                                                                                            invoke = function310.invoke(last4, null, separatorState$onInsert$12);
                                                                                                            if (invoke != coroutine_suspended) {
                                                                                                                obj4 = invoke;
                                                                                                                transformablePage21 = transformablePage20;
                                                                                                                arrayList22 = arrayList27;
                                                                                                                int hintOriginalPageOffset4 = transformablePage21.getHintOriginalPageOffset();
                                                                                                                java.util.List<java.lang.Integer> hintOriginalIndices5 = transformablePage21.getHintOriginalIndices();
                                                                                                                androidx.paging.SeparatorsKt.addSeparatorPage(arrayList22, obj4, transformablePage21, null, hintOriginalPageOffset4, hintOriginalIndices5 == null ? ((java.lang.Number) kotlin.collections.CollectionsKt.last((java.util.List) hintOriginalIndices5)).intValue() : kotlin.collections.CollectionsKt.getLastIndex(transformablePage21.getData()));
                                                                                                            }
                                                                                                        }
                                                                                                        this.getHighSpeedVideoFpsRanges = false;
                                                                                                        this.getHighSpeedVideoFpsRangesFor = false;
                                                                                                        if (insert7.getLoadType() == androidx.paging.LoadType.APPEND) {
                                                                                                            this.Camera2StreamConfigurationMap.addAll(arrayList18);
                                                                                                        } else {
                                                                                                            this.Camera2StreamConfigurationMap.addAll(0, arrayList18);
                                                                                                        }
                                                                                                        androidx.paging.LoadType loadType22 = insert7.getLoadType();
                                                                                                        insert7.getPages();
                                                                                                        return new androidx.paging.PageEvent.Insert(loadType22, arrayList19, insert7.getPlaceholdersBefore(), insert7.getPlaceholdersAfter(), insert7.getSourceLoadStates(), insert7.getMediatorLoadStates(), null);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        i6 = intValue2;
                                                                        androidx.paging.SeparatorsKt.addSeparatorPage(arrayList26, obj3, transformablePage13, transformablePage14, i11, i6);
                                                                        Camera2StreamConfigurationMap = z6;
                                                                        transformablePage17 = transformablePage13;
                                                                        transformablePage16 = transformablePage14;
                                                                        it4 = it3;
                                                                        num12 = num11;
                                                                        transformablePage15 = transformablePage12;
                                                                        arrayList15 = arrayList13;
                                                                        arrayList16 = arrayList14;
                                                                        insert6 = insert5;
                                                                        if (!transformablePage16.getData().isEmpty()) {
                                                                        }
                                                                        kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function372 = this.getHighResolutionOutputSizeshNQ4ISI;
                                                                        separatorState$onInsert$1.getHighSpeedVideoFpsRanges = insert6;
                                                                        separatorState$onInsert$1.Camera2StreamConfigurationMap = arrayList16;
                                                                        separatorState$onInsert$1.getInputFormats = arrayList15;
                                                                        separatorState$onInsert$1.getOutputFormats = transformablePage15;
                                                                        separatorState$onInsert$1.getOutputMinFrameDuration = num12;
                                                                        separatorState$onInsert$1.getHighSpeedVideoSizesFor = it4;
                                                                        separatorState$onInsert$1.getInputSizeshNQ4ISI = transformablePage16;
                                                                        separatorState$onInsert$1.getOutputStallDuration = transformablePage17;
                                                                        separatorState$onInsert$1.getOutputMinFrameDurationlomOqCM = arrayList16;
                                                                        separatorState$onInsert$1.getOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
                                                                        separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                                                                        separatorState$onInsert$1.getOutputStallDurationlomOqCM = 7;
                                                                        obj5 = androidx.paging.SeparatorsKt.insertInternalSeparators(transformablePage16, function372, separatorState$onInsert$1);
                                                                        if (obj5 != coroutine_suspended) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    arrayList15 = arrayList2;
                                                                    arrayList16 = arrayList;
                                                                    it4 = it2;
                                                                    num12 = num10;
                                                                    insert6 = insert2;
                                                                    transformablePage17 = transformablePage27;
                                                                    transformablePage15 = transformablePage11;
                                                                    transformablePage16 = transformablePage26;
                                                                    if (!transformablePage16.getData().isEmpty()) {
                                                                    }
                                                                    kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function3722 = this.getHighResolutionOutputSizeshNQ4ISI;
                                                                    separatorState$onInsert$1.getHighSpeedVideoFpsRanges = insert6;
                                                                    separatorState$onInsert$1.Camera2StreamConfigurationMap = arrayList16;
                                                                    separatorState$onInsert$1.getInputFormats = arrayList15;
                                                                    separatorState$onInsert$1.getOutputFormats = transformablePage15;
                                                                    separatorState$onInsert$1.getOutputMinFrameDuration = num12;
                                                                    separatorState$onInsert$1.getHighSpeedVideoSizesFor = it4;
                                                                    separatorState$onInsert$1.getInputSizeshNQ4ISI = transformablePage16;
                                                                    separatorState$onInsert$1.getOutputStallDuration = transformablePage17;
                                                                    separatorState$onInsert$1.getOutputMinFrameDurationlomOqCM = arrayList16;
                                                                    separatorState$onInsert$1.getOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
                                                                    separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                                                                    separatorState$onInsert$1.getOutputStallDurationlomOqCM = 7;
                                                                    obj5 = androidx.paging.SeparatorsKt.insertInternalSeparators(transformablePage16, function3722, separatorState$onInsert$1);
                                                                    if (obj5 != coroutine_suspended) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return coroutine_suspended;
                                    }
                                    separatorState$onInsert$12 = separatorState$onInsert$1;
                                    z7 = Camera2StreamConfigurationMap;
                                    arrayList18 = arrayList2;
                                    arrayList19 = arrayList;
                                    insert7 = insert2;
                                    transformablePage19 = transformablePage2;
                                    if (z7) {
                                        this.getHighSpeedVideoSizesFor = true;
                                        if (i == 0) {
                                        }
                                        java.util.ArrayList arrayList272 = arrayList19;
                                        kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function3102 = this.getHighResolutionOutputSizeshNQ4ISI;
                                        java.lang.Object last42 = kotlin.collections.CollectionsKt.last((java.util.List<? extends java.lang.Object>) transformablePage20.getData());
                                        separatorState$onInsert$12.getHighSpeedVideoFpsRanges = insert7;
                                        separatorState$onInsert$12.Camera2StreamConfigurationMap = arrayList19;
                                        separatorState$onInsert$12.getInputFormats = arrayList18;
                                        separatorState$onInsert$12.getOutputFormats = transformablePage20;
                                        separatorState$onInsert$12.getOutputMinFrameDuration = arrayList272;
                                        separatorState$onInsert$12.getHighSpeedVideoSizesFor = null;
                                        separatorState$onInsert$12.getInputSizeshNQ4ISI = null;
                                        separatorState$onInsert$12.getOutputStallDuration = null;
                                        separatorState$onInsert$12.getOutputMinFrameDurationlomOqCM = null;
                                        separatorState$onInsert$12.getOutputStallDurationlomOqCM = 10;
                                        invoke = function3102.invoke(last42, null, separatorState$onInsert$12);
                                        if (invoke != coroutine_suspended) {
                                        }
                                        return coroutine_suspended;
                                    }
                                    this.getHighSpeedVideoFpsRanges = false;
                                    this.getHighSpeedVideoFpsRangesFor = false;
                                    if (insert7.getLoadType() == androidx.paging.LoadType.APPEND) {
                                    }
                                    androidx.paging.LoadType loadType222 = insert7.getLoadType();
                                    insert7.getPages();
                                    return new androidx.paging.PageEvent.Insert(loadType222, arrayList19, insert7.getPlaceholdersBefore(), insert7.getPlaceholdersAfter(), insert7.getSourceLoadStates(), insert7.getMediatorLoadStates(), null);
                                }
                            }
                        }
                        i = 1;
                        if (!this.getOutputStallDuration) {
                        }
                        if (!this.getHighSpeedVideoSizesFor) {
                        }
                        this.getInputSizeshNQ4ISI.set(insert.getSourceLoadStates());
                        this.getOutputMinFrameDuration = insert.getMediatorLoadStates();
                        if (insert.getLoadType() != androidx.paging.LoadType.APPEND) {
                        }
                        if (insert.getLoadType() != androidx.paging.LoadType.PREPEND) {
                        }
                        if (i != 0) {
                        }
                        arrayList = new java.util.ArrayList(insert.getPages().size());
                        arrayList2 = new java.util.ArrayList(insert.getPages().size());
                        if (i != 0) {
                        }
                        if (!highResolutionOutputSizeshNQ4ISI) {
                        }
                        insert2 = insert;
                        if (i == 0) {
                        }
                        separatorState$onInsert$12 = separatorState$onInsert$1;
                        z7 = Camera2StreamConfigurationMap;
                        arrayList18 = arrayList2;
                        arrayList19 = arrayList;
                        insert7 = insert2;
                        transformablePage19 = transformablePage2;
                        if (z7) {
                        }
                        this.getHighSpeedVideoFpsRanges = false;
                        this.getHighSpeedVideoFpsRangesFor = false;
                        if (insert7.getLoadType() == androidx.paging.LoadType.APPEND) {
                        }
                        androidx.paging.LoadType loadType2222 = insert7.getLoadType();
                        insert7.getPages();
                        return new androidx.paging.PageEvent.Insert(loadType2222, arrayList19, insert7.getPlaceholdersBefore(), insert7.getPlaceholdersAfter(), insert7.getSourceLoadStates(), insert7.getMediatorLoadStates(), null);
                    case 1:
                        insert9 = (androidx.paging.PageEvent.Insert) separatorState$onInsert$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj5);
                        i3 = 0;
                        z3 = true;
                        this.getHighSpeedVideoFpsRanges = i3;
                        this.getHighSpeedVideoFpsRangesFor = i3;
                        this.getOutputStallDuration = z3;
                        this.getHighSpeedVideoSizesFor = z3;
                        if (obj5 == null) {
                        }
                        break;
                    case 2:
                        i2 = separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI;
                        boolean z8 = separatorState$onInsert$1.getOutputSizeshNQ4ISI;
                        ?? r6 = (java.util.List) separatorState$onInsert$1.getOutputMinFrameDurationlomOqCM;
                        androidx.paging.TransformablePage<T> transformablePage29 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getOutputStallDuration;
                        java.lang.Integer num16 = (java.lang.Integer) separatorState$onInsert$1.getInputSizeshNQ4ISI;
                        androidx.paging.TransformablePage<T> transformablePage30 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getHighSpeedVideoSizesFor;
                        java.lang.Integer num17 = (java.lang.Integer) separatorState$onInsert$1.getOutputMinFrameDuration;
                        androidx.paging.TransformablePage<T> transformablePage31 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getOutputFormats;
                        java.util.ArrayList arrayList28 = (java.util.ArrayList) separatorState$onInsert$1.getInputFormats;
                        java.util.ArrayList arrayList29 = (java.util.ArrayList) separatorState$onInsert$1.Camera2StreamConfigurationMap;
                        insert2 = (androidx.paging.PageEvent.Insert) separatorState$onInsert$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj5);
                        transformablePage4 = transformablePage31;
                        arrayList3 = arrayList28;
                        arrayList4 = arrayList29;
                        num4 = num16;
                        transformablePage5 = transformablePage30;
                        num3 = num17;
                        transformablePage6 = transformablePage29;
                        obj = obj5;
                        z = z8;
                        arrayList5 = r6;
                        int hintOriginalPageOffset22 = transformablePage6.getHintOriginalPageOffset();
                        java.util.List<java.lang.Integer> hintOriginalIndices6 = transformablePage6.getHintOriginalIndices();
                        androidx.paging.SeparatorsKt.addSeparatorPage(arrayList5, obj, null, transformablePage6, hintOriginalPageOffset22, hintOriginalIndices6 == null ? ((java.lang.Number) kotlin.collections.CollectionsKt.first((java.util.List) hintOriginalIndices6)).intValue() : 0);
                        i = i2;
                        Camera2StreamConfigurationMap = z;
                        num2 = num4;
                        transformablePage2 = transformablePage5;
                        num = num3;
                        transformablePage = transformablePage4;
                        arrayList2 = arrayList3;
                        arrayList = arrayList4;
                        if (i == 0) {
                        }
                        separatorState$onInsert$12 = separatorState$onInsert$1;
                        z7 = Camera2StreamConfigurationMap;
                        arrayList18 = arrayList2;
                        arrayList19 = arrayList;
                        insert7 = insert2;
                        transformablePage19 = transformablePage2;
                        if (z7) {
                        }
                        this.getHighSpeedVideoFpsRanges = false;
                        this.getHighSpeedVideoFpsRangesFor = false;
                        if (insert7.getLoadType() == androidx.paging.LoadType.APPEND) {
                        }
                        androidx.paging.LoadType loadType22222 = insert7.getLoadType();
                        insert7.getPages();
                        return new androidx.paging.PageEvent.Insert(loadType22222, arrayList19, insert7.getPlaceholdersBefore(), insert7.getPlaceholdersAfter(), insert7.getSourceLoadStates(), insert7.getMediatorLoadStates(), null);
                    case 3:
                        intValue = separatorState$onInsert$1.getHighSpeedVideoFpsRangesFor;
                        i4 = separatorState$onInsert$1.getHighSpeedVideoSizes;
                        int i12 = separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI;
                        z5 = separatorState$onInsert$1.getOutputSizeshNQ4ISI;
                        arrayList10 = (java.util.ArrayList) separatorState$onInsert$1.getOutputStallDuration;
                        java.lang.Integer num18 = (java.lang.Integer) separatorState$onInsert$1.getInputSizeshNQ4ISI;
                        transformablePage10 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getHighSpeedVideoSizesFor;
                        java.lang.Integer num19 = (java.lang.Integer) separatorState$onInsert$1.getOutputMinFrameDuration;
                        transformablePage9 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getOutputFormats;
                        java.util.ArrayList arrayList30 = (java.util.ArrayList) separatorState$onInsert$1.getInputFormats;
                        arrayList9 = (java.util.ArrayList) separatorState$onInsert$1.Camera2StreamConfigurationMap;
                        androidx.paging.PageEvent.Insert<T> insert11 = (androidx.paging.PageEvent.Insert) separatorState$onInsert$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj5);
                        num9 = num18;
                        num5 = num19;
                        arrayList2 = arrayList30;
                        insert2 = insert11;
                        i = i12;
                        arrayList10.add(obj5);
                        i4++;
                        z4 = z5;
                        transformablePage2 = transformablePage10;
                        transformablePage7 = transformablePage9;
                        arrayList = arrayList9;
                        num6 = num9;
                        if (i4 < intValue) {
                        }
                        return coroutine_suspended;
                    case 4:
                        i5 = separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI;
                        boolean z9 = separatorState$onInsert$1.getOutputSizeshNQ4ISI;
                        androidx.paging.TransformablePage transformablePage32 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getOutputStallDuration;
                        java.lang.Integer num20 = (java.lang.Integer) separatorState$onInsert$1.getInputSizeshNQ4ISI;
                        transformablePage2 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getHighSpeedVideoSizesFor;
                        num5 = (java.lang.Integer) separatorState$onInsert$1.getOutputMinFrameDuration;
                        transformablePage7 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getOutputFormats;
                        arrayList2 = (java.util.ArrayList) separatorState$onInsert$1.getInputFormats;
                        java.util.ArrayList arrayList31 = (java.util.ArrayList) separatorState$onInsert$1.Camera2StreamConfigurationMap;
                        androidx.paging.PageEvent.Insert<T> insert12 = (androidx.paging.PageEvent.Insert) separatorState$onInsert$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj5);
                        transformablePage8 = transformablePage32;
                        num8 = num20;
                        arrayList8 = arrayList31;
                        insert4 = insert12;
                        obj2 = obj5;
                        z4 = z9;
                        androidx.paging.TransformablePage<T> transformablePage242 = transformablePage7;
                        arrayList7 = arrayList2;
                        androidx.paging.TransformablePage<T> transformablePage252 = transformablePage2;
                        java.lang.Integer num152 = num5;
                        java.util.ArrayList arrayList252 = arrayList8;
                        int hintOriginalPageOffset32 = transformablePage242.getHintOriginalPageOffset();
                        java.util.List<java.lang.Integer> hintOriginalIndices22 = transformablePage242.getHintOriginalIndices();
                        androidx.paging.SeparatorsKt.addSeparatorPage(arrayList252, obj2, transformablePage8, transformablePage242, hintOriginalPageOffset32, hintOriginalIndices22 == null ? ((java.lang.Number) kotlin.collections.CollectionsKt.first((java.util.List) hintOriginalIndices22)).intValue() : 0);
                        Camera2StreamConfigurationMap = z4;
                        transformablePage2 = transformablePage252;
                        num5 = num152;
                        transformablePage7 = transformablePage242;
                        num7 = num8;
                        arrayList6 = arrayList8;
                        insert3 = insert4;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(transformablePage7);
                        arrayList7.add(getHighSpeedVideoSizes(transformablePage7));
                        kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function3522 = this.getHighResolutionOutputSizeshNQ4ISI;
                        separatorState$onInsert$1.getHighSpeedVideoFpsRanges = insert3;
                        separatorState$onInsert$1.Camera2StreamConfigurationMap = arrayList6;
                        separatorState$onInsert$1.getInputFormats = arrayList7;
                        separatorState$onInsert$1.getOutputFormats = num5;
                        separatorState$onInsert$1.getOutputMinFrameDuration = transformablePage2;
                        separatorState$onInsert$1.getHighSpeedVideoSizesFor = num7;
                        separatorState$onInsert$1.getInputSizeshNQ4ISI = arrayList6;
                        separatorState$onInsert$1.getOutputStallDuration = null;
                        separatorState$onInsert$1.getOutputMinFrameDurationlomOqCM = null;
                        separatorState$onInsert$1.getOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
                        separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                        separatorState$onInsert$1.getOutputStallDurationlomOqCM = 5;
                        obj5 = androidx.paging.SeparatorsKt.insertInternalSeparators(transformablePage7, function3522, separatorState$onInsert$1);
                        if (obj5 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 5:
                        i5 = separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI;
                        Camera2StreamConfigurationMap = separatorState$onInsert$1.getOutputSizeshNQ4ISI;
                        arrayList6 = (java.util.ArrayList) separatorState$onInsert$1.getInputSizeshNQ4ISI;
                        num7 = (java.lang.Integer) separatorState$onInsert$1.getHighSpeedVideoSizesFor;
                        transformablePage2 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getOutputMinFrameDuration;
                        num5 = (java.lang.Integer) separatorState$onInsert$1.getOutputFormats;
                        arrayList12 = (java.util.ArrayList) separatorState$onInsert$1.getInputFormats;
                        arrayList11 = (java.util.ArrayList) separatorState$onInsert$1.Camera2StreamConfigurationMap;
                        insert3 = (androidx.paging.PageEvent.Insert) separatorState$onInsert$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj5);
                        arrayList6.add(obj5);
                        java.util.List<androidx.paging.TransformablePage<T>> pages22 = insert3.getPages();
                        int intValue42 = num5.intValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(num7);
                        it = pages22.subList(intValue42, num7.intValue() + 1).iterator();
                        if (it.hasNext()) {
                        }
                        break;
                    case 6:
                        i5 = separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI;
                        boolean z10 = separatorState$onInsert$1.getOutputSizeshNQ4ISI;
                        androidx.paging.TransformablePage transformablePage33 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getOutputStallDuration;
                        androidx.paging.TransformablePage transformablePage34 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getInputSizeshNQ4ISI;
                        java.util.Iterator it6 = (java.util.Iterator) separatorState$onInsert$1.getHighSpeedVideoSizesFor;
                        java.lang.Integer num21 = (java.lang.Integer) separatorState$onInsert$1.getOutputMinFrameDuration;
                        androidx.paging.TransformablePage<T> transformablePage35 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getOutputFormats;
                        java.util.ArrayList arrayList32 = (java.util.ArrayList) separatorState$onInsert$1.getInputFormats;
                        java.util.ArrayList arrayList33 = (java.util.ArrayList) separatorState$onInsert$1.Camera2StreamConfigurationMap;
                        androidx.paging.PageEvent.Insert<T> insert13 = (androidx.paging.PageEvent.Insert) separatorState$onInsert$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj5);
                        transformablePage12 = transformablePage35;
                        arrayList13 = arrayList32;
                        arrayList14 = arrayList33;
                        insert5 = insert13;
                        transformablePage13 = transformablePage33;
                        transformablePage14 = transformablePage34;
                        it3 = it6;
                        num11 = num21;
                        obj3 = obj5;
                        z6 = z10;
                        java.util.ArrayList arrayList262 = arrayList14;
                        if (insert5.getLoadType() != androidx.paging.LoadType.PREPEND) {
                        }
                        int i112 = hintOriginalPageOffset;
                        if (insert5.getLoadType() == androidx.paging.LoadType.PREPEND) {
                        }
                        i6 = intValue2;
                        androidx.paging.SeparatorsKt.addSeparatorPage(arrayList262, obj3, transformablePage13, transformablePage14, i112, i6);
                        Camera2StreamConfigurationMap = z6;
                        transformablePage17 = transformablePage13;
                        transformablePage16 = transformablePage14;
                        it4 = it3;
                        num12 = num11;
                        transformablePage15 = transformablePage12;
                        arrayList15 = arrayList13;
                        arrayList16 = arrayList14;
                        insert6 = insert5;
                        if (!transformablePage16.getData().isEmpty()) {
                        }
                        kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function37222 = this.getHighResolutionOutputSizeshNQ4ISI;
                        separatorState$onInsert$1.getHighSpeedVideoFpsRanges = insert6;
                        separatorState$onInsert$1.Camera2StreamConfigurationMap = arrayList16;
                        separatorState$onInsert$1.getInputFormats = arrayList15;
                        separatorState$onInsert$1.getOutputFormats = transformablePage15;
                        separatorState$onInsert$1.getOutputMinFrameDuration = num12;
                        separatorState$onInsert$1.getHighSpeedVideoSizesFor = it4;
                        separatorState$onInsert$1.getInputSizeshNQ4ISI = transformablePage16;
                        separatorState$onInsert$1.getOutputStallDuration = transformablePage17;
                        separatorState$onInsert$1.getOutputMinFrameDurationlomOqCM = arrayList16;
                        separatorState$onInsert$1.getOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
                        separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                        separatorState$onInsert$1.getOutputStallDurationlomOqCM = 7;
                        obj5 = androidx.paging.SeparatorsKt.insertInternalSeparators(transformablePage16, function37222, separatorState$onInsert$1);
                        if (obj5 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 7:
                        i5 = separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI;
                        Camera2StreamConfigurationMap = separatorState$onInsert$1.getOutputSizeshNQ4ISI;
                        arrayList16 = (java.util.ArrayList) separatorState$onInsert$1.getOutputMinFrameDurationlomOqCM;
                        transformablePage17 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getOutputStallDuration;
                        transformablePage16 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getInputSizeshNQ4ISI;
                        it4 = (java.util.Iterator) separatorState$onInsert$1.getHighSpeedVideoSizesFor;
                        num12 = (java.lang.Integer) separatorState$onInsert$1.getOutputMinFrameDuration;
                        transformablePage15 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getOutputFormats;
                        arrayList15 = (java.util.ArrayList) separatorState$onInsert$1.getInputFormats;
                        arrayList17 = (java.util.ArrayList) separatorState$onInsert$1.Camera2StreamConfigurationMap;
                        insert6 = (androidx.paging.PageEvent.Insert) separatorState$onInsert$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj5);
                        androidx.paging.PageEvent.Insert<T> insert102 = insert6;
                        it2 = it4;
                        arrayList2 = arrayList15;
                        arrayList16.add(obj5);
                        if (transformablePage16.getData().isEmpty()) {
                        }
                        num10 = num12;
                        transformablePage11 = transformablePage15;
                        insert2 = insert102;
                        arrayList = arrayList17;
                        if (it2.hasNext()) {
                        }
                        return coroutine_suspended;
                    case 8:
                        i5 = separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI;
                        Camera2StreamConfigurationMap = separatorState$onInsert$1.getOutputSizeshNQ4ISI;
                        transformablePage18 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getHighSpeedVideoSizesFor;
                        num10 = (java.lang.Integer) separatorState$onInsert$1.getOutputMinFrameDuration;
                        transformablePage11 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getOutputFormats;
                        arrayList2 = (java.util.ArrayList) separatorState$onInsert$1.getInputFormats;
                        arrayList = (java.util.ArrayList) separatorState$onInsert$1.Camera2StreamConfigurationMap;
                        insert2 = (androidx.paging.PageEvent.Insert) separatorState$onInsert$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj5);
                        androidx.paging.TransformablePage transformablePage36 = transformablePage18;
                        androidx.paging.PageEvent.Insert<T> insert14 = insert2;
                        java.lang.Object obj6 = obj5;
                        boolean z11 = Camera2StreamConfigurationMap;
                        java.util.ArrayList arrayList34 = arrayList;
                        java.util.ArrayList arrayList35 = arrayList2;
                        androidx.paging.TransformablePage<T> transformablePage37 = transformablePage11;
                        java.lang.Integer num22 = num10;
                        java.util.ArrayList arrayList36 = arrayList34;
                        int hintOriginalPageOffset5 = transformablePage37.getHintOriginalPageOffset();
                        java.util.List<java.lang.Integer> hintOriginalIndices7 = transformablePage37.getHintOriginalIndices();
                        androidx.paging.SeparatorsKt.addSeparatorPage(arrayList36, obj6, transformablePage37, transformablePage36, hintOriginalPageOffset5, hintOriginalIndices7 != null ? ((java.lang.Number) kotlin.collections.CollectionsKt.last((java.util.List) hintOriginalIndices7)).intValue() : kotlin.collections.CollectionsKt.getLastIndex(transformablePage37.getData()));
                        i = i5;
                        Camera2StreamConfigurationMap = z11;
                        num10 = num22;
                        transformablePage2 = transformablePage37;
                        arrayList2 = arrayList35;
                        arrayList = arrayList34;
                        insert2 = insert14;
                        intValue3 = num10.intValue() + 1;
                        lastIndex = kotlin.collections.CollectionsKt.getLastIndex(insert2.getPages());
                        if (intValue3 <= lastIndex) {
                        }
                        separatorState$onInsert$12 = separatorState$onInsert$1;
                        z7 = Camera2StreamConfigurationMap;
                        arrayList18 = arrayList2;
                        arrayList19 = arrayList;
                        insert7 = insert2;
                        transformablePage19 = transformablePage2;
                        if (z7) {
                        }
                        this.getHighSpeedVideoFpsRanges = false;
                        this.getHighSpeedVideoFpsRangesFor = false;
                        if (insert7.getLoadType() == androidx.paging.LoadType.APPEND) {
                        }
                        androidx.paging.LoadType loadType222222 = insert7.getLoadType();
                        insert7.getPages();
                        return new androidx.paging.PageEvent.Insert(loadType222222, arrayList19, insert7.getPlaceholdersBefore(), insert7.getPlaceholdersAfter(), insert7.getSourceLoadStates(), insert7.getMediatorLoadStates(), null);
                    case 9:
                        i9 = separatorState$onInsert$1.getHighSpeedVideoFpsRangesFor;
                        i8 = separatorState$onInsert$1.getHighSpeedVideoSizes;
                        i7 = separatorState$onInsert$1.getHighResolutionOutputSizeshNQ4ISI;
                        z7 = separatorState$onInsert$1.getOutputSizeshNQ4ISI;
                        arrayList20 = (java.util.ArrayList) separatorState$onInsert$1.getOutputMinFrameDuration;
                        transformablePage19 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getOutputFormats;
                        arrayList21 = (java.util.ArrayList) separatorState$onInsert$1.getInputFormats;
                        arrayList23 = (java.util.ArrayList) separatorState$onInsert$1.Camera2StreamConfigurationMap;
                        insert8 = (androidx.paging.PageEvent.Insert) separatorState$onInsert$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj5);
                        arrayList20.add(obj5);
                        if (i8 == i9) {
                        }
                        break;
                    case 10:
                        ?? r1 = (java.util.List) separatorState$onInsert$1.getOutputMinFrameDuration;
                        androidx.paging.TransformablePage<T> transformablePage38 = (androidx.paging.TransformablePage) separatorState$onInsert$1.getOutputFormats;
                        arrayList18 = (java.util.ArrayList) separatorState$onInsert$1.getInputFormats;
                        arrayList19 = (java.util.ArrayList) separatorState$onInsert$1.Camera2StreamConfigurationMap;
                        insert7 = (androidx.paging.PageEvent.Insert) separatorState$onInsert$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj5);
                        arrayList22 = r1;
                        obj4 = obj5;
                        transformablePage21 = transformablePage38;
                        int hintOriginalPageOffset42 = transformablePage21.getHintOriginalPageOffset();
                        java.util.List<java.lang.Integer> hintOriginalIndices52 = transformablePage21.getHintOriginalIndices();
                        androidx.paging.SeparatorsKt.addSeparatorPage(arrayList22, obj4, transformablePage21, null, hintOriginalPageOffset42, hintOriginalIndices52 == null ? ((java.lang.Number) kotlin.collections.CollectionsKt.last((java.util.List) hintOriginalIndices52)).intValue() : kotlin.collections.CollectionsKt.getLastIndex(transformablePage21.getData()));
                        this.getHighSpeedVideoFpsRanges = false;
                        this.getHighSpeedVideoFpsRangesFor = false;
                        if (insert7.getLoadType() == androidx.paging.LoadType.APPEND) {
                        }
                        androidx.paging.LoadType loadType2222222 = insert7.getLoadType();
                        insert7.getPages();
                        return new androidx.paging.PageEvent.Insert(loadType2222222, arrayList19, insert7.getPlaceholdersBefore(), insert7.getPlaceholdersAfter(), insert7.getSourceLoadStates(), insert7.getMediatorLoadStates(), null);
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        separatorState$onInsert$1 = new androidx.paging.SeparatorState$onInsert$1(this, continuation);
        java.lang.Object obj52 = separatorState$onInsert$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (separatorState$onInsert$1.getOutputStallDurationlomOqCM) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007f -> B:10:0x0082). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(androidx.paging.PageEvent.StaticList<T> staticList, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>> continuation) {
        androidx.paging.SeparatorState$onStaticList$1 separatorState$onStaticList$1;
        int i;
        int size;
        java.util.ArrayList arrayList;
        int i2;
        java.util.ArrayList arrayList2;
        java.lang.Object orNull;
        java.util.ArrayList arrayList3;
        if (continuation instanceof androidx.paging.SeparatorState$onStaticList$1) {
            separatorState$onStaticList$1 = (androidx.paging.SeparatorState$onStaticList$1) continuation;
            if ((separatorState$onStaticList$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                separatorState$onStaticList$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = separatorState$onStaticList$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = separatorState$onStaticList$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    size = staticList.getData().size();
                    if (size >= 0) {
                        i2 = 0;
                        arrayList2 = arrayList4;
                        java.lang.Object orNull2 = kotlin.collections.CollectionsKt.getOrNull(staticList.getData(), i2 - 1);
                        orNull = kotlin.collections.CollectionsKt.getOrNull(staticList.getData(), i2);
                        kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function3 = this.getHighResolutionOutputSizeshNQ4ISI;
                        separatorState$onStaticList$1.getHighSpeedVideoSizes = staticList;
                        separatorState$onStaticList$1.getHighResolutionOutputSizeshNQ4ISI = arrayList2;
                        separatorState$onStaticList$1.getHighSpeedVideoFpsRanges = orNull;
                        separatorState$onStaticList$1.getHighSpeedVideoFpsRangesFor = i2;
                        separatorState$onStaticList$1.Camera2StreamConfigurationMap = size;
                        separatorState$onStaticList$1.getInputSizeshNQ4ISI = 1;
                        obj = function3.invoke(orNull2, orNull, separatorState$onStaticList$1);
                        arrayList3 = arrayList2;
                        if (obj == coroutine_suspended) {
                        }
                        if (obj != null) {
                        }
                        if (orNull != null) {
                        }
                        if (i2 != size) {
                        }
                    } else {
                        arrayList = arrayList4;
                        return new androidx.paging.PageEvent.StaticList(arrayList, staticList.getSourceLoadStates(), staticList.getMediatorLoadStates(), 0, 0, 24, null);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = separatorState$onStaticList$1.Camera2StreamConfigurationMap;
                    int i4 = separatorState$onStaticList$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object obj2 = separatorState$onStaticList$1.getHighSpeedVideoFpsRanges;
                    ?? r5 = (java.util.List) separatorState$onStaticList$1.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.paging.PageEvent.StaticList<T> staticList2 = (androidx.paging.PageEvent.StaticList) separatorState$onStaticList$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    size = i3;
                    staticList = staticList2;
                    orNull = obj2;
                    i2 = i4;
                    arrayList3 = r5;
                    if (obj != null) {
                        arrayList3.add(obj);
                    }
                    if (orNull != null) {
                        arrayList3.add(orNull);
                    }
                    if (i2 != size) {
                        i2++;
                        arrayList2 = arrayList3;
                        java.lang.Object orNull22 = kotlin.collections.CollectionsKt.getOrNull(staticList.getData(), i2 - 1);
                        orNull = kotlin.collections.CollectionsKt.getOrNull(staticList.getData(), i2);
                        kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function32 = this.getHighResolutionOutputSizeshNQ4ISI;
                        separatorState$onStaticList$1.getHighSpeedVideoSizes = staticList;
                        separatorState$onStaticList$1.getHighResolutionOutputSizeshNQ4ISI = arrayList2;
                        separatorState$onStaticList$1.getHighSpeedVideoFpsRanges = orNull;
                        separatorState$onStaticList$1.getHighSpeedVideoFpsRangesFor = i2;
                        separatorState$onStaticList$1.Camera2StreamConfigurationMap = size;
                        separatorState$onStaticList$1.getInputSizeshNQ4ISI = 1;
                        obj = function32.invoke(orNull22, orNull, separatorState$onStaticList$1);
                        arrayList3 = arrayList2;
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (obj != null) {
                        }
                        if (orNull != null) {
                        }
                        if (i2 != size) {
                            arrayList = arrayList3;
                            return new androidx.paging.PageEvent.StaticList(arrayList, staticList.getSourceLoadStates(), staticList.getMediatorLoadStates(), 0, 0, 24, null);
                        }
                    }
                }
            }
        }
        separatorState$onStaticList$1 = new androidx.paging.SeparatorState$onStaticList$1(this, continuation);
        java.lang.Object obj3 = separatorState$onStaticList$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = separatorState$onStaticList$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
    }

    private static <T> androidx.paging.TransformablePage<T> getHighSpeedVideoSizes(androidx.paging.TransformablePage<T> p0) {
        int[] originalPageOffsets = p0.getOriginalPageOffsets();
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf(kotlin.collections.CollectionsKt.first((java.util.List) p0.getData()), kotlin.collections.CollectionsKt.last((java.util.List) p0.getData()));
        int hintOriginalPageOffset = p0.getHintOriginalPageOffset();
        java.lang.Integer[] numArr = new java.lang.Integer[2];
        java.util.List<java.lang.Integer> hintOriginalIndices = p0.getHintOriginalIndices();
        numArr[0] = java.lang.Integer.valueOf(hintOriginalIndices != null ? ((java.lang.Number) kotlin.collections.CollectionsKt.first((java.util.List) hintOriginalIndices)).intValue() : 0);
        java.util.List<java.lang.Integer> hintOriginalIndices2 = p0.getHintOriginalIndices();
        numArr[1] = java.lang.Integer.valueOf(hintOriginalIndices2 != null ? ((java.lang.Number) kotlin.collections.CollectionsKt.last((java.util.List) hintOriginalIndices2)).intValue() : kotlin.collections.CollectionsKt.getLastIndex(p0.getData()));
        return new androidx.paging.TransformablePage<>(originalPageOffsets, listOf, hintOriginalPageOffset, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) numArr));
    }

    public static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(kotlin.ranges.IntRange intRange, androidx.paging.TransformablePage transformablePage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transformablePage, "");
        for (int i : transformablePage.getOriginalPageOffsets()) {
            if (intRange.contains(i)) {
                return true;
            }
        }
        return false;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.paging.TerminalSeparatorType.values().length];
            try {
                iArr[androidx.paging.TerminalSeparatorType.FULLY_COMPLETE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.paging.TerminalSeparatorType.SOURCE_COMPLETE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
