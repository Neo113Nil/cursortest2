package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: AndroidGetIsAdActivity.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;", "", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "activities", "", "Lokio/ByteString;", "kotlin.jvm.PlatformType", "getActivities", "()Ljava/util/List;", "activities$delegate", "Lkotlin/Lazy;", "invoke", "", "activityName", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidGetIsAdActivity {

    /* renamed from: activities$delegate, reason: from kotlin metadata */
    private final Lazy activities;
    private final SessionRepository sessionRepository;

    public AndroidGetIsAdActivity(SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
        this.activities = LazyKt.lazy(new Function0() { // from class: com.unity3d.ads.core.domain.AndroidGetIsAdActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List activities_delegate$lambda$1;
                activities_delegate$lambda$1 = AndroidGetIsAdActivity.activities_delegate$lambda$1(AndroidGetIsAdActivity.this);
                return activities_delegate$lambda$1;
            }
        });
    }

    private final List<ByteString> getActivities() {
        return (List) this.activities.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List activities_delegate$lambda$1(AndroidGetIsAdActivity androidGetIsAdActivity) {
        List<com.google.protobuf.ByteString> observableAndroidActivitiesList = androidGetIsAdActivity.sessionRepository.getNativeConfiguration().getObservableAndroidActivitiesList();
        Intrinsics.checkNotNullExpressionValue(observableAndroidActivitiesList, "getObservableAndroidActivitiesList(...)");
        List<com.google.protobuf.ByteString> list = observableAndroidActivitiesList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            byte[] byteArray = ((com.google.protobuf.ByteString) it.next()).toByteArray();
            arrayList.add(ByteString.of(Arrays.copyOf(byteArray, byteArray.length)));
        }
        return arrayList;
    }

    public final boolean invoke(String activityName) {
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        return getActivities().contains(ByteString.decodeHex(StringExtensionsKt.getSHA256Hash(activityName)));
    }
}
