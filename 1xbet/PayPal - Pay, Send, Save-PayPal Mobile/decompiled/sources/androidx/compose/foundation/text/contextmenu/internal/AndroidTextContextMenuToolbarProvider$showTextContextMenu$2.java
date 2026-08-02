package androidx.compose.foundation.text.contextmenu.internal;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2", f = "AndroidTextContextMenuToolbarProvider.android.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class AndroidTextContextMenuToolbarProvider$showTextContextMenu$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider getHighSpeedVideoSizes;

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.snapshots.SnapshotStateObserver snapshotStateObserver;
        android.view.View view;
        android.view.ActionMode actionMode;
        java.lang.Runnable runnable;
        android.view.View view2;
        java.lang.Runnable runnable2;
        android.view.View view3;
        android.view.View view4;
        android.view.View view5;
        java.lang.Runnable runnable3;
        android.view.View view6;
        androidx.compose.runtime.snapshots.SnapshotStateObserver snapshotStateObserver2;
        android.view.View view7;
        android.view.ActionMode actionMode2;
        java.lang.Runnable runnable4;
        android.view.View view8;
        java.lang.Runnable runnable5;
        android.view.View view9;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider.TextContextMenuSessionImpl textContextMenuSessionImpl = new androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider.TextContextMenuSessionImpl();
                final androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback access$createActionModeCallback = androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider.access$createActionModeCallback(this.getHighSpeedVideoSizes, textContextMenuSessionImpl, this.getHighSpeedVideoFpsRangesFor);
                android.os.Looper myLooper = android.os.Looper.myLooper();
                view4 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                android.os.Handler handler = view4.getHandler();
                if (myLooper != (handler != null ? handler.getLooper() : null)) {
                    runnable3 = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
                    if (runnable3 == null) {
                        final androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = this.getHighSpeedVideoSizes;
                        runnable3 = new java.lang.Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2.getHighSpeedVideoFpsRanges(androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider.this, access$createActionModeCallback, textContextMenuSessionImpl);
                            }
                        };
                        this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI = runnable3;
                    }
                    view6 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(view6.post(runnable3));
                } else {
                    androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider2 = this.getHighSpeedVideoSizes;
                    androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelper textToolbarHelper = androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelper.INSTANCE;
                    view5 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                    android.view.ActionMode highSpeedVideoFpsRanges = androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelper.getHighSpeedVideoFpsRanges(view5, access$createActionModeCallback);
                    if (highSpeedVideoFpsRanges == null) {
                        return kotlin.Unit.INSTANCE;
                    }
                    androidTextContextMenuToolbarProvider2.getOutputFormats = highSpeedVideoFpsRanges;
                }
                this.Camera2StreamConfigurationMap = 1;
                java.lang.Object receive = textContextMenuSessionImpl.getHighResolutionOutputSizeshNQ4ISI.receive(this);
                if (receive != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    receive = kotlin.Unit.INSTANCE;
                }
                if (receive == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            snapshotStateObserver2 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            snapshotStateObserver2.clear();
            android.os.Looper myLooper2 = android.os.Looper.myLooper();
            view7 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            android.os.Handler handler2 = view7.getHandler();
            if (myLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                runnable5 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizesFor;
                if (runnable5 == null) {
                    final androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider3 = this.getHighSpeedVideoSizes;
                    runnable5 = new java.lang.Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2.getHighSpeedVideoSizes(androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider.this);
                        }
                    };
                    this.getHighSpeedVideoSizes.getHighSpeedVideoSizesFor = runnable5;
                }
                view9 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(view9.post(runnable5));
            } else {
                actionMode2 = this.getHighSpeedVideoSizes.getOutputFormats;
                if (actionMode2 != null) {
                    actionMode2.finish();
                }
            }
            runnable4 = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
            if (runnable4 != null) {
                view8 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(view8.removeCallbacks(runnable4));
            }
            this.getHighSpeedVideoSizes.getOutputFormats = null;
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            snapshotStateObserver = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            snapshotStateObserver.clear();
            android.os.Looper myLooper3 = android.os.Looper.myLooper();
            view = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            android.os.Handler handler3 = view.getHandler();
            if (myLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                runnable2 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizesFor;
                if (runnable2 == null) {
                    final androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider4 = this.getHighSpeedVideoSizes;
                    runnable2 = new java.lang.Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2.getHighSpeedVideoSizes(androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider.this);
                        }
                    };
                    this.getHighSpeedVideoSizes.getHighSpeedVideoSizesFor = runnable2;
                }
                view3 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(view3.post(runnable2));
            } else {
                actionMode = this.getHighSpeedVideoSizes.getOutputFormats;
                if (actionMode != null) {
                    actionMode.finish();
                }
            }
            runnable = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
            if (runnable != null) {
                view2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(view2.removeCallbacks(runnable));
            }
            this.getHighSpeedVideoSizes.getOutputFormats = null;
            throw th;
        }
    }

    public static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback textActionModeCallback, androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider.TextContextMenuSessionImpl textContextMenuSessionImpl) {
        android.view.View view;
        android.view.ActionMode actionMode;
        androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelper textToolbarHelper = androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelper.INSTANCE;
        view = androidTextContextMenuToolbarProvider.getHighSpeedVideoFpsRanges;
        android.view.ActionMode highSpeedVideoFpsRanges = androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelper.getHighSpeedVideoFpsRanges(view, textActionModeCallback);
        actionMode = androidTextContextMenuToolbarProvider.getOutputFormats;
        kotlin.jvm.internal.Intrinsics.areEqual(actionMode, highSpeedVideoFpsRanges);
        if (highSpeedVideoFpsRanges == null) {
            textContextMenuSessionImpl.close();
        }
    }

    public static /* synthetic */ void getHighSpeedVideoSizes(androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider) {
        android.view.ActionMode actionMode;
        actionMode = androidTextContextMenuToolbarProvider.getOutputFormats;
        if (actionMode != null) {
            actionMode.finish();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider textContextMenuDataProvider, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoSizes = androidTextContextMenuToolbarProvider;
        this.getHighSpeedVideoFpsRangesFor = textContextMenuDataProvider;
    }
}
