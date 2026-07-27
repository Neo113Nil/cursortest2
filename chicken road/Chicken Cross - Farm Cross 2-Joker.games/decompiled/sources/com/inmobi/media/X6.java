package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes6.dex */
public abstract class X6 {

    /* renamed from: a, reason: collision with root package name */
    public final Ed f6943a;
    public final AbstractC3724g1 b;

    public X6(Ed nativeAdUnitComponent, AbstractC3724g1 adSessionManager) {
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        this.f6943a = nativeAdUnitComponent;
        this.b = adSessionManager;
    }

    public final Y9 a() {
        return this.f6943a.f6535a.f7489a.c;
    }

    public abstract Object a(Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        W6 w6;
        int i;
        OmSdkInfo omSdkInfo;
        List list2;
        Y9 a2;
        String customReferenceData;
        if (continuationImpl instanceof W6) {
            w6 = (W6) continuationImpl;
            int i2 = w6.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6.e = i2 - Integer.MIN_VALUE;
                Object obj = w6.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = w6.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (list.isEmpty()) {
                        Y9 a3 = a();
                        if (a3 != null) {
                            ((Z9) a3).a("ExperienceLoader", "OMID trackers are empty");
                        }
                        return Unit.INSTANCE;
                    }
                    MetaInfo metaInfo = this.f6943a.f6535a.b.d;
                    OmSdkInfo omsdkInfo = metaInfo != null ? metaInfo.getOmsdkInfo() : null;
                    boolean z = omsdkInfo != null && omsdkInfo.getOmidEnabled();
                    boolean omidEnabled = this.f6943a.f6535a.b.f6590a.b.getViewability().getOmidConfig().getOmidEnabled();
                    if (z && omidEnabled) {
                        C4051rg c4051rg = C4051rg.f7353a;
                        w6.f6925a = list;
                        w6.b = omsdkInfo;
                        w6.e = 1;
                        Context context = AbstractC3914mk.f7252a;
                        Object withContext = context == null ? "" : BuildersKt.withContext(Dispatchers.getIO(), new C3995pg(context, null), w6);
                        if (withContext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        omSdkInfo = omsdkInfo;
                        obj = withContext;
                        list2 = list;
                    } else {
                        Y9 a4 = a();
                        if (a4 != null) {
                            ((Z9) a4).a("ExperienceLoader", "OMID is not enabled");
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    omSdkInfo = w6.b;
                    List list3 = w6.f6925a;
                    ResultKt.throwOnFailure(obj);
                    list2 = list3;
                }
                String str = (String) obj;
                String str2 = this.f6943a.f6535a.b.f6590a.f7340a.f;
                a2 = a();
                if (a2 != null) {
                    ((Z9) a2).a("ExperienceLoader", "OM-SDK Session Initialize Called");
                }
                AbstractC3724g1 abstractC3724g1 = this.b;
                if (omSdkInfo != null || (r1 = omSdkInfo.getMacros()) == null) {
                    Map emptyMap = MapsKt.emptyMap();
                }
                abstractC3724g1.a(str, list2, emptyMap, str2, (omSdkInfo != null || (customReferenceData = omSdkInfo.getCustomReferenceData()) == null) ? "" : customReferenceData, omSdkInfo == null && omSdkInfo.getIsolateVerificationScripts());
                return Unit.INSTANCE;
            }
        }
        w6 = new W6(this, continuationImpl);
        Object obj2 = w6.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = w6.e;
        if (i != 0) {
        }
        String str3 = (String) obj2;
        String str22 = this.f6943a.f6535a.b.f6590a.f7340a.f;
        a2 = a();
        if (a2 != null) {
        }
        AbstractC3724g1 abstractC3724g12 = this.b;
        if (omSdkInfo != null) {
        }
        Map emptyMap2 = MapsKt.emptyMap();
        abstractC3724g12.a(str3, list2, emptyMap2, str22, (omSdkInfo != null || (customReferenceData = omSdkInfo.getCustomReferenceData()) == null) ? "" : customReferenceData, omSdkInfo == null && omSdkInfo.getIsolateVerificationScripts());
        return Unit.INSTANCE;
    }
}
