package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\rJ\u001d\u0010\u000e\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\nJ#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/zettle/sdk/core/auth/MutableAuthState;", "Lcom/zettle/sdk/commons/state/MutableState;", "Lcom/izettle/android/auth/AuthState;", "Lcom/izettle/android/auth/ZettleAuth;", "p0", "<init>", "(Lcom/izettle/android/auth/ZettleAuth;)V", "Lcom/zettle/sdk/commons/state/StateObserver;", "", "addObserver", "(Lcom/zettle/sdk/commons/state/StateObserver;)V", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "p1", "(Lcom/zettle/sdk/commons/state/StateObserver;Lcom/zettle/sdk/commons/thread/EventsLoop;)V", "removeObserver", "Lkotlin/Function1;", "", "update", "(Lkotlin/jvm/functions/Function1;)Z", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/commons/state/MutableState;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class MutableAuthState implements com.zettle.sdk.commons.state.MutableState<com.izettle.android.auth.AuthState> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.state.MutableState<com.izettle.android.auth.AuthState> getHighSpeedVideoSizes;

    public MutableAuthState(com.izettle.android.auth.ZettleAuth zettleAuth) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleAuth, "");
        this.getHighSpeedVideoSizes = com.zettle.sdk.commons.state.MutableState.Companion.create$default(com.zettle.sdk.commons.state.MutableState.INSTANCE, com.izettle.android.auth.AuthState.INITIALIZING, null, 2, null);
        zettleAuth.registerAuthStateUpdateListener(new kotlin.jvm.functions.Function1<com.izettle.android.auth.AuthState, kotlin.Unit>() { // from class: com.zettle.sdk.core.auth.MutableAuthState.1
            public final void getHighSpeedVideoFpsRanges(final com.izettle.android.auth.AuthState authState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authState, "");
                com.zettle.sdk.core.auth.MutableAuthState.this.update(new kotlin.jvm.functions.Function1<com.izettle.android.auth.AuthState, com.izettle.android.auth.AuthState>() { // from class: com.zettle.sdk.core.auth.MutableAuthState.1.1
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final com.izettle.android.auth.AuthState invoke(com.izettle.android.auth.AuthState authState2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authState2, "");
                        return com.izettle.android.auth.AuthState.this;
                    }

                    {
                        super(1);
                    }
                });
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.auth.AuthState authState) {
                getHighSpeedVideoFpsRanges(authState);
                return kotlin.Unit.INSTANCE;
            }

            {
                super(1);
            }
        });
    }

    @Override // com.zettle.sdk.commons.state.State
    public final void addObserver(com.zettle.sdk.commons.state.StateObserver<com.izettle.android.auth.AuthState> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoSizes.addObserver(p0);
    }

    @Override // com.zettle.sdk.commons.state.State
    public final void addObserver(com.zettle.sdk.commons.state.StateObserver<com.izettle.android.auth.AuthState> p0, com.zettle.sdk.commons.thread.EventsLoop p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        this.getHighSpeedVideoSizes.addObserver(p0, p1);
    }

    @Override // com.zettle.sdk.commons.state.State
    public final void removeObserver(com.zettle.sdk.commons.state.StateObserver<com.izettle.android.auth.AuthState> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoSizes.removeObserver(p0);
    }

    @Override // com.zettle.sdk.commons.state.MutableState
    public final boolean update(kotlin.jvm.functions.Function1<? super com.izettle.android.auth.AuthState, ? extends com.izettle.android.auth.AuthState> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return this.getHighSpeedVideoSizes.update(p0);
    }
}
