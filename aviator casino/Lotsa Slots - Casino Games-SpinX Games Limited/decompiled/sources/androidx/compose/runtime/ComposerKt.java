package androidx.compose.runtime;

/* compiled from: Composer.kt */
@kotlin.Metadata(d1 = {"\u0000¨\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0000\u001a(\u00106\u001a\u0004\u0018\u00010\u00042\b\u00107\u001a\u0004\u0018\u00010\u00042\b\u00108\u001a\u0004\u0018\u00010\u00042\b\u00109\u001a\u0004\u0018\u00010\u0004H\u0002\u001a\b\u0010:\u001a\u00020;H\u0007\u001aP\u0010<\u001a>\u0012\u0004\u0012\u0002H>\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002H@0?j\b\u0012\u0004\u0012\u0002H@`A0=j\u001e\u0012\u0004\u0012\u0002H>\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002H@0?j\b\u0012\u0004\u0012\u0002H@`A`B\"\u0004\b\u0000\u0010>\"\u0004\b\u0001\u0010@H\u0002\u001a\u0010\u0010C\u001a\u00020D2\u0006\u00107\u001a\u00020;H\u0000\u001a\u001f\u0010C\u001a\u00020D2\u0006\u00107\u001a\u00020;2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040FH\u0080\b\u001a\u0018\u0010G\u001a\u00020D2\u0006\u0010H\u001a\u00020I2\u0006\u0010G\u001a\u000205H\u0007\u001a\u0010\u0010J\u001a\u00020D2\u0006\u0010H\u001a\u00020IH\u0007\u001a \u0010K\u001a\u00020D2\u0006\u0010H\u001a\u00020I2\u0006\u0010L\u001a\u00020\n2\u0006\u0010G\u001a\u000205H\u0007\u001a\b\u0010M\u001a\u00020DH\u0007\u001a(\u0010N\u001a\u00020D2\u0006\u0010L\u001a\u00020\n2\u0006\u0010O\u001a\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010Q\u001a\u000205H\u0007\u001a\u0018\u0010N\u001a\u00020D2\u0006\u0010L\u001a\u00020\n2\u0006\u0010Q\u001a\u000205H\u0007\u001a\f\u0010R\u001a\u00020;*\u00020\nH\u0002\u001a\f\u0010S\u001a\u00020\n*\u00020;H\u0002\u001a3\u0010T\u001a\u0002HU\"\u0004\b\u0000\u0010U*\u00020I2\u0006\u0010V\u001a\u00020;2\u0011\u0010W\u001a\r\u0012\u0004\u0012\u0002HU0F¢\u0006\u0002\bXH\u0087\b¢\u0006\u0002\u0010Y\u001a\u001c\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040[*\u00020\\2\u0006\u0010]\u001a\u00020^H\u0002\u001a\u0014\u0010_\u001a\u00020D*\u00020`2\u0006\u0010a\u001a\u00020bH\u0000\u001a\u001c\u0010c\u001a\u00020\n*\u00020d2\u0006\u0010e\u001a\u00020\n2\u0006\u0010f\u001a\u00020\nH\u0002\u001a(\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00020h*\b\u0012\u0004\u0012\u00020\u00020h2\u0006\u0010i\u001a\u00020\n2\u0006\u0010j\u001a\u00020\nH\u0002\u001a\u001a\u0010k\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00020h2\u0006\u0010l\u001a\u00020\nH\u0002\u001a\u001a\u0010m\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00020h2\u0006\u0010l\u001a\u00020\nH\u0002\u001a$\u0010n\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00020h2\u0006\u0010i\u001a\u00020\n2\u0006\u0010j\u001a\u00020\nH\u0002\u001a,\u0010o\u001a\u00020D*\b\u0012\u0004\u0012\u00020\u00020h2\u0006\u0010l\u001a\u00020\n2\u0006\u0010p\u001a\u00020q2\b\u0010r\u001a\u0004\u0018\u00010\u0004H\u0002\u001a$\u0010s\u001a\u00020\n*\u00020d2\u0006\u0010t\u001a\u00020\n2\u0006\u0010u\u001a\u00020\n2\u0006\u0010v\u001a\u00020\nH\u0002\u001aY\u0010w\u001a\u0004\u0018\u0001H@\"\u0004\b\u0000\u0010>\"\u0004\b\u0001\u0010@*4\u0012\u0004\u0012\u0002H>\u0012\n\u0012\b\u0012\u0004\u0012\u0002H@0?0=j\u001e\u0012\u0004\u0012\u0002H>\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002H@0?j\b\u0012\u0004\u0012\u0002H@`A`B2\u0006\u0010L\u001a\u0002H>H\u0002¢\u0006\u0002\u0010x\u001a_\u0010y\u001a\u00020;\"\u0004\b\u0000\u0010>\"\u0004\b\u0001\u0010@*4\u0012\u0004\u0012\u0002H>\u0012\n\u0012\b\u0012\u0004\u0012\u0002H@0?0=j\u001e\u0012\u0004\u0012\u0002H>\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002H@0?j\b\u0012\u0004\u0012\u0002H@`A`B2\u0006\u0010L\u001a\u0002H>2\u0006\u00107\u001a\u0002H@H\u0002¢\u0006\u0002\u0010z\u001aa\u0010{\u001a\u0004\u0018\u00010D\"\u0004\b\u0000\u0010>\"\u0004\b\u0001\u0010@*4\u0012\u0004\u0012\u0002H>\u0012\n\u0012\b\u0012\u0004\u0012\u0002H@0?0=j\u001e\u0012\u0004\u0012\u0002H>\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002H@0?j\b\u0012\u0004\u0012\u0002H@`A`B2\u0006\u0010L\u001a\u0002H>2\u0006\u00107\u001a\u0002H@H\u0002¢\u0006\u0002\u0010|\u001a\u0014\u0010}\u001a\u00020D*\u00020`2\u0006\u0010a\u001a\u00020bH\u0000\u001a'\u0010~\u001a\u00020D*\u00020`2\u0006\u0010\u007f\u001a\u00020\n2\u0006\u0010e\u001a\u00020\n2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0004H\u0002\u001a\u001d\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00020h2\u0006\u0010l\u001a\u00020\nH\u0002\u001a#\u0010\u0082\u0001\u001a\u00020D*\b\u0012\u0004\u0012\u00020\u00020h2\u0006\u0010i\u001a\u00020\n2\u0006\u0010j\u001a\u00020\nH\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0016\u0010\t\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0006\"\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0006\"\u000e\u0010\u000f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u001c\u0010\u0011\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\b\"\u0016\u0010\u0014\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0006\"\u000e\u0010\u0016\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u001c\u0010\u0017\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b\"\u0016\u0010\u001a\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001b\u0010\u0006\"\u001c\u0010\u001c\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\b\"\u0016\u0010\u001f\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b \u0010\u0006\"\u001c\u0010!\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\b\"\u0016\u0010$\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b%\u0010\u0006\"\u001c\u0010&\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\b\"\u0016\u0010)\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b*\u0010\u0006\"\u0016\u0010+\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b,\u0010\u0006\"\u000e\u0010-\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010.\u001a\u00020\u0004*\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006\u0083\u0001"}, d2 = {"InvalidationLocationAscending", "Ljava/util/Comparator;", "Landroidx/compose/runtime/Invalidation;", "compositionLocalMap", "", "getCompositionLocalMap$annotations", "()V", "getCompositionLocalMap", "()Ljava/lang/Object;", "compositionLocalMapKey", "", "getCompositionLocalMapKey$annotations", "compositionTracer", "Landroidx/compose/runtime/CompositionTracer;", "getCompositionTracer$annotations", "defaultsKey", "invalidGroupLocation", "invocation", "getInvocation$annotations", "getInvocation", "invocationKey", "getInvocationKey$annotations", "nodeKey", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "getProvider$annotations", "getProvider", "providerKey", "getProviderKey$annotations", "providerMaps", "getProviderMaps$annotations", "getProviderMaps", "providerMapsKey", "getProviderMapsKey$annotations", "providerValues", "getProviderValues$annotations", "getProviderValues", "providerValuesKey", "getProviderValuesKey$annotations", "reference", "getReference$annotations", "getReference", "referenceKey", "getReferenceKey$annotations", "reuseKey", "getReuseKey$annotations", "rootKey", "joinedKey", "Landroidx/compose/runtime/KeyInfo;", "getJoinedKey", "(Landroidx/compose/runtime/KeyInfo;)Ljava/lang/Object;", "composeRuntimeError", "", "message", "", "getKey", "value", "left", "right", "isTraceInProgress", "", "multiMap", "Ljava/util/HashMap;", "K", "Ljava/util/LinkedHashSet;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "runtimeCheck", "", "lazyMessage", "Lkotlin/Function0;", "sourceInformation", "composer", "Landroidx/compose/runtime/Composer;", "sourceInformationMarkerEnd", "sourceInformationMarkerStart", com.ironsource.X3.i.W, "traceEventEnd", "traceEventStart", "dirty1", "dirty2", "info", "asBool", "asInt", "cache", "T", "invalid", "block", "Landroidx/compose/runtime/DisallowComposableCalls;", "(Landroidx/compose/runtime/Composer;ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "collectNodesFrom", "", "Landroidx/compose/runtime/SlotTable;", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/compose/runtime/Anchor;", "deactivateCurrentGroup", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "distanceFrom", "Landroidx/compose/runtime/SlotReader;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "root", "filterToRange", "", "start", "end", "findInsertLocation", com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION, "findLocation", "firstInRange", "insertIfMissing", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", com.ironsource.C3232q2.p, "nearestCommonRootOf", "a", "b", "common", "pop", "(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Z", "remove", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Unit;", "removeCurrentGroup", "removeData", "group", "data", "removeLocation", "removeRange", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposerKt {
    public static final int compositionLocalMapKey = 202;
    private static androidx.compose.runtime.CompositionTracer compositionTracer = null;
    private static final int defaultsKey = -127;
    private static final int invalidGroupLocation = -2;
    public static final int invocationKey = 200;
    private static final int nodeKey = 125;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;
    private static final int rootKey = 100;
    private static final java.lang.Object invocation = new androidx.compose.runtime.OpaqueKey(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER);
    private static final java.lang.Object provider = new androidx.compose.runtime.OpaqueKey(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER);
    private static final java.lang.Object compositionLocalMap = new androidx.compose.runtime.OpaqueKey("compositionLocalMap");
    private static final java.lang.Object providerValues = new androidx.compose.runtime.OpaqueKey("providerValues");
    private static final java.lang.Object providerMaps = new androidx.compose.runtime.OpaqueKey("providers");
    private static final java.lang.Object reference = new androidx.compose.runtime.OpaqueKey("reference");
    private static final java.util.Comparator<androidx.compose.runtime.Invalidation> InvalidationLocationAscending = new java.util.Comparator() { // from class: androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            int InvalidationLocationAscending$lambda$15;
            InvalidationLocationAscending$lambda$15 = androidx.compose.runtime.ComposerKt.InvalidationLocationAscending$lambda$15((androidx.compose.runtime.Invalidation) obj, (androidx.compose.runtime.Invalidation) obj2);
            return InvalidationLocationAscending$lambda$15;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBool(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt(boolean z) {
        return z ? 1 : 0;
    }

    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    private static /* synthetic */ void getCompositionTracer$annotations() {
    }

    public static /* synthetic */ void getInvocation$annotations() {
    }

    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    public static /* synthetic */ void getProvider$annotations() {
    }

    public static /* synthetic */ void getProviderKey$annotations() {
    }

    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    public static /* synthetic */ void getProviderValues$annotations() {
    }

    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    public static /* synthetic */ void getReference$annotations() {
    }

    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    public static /* synthetic */ void getReuseKey$annotations() {
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final <T> T cache(androidx.compose.runtime.Composer composer, boolean z, kotlin.jvm.functions.Function0<? extends T> function0) {
        T t = (T) composer.rememberedValue();
        if (!z && t != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            return t;
        }
        T invoke = function0.invoke();
        composer.updateRememberedValue(invoke);
        return invoke;
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final void sourceInformation(androidx.compose.runtime.Composer composer, java.lang.String str) {
        composer.sourceInformation(str);
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final void sourceInformationMarkerStart(androidx.compose.runtime.Composer composer, int i, java.lang.String str) {
        composer.sourceInformationMarkerStart(i, str);
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        androidx.compose.runtime.CompositionTracer compositionTracer2 = compositionTracer;
        return compositionTracer2 != null && compositionTracer2.isTraceInProgress();
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final void traceEventStart(int i, int i2, int i3, java.lang.String str) {
        androidx.compose.runtime.CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventStart(i, i2, i3, str);
        }
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final void traceEventEnd() {
        androidx.compose.runtime.CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventEnd();
        }
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(androidx.compose.runtime.Composer composer) {
        composer.sourceInformationMarkerEnd();
    }

    public static final void removeCurrentGroup(androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
        java.util.Iterator<java.lang.Object> groupSlots = slotWriter.groupSlots();
        while (groupSlots.hasNext()) {
            java.lang.Object next = groupSlots.next();
            if (next instanceof androidx.compose.runtime.ComposeNodeLifecycleCallback) {
                rememberManager.releasing((androidx.compose.runtime.ComposeNodeLifecycleCallback) next);
            }
            if (next instanceof androidx.compose.runtime.RememberObserverHolder) {
                rememberManager.forgetting(((androidx.compose.runtime.RememberObserverHolder) next).getWrapped());
            }
            if (next instanceof androidx.compose.runtime.RecomposeScopeImpl) {
                ((androidx.compose.runtime.RecomposeScopeImpl) next).release();
            }
        }
        slotWriter.removeGroup();
    }

    public static final void deactivateCurrentGroup(androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
        int currentGroup = slotWriter.getCurrentGroup();
        int currentGroupEnd = slotWriter.getCurrentGroupEnd();
        while (currentGroup < currentGroupEnd) {
            java.lang.Object node = slotWriter.node(currentGroup);
            if (node instanceof androidx.compose.runtime.ComposeNodeLifecycleCallback) {
                rememberManager.deactivating((androidx.compose.runtime.ComposeNodeLifecycleCallback) node);
            }
            int slotIndex = slotWriter.slotIndex(slotWriter.groups, slotWriter.groupIndexToAddress(currentGroup));
            int i = currentGroup + 1;
            int dataIndex = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(i));
            for (int i2 = slotIndex; i2 < dataIndex; i2++) {
                int i3 = i2 - slotIndex;
                java.lang.Object obj = slotWriter.slots[slotWriter.dataIndexToDataAddress(i2)];
                if (obj instanceof androidx.compose.runtime.RememberObserverHolder) {
                    androidx.compose.runtime.RememberObserver wrapped = ((androidx.compose.runtime.RememberObserverHolder) obj).getWrapped();
                    if (!(wrapped instanceof androidx.compose.runtime.ReusableRememberObserver)) {
                        removeData(slotWriter, currentGroup, i3, obj);
                        rememberManager.forgetting(wrapped);
                    }
                } else if (obj instanceof androidx.compose.runtime.RecomposeScopeImpl) {
                    removeData(slotWriter, currentGroup, i3, obj);
                    ((androidx.compose.runtime.RecomposeScopeImpl) obj).release();
                }
            }
            currentGroup = i;
        }
    }

    private static final void removeData(androidx.compose.runtime.SlotWriter slotWriter, int i, int i2, java.lang.Object obj) {
        if (obj == slotWriter.set(i, i2, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) {
            return;
        }
        composeRuntimeError("Slot table is out of sync".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> java.util.HashMap<K, java.util.LinkedHashSet<V>> multiMap() {
        return new java.util.HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> boolean put(java.util.HashMap<K, java.util.LinkedHashSet<V>> hashMap, K k, V v) {
        java.util.HashMap<K, java.util.LinkedHashSet<V>> hashMap2 = hashMap;
        java.util.LinkedHashSet<V> linkedHashSet = hashMap2.get(k);
        if (linkedHashSet == null) {
            linkedHashSet = new java.util.LinkedHashSet<>();
            hashMap2.put(k, linkedHashSet);
        }
        return linkedHashSet.add(v);
    }

    private static final <K, V> kotlin.Unit remove(java.util.HashMap<K, java.util.LinkedHashSet<V>> hashMap, K k, V v) {
        java.util.LinkedHashSet<V> linkedHashSet = hashMap.get(k);
        if (linkedHashSet == null) {
            return null;
        }
        linkedHashSet.remove(v);
        if (linkedHashSet.isEmpty()) {
            hashMap.remove(k);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> V pop(java.util.HashMap<K, java.util.LinkedHashSet<V>> hashMap, K k) {
        V v;
        java.util.LinkedHashSet<V> linkedHashSet = hashMap.get(k);
        if (linkedHashSet == null || (v = (V) kotlin.collections.CollectionsKt.firstOrNull(linkedHashSet)) == null) {
            return null;
        }
        remove(hashMap, k, v);
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getKey(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        androidx.compose.runtime.JoinedKey joinedKey = obj instanceof androidx.compose.runtime.JoinedKey ? (androidx.compose.runtime.JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(joinedKey.getLeft(), obj2) || !kotlin.jvm.internal.Intrinsics.areEqual(joinedKey.getRight(), obj3)) && (obj = getKey(joinedKey.getLeft(), obj2, obj3)) == null) {
            obj = getKey(joinedKey.getRight(), obj2, obj3);
        }
        return obj;
    }

    private static final int findLocation(java.util.List<androidx.compose.runtime.Invalidation> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int compare = kotlin.jvm.internal.Intrinsics.compare(list.get(i3).getLocation(), i);
            if (compare < 0) {
                i2 = i3 + 1;
            } else {
                if (compare <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    private static final int findInsertLocation(java.util.List<androidx.compose.runtime.Invalidation> list, int i) {
        int findLocation = findLocation(list, i);
        return findLocation < 0 ? -(findLocation + 1) : findLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertIfMissing(java.util.List<androidx.compose.runtime.Invalidation> list, int i, androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl, java.lang.Object obj) {
        int findLocation = findLocation(list, i);
        androidx.compose.runtime.collection.IdentityArraySet identityArraySet = null;
        if (findLocation < 0) {
            int i2 = -(findLocation + 1);
            if (obj != null) {
                identityArraySet = new androidx.compose.runtime.collection.IdentityArraySet();
                identityArraySet.add(obj);
            }
            list.add(i2, new androidx.compose.runtime.Invalidation(recomposeScopeImpl, i, identityArraySet));
            return;
        }
        if (obj == null) {
            list.get(findLocation).setInstances(null);
            return;
        }
        androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> instances = list.get(findLocation).getInstances();
        if (instances != null) {
            instances.add(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.Invalidation firstInRange(java.util.List<androidx.compose.runtime.Invalidation> list, int i, int i2) {
        int findInsertLocation = findInsertLocation(list, i);
        if (findInsertLocation >= list.size()) {
            return null;
        }
        androidx.compose.runtime.Invalidation invalidation = list.get(findInsertLocation);
        if (invalidation.getLocation() < i2) {
            return invalidation;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.Invalidation removeLocation(java.util.List<androidx.compose.runtime.Invalidation> list, int i) {
        int findLocation = findLocation(list, i);
        if (findLocation >= 0) {
            return list.remove(findLocation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRange(java.util.List<androidx.compose.runtime.Invalidation> list, int i, int i2) {
        int findInsertLocation = findInsertLocation(list, i);
        while (findInsertLocation < list.size() && list.get(findInsertLocation).getLocation() < i2) {
            list.remove(findInsertLocation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<androidx.compose.runtime.Invalidation> filterToRange(java.util.List<androidx.compose.runtime.Invalidation> list, int i, int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int findInsertLocation = findInsertLocation(list, i); findInsertLocation < list.size(); findInsertLocation++) {
            androidx.compose.runtime.Invalidation invalidation = list.get(findInsertLocation);
            if (invalidation.getLocation() >= i2) {
                break;
            }
            arrayList.add(invalidation);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<java.lang.Object> collectNodesFrom(androidx.compose.runtime.SlotTable slotTable, androidx.compose.runtime.Anchor anchor) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.compose.runtime.SlotReader openReader = slotTable.openReader();
        try {
            collectNodesFrom$lambda$11$collectFromGroup(openReader, arrayList, slotTable.anchorIndex(anchor));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            return arrayList;
        } finally {
            openReader.close();
        }
    }

    private static final void collectNodesFrom$lambda$11$collectFromGroup(androidx.compose.runtime.SlotReader slotReader, java.util.List<java.lang.Object> list, int i) {
        if (slotReader.isNode(i)) {
            list.add(slotReader.node(i));
            return;
        }
        int i2 = i + 1;
        int groupSize = i + slotReader.groupSize(i);
        while (i2 < groupSize) {
            collectNodesFrom$lambda$11$collectFromGroup(slotReader, list, i2);
            i2 += slotReader.groupSize(i2);
        }
    }

    private static final int distanceFrom(androidx.compose.runtime.SlotReader slotReader, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = slotReader.parent(i);
            i3++;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nearestCommonRootOf(androidx.compose.runtime.SlotReader slotReader, int i, int i2, int i3) {
        if (i == i2) {
            return i;
        }
        if (i == i3 || i2 == i3) {
            return i3;
        }
        if (slotReader.parent(i) == i2) {
            return i2;
        }
        if (slotReader.parent(i2) == i) {
            return i;
        }
        if (slotReader.parent(i) == slotReader.parent(i2)) {
            return slotReader.parent(i);
        }
        int distanceFrom = distanceFrom(slotReader, i, i3);
        int distanceFrom2 = distanceFrom(slotReader, i2, i3);
        int i4 = distanceFrom - distanceFrom2;
        for (int i5 = 0; i5 < i4; i5++) {
            i = slotReader.parent(i);
        }
        int i6 = distanceFrom2 - distanceFrom;
        for (int i7 = 0; i7 < i6; i7++) {
            i2 = slotReader.parent(i2);
        }
        while (i != i2) {
            i = slotReader.parent(i);
            i2 = slotReader.parent(i2);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getJoinedKey(androidx.compose.runtime.KeyInfo keyInfo) {
        return keyInfo.getObjectKey() != null ? new androidx.compose.runtime.JoinedKey(java.lang.Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey()) : java.lang.Integer.valueOf(keyInfo.getKey());
    }

    public static final java.lang.Object getInvocation() {
        return invocation;
    }

    public static final java.lang.Object getProvider() {
        return provider;
    }

    public static final java.lang.Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    public static final java.lang.Object getProviderValues() {
        return providerValues;
    }

    public static final java.lang.Object getProviderMaps() {
        return providerMaps;
    }

    public static final java.lang.Object getReference() {
        return reference;
    }

    public static final void runtimeCheck(boolean z, kotlin.jvm.functions.Function0<? extends java.lang.Object> function0) {
        if (z) {
            return;
        }
        composeRuntimeError(function0.invoke().toString());
        throw new kotlin.KotlinNothingValueException();
    }

    public static final void runtimeCheck(boolean z) {
        if (z) {
            return;
        }
        composeRuntimeError("Check failed".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    public static final java.lang.Void composeRuntimeError(java.lang.String str) {
        throw new androidx.compose.runtime.ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int InvalidationLocationAscending$lambda$15(androidx.compose.runtime.Invalidation invalidation, androidx.compose.runtime.Invalidation invalidation2) {
        return kotlin.jvm.internal.Intrinsics.compare(invalidation.getLocation(), invalidation2.getLocation());
    }
}
