package androidx.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001:\u0003'()Bc\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\b\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nj\u0004\u0018\u0001`\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR(\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR.\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nj\u0004\u0018\u0001`\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010\u0015"}, d2 = {"Landroidx/credentials/PrepareGetCredentialResponse;", "", "Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "p0", "Lkotlin/Function0;", "", "Landroidx/credentials/HasRemoteResultsDelegate;", "p1", "Landroidx/credentials/HasAuthenticationResultsDelegate;", "p2", "Lkotlin/Function1;", "", "Landroidx/credentials/HasCredentialResultsDelegate;", "p3", "p4", "<init>", "(Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Z)V", "credentialType", "hasCredentialResults", "(Ljava/lang/String;)Z", "hasAuthenticationResults", "()Z", "hasRemoteResults", "pendingGetCredentialHandle", "Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "getPendingGetCredentialHandle", "()Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "hasRemoteResultsDelegate", "Lkotlin/jvm/functions/Function0;", "getHasRemoteResultsDelegate", "()Lkotlin/jvm/functions/Function0;", "hasAuthResultsDelegate", "getHasAuthResultsDelegate", "credentialTypeDelegate", "Lkotlin/jvm/functions/Function1;", "getCredentialTypeDelegate", "()Lkotlin/jvm/functions/Function1;", "isNullHandlesForTest", "Z", "PendingGetCredentialHandle", "Builder", "TestBuilder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PrepareGetCredentialResponse {
    private final kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> credentialTypeDelegate;
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> hasAuthResultsDelegate;
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> hasRemoteResultsDelegate;
    private final boolean isNullHandlesForTest;
    private final androidx.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle;

    /* JADX WARN: Multi-variable type inference failed */
    private PrepareGetCredentialResponse(androidx.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, kotlin.jvm.functions.Function0<java.lang.Boolean> function0, kotlin.jvm.functions.Function0<java.lang.Boolean> function02, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> function1, boolean z) {
        this.pendingGetCredentialHandle = pendingGetCredentialHandle;
        this.hasRemoteResultsDelegate = function0;
        this.hasAuthResultsDelegate = function02;
        this.credentialTypeDelegate = function1;
        this.isNullHandlesForTest = z;
        if (android.os.Build.VERSION.SDK_INT < 34 || z) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(pendingGetCredentialHandle);
    }

    public final androidx.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle getPendingGetCredentialHandle() {
        return this.pendingGetCredentialHandle;
    }

    public final kotlin.jvm.functions.Function0<java.lang.Boolean> getHasRemoteResultsDelegate() {
        return this.hasRemoteResultsDelegate;
    }

    public final kotlin.jvm.functions.Function0<java.lang.Boolean> getHasAuthResultsDelegate() {
        return this.hasAuthResultsDelegate;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> getCredentialTypeDelegate() {
        return this.credentialTypeDelegate;
    }

    /* renamed from: isNullHandlesForTest, reason: from getter */
    public final boolean getIsNullHandlesForTest() {
        return this.isNullHandlesForTest;
    }

    public final boolean hasCredentialResults(java.lang.String credentialType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialType, "");
        kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> function1 = this.credentialTypeDelegate;
        if (function1 != null) {
            return function1.invoke(credentialType).booleanValue();
        }
        return false;
    }

    public final boolean hasAuthenticationResults() {
        kotlin.jvm.functions.Function0<java.lang.Boolean> function0 = this.hasAuthResultsDelegate;
        if (function0 != null) {
            return function0.invoke().booleanValue();
        }
        return false;
    }

    public final boolean hasRemoteResults() {
        kotlin.jvm.functions.Function0<java.lang.Boolean> function0 = this.hasRemoteResultsDelegate;
        if (function0 != null) {
            return function0.invoke().booleanValue();
        }
        return false;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028G¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "", "Landroid/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "frameworkHandle", "<init>", "(Landroid/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;)V", "Landroid/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "getFrameworkHandle", "()Landroid/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PendingGetCredentialHandle {
        private final android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle frameworkHandle;

        public PendingGetCredentialHandle(android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle) {
            this.frameworkHandle = pendingGetCredentialHandle;
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(pendingGetCredentialHandle);
            }
        }

        public final android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle getFrameworkHandle() {
            return this.frameworkHandle;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\u0004\u0018\u0001`\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\u0004\u0018\u0001`\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R*\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001aj\u0004\u0018\u0001`\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e"}, d2 = {"Landroidx/credentials/PrepareGetCredentialResponse$Builder;", "", "<init>", "()V", "Landroid/credentials/PrepareGetCredentialResponse;", "resp", "setFrameworkResponse", "(Landroid/credentials/PrepareGetCredentialResponse;)Landroidx/credentials/PrepareGetCredentialResponse$Builder;", "Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "handle", "setPendingGetCredentialHandle", "(Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;)Landroidx/credentials/PrepareGetCredentialResponse$Builder;", "Landroidx/credentials/PrepareGetCredentialResponse;", "build", "()Landroidx/credentials/PrepareGetCredentialResponse;", "getHighSpeedVideoFpsRangesFor", "Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "Lkotlin/Function0;", "", "Landroidx/credentials/HasRemoteResultsDelegate;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "Landroidx/credentials/HasAuthenticationResultsDelegate;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lkotlin/Function1;", "", "Landroidx/credentials/HasCredentialResultsDelegate;", "Lkotlin/jvm/functions/Function1;", "Landroid/credentials/PrepareGetCredentialResponse;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private kotlin.jvm.functions.Function0<java.lang.Boolean> getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private android.credentials.PrepareGetCredentialResponse getHighSpeedVideoSizes;
        private androidx.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private kotlin.jvm.functions.Function0<java.lang.Boolean> Camera2StreamConfigurationMap;

        public final androidx.credentials.PrepareGetCredentialResponse.Builder setFrameworkResponse(android.credentials.PrepareGetCredentialResponse resp) {
            this.getHighSpeedVideoSizes = resp;
            if (resp != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = new androidx.view.PrepareGetCredentialResponse$Builder$setFrameworkResponse$1(this);
                this.Camera2StreamConfigurationMap = new androidx.view.PrepareGetCredentialResponse$Builder$setFrameworkResponse$2(this);
                this.getHighSpeedVideoFpsRanges = new androidx.view.PrepareGetCredentialResponse$Builder$setFrameworkResponse$3(this);
            }
            return this;
        }

        public final androidx.credentials.PrepareGetCredentialResponse.Builder setPendingGetCredentialHandle(androidx.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle handle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handle, "");
            this.getHighSpeedVideoFpsRangesFor = handle;
            return this;
        }

        public final androidx.view.PrepareGetCredentialResponse build() {
            return new androidx.view.PrepareGetCredentialResponse(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, false, null);
        }

        public static final /* synthetic */ boolean access$hasAuthenticationResults(androidx.credentials.PrepareGetCredentialResponse.Builder builder) {
            android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse = builder.getHighSpeedVideoSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNull(prepareGetCredentialResponse);
            return prepareGetCredentialResponse.hasAuthenticationResults();
        }

        public static final /* synthetic */ boolean access$hasCredentialType(androidx.credentials.PrepareGetCredentialResponse.Builder builder, java.lang.String str) {
            android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse = builder.getHighSpeedVideoSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNull(prepareGetCredentialResponse);
            return prepareGetCredentialResponse.hasCredentialResults(str);
        }

        public static final /* synthetic */ boolean access$hasRemoteResults(androidx.credentials.PrepareGetCredentialResponse.Builder builder) {
            android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse = builder.getHighSpeedVideoSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNull(prepareGetCredentialResponse);
            return prepareGetCredentialResponse.hasRemoteResults();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00002\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00002\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u000bj\u0002`\f¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00002\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u000bj\u0002`\u000f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bj\u0004\u0018\u0001`\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R*\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0004\u0018\u0001`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/credentials/PrepareGetCredentialResponse$TestBuilder;", "", "<init>", "()V", "Lkotlin/Function1;", "", "", "Landroidx/credentials/HasCredentialResultsDelegate;", "handler", "setCredentialTypeDelegate", "(Lkotlin/jvm/functions/Function1;)Landroidx/credentials/PrepareGetCredentialResponse$TestBuilder;", "Lkotlin/Function0;", "Landroidx/credentials/HasAuthenticationResultsDelegate;", "setHasAuthResultsDelegate", "(Lkotlin/jvm/functions/Function0;)Landroidx/credentials/PrepareGetCredentialResponse$TestBuilder;", "Landroidx/credentials/HasRemoteResultsDelegate;", "setHasRemoteResultsDelegate", "Landroidx/credentials/PrepareGetCredentialResponse;", "build", "()Landroidx/credentials/PrepareGetCredentialResponse;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestBuilder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private kotlin.jvm.functions.Function0<java.lang.Boolean> getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private kotlin.jvm.functions.Function0<java.lang.Boolean> getHighSpeedVideoFpsRanges;

        public final androidx.credentials.PrepareGetCredentialResponse.TestBuilder setCredentialTypeDelegate(kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> handler) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
            this.Camera2StreamConfigurationMap = handler;
            return this;
        }

        public final androidx.credentials.PrepareGetCredentialResponse.TestBuilder setHasAuthResultsDelegate(kotlin.jvm.functions.Function0<java.lang.Boolean> handler) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
            this.getHighSpeedVideoSizes = handler;
            return this;
        }

        public final androidx.credentials.PrepareGetCredentialResponse.TestBuilder setHasRemoteResultsDelegate(kotlin.jvm.functions.Function0<java.lang.Boolean> handler) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
            this.getHighSpeedVideoFpsRanges = handler;
            return this;
        }

        public final androidx.view.PrepareGetCredentialResponse build() {
            return new androidx.view.PrepareGetCredentialResponse(null, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, true, null);
        }
    }

    public /* synthetic */ PrepareGetCredentialResponse(androidx.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(pendingGetCredentialHandle, function0, function02, function1, z);
    }
}
