package com.bbflight.background_downloader;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceManager;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.bbflight.background_downloader.BDPlugin;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

@SourceDebugExtension({"SMAP\nWiFi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WiFi.kt\ncom/bbflight/background_downloader/RequireWiFiChange\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n777#2:139\n873#2,2:140\n777#2:142\n873#2,2:143\n*S KotlinDebug\n*F\n+ 1 WiFi.kt\ncom/bbflight/background_downloader/RequireWiFiChange\n*L\n92#1:139\n92#1:140,2\n95#1:142\n95#1:143,2\n*E\n"})
/* loaded from: classes3.dex */
public final class C0 {
    public final Context a;
    public final B0 b;
    public final boolean c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C0(Context applicationContext, B0 requireWifi, boolean z) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(requireWifi, "requireWifi");
        this.a = applicationContext;
        this.b = requireWifi;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x01b9 -> B:10:0x01ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        D0 d0;
        int i;
        Iterator it;
        SharedPreferences sharedPreferences;
        Map<String, M0> map;
        WorkManager workManager;
        int i2;
        Collection collection;
        int i3;
        int i4;
        boolean contains$default;
        if (continuationImpl instanceof D0) {
            d0 = (D0) continuationImpl;
            int i5 = d0.o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                d0.o = i5 - Integer.MIN_VALUE;
                Object obj = d0.m;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = d0.o;
                Context context = this.a;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    BDPlugin.INSTANCE.getClass();
                    B0 b0 = this.b;
                    Intrinsics.checkNotNullParameter(b0, "<set-?>");
                    BDPlugin.m = b0;
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                    edit.putInt("com.bbflight.background_downloader.requireWifi", b0.ordinal());
                    edit.apply();
                    Intrinsics.checkNotNull(defaultSharedPreferences);
                    Map<String, M0> b = q1.b(defaultSharedPreferences);
                    WorkManager workManager2 = WorkManager.getInstance(context);
                    Intrinsics.checkNotNullExpressionValue(workManager2, "getInstance(...)");
                    List<WorkInfo> list = workManager2.getWorkInfosByTag("BackgroundDownloader").get();
                    Intrinsics.checkNotNullExpressionValue(list, "get(...)");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!((WorkInfo) obj2).getState().isFinished()) {
                            arrayList.add(obj2);
                        }
                    }
                    it = arrayList.iterator();
                    sharedPreferences = defaultSharedPreferences;
                    map = b;
                    workManager = workManager2;
                    i2 = 0;
                    collection = arrayList;
                    while (it.hasNext()) {
                    }
                    boolean z2 = z;
                    if (i2 == 0) {
                    }
                    return Boxing.boxBoolean(z2);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = d0.l;
                M0 m0 = d0.k;
                it = d0.e;
                Collection collection2 = (List) d0.d;
                workManager = d0.c;
                map = d0.b;
                sharedPreferences = (SharedPreferences) d0.a;
                ResultKt.throwOnFailure(obj);
                boolean z3 = true;
                Collection collection3 = collection2;
                if (!((Boolean) obj).booleanValue()) {
                    BDPlugin.INSTANCE.getClass();
                    BDPlugin.r.remove(m0);
                }
                i2 = i6;
                z = z3;
                collection = collection3;
                while (it.hasNext()) {
                    WorkInfo workInfo = (WorkInfo) it.next();
                    Set<String> tags = workInfo.getTags();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : tags) {
                        contains$default = StringsKt__StringsKt.contains$default((String) obj3, "taskId=", false, 2, (Object) null);
                        if (contains$default) {
                            arrayList2.add(obj3);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        String substring = ((String) CollectionsKt.first((List) arrayList2)).substring(7);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        m0 = map.get(substring);
                        if (m0 != null) {
                            String taskId = m0.a;
                            if (m0.d()) {
                                BDPlugin.Companion companion = BDPlugin.INSTANCE;
                                companion.getClass();
                                i3 = i2;
                                boolean f = BDPlugin.Companion.f(m0);
                                LinkedHashSet linkedHashSet = BDPlugin.s;
                                if (f != linkedHashSet.contains(taskId)) {
                                    boolean f2 = BDPlugin.Companion.f(m0);
                                    if (f2) {
                                        i4 = 1;
                                        if (!f2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        linkedHashSet.add(taskId);
                                    } else {
                                        linkedHashSet.remove(taskId);
                                        i4 = 1;
                                    }
                                    int i7 = a.$EnumSwitchMapping$0[workInfo.getState().ordinal()];
                                    if (i7 != i4) {
                                        if (i7 != 2) {
                                            i2 = i3;
                                        } else if (this.c) {
                                            BDPlugin.r.add(m0);
                                            Intrinsics.checkNotNullParameter(taskId, "taskId");
                                            BDPlugin.p.add(taskId);
                                            i2 = 1;
                                        }
                                        z = true;
                                    } else {
                                        BDPlugin.r.add(m0);
                                        d0.a = SpillingKt.nullOutSpilledVariable(sharedPreferences);
                                        d0.b = map;
                                        d0.c = workManager;
                                        d0.d = SpillingKt.nullOutSpilledVariable(collection);
                                        d0.e = it;
                                        d0.f = SpillingKt.nullOutSpilledVariable(workInfo);
                                        d0.i = SpillingKt.nullOutSpilledVariable(arrayList2);
                                        d0.j = SpillingKt.nullOutSpilledVariable(substring);
                                        d0.k = m0;
                                        z3 = true;
                                        d0.l = 1;
                                        d0.o = 1;
                                        obj = companion.b(context, taskId, workManager, d0);
                                        if (obj == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        i6 = 1;
                                        collection3 = collection;
                                        if (!((Boolean) obj).booleanValue()) {
                                        }
                                        i2 = i6;
                                        z = z3;
                                        collection = collection3;
                                        while (it.hasNext()) {
                                        }
                                    }
                                }
                                z = true;
                                i2 = i3;
                            }
                        }
                    }
                    i3 = i2;
                    z = true;
                    i2 = i3;
                }
                boolean z22 = z;
                if (i2 == 0) {
                    z22 = false;
                }
                return Boxing.boxBoolean(z22);
            }
        }
        d0 = new D0(this, continuationImpl);
        Object obj4 = d0.m;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = d0.o;
        Context context2 = this.a;
        boolean z4 = true;
        if (i != 0) {
        }
    }
}
