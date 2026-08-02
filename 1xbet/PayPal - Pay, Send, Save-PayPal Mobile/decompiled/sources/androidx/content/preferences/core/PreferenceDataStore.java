package androidx.content.preferences.core;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u000b\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStore;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "delegate", "<init>", "(Landroidx/datastore/core/DataStore;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "transform", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Landroidx/datastore/core/DataStore;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferenceDataStore implements androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> Camera2StreamConfigurationMap;

    public PreferenceDataStore(androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> dataStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStore, "");
        this.Camera2StreamConfigurationMap = dataStore;
    }

    @Override // androidx.content.core.DataStore
    public final java.lang.Object updateData(kotlin.jvm.functions.Function2<? super androidx.content.preferences.core.Preferences, ? super kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences> continuation) {
        return this.Camera2StreamConfigurationMap.updateData(new androidx.content.preferences.core.PreferenceDataStore$updateData$2(function2, null), continuation);
    }

    @Override // androidx.content.core.DataStore
    public final kotlinx.coroutines.flow.Flow<androidx.content.preferences.core.Preferences> getData() {
        return this.Camera2StreamConfigurationMap.getData();
    }
}
