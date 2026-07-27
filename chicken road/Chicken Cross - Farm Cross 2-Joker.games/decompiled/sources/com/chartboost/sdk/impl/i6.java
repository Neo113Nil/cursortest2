package com.chartboost.sdk.impl;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class i6 {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f4803a = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.i6$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return i6.b();
        }
    });

    public static final Set a() {
        return (Set) f4803a.getValue();
    }

    public static final Set b() {
        Object m8079constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
            ArrayList arrayList = new ArrayList();
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (!mediaCodecInfo.isEncoder()) {
                    arrayList.add(mediaCodecInfo);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String[] supportedTypes = ((MediaCodecInfo) obj).getSupportedTypes();
                Intrinsics.checkNotNullExpressionValue(supportedTypes, "getSupportedTypes(...)");
                ArrayList arrayList3 = new ArrayList(supportedTypes.length);
                for (String str : supportedTypes) {
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    arrayList3.add(lowerCase);
                }
                CollectionsKt.addAll(arrayList2, arrayList3);
            }
            m8079constructorimpl = Result.m8079constructorimpl(CollectionsKt.toSet(arrayList2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = null;
        }
        return (Set) m8079constructorimpl;
    }

    public static final boolean a(String mime) {
        Intrinsics.checkNotNullParameter(mime, "mime");
        Set a2 = a();
        if (a2 == null) {
            return true;
        }
        String lowerCase = mime.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return a2.contains(lowerCase);
    }

    public static final String a(List videoMimes) {
        Object obj;
        Intrinsics.checkNotNullParameter(videoMimes, "videoMimes");
        Iterator it = videoMimes.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!a((String) obj)) {
                break;
            }
        }
        return (String) obj;
    }
}
