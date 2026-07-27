package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.adquality.models.AdQualityResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    public final S9 f6637a;
    public WeakReference b;

    public J0(S9 databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f6637a = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AdQualityResult adQualityResult, ContinuationImpl continuationImpl) {
        I0 i0;
        int i;
        WeakReference weakReference;
        B0 b0;
        if (continuationImpl instanceof I0) {
            i0 = (I0) continuationImpl;
            int i2 = i0.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i0.c = i2 - Integer.MIN_VALUE;
                Object obj = i0.f6613a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = i0.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    S9 s9 = this.f6637a;
                    Intrinsics.checkNotNullParameter(adQualityResult, "<this>");
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("image_location", adQualityResult.getImageLocation());
                    String sdkModelResult = adQualityResult.getSdkModelResult();
                    if (sdkModelResult == null) {
                        sdkModelResult = "";
                    }
                    contentValues.put("sdk_model_result", sdkModelResult);
                    contentValues.put("beacon_url", adQualityResult.getBeaconUrl());
                    contentValues.put("extras", adQualityResult.getExtras());
                    i0.c = 1;
                    if (s9.a("ad_quality_db", contentValues, 4, i0) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                weakReference = this.b;
                if (weakReference != null && (b0 = (B0) weakReference.get()) != null && b0.f6465a.b.get()) {
                    b0.f6465a.b.set(false);
                    b0.f6465a.a();
                }
                return Unit.INSTANCE;
            }
        }
        i0 = new I0(this, continuationImpl);
        Object obj2 = i0.f6613a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = i0.c;
        if (i != 0) {
        }
        weakReference = this.b;
        if (weakReference != null) {
            b0.f6465a.b.set(false);
            b0.f6465a.a();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[LOOP:0: B:11:0x005b->B:13:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        H0 h0;
        int i;
        if (continuationImpl instanceof H0) {
            h0 = (H0) continuationImpl;
            int i2 = h0.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0.c = i2 - Integer.MIN_VALUE;
                Object obj = h0.f6591a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = h0.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    S9 s9 = this.f6637a;
                    h0.c = 1;
                    s9.getClass();
                    obj = s9.a(new O9(s9, "SELECT * FROM ad_quality_db", null), h0);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Iterable<ContentValues> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (ContentValues contentValues : iterable) {
                    Intrinsics.checkNotNullParameter(contentValues, "<this>");
                    String asString = contentValues.getAsString("image_location");
                    Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
                    String asString2 = contentValues.getAsString("sdk_model_result");
                    String asString3 = contentValues.getAsString("beacon_url");
                    Intrinsics.checkNotNullExpressionValue(asString3, "getAsString(...)");
                    arrayList.add(new AdQualityResult(asString, asString2, asString3, contentValues.getAsString("extras")));
                }
                return arrayList;
            }
        }
        h0 = new H0(this, continuationImpl);
        Object obj2 = h0.f6591a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = h0.c;
        if (i != 0) {
        }
        Iterable<ContentValues> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        while (r8.hasNext()) {
        }
        return arrayList2;
    }
}
